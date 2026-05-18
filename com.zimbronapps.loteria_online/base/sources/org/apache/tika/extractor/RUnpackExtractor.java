package org.apache.tika.extractor;

import Wb.c;
import Wb.e;
import com.applovin.shadow.okio.q;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import org.apache.tika.exception.CorruptedFileException;
import org.apache.tika.exception.EncryptedDocumentException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.io.BoundedInputStream;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.sax.BodyContentHandler;
import org.apache.tika.sax.EmbeddedContentHandler;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class RUnpackExtractor extends ParsingEmbeddedDocumentExtractor {
    private long bytesExtracted;
    private EmbeddedBytesSelector embeddedBytesSelector;
    private final long maxEmbeddedBytesForExtraction;
    private static final c LOGGER = e.l(ParsingEmbeddedDocumentExtractor.class);
    private static final File ABSTRACT_PATH = new File("");

    public RUnpackExtractor(ParseContext parseContext, long j) {
        super(parseContext);
        this.embeddedBytesSelector = EmbeddedBytesSelector.ACCEPT_ALL;
        this.bytesExtracted = 0L;
        this.maxEmbeddedBytesForExtraction = j;
    }

    private void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata) throws TikaException, IOException, SAXException {
        getDelegatingParser().parse(inputStream, new EmbeddedContentHandler(new BodyContentHandler(contentHandler)), metadata, this.context);
    }

    private void parseWithBytes(TikaInputStream tikaInputStream, ContentHandler contentHandler, Metadata metadata) throws TikaException, IOException, SAXException {
        Path path = tikaInputStream.getPath();
        try {
            parse(Db.a.a(tikaInputStream), contentHandler, metadata);
        } finally {
            storeEmbeddedBytes(path, metadata);
        }
    }

    private void storeEmbeddedBytes(Path path, Metadata metadata) {
        if (!this.embeddedBytesSelector.select(metadata)) {
            c cVar = LOGGER;
            if (cVar.c()) {
                cVar.b("skipping embedded bytes {} <-> {}", metadata.get("Content-Type"), metadata.get(TikaCoreProperties.EMBEDDED_RESOURCE_TYPE));
                return;
            }
            return;
        }
        EmbeddedDocumentBytesHandler embeddedDocumentBytesHandler = (EmbeddedDocumentBytesHandler) this.context.get(EmbeddedDocumentBytesHandler.class);
        int intValue = metadata.getInt(TikaCoreProperties.EMBEDDED_ID).intValue();
        try {
            InputStream a = q.a(path, new OpenOption[0]);
            try {
                long j = this.bytesExtracted;
                long j2 = this.maxEmbeddedBytesForExtraction;
                if (j >= j2) {
                    throw new IOException("Bytes extracted (" + this.bytesExtracted + ") >= max allowed (" + this.maxEmbeddedBytesForExtraction + ")");
                }
                BoundedInputStream boundedInputStream = new BoundedInputStream(j2 - j, a);
                try {
                    embeddedDocumentBytesHandler.add(intValue, metadata, boundedInputStream);
                    this.bytesExtracted += boundedInputStream.getPos();
                    if (!boundedInputStream.hasHitBound()) {
                        boundedInputStream.close();
                        if (a != null) {
                            a.close();
                            return;
                        }
                        return;
                    }
                    throw new IOException("Bytes extracted (" + this.bytesExtracted + ") >= max allowed (" + this.maxEmbeddedBytesForExtraction + "). Truncated bytes");
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            LOGGER.k("problem writing out embedded bytes", e);
        }
    }

    public EmbeddedBytesSelector getEmbeddedBytesSelector() {
        return this.embeddedBytesSelector;
    }

    public void parseEmbedded(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, boolean z) throws SAXException, IOException {
        Object openContainer;
        if (z) {
            AttributesImpl attributesImpl = new AttributesImpl();
            attributesImpl.addAttribute("", "class", "class", "CDATA", "package-entry");
            contentHandler.startElement("http://www.w3.org/1999/xhtml", "div", "div", attributesImpl);
        }
        String str = metadata.get("resourceName");
        if (isWriteFileNameToContent() && str != null && str.length() > 0 && z) {
            contentHandler.startElement("http://www.w3.org/1999/xhtml", "h1", "h1", new AttributesImpl());
            char[] charArray = str.toCharArray();
            contentHandler.characters(charArray, 0, charArray.length);
            contentHandler.endElement("http://www.w3.org/1999/xhtml", "h1", "h1");
        }
        try {
            TemporaryResources temporaryResources = new TemporaryResources();
            try {
                TikaInputStream tikaInputStream = TikaInputStream.get((InputStream) Db.a.a(inputStream), temporaryResources, metadata);
                if ((inputStream instanceof TikaInputStream) && (openContainer = ((TikaInputStream) inputStream).getOpenContainer()) != null) {
                    tikaInputStream.setOpenContainer(openContainer);
                }
                if (((EmbeddedDocumentBytesHandler) this.context.get(EmbeddedDocumentBytesHandler.class)) != null) {
                    parseWithBytes(tikaInputStream, contentHandler, metadata);
                } else {
                    parse(tikaInputStream, contentHandler, metadata);
                }
                temporaryResources.close();
            } catch (Throwable th) {
                try {
                    temporaryResources.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (CorruptedFileException e) {
            throw new IOException(e);
        } catch (EncryptedDocumentException e2) {
            recordException(e2, this.context);
        } catch (TikaException e3) {
            recordException(e3, this.context);
        }
        if (z) {
            contentHandler.endElement("http://www.w3.org/1999/xhtml", "div", "div");
        }
    }

    public void setEmbeddedBytesSelector(EmbeddedBytesSelector embeddedBytesSelector) {
        this.embeddedBytesSelector = embeddedBytesSelector;
    }
}
