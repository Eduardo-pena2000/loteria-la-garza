package O0;

import O0.J;
import v0.k1;
import v0.l1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class y extends e0 {
    public static final a Y = new a(null);
    public static final k1 Z;
    public final E0 W;
    public U X;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public final class b extends U {
        public b() {
            super(y.this);
        }

        public int A0(int i) {
            return L1().n1(i);
        }

        public int B0(int i) {
            return L1().j1(i);
        }

        public androidx.compose.ui.layout.q C0(long j) {
            U.c2(this, j);
            d0.c H0 = L1().H0();
            Object[] objArr = H0.a;
            int m = H0.m();
            for (int i = 0; i < m; i++) {
                V i0 = ((J) objArr[i]).i0();
                kotlin.jvm.internal.t.d(i0);
                i0.n2(J.g.c);
            }
            U.d2(this, L1().n0().measure-3p2s80s(this, L1().N(), j));
            return this;
        }

        public int J(int i) {
            return L1().i1(i);
        }

        public void k2() {
            V i0 = L1().i0();
            kotlin.jvm.internal.t.d(i0);
            i0.d2();
        }

        public int q0(int i) {
            return L1().m1(i);
        }

        public int y1(M0.a aVar) {
            Integer num = (Integer) e2().K().get(aVar);
            int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            g2().u(aVar, intValue);
            return intValue;
        }
    }

    static {
        k1 a2 = v0.Q.a();
        a2.p(v0.r0.b.h());
        a2.A(1.0f);
        a2.z(l1.a.b());
        Z = a2;
    }

    public y(J j) {
        super(j);
        this.W = new E0();
        N2().updateCoordinator$ui_release(this);
        this.X = j.j0() != null ? new b() : null;
    }

    public int A0(int i) {
        return L1().l1(i);
    }

    public int B0(int i) {
        return L1().h1(i);
    }

    public androidx.compose.ui.layout.q C0(long j) {
        if (E2()) {
            U I2 = I2();
            kotlin.jvm.internal.t.d(I2);
            j = I2.h2();
        }
        e0.p2(this, j);
        d0.c H0 = L1().H0();
        Object[] objArr = H0.a;
        int m = H0.m();
        for (int i = 0; i < m; i++) {
            ((J) objArr[i]).l0().p2(J.g.c);
        }
        t3(L1().n0().measure-3p2s80s(this, L1().O(), j));
        h3();
        return this;
    }

    public U I2() {
        return this.X;
    }

    public int J(int i) {
        return L1().g1(i);
    }

    /* renamed from: K3, reason: merged with bridge method [inline-methods] */
    public E0 N2() {
        return this.W;
    }

    public final void L3() {
        if (V1()) {
            return;
        }
        L1().l0().h2();
    }

    public void M3(U u) {
        this.X = u;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void X2(O0.e0.f r18, long r19, O0.w r21, int r22, boolean r23) {
        /*
            r17 = this;
            r0 = r17
            r8 = r19
            O0.J r1 = r17.L1()
            r10 = r18
            boolean r1 = r10.b(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L42
            boolean r1 = r0.J3(r8)
            if (r1 == 0) goto L1e
            r11 = r22
            r12 = r23
        L1c:
            r3 = r2
            goto L46
        L1e:
            I0.Q$a r1 = I0.Q.a
            int r1 = r1.d()
            r11 = r22
            boolean r1 = I0.Q.g(r11, r1)
            if (r1 == 0) goto L44
            long r4 = r17.J2()
            float r1 = r0.t2(r8, r4)
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            r4 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r4
            r4 = 2139095040(0x7f800000, float:Infinity)
            if (r1 >= r4) goto L44
            r12 = r3
            goto L1c
        L42:
            r11 = r22
        L44:
            r12 = r23
        L46:
            if (r3 == 0) goto L96
            int r13 = O0.w.e(r21)
            O0.J r1 = r17.L1()
            d0.c r1 = r1.G0()
            java.lang.Object[] r14 = r1.a
            int r1 = r1.m()
            int r1 = r1 - r2
            r15 = r1
        L5c:
            if (r15 < 0) goto L8d
            r1 = r14[r15]
            r16 = r1
            O0.J r16 = (O0.J) r16
            boolean r1 = r16.p()
            if (r1 == 0) goto L90
            r1 = r18
            r2 = r16
            r3 = r19
            r5 = r21
            r6 = r22
            r7 = r12
            r1.d(r2, r3, r5, r6, r7)
            boolean r1 = r21.o()
            if (r1 != 0) goto L7f
            goto L90
        L7f:
            O0.e0 r1 = r16.v0()
            boolean r1 = r1.x3()
            if (r1 == 0) goto L8d
            r21.a()
            goto L90
        L8d:
            r1 = r21
            goto L93
        L90:
            int r15 = r15 + (-1)
            goto L5c
        L93:
            O0.w.h(r1, r13)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.y.X2(O0.e0$f, long, O0.w, int, boolean):void");
    }

    public void Z0(long j, float f, Qa.l lVar) {
        super.Z0(j, f, lVar);
        L3();
    }

    public void d1(long j, float f, y0.c cVar) {
        super.d1(j, f, cVar);
        L3();
    }

    public void m3(v0.j0 j0Var, y0.c cVar) {
        p0 b2 = N.b(L1());
        d0.c G0 = L1().G0();
        Object[] objArr = G0.a;
        int m = G0.m();
        for (int i = 0; i < m; i++) {
            J j = (J) objArr[i];
            if (j.p()) {
                j.I(j0Var, cVar);
            }
        }
        if (b2.getShowLayoutBounds()) {
            v2(j0Var, Z);
        }
    }

    public int q0(int i) {
        return L1().k1(i);
    }

    public void x2() {
        if (I2() == null) {
            M3(new b());
        }
    }

    public int y1(M0.a aVar) {
        U I2 = I2();
        if (I2 != null) {
            return I2.y1(aVar);
        }
        Integer num = (Integer) C2().K().get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
