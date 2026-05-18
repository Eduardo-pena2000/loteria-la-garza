package org.apache.tika.parser;

import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class AbstractParser implements Parser {
    private static final long serialVersionUID = 7186985395903074255L;

    @Deprecated
    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata) throws IOException, SAXException, TikaException {
        parse(inputStream, contentHandler, metadata, new ParseContext());
    }
}
