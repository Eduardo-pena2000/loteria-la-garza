package jb;

import cb.K;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class c extends f {
    public static final c h = new c();

    public c() {
        super(j.c, j.d, j.e, j.a);
    }

    public K B(int i, String str) {
        hb.l.a(i);
        return i >= j.c ? hb.l.b(this, str) : super.B(i, str);
    }

    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public String toString() {
        return "Dispatchers.Default";
    }
}
