package org.apache.tika.extractor;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.exception.CorruptedFileException;
import org.apache.tika.exception.EncryptedDocumentException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.DelegatingParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.ParseRecord;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BodyContentHandler;
import org.apache.tika.sax.EmbeddedContentHandler;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ParsingEmbeddedDocumentExtractor implements EmbeddedDocumentExtractor {
    private static final File ABSTRACT_PATH = new File("");
    private static final Parser DELEGATING_PARSER = new DelegatingParser();
    protected final ParseContext context;
    private boolean writeFileNameToContent = true;

    public ParsingEmbeddedDocumentExtractor(ParseContext parseContext) {
        this.context = parseContext;
    }

    public Parser getDelegatingParser() {
        return DELEGATING_PARSER;
    }

    public boolean isWriteFileNameToContent() {
        return this.writeFileNameToContent;
    }

    public void parseEmbedded(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, boolean z) throws SAXException, IOException {
        Object openContainer;
        if (z) {
            AttributesImpl attributesImpl = new AttributesImpl();
            attributesImpl.addAttribute("", "class", "class", "CDATA", "package-entry");
            contentHandler.startElement("http://www.w3.org/1999/xhtml", "div", "div", attributesImpl);
        }
        String str = metadata.get("resourceName");
        if (this.writeFileNameToContent && str != null && str.length() > 0 && z) {
            contentHandler.startElement("http://www.w3.org/1999/xhtml", "h1", "h1", new AttributesImpl());
            char[] charArray = str.toCharArray();
            contentHandler.characters(charArray, 0, charArray.length);
            contentHandler.endElement("http://www.w3.org/1999/xhtml", "h1", "h1");
        }
        try {
            TemporaryResources temporaryResources = new TemporaryResources();
            try {
                InputStream inputStream2 = TikaInputStream.get((InputStream) Db.a.a(inputStream), temporaryResources, metadata);
                if ((inputStream instanceof TikaInputStream) && (openContainer = ((TikaInputStream) inputStream).getOpenContainer()) != null) {
                    inputStream2.setOpenContainer(openContainer);
                }
                DELEGATING_PARSER.parse(inputStream2, new EmbeddedContentHandler(new BodyContentHandler(contentHandler)), metadata, this.context);
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

    public void recordException(Exception exc, ParseContext parseContext) {
        ParseRecord parseRecord = (ParseRecord) parseContext.get(ParseRecord.class);
        if (parseRecord == null) {
            return;
        }
        parseRecord.addException(exc);
    }

    public void setWriteFileNameToContent(boolean z) {
        this.writeFileNameToContent = z;
    }

    public boolean shouldParseEmbedded(Metadata metadata) {
        String str;
        DocumentSelector documentSelector = (DocumentSelector) this.context.get(DocumentSelector.class);
        if (documentSelector != null) {
            return documentSelector.select(metadata);
        }
        FilenameFilter filenameFilter = (FilenameFilter) this.context.get(FilenameFilter.class);
        if (filenameFilter == null || (str = metadata.get("resourceName")) == null) {
            return true;
        }
        return filenameFilter.accept(ABSTRACT_PATH, str);
    }
}
