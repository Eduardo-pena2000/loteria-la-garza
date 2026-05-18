package S;

import N.I;
import Wa.n;
import l1.v;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b {
    public static final long a(long j, boolean z, int i, float f) {
        return n1.b.b.b(0, c(j, z, i, f), 0, n1.b.k(j));
    }

    public static final int b(boolean z, int i, int i2) {
        if (z || !v.g(i, v.a.b())) {
            return n.e(i2, 1);
        }
        return 1;
    }

    public static final int c(long j, boolean z, int i, float f) {
        int l = ((z || v.g(i, v.a.b())) && n1.b.h(j)) ? n1.b.l(j) : Integer.MAX_VALUE;
        return n1.b.n(j) == l ? l : n.m(I.a(f), n1.b.n(j), l);
    }
}
