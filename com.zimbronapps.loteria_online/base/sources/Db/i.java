package Db;

import java.io.InputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class i extends InputStream {
    public volatile InputStream a;

    public i(InputStream inputStream) {
        this.a = inputStream;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public abstract int read(byte[] bArr, int i, int i2);
}
