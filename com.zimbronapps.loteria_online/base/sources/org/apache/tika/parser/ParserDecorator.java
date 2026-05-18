package org.apache.tika.parser;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaTypeRegistry;
import org.apache.tika.parser.multiple.AbstractMultipleParser;
import org.apache.tika.parser.multiple.FallbackParser;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ParserDecorator implements Parser {
    private static final long serialVersionUID = -3861669115439125268L;
    private final Parser parser;

    public class 1 extends ParserDecorator {
        private static final long serialVersionUID = -7345051519565330731L;
        final /* synthetic */ Set val$types;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Parser parser, Set set) {
            super(parser);
            this.val$types = set;
        }

        public String getDecorationName() {
            return "With Types";
        }

        public Set getSupportedTypes(ParseContext parseContext) {
            return this.val$types;
        }
    }

    public class 2 extends ParserDecorator {
        private static final long serialVersionUID = 7979614774021768609L;
        final /* synthetic */ Set val$excludeTypes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(Parser parser, Set set) {
            super(parser);
            this.val$excludeTypes = set;
        }

        public String getDecorationName() {
            return "Without Types";
        }

        public Set getSupportedTypes(ParseContext parseContext) {
            HashSet hashSet = new HashSet(super.getSupportedTypes(parseContext));
            hashSet.removeAll(this.val$excludeTypes);
            return hashSet;
        }
    }

    public ParserDecorator(Parser parser) {
        this.parser = parser;
    }

    @Deprecated
    public static final Parser withFallbacks(Collection collection, Set set) {
        FallbackParser fallbackParser = new FallbackParser(MediaTypeRegistry.getDefaultRegistry(), AbstractMultipleParser.MetadataPolicy.KEEP_ALL, collection);
        return (set == null || set.isEmpty()) ? fallbackParser : withTypes(fallbackParser, set);
    }

    public static final Parser withTypes(Parser parser, Set set) {
        return new 1(parser, set);
    }

    public static final Parser withoutTypes(Parser parser, Set set) {
        return new 2(parser, set);
    }

    public String getDecorationName() {
        return null;
    }

    public Set getSupportedTypes(ParseContext parseContext) {
        return this.parser.getSupportedTypes(parseContext);
    }

    public Parser getWrappedParser() {
        return this.parser;
    }

    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) throws IOException, SAXException, TikaException {
        this.parser.parse(inputStream, contentHandler, metadata, parseContext);
    }
}
