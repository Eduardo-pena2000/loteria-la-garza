package fb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class u {

    public static final class a implements fb.f {
        public final /* synthetic */ kotlin.jvm.internal.O a;

        public a(kotlin.jvm.internal.O o) {
            this.a = o;
        }

        public Object emit(Object obj, Ga.e eVar) {
            this.a.a = obj;
            throw new gb.a(this);
        }
    }

    public static final class b implements fb.f {
        public final /* synthetic */ Qa.p a;
        public final /* synthetic */ kotlin.jvm.internal.O b;

        public static final class a extends Ia.d {
            public Object a;
            public /* synthetic */ Object b;
            public int c;
            public Object e;

            public a(Ga.e eVar) {
                super(eVar);
            }

            public final Object invokeSuspend(Object obj) {
                this.b = obj;
                this.c |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(Qa.p pVar, kotlin.jvm.internal.O o) {
            this.a = pVar;
            this.b = o;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(java.lang.Object r5, Ga.e r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof fb.u.b.a
                if (r0 == 0) goto L13
                r0 = r6
                fb.u$b$a r0 = (fb.u.b.a) r0
                int r1 = r0.c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.c = r1
                goto L18
            L13:
                fb.u$b$a r0 = new fb.u$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.b
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.c
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.e
                java.lang.Object r0 = r0.a
                fb.u$b r0 = (fb.u.b) r0
                Ca.t.b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                Ca.t.b(r6)
                Qa.p r6 = r4.a
                r0.a = r4
                r0.e = r5
                r0.c = r3
                r2 = 6
                kotlin.jvm.internal.r.c(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.r.c(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L5d
                Ca.I r5 = Ca.I.a
                return r5
            L5d:
                kotlin.jvm.internal.O r6 = r0.b
                r6.a = r5
                gb.a r5 = new gb.a
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: fb.u.b.emit(java.lang.Object, Ga.e):java.lang.Object");
        }
    }

    public static final class c extends Ia.d {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public c(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return fb.g.s(null, this);
        }
    }

    public static final class d extends Ia.d {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int e;

        public d(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return fb.g.t(null, null, this);
        }
    }

    public static final class e implements fb.f {
        public final /* synthetic */ kotlin.jvm.internal.O a;

        public e(kotlin.jvm.internal.O o) {
            this.a = o;
        }

        public Object emit(Object obj, Ga.e eVar) {
            this.a.a = obj;
            throw new gb.a(this);
        }
    }

    public static final class f extends Ia.d {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public f(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return fb.g.u(null, this);
        }
    }

    public static final class g extends Ia.d {
        public Object a;
        public /* synthetic */ Object b;
        public int c;

        public g(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return fb.g.G(null, this);
        }
    }

    public static final class h implements fb.f {
        public final /* synthetic */ kotlin.jvm.internal.O a;

        public h(kotlin.jvm.internal.O o) {
            this.a = o;
        }

        public final Object emit(Object obj, Ga.e eVar) {
            kotlin.jvm.internal.O o = this.a;
            if (o.a != gb.s.a) {
                throw new IllegalArgumentException("Flow has more than one element");
            }
            o.a = obj;
            return Ca.I.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(fb.e r4, Ga.e r5) {
        /*
            boolean r0 = r5 instanceof fb.u.c
            if (r0 == 0) goto L13
            r0 = r5
            fb.u$c r0 = (fb.u.c) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            fb.u$c r0 = new fb.u$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.c
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.b
            fb.u$a r4 = (fb.u.a) r4
            java.lang.Object r0 = r0.a
            kotlin.jvm.internal.O r0 = (kotlin.jvm.internal.O) r0
            Ca.t.b(r5)     // Catch: gb.a -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            Ca.t.b(r5)
            kotlin.jvm.internal.O r5 = new kotlin.jvm.internal.O
            r5.<init>()
            hb.D r2 = gb.s.a
            r5.a = r2
            fb.u$a r2 = new fb.u$a
            r2.<init>(r5)
            r0.a = r5     // Catch: gb.a -> L5b
            r0.b = r2     // Catch: gb.a -> L5b
            r0.d = r3     // Catch: gb.a -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: gb.a -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            gb.o.a(r5, r4)
        L62:
            java.lang.Object r4 = r0.a
            hb.D r5 = gb.s.a
            if (r4 == r5) goto L69
            return r4
        L69:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.u.a(fb.e, Ga.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(fb.e r4, Qa.p r5, Ga.e r6) {
        /*
            boolean r0 = r6 instanceof fb.u.d
            if (r0 == 0) goto L13
            r0 = r6
            fb.u$d r0 = (fb.u.d) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            fb.u$d r0 = new fb.u$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.d
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r4 = r0.c
            fb.u$b r4 = (fb.u.b) r4
            java.lang.Object r5 = r0.b
            kotlin.jvm.internal.O r5 = (kotlin.jvm.internal.O) r5
            java.lang.Object r0 = r0.a
            Qa.p r0 = (Qa.p) r0
            Ca.t.b(r6)     // Catch: gb.a -> L35
            goto L6a
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3f:
            Ca.t.b(r6)
            kotlin.jvm.internal.O r6 = new kotlin.jvm.internal.O
            r6.<init>()
            hb.D r2 = gb.s.a
            r6.a = r2
            fb.u$b r2 = new fb.u$b
            r2.<init>(r5, r6)
            r0.a = r5     // Catch: gb.a -> L62
            r0.b = r6     // Catch: gb.a -> L62
            r0.c = r2     // Catch: gb.a -> L62
            r0.e = r3     // Catch: gb.a -> L62
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: gb.a -> L62
            if (r4 != r1) goto L5f
            return r1
        L5f:
            r0 = r5
            r5 = r6
            goto L6a
        L62:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L67:
            gb.o.a(r6, r4)
        L6a:
            java.lang.Object r4 = r5.a
            hb.D r5 = gb.s.a
            if (r4 == r5) goto L71
            return r4
        L71:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Expected at least one element matching the predicate "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.u.b(fb.e, Qa.p, Ga.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(fb.e r4, Ga.e r5) {
        /*
            boolean r0 = r5 instanceof fb.u.f
            if (r0 == 0) goto L13
            r0 = r5
            fb.u$f r0 = (fb.u.f) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            fb.u$f r0 = new fb.u$f
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.c
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.b
            fb.u$e r4 = (fb.u.e) r4
            java.lang.Object r0 = r0.a
            kotlin.jvm.internal.O r0 = (kotlin.jvm.internal.O) r0
            Ca.t.b(r5)     // Catch: gb.a -> L31
            goto L5e
        L31:
            r5 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            Ca.t.b(r5)
            kotlin.jvm.internal.O r5 = new kotlin.jvm.internal.O
            r5.<init>()
            fb.u$e r2 = new fb.u$e
            r2.<init>(r5)
            r0.a = r5     // Catch: gb.a -> L57
            r0.b = r2     // Catch: gb.a -> L57
            r0.d = r3     // Catch: gb.a -> L57
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: gb.a -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r0 = r5
            goto L5e
        L57:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5b:
            gb.o.a(r5, r4)
        L5e:
            java.lang.Object r4 = r0.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.u.c(fb.e, Ga.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(fb.e r4, Ga.e r5) {
        /*
            boolean r0 = r5 instanceof fb.u.g
            if (r0 == 0) goto L13
            r0 = r5
            fb.u$g r0 = (fb.u.g) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fb.u$g r0 = new fb.u$g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.b
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.a
            kotlin.jvm.internal.O r4 = (kotlin.jvm.internal.O) r4
            Ca.t.b(r5)
            goto L52
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            Ca.t.b(r5)
            kotlin.jvm.internal.O r5 = new kotlin.jvm.internal.O
            r5.<init>()
            hb.D r2 = gb.s.a
            r5.a = r2
            fb.u$h r2 = new fb.u$h
            r2.<init>(r5)
            r0.a = r5
            r0.c = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r5
        L52:
            java.lang.Object r4 = r4.a
            hb.D r5 = gb.s.a
            if (r4 == r5) goto L59
            return r4
        L59:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Flow is empty"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.u.d(fb.e, Ga.e):java.lang.Object");
    }
}
