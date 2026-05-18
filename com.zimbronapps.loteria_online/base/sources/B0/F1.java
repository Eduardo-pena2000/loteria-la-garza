package b0;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f1 implements B1, d1 {
    public static final a h = new a(null);
    public static final int i = 8;
    public h1 a;
    public int b;
    public b c;
    public Qa.p d;
    public int e;
    public w.K f;
    public w.P g;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final void a(H1 h1, List list, h1 h1Var) {
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object W0 = h1.W0((b) list.get(i), 0);
                f1 f1Var = W0 instanceof f1 ? (f1) W0 : null;
                if (f1Var != null) {
                    f1Var.c(h1Var);
                }
            }
        }

        public a() {
        }
    }

    public f1(h1 h1Var) {
        this.a = h1Var;
    }

    public static /* synthetic */ Ca.I b(f1 f1Var, int i2, w.K k, x xVar) {
        return g(f1Var, i2, k, xVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final Ca.I g(b0.f1 r17, int r18, w.K r19, b0.x r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r0.e
            if (r4 != r1) goto L84
            w.K r4 = r0.f
            boolean r4 = kotlin.jvm.internal.t.c(r2, r4)
            if (r4 == 0) goto L84
            boolean r4 = r3 instanceof b0.B
            if (r4 == 0) goto L84
            long[] r4 = r2.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L84
            r7 = 0
        L20:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L7f
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L3a:
            if (r12 >= r10) goto L7c
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L76
            int r13 = r7 << 3
            int r13 = r13 + r12
            java.lang.Object[] r14 = r2.b
            r14 = r14[r13]
            int[] r15 = r2.c
            r15 = r15[r13]
            if (r15 == r1) goto L54
            r15 = 1
            goto L55
        L54:
            r15 = 0
        L55:
            if (r15 == 0) goto L6e
            r6 = r3
            b0.B r6 = (b0.B) r6
            r6.W(r14, r0)
            boolean r11 = r14 instanceof b0.U
            if (r11 == 0) goto L6e
            r11 = r14
            b0.U r11 = (b0.U) r11
            r6.V(r11)
            w.P r6 = r0.g
            if (r6 == 0) goto L6e
            r6.u(r14)
        L6e:
            if (r15 == 0) goto L73
            r2.s(r13)
        L73:
            r6 = 8
            goto L77
        L76:
            r6 = r11
        L77:
            long r8 = r8 >> r6
            int r12 = r12 + 1
            r11 = r6
            goto L3a
        L7c:
            r6 = r11
            if (r10 != r6) goto L84
        L7f:
            if (r7 == r5) goto L84
            int r7 = r7 + 1
            goto L20
        L84:
            Ca.I r0 = Ca.I.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.f1.g(b0.f1, int, w.K, b0.x):Ca.I");
    }

    public final void A() {
        h1 h1Var = this.a;
        if (h1Var != null) {
            h1Var.m(this);
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B() {
        /*
            r17 = this;
            r1 = r17
            b0.h1 r0 = r1.a
            if (r0 == 0) goto L60
            w.K r2 = r1.f
            if (r2 == 0) goto L60
            r3 = 1
            r1.J(r3)
            r3 = 0
            java.lang.Object[] r4 = r2.b     // Catch: java.lang.Throwable -> L4b
            int[] r5 = r2.c     // Catch: java.lang.Throwable -> L4b
            long[] r2 = r2.a     // Catch: java.lang.Throwable -> L4b
            int r6 = r2.length     // Catch: java.lang.Throwable -> L4b
            int r6 = r6 + (-2)
            if (r6 < 0) goto L58
            r7 = r3
        L1b:
            r8 = r2[r7]     // Catch: java.lang.Throwable -> L4b
            long r10 = ~r8     // Catch: java.lang.Throwable -> L4b
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L53
            int r10 = r7 - r6
            int r10 = ~r10     // Catch: java.lang.Throwable -> L4b
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r3
        L35:
            if (r12 >= r10) goto L51
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4d
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r4[r13]     // Catch: java.lang.Throwable -> L4b
            r13 = r5[r13]     // Catch: java.lang.Throwable -> L4b
            r0.b(r14)     // Catch: java.lang.Throwable -> L4b
            goto L4d
        L4b:
            r0 = move-exception
            goto L5c
        L4d:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L35
        L51:
            if (r10 != r11) goto L58
        L53:
            if (r7 == r6) goto L58
            int r7 = r7 + 1
            goto L1b
        L58:
            r1.J(r3)
            goto L60
        L5c:
            r1.J(r3)
            throw r0
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.f1.B():void");
    }

    public final void C() {
        if (r()) {
            return;
        }
        N(true);
    }

    public final void D(b bVar) {
        this.c = bVar;
    }

    public final void E(boolean z) {
        int i2 = this.b;
        this.b = z ? i2 | 2 : i2 & (-3);
    }

    public final void F(boolean z) {
        int i2 = this.b;
        this.b = z ? i2 | 4 : i2 & (-5);
    }

    public final void G(boolean z) {
        int i2 = this.b;
        this.b = z ? i2 | 64 : i2 & (-65);
    }

    public final void H(boolean z) {
        int i2 = this.b;
        this.b = z ? i2 | 256 : i2 & (-257);
    }

    public final void I(boolean z) {
        int i2 = this.b;
        this.b = z ? i2 | 8 : i2 & (-9);
    }

    public final void J(boolean z) {
        int i2 = this.b;
        this.b = z ? i2 | 32 : i2 & (-33);
    }

    public final void K(boolean z) {
        int i2 = this.b;
        this.b = z ? i2 | 1024 : i2 & (-1025);
    }

    public final void L(boolean z) {
        int i2 = this.b;
        this.b = z ? i2 | 512 : i2 & (-513);
    }

    public final void M(boolean z) {
        int i2 = this.b;
        this.b = z ? i2 | 128 : i2 & (-129);
    }

    public final void N(boolean z) {
        int i2 = this.b;
        this.b = z ? i2 | 16 : i2 & (-17);
    }

    public final void O(boolean z) {
        int i2 = this.b;
        this.b = z ? i2 | 1 : i2 & (-2);
    }

    public final void P(int i2) {
        this.e = i2;
        N(false);
    }

    public void a(Qa.p pVar) {
        this.d = pVar;
    }

    public final void c(h1 h1Var) {
        this.a = h1Var;
    }

    public final boolean d(U u, w.P p) {
        kotlin.jvm.internal.t.e(u, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        T1 d = u.d();
        if (d == null) {
            d = U1.q();
        }
        return !d.b(u.z().a(), p.e(u));
    }

    public final void e(m mVar) {
        Qa.p pVar = this.d;
        if (pVar == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
        pVar.invoke(mVar, 1);
    }

    public final Qa.l f(int i2) {
        w.K k = this.f;
        if (k == null || s()) {
            return null;
        }
        Object[] objArr = k.b;
        int[] iArr = k.c;
        long[] jArr = k.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j) < 128) {
                        int i6 = (i3 << 3) + i5;
                        Object obj = objArr[i6];
                        if (iArr[i6] != i2) {
                            return new e1(this, i2, k);
                        }
                    }
                    j >>= 8;
                }
                if (i4 != 8) {
                    return null;
                }
            }
            if (i3 == length) {
                return null;
            }
            i3++;
        }
    }

    public final b h() {
        return this.c;
    }

    public final boolean i() {
        return this.d != null;
    }

    public void invalidate() {
        h1 h1Var = this.a;
        if (h1Var != null) {
            h1Var.a(this, null);
        }
    }

    public final boolean j() {
        return (this.b & 2) != 0;
    }

    public final boolean k() {
        return (this.b & 4) != 0;
    }

    public final boolean l() {
        return (this.b & 64) != 0;
    }

    public final boolean m() {
        return (this.b & 256) != 0;
    }

    public final boolean n() {
        return (this.b & 8) != 0;
    }

    public final boolean o() {
        return (this.b & 32) != 0;
    }

    public final boolean p() {
        return (this.b & 1024) != 0;
    }

    public final boolean q() {
        return (this.b & 512) != 0;
    }

    public final boolean r() {
        return (this.b & 128) != 0;
    }

    public final boolean s() {
        return (this.b & 16) != 0;
    }

    public final boolean t() {
        return (this.b & 1) != 0;
    }

    public final boolean u() {
        if (this.a == null) {
            return false;
        }
        b bVar = this.c;
        return bVar != null ? bVar.b() : false;
    }

    public final l0 v(Object obj) {
        l0 a2;
        h1 h1Var = this.a;
        return (h1Var == null || (a2 = h1Var.a(this, obj)) == null) ? l0.a : a2;
    }

    public final boolean w() {
        return this.g != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean x(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != 0) goto L8
            return r2
        L8:
            w.P r3 = r0.g
            if (r3 != 0) goto Ld
            return r2
        Ld:
            boolean r4 = r1 instanceof b0.U
            if (r4 == 0) goto L18
            b0.U r1 = (b0.U) r1
            boolean r2 = r0.d(r1, r3)
            goto L72
        L18:
            boolean r4 = r1 instanceof w.e0
            if (r4 == 0) goto L72
            w.e0 r1 = (w.e0) r1
            boolean r4 = r1.e()
            r5 = 0
            if (r4 == 0) goto L71
            java.lang.Object[] r4 = r1.b
            long[] r1 = r1.a
            int r6 = r1.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L71
            r7 = r5
        L2f:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L6c
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r5
        L49:
            if (r12 >= r10) goto L6a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L66
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            boolean r14 = r13 instanceof b0.U
            if (r14 == 0) goto L72
            b0.U r13 = (b0.U) r13
            boolean r13 = r0.d(r13, r3)
            if (r13 == 0) goto L66
            goto L72
        L66:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L49
        L6a:
            if (r10 != r11) goto L71
        L6c:
            if (r7 == r6) goto L71
            int r7 = r7 + 1
            goto L2f
        L71:
            r2 = r5
        L72:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.f1.x(java.lang.Object):boolean");
    }

    public final void y(U u, Object obj) {
        w.P p = this.g;
        if (p == null) {
            p = new w.P(0, 1, null);
            this.g = p;
        }
        p.x(u, obj);
    }

    public final boolean z(Object obj) {
        if (o()) {
            return false;
        }
        w.K k = this.f;
        if (k == null) {
            k = new w.K(0, 1, null);
            this.f = k;
        }
        return k.q(obj, this.e, -1) == this.e;
    }
}
