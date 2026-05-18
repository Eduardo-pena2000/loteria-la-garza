package Z0;

import Z0.W0;
import java.util.ArrayList;
import java.util.List;
import v0.C1;
import v0.m1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n {
    public final q a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final List g;
    public final List h;

    public /* synthetic */ n(q qVar, long j, int i, int i2, kotlin.jvm.internal.k kVar) {
        this(qVar, j, i, i2);
    }

    public static final Ca.I B(m1 m1Var, int i, int i2, w wVar) {
        m1.b(m1Var, wVar.j(wVar.e().p(wVar.r(i), wVar.r(i2))), 0L, 2, null);
        return Ca.I.a;
    }

    public static /* synthetic */ void H(n nVar, v0.j0 j0Var, long j, C1 c1, l1.k kVar, x0.g gVar, int i, int i2, Object obj) {
        nVar.G(j0Var, (i2 & 2) != 0 ? v0.r0.b.j() : j, (i2 & 4) != 0 ? null : c1, (i2 & 8) != 0 ? null : kVar, (i2 & 16) == 0 ? gVar : null, (i2 & 32) != 0 ? x0.f.a9.a() : i);
    }

    public static /* synthetic */ void J(n nVar, v0.j0 j0Var, v0.h0 h0Var, float f, C1 c1, l1.k kVar, x0.g gVar, int i, int i2, Object obj) {
        nVar.I(j0Var, h0Var, (i2 & 4) != 0 ? Float.NaN : f, (i2 & 8) != 0 ? null : c1, (i2 & 16) != 0 ? null : kVar, (i2 & 32) != 0 ? null : gVar, (i2 & 64) != 0 ? x0.f.a9.a() : i);
    }

    public static /* synthetic */ Ca.I a(long j, float[] fArr, kotlin.jvm.internal.M m, kotlin.jvm.internal.L l, w wVar) {
        return d(j, fArr, m, l, wVar);
    }

    public static /* synthetic */ Ca.I b(m1 m1Var, int i, int i2, w wVar) {
        return B(m1Var, i, i2, wVar);
    }

    public static final Ca.I d(long j, float[] fArr, kotlin.jvm.internal.M m, kotlin.jvm.internal.L l, w wVar) {
        long b = X0.b(wVar.r(wVar.f() > W0.l(j) ? wVar.f() : W0.l(j)), wVar.r(wVar.b() < W0.k(j) ? wVar.b() : W0.k(j)));
        wVar.e().s(b, fArr, m.a);
        int j2 = m.a + (W0.j(b) * 4);
        for (int i = m.a; i < j2; i += 4) {
            int i2 = i + 1;
            float f = fArr[i2];
            float f2 = l.a;
            fArr[i2] = f + f2;
            int i3 = i + 3;
            fArr[i3] = fArr[i3] + f2;
        }
        m.a = j2;
        l.a += wVar.e().getHeight();
        return Ca.I.a;
    }

    public final m1 A(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= e().j().length())) {
            g1.a.a("Start(" + i + ") or End(" + i2 + ") is out of range [0.." + e().j().length() + "), or start > end!");
        }
        if (i == i2) {
            return v0.V.a();
        }
        m1 a = v0.V.a();
        t.f(this.h, X0.b(i, i2), new m(a, i, i2));
        return a;
    }

    public final List C() {
        return this.g;
    }

    public final long D(u0.h hVar, int i, R0 r0) {
        W0.a aVar;
        W0.a aVar2;
        int e = t.e(this.h, hVar.l());
        if (((w) this.h.get(e)).a() >= hVar.e() || e == Da.v.p(this.h)) {
            w wVar = (w) this.h.get(e);
            return w.l(wVar, wVar.e().A(wVar.p(hVar), i, r0), false, 1, null);
        }
        int e2 = t.e(this.h, hVar.e());
        long a = W0.b.a();
        while (true) {
            aVar = W0.b;
            if (!W0.g(a, aVar.a()) || e > e2) {
                break;
            }
            w wVar2 = (w) this.h.get(e);
            a = w.l(wVar2, wVar2.e().A(wVar2.p(hVar), i, r0), false, 1, null);
            e++;
        }
        if (W0.g(a, aVar.a())) {
            return aVar.a();
        }
        long a2 = aVar.a();
        while (true) {
            aVar2 = W0.b;
            if (!W0.g(a2, aVar2.a()) || e > e2) {
                break;
            }
            w wVar3 = (w) this.h.get(e2);
            a2 = w.l(wVar3, wVar3.e().A(wVar3.p(hVar), i, r0), false, 1, null);
            e2--;
        }
        return W0.g(a2, aVar2.a()) ? a : X0.b(W0.n(a), W0.i(a2));
    }

    public final float E() {
        return this.d;
    }

    public final long F(int i) {
        L(i);
        w wVar = (w) this.h.get(i == e().length() ? Da.v.p(this.h) : t.b(this.h, i));
        return wVar.k(wVar.e().f(wVar.r(i)), false);
    }

    public final void G(v0.j0 j0Var, long j, C1 c1, l1.k kVar, x0.g gVar, int i) {
        j0Var.s();
        List list = this.h;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            w wVar = (w) list.get(i2);
            wVar.e().z(j0Var, j, c1, kVar, gVar, i);
            j0Var.d(0.0f, wVar.e().getHeight());
        }
        j0Var.k();
    }

    public final void I(v0.j0 j0Var, v0.h0 h0Var, float f, C1 c1, l1.k kVar, x0.g gVar, int i) {
        i1.b.a(this, j0Var, h0Var, f, c1, kVar, gVar, i);
    }

    public final void K(int i) {
        boolean z = false;
        if (i >= 0 && i < e().j().length()) {
            z = true;
        }
        if (z) {
            return;
        }
        g1.a.a("offset(" + i + ") is out of bounds [0, " + e().length() + ')');
    }

    public final void L(int i) {
        boolean z = false;
        if (i >= 0 && i <= e().j().length()) {
            z = true;
        }
        if (z) {
            return;
        }
        g1.a.a("offset(" + i + ") is out of bounds [0, " + e().length() + ']');
    }

    public final void M(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f) {
            z = true;
        }
        if (z) {
            return;
        }
        g1.a.a("lineIndex(" + i + ") is out of bounds [0, " + this.f + ')');
    }

    public final float[] c(long j, float[] fArr, int i) {
        K(W0.l(j));
        L(W0.k(j));
        kotlin.jvm.internal.M m = new kotlin.jvm.internal.M();
        m.a = i;
        t.f(this.h, j, new l(j, fArr, m, new kotlin.jvm.internal.L()));
        return fArr;
    }

    public final e e() {
        return this.a.g();
    }

    public final l1.i f(int i) {
        L(i);
        w wVar = (w) this.h.get(i == e().length() ? Da.v.p(this.h) : t.b(this.h, i));
        return wVar.e().v(wVar.r(i));
    }

    public final u0.h g(int i) {
        K(i);
        w wVar = (w) this.h.get(t.b(this.h, i));
        return wVar.i(wVar.e().x(wVar.r(i)));
    }

    public final u0.h h(int i) {
        L(i);
        w wVar = (w) this.h.get(i == e().length() ? Da.v.p(this.h) : t.b(this.h, i));
        return wVar.i(wVar.e().e(wVar.r(i)));
    }

    public final boolean i() {
        return this.c;
    }

    public final float j() {
        if (this.h.isEmpty()) {
            return 0.0f;
        }
        return ((w) this.h.get(0)).e().g();
    }

    public final float k() {
        return this.e;
    }

    public final float l(int i, boolean z) {
        L(i);
        w wVar = (w) this.h.get(i == e().length() ? Da.v.p(this.h) : t.b(this.h, i));
        return wVar.e().q(wVar.r(i), z);
    }

    public final q m() {
        return this.a;
    }

    public final float n() {
        if (this.h.isEmpty()) {
            return 0.0f;
        }
        w wVar = (w) Da.D.p0(this.h);
        return wVar.o(wVar.e().t());
    }

    public final float o(int i) {
        M(i);
        w wVar = (w) this.h.get(t.d(this.h, i));
        return wVar.o(wVar.e().w(wVar.s(i)));
    }

    public final int p() {
        return this.f;
    }

    public final int q(int i, boolean z) {
        M(i);
        w wVar = (w) this.h.get(t.d(this.h, i));
        return wVar.m(wVar.e().k(wVar.s(i), z));
    }

    public final int r(int i) {
        w wVar = (w) this.h.get(i >= e().length() ? Da.v.p(this.h) : i < 0 ? 0 : t.b(this.h, i));
        return wVar.n(wVar.e().u(wVar.r(i)));
    }

    public final int s(float f) {
        w wVar = (w) this.h.get(t.e(this.h, f));
        return wVar.d() == 0 ? wVar.g() : wVar.n(wVar.e().o(wVar.t(f)));
    }

    public final float t(int i) {
        M(i);
        w wVar = (w) this.h.get(t.d(this.h, i));
        return wVar.e().r(wVar.s(i));
    }

    public final float u(int i) {
        M(i);
        w wVar = (w) this.h.get(t.d(this.h, i));
        return wVar.e().m(wVar.s(i));
    }

    public final int v(int i) {
        M(i);
        w wVar = (w) this.h.get(t.d(this.h, i));
        return wVar.m(wVar.e().j(wVar.s(i)));
    }

    public final float w(int i) {
        M(i);
        w wVar = (w) this.h.get(t.d(this.h, i));
        return wVar.o(wVar.e().d(wVar.s(i)));
    }

    public final int x(long j) {
        w wVar = (w) this.h.get(t.e(this.h, Float.intBitsToFloat((int) (4294967295L & j))));
        return wVar.d() == 0 ? wVar.f() : wVar.m(wVar.e().i(wVar.q(j)));
    }

    public final l1.i y(int i) {
        L(i);
        w wVar = (w) this.h.get(i == e().length() ? Da.v.p(this.h) : t.b(this.h, i));
        return wVar.e().c(wVar.r(i));
    }

    public final List z() {
        return this.h;
    }

    public /* synthetic */ n(q qVar, long j, int i, boolean z, kotlin.jvm.internal.k kVar) {
        this(qVar, j, i, z);
    }

    public n(q qVar, long j, int i, int i2) {
        boolean z;
        int k;
        this.a = qVar;
        this.b = i;
        int i3 = 0;
        if (!(n1.b.n(j) == 0 && n1.b.m(j) == 0)) {
            g1.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List h = qVar.h();
        int size = h.size();
        int i4 = 0;
        float f = 0.0f;
        int i5 = 0;
        while (i5 < size) {
            x xVar = (x) h.get(i5);
            y b = xVar.b();
            int l = n1.b.l(j);
            if (n1.b.g(j)) {
                k = Wa.n.e(n1.b.k(j) - A.e(f), i3);
            } else {
                k = n1.b.k(j);
            }
            v d = A.d(b, n1.c.b(0, l, 0, k, 5, null), this.b - i4, i2);
            float height = f + d.getHeight();
            int l2 = i4 + d.l();
            arrayList.add(new w(d, xVar.c(), xVar.a(), i4, l2, f, height));
            if (d.n() || (l2 == this.b && i5 != Da.v.p(this.a.h()))) {
                i4 = l2;
                f = height;
                z = true;
                break;
            } else {
                i5++;
                i4 = l2;
                f = height;
                i3 = 0;
            }
        }
        z = false;
        this.e = f;
        this.f = i4;
        this.c = z;
        this.h = arrayList;
        this.d = n1.b.l(j);
        List arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            w wVar = (w) arrayList.get(i6);
            List y = wVar.e().y();
            ArrayList arrayList3 = new ArrayList(y.size());
            int size3 = y.size();
            for (int i7 = 0; i7 < size3; i7++) {
                u0.h hVar = (u0.h) y.get(i7);
                arrayList3.add(hVar != null ? wVar.i(hVar) : null);
            }
            Da.A.D(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.a.i().size()) {
            int size4 = this.a.i().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i8 = 0; i8 < size4; i8++) {
                arrayList4.add((Object) null);
            }
            arrayList2 = Da.D.v0(arrayList2, arrayList4);
        }
        this.g = arrayList2;
    }

    public n(q qVar, long j, int i, boolean z) {
        this(qVar, j, i, z ? l1.v.a.b() : l1.v.a.a(), (kotlin.jvm.internal.k) null);
    }
}
