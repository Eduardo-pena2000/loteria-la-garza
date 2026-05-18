package org.apache.tika.parser;

import java.io.IOException;
import java.util.Map;
import org.apache.tika.exception.TikaException;
import org.xml.sax.SAXException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class ParserFactory {
    final Map args;

    public ParserFactory(Map map) {
        this.args = map;
    }

    public abstract Parser build() throws IOException, SAXException, TikaException;
}
