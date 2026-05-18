package org.apache.tika.extractor;

import B8.m;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import org.apache.tika.config.TikaConfig;
import org.apache.tika.detect.DefaultDetector;
import org.apache.tika.detect.Detector;
import org.apache.tika.exception.TikaException;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.StatefulParser;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ParserContainerExtractor implements ContainerExtractor {
    private static final long serialVersionUID = 2261131045580861514L;
    private final Detector detector;
    private final Parser parser;

    public class RecursiveParser extends StatefulParser {
        private final ContainerExtractor extractor;
        private final EmbeddedResourceHandler handler;

        public /* synthetic */ RecursiveParser(ParserContainerExtractor parserContainerExtractor, Parser parser, ContainerExtractor containerExtractor, EmbeddedResourceHandler embeddedResourceHandler, a aVar) {
            this(parser, containerExtractor, embeddedResourceHandler);
        }

        public Set getSupportedTypes(ParseContext parseContext) {
            return ParserContainerExtractor.b(ParserContainerExtractor.this).getSupportedTypes(parseContext);
        }

        public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) throws IOException, SAXException, TikaException {
            TemporaryResources temporaryResources = new TemporaryResources();
            try {
                InputStream inputStream2 = TikaInputStream.get(inputStream, temporaryResources, metadata);
                String str = metadata.get("resourceName");
                MediaType detect = ParserContainerExtractor.a(ParserContainerExtractor.this).detect(inputStream2, metadata);
                if (this.extractor == null) {
                    this.handler.handle(str, detect, inputStream2);
                } else {
                    InputStream inputStream3 = TikaInputStream.get(m.a(inputStream2.getFile()));
                    try {
                        this.handler.handle(str, detect, inputStream3);
                        if (inputStream3 != null) {
                            inputStream3.close();
                        }
                        ContainerExtractor containerExtractor = this.extractor;
                        containerExtractor.extract(inputStream2, containerExtractor, this.handler);
                    } finally {
                    }
                }
                temporaryResources.dispose();
            } catch (Throwable th) {
                temporaryResources.dispose();
                throw th;
            }
        }

        private RecursiveParser(Parser parser, ContainerExtractor containerExtractor, EmbeddedResourceHandler embeddedResourceHandler) {
            super(parser);
            this.extractor = containerExtractor;
            this.handler = embeddedResourceHandler;
        }
    }

    public ParserContainerExtractor() {
        this(TikaConfig.getDefaultConfig());
    }

    public static /* bridge */ /* synthetic */ Detector a(ParserContainerExtractor parserContainerExtractor) {
        return parserContainerExtractor.detector;
    }

    public static /* bridge */ /* synthetic */ Parser b(ParserContainerExtractor parserContainerExtractor) {
        return parserContainerExtractor.parser;
    }

    public void extract(TikaInputStream tikaInputStream, ContainerExtractor containerExtractor, EmbeddedResourceHandler embeddedResourceHandler) throws IOException, TikaException {
        ParseContext parseContext = new ParseContext();
        parseContext.set(Parser.class, new RecursiveParser(this, this.parser, containerExtractor, embeddedResourceHandler, null));
        try {
            this.parser.parse(tikaInputStream, new DefaultHandler(), new Metadata(), parseContext);
        } catch (SAXException e) {
            throw new TikaException("Unexpected SAX exception", e);
        }
    }

    public boolean isSupported(TikaInputStream tikaInputStream) throws IOException {
        return this.parser.getSupportedTypes(new ParseContext()).contains(this.detector.detect(tikaInputStream, new Metadata()));
    }

    public ParserContainerExtractor(TikaConfig tikaConfig) {
        this(new AutoDetectParser(tikaConfig), new DefaultDetector(tikaConfig.getMimeRepository()));
    }

    public ParserContainerExtractor(Parser parser, Detector detector) {
        this.parser = parser;
        this.detector = detector;
    }
}
