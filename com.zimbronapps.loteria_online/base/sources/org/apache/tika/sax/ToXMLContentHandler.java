package org.apache.tika.sax;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ToXMLContentHandler extends ToTextContentHandler {
    private ElementInfo currentElement;
    private final String encoding;
    protected boolean inStartElement;
    protected final Map namespaces;

    public static class ElementInfo {
        private final Map namespaces;
        private final ElementInfo parent;

        public ElementInfo(ElementInfo elementInfo, Map map) {
            this.parent = elementInfo;
            if (map.isEmpty()) {
                this.namespaces = Collections.emptyMap();
            } else {
                this.namespaces = new HashMap(map);
            }
        }

        public static /* bridge */ /* synthetic */ ElementInfo a(ElementInfo elementInfo) {
            return elementInfo.parent;
        }

        public String getPrefix(String str) throws SAXException {
            String str2 = (String) this.namespaces.get(str);
            if (str2 != null) {
                return str2;
            }
            ElementInfo elementInfo = this.parent;
            if (elementInfo != null) {
                return elementInfo.getPrefix(str);
            }
            if (str == null || str.isEmpty()) {
                return "";
            }
            throw new SAXException("Namespace " + str + " not declared");
        }

        public String getQName(String str, String str2) throws SAXException {
            String prefix = getPrefix(str);
            if (prefix.length() <= 0) {
                return str2;
            }
            return prefix + ":" + str2;
        }
    }

    public ToXMLContentHandler(OutputStream outputStream, String str) throws UnsupportedEncodingException {
        super(outputStream, str);
        this.namespaces = new HashMap();
        this.inStartElement = false;
        this.encoding = str;
    }

    private void lazyCloseStartElement() throws SAXException {
        if (this.inStartElement) {
            write('>');
            this.inStartElement = false;
        }
    }

    private int writeCharsAndEntity(char[] cArr, int i, int i2, String str) throws SAXException {
        super.characters(cArr, i, i2 - i);
        write('&');
        write(str);
        write(';');
        return i2 + 1;
    }

    private void writeEscaped(char[] cArr, int i, int i2, boolean z) throws SAXException {
        int i3 = i;
        while (i < i2) {
            char c = cArr[i];
            if (c == '<') {
                i3 = writeCharsAndEntity(cArr, i3, i, "lt");
            } else if (c == '>') {
                i3 = writeCharsAndEntity(cArr, i3, i, "gt");
            } else if (c == '&') {
                i3 = writeCharsAndEntity(cArr, i3, i, "amp");
            } else if (z && c == '\"') {
                i3 = writeCharsAndEntity(cArr, i3, i, "quot");
            } else {
                i++;
            }
            i = i3;
        }
        super.characters(cArr, i3, i2 - i3);
    }

    public void characters(char[] cArr, int i, int i2) throws SAXException {
        lazyCloseStartElement();
        writeEscaped(cArr, i, i2 + i, false);
    }

    public void endElement(String str, String str2, String str3) throws SAXException {
        if (this.inStartElement) {
            write(" />");
            this.inStartElement = false;
        } else {
            write("</");
            write(str3);
            write('>');
        }
        this.namespaces.clear();
        this.currentElement = ElementInfo.a(this.currentElement);
    }

    public void startDocument() throws SAXException {
        if (this.encoding != null) {
            write("<?xml version=\"1.0\" encoding=\"");
            write(this.encoding);
            write("\"?>\n");
        }
        this.currentElement = null;
        this.namespaces.clear();
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        lazyCloseStartElement();
        this.currentElement = new ElementInfo(this.currentElement, this.namespaces);
        write('<');
        write(this.currentElement.getQName(str, str2));
        for (int i = 0; i < attributes.getLength(); i++) {
            write(' ');
            write(this.currentElement.getQName(attributes.getURI(i), attributes.getLocalName(i)));
            write('=');
            write('\"');
            char[] charArray = attributes.getValue(i).toCharArray();
            writeEscaped(charArray, 0, charArray.length, true);
            write('\"');
        }
        for (Map.Entry entry : this.namespaces.entrySet()) {
            write(' ');
            write("xmlns");
            String str4 = (String) entry.getValue();
            if (str4.length() > 0) {
                write(':');
                write(str4);
            }
            write('=');
            write('\"');
            char[] charArray2 = ((String) entry.getKey()).toCharArray();
            writeEscaped(charArray2, 0, charArray2.length, true);
            write('\"');
        }
        this.namespaces.clear();
        this.inStartElement = true;
    }

    public void startPrefixMapping(String str, String str2) throws SAXException {
        try {
            ElementInfo elementInfo = this.currentElement;
            if (elementInfo != null) {
                if (str.equals(elementInfo.getPrefix(str2))) {
                    return;
                }
            }
        } catch (SAXException unused) {
        }
        this.namespaces.put(str2, str);
    }

    public void write(char c) throws SAXException {
        super.characters(new char[]{c}, 0, 1);
    }

    public void write(String str) throws SAXException {
        super.characters(str.toCharArray(), 0, str.length());
    }

    public ToXMLContentHandler(String str) {
        this.namespaces = new HashMap();
        this.inStartElement = false;
        this.encoding = str;
    }

    public ToXMLContentHandler() {
        this.namespaces = new HashMap();
        this.inStartElement = false;
        this.encoding = null;
    }
}
