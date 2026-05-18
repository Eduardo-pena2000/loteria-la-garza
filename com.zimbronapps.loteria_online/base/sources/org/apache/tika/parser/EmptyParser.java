package org.apache.tika.parser;

import java.io.InputStream;
import java.util.Collections;
import java.util.Set;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.sax.XHTMLContentHandler;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class EmptyParser implements Parser {
    public static final EmptyParser INSTANCE = new EmptyParser();
    private static final long serialVersionUID = -4218649699095732123L;

    public Set getSupportedTypes(ParseContext parseContext) {
        return Collections.emptySet();
    }

    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) throws SAXException {
        XHTMLContentHandler xHTMLContentHandler = new XHTMLContentHandler(contentHandler, metadata);
        xHTMLContentHandler.startDocument();
        xHTMLContentHandler.endDocument();
    }
}
