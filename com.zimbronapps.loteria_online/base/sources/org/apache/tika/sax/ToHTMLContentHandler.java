package org.apache.tika.sax;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.xml.sax.SAXException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ToHTMLContentHandler extends ToXMLContentHandler {
    private static final Set EMPTY_ELEMENTS = new HashSet(Arrays.asList(new String[]{"area", "base", "basefont", "br", "col", "frame", "hr", "img", "input", "isindex", "link", "meta", "param"}));

    public ToHTMLContentHandler(OutputStream outputStream, String str) throws UnsupportedEncodingException {
        super(outputStream, str);
    }

    public void endElement(String str, String str2, String str3) throws SAXException {
        if (this.inStartElement) {
            write('>');
            this.inStartElement = false;
            if (EMPTY_ELEMENTS.contains(str2)) {
                this.namespaces.clear();
                return;
            }
        }
        super.endElement(str, str2, str3);
    }

    public void startDocument() throws SAXException {
    }

    public ToHTMLContentHandler() {
    }
}
