package org.apache.tika.fork;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
class MemoryURLConnection extends URLConnection {
    private final byte[] data;

    public MemoryURLConnection(URL url, byte[] bArr) {
        super(url);
        this.data = bArr;
    }

    public void connect() {
    }

    public InputStream getInputStream() {
        return new ByteArrayInputStream(this.data);
    }
}
