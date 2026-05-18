package fb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class s {

    public static final class a implements fb.e {
        public final /* synthetic */ fb.e a;
        public final /* synthetic */ Qa.p b;

        public a(fb.e eVar, Qa.p pVar) {
            this.a = eVar;
            this.b = pVar;
        }

        public Object collect(fb.f fVar, Ga.e eVar) {
            Object collect = this.a.collect(new b(new kotlin.jvm.internal.J(), fVar, this.b), eVar);
            return collect == Ha.c.f() ? collect : Ca.I.a;
        }
    }

    public static final class b implements fb.f {
        public final /* synthetic */ kotlin.jvm.internal.J a;
        public final /* synthetic */ fb.f b;
        public final /* synthetic */ Qa.p c;

        public static final class a extends Ia.d {
            public Object a;
            public Object b;
            public /* synthetic */ Object c;
            public int e;

            public a(Ga.e eVar) {
                super(eVar);
            }

            public final Object invokeSuspend(Object obj) {
                this.c = obj;
                this.e |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(kotlin.jvm.internal.J j, fb.f fVar, Qa.p pVar) {
            this.a = j;
            this.b = fVar;
            this.c = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r7, Ga.e r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof fb.s.b.a
                if (r0 == 0) goto L13
                r0 = r8
                fb.s$b$a r0 = (fb.s.b.a) r0
                int r1 = r0.e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.e = r1
                goto L18
            L13:
                fb.s$b$a r0 = new fb.s$b$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.c
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                Ca.t.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.b
                java.lang.Object r2 = r0.a
                fb.s$b r2 = (fb.s.b) r2
                Ca.t.b(r8)
                goto L6c
            L41:
                Ca.t.b(r8)
                goto L59
            L45:
                Ca.t.b(r8)
                kotlin.jvm.internal.J r8 = r6.a
                boolean r8 = r8.a
                if (r8 == 0) goto L5c
                fb.f r8 = r6.b
                r0.e = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                Ca.I r7 = Ca.I.a
                return r7
            L5c:
                Qa.p r8 = r6.c
                r0.a = r6
                r0.b = r7
                r0.e = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.J r8 = r2.a
                r8.a = r5
                fb.f r8 = r2.b
                r2 = 0
                r0.a = r2
                r0.b = r2
                r0.e = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                Ca.I r7 = Ca.I.a
                return r7
            L8b:
                Ca.I r7 = Ca.I.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: fb.s.b.emit(java.lang.Object, Ga.e):java.lang.Object");
        }
    }

    public static final class c extends Ia.d {
        public Object a;
        public /* synthetic */ Object b;
        public int c;

        public c(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return s.a(null, null, null, this);
        }
    }

    public static final class d implements fb.e {
        public final /* synthetic */ fb.e a;
        public final /* synthetic */ int b;

        public static final class a extends Ia.d {
            public /* synthetic */ Object a;
            public int b;
            public Object d;

            public a(Ga.e eVar) {
                super(eVar);
            }

            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return d.this.collect(null, this);
            }
        }

        public d(fb.e eVar, int i) {
            this.a = eVar;
            this.b = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(fb.f r9, Ga.e r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof fb.s.d.a
                if (r0 == 0) goto L13
                r0 = r10
                fb.s$d$a r0 = (fb.s.d.a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                fb.s$d$a r0 = new fb.s$d$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.a
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.b
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r9 = r0.d
                Ca.t.b(r10)     // Catch: gb.a -> L2b
                goto L5d
            L2b:
                r10 = move-exception
                goto L5a
            L2d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L35:
                Ca.t.b(r10)
                java.lang.Object r10 = new java.lang.Object
                r10.<init>()
                kotlin.jvm.internal.M r2 = new kotlin.jvm.internal.M
                r2.<init>()
                fb.e r4 = r8.a     // Catch: gb.a -> L56
                fb.s$e r5 = new fb.s$e     // Catch: gb.a -> L56
                int r6 = r8.b     // Catch: gb.a -> L56
                r5.<init>(r2, r6, r9, r10)     // Catch: gb.a -> L56
                r0.d = r10     // Catch: gb.a -> L56
                r0.b = r3     // Catch: gb.a -> L56
                java.lang.Object r9 = r4.collect(r5, r0)     // Catch: gb.a -> L56
                if (r9 != r1) goto L5d
                return r1
            L56:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L5a:
                gb.o.a(r10, r9)
            L5d:
                Ca.I r9 = Ca.I.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: fb.s.d.collect(fb.f, Ga.e):java.lang.Object");
        }
    }

    public static final class e implements fb.f {
        public final /* synthetic */ kotlin.jvm.internal.M a;
        public final /* synthetic */ int b;
        public final /* synthetic */ fb.f c;
        public final /* synthetic */ Object d;

        public static final class a extends Ia.d {
            public /* synthetic */ Object a;
            public int c;

            public a(Ga.e eVar) {
                super(eVar);
            }

            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.c |= Integer.MIN_VALUE;
                return e.this.emit(null, this);
            }
        }

        public e(kotlin.jvm.internal.M m, int i, fb.f fVar, Object obj) {
            this.a = m;
            this.b = i;
            this.c = fVar;
            this.d = obj;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r6, Ga.e r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof fb.s.e.a
                if (r0 == 0) goto L13
                r0 = r7
                fb.s$e$a r0 = (fb.s.e.a) r0
                int r1 = r0.c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.c = r1
                goto L18
            L13:
                fb.s$e$a r0 = new fb.s$e$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.a
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                Ca.t.b(r7)
                goto L61
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                Ca.t.b(r7)
                goto L51
            L38:
                Ca.t.b(r7)
                kotlin.jvm.internal.M r7 = r5.a
                int r2 = r7.a
                int r2 = r2 + r4
                r7.a = r2
                int r7 = r5.b
                if (r2 >= r7) goto L54
                fb.f r7 = r5.c
                r0.c = r4
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                Ca.I r6 = Ca.I.a
                return r6
            L54:
                fb.f r7 = r5.c
                java.lang.Object r2 = r5.d
                r0.c = r3
                java.lang.Object r6 = fb.s.a(r7, r6, r2, r0)
                if (r6 != r1) goto L61
                return r1
            L61:
                Ca.I r6 = Ca.I.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: fb.s.e.emit(java.lang.Object, Ga.e):java.lang.Object");
        }
    }

    public static final class f implements fb.e {
        public final /* synthetic */ fb.e a;
        public final /* synthetic */ Qa.p b;

        public static final class a extends Ia.d {
            public /* synthetic */ Object a;
            public int b;
            public Object d;

            public a(Ga.e eVar) {
                super(eVar);
            }

            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public f(fb.e eVar, Qa.p pVar) {
            this.a = eVar;
            this.b = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(fb.f r6, Ga.e r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof fb.s.f.a
                if (r0 == 0) goto L13
                r0 = r7
                fb.s$f$a r0 = (fb.s.f.a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                fb.s$f$a r0 = new fb.s$f$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.a
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.b
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r6 = r0.d
                fb.s$g r6 = (fb.s.g) r6
                Ca.t.b(r7)     // Catch: gb.a -> L2d
                goto L53
            L2d:
                r7 = move-exception
                goto L50
            L2f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L37:
                Ca.t.b(r7)
                fb.e r7 = r5.a
                fb.s$g r2 = new fb.s$g
                Qa.p r4 = r5.b
                r2.<init>(r4, r6)
                r0.d = r2     // Catch: gb.a -> L4e
                r0.b = r3     // Catch: gb.a -> L4e
                java.lang.Object r6 = r7.collect(r2, r0)     // Catch: gb.a -> L4e
                if (r6 != r1) goto L53
                return r1
            L4e:
                r7 = move-exception
                r6 = r2
            L50:
                gb.o.a(r7, r6)
            L53:
                Ca.I r6 = Ca.I.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: fb.s.f.collect(fb.f, Ga.e):java.lang.Object");
        }
    }

    public static final class g implements fb.f {
        public final /* synthetic */ Qa.p a;
        public final /* synthetic */ fb.f b;

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
                return g.this.emit(null, this);
            }
        }

        public g(Qa.p pVar, fb.f fVar) {
            this.a = pVar;
            this.b = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(java.lang.Object r8, Ga.e r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof fb.s.g.a
                if (r0 == 0) goto L13
                r0 = r9
                fb.s$g$a r0 = (fb.s.g.a) r0
                int r1 = r0.c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.c = r1
                goto L18
            L13:
                fb.s$g$a r0 = new fb.s$g$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.b
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.a
                fb.s$g r8 = (fb.s.g) r8
                Ca.t.b(r9)
                goto L7c
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                java.lang.Object r8 = r0.e
                java.lang.Object r2 = r0.a
                fb.s$g r2 = (fb.s.g) r2
                Ca.t.b(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L63
            L46:
                Ca.t.b(r9)
                Qa.p r9 = r7.a
                r0.a = r7
                r0.e = r8
                r0.c = r4
                r2 = 6
                kotlin.jvm.internal.r.c(r2)
                java.lang.Object r9 = r9.invoke(r8, r0)
                r2 = 7
                kotlin.jvm.internal.r.c(r2)
                if (r9 != r1) goto L60
                return r1
            L60:
                r2 = r9
                r9 = r8
                r8 = r7
            L63:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L7b
                fb.f r2 = r8.b
                r0.a = r8
                r5 = 0
                r0.e = r5
                r0.c = r3
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto L7c
                return r1
            L7b:
                r4 = 0
            L7c:
                if (r4 == 0) goto L81
                Ca.I r8 = Ca.I.a
                return r8
            L81:
                gb.a r9 = new gb.a
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: fb.s.g.emit(java.lang.Object, Ga.e):java.lang.Object");
        }
    }

    public static final class h extends Ia.l implements Qa.p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ fb.e c;
        public final /* synthetic */ Qa.q d;

        public static final class a implements fb.f {
            public final /* synthetic */ Qa.q a;
            public final /* synthetic */ fb.f b;

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
                    return a.this.emit(null, this);
                }
            }

            public a(Qa.q qVar, fb.f fVar) {
                this.a = qVar;
                this.b = fVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Object emit(java.lang.Object r5, Ga.e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof fb.s.h.a.a
                    if (r0 == 0) goto L13
                    r0 = r6
                    fb.s$h$a$a r0 = (fb.s.h.a.a) r0
                    int r1 = r0.c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.c = r1
                    goto L18
                L13:
                    fb.s$h$a$a r0 = new fb.s$h$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.b
                    java.lang.Object r1 = Ha.c.f()
                    int r2 = r0.c
                    r3 = 1
                    if (r2 == 0) goto L35
                    if (r2 != r3) goto L2d
                    java.lang.Object r5 = r0.a
                    fb.s$h$a r5 = (fb.s.h.a) r5
                    Ca.t.b(r6)
                    goto L50
                L2d:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L35:
                    Ca.t.b(r6)
                    Qa.q r6 = r4.a
                    fb.f r2 = r4.b
                    r0.a = r4
                    r0.c = r3
                    r3 = 6
                    kotlin.jvm.internal.r.c(r3)
                    java.lang.Object r6 = r6.invoke(r2, r5, r0)
                    r5 = 7
                    kotlin.jvm.internal.r.c(r5)
                    if (r6 != r1) goto L4f
                    return r1
                L4f:
                    r5 = r4
                L50:
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    if (r6 == 0) goto L5b
                    Ca.I r5 = Ca.I.a
                    return r5
                L5b:
                    gb.a r6 = new gb.a
                    r6.<init>(r5)
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: fb.s.h.a.emit(java.lang.Object, Ga.e):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(fb.e eVar, Qa.q qVar, Ga.e eVar2) {
            super(2, eVar2);
            this.c = eVar;
            this.d = qVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            h hVar = new h(this.c, this.d, eVar);
            hVar.b = obj;
            return hVar;
        }

        public final Object invoke(fb.f fVar, Ga.e eVar) {
            return ((h) create(fVar, eVar)).invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            a aVar;
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                fb.f fVar = (fb.f) this.b;
                fb.e eVar = this.c;
                a aVar2 = new a(this.d, fVar);
                try {
                    this.b = aVar2;
                    this.a = 1;
                    if (eVar.collect(aVar2, this) == f) {
                        return f;
                    }
                } catch (gb.a e) {
                    e = e;
                    aVar = aVar2;
                    gb.o.a(e, aVar);
                    return Ca.I.a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (a) this.b;
                try {
                    Ca.t.b(obj);
                } catch (gb.a e2) {
                    e = e2;
                    gb.o.a(e, aVar);
                    return Ca.I.a;
                }
            }
            return Ca.I.a;
        }
    }

    public static final /* synthetic */ Object a(fb.f fVar, Object obj, Object obj2, Ga.e eVar) {
        return c(fVar, obj, obj2, eVar);
    }

    public static final fb.e b(fb.e eVar, Qa.p pVar) {
        return new a(eVar, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(fb.f r4, java.lang.Object r5, java.lang.Object r6, Ga.e r7) {
        /*
            boolean r0 = r7 instanceof fb.s.c
            if (r0 == 0) goto L13
            r0 = r7
            fb.s$c r0 = (fb.s.c) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fb.s$c r0 = new fb.s$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r6 = r0.a
            Ca.t.b(r7)
            goto L41
        L33:
            Ca.t.b(r7)
            r0.a = r6
            r0.c = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L41
            return r1
        L41:
            gb.a r4 = new gb.a
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.s.c(fb.f, java.lang.Object, java.lang.Object, Ga.e):java.lang.Object");
    }

    public static final fb.e d(fb.e eVar, int i) {
        if (i > 0) {
            return new d(eVar, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " should be positive").toString());
    }

    public static final fb.e e(fb.e eVar, Qa.p pVar) {
        return new f(eVar, pVar);
    }

    public static final fb.e f(fb.e eVar, Qa.q qVar) {
        return fb.g.v(new h(eVar, qVar, null));
    }
}
