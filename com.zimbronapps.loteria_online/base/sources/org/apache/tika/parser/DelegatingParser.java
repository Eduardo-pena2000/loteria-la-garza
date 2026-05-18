package org.apache.tika.parser;

import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class DelegatingParser implements Parser {
    public Parser getDelegateParser(ParseContext parseContext) {
        return (Parser) parseContext.get(Parser.class, EmptyParser.INSTANCE);
    }

    public Set getSupportedTypes(ParseContext parseContext) {
        return getDelegateParser(parseContext).getSupportedTypes(parseContext);
    }

    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) throws SAXException, IOException, TikaException {
        getDelegateParser(parseContext).parse(inputStream, contentHandler, metadata, parseContext);
    }
}
