package Ua;

import java.util.Random;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class a extends c {
    public int b(int i) {
        return d.e(g().nextInt(), i);
    }

    public int c() {
        return g().nextInt();
    }

    public int d(int i) {
        return g().nextInt(i);
    }

    public long e() {
        return g().nextLong();
    }

    public abstract Random g();
}
