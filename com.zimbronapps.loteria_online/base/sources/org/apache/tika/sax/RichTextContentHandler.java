package org.apache.tika.sax;

import java.io.Writer;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class RichTextContentHandler extends WriteOutContentHandler {
    public RichTextContentHandler(Writer writer) {
        super(writer);
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        super.startElement(str, str2, str3, attributes);
        if ("img".equals(str2) && attributes.getValue("alt") != null) {
            String str4 = "[image: " + attributes.getValue("alt") + "]";
            characters(str4.toCharArray(), 0, str4.length());
        }
        if (!"a".equals(str2) || attributes.getValue("name") == null) {
            return;
        }
        String str5 = "[bookmark: " + attributes.getValue("name") + "]";
        characters(str5.toCharArray(), 0, str5.length());
    }
}
