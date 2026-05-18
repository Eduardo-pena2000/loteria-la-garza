package org.apache.tika.sax;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ExpandedTitleContentHandler extends ContentHandlerDecorator {
    private static final String TITLE_TAG = "TITLE";
    private boolean isTitleTagOpen;

    public ExpandedTitleContentHandler() {
    }

    public void characters(char[] cArr, int i, int i2) throws SAXException {
        if (!this.isTitleTagOpen || i2 != 0) {
            super.characters(cArr, i, i2);
        } else {
            try {
                super.characters(new char[0], 0, 1);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
    }

    public void endElement(String str, String str2, String str3) throws SAXException {
        super.endElement(str, str2, str3);
        if ("TITLE".equalsIgnoreCase(str2) && "http://www.w3.org/1999/xhtml".equals(str)) {
            this.isTitleTagOpen = false;
        }
    }

    public void startDocument() throws SAXException {
        super.startDocument();
        this.isTitleTagOpen = false;
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        super.startElement(str, str2, str3, attributes);
        if ("TITLE".equalsIgnoreCase(str2) && "http://www.w3.org/1999/xhtml".equals(str)) {
            this.isTitleTagOpen = true;
        }
    }

    public ExpandedTitleContentHandler(ContentHandler contentHandler) {
        super(contentHandler);
    }
}
