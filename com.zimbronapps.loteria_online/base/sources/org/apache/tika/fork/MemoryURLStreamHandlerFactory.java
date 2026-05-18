package org.apache.tika.fork;

import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
class MemoryURLStreamHandlerFactory implements URLStreamHandlerFactory {
    public URLStreamHandler createURLStreamHandler(String str) {
        if ("tika-in-memory".equals(str)) {
            return new MemoryURLStreamHandler();
        }
        return null;
    }
}
