package V0;

import O0.e0;
import Qa.p;
import W0.n;
import W0.t;
import W0.x;
import W0.y;
import java.util.List;
import n1.q;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class m {
    public static final boolean a(t tVar) {
        p c = c(tVar);
        W0.j jVar = (W0.j) n.a(tVar.y(), y.a.O());
        return (c == null || jVar == null || ((Number) jVar.a().invoke()).floatValue() <= 0.0f) ? false : true;
    }

    public static final List b(t tVar) {
        return tVar.n(false, false, false);
    }

    public static final p c(t tVar) {
        return (p) n.a(tVar.y(), W0.l.a.v());
    }

    public static final void d(t tVar, int i, Qa.l lVar) {
        t tVar2;
        d0.c cVar = new d0.c(new t[16], 0);
        List b = b(tVar);
        while (true) {
            cVar.e(cVar.m(), b);
            while (cVar.m() != 0) {
                tVar2 = (t) cVar.u(cVar.m() - 1);
                if (!x.c(tVar2) && !tVar2.y().e(y.a.f())) {
                    e0 f = tVar2.f();
                    if (f == null) {
                        L0.a.c("Expected semantics node to have a coordinator.");
                        throw new Ca.i();
                    }
                    M0.p x = f.x();
                    n1.p b2 = q.b(M0.q.c(x));
                    if (b2.k()) {
                        continue;
                    } else {
                        if (!a(tVar2)) {
                            break;
                        }
                        int i2 = i + 1;
                        lVar.invoke(new l(tVar2, i2, b2, x));
                        d(tVar2, i2, lVar);
                    }
                }
            }
            return;
            b = b(tVar2);
        }
    }

    public static /* synthetic */ void e(t tVar, int i, Qa.l lVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        d(tVar, i, lVar);
    }
}
