package C;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class x implements H0.a {
    public final A a;
    public boolean b;

    public static final class a extends Ia.d {
        public long a;
        public /* synthetic */ Object b;
        public int d;

        public a(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return x.this.V0(0L, 0L, this);
        }
    }

    public x(A a2, boolean z) {
        this.a = a2;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object V0(long r3, long r5, Ga.e r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof C.x.a
            if (r3 == 0) goto L13
            r3 = r7
            C.x$a r3 = (C.x.a) r3
            int r4 = r3.d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.d = r4
            goto L18
        L13:
            C.x$a r3 = new C.x$a
            r3.<init>(r7)
        L18:
            java.lang.Object r4 = r3.b
            java.lang.Object r7 = Ha.c.f()
            int r0 = r3.d
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            long r5 = r3.a
            Ca.t.b(r4)
            goto L47
        L2b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L33:
            Ca.t.b(r4)
            boolean r4 = r2.b
            if (r4 == 0) goto L52
            C.A r4 = r2.a
            r3.a = r5
            r3.d = r1
            java.lang.Object r4 = r4.n(r5, r3)
            if (r4 != r7) goto L47
            return r7
        L47:
            n1.y r4 = (n1.y) r4
            long r3 = r4.o()
            long r3 = n1.y.k(r5, r3)
            goto L58
        L52:
            n1.y$a r3 = n1.y.b
            long r3 = r3.a()
        L58:
            n1.y r3 = n1.y.b(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: C.x.V0(long, long, Ga.e):java.lang.Object");
    }

    public final void a(boolean z) {
        this.b = z;
    }

    public long x0(long j, long j2, int i) {
        return this.b ? this.a.r(j2) : u0.f.b.c();
    }
}
