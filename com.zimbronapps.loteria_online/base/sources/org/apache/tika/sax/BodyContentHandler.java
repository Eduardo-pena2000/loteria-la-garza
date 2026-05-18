package org.apache.tika.sax;

import java.io.Writer;
import org.apache.tika.sax.xpath.Matcher;
import org.apache.tika.sax.xpath.MatchingContentHandler;
import org.apache.tika.sax.xpath.XPathParser;
import org.xml.sax.ContentHandler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class BodyContentHandler extends ContentHandlerDecorator {
    private static final Matcher MATCHER;
    private static final XPathParser PARSER;

    static {
        XPathParser xPathParser = new XPathParser("xhtml", "http://www.w3.org/1999/xhtml");
        PARSER = xPathParser;
        MATCHER = xPathParser.parse("/xhtml:html/xhtml:body/descendant::node()");
    }

    public BodyContentHandler(ContentHandler contentHandler) {
        super(new MatchingContentHandler(contentHandler, MATCHER));
    }

    public BodyContentHandler(Writer writer) {
        this((ContentHandler) new WriteOutContentHandler(writer));
    }

    public BodyContentHandler(int i) {
        this((ContentHandler) new WriteOutContentHandler(i));
    }

    public BodyContentHandler() {
        this((ContentHandler) new WriteOutContentHandler());
    }
}
