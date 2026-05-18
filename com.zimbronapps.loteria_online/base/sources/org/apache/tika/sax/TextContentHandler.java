package org.apache.tika.sax;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class TextContentHandler extends DefaultHandler {
    private static final char[] SPACE = {' '};
    private final boolean addSpaceBetweenElements;
    private final ContentHandler delegate;

    public TextContentHandler(ContentHandler contentHandler) {
        this(contentHandler, false);
    }

    public void characters(char[] cArr, int i, int i2) throws SAXException {
        this.delegate.characters(cArr, i, i2);
    }

    public void endDocument() throws SAXException {
        this.delegate.endDocument();
    }

    public void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
        this.delegate.ignorableWhitespace(cArr, i, i2);
    }

    public void setDocumentLocator(Locator locator) {
        this.delegate.setDocumentLocator(locator);
    }

    public void startDocument() throws SAXException {
        this.delegate.startDocument();
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        if (this.addSpaceBetweenElements) {
            ContentHandler contentHandler = this.delegate;
            char[] cArr = SPACE;
            contentHandler.characters(cArr, 0, cArr.length);
        }
    }

    public String toString() {
        return this.delegate.toString();
    }

    public TextContentHandler(ContentHandler contentHandler, boolean z) {
        this.delegate = contentHandler;
        this.addSpaceBetweenElements = z;
    }
}
