package I3;

import M2.x;
import P2.z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class q {
    public static int a(int i, z zVar, int i2) {
        if (i == 12) {
            return 240;
        }
        if (i == 13) {
            return 120;
        }
        if (i == 21 && zVar.a() >= 8 && zVar.f() + 8 <= i2) {
            int p = zVar.p();
            int p2 = zVar.p();
            if (p >= 12 && p2 == 1936877170) {
                return zVar.H();
            }
        }
        return -2147483647;
    }

    public static x b(z zVar, int i) {
        zVar.U(12);
        while (zVar.f() < i) {
            int f = zVar.f();
            int p = zVar.p();
            if (zVar.p() == 1935766900) {
                if (p < 16) {
                    return null;
                }
                zVar.U(4);
                int i2 = -1;
                int i3 = 0;
                for (int i4 = 0; i4 < 2; i4++) {
                    int G = zVar.G();
                    int G2 = zVar.G();
                    if (G == 0) {
                        i2 = G2;
                    } else if (G == 1) {
                        i3 = G2;
                    }
                }
                int a = a(i2, zVar, i);
                if (a == -2147483647) {
                    return null;
                }
                return new x(new D3.d(a, i3));
            }
            zVar.T(f + p);
        }
        return null;
    }
}
