package S;

import N.I;
import S.c;
import Z0.S0;
import Z0.T0;
import Z0.Y0;
import Z0.Z0;
import Z0.n;
import Z0.q;
import d1.u;
import java.util.List;
import kotlin.jvm.internal.k;
import l1.v;
import n1.s;
import n1.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e {
    public Z0.e a;
    public Y0 b;
    public u.b c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public List h;
    public c i;
    public long j;
    public n1.d k;
    public q l;
    public t m;
    public T0 n;
    public int o;
    public int p;

    public /* synthetic */ e(Z0.e eVar, Y0 y0, u.b bVar, int i, boolean z, int i2, int i3, List list, k kVar) {
        this(eVar, y0, bVar, i, z, i2, i3, list);
    }

    public final n1.d a() {
        return this.k;
    }

    public final T0 b() {
        return this.n;
    }

    public final T0 c() {
        T0 t0 = this.n;
        if (t0 != null) {
            return t0;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    public final int d(int i, t tVar) {
        int i2 = this.o;
        int i3 = this.p;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        int a = I.a(e(n1.c.a(0, i, 0, Integer.MAX_VALUE), tVar).k());
        this.o = i;
        this.p = a;
        return a;
    }

    public final n e(long j, t tVar) {
        q l = l(tVar);
        return new n(l, b.a(j, this.e, this.d, l.a()), b.b(this.e, this.d, this.f), v.g(this.d, v.a.b()), (k) null);
    }

    public final boolean f(long j, t tVar) {
        if (this.g > 1) {
            c.a aVar = c.h;
            c cVar = this.i;
            Y0 y0 = this.b;
            n1.d dVar = this.k;
            kotlin.jvm.internal.t.d(dVar);
            c a = aVar.a(cVar, tVar, y0, dVar, this.c);
            this.i = a;
            j = a.c(j, this.g);
        }
        if (j(this.n, j, tVar)) {
            this.n = m(tVar, j, e(j, tVar));
            return true;
        }
        T0 t0 = this.n;
        kotlin.jvm.internal.t.d(t0);
        if (n1.b.f(j, t0.l().a())) {
            return false;
        }
        T0 t02 = this.n;
        kotlin.jvm.internal.t.d(t02);
        this.n = m(tVar, j, t02.w());
        return true;
    }

    public final void g() {
        this.l = null;
        this.n = null;
        this.p = -1;
        this.o = -1;
    }

    public final int h(t tVar) {
        return I.a(l(tVar).a());
    }

    public final int i(t tVar) {
        return I.a(l(tVar).b());
    }

    public final boolean j(T0 t0, long j, t tVar) {
        if (t0 == null || t0.w().m().c() || tVar != t0.l().d()) {
            return true;
        }
        if (n1.b.f(j, t0.l().a())) {
            return false;
        }
        return n1.b.l(j) != n1.b.l(t0.l().a()) || ((float) n1.b.k(j)) < t0.w().k() || t0.w().i();
    }

    public final void k(n1.d dVar) {
        n1.d dVar2 = this.k;
        long d = dVar != null ? a.d(dVar) : a.a.a();
        if (dVar2 == null) {
            this.k = dVar;
            this.j = d;
        } else if (dVar == null || !a.e(this.j, d)) {
            this.k = dVar;
            this.j = d;
            g();
        }
    }

    public final q l(t tVar) {
        q qVar = this.l;
        if (qVar == null || tVar != this.m || qVar.c()) {
            this.m = tVar;
            Z0.e eVar = this.a;
            Y0 d = Z0.d(this.b, tVar);
            n1.d dVar = this.k;
            kotlin.jvm.internal.t.d(dVar);
            u.b bVar = this.c;
            List list = this.h;
            if (list == null) {
                list = Da.v.n();
            }
            qVar = new q(eVar, d, list, dVar, bVar);
        }
        this.l = qVar;
        return qVar;
    }

    public final T0 m(t tVar, long j, n nVar) {
        float min = Math.min(nVar.m().a(), nVar.E());
        Z0.e eVar = this.a;
        Y0 y0 = this.b;
        List list = this.h;
        if (list == null) {
            list = Da.v.n();
        }
        List list2 = list;
        int i = this.f;
        boolean z = this.e;
        int i2 = this.d;
        n1.d dVar = this.k;
        kotlin.jvm.internal.t.d(dVar);
        return new T0(new S0(eVar, y0, list2, i, z, i2, dVar, tVar, this.c, j, (k) null), nVar, n1.c.d(j, s.a(I.a(min), I.a(nVar.k()))), null);
    }

    public final void n(Z0.e eVar, Y0 y0, u.b bVar, int i, boolean z, int i2, int i3, List list) {
        this.a = eVar;
        this.b = y0;
        this.c = bVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = list;
        g();
    }

    public e(Z0.e eVar, Y0 y0, u.b bVar, int i, boolean z, int i2, int i3, List list) {
        this.a = eVar;
        this.b = y0;
        this.c = bVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = list;
        this.j = a.a.a();
        this.o = -1;
        this.p = -1;
    }
}
