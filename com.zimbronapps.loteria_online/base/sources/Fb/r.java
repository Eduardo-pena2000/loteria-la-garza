package fb;

import cb.B0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class r {

    public static final class a implements e {
        public final /* synthetic */ e a;
        public final /* synthetic */ Qa.q b;

        public static final class a extends Ia.d {
            public /* synthetic */ Object a;
            public int b;
            public Object d;
            public Object e;

            public a(Ga.e eVar) {
                super(eVar);
            }

            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public a(e eVar, Qa.q qVar) {
            this.a = eVar;
            this.b = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(fb.f r6, Ga.e r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof fb.r.a.a
                if (r0 == 0) goto L13
                r0 = r7
                fb.r$a$a r0 = (fb.r.a.a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                fb.r$a$a r0 = new fb.r$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.a
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                Ca.t.b(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.e
                fb.f r6 = (fb.f) r6
                java.lang.Object r2 = r0.d
                fb.r$a r2 = (fb.r.a) r2
                Ca.t.b(r7)
                goto L53
            L40:
                Ca.t.b(r7)
                fb.e r7 = r5.a
                r0.d = r5
                r0.e = r6
                r0.b = r4
                java.lang.Object r7 = fb.g.g(r7, r6, r0)
                if (r7 != r1) goto L52
                return r1
            L52:
                r2 = r5
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                Qa.q r2 = r2.b
                r4 = 0
                r0.d = r4
                r0.e = r4
                r0.b = r3
                r3 = 6
                kotlin.jvm.internal.r.c(r3)
                java.lang.Object r6 = r2.invoke(r6, r7, r0)
                r7 = 7
                kotlin.jvm.internal.r.c(r7)
                if (r6 != r1) goto L6f
                return r1
            L6f:
                Ca.I r6 = Ca.I.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: fb.r.a.collect(fb.f, Ga.e):java.lang.Object");
        }
    }

    public static final class b extends Ia.d {
        public Object a;
        public /* synthetic */ Object b;
        public int c;

        public b(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return g.g(null, null, this);
        }
    }

    public static final class c implements f {
        public final /* synthetic */ f a;
        public final /* synthetic */ kotlin.jvm.internal.O b;

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
                return c.this.emit(null, this);
            }
        }

        public c(f fVar, kotlin.jvm.internal.O o) {
            this.a = fVar;
            this.b = o;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r5, Ga.e r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof fb.r.c.a
                if (r0 == 0) goto L13
                r0 = r6
                fb.r$c$a r0 = (fb.r.c.a) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.d = r1
                goto L18
            L13:
                fb.r$c$a r0 = new fb.r$c$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.b
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.d
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.a
                fb.r$c r5 = (fb.r.c) r5
                Ca.t.b(r6)     // Catch: java.lang.Throwable -> L2d
                goto L47
            L2d:
                r6 = move-exception
                goto L4c
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                Ca.t.b(r6)
                fb.f r6 = r4.a     // Catch: java.lang.Throwable -> L4a
                r0.a = r4     // Catch: java.lang.Throwable -> L4a
                r0.d = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                Ca.I r5 = Ca.I.a
                return r5
            L4a:
                r6 = move-exception
                r5 = r4
            L4c:
                kotlin.jvm.internal.O r5 = r5.b
                r5.a = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: fb.r.c.emit(java.lang.Object, Ga.e):java.lang.Object");
        }
    }

    public static final e a(e eVar, Qa.q qVar) {
        return new a(eVar, qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(fb.e r4, fb.f r5, Ga.e r6) {
        /*
            boolean r0 = r6 instanceof fb.r.b
            if (r0 == 0) goto L13
            r0 = r6
            fb.r$b r0 = (fb.r.b) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fb.r$b r0 = new fb.r$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.a
            kotlin.jvm.internal.O r4 = (kotlin.jvm.internal.O) r4
            Ca.t.b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            Ca.t.b(r6)
            kotlin.jvm.internal.O r6 = new kotlin.jvm.internal.O
            r6.<init>()
            fb.r$c r2 = new fb.r$c     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.a = r6     // Catch: java.lang.Throwable -> L51
            r0.c = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            java.lang.Object r4 = r4.a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L76
            Ga.i r6 = r0.getContext()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            Ca.g.a(r4, r5)
            throw r4
        L72:
            Ca.g.a(r5, r4)
            throw r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.r.b(fb.e, fb.f, Ga.e):java.lang.Object");
    }

    public static final boolean c(Throwable th, Ga.i iVar) {
        B0 b0 = (B0) iVar.get(B0.P8);
        if (b0 == null || !b0.isCancelled()) {
            return false;
        }
        return d(th, b0.getCancellationException());
    }

    public static final boolean d(Throwable th, Throwable th2) {
        return th2 != null && kotlin.jvm.internal.t.c(th2, th);
    }
}
