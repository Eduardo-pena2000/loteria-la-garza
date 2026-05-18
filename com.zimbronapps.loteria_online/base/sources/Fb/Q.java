package fb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class q {

    public static final class a extends Ia.d {
        public Object a;
        public /* synthetic */ Object b;
        public int c;

        public a(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return q.a(null, null, null, this);
        }
    }

    public static final class b implements e {
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
                return b.this.collect(null, this);
            }
        }

        public b(e eVar, Qa.q qVar) {
            this.a = eVar;
            this.b = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0086 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(fb.f r9, Ga.e r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof fb.q.b.a
                if (r0 == 0) goto L13
                r0 = r10
                fb.q$b$a r0 = (fb.q.b.a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                fb.q$b$a r0 = new fb.q$b$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.a
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.b
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L54
                if (r2 == r5) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r9 = r0.d
                gb.u r9 = (gb.u) r9
                Ca.t.b(r10)     // Catch: java.lang.Throwable -> L34
                goto L88
            L34:
                r10 = move-exception
                goto L92
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.d
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                Ca.t.b(r10)
                goto Lac
            L46:
                java.lang.Object r9 = r0.e
                fb.f r9 = (fb.f) r9
                java.lang.Object r2 = r0.d
                fb.q$b r2 = (fb.q.b) r2
                Ca.t.b(r10)     // Catch: java.lang.Throwable -> L52
                goto L67
            L52:
                r9 = move-exception
                goto L98
            L54:
                Ca.t.b(r10)
                fb.e r10 = r8.a     // Catch: java.lang.Throwable -> L96
                r0.d = r8     // Catch: java.lang.Throwable -> L96
                r0.e = r9     // Catch: java.lang.Throwable -> L96
                r0.b = r5     // Catch: java.lang.Throwable -> L96
                java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L96
                if (r10 != r1) goto L66
                return r1
            L66:
                r2 = r8
            L67:
                gb.u r10 = new gb.u
                Ga.i r4 = r0.getContext()
                r10.<init>(r9, r4)
                Qa.q r9 = r2.b     // Catch: java.lang.Throwable -> L8e
                r0.d = r10     // Catch: java.lang.Throwable -> L8e
                r0.e = r6     // Catch: java.lang.Throwable -> L8e
                r0.b = r3     // Catch: java.lang.Throwable -> L8e
                r2 = 6
                kotlin.jvm.internal.r.c(r2)     // Catch: java.lang.Throwable -> L8e
                java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L8e
                r0 = 7
                kotlin.jvm.internal.r.c(r0)     // Catch: java.lang.Throwable -> L8e
                if (r9 != r1) goto L87
                return r1
            L87:
                r9 = r10
            L88:
                r9.releaseIntercepted()
                Ca.I r9 = Ca.I.a
                return r9
            L8e:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L92:
                r9.releaseIntercepted()
                throw r10
            L96:
                r9 = move-exception
                r2 = r8
            L98:
                fb.U r10 = new fb.U
                r10.<init>(r9)
                Qa.q r2 = r2.b
                r0.d = r9
                r0.e = r6
                r0.b = r4
                java.lang.Object r10 = fb.q.a(r10, r2, r9, r0)
                if (r10 != r1) goto Lac
                return r1
            Lac:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: fb.q.b.collect(fb.f, Ga.e):java.lang.Object");
        }
    }

    public static final class c implements e {
        public final /* synthetic */ Qa.p a;
        public final /* synthetic */ e b;

        public static final class a extends Ia.d {
            public /* synthetic */ Object a;
            public int b;
            public Object d;
            public Object e;
            public Object f;

            public a(Ga.e eVar) {
                super(eVar);
            }

            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(Qa.p pVar, e eVar) {
            this.a = pVar;
            this.b = eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(fb.f r7, Ga.e r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof fb.q.c.a
                if (r0 == 0) goto L13
                r0 = r8
                fb.q$c$a r0 = (fb.q.c.a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                fb.q$c$a r0 = new fb.q$c$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.a
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                Ca.t.b(r8)
                goto L83
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f
                gb.u r7 = (gb.u) r7
                java.lang.Object r2 = r0.e
                fb.f r2 = (fb.f) r2
                java.lang.Object r4 = r0.d
                fb.q$c r4 = (fb.q.c) r4
                Ca.t.b(r8)     // Catch: java.lang.Throwable -> L44
                goto L6e
            L44:
                r8 = move-exception
                goto L8a
            L46:
                Ca.t.b(r8)
                gb.u r8 = new gb.u
                Ga.i r2 = r0.getContext()
                r8.<init>(r7, r2)
                Qa.p r2 = r6.a     // Catch: java.lang.Throwable -> L86
                r0.d = r6     // Catch: java.lang.Throwable -> L86
                r0.e = r7     // Catch: java.lang.Throwable -> L86
                r0.f = r8     // Catch: java.lang.Throwable -> L86
                r0.b = r4     // Catch: java.lang.Throwable -> L86
                r4 = 6
                kotlin.jvm.internal.r.c(r4)     // Catch: java.lang.Throwable -> L86
                java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L86
                r4 = 7
                kotlin.jvm.internal.r.c(r4)     // Catch: java.lang.Throwable -> L86
                if (r2 != r1) goto L6b
                return r1
            L6b:
                r4 = r6
                r2 = r7
                r7 = r8
            L6e:
                r7.releaseIntercepted()
                fb.e r7 = r4.b
                r8 = 0
                r0.d = r8
                r0.e = r8
                r0.f = r8
                r0.b = r3
                java.lang.Object r7 = r7.collect(r2, r0)
                if (r7 != r1) goto L83
                return r1
            L83:
                Ca.I r7 = Ca.I.a
                return r7
            L86:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L8a:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: fb.q.c.collect(fb.f, Ga.e):java.lang.Object");
        }
    }

    public static final /* synthetic */ Object a(f fVar, Qa.q qVar, Throwable th, Ga.e eVar) {
        return c(fVar, qVar, th, eVar);
    }

    public static final void b(f fVar) {
        if (fVar instanceof U) {
            throw ((U) fVar).a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(fb.f r4, Qa.q r5, java.lang.Throwable r6, Ga.e r7) {
        /*
            boolean r0 = r7 instanceof fb.q.a
            if (r0 == 0) goto L13
            r0 = r7
            fb.q$a r0 = (fb.q.a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fb.q$a r0 = new fb.q$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.a
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            Ca.t.b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L46
        L2e:
            r4 = move-exception
            goto L49
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            Ca.t.b(r7)
            r0.a = r6     // Catch: java.lang.Throwable -> L2e
            r0.c = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r4 != r1) goto L46
            return r1
        L46:
            Ca.I r4 = Ca.I.a
            return r4
        L49:
            if (r6 == 0) goto L50
            if (r6 == r4) goto L50
            Ca.g.a(r4, r6)
        L50:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.q.c(fb.f, Qa.q, java.lang.Throwable, Ga.e):java.lang.Object");
    }

    public static final e d(e eVar, Qa.q qVar) {
        return new b(eVar, qVar);
    }

    public static final e e(e eVar, Qa.p pVar) {
        return new c(pVar, eVar);
    }
}
