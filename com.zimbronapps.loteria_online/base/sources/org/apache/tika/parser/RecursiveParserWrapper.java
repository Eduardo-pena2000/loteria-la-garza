package org.apache.tika.parser;

import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.exception.WriteLimitReachedException;
import org.apache.tika.io.FilenameUtils;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.Property;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.sax.AbstractRecursiveParserWrapperHandler;
import org.apache.tika.sax.SecureContentHandler;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class RecursiveParserWrapper extends ParserDecorator {
    private static final long serialVersionUID = 9086536568120690938L;
    private final boolean catchEmbeddedExceptions;
    private final boolean inlineContent;

    public class EmbeddedParserDecorator extends StatefulParser {
        private static final long serialVersionUID = 207648200464263337L;
        private String embeddedIdPath;
        private String location;
        private final ParserState parserState;

        public /* synthetic */ EmbeddedParserDecorator(RecursiveParserWrapper recursiveParserWrapper, Parser parser, String str, String str2, ParserState parserState, f fVar) {
            this(parser, str, str2, parserState);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x01ff  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void parse(java.io.InputStream r24, org.xml.sax.ContentHandler r25, org.apache.tika.metadata.Metadata r26, org.apache.tika.parser.ParseContext r27) throws java.io.IOException, org.xml.sax.SAXException, org.apache.tika.exception.TikaException {
            /*
                Method dump skipped, instructions count: 515
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.parser.RecursiveParserWrapper.EmbeddedParserDecorator.parse(java.io.InputStream, org.xml.sax.ContentHandler, org.apache.tika.metadata.Metadata, org.apache.tika.parser.ParseContext):void");
        }

        private EmbeddedParserDecorator(Parser parser, String str, String str2, ParserState parserState) {
            super(parser);
            this.embeddedIdPath = null;
            this.location = str;
            if (!str.endsWith("/")) {
                this.location = this.location + "/";
            }
            this.embeddedIdPath = str2;
            this.parserState = parserState;
        }
    }

    public static class ParserState {
        private int embeddedCount;
        private final AbstractRecursiveParserWrapperHandler recursiveParserWrapperHandler;
        private AtomicInteger unknownCount;

        public /* synthetic */ ParserState(AbstractRecursiveParserWrapperHandler abstractRecursiveParserWrapperHandler, f fVar) {
            this(abstractRecursiveParserWrapperHandler);
        }

        public static /* bridge */ /* synthetic */ int a(ParserState parserState) {
            return parserState.embeddedCount;
        }

        public static /* bridge */ /* synthetic */ AbstractRecursiveParserWrapperHandler b(ParserState parserState) {
            return parserState.recursiveParserWrapperHandler;
        }

        public static /* bridge */ /* synthetic */ AtomicInteger c(ParserState parserState) {
            return parserState.unknownCount;
        }

        public static /* bridge */ /* synthetic */ void d(ParserState parserState, int i) {
            parserState.embeddedCount = i;
        }

        private ParserState(AbstractRecursiveParserWrapperHandler abstractRecursiveParserWrapperHandler) {
            this.unknownCount = new AtomicInteger(0);
            this.embeddedCount = 0;
            this.recursiveParserWrapperHandler = abstractRecursiveParserWrapperHandler;
        }
    }

    public static class RecursivelySecureContentHandler extends SecureContentHandler {
        private static AtomicInteger COUNTER = new AtomicInteger();
        private final ContentHandler handler;
        private final SecureHandlerCounter handlerCounter;
        private final int id;
        private final ParseContext parseContext;
        private final boolean throwOnWriteLimitReached;

        public RecursivelySecureContentHandler(ContentHandler contentHandler, TikaInputStream tikaInputStream, SecureHandlerCounter secureHandlerCounter, boolean z, ParseContext parseContext) {
            super(contentHandler, tikaInputStream);
            this.id = COUNTER.getAndIncrement();
            this.handler = contentHandler;
            this.handlerCounter = secureHandlerCounter;
            this.throwOnWriteLimitReached = z;
            this.parseContext = parseContext;
        }

        public static /* bridge */ /* synthetic */ SecureHandlerCounter a(RecursivelySecureContentHandler recursivelySecureContentHandler) {
            return recursivelySecureContentHandler.handlerCounter;
        }

        public static /* bridge */ /* synthetic */ boolean b(RecursivelySecureContentHandler recursivelySecureContentHandler) {
            return recursivelySecureContentHandler.throwOnWriteLimitReached;
        }

        private void handleWriteLimitReached() throws WriteLimitReachedException {
            SecureHandlerCounter.c(this.handlerCounter, true);
            if (this.throwOnWriteLimitReached) {
                throw new WriteLimitReachedException(SecureHandlerCounter.a(this.handlerCounter));
            }
            ParseRecord parseRecord = (ParseRecord) this.parseContext.get(ParseRecord.class);
            if (parseRecord != null) {
                parseRecord.setWriteLimitReached(true);
            }
        }

        public void characters(char[] cArr, int i, int i2) throws SAXException {
            if (SecureHandlerCounter.b(this.handlerCounter)) {
                return;
            }
            if (SecureHandlerCounter.a(this.handlerCounter) < 0) {
                super.characters(cArr, i, i2);
                return;
            }
            int available = this.handlerCounter.getAvailable(i2);
            super.characters(cArr, i, available);
            this.handlerCounter.addChars(available);
            if (available < i2) {
                handleWriteLimitReached();
            }
        }

        public void endElement(String str, String str2, String str3) throws SAXException {
            this.handler.endElement(str, str2, str3);
        }

        public void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
            if (SecureHandlerCounter.b(this.handlerCounter)) {
                return;
            }
            if (SecureHandlerCounter.a(this.handlerCounter) < 0) {
                super.ignorableWhitespace(cArr, i, i2);
                return;
            }
            int available = this.handlerCounter.getAvailable(i2);
            super.ignorableWhitespace(cArr, i, available);
            this.handlerCounter.addChars(available);
            if (available < i2) {
                handleWriteLimitReached();
            }
        }

        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            this.handler.startElement(str, str2, str3, attributes);
        }
    }

    public static class SecureHandlerCounter {
        private int totalChars;
        private final int totalWriteLimit;
        private boolean writeLimitReached;

        public /* synthetic */ SecureHandlerCounter(int i, f fVar) {
            this(i);
        }

        public static /* bridge */ /* synthetic */ int a(SecureHandlerCounter secureHandlerCounter) {
            return secureHandlerCounter.totalWriteLimit;
        }

        public static /* bridge */ /* synthetic */ boolean b(SecureHandlerCounter secureHandlerCounter) {
            return secureHandlerCounter.writeLimitReached;
        }

        public static /* bridge */ /* synthetic */ void c(SecureHandlerCounter secureHandlerCounter, boolean z) {
            secureHandlerCounter.writeLimitReached = z;
        }

        public void addChars(int i) {
            this.totalChars += i;
        }

        public int getAvailable(int i) {
            return Math.min(this.totalWriteLimit - this.totalChars, i);
        }

        private SecureHandlerCounter(int i) {
            this.writeLimitReached = false;
            this.totalChars = 0;
            this.totalWriteLimit = i;
        }
    }

    public RecursiveParserWrapper(Parser parser) {
        this(parser, true);
    }

    public static /* bridge */ /* synthetic */ boolean a(RecursiveParserWrapper recursiveParserWrapper) {
        return recursiveParserWrapper.catchEmbeddedExceptions;
    }

    public static String getResourceName(Metadata metadata, AtomicInteger atomicInteger) {
        String str;
        if (metadata.get("resourceName") != null) {
            str = metadata.get("resourceName");
        } else if (metadata.get("embeddedRelationshipId") != null) {
            str = metadata.get("embeddedRelationshipId");
        } else {
            Property property = TikaCoreProperties.VERSION_NUMBER;
            if (metadata.get(property) != null) {
                str = "version-number-" + metadata.get(property);
            } else {
                str = "embedded-" + atomicInteger.incrementAndGet();
            }
        }
        return FilenameUtils.getName(str);
    }

    public Set getSupportedTypes(ParseContext parseContext) {
        return getWrappedParser().getSupportedTypes(parseContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void parse(java.io.InputStream r18, org.xml.sax.ContentHandler r19, org.apache.tika.metadata.Metadata r20, org.apache.tika.parser.ParseContext r21) throws java.io.IOException, org.xml.sax.SAXException, org.apache.tika.exception.TikaException {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.parser.RecursiveParserWrapper.parse(java.io.InputStream, org.xml.sax.ContentHandler, org.apache.tika.metadata.Metadata, org.apache.tika.parser.ParseContext):void");
    }

    public RecursiveParserWrapper(Parser parser, boolean z) {
        super(parser);
        this.inlineContent = false;
        this.catchEmbeddedExceptions = z;
    }
}
