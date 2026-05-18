package org.apache.tika.sax;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class TeeContentHandler extends DefaultHandler {
    private final ContentHandler[] handlers;

    public TeeContentHandler(ContentHandler... contentHandlerArr) {
        this.handlers = contentHandlerArr;
    }

    public void characters(char[] cArr, int i, int i2) throws SAXException {
        for (ContentHandler contentHandler : this.handlers) {
            contentHandler.characters(cArr, i, i2);
        }
    }

    public void endDocument() throws SAXException {
        for (ContentHandler contentHandler : this.handlers) {
            contentHandler.endDocument();
        }
    }

    public void endElement(String str, String str2, String str3) throws SAXException {
        for (ContentHandler contentHandler : this.handlers) {
            contentHandler.endElement(str, str2, str3);
        }
    }

    public void endPrefixMapping(String str) throws SAXException {
        for (ContentHandler contentHandler : this.handlers) {
            contentHandler.endPrefixMapping(str);
        }
    }

    public void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
        for (ContentHandler contentHandler : this.handlers) {
            contentHandler.ignorableWhitespace(cArr, i, i2);
        }
    }

    public void processingInstruction(String str, String str2) throws SAXException {
        for (ContentHandler contentHandler : this.handlers) {
            contentHandler.processingInstruction(str, str2);
        }
    }

    public void setDocumentLocator(Locator locator) {
        for (ContentHandler contentHandler : this.handlers) {
            contentHandler.setDocumentLocator(locator);
        }
    }

    public void skippedEntity(String str) throws SAXException {
        for (ContentHandler contentHandler : this.handlers) {
            contentHandler.skippedEntity(str);
        }
    }

    public void startDocument() throws SAXException {
        for (ContentHandler contentHandler : this.handlers) {
            contentHandler.startDocument();
        }
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        for (ContentHandler contentHandler : this.handlers) {
            contentHandler.startElement(str, str2, str3, attributes);
        }
    }

    public void startPrefixMapping(String str, String str2) throws SAXException {
        for (ContentHandler contentHandler : this.handlers) {
            contentHandler.startPrefixMapping(str, str2);
        }
    }
}
