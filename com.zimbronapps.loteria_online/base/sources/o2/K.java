package o2;

import cb.B0;
import java.util.List;
import java.util.concurrent.CancellationException;
import o2.O;
import o2.w;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k implements o2.i {
    public static final a m = new a(null);
    public final J a;
    public final o2.e b;
    public final cb.O c;
    public final fb.e d;
    public final lb.a e;
    public int f;
    public B0 g;
    public final o2.l h;
    public final b i;
    public final Ca.l j;
    public final Ca.l k;
    public final G l;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public final class b extends D {
        public List c;
        public final /* synthetic */ k d;

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
                return b.this.b(this);
            }
        }

        public static final class b extends Ia.l implements Qa.l {
            public Object a;
            public Object b;
            public Object c;
            public Object d;
            public Object e;
            public int f;
            public int g;
            public final /* synthetic */ k h;
            public final /* synthetic */ b i;

            public static final class a implements o2.s {
                public final /* synthetic */ lb.a a;
                public final /* synthetic */ kotlin.jvm.internal.J b;
                public final /* synthetic */ kotlin.jvm.internal.O c;
                public final /* synthetic */ k d;

                public static final class a extends Ia.d {
                    public Object a;
                    public Object b;
                    public Object c;
                    public Object d;
                    public Object e;
                    public /* synthetic */ Object f;
                    public int h;

                    public a(Ga.e eVar) {
                        super(eVar);
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f = obj;
                        this.h |= Integer.MIN_VALUE;
                        return a.this.a(null, this);
                    }
                }

                public a(lb.a aVar, kotlin.jvm.internal.J j, kotlin.jvm.internal.O o, k kVar) {
                    this.a = aVar;
                    this.b = j;
                    this.c = o;
                    this.d = kVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:30:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:27:0x0052, B:28:0x00b2, B:30:0x00ba), top: B:26:0x0052 }] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object a(Qa.p r11, Ga.e r12) {
                    /*
                        Method dump skipped, instructions count: 231
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o2.k.b.b.a.a(Qa.p, Ga.e):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(k kVar, b bVar, Ga.e eVar) {
                super(1, eVar);
                this.h = kVar;
                this.i = bVar;
            }

            public final Ga.e create(Ga.e eVar) {
                return new b(this.h, this.i, eVar);
            }

            public final Object invoke(Ga.e eVar) {
                return create(eVar).invokeSuspend(Ca.I.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x00f1  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x010b A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:22:0x010c  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00e4 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    Method dump skipped, instructions count: 286
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o2.k.b.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b(k kVar, List list) {
            kotlin.jvm.internal.t.g(list, "initTasksList");
            this.d = kVar;
            this.c = Da.D.L0(list);
        }

        public static final /* synthetic */ List d(b bVar) {
            return bVar.c;
        }

        public static final /* synthetic */ void e(b bVar, List list) {
            bVar.c = list;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object b(Ga.e r7) {
            /*
                r6 = this;
                boolean r0 = r7 instanceof o2.k.b.a
                if (r0 == 0) goto L13
                r0 = r7
                o2.k$b$a r0 = (o2.k.b.a) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.d = r1
                goto L18
            L13:
                o2.k$b$a r0 = new o2.k$b$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.b
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.d
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r0 = r0.a
                o2.k$b r0 = (o2.k.b) r0
                Ca.t.b(r7)
                goto L6b
            L30:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L38:
                java.lang.Object r0 = r0.a
                o2.k$b r0 = (o2.k.b) r0
                Ca.t.b(r7)
                goto L7d
            L40:
                Ca.t.b(r7)
                java.util.List r7 = r6.c
                if (r7 == 0) goto L6e
                kotlin.jvm.internal.t.d(r7)
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L51
                goto L6e
            L51:
                o2.k r7 = r6.d
                o2.t r7 = o2.k.c(r7)
                o2.k$b$b r2 = new o2.k$b$b
                o2.k r4 = r6.d
                r5 = 0
                r2.<init>(r4, r6, r5)
                r0.a = r6
                r0.d = r3
                java.lang.Object r7 = r7.d(r2, r0)
                if (r7 != r1) goto L6a
                return r1
            L6a:
                r0 = r6
            L6b:
                o2.f r7 = (o2.f) r7
                goto L7f
            L6e:
                o2.k r7 = r6.d
                r0.a = r6
                r0.d = r4
                r2 = 0
                java.lang.Object r7 = o2.k.n(r7, r2, r0)
                if (r7 != r1) goto L7c
                return r1
            L7c:
                r0 = r6
            L7d:
                o2.f r7 = (o2.f) r7
            L7f:
                o2.k r0 = r0.d
                o2.l r0 = o2.k.d(r0)
                r0.c(r7)
                Ca.I r7 = Ca.I.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o2.k.b.b(Ga.e):java.lang.Object");
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.a {
        public c() {
            super(0);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o2.t invoke() {
            return k.this.s().e();
        }
    }

    public static final class d extends Ia.l implements Qa.p {
        public Object a;
        public int b;
        public /* synthetic */ Object c;

        public static final class a extends Ia.l implements Qa.p {
            public int a;
            public final /* synthetic */ k b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar, Ga.e eVar) {
                super(2, eVar);
                this.b = kVar;
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                return new a(this.b, eVar);
            }

            public final Object invoke(fb.f fVar, Ga.e eVar) {
                return create(fVar, eVar).invokeSuspend(Ca.I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = Ha.c.f();
                int i = this.a;
                if (i == 0) {
                    Ca.t.b(obj);
                    k kVar = this.b;
                    this.a = 1;
                    if (k.j(kVar, this) == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ca.t.b(obj);
                }
                return Ca.I.a;
            }
        }

        public static final class b extends Ia.l implements Qa.p {
            public int a;
            public /* synthetic */ Object b;

            public b(Ga.e eVar) {
                super(2, eVar);
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(I i, Ga.e eVar) {
                return create(i, eVar).invokeSuspend(Ca.I.a);
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                b bVar = new b(eVar);
                bVar.b = obj;
                return bVar;
            }

            public final Object invokeSuspend(Object obj) {
                Ha.c.f();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
                return Ia.b.a(!(((I) this.b) instanceof o2.r));
            }
        }

        public static final class c extends Ia.l implements Qa.p {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ I c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(I i, Ga.e eVar) {
                super(2, eVar);
                this.c = i;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(I i, Ga.e eVar) {
                return create(i, eVar).invokeSuspend(Ca.I.a);
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                c cVar = new c(this.c, eVar);
                cVar.b = obj;
                return cVar;
            }

            public final Object invokeSuspend(Object obj) {
                Ha.c.f();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
                I i = (I) this.b;
                return Ia.b.a((i instanceof o2.f) && i.a() <= this.c.a());
            }
        }

        public static final class d extends Ia.l implements Qa.q {
            public int a;
            public final /* synthetic */ k b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(k kVar, Ga.e eVar) {
                super(3, eVar);
                this.b = kVar;
            }

            public final Object invoke(fb.f fVar, Throwable th, Ga.e eVar) {
                return new d(this.b, eVar).invokeSuspend(Ca.I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = Ha.c.f();
                int i = this.a;
                if (i == 0) {
                    Ca.t.b(obj);
                    k kVar = this.b;
                    this.a = 1;
                    if (k.b(kVar, this) == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ca.t.b(obj);
                }
                return Ca.I.a;
            }
        }

        public static final class e implements fb.e {
            public final /* synthetic */ fb.e a;

            public static final class a implements fb.f {
                public final /* synthetic */ fb.f a;

                public static final class a extends Ia.d {
                    public /* synthetic */ Object a;
                    public int b;

                    public a(Ga.e eVar) {
                        super(eVar);
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(fb.f fVar) {
                    this.a = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, Ga.e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof o2.k.d.e.a.a
                        if (r0 == 0) goto L13
                        r0 = r6
                        o2.k$d$e$a$a r0 = (o2.k.d.e.a.a) r0
                        int r1 = r0.b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.b = r1
                        goto L18
                    L13:
                        o2.k$d$e$a$a r0 = new o2.k$d$e$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.a
                        java.lang.Object r1 = Ha.c.f()
                        int r2 = r0.b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        Ca.t.b(r6)
                        goto L4f
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        Ca.t.b(r6)
                        fb.f r6 = r4.a
                        o2.I r5 = (o2.I) r5
                        boolean r2 = r5 instanceof o2.B
                        if (r2 != 0) goto L69
                        boolean r2 = r5 instanceof o2.f
                        if (r2 == 0) goto L52
                        o2.f r5 = (o2.f) r5
                        java.lang.Object r5 = r5.c()
                        r0.b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4f
                        return r1
                    L4f:
                        Ca.I r5 = Ca.I.a
                        return r5
                    L52:
                        boolean r6 = r5 instanceof o2.r
                        if (r6 == 0) goto L57
                        goto L59
                    L57:
                        boolean r3 = r5 instanceof o2.M
                    L59:
                        if (r3 == 0) goto L63
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        r5.<init>(r6)
                        throw r5
                    L63:
                        Ca.o r5 = new Ca.o
                        r5.<init>()
                        throw r5
                    L69:
                        o2.B r5 = (o2.B) r5
                        java.lang.Throwable r5 = r5.b()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o2.k.d.e.a.emit(java.lang.Object, Ga.e):java.lang.Object");
                }
            }

            public e(fb.e eVar) {
                this.a = eVar;
            }

            public Object collect(fb.f fVar, Ga.e eVar) {
                Object collect = this.a.collect(new a(fVar), eVar);
                return collect == Ha.c.f() ? collect : Ca.I.a;
            }
        }

        public d(Ga.e eVar) {
            super(2, eVar);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            d dVar = k.this.new d(eVar);
            dVar.c = obj;
            return dVar;
        }

        public final Object invoke(fb.f fVar, Ga.e eVar) {
            return create(fVar, eVar).invokeSuspend(Ca.I.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x00bc A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = Ha.c.f()
                int r1 = r8.b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L32
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                Ca.t.b(r9)
                goto Lbd
            L16:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1e:
                java.lang.Object r1 = r8.a
                o2.I r1 = (o2.I) r1
                java.lang.Object r3 = r8.c
                fb.f r3 = (fb.f) r3
                Ca.t.b(r9)
                goto L66
            L2a:
                java.lang.Object r1 = r8.c
                fb.f r1 = (fb.f) r1
                Ca.t.b(r9)
                goto L4a
            L32:
                Ca.t.b(r9)
                java.lang.Object r9 = r8.c
                fb.f r9 = (fb.f) r9
                o2.k r1 = o2.k.this
                r8.c = r9
                r8.b = r4
                r4 = 0
                java.lang.Object r1 = o2.k.o(r1, r4, r8)
                if (r1 != r0) goto L47
                return r0
            L47:
                r7 = r1
                r1 = r9
                r9 = r7
            L4a:
                o2.I r9 = (o2.I) r9
                boolean r4 = r9 instanceof o2.f
                if (r4 == 0) goto L69
                r4 = r9
                o2.f r4 = (o2.f) r4
                java.lang.Object r4 = r4.c()
                r8.c = r1
                r8.a = r9
                r8.b = r3
                java.lang.Object r3 = r1.emit(r4, r8)
                if (r3 != r0) goto L64
                return r0
            L64:
                r3 = r1
                r1 = r9
            L66:
                r9 = r1
                r1 = r3
                goto L78
            L69:
                boolean r3 = r9 instanceof o2.M
                if (r3 != 0) goto Lc7
                boolean r3 = r9 instanceof o2.B
                if (r3 != 0) goto Lc0
                boolean r3 = r9 instanceof o2.r
                if (r3 == 0) goto L78
                Ca.I r9 = Ca.I.a
                return r9
            L78:
                o2.k r3 = o2.k.this
                o2.l r3 = o2.k.d(r3)
                fb.e r3 = r3.b()
                o2.k$d$a r4 = new o2.k$d$a
                o2.k r5 = o2.k.this
                r6 = 0
                r4.<init>(r5, r6)
                fb.e r3 = fb.g.D(r3, r4)
                o2.k$d$b r4 = new o2.k$d$b
                r4.<init>(r6)
                fb.e r3 = fb.g.J(r3, r4)
                o2.k$d$c r4 = new o2.k$d$c
                r4.<init>(r9, r6)
                fb.e r9 = fb.g.n(r3, r4)
                o2.k$d$e r3 = new o2.k$d$e
                r3.<init>(r9)
                o2.k$d$d r9 = new o2.k$d$d
                o2.k r4 = o2.k.this
                r9.<init>(r4, r6)
                fb.e r9 = fb.g.B(r3, r9)
                r8.c = r6
                r8.a = r6
                r8.b = r2
                java.lang.Object r9 = fb.g.p(r1, r9, r8)
                if (r9 != r0) goto Lbd
                return r0
            Lbd:
                Ca.I r9 = Ca.I.a
                return r9
            Lc0:
                o2.B r9 = (o2.B) r9
                java.lang.Throwable r9 = r9.b()
                throw r9
            Lc7:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: o2.k.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class e extends Ia.d {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public e(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return k.b(k.this, this);
        }
    }

    public static final class f extends Ia.l implements Qa.l {
        public int a;
        public final /* synthetic */ Qa.l b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Qa.l lVar, Ga.e eVar) {
            super(1, eVar);
            this.b = lVar;
        }

        public final Ga.e create(Ga.e eVar) {
            return new f(this.b, eVar);
        }

        public final Object invoke(Ga.e eVar) {
            return create(eVar).invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                Qa.l lVar = this.b;
                this.a = 1;
                obj = lVar.invoke(this);
                if (obj == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
            }
            return obj;
        }
    }

    public static final class g extends Ia.d {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public g(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return k.i(k.this, null, this);
        }
    }

    public static final class h extends Ia.d {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public h(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return k.j(k.this, this);
        }
    }

    public static final class i extends Ia.l implements Qa.p {
        public int a;

        public static final class a implements fb.f {
            public final /* synthetic */ k a;

            public a(k kVar) {
                this.a = kVar;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Ca.I i, Ga.e eVar) {
                if (k.d(this.a).a() instanceof o2.r) {
                    return Ca.I.a;
                }
                Object l = k.l(this.a, true, eVar);
                return l == Ha.c.f() ? l : Ca.I.a;
            }
        }

        public i(Ga.e eVar) {
            super(2, eVar);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return k.this.new i(eVar);
        }

        public final Object invoke(cb.O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                b e = k.e(k.this);
                this.a = 1;
                if (e.a(this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ca.t.b(obj);
                    return Ca.I.a;
                }
                Ca.t.b(obj);
            }
            fb.e k = fb.g.k(k.c(k.this).c());
            a aVar = new a(k.this);
            this.a = 2;
            if (k.collect(aVar, this) == f) {
                return f;
            }
            return Ca.I.a;
        }
    }

    public static final class j extends Ia.d {
        public Object a;
        public int b;
        public /* synthetic */ Object c;
        public int e;

        public j(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return k.k(k.this, this);
        }
    }

    public static final class k extends Ia.d {
        public Object a;
        public Object b;
        public boolean c;
        public /* synthetic */ Object d;
        public int f;

        public k(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return k.l(k.this, false, this);
        }
    }

    public static final class l extends Ia.l implements Qa.l {
        public Object a;
        public int b;

        public l(Ga.e eVar) {
            super(1, eVar);
        }

        public final Ga.e create(Ga.e eVar) {
            return k.this.new l(eVar);
        }

        public final Object invoke(Ga.e eVar) {
            return create(eVar).invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Throwable th;
            I i;
            Object f = Ha.c.f();
            int i2 = this.b;
            try {
            } catch (Throwable th2) {
                o2.t c = k.c(k.this);
                this.a = th2;
                this.b = 2;
                Object version = c.getVersion(this);
                if (version == f) {
                    return f;
                }
                th = th2;
                obj = version;
            }
            if (i2 == 0) {
                Ca.t.b(obj);
                k kVar = k.this;
                this.b = 1;
                obj = k.n(kVar, true, this);
                if (obj == f) {
                    return f;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) this.a;
                    Ca.t.b(obj);
                    i = new B(th, ((Number) obj).intValue());
                    return Ca.x.a(i, Ia.b.a(true));
                }
                Ca.t.b(obj);
            }
            i = (I) obj;
            return Ca.x.a(i, Ia.b.a(true));
        }
    }

    public static final class m extends Ia.l implements Qa.p {
        public Object a;
        public int b;
        public /* synthetic */ boolean c;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(int i, Ga.e eVar) {
            super(2, eVar);
            this.e = i;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            m mVar = k.this.new m(this.e, eVar);
            mVar.c = ((Boolean) obj).booleanValue();
            return mVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Ga.e) obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v9 */
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            int i;
            boolean z;
            I i2;
            boolean z2;
            Object f = Ha.c.f();
            boolean z3 = this.b;
            try {
            } catch (Throwable th2) {
                if (z3 != 0) {
                    o2.t c = k.c(k.this);
                    this.a = th2;
                    this.c = z3;
                    this.b = 2;
                    Object version = c.getVersion(this);
                    if (version == f) {
                        return f;
                    }
                    z = z3;
                    th = th2;
                    obj = version;
                } else {
                    boolean z4 = z3;
                    th = th2;
                    i = this.e;
                    z = z4;
                }
            }
            if (z3 == 0) {
                Ca.t.b(obj);
                boolean z5 = this.c;
                k kVar = k.this;
                this.c = z5;
                this.b = 1;
                obj = k.n(kVar, z5, this);
                z3 = z5;
                if (obj == f) {
                    return f;
                }
            } else {
                if (z3 != 1) {
                    if (z3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = this.c;
                    th = (Throwable) this.a;
                    Ca.t.b(obj);
                    i = ((Number) obj).intValue();
                    B b = new B(th, i);
                    z2 = z;
                    i2 = b;
                    return Ca.x.a(i2, Ia.b.a(z2));
                }
                boolean z6 = this.c;
                Ca.t.b(obj);
                z3 = z6;
            }
            i2 = (I) obj;
            z2 = z3;
            return Ca.x.a(i2, Ia.b.a(z2));
        }

        public final Object invoke(boolean z, Ga.e eVar) {
            return create(Boolean.valueOf(z), eVar).invokeSuspend(Ca.I.a);
        }
    }

    public static final class n extends Ia.d {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public boolean e;
        public int f;
        public /* synthetic */ Object g;
        public int i;

        public n(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return k.n(k.this, false, this);
        }
    }

    public static final class o extends Ia.l implements Qa.p {
        public Object a;
        public int b;
        public /* synthetic */ boolean c;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(int i, Ga.e eVar) {
            super(2, eVar);
            this.e = i;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            o oVar = k.this.new o(this.e, eVar);
            oVar.c = ((Boolean) obj).booleanValue();
            return oVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Ga.e) obj2);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0059  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = Ha.c.f()
                int r1 = r5.b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r5.a
                Ca.t.b(r6)
                goto L49
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                boolean r1 = r5.c
                Ca.t.b(r6)
                goto L34
            L22:
                Ca.t.b(r6)
                boolean r1 = r5.c
                o2.k r6 = o2.k.this
                r5.c = r1
                r5.b = r3
                java.lang.Object r6 = o2.k.m(r6, r5)
                if (r6 != r0) goto L34
                return r0
            L34:
                if (r1 == 0) goto L50
                o2.k r1 = o2.k.this
                o2.t r1 = o2.k.c(r1)
                r5.a = r6
                r5.b = r2
                java.lang.Object r1 = r1.getVersion(r5)
                if (r1 != r0) goto L47
                return r0
            L47:
                r0 = r6
                r6 = r1
            L49:
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                goto L55
            L50:
                int r0 = r5.e
                r4 = r0
                r0 = r6
                r6 = r4
            L55:
                o2.f r1 = new o2.f
                if (r0 == 0) goto L5e
                int r2 = r0.hashCode()
                goto L5f
            L5e:
                r2 = 0
            L5f:
                r1.<init>(r0, r2, r6)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o2.k.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(boolean z, Ga.e eVar) {
            return create(Boolean.valueOf(z), eVar).invokeSuspend(Ca.I.a);
        }
    }

    public static final class p extends Ia.l implements Qa.l {
        public Object a;
        public int b;
        public final /* synthetic */ kotlin.jvm.internal.O c;
        public final /* synthetic */ k d;
        public final /* synthetic */ kotlin.jvm.internal.M e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(kotlin.jvm.internal.O o, k kVar, kotlin.jvm.internal.M m, Ga.e eVar) {
            super(1, eVar);
            this.c = o;
            this.d = kVar;
            this.e = m;
        }

        public final Ga.e create(Ga.e eVar) {
            return new p(this.c, this.d, this.e, eVar);
        }

        public final Object invoke(Ga.e eVar) {
            return create(eVar).invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            kotlin.jvm.internal.M m;
            kotlin.jvm.internal.O o;
            kotlin.jvm.internal.M m2;
            Object f = Ha.c.f();
            int i = this.b;
            try {
            } catch (o2.d unused) {
                kotlin.jvm.internal.M m3 = this.e;
                k kVar = this.d;
                Object obj2 = this.c.a;
                this.a = m3;
                this.b = 3;
                Object B = kVar.B(obj2, true, this);
                if (B == f) {
                    return f;
                }
                m = m3;
                obj = B;
            }
            if (i == 0) {
                Ca.t.b(obj);
                o = this.c;
                k kVar2 = this.d;
                this.a = o;
                this.b = 1;
                obj = k.m(kVar2, this);
                if (obj == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        m2 = (kotlin.jvm.internal.M) this.a;
                        Ca.t.b(obj);
                        m2.a = ((Number) obj).intValue();
                        return Ca.I.a;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m = (kotlin.jvm.internal.M) this.a;
                    Ca.t.b(obj);
                    m.a = ((Number) obj).intValue();
                    return Ca.I.a;
                }
                o = (kotlin.jvm.internal.O) this.a;
                Ca.t.b(obj);
            }
            o.a = obj;
            m2 = this.e;
            o2.t c = k.c(this.d);
            this.a = m2;
            this.b = 2;
            obj = c.getVersion(this);
            if (obj == f) {
                return f;
            }
            m2.a = ((Number) obj).intValue();
            return Ca.I.a;
        }
    }

    public static final class q extends Ia.l implements Qa.p {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(boolean z, Ga.e eVar) {
            super(2, eVar);
            this.c = z;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return k.this.new q(this.c, eVar);
        }

        public final Object invoke(cb.O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            try {
                if (i == 0) {
                    Ca.t.b(obj);
                    if (k.d(k.this).a() instanceof o2.r) {
                        return k.d(k.this).a();
                    }
                    k kVar = k.this;
                    this.a = 1;
                    if (k.k(kVar, this) == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Ca.t.b(obj);
                        return (I) obj;
                    }
                    Ca.t.b(obj);
                }
                k kVar2 = k.this;
                boolean z = this.c;
                this.a = 2;
                obj = k.l(kVar2, z, this);
                if (obj == f) {
                    return f;
                }
                return (I) obj;
            } catch (Throwable th) {
                return new B(th, -1);
            }
        }
    }

    public static final class r extends kotlin.jvm.internal.u implements Qa.a {
        public r() {
            super(0);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K invoke() {
            return k.f(k.this).a();
        }
    }

    public static final class s extends Ia.l implements Qa.l {
        public Object a;
        public int b;
        public final /* synthetic */ Ga.i d;
        public final /* synthetic */ Qa.p e;

        public static final class a extends Ia.l implements Qa.p {
            public int a;
            public final /* synthetic */ Qa.p b;
            public final /* synthetic */ o2.f c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Qa.p pVar, o2.f fVar, Ga.e eVar) {
                super(2, eVar);
                this.b = pVar;
                this.c = fVar;
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                return new a(this.b, this.c, eVar);
            }

            public final Object invoke(cb.O o, Ga.e eVar) {
                return create(o, eVar).invokeSuspend(Ca.I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = Ha.c.f();
                int i = this.a;
                if (i == 0) {
                    Ca.t.b(obj);
                    Qa.p pVar = this.b;
                    Object c = this.c.c();
                    this.a = 1;
                    obj = pVar.invoke(c, this);
                    if (obj == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ca.t.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Ga.i iVar, Qa.p pVar, Ga.e eVar) {
            super(1, eVar);
            this.d = iVar;
            this.e = pVar;
        }

        public final Ga.e create(Ga.e eVar) {
            return k.this.new s(this.d, this.e, eVar);
        }

        public final Object invoke(Ga.e eVar) {
            return create(eVar).invokeSuspend(Ca.I.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = Ha.c.f()
                int r1 = r8.b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2b
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r8.a
                Ca.t.b(r9)
                goto L6c
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.a
                o2.f r1 = (o2.f) r1
                Ca.t.b(r9)
                goto L51
            L27:
                Ca.t.b(r9)
                goto L39
            L2b:
                Ca.t.b(r9)
                o2.k r9 = o2.k.this
                r8.b = r4
                java.lang.Object r9 = o2.k.n(r9, r4, r8)
                if (r9 != r0) goto L39
                return r0
            L39:
                r1 = r9
                o2.f r1 = (o2.f) r1
                Ga.i r9 = r8.d
                o2.k$s$a r5 = new o2.k$s$a
                Qa.p r6 = r8.e
                r7 = 0
                r5.<init>(r6, r1, r7)
                r8.a = r1
                r8.b = r3
                java.lang.Object r9 = cb.i.g(r9, r5, r8)
                if (r9 != r0) goto L51
                return r0
            L51:
                r1.b()
                java.lang.Object r1 = r1.c()
                boolean r1 = kotlin.jvm.internal.t.c(r1, r9)
                if (r1 != 0) goto L6d
                o2.k r1 = o2.k.this
                r8.a = r9
                r8.b = r2
                java.lang.Object r1 = r1.B(r9, r4, r8)
                if (r1 != r0) goto L6b
                return r0
            L6b:
                r0 = r9
            L6c:
                r9 = r0
            L6d:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: o2.k.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class t extends Ia.l implements Qa.p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Qa.p d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(Qa.p pVar, Ga.e eVar) {
            super(2, eVar);
            this.d = pVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            t tVar = k.this.new t(this.d, eVar);
            tVar.b = obj;
            return tVar;
        }

        public final Object invoke(cb.O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                cb.O o = (cb.O) this.b;
                cb.x b = cb.z.b((B0) null, 1, (Object) null);
                k.h(k.this).e(new w.a(this.d, b, k.d(k.this).a(), o.getCoroutineContext()));
                this.a = 1;
                obj = b.await(this);
                if (obj == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
            }
            return obj;
        }
    }

    public static final class u extends kotlin.jvm.internal.u implements Qa.l {
        public u() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Ca.I.a;
        }

        public final void invoke(Throwable th) {
            if (th != null) {
                k.d(k.this).c(new o2.r(th));
            }
            if (k.g(k.this).isInitialized()) {
                k.this.s().close();
            }
        }
    }

    public static final class v extends kotlin.jvm.internal.u implements Qa.p {
        public static final v a = new v();

        public v() {
            super(2);
        }

        public final void a(w.a aVar, Throwable th) {
            kotlin.jvm.internal.t.g(aVar, "msg");
            cb.x a2 = aVar.a();
            if (th == null) {
                th = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            a2.b(th);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((w.a) obj, (Throwable) obj2);
            return Ca.I.a;
        }
    }

    public static final class w extends Ia.l implements Qa.p {
        public int a;
        public /* synthetic */ Object b;

        public w(Ga.e eVar) {
            super(2, eVar);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(w.a aVar, Ga.e eVar) {
            return create(aVar, eVar).invokeSuspend(Ca.I.a);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            w wVar = k.this.new w(eVar);
            wVar.b = obj;
            return wVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                w.a aVar = (w.a) this.b;
                k kVar = k.this;
                this.a = 1;
                if (k.i(kVar, aVar, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
            }
            return Ca.I.a;
        }
    }

    public static final class x extends Ia.d {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public x(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return k.this.B(null, false, this);
        }
    }

    public static final class y extends Ia.l implements Qa.p {
        public Object a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ kotlin.jvm.internal.M d;
        public final /* synthetic */ k e;
        public final /* synthetic */ Object f;
        public final /* synthetic */ boolean g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(kotlin.jvm.internal.M m, k kVar, Object obj, boolean z, Ga.e eVar) {
            super(2, eVar);
            this.d = m;
            this.e = kVar;
            this.f = obj;
            this.g = z;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(P p, Ga.e eVar) {
            return create(p, eVar).invokeSuspend(Ca.I.a);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            y yVar = new y(this.d, this.e, this.f, this.g, eVar);
            yVar.c = obj;
            return yVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0061  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = Ha.c.f()
                int r1 = r6.b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                Ca.t.b(r7)
                goto L5d
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.a
                kotlin.jvm.internal.M r1 = (kotlin.jvm.internal.M) r1
                java.lang.Object r3 = r6.c
                o2.P r3 = (o2.P) r3
                Ca.t.b(r7)
                goto L45
            L26:
                Ca.t.b(r7)
                java.lang.Object r7 = r6.c
                o2.P r7 = (o2.P) r7
                kotlin.jvm.internal.M r1 = r6.d
                o2.k r4 = r6.e
                o2.t r4 = o2.k.c(r4)
                r6.c = r7
                r6.a = r1
                r6.b = r3
                java.lang.Object r3 = r4.b(r6)
                if (r3 != r0) goto L42
                return r0
            L42:
                r5 = r3
                r3 = r7
                r7 = r5
            L45:
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                r1.a = r7
                java.lang.Object r7 = r6.f
                r1 = 0
                r6.c = r1
                r6.a = r1
                r6.b = r2
                java.lang.Object r7 = r3.c(r7, r6)
                if (r7 != r0) goto L5d
                return r0
            L5d:
                boolean r7 = r6.g
                if (r7 == 0) goto L7d
                o2.k r7 = r6.e
                o2.l r7 = o2.k.d(r7)
                o2.f r0 = new o2.f
                java.lang.Object r1 = r6.f
                if (r1 == 0) goto L72
                int r2 = r1.hashCode()
                goto L73
            L72:
                r2 = 0
            L73:
                kotlin.jvm.internal.M r3 = r6.d
                int r3 = r3.a
                r0.<init>(r1, r2, r3)
                r7.c(r0)
            L7d:
                Ca.I r7 = Ca.I.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o2.k.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public k(J j2, List list, o2.e eVar, cb.O o2) {
        kotlin.jvm.internal.t.g(j2, "storage");
        kotlin.jvm.internal.t.g(list, "initTasksList");
        kotlin.jvm.internal.t.g(eVar, "corruptionHandler");
        kotlin.jvm.internal.t.g(o2, "scope");
        this.a = j2;
        this.b = eVar;
        this.c = o2;
        this.d = fb.g.v(new d(null));
        this.e = lb.g.b(false, 1, (Object) null);
        this.h = new o2.l();
        this.i = new b(this, list);
        this.j = Ca.m.b(new r());
        this.k = Ca.m.b(new c());
        this.l = new G(o2, new u(), v.a, new w(null));
    }

    public static final /* synthetic */ Object b(k kVar, Ga.e eVar) {
        return kVar.p(eVar);
    }

    public static final /* synthetic */ o2.t c(k kVar) {
        return kVar.r();
    }

    public static final /* synthetic */ o2.l d(k kVar) {
        return kVar.h;
    }

    public static final /* synthetic */ b e(k kVar) {
        return kVar.i;
    }

    public static final /* synthetic */ J f(k kVar) {
        return kVar.a;
    }

    public static final /* synthetic */ Ca.l g(k kVar) {
        return kVar.j;
    }

    public static final /* synthetic */ G h(k kVar) {
        return kVar.l;
    }

    public static final /* synthetic */ Object i(k kVar, w.a aVar, Ga.e eVar) {
        return kVar.t(aVar, eVar);
    }

    public static final /* synthetic */ Object j(k kVar, Ga.e eVar) {
        return kVar.u(eVar);
    }

    public static final /* synthetic */ Object k(k kVar, Ga.e eVar) {
        return kVar.v(eVar);
    }

    public static final /* synthetic */ Object l(k kVar, boolean z, Ga.e eVar) {
        return kVar.w(z, eVar);
    }

    public static final /* synthetic */ Object m(k kVar, Ga.e eVar) {
        return kVar.x(eVar);
    }

    public static final /* synthetic */ Object n(k kVar, boolean z, Ga.e eVar) {
        return kVar.y(z, eVar);
    }

    public static final /* synthetic */ Object o(k kVar, boolean z, Ga.e eVar) {
        return kVar.z(z, eVar);
    }

    public final Object A(Qa.p pVar, Ga.i iVar, Ga.e eVar) {
        return r().d(new s(iVar, pVar, null), eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object B(java.lang.Object r12, boolean r13, Ga.e r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof o2.k.x
            if (r0 == 0) goto L13
            r0 = r14
            o2.k$x r0 = (o2.k.x) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            o2.k$x r0 = new o2.k$x
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.b
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r12 = r0.a
            kotlin.jvm.internal.M r12 = (kotlin.jvm.internal.M) r12
            Ca.t.b(r14)
            goto L58
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            Ca.t.b(r14)
            kotlin.jvm.internal.M r14 = new kotlin.jvm.internal.M
            r14.<init>()
            o2.K r2 = r11.s()
            o2.k$y r10 = new o2.k$y
            r9 = 0
            r4 = r10
            r5 = r14
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.a = r14
            r0.d = r3
            java.lang.Object r12 = r2.d(r10, r0)
            if (r12 != r1) goto L57
            return r1
        L57:
            r12 = r14
        L58:
            int r12 = r12.a
            java.lang.Integer r12 = Ia.b.d(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.k.B(java.lang.Object, boolean, Ga.e):java.lang.Object");
    }

    public Object a(Qa.p pVar, Ga.e eVar) {
        O o2 = (O) eVar.getContext().get(O.a.a.a);
        if (o2 != null) {
            o2.c(this);
        }
        return cb.i.g(new O(o2, this), new t(pVar, null), eVar);
    }

    public fb.e getData() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(Ga.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof o2.k.e
            if (r0 == 0) goto L13
            r0 = r6
            o2.k$e r0 = (o2.k.e) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            o2.k$e r0 = new o2.k$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.c
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.b
            lb.a r1 = (lb.a) r1
            java.lang.Object r0 = r0.a
            o2.k r0 = (o2.k) r0
            Ca.t.b(r6)
            goto L4e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            Ca.t.b(r6)
            lb.a r6 = r5.e
            r0.a = r5
            r0.b = r6
            r0.e = r3
            java.lang.Object r0 = r6.d(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
            r1 = r6
        L4e:
            int r6 = r0.f     // Catch: java.lang.Throwable -> L5e
            int r6 = r6 + (-1)
            r0.f = r6     // Catch: java.lang.Throwable -> L5e
            if (r6 != 0) goto L62
            cb.B0 r6 = r0.g     // Catch: java.lang.Throwable -> L5e
            if (r6 == 0) goto L60
            cb.B0.a.b(r6, r4, r3, r4)     // Catch: java.lang.Throwable -> L5e
            goto L60
        L5e:
            r6 = move-exception
            goto L6a
        L60:
            r0.g = r4     // Catch: java.lang.Throwable -> L5e
        L62:
            Ca.I r6 = Ca.I.a     // Catch: java.lang.Throwable -> L5e
            r1.e(r4)
            Ca.I r6 = Ca.I.a
            return r6
        L6a:
            r1.e(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.k.p(Ga.e):java.lang.Object");
    }

    public final Object q(boolean z, Qa.l lVar, Ga.e eVar) {
        return z ? lVar.invoke(eVar) : r().d(new f(lVar, null), eVar);
    }

    public final o2.t r() {
        return (o2.t) this.k.getValue();
    }

    public final K s() {
        return (K) this.j.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(o2.w.a r9, Ga.e r10) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.k.t(o2.w$a, Ga.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(Ga.e r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof o2.k.h
            if (r0 == 0) goto L13
            r0 = r12
            o2.k$h r0 = (o2.k.h) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            o2.k$h r0 = new o2.k$h
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.c
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.b
            lb.a r1 = (lb.a) r1
            java.lang.Object r0 = r0.a
            o2.k r0 = (o2.k) r0
            Ca.t.b(r12)
            goto L4e
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3a:
            Ca.t.b(r12)
            lb.a r12 = r11.e
            r0.a = r11
            r0.b = r12
            r0.e = r3
            java.lang.Object r0 = r12.d(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r11
            r1 = r12
        L4e:
            int r12 = r0.f     // Catch: java.lang.Throwable -> L67
            int r12 = r12 + r3
            r0.f = r12     // Catch: java.lang.Throwable -> L67
            if (r12 != r3) goto L69
            cb.O r5 = r0.c     // Catch: java.lang.Throwable -> L67
            o2.k$i r8 = new o2.k$i     // Catch: java.lang.Throwable -> L67
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L67
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            cb.B0 r12 = cb.i.d(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L67
            r0.g = r12     // Catch: java.lang.Throwable -> L67
            goto L69
        L67:
            r12 = move-exception
            goto L71
        L69:
            Ca.I r12 = Ca.I.a     // Catch: java.lang.Throwable -> L67
            r1.e(r4)
            Ca.I r12 = Ca.I.a
            return r12
        L71:
            r1.e(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.k.u(Ga.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(Ga.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof o2.k.j
            if (r0 == 0) goto L13
            r0 = r6
            o2.k$j r0 = (o2.k.j) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            o2.k$j r0 = new o2.k$j
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.c
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            int r1 = r0.b
            java.lang.Object r0 = r0.a
            o2.k r0 = (o2.k) r0
            Ca.t.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L6c
        L32:
            r6 = move-exception
            goto L73
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3c:
            java.lang.Object r2 = r0.a
            o2.k r2 = (o2.k) r2
            Ca.t.b(r6)
            goto L57
        L44:
            Ca.t.b(r6)
            o2.t r6 = r5.r()
            r0.a = r5
            r0.e = r4
            java.lang.Object r6 = r6.getVersion(r0)
            if (r6 != r1) goto L56
            return r1
        L56:
            r2 = r5
        L57:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            o2.k$b r4 = r2.i     // Catch: java.lang.Throwable -> L6f
            r0.a = r2     // Catch: java.lang.Throwable -> L6f
            r0.b = r6     // Catch: java.lang.Throwable -> L6f
            r0.e = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r6 = r4.c(r0)     // Catch: java.lang.Throwable -> L6f
            if (r6 != r1) goto L6c
            return r1
        L6c:
            Ca.I r6 = Ca.I.a
            return r6
        L6f:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L73:
            o2.l r0 = r0.h
            o2.B r2 = new o2.B
            r2.<init>(r6, r1)
            r0.c(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.k.v(Ga.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(boolean r10, Ga.e r11) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.k.w(boolean, Ga.e):java.lang.Object");
    }

    public final Object x(Ga.e eVar) {
        return L.a(s(), eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object y(boolean r11, Ga.e r12) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.k.y(boolean, Ga.e):java.lang.Object");
    }

    public final Object z(boolean z, Ga.e eVar) {
        return cb.i.g(this.c.getCoroutineContext(), new q(z, null), eVar);
    }
}
