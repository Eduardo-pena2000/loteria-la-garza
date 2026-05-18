package cb;

import Ga.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class Z {
    public static final Object a(long j, Ga.e eVar) {
        if (j <= 0) {
            return Ca.I.a;
        }
        p pVar = new p(Ha.b.c(eVar), 1);
        pVar.E();
        if (j < Long.MAX_VALUE) {
            c(pVar.getContext()).m(j, pVar);
        }
        Object w = pVar.w();
        if (w == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return w == Ha.c.f() ? w : Ca.I.a;
    }

    public static final Object b(long j, Ga.e eVar) {
        Object a = a(d(j), eVar);
        return a == Ha.c.f() ? a : Ca.I.a;
    }

    public static final Y c(Ga.i iVar) {
        i.b bVar = iVar.get(Ga.f.D8);
        Y y = bVar instanceof Y ? (Y) bVar : null;
        return y == null ? V.a() : y;
    }

    public static final long d(long j) {
        boolean E = ab.b.E(j);
        if (E) {
            return ab.b.q(ab.b.F(j, ab.d.t(999999L, ab.e.b)));
        }
        if (E) {
            throw new Ca.o();
        }
        return 0L;
    }
}
