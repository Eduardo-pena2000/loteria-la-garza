package org.apache.tika.sax;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class XHTMLContentHandler extends SafeContentHandler {
    public static final String XHTML = "http://www.w3.org/1999/xhtml";
    private boolean documentStarted;
    private boolean headEnded;
    private boolean headStarted;
    private final Metadata metadata;
    private boolean useFrameset;
    public static final Set ENDLINE = unmodifiableSet("p", "h1", "h2", "h3", "h4", "h5", "h6", "div", "ul", "ol", "dl", "pre", "hr", "blockquote", "address", "fieldset", "table", "form", "noscript", "li", "dt", "dd", "noframes", "br", "tr", "select", "option", "link", "script");
    private static final char[] NL = {'\n'};
    private static final char[] TAB = {'\t'};
    private static final Set HEAD = unmodifiableSet("title", "link", "base", "meta", "script");
    private static final Set AUTO = unmodifiableSet("head", "frameset");
    private static final Set INDENT = unmodifiableSet("li", "dd", "dt", "td", "th", "frame");
    private static final Attributes EMPTY_ATTRIBUTES = new AttributesImpl();

    public XHTMLContentHandler(ContentHandler contentHandler, Metadata metadata) {
        super(contentHandler);
        this.documentStarted = false;
        this.headStarted = false;
        this.headEnded = false;
        this.useFrameset = false;
        this.metadata = metadata;
    }

    private void lazyEndHead(boolean z) throws SAXException {
        lazyStartHead();
        if (this.headEnded) {
            return;
        }
        this.headEnded = true;
        this.useFrameset = z;
        for (String str : this.metadata.names()) {
            if (!str.equals("title")) {
                for (String str2 : this.metadata.getValues(str)) {
                    if (str2 != null) {
                        AttributesImpl attributesImpl = new AttributesImpl();
                        attributesImpl.addAttribute("", "name", "name", "CDATA", str);
                        attributesImpl.addAttribute("", "content", "content", "CDATA", str2);
                        super.startElement("http://www.w3.org/1999/xhtml", "meta", "meta", attributesImpl);
                        super.endElement("http://www.w3.org/1999/xhtml", "meta", "meta");
                        newline();
                    }
                }
            }
        }
        Attributes attributes = EMPTY_ATTRIBUTES;
        super.startElement("http://www.w3.org/1999/xhtml", "title", "title", attributes);
        String str3 = this.metadata.get(TikaCoreProperties.TITLE);
        if (str3 == null || str3.length() <= 0) {
            super.characters(new char[0], 0, 0);
        } else {
            char[] charArray = str3.toCharArray();
            super.characters(charArray, 0, charArray.length);
        }
        super.endElement("http://www.w3.org/1999/xhtml", "title", "title");
        newline();
        super.endElement("http://www.w3.org/1999/xhtml", "head", "head");
        newline();
        if (this.useFrameset) {
            super.startElement("http://www.w3.org/1999/xhtml", "frameset", "frameset", attributes);
        } else {
            super.startElement("http://www.w3.org/1999/xhtml", "body", "body", attributes);
        }
    }

    private void lazyStartHead() throws SAXException {
        if (this.headStarted) {
            return;
        }
        this.headStarted = true;
        AttributesImpl attributesImpl = new AttributesImpl();
        String str = this.metadata.get("Content-Language");
        if (str != null) {
            attributesImpl.addAttribute("", "lang", "lang", "CDATA", str);
        }
        super.startElement("http://www.w3.org/1999/xhtml", "html", "html", attributesImpl);
        newline();
        super.startElement("http://www.w3.org/1999/xhtml", "head", "head", EMPTY_ATTRIBUTES);
        newline();
    }

    private static Set unmodifiableSet(String... strArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(strArr)));
    }

    public void characters(char[] cArr, int i, int i2) throws SAXException {
        lazyEndHead(this.useFrameset);
        super.characters(cArr, i, i2);
    }

    public void element(String str, String str2) throws SAXException {
        if (str2 == null || str2.length() <= 0) {
            return;
        }
        startElement(str);
        characters(str2);
        endElement(str);
    }

    public void endDocument() throws SAXException {
        lazyEndHead(this.useFrameset);
        if (this.useFrameset) {
            super.endElement("http://www.w3.org/1999/xhtml", "frameset", "frameset");
        } else {
            super.endElement("http://www.w3.org/1999/xhtml", "body", "body");
        }
        super.endElement("http://www.w3.org/1999/xhtml", "html", "html");
        endPrefixMapping("");
        super.endDocument();
    }

    public void endElement(String str, String str2, String str3) throws SAXException {
        if (AUTO.contains(str3)) {
            return;
        }
        super.endElement(str, str2, str3);
        if ("http://www.w3.org/1999/xhtml".equals(str) && ENDLINE.contains(str3)) {
            newline();
        }
    }

    public boolean isInvalid(int i) {
        if (super.isInvalid(i)) {
            return true;
        }
        return 127 <= i && i <= 159;
    }

    public void newline() throws SAXException {
        char[] cArr = NL;
        ignorableWhitespace(cArr, 0, cArr.length);
    }

    public void startDocument() throws SAXException {
        if (this.documentStarted) {
            return;
        }
        this.documentStarted = true;
        super.startDocument();
        startPrefixMapping("", "http://www.w3.org/1999/xhtml");
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        if (str3.equals("frameset")) {
            lazyEndHead(true);
            return;
        }
        if (AUTO.contains(str3)) {
            return;
        }
        if (HEAD.contains(str3)) {
            lazyStartHead();
        } else {
            lazyEndHead(false);
        }
        if ("http://www.w3.org/1999/xhtml".equals(str) && INDENT.contains(str3)) {
            char[] cArr = TAB;
            ignorableWhitespace(cArr, 0, cArr.length);
        }
        super.startElement(str, str2, str3, attributes);
    }

    public void characters(String str) throws SAXException {
        if (str == null || str.length() <= 0) {
            return;
        }
        characters(str.toCharArray(), 0, str.length());
    }

    public void endElement(String str) throws SAXException {
        endElement("http://www.w3.org/1999/xhtml", str, str);
    }

    public void startElement(String str) throws SAXException {
        startElement("http://www.w3.org/1999/xhtml", str, str, EMPTY_ATTRIBUTES);
    }

    public void startElement(String str, String str2, String str3) throws SAXException {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", str2, str2, "CDATA", str3);
        startElement("http://www.w3.org/1999/xhtml", str, str, attributesImpl);
    }

    public void startElement(String str, AttributesImpl attributesImpl) throws SAXException {
        startElement("http://www.w3.org/1999/xhtml", str, str, attributesImpl);
    }
}
