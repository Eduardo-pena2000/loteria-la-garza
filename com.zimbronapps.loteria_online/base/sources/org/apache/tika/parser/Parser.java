package org.apache.tika.parser;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Set;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface Parser extends Serializable {
    Set getSupportedTypes(ParseContext parseContext);

    void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) throws IOException, SAXException, TikaException;
}
