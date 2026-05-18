package org.apache.tika.parser;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.tika.exception.TikaException;
import org.apache.tika.exception.WriteLimitReachedException;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MediaType;
import org.apache.tika.mime.MediaTypeRegistry;
import org.apache.tika.sax.TaggedContentHandler;
import org.apache.tika.utils.ExceptionUtils;
import org.apache.tika.utils.ParserUtils;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class CompositeParser implements Parser {
    private static final long serialVersionUID = 2192845797749627824L;
    private Parser fallback;
    private List parsers;
    private MediaTypeRegistry registry;

    public CompositeParser(MediaTypeRegistry mediaTypeRegistry, List list, Collection collection) {
        this.fallback = new EmptyParser();
        if (collection == null || collection.isEmpty()) {
            this.parsers = list;
        } else {
            this.parsers = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Parser parser = (Parser) it.next();
                if (!isExcluded(collection, parser.getClass())) {
                    this.parsers.add(parser);
                }
            }
        }
        this.registry = mediaTypeRegistry;
    }

    private boolean assignableFrom(Collection collection, Class cls) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((Class) it.next()).isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean isExcluded(Collection collection, Class cls) {
        return collection.contains(cls) || assignableFrom(collection, cls);
    }

    private void recordEmbeddedMetadata(Metadata metadata, ParseContext parseContext) {
        ParseRecord parseRecord = (ParseRecord) parseContext.get(ParseRecord.class);
        if (parseRecord == null) {
            return;
        }
        Iterator it = parseRecord.getExceptions().iterator();
        while (it.hasNext()) {
            metadata.add(TikaCoreProperties.EMBEDDED_EXCEPTION, ExceptionUtils.getStackTrace((Exception) it.next()));
        }
        Iterator it2 = parseRecord.getWarnings().iterator();
        while (it2.hasNext()) {
            metadata.add(TikaCoreProperties.EMBEDDED_WARNING, (String) it2.next());
        }
        if (parseRecord.isWriteLimitReached()) {
            metadata.set(TikaCoreProperties.WRITE_LIMIT_REACHED, true);
        }
        for (Metadata metadata2 : parseRecord.getMetadataList()) {
            for (String str : metadata2.names()) {
                for (String str2 : metadata2.getValues(str)) {
                    metadata.add(str, str2);
                }
            }
        }
    }

    public Map findDuplicateParsers(ParseContext parseContext) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (Parser parser : this.parsers) {
            Iterator it = parser.getSupportedTypes(parseContext).iterator();
            while (it.hasNext()) {
                MediaType normalize = this.registry.normalize((MediaType) it.next());
                if (hashMap.containsKey(normalize)) {
                    ArrayList arrayList = (List) hashMap2.get(normalize);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        arrayList.add((Parser) hashMap.get(normalize));
                        hashMap2.put(normalize, arrayList);
                    }
                    arrayList.add(parser);
                } else {
                    hashMap.put(normalize, parser);
                }
            }
        }
        return hashMap2;
    }

    public List getAllComponentParsers() {
        return Collections.unmodifiableList(this.parsers);
    }

    public Parser getFallback() {
        return this.fallback;
    }

    public MediaTypeRegistry getMediaTypeRegistry() {
        return this.registry;
    }

    public Parser getParser(Metadata metadata) {
        return getParser(metadata, new ParseContext());
    }

    public Map getParsers(ParseContext parseContext) {
        HashMap hashMap = new HashMap();
        for (Parser parser : this.parsers) {
            Iterator it = parser.getSupportedTypes(parseContext).iterator();
            while (it.hasNext()) {
                hashMap.put(this.registry.normalize((MediaType) it.next()), parser);
            }
        }
        return hashMap;
    }

    public Set getSupportedTypes(ParseContext parseContext) {
        return getParsers(parseContext).keySet();
    }

    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) throws IOException, SAXException, TikaException {
        Parser parser = getParser(metadata, parseContext);
        TemporaryResources temporaryResources = new TemporaryResources();
        ParseRecord parseRecord = (ParseRecord) parseContext.get(ParseRecord.class);
        if (parseRecord == null) {
            parseRecord = new ParseRecord();
            parseContext.set(ParseRecord.class, parseRecord);
        }
        try {
            TikaInputStream tikaInputStream = TikaInputStream.get(inputStream, temporaryResources, metadata);
            TaggedContentHandler taggedContentHandler = contentHandler != null ? new TaggedContentHandler(contentHandler) : null;
            String parserClassname = ParserUtils.getParserClassname(parser);
            parseRecord.addParserClass(parserClassname);
            ParserUtils.recordParserDetails(parserClassname, metadata);
            parseRecord.beforeParse();
            try {
                try {
                    parser.parse(tikaInputStream, taggedContentHandler, metadata, parseContext);
                    temporaryResources.dispose();
                    parseRecord.afterParse();
                    if (parseRecord.getDepth() == 0) {
                        metadata.set(TikaCoreProperties.TIKA_PARSED_BY_FULL_SET, parseRecord.getParsers());
                        recordEmbeddedMetadata(metadata, parseContext);
                    }
                } catch (SAXException e) {
                    WriteLimitReachedException.throwIfWriteLimitReached(e);
                    if (taggedContentHandler != null) {
                        taggedContentHandler.throwIfCauseOf(e);
                    }
                    throw new TikaException("TIKA-237: Illegal SAXException from " + String.valueOf(parser), e);
                } catch (SecurityException e2) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                throw new TikaException("Unexpected RuntimeException from " + String.valueOf(parser), e3);
            } catch (IOException e4) {
                tikaInputStream.throwIfCauseOf(e4);
                throw new TikaException("TIKA-198: Illegal IOException from " + String.valueOf(parser), e4);
            }
        } catch (Throwable th) {
            temporaryResources.dispose();
            parseRecord.afterParse();
            if (parseRecord.getDepth() == 0) {
                metadata.set(TikaCoreProperties.TIKA_PARSED_BY_FULL_SET, parseRecord.getParsers());
                recordEmbeddedMetadata(metadata, parseContext);
            }
            throw th;
        }
    }

    public void setFallback(Parser parser) {
        this.fallback = parser;
    }

    public void setMediaTypeRegistry(MediaTypeRegistry mediaTypeRegistry) {
        this.registry = mediaTypeRegistry;
    }

    public void setParsers(Map map) {
        this.parsers = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            this.parsers.add(ParserDecorator.withTypes((Parser) entry.getValue(), Collections.singleton((MediaType) entry.getKey())));
        }
    }

    public Parser getParser(Metadata metadata, ParseContext parseContext) {
        Map parsers = getParsers(parseContext);
        String str = metadata.get(TikaCoreProperties.CONTENT_TYPE_PARSER_OVERRIDE);
        if (str == null) {
            str = metadata.get("Content-Type");
        }
        MediaType parse = MediaType.parse(str);
        if (parse != null) {
            parse = this.registry.normalize(parse);
        }
        while (parse != null) {
            Parser parser = (Parser) parsers.get(parse);
            if (parser != null) {
                return parser;
            }
            parse = this.registry.getSupertype(parse);
        }
        return this.fallback;
    }

    public Map getParsers() {
        return getParsers(new ParseContext());
    }

    public CompositeParser(MediaTypeRegistry mediaTypeRegistry, List list) {
        this(mediaTypeRegistry, list, null);
    }

    public CompositeParser(MediaTypeRegistry mediaTypeRegistry, Parser... parserArr) {
        this(mediaTypeRegistry, Arrays.asList(parserArr));
    }

    public CompositeParser() {
        this(new MediaTypeRegistry(), new Parser[0]);
    }
}
