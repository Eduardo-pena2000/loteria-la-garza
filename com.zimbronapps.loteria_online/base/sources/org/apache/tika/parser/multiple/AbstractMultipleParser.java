package org.apache.tika.parser.multiple;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.tika.config.Param;
import org.apache.tika.exception.TikaException;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MediaTypeRegistry;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.ContentHandlerFactory;
import org.apache.tika.utils.ParserUtils;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class AbstractMultipleParser implements Parser {
    protected static final String METADATA_POLICY_CONFIG_KEY = "metadataPolicy";
    private static final long serialVersionUID = 5383668090329836559L;
    private final Set offeredTypes;
    private final Collection parsers;
    private final MetadataPolicy policy;
    private MediaTypeRegistry registry;

    public static /* synthetic */ class 1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$tika$parser$multiple$AbstractMultipleParser$MetadataPolicy;

        static {
            int[] iArr = new int[MetadataPolicy.values().length];
            $SwitchMap$org$apache$tika$parser$multiple$AbstractMultipleParser$MetadataPolicy = iArr;
            try {
                iArr[MetadataPolicy.FIRST_WINS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$tika$parser$multiple$AbstractMultipleParser$MetadataPolicy[MetadataPolicy.LAST_WINS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$apache$tika$parser$multiple$AbstractMultipleParser$MetadataPolicy[MetadataPolicy.KEEP_ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum MetadataPolicy {
        DISCARD_ALL,
        FIRST_WINS,
        LAST_WINS,
        KEEP_ALL
    }

    public AbstractMultipleParser(MediaTypeRegistry mediaTypeRegistry, Collection collection, Map map) {
        this(mediaTypeRegistry, getMetadataPolicy(map), collection);
    }

    public static MetadataPolicy getMetadataPolicy(Map map) {
        if (map.containsKey("metadataPolicy")) {
            return (MetadataPolicy) ((Param) map.get("metadataPolicy")).getValue();
        }
        throw new IllegalArgumentException("Required parameter 'metadataPolicy' not supplied");
    }

    public static Metadata mergeMetadata(Metadata metadata, Metadata metadata2, MetadataPolicy metadataPolicy) {
        if (metadataPolicy == MetadataPolicy.DISCARD_ALL) {
            return metadata;
        }
        for (String str : metadata2.names()) {
            if (!str.equals(TikaCoreProperties.TIKA_PARSED_BY.getName()) && !str.equals(ParserUtils.EMBEDDED_PARSER.getName()) && !str.equals(TikaCoreProperties.EMBEDDED_EXCEPTION.getName())) {
                String[] values = metadata.getValues(str);
                String[] values2 = metadata2.getValues(str);
                if (values == null || values.length == 0) {
                    for (String str2 : values2) {
                        metadata.add(str, str2);
                    }
                } else if (!Arrays.deepEquals(values2, values)) {
                    int i = 1.$SwitchMap$org$apache$tika$parser$multiple$AbstractMultipleParser$MetadataPolicy[metadataPolicy.ordinal()];
                    if (i == 1) {
                        metadata.remove(str);
                        for (String str3 : values2) {
                            metadata.add(str, str3);
                        }
                    } else if (i == 3) {
                        ArrayList arrayList = new ArrayList(Arrays.asList(values2));
                        metadata.remove(str);
                        for (String str4 : values2) {
                            metadata.add(str, str4);
                        }
                        for (String str5 : values) {
                            if (!arrayList.contains(str5)) {
                                metadata.add(str, str5);
                                arrayList.add(str5);
                            }
                        }
                    }
                }
            }
        }
        return metadata;
    }

    public List getAllParsers() {
        return Collections.unmodifiableList(new ArrayList(this.parsers));
    }

    public MediaTypeRegistry getMediaTypeRegistry() {
        return this.registry;
    }

    public Set getSupportedTypes(ParseContext parseContext) {
        return this.offeredTypes;
    }

    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) throws IOException, SAXException, TikaException {
        parse(inputStream, contentHandler, null, metadata, parseContext);
    }

    public abstract boolean parserCompleted(Parser parser, Metadata metadata, ContentHandler contentHandler, ParseContext parseContext, Exception exc);

    public void parserPrepare(Parser parser, Metadata metadata, ParseContext parseContext) {
    }

    public void setMediaTypeRegistry(MediaTypeRegistry mediaTypeRegistry) {
        this.registry = mediaTypeRegistry;
    }

    public AbstractMultipleParser(MediaTypeRegistry mediaTypeRegistry, MetadataPolicy metadataPolicy, Parser... parserArr) {
        this(mediaTypeRegistry, metadataPolicy, (Collection) Arrays.asList(parserArr));
    }

    @Deprecated
    public void parse(InputStream inputStream, ContentHandlerFactory contentHandlerFactory, Metadata metadata, ParseContext parseContext) throws IOException, SAXException, TikaException {
        parse(inputStream, null, contentHandlerFactory, metadata, parseContext);
    }

    public AbstractMultipleParser(MediaTypeRegistry mediaTypeRegistry, MetadataPolicy metadataPolicy, Collection collection) {
        this.policy = metadataPolicy;
        this.parsers = collection;
        this.registry = mediaTypeRegistry;
        this.offeredTypes = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.offeredTypes.addAll(((Parser) it.next()).getSupportedTypes(new ParseContext()));
        }
    }

    /* JADX WARN: Finally extract failed */
    private void parse(InputStream inputStream, ContentHandler contentHandler, ContentHandlerFactory contentHandlerFactory, Metadata metadata, ParseContext parseContext) throws IOException, SAXException, TikaException {
        Throwable th;
        ParseContext parseContext2 = parseContext;
        Metadata cloneMetadata = ParserUtils.cloneMetadata(metadata);
        TemporaryResources temporaryResources = new TemporaryResources();
        try {
            InputStream ensureStreamReReadable = ParserUtils.ensureStreamReReadable(inputStream, temporaryResources, metadata);
            Iterator it = this.parsers.iterator();
            Metadata metadata2 = cloneMetadata;
            InputStream inputStream2 = ensureStreamReReadable;
            ContentHandler contentHandler2 = contentHandler;
            Metadata metadata3 = metadata2;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Parser parser = (Parser) it.next();
                if (contentHandlerFactory != null) {
                    contentHandler2 = contentHandlerFactory.getNewContentHandler();
                }
                ContentHandler contentHandler3 = contentHandler2;
                ParserUtils.recordParserDetails(parser, metadata);
                Metadata cloneMetadata2 = ParserUtils.cloneMetadata(metadata);
                parserPrepare(parser, cloneMetadata2, parseContext2);
                try {
                    parser.parse(inputStream2, contentHandler3, cloneMetadata2, parseContext2);
                    th = null;
                } catch (Exception e) {
                    ParserUtils.recordParserFailure(parser, e, metadata);
                    ParserUtils.recordParserFailure(parser, e, cloneMetadata2);
                    th = e;
                }
                boolean parserCompleted = parserCompleted(parser, cloneMetadata2, contentHandler3, parseContext, th);
                Metadata mergeMetadata = mergeMetadata(cloneMetadata2, metadata2, this.policy);
                if (parserCompleted) {
                    metadata2 = ParserUtils.cloneMetadata(mergeMetadata);
                    inputStream2 = ParserUtils.streamResetForReRead(inputStream2, temporaryResources);
                    parseContext2 = parseContext;
                    metadata3 = mergeMetadata;
                    contentHandler2 = contentHandler3;
                } else {
                    if (th != null) {
                        if (!(th instanceof IOException)) {
                            if (!(th instanceof SAXException)) {
                                if (th instanceof TikaException) {
                                    throw ((TikaException) th);
                                }
                                throw new TikaException("Unexpected RuntimeException from " + String.valueOf(parser), th);
                            }
                            throw ((SAXException) th);
                        }
                        throw ((IOException) th);
                    }
                    metadata3 = mergeMetadata;
                }
            }
            temporaryResources.dispose();
            for (String str : metadata3.names()) {
                metadata.remove(str);
                for (String str2 : metadata3.getValues(str)) {
                    metadata.add(str, str2);
                }
            }
        } catch (Throwable th2) {
            temporaryResources.dispose();
            throw th2;
        }
    }

    public MetadataPolicy getMetadataPolicy() {
        return this.policy;
    }
}
