package w7;

import s7.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class i {
    public static byte a(long j) {
        m.g((j >> 8) == 0, "out of range: %s", j);
        return (byte) j;
    }

    public static int b(byte b) {
        return b & 255;
    }
}
