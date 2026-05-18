package org.apache.tika.sax;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class TextAndAttributeContentHandler extends TextContentHandler {
    public TextAndAttributeContentHandler(ContentHandler contentHandler) {
        this(contentHandler, false);
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        super.startElement(str, str2, str3, attributes);
        int length = attributes.getLength();
        if (length > 0) {
            char[] charArray = (str2.trim() + " ").toCharArray();
            characters(charArray, 0, charArray.length);
            for (int i = 0; i < length; i++) {
                char[] charArray2 = (attributes.getLocalName(i).trim() + " ").toCharArray();
                char[] charArray3 = (attributes.getValue(i).trim() + " ").toCharArray();
                characters(charArray2, 0, charArray2.length);
                characters(charArray3, 0, charArray3.length);
            }
        }
    }

    public TextAndAttributeContentHandler(ContentHandler contentHandler, boolean z) {
        super(contentHandler, z);
    }
}
