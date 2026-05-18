package y0;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import java.util.Locale;
import u0.f;
import v0.i1;
import v0.j0;
import v0.k1;
import v0.m1;
import v0.q0;
import v0.r0;
import v0.u1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c {
    public static final F A;
    public static final a y = new a(null);
    public static final boolean z;
    public final d a;
    public Outline f;
    public long h;
    public long i;
    public float j;
    public i1 k;
    public m1 l;
    public m1 m;
    public boolean n;
    public x0.a o;
    public k1 p;
    public int q;
    public final y0.a r;
    public boolean s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public RectF x;
    public n1.d b = x0.e.a();
    public n1.t c = n1.t.a;
    public Qa.l d = c.a;
    public final Qa.l e = new b();
    public boolean g = true;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public b() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((x0.f) obj);
            return Ca.I.a;
        }

        public final void invoke(x0.f fVar) {
            m1 b = c.b(c.this);
            if (!c.c(c.this) || !c.this.l() || b == null) {
                c.a(c.this, fVar);
                return;
            }
            c cVar = c.this;
            int b2 = q0.a.b();
            x0.d m1 = fVar.m1();
            long e = m1.e();
            m1.f().s();
            try {
                m1.d().b(b, b2);
                c.a(cVar, fVar);
            } finally {
                m1.f().k();
                m1.g(e);
            }
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.l {
        public static final c a = new c();

        public c() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((x0.f) obj);
            return Ca.I.a;
        }

        public final void invoke(x0.f fVar) {
        }
    }

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.t.f(lowerCase, "toLowerCase(...)");
        boolean c2 = kotlin.jvm.internal.t.c(lowerCase, "robolectric");
        z = c2;
        A = c2 ? G.a : Build.VERSION.SDK_INT >= 28 ? I.a : Q.a.a() ? H.a : G.a;
    }

    public c(d dVar) {
        this.a = dVar;
        f.a aVar = u0.f.b;
        this.h = aVar.c();
        this.i = u0.l.b.a();
        this.r = new y0.a();
        dVar.n(false);
        this.t = n1.n.b.b();
        this.u = n1.r.b.a();
        this.v = aVar.b();
    }

    public static final /* synthetic */ void a(c cVar, x0.f fVar) {
        cVar.i(fVar);
    }

    public static final /* synthetic */ m1 b(c cVar) {
        return cVar.l;
    }

    public static final /* synthetic */ boolean c(c cVar) {
        return cVar.n;
    }

    public final boolean A() {
        return this.s;
    }

    public final Outline B() {
        Outline outline = this.f;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.f = outline2;
        return outline2;
    }

    public final RectF C() {
        RectF rectF = this.x;
        if (rectF != null) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        this.x = rectF2;
        return rectF2;
    }

    public final void D() {
        this.q++;
    }

    public final void E() {
        this.q--;
        f();
    }

    public final void F(n1.d dVar, n1.t tVar, long j, Qa.l lVar) {
        d0(j);
        this.b = dVar;
        this.c = tVar;
        this.d = lVar;
        this.a.L(true);
        G();
    }

    public final void G() {
        this.a.I(this.b, this.c, this, this.e);
    }

    public final void H() {
        if (this.a.z()) {
            return;
        }
        try {
            G();
        } catch (Throwable unused) {
        }
    }

    public final void I() {
        if (this.s) {
            return;
        }
        this.s = true;
        f();
    }

    public final void J() {
        this.k = null;
        this.l = null;
        this.i = u0.l.b.a();
        this.h = u0.f.b.c();
        this.j = 0.0f;
        this.g = true;
        this.n = false;
    }

    public final void K(float f) {
        if (this.a.a() == f) {
            return;
        }
        this.a.d(f);
    }

    public final void L(long j) {
        if (r0.s(j, this.a.A())) {
            return;
        }
        this.a.k(j);
    }

    public final void M(int i) {
        if (androidx.compose.ui.graphics.c.G(this.a.j(), i)) {
            return;
        }
        this.a.b(i);
    }

    public final void N(float f) {
        if (this.a.m() == f) {
            return;
        }
        this.a.r(f);
    }

    public final void O(boolean z2) {
        if (this.w != z2) {
            this.w = z2;
            this.g = true;
            e();
        }
    }

    public final void P(androidx.compose.ui.graphics.d dVar) {
        if (kotlin.jvm.internal.t.c(this.a.g(), dVar)) {
            return;
        }
        this.a.c(dVar);
    }

    public final void Q(int i) {
        if (y0.b.e(this.a.q(), i)) {
            return;
        }
        this.a.P(i);
    }

    public final void R(m1 m1Var) {
        J();
        this.l = m1Var;
        e();
    }

    public final void S(long j) {
        if (u0.f.j(this.v, j)) {
            return;
        }
        this.v = j;
        this.a.N(j);
    }

    public final void T(long j, long j2) {
        this.a.x(n1.n.k(j), n1.n.l(j), j2);
    }

    public final void U(long j, long j2) {
        Z(j, j2, 0.0f);
    }

    public final void V(u1 u1Var) {
        if (kotlin.jvm.internal.t.c(this.a.e(), u1Var)) {
            return;
        }
        this.a.D(u1Var);
    }

    public final void W(float f) {
        if (this.a.F() == f) {
            return;
        }
        this.a.s(f);
    }

    public final void X(float f) {
        if (this.a.h() == f) {
            return;
        }
        this.a.t(f);
    }

    public final void Y(float f) {
        if (this.a.i() == f) {
            return;
        }
        this.a.w(f);
    }

    public final void Z(long j, long j2, float f) {
        if (u0.f.j(this.h, j) && u0.l.f(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        J();
        this.h = j;
        this.i = j2;
        this.j = f;
        e();
    }

    public final void a0(float f) {
        if (this.a.u() == f) {
            return;
        }
        this.a.l(f);
    }

    public final void b0(float f) {
        if (this.a.H() == f) {
            return;
        }
        this.a.y(f);
    }

    public final void c0(float f) {
        if (this.a.Q() == f) {
            return;
        }
        this.a.v(f);
        this.g = true;
        e();
    }

    public final void d(c cVar) {
        if (this.r.i(cVar)) {
            cVar.D();
        }
    }

    public final void d0(long j) {
        if (n1.r.e(this.u, j)) {
            return;
        }
        this.u = j;
        T(this.t, j);
        if (this.i == 9205357640488583168L) {
            this.g = true;
            e();
        }
    }

    public final void e() {
        if (this.g) {
            Outline outline = null;
            if (this.w || v() > 0.0f) {
                m1 m1Var = this.l;
                if (m1Var != null) {
                    RectF C = C();
                    if (!(m1Var instanceof v0.S)) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((v0.S) m1Var).x().computeBounds(C, false);
                    Outline j0 = j0(m1Var);
                    if (j0 != null) {
                        j0.setAlpha(j());
                        outline = j0;
                    }
                    this.a.M(outline, n1.r.c((4294967295L & Math.round(C.height())) | (Math.round(C.width()) << 32)));
                    if (this.n && this.w) {
                        this.a.n(false);
                        this.a.p();
                    } else {
                        this.a.n(this.w);
                    }
                } else {
                    this.a.n(this.w);
                    u0.l.b.b();
                    Outline B = B();
                    long d = n1.s.d(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    long j3 = j2 == 9205357640488583168L ? d : j2;
                    int i = (int) (j >> 32);
                    int i2 = (int) (j & 4294967295L);
                    B.setRoundRect(Math.round(Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j3 >> 32))), Math.round(Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (4294967295L & j3))), this.j);
                    B.setAlpha(j());
                    this.a.M(B, n1.s.c(j3));
                }
            } else {
                this.a.n(false);
                this.a.M(null, n1.r.b.a());
            }
        }
        this.g = false;
    }

    public final void e0(long j) {
        if (r0.s(j, this.a.B())) {
            return;
        }
        this.a.o(j);
    }

    public final void f() {
        if (this.s && this.q == 0) {
            g();
        }
    }

    public final void f0(long j) {
        if (n1.n.j(this.t, j)) {
            return;
        }
        this.t = j;
        T(j, this.u);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r15 = this;
            y0.a r0 = r15.r
            y0.c r1 = y0.a.b(r0)
            if (r1 == 0) goto Lf
            r1.E()
            r1 = 0
            y0.a.e(r0, r1)
        Lf:
            w.Q r0 = y0.a.a(r0)
            if (r0 == 0) goto L5d
            java.lang.Object[] r1 = r0.b
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5a
            r4 = 0
            r5 = r4
        L20:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L55
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L3a:
            if (r10 >= r8) goto L53
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L4f
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            y0.c r11 = (y0.c) r11
            r11.E()
        L4f:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L3a
        L53:
            if (r8 != r9) goto L5a
        L55:
            if (r5 == r3) goto L5a
            int r5 = r5 + 1
            goto L20
        L5a:
            r0.m()
        L5d:
            y0.d r0 = r15.a
            r0.p()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.c.g():void");
    }

    public final void g0(float f) {
        if (this.a.E() == f) {
            return;
        }
        this.a.G(f);
    }

    public final void h(j0 j0Var, c cVar) {
        Canvas canvas;
        boolean z2;
        if (this.s) {
            return;
        }
        e();
        H();
        boolean z3 = v() > 0.0f;
        if (z3) {
            j0Var.o();
        }
        Canvas d = v0.E.d(j0Var);
        boolean isHardwareAccelerated = d.isHardwareAccelerated();
        if (!isHardwareAccelerated) {
            i0(d);
        }
        boolean z4 = !isHardwareAccelerated && this.w;
        if (z4) {
            j0Var.s();
            i1 o = o();
            if (o instanceof i1.b) {
                j0.x(j0Var, ((i1.b) o).a(), 0, 2, null);
            } else if (o instanceof i1.c) {
                m1 m1Var = this.m;
                if (m1Var != null) {
                    m1Var.l();
                } else {
                    m1Var = v0.V.a();
                    this.m = m1Var;
                }
                m1.h(m1Var, ((i1.c) o).b(), null, 2, null);
                j0.l(j0Var, m1Var, 0, 2, null);
            } else {
                if (!(o instanceof i1.a)) {
                    throw new Ca.o();
                }
                j0.l(j0Var, ((i1.a) o).b(), 0, 2, null);
            }
        }
        if (cVar != null) {
            cVar.d(this);
        }
        if (v0.E.d(j0Var).isHardwareAccelerated() || this.a.K()) {
            canvas = d;
            z2 = isHardwareAccelerated;
            this.a.O(j0Var);
        } else {
            x0.a aVar = this.o;
            if (aVar == null) {
                aVar = new x0.a();
                this.o = aVar;
            }
            x0.a aVar2 = aVar;
            n1.d dVar = this.b;
            n1.t tVar = this.c;
            long d2 = n1.s.d(this.u);
            n1.d density = aVar2.m1().getDensity();
            n1.t layoutDirection = aVar2.m1().getLayoutDirection();
            j0 f = aVar2.m1().f();
            long e = aVar2.m1().e();
            canvas = d;
            c h = aVar2.m1().h();
            z2 = isHardwareAccelerated;
            x0.d m1 = aVar2.m1();
            m1.b(dVar);
            m1.a(tVar);
            m1.c(j0Var);
            m1.g(d2);
            m1.i(this);
            j0Var.s();
            try {
                i(aVar2);
            } finally {
                j0Var.k();
                x0.d m12 = aVar2.m1();
                m12.b(density);
                m12.a(layoutDirection);
                m12.c(f);
                m12.g(e);
                m12.i(h);
            }
        }
        if (z4) {
            j0Var.k();
        }
        if (z3) {
            j0Var.t();
        }
        if (z2) {
            return;
        }
        canvas.restore();
    }

    public final void h0(float f) {
        if (this.a.C() == f) {
            return;
        }
        this.a.f(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(x0.f r15) {
        /*
            r14 = this;
            y0.a r0 = r14.r
            y0.c r1 = y0.a.b(r0)
            y0.a.g(r0, r1)
            w.Q r1 = y0.a.a(r0)
            if (r1 == 0) goto L28
            boolean r2 = r1.e()
            if (r2 == 0) goto L28
            w.Q r2 = y0.a.c(r0)
            if (r2 != 0) goto L22
            w.Q r2 = w.f0.b()
            y0.a.f(r0, r2)
        L22:
            r2.j(r1)
            r1.m()
        L28:
            r1 = 1
            y0.a.h(r0, r1)
            Qa.l r1 = r14.d
            r1.invoke(r15)
            r15 = 0
            y0.a.h(r0, r15)
            y0.c r1 = y0.a.d(r0)
            if (r1 == 0) goto L3e
            r1.E()
        L3e:
            w.Q r0 = y0.a.c(r0)
            if (r0 == 0) goto L91
            boolean r1 = r0.e()
            if (r1 == 0) goto L91
            java.lang.Object[] r1 = r0.b
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L8e
            r4 = r15
        L54:
            r5 = r2[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L89
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r15
        L6e:
            if (r9 >= r7) goto L87
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L83
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            y0.c r10 = (y0.c) r10
            r10.E()
        L83:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L6e
        L87:
            if (r7 != r8) goto L8e
        L89:
            if (r4 == r3) goto L8e
            int r4 = r4 + 1
            goto L54
        L8e:
            r0.m()
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.c.i(x0.f):void");
    }

    public final void i0(Canvas canvas) {
        float k = n1.n.k(this.t);
        float l = n1.n.l(this.t);
        float k2 = n1.n.k(this.t) + ((int) (this.u >> 32));
        float l2 = n1.n.l(this.t) + ((int) (this.u & 4294967295L));
        float j = j();
        androidx.compose.ui.graphics.d m = m();
        int k3 = k();
        if (j < 1.0f || !androidx.compose.ui.graphics.c.G(k3, androidx.compose.ui.graphics.c.b.B()) || m != null || y0.b.e(n(), y0.b.a.c())) {
            k1 k1Var = this.p;
            if (k1Var == null) {
                k1Var = v0.Q.a();
                this.p = k1Var;
            }
            k1Var.d(j);
            k1Var.b(k3);
            k1Var.c(m);
            canvas.saveLayer(k, l, k2, l2, k1Var.t());
        } else {
            canvas.save();
        }
        canvas.translate(k, l);
        canvas.concat(this.a.J());
    }

    public final float j() {
        return this.a.a();
    }

    public final Outline j0(m1 m1Var) {
        Outline outline;
        int i = Build.VERSION.SDK_INT;
        if (i > 28 || m1Var.c()) {
            Outline B = B();
            if (i >= 30) {
                L.a.a(B, m1Var);
            } else {
                if (!(m1Var instanceof v0.S)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                B.setConvexPath(((v0.S) m1Var).x());
            }
            this.n = !B.canClip();
            outline = B;
        } else {
            Outline outline2 = this.f;
            if (outline2 != null) {
                outline2.setEmpty();
            }
            this.n = true;
            this.a.L(true);
            outline = null;
        }
        this.l = m1Var;
        return outline;
    }

    public final int k() {
        return this.a.j();
    }

    public final boolean l() {
        return this.w;
    }

    public final androidx.compose.ui.graphics.d m() {
        return this.a.g();
    }

    public final int n() {
        return this.a.q();
    }

    public final i1 o() {
        i1 bVar;
        i1 i1Var = this.k;
        m1 m1Var = this.l;
        if (i1Var != null) {
            return i1Var;
        }
        if (m1Var != null) {
            i1.a aVar = new i1.a(m1Var);
            this.k = aVar;
            return aVar;
        }
        long d = n1.s.d(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            d = j2;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (d >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = intBitsToFloat2 + Float.intBitsToFloat((int) (d & 4294967295L));
        if (this.j > 0.0f) {
            bVar = new i1.c(u0.k.c(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, u0.a.b((Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0)))));
        } else {
            bVar = new i1.b(new u0.h(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.k = bVar;
        return bVar;
    }

    public final long p() {
        return this.v;
    }

    public final float q() {
        return this.a.F();
    }

    public final float r() {
        return this.a.h();
    }

    public final float s() {
        return this.a.i();
    }

    public final float t() {
        return this.a.u();
    }

    public final float u() {
        return this.a.H();
    }

    public final float v() {
        return this.a.Q();
    }

    public final long w() {
        return this.u;
    }

    public final long x() {
        return this.t;
    }

    public final float y() {
        return this.a.E();
    }

    public final float z() {
        return this.a.C();
    }
}
