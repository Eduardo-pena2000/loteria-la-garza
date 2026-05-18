package I;

import I.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class f {
    public static final /* synthetic */ int a(d0.c cVar, int i) {
        return b(cVar, i);
    }

    public static final int b(d0.c cVar, int i) {
        int m = cVar.m() - 1;
        int i2 = 0;
        while (i2 < m) {
            int i3 = ((m - i2) / 2) + i2;
            int b = ((e.a) cVar.l()[i3]).b();
            if (b == i) {
                return i3;
            }
            if (b < i) {
                i2 = i3 + 1;
                if (i < ((e.a) cVar.l()[i2]).b()) {
                    return i3;
                }
            } else {
                m = i3 - 1;
            }
        }
        return i2;
    }
}
