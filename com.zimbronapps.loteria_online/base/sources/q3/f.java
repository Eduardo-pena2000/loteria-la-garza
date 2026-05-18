package q3;

import P2.z;
import t7.U;
import t7.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f implements a {
    public final r a;
    public final int b;

    public f(int i, r rVar) {
        this.b = i;
        this.a = rVar;
    }

    public static a a(int i, int i2, z zVar) {
        switch (i) {
            case 1718776947:
                return g.d(i2, zVar);
            case 1751742049:
                return c.b(zVar);
            case 1752331379:
                return d.c(zVar);
            case 1852994675:
                return h.a(zVar);
            default:
                return null;
        }
    }

    public static f c(int i, z zVar) {
        r.a aVar = new r.a();
        int g = zVar.g();
        int i2 = -2;
        while (zVar.a() > 8) {
            int t = zVar.t();
            int f = zVar.f() + zVar.t();
            zVar.S(f);
            a c = t == 1414744396 ? c(zVar.t(), zVar) : a(t, i2, zVar);
            if (c != null) {
                if (c.getType() == 1752331379) {
                    i2 = ((d) c).b();
                }
                aVar.h(c);
            }
            zVar.T(f);
            zVar.S(g);
        }
        return new f(i, aVar.k());
    }

    public a b(Class cls) {
        U p = this.a.p();
        while (p.hasNext()) {
            a aVar = (a) p.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    public int getType() {
        return this.b;
    }
}
