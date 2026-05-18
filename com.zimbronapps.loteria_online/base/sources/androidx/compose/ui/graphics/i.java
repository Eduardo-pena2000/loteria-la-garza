package androidx.compose.ui.graphics;

import Ca.I;
import M0.A;
import M0.C;
import O0.A0;
import O0.E;
import O0.e0;
import O0.g0;
import Qa.l;
import W0.D;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.u;
import v0.E1;
import v0.r0;
import v0.u1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i extends e.c implements E, A0 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public long k;
    public E1 l;
    public boolean m;
    public u1 n;
    public long o;
    public long p;
    public int q;
    public int r;
    public d s;
    public final boolean t;
    public l u;

    public static final class a extends u implements l {
        public a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((g) obj);
            return I.a;
        }

        public final void invoke(g gVar) {
            gVar.l(i.this.u());
            gVar.y(i.this.H());
            gVar.d(i.this.F1());
            gVar.G(i.this.E());
            gVar.f(i.this.C());
            gVar.v(i.this.M1());
            gVar.s(i.this.F());
            gVar.t(i.this.h());
            gVar.w(i.this.i());
            gVar.r(i.this.m());
            gVar.t0(i.this.r0());
            gVar.i1(i.this.N1());
            gVar.n(i.this.I1());
            gVar.D(i.this.L1());
            gVar.k(i.this.G1());
            gVar.o(i.this.O1());
            gVar.V(i.this.K1());
            gVar.b(i.this.H1());
            gVar.c(i.this.J1());
        }
    }

    public static final class b extends u implements l {
        public final /* synthetic */ q a;
        public final /* synthetic */ i b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q qVar, i iVar) {
            super(1);
            this.a = qVar;
            this.b = iVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return I.a;
        }

        public final void invoke(q.a aVar) {
            q.a.A0(aVar, this.a, 0, 0, 0.0f, i.E1(this.b), 4, null);
        }
    }

    public /* synthetic */ i(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, E1 e1, boolean z, u1 u1Var, long j2, long j3, int i, int i2, d dVar, k kVar) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, e1, z, u1Var, j2, j3, i, i2, dVar);
    }

    public static final /* synthetic */ l E1(i iVar) {
        return iVar.u;
    }

    public final float C() {
        return this.e;
    }

    public final void D(u1 u1Var) {
        this.n = u1Var;
    }

    public final float E() {
        return this.d;
    }

    public final float F() {
        return this.g;
    }

    public final float F1() {
        return this.c;
    }

    public final void G(float f) {
        this.d = f;
    }

    public final long G1() {
        return this.o;
    }

    public final float H() {
        return this.b;
    }

    public final int H1() {
        return this.r;
    }

    public final boolean I1() {
        return this.m;
    }

    public final d J1() {
        return this.s;
    }

    public final int K1() {
        return this.q;
    }

    public final u1 L1() {
        return this.n;
    }

    public final float M1() {
        return this.f;
    }

    public final E1 N1() {
        return this.l;
    }

    public final long O1() {
        return this.p;
    }

    public final void P1() {
        e0 O2 = O0.k.i(this, g0.a(2)).O2();
        if (O2 != null) {
            O2.F3(this.u, true);
        }
    }

    public final void V(int i) {
        this.q = i;
    }

    public final void b(int i) {
        this.r = i;
    }

    public final void c(d dVar) {
        this.s = dVar;
    }

    public final void d(float f) {
        this.c = f;
    }

    public final void f(float f) {
        this.e = f;
    }

    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final float h() {
        return this.h;
    }

    public final float i() {
        return this.i;
    }

    public final void i1(E1 e1) {
        this.l = e1;
    }

    public final void k(long j) {
        this.o = j;
    }

    public final void l(float f) {
        this.a = f;
    }

    public final float m() {
        return this.j;
    }

    public C measure-3p2s80s(androidx.compose.ui.layout.l lVar, A a2, long j) {
        q C0 = a2.C0(j);
        return androidx.compose.ui.layout.l.O0(lVar, C0.W0(), C0.P0(), null, new b(C0, this), 4, null);
    }

    public final void n(boolean z) {
        this.m = z;
    }

    public final void o(long j) {
        this.p = j;
    }

    public final void r(float f) {
        this.j = f;
    }

    public final long r0() {
        return this.k;
    }

    public final void s(float f) {
        this.g = f;
    }

    public final void t(float f) {
        this.h = f;
    }

    public final void t0(long j) {
        this.k = j;
    }

    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.a + ", scaleY=" + this.b + ", alpha = " + this.c + ", translationX=" + this.d + ", translationY=" + this.e + ", shadowElevation=" + this.f + ", rotationX=" + this.g + ", rotationY=" + this.h + ", rotationZ=" + this.i + ", cameraDistance=" + this.j + ", transformOrigin=" + j.i(this.k) + ", shape=" + this.l + ", clip=" + this.m + ", renderEffect=" + this.n + ", ambientShadowColor=" + r0.z(this.o) + ", spotShadowColor=" + r0.z(this.p) + ", compositingStrategy=" + e.i(this.q) + ", blendMode=" + c.I(this.r) + ", colorFilter=" + this.s + ')';
    }

    public final float u() {
        return this.a;
    }

    public final void v(float f) {
        this.f = f;
    }

    public final void w(float f) {
        this.i = f;
    }

    public final void y(float f) {
        this.b = f;
    }

    public boolean z() {
        return this.t;
    }

    public i(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, E1 e1, boolean z, u1 u1Var, long j2, long j3, int i, int i2, d dVar) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = f9;
        this.j = f10;
        this.k = j;
        this.l = e1;
        this.m = z;
        this.n = u1Var;
        this.o = j2;
        this.p = j3;
        this.q = i;
        this.r = i2;
        this.s = dVar;
        this.u = new a();
    }

    public void g1(D d) {
    }
}
