package org.apache.tika.utils;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class l implements EntityResolver {
    public final InputSource resolveEntity(String str, String str2) {
        return XMLReaderUtils.a(str, str2);
    }
}
