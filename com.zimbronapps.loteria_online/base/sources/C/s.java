package C;

import lb.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class s implements r, n1.d {
    public final /* synthetic */ n1.d a;
    public boolean b;
    public boolean c;
    public final lb.a d = lb.g.a(false);

    public static final class a extends Ia.d {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return s.this.p(this);
        }
    }

    public static final class b extends Ia.d {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public b(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return s.this.R(this);
        }
    }

    public s(n1.d dVar) {
        this.a = dVar;
    }

    public float A(int i) {
        return this.a.A(i);
    }

    public long M(float f) {
        return this.a.M(f);
    }

    public long N(long j) {
        return this.a.N(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object R(Ga.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof C.s.b
            if (r0 == 0) goto L13
            r0 = r6
            C.s$b r0 = (C.s.b) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            C.s$b r0 = new C.s$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.a
            C.s r0 = (C.s) r0
            Ca.t.b(r6)
            goto L4f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            Ca.t.b(r6)
            boolean r6 = r5.b
            if (r6 != 0) goto L55
            boolean r6 = r5.c
            if (r6 != 0) goto L55
            lb.a r6 = r5.d
            r0.a = r5
            r0.d = r4
            java.lang.Object r6 = lb.a.a.a(r6, r3, r0, r4, r3)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r0 = r5
        L4f:
            lb.a r6 = r0.d
            lb.a.a.c(r6, r3, r4, r3)
            goto L56
        L55:
            r0 = r5
        L56:
            boolean r6 = r0.b
            java.lang.Boolean r6 = Ia.b.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: C.s.R(Ga.e):java.lang.Object");
    }

    public float S(long j) {
        return this.a.S(j);
    }

    public long X(float f) {
        return this.a.X(f);
    }

    public float a1(float f) {
        return this.a.a1(f);
    }

    public float e1() {
        return this.a.e1();
    }

    public final void g() {
        this.c = true;
        a.a.c(this.d, (Object) null, 1, (Object) null);
    }

    public float getDensity() {
        return this.a.getDensity();
    }

    public final void j() {
        this.b = true;
        a.a.c(this.d, (Object) null, 1, (Object) null);
    }

    public float j1(float f) {
        return this.a.j1(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(Ga.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof C.s.a
            if (r0 == 0) goto L13
            r0 = r5
            C.s$a r0 = (C.s.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            C.s$a r0 = new C.s$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.b
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.a
            C.s r0 = (C.s) r0
            Ca.t.b(r5)
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            Ca.t.b(r5)
            lb.a r5 = r4.d
            r0.a = r4
            r0.d = r3
            r2 = 0
            java.lang.Object r5 = lb.a.a.a(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L46
            return r1
        L46:
            r0 = r4
        L47:
            r5 = 0
            r0.b = r5
            r0.c = r5
            Ca.I r5 = Ca.I.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: C.s.p(Ga.e):java.lang.Object");
    }

    public int s0(float f) {
        return this.a.s0(f);
    }

    public long w1(long j) {
        return this.a.w1(j);
    }

    public float y0(long j) {
        return this.a.y0(j);
    }
}
