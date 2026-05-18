package N;

import P0.g1;
import Z0.W0;
import Z0.Y0;
import b0.C0;
import b0.U1;
import b0.d1;
import d1.u;
import v0.k1;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class y {
    public H a;
    public final d1 b;
    public final g1 c;
    public final f1.l d = new f1.l();
    public f1.c0 e;
    public final C0 f;
    public final C0 g;
    public M0.p h;
    public final C0 i;
    public Z0.e j;
    public final C0 k;
    public final C0 l;
    public final C0 m;
    public final C0 n;
    public final C0 o;
    public boolean p;
    public final C0 q;
    public final u r;
    public Qa.l s;
    public final Qa.l t;
    public final Qa.l u;
    public final k1 v;
    public long w;
    public final C0 x;
    public final C0 y;

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public a() {
            super(1);
        }

        public final void a(int i) {
            y.a(y.this).d(i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((f1.s) obj).p());
            return Ca.I.a;
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public b() {
            super(1);
        }

        public final void a(f1.U u) {
            String l = u.l();
            Z0.e w = y.this.w();
            if (!kotlin.jvm.internal.t.c(l, w != null ? w.j() : null)) {
                y.this.B(m.None);
            }
            y yVar = y.this;
            W0.a aVar = W0.b;
            yVar.I(aVar.a());
            y.this.A(aVar.a());
            y.b(y.this).invoke(u);
            y.this.o().invalidate();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((f1.U) obj);
            return Ca.I.a;
        }
    }

    public y(H h, d1 d1Var, g1 g1Var) {
        this.a = h;
        this.b = d1Var;
        this.c = g1Var;
        Boolean bool = Boolean.FALSE;
        this.f = U1.i(bool, null, 2, null);
        this.g = U1.i(n1.h.d(n1.h.g(0)), null, 2, null);
        this.i = U1.i(null, null, 2, null);
        this.k = U1.i(m.None, null, 2, null);
        this.l = U1.i(bool, null, 2, null);
        this.m = U1.i(bool, null, 2, null);
        this.n = U1.i(bool, null, 2, null);
        this.o = U1.i(bool, null, 2, null);
        this.p = true;
        this.q = U1.i(Boolean.TRUE, null, 2, null);
        this.r = new u(g1Var);
        this.s = c.a;
        this.t = new b();
        this.u = new a();
        this.v = v0.Q.a();
        this.w = r0.b.j();
        W0.a aVar = W0.b;
        this.x = U1.i(W0.b(aVar.a()), null, 2, null);
        this.y = U1.i(W0.b(aVar.a()), null, 2, null);
    }

    public static final /* synthetic */ u a(y yVar) {
        return yVar.r;
    }

    public static final /* synthetic */ Qa.l b(y yVar) {
        return yVar.s;
    }

    public final void A(long j) {
        this.y.setValue(W0.b(j));
    }

    public final void B(m mVar) {
        this.k.setValue(mVar);
    }

    public final void C(boolean z) {
        this.f.setValue(Boolean.valueOf(z));
    }

    public final void D(boolean z) {
        this.q.setValue(Boolean.valueOf(z));
    }

    public final void E(f1.c0 c0Var) {
        this.e = c0Var;
    }

    public final void F(M0.p pVar) {
        this.h = pVar;
    }

    public final void G(Z z) {
        this.i.setValue(z);
        this.p = false;
    }

    public final void H(float f) {
        this.g.setValue(n1.h.d(f));
    }

    public final void I(long j) {
        this.x.setValue(W0.b(j));
    }

    public final void J(boolean z) {
        this.o.setValue(Boolean.valueOf(z));
    }

    public final void K(boolean z) {
        this.l.setValue(Boolean.valueOf(z));
    }

    public final void L(boolean z) {
        this.n.setValue(Boolean.valueOf(z));
    }

    public final void M(boolean z) {
        this.m.setValue(Boolean.valueOf(z));
    }

    public final void N(Z0.e eVar, Z0.e eVar2, Y0 y0, boolean z, n1.d dVar, u.b bVar, Qa.l lVar, w wVar, t0.i iVar, long j) {
        this.s = lVar;
        this.w = j;
        u uVar = this.r;
        uVar.f(wVar);
        uVar.e(iVar);
        this.j = eVar;
        H c2 = I.c(this.a, eVar2, y0, dVar, bVar, z, 0, 0, 0, Da.v.n(), 448, null);
        if (this.a != c2) {
            this.p = true;
        }
        this.a = c2;
    }

    public final long c() {
        return ((W0) this.y.getValue()).r();
    }

    public final m d() {
        return (m) this.k.getValue();
    }

    public final boolean e() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final k1 f() {
        return this.v;
    }

    public final f1.c0 g() {
        return this.e;
    }

    public final g1 h() {
        return this.c;
    }

    public final M0.p i() {
        M0.p pVar = this.h;
        if (pVar == null || !pVar.g()) {
            return null;
        }
        return pVar;
    }

    public final Z j() {
        return (Z) this.i.getValue();
    }

    public final float k() {
        return ((n1.h) this.g.getValue()).m();
    }

    public final Qa.l l() {
        return this.u;
    }

    public final Qa.l m() {
        return this.t;
    }

    public final f1.l n() {
        return this.d;
    }

    public final d1 o() {
        return this.b;
    }

    public final long p() {
        return this.w;
    }

    public final long q() {
        return ((W0) this.x.getValue()).r();
    }

    public final boolean r() {
        return ((Boolean) this.o.getValue()).booleanValue();
    }

    public final boolean s() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final boolean t() {
        return ((Boolean) this.n.getValue()).booleanValue();
    }

    public final boolean u() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final H v() {
        return this.a;
    }

    public final Z0.e w() {
        return this.j;
    }

    public final boolean x() {
        return (W0.h(q()) && W0.h(c())) ? false : true;
    }

    public final boolean y() {
        return ((Boolean) this.q.getValue()).booleanValue();
    }

    public final boolean z() {
        return this.p;
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.l {
        public static final c a = new c();

        public c() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((f1.U) obj);
            return Ca.I.a;
        }

        public final void a(f1.U u) {
        }
    }
}
