package x8;

import w8.v;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class q implements v {
    public final String a;
    public final int b;

    public q(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public int a() {
        return this.b;
    }

    public byte[] b() {
        return this.b == 0 ? w8.o.n : this.a.getBytes(l.e);
    }
}
