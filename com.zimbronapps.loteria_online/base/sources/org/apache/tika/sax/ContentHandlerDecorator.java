package org.apache.tika.sax;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.ErrorHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ContentHandlerDecorator extends DefaultHandler {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private ContentHandler handler;

    public ContentHandlerDecorator(ContentHandler contentHandler) {
        this.handler = contentHandler;
    }

    public void characters(char[] cArr, int i, int i2) throws SAXException {
        try {
            this.handler.characters(cArr, i, i2);
        } catch (SAXException e) {
            handleException(e);
        }
    }

    public void endDocument() throws SAXException {
        try {
            this.handler.endDocument();
        } catch (SAXException e) {
            handleException(e);
        }
    }

    public void endElement(String str, String str2, String str3) throws SAXException {
        try {
            this.handler.endElement(str, str2, str3);
        } catch (SAXException e) {
            handleException(e);
        }
    }

    public void endPrefixMapping(String str) throws SAXException {
        try {
            this.handler.endPrefixMapping(str);
        } catch (SAXException e) {
            handleException(e);
        }
    }

    public void error(SAXParseException sAXParseException) throws SAXException {
        ErrorHandler errorHandler = this.handler;
        if (errorHandler instanceof ErrorHandler) {
            errorHandler.error(sAXParseException);
        } else {
            super.error(sAXParseException);
        }
    }

    public void fatalError(SAXParseException sAXParseException) throws SAXException {
        ErrorHandler errorHandler = this.handler;
        if (errorHandler instanceof ErrorHandler) {
            errorHandler.fatalError(sAXParseException);
        } else {
            super.fatalError(sAXParseException);
        }
    }

    public void handleException(SAXException sAXException) throws SAXException {
        ContentHandlerDecorator contentHandlerDecorator = this.handler;
        if (!(contentHandlerDecorator instanceof ContentHandlerDecorator)) {
            throw sAXException;
        }
        contentHandlerDecorator.handleException(sAXException);
    }

    public void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
        try {
            this.handler.ignorableWhitespace(cArr, i, i2);
        } catch (SAXException e) {
            handleException(e);
        }
    }

    public void processingInstruction(String str, String str2) throws SAXException {
        try {
            this.handler.processingInstruction(str, str2);
        } catch (SAXException e) {
            handleException(e);
        }
    }

    public void setContentHandler(ContentHandler contentHandler) {
        this.handler = contentHandler;
    }

    public void setDocumentLocator(Locator locator) {
        this.handler.setDocumentLocator(locator);
    }

    public void skippedEntity(String str) throws SAXException {
        try {
            this.handler.skippedEntity(str);
        } catch (SAXException e) {
            handleException(e);
        }
    }

    public void startDocument() throws SAXException {
        try {
            this.handler.startDocument();
        } catch (SAXException e) {
            handleException(e);
        }
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        try {
            this.handler.startElement(str, str2, str3, attributes);
        } catch (SAXException e) {
            handleException(e);
        }
    }

    public void startPrefixMapping(String str, String str2) throws SAXException {
        try {
            this.handler.startPrefixMapping(str, str2);
        } catch (SAXException e) {
            handleException(e);
        }
    }

    public String toString() {
        return this.handler.toString();
    }

    public void warning(SAXParseException sAXParseException) throws SAXException {
        ErrorHandler errorHandler = this.handler;
        if (errorHandler instanceof ErrorHandler) {
            errorHandler.warning(sAXParseException);
        } else {
            super.warning(sAXParseException);
        }
    }

    public ContentHandlerDecorator() {
        this(new DefaultHandler());
    }
}
