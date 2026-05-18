package org.apache.tika.parser;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.sax.BodyContentHandler;
import org.apache.tika.sax.TeeContentHandler;
import org.apache.tika.utils.RegexUtils;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ParserPostProcessor extends ParserDecorator {
    public ParserPostProcessor(Parser parser) {
        super(parser);
    }

    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) throws IOException, SAXException, TikaException {
        ContentHandler bodyContentHandler = new BodyContentHandler();
        super.parse(inputStream, new TeeContentHandler(contentHandler, bodyContentHandler), metadata, parseContext);
        String obj = bodyContentHandler.toString();
        metadata.set("fulltext", obj);
        metadata.set("summary", obj.substring(0, Math.min(obj.length(), 500)));
        Iterator it = RegexUtils.extractLinks(obj).iterator();
        while (it.hasNext()) {
            metadata.add("outlinks", (String) it.next());
        }
    }
}
