package jb;

import cb.K;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class k extends K {
    public static final k b = new k();

    public K B(int i, String str) {
        hb.l.a(i);
        return i >= j.d ? hb.l.b(this, str) : super.B(i, str);
    }

    public String toString() {
        return "Dispatchers.IO";
    }

    public void x(Ga.i iVar, Runnable runnable) {
        c.h.J(runnable, true, false);
    }

    public void y(Ga.i iVar, Runnable runnable) {
        c.h.J(runnable, true, true);
    }
}
