package W0;

import android.os.Trace;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class x {
    public static final u0.h a = new u0.h(0.0f, 0.0f, 10.0f, 10.0f);

    public static final w.o a(w wVar, int i) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            t d = wVar.d();
            if (d.s().p() && d.s().g()) {
                w.F f = new w.F(48);
                E a2 = F.a();
                a2.b(n1.q.b(d.k()));
                b(a2, d, i, f, d, F.a());
                return f;
            }
            return w.p.a();
        } finally {
            Trace.endSection();
        }
    }

    public static final void b(E e, t tVar, int i, w.F f, t tVar2, E e2) {
        M0.t r;
        boolean z = (tVar2.s().p() && tVar2.s().g()) ? false : true;
        if (!e.isEmpty() || tVar2.q() == tVar.q()) {
            if (!z || tVar2.z()) {
                n1.p b = n1.q.b(tVar2.x());
                e2.b(b);
                int q = tVar2.q() == tVar.q() ? i : tVar2.q();
                if (!e2.c(e)) {
                    if (tVar2.z()) {
                        t t = tVar2.t();
                        f.s(q, new v(tVar2, n1.q.b((t == null || (r = t.r()) == null || !r.p()) ? a : t.k())));
                        return;
                    } else {
                        if (q == i) {
                            f.s(q, new v(tVar2, e2.a()));
                            return;
                        }
                        return;
                    }
                }
                f.s(q, new v(tVar2, e2.a()));
                List v = tVar2.v();
                for (int size = v.size() - 1; -1 < size; size--) {
                    if (!((t) v.get(size)).p().e(y.a.x())) {
                        b(e, tVar, i, f, (t) v.get(size), e2);
                    }
                }
                if (d(tVar2)) {
                    e.d(b);
                }
            }
        }
    }

    public static final boolean c(t tVar) {
        if (!tVar.B()) {
            m y = tVar.y();
            y yVar = y.a;
            if (!y.e(yVar.k()) && !tVar.y().e(yVar.p())) {
                return false;
            }
        }
        return true;
    }

    public static final boolean d(t tVar) {
        return !c(tVar) && (tVar.y().p() || tVar.y().f());
    }
}
