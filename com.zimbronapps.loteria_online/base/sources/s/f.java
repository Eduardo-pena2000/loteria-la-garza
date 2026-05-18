package S;

import Ca.I;
import S.c;
import Z0.A;
import Z0.S0;
import Z0.T0;
import Z0.Y0;
import Z0.Z0;
import Z0.n;
import Z0.q;
import Z0.v;
import Z0.y;
import Z0.z;
import d1.u;
import kotlin.jvm.internal.k;
import n1.r;
import n1.s;
import n1.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f {
    public String a;
    public Y0 b;
    public u.b c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public long h;
    public n1.d i;
    public v j;
    public boolean k;
    public long l;
    public c m;
    public y n;
    public t o;
    public long p;
    public int q;
    public int r;

    public /* synthetic */ f(String str, Y0 y0, u.b bVar, int i, boolean z, int i2, int i3, k kVar) {
        this(str, y0, bVar, i, z, i2, i3);
    }

    public final n1.d a() {
        return this.i;
    }

    public final boolean b() {
        return this.k;
    }

    public final long c() {
        return this.l;
    }

    public final I d() {
        y yVar = this.n;
        if (yVar != null) {
            yVar.c();
        }
        return I.a;
    }

    public final v e() {
        return this.j;
    }

    public final int f(int i, t tVar) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        int a = N.I.a(g(n1.c.a(0, i, 0, Integer.MAX_VALUE), tVar).getHeight());
        this.q = i;
        this.r = a;
        return a;
    }

    public final v g(long j, t tVar) {
        y n = n(tVar);
        return A.c(n, b.a(j, this.e, this.d, n.a()), b.b(this.e, this.d, this.f), l1.v.g(this.d, l1.v.a.b()));
    }

    public final boolean h(long j, t tVar) {
        boolean z = true;
        if (this.g > 1) {
            c.a aVar = c.h;
            c cVar = this.m;
            Y0 y0 = this.b;
            n1.d dVar = this.i;
            kotlin.jvm.internal.t.d(dVar);
            c a = aVar.a(cVar, tVar, y0, dVar, this.c);
            this.m = a;
            j = a.c(j, this.g);
        }
        boolean z2 = false;
        if (l(j, tVar)) {
            v g = g(j, tVar);
            this.p = j;
            this.l = n1.c.d(j, s.a(N.I.a(g.getWidth()), N.I.a(g.getHeight())));
            if (!l1.v.g(this.d, l1.v.a.e()) && (r.g(r9) < g.getWidth() || r.f(r9) < g.getHeight())) {
                z2 = true;
            }
            this.k = z2;
            this.j = g;
            return true;
        }
        if (!n1.b.f(j, this.p)) {
            v vVar = this.j;
            kotlin.jvm.internal.t.d(vVar);
            this.l = n1.c.d(j, s.a(N.I.a(Math.min(vVar.a(), vVar.getWidth())), N.I.a(vVar.getHeight())));
            if (l1.v.g(this.d, l1.v.a.e()) || (r.g(r3) >= vVar.getWidth() && r.f(r3) >= vVar.getHeight())) {
                z = false;
            }
            this.k = z;
            this.p = j;
        }
        return false;
    }

    public final void i() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = n1.b.b.c(0, 0);
        this.l = s.a(0, 0);
        this.k = false;
    }

    public final int j(t tVar) {
        return N.I.a(n(tVar).a());
    }

    public final int k(t tVar) {
        return N.I.a(n(tVar).b());
    }

    public final boolean l(long j, t tVar) {
        y yVar;
        v vVar = this.j;
        if (vVar == null || (yVar = this.n) == null || yVar.c() || tVar != this.o) {
            return true;
        }
        if (n1.b.f(j, this.p)) {
            return false;
        }
        return n1.b.l(j) != n1.b.l(this.p) || ((float) n1.b.k(j)) < vVar.getHeight() || vVar.n();
    }

    public final void m(n1.d dVar) {
        n1.d dVar2 = this.i;
        long d = dVar != null ? a.d(dVar) : a.a.a();
        if (dVar2 == null) {
            this.i = dVar;
            this.h = d;
        } else if (dVar == null || !a.e(this.h, d)) {
            this.i = dVar;
            this.h = d;
            i();
        }
    }

    public final y n(t tVar) {
        y yVar = this.n;
        if (yVar == null || tVar != this.o || yVar.c()) {
            this.o = tVar;
            String str = this.a;
            Y0 d = Z0.d(this.b, tVar);
            n1.d dVar = this.i;
            kotlin.jvm.internal.t.d(dVar);
            yVar = z.c(str, d, null, null, dVar, this.c, 12, null);
        }
        this.n = yVar;
        return yVar;
    }

    public final T0 o(Y0 y0) {
        n1.d dVar;
        t tVar = this.o;
        if (tVar == null || (dVar = this.i) == null) {
            return null;
        }
        Z0.e eVar = new Z0.e(this.a, null, null, 6, null);
        if (this.j == null || this.n == null) {
            return null;
        }
        long d = n1.b.d(this.p, 0, 0, 0, 0, 10, null);
        return new T0(new S0(eVar, y0, Da.v.n(), this.f, this.e, this.d, dVar, tVar, this.c, d, (k) null), new n(new q(eVar, y0, Da.v.n(), dVar, this.c), d, this.f, l1.v.g(this.d, l1.v.a.b()), (k) null), this.l, null);
    }

    public final void p(String str, Y0 y0, u.b bVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = y0;
        this.c = bVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        i();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ParagraphLayoutCache(paragraph=");
        sb.append(this.j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append(a.h(this.h));
        sb.append(')');
        return sb.toString();
    }

    public f(String str, Y0 y0, u.b bVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = y0;
        this.c = bVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = a.a.a();
        this.l = s.a(0, 0);
        this.p = n1.b.b.c(0, 0);
        this.q = -1;
        this.r = -1;
    }
}
