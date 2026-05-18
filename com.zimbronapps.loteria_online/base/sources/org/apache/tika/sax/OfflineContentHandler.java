package org.apache.tika.sax;

import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class OfflineContentHandler extends ContentHandlerDecorator {
    public OfflineContentHandler(ContentHandler contentHandler) {
        super(contentHandler);
    }

    public InputSource resolveEntity(String str, String str2) {
        return new InputSource(new Db.b());
    }
}
