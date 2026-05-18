package fb;

import eb.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class m {

    public static final class a extends Ia.l implements Qa.q {
        public Object a;
        public Object b;
        public int c;
        public /* synthetic */ Object d;
        public /* synthetic */ Object e;
        public final /* synthetic */ Qa.l f;
        public final /* synthetic */ e g;

        public static final class a extends Ia.l implements Qa.l {
            public int a;
            public final /* synthetic */ f b;
            public final /* synthetic */ kotlin.jvm.internal.O c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar, kotlin.jvm.internal.O o, Ga.e eVar) {
                super(1, eVar);
                this.b = fVar;
                this.c = o;
            }

            public final Ga.e create(Ga.e eVar) {
                return new a(this.b, this.c, eVar);
            }

            public final Object invoke(Ga.e eVar) {
                return ((a) create(eVar)).invokeSuspend(Ca.I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = Ha.c.f();
                int i = this.a;
                if (i == 0) {
                    Ca.t.b(obj);
                    f fVar = this.b;
                    hb.D d = gb.s.a;
                    Object obj2 = this.c.a;
                    if (obj2 == d) {
                        obj2 = null;
                    }
                    this.a = 1;
                    if (fVar.emit(obj2, this) == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ca.t.b(obj);
                }
                this.c.a = null;
                return Ca.I.a;
            }
        }

        public static final class b extends Ia.l implements Qa.p {
            public Object a;
            public int b;
            public /* synthetic */ Object c;
            public final /* synthetic */ kotlin.jvm.internal.O d;
            public final /* synthetic */ f e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(kotlin.jvm.internal.O o, f fVar, Ga.e eVar) {
                super(2, eVar);
                this.d = o;
                this.e = fVar;
            }

            public final Object a(Object obj, Ga.e eVar) {
                return ((b) create(eb.k.b(obj), eVar)).invokeSuspend(Ca.I.a);
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                b bVar = new b(this.d, this.e, eVar);
                bVar.c = obj;
                return bVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a(((eb.k) obj).k(), (Ga.e) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                kotlin.jvm.internal.O o;
                kotlin.jvm.internal.O o2;
                Object f = Ha.c.f();
                int i = this.b;
                if (i == 0) {
                    Ca.t.b(obj);
                    Object k = ((eb.k) this.c).k();
                    o = this.d;
                    boolean z = k instanceof k.c;
                    if (!z) {
                        o.a = k;
                    }
                    f fVar = this.e;
                    if (z) {
                        Throwable e = eb.k.e(k);
                        if (e != null) {
                            throw e;
                        }
                        Object obj2 = o.a;
                        if (obj2 != null) {
                            if (obj2 == gb.s.a) {
                                obj2 = null;
                            }
                            this.c = k;
                            this.a = o;
                            this.b = 1;
                            if (fVar.emit(obj2, this) == f) {
                                return f;
                            }
                            o2 = o;
                        }
                        o.a = gb.s.c;
                    }
                    return Ca.I.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o2 = (kotlin.jvm.internal.O) this.a;
                Ca.t.b(obj);
                o = o2;
                o.a = gb.s.c;
                return Ca.I.a;
            }
        }

        public static final class c extends Ia.l implements Qa.p {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ e c;

            public static final class a implements f {
                public final /* synthetic */ eb.v a;

                public static final class a extends Ia.d {
                    public /* synthetic */ Object a;
                    public int c;

                    public a(Ga.e eVar) {
                        super(eVar);
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.c |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(eb.v vVar) {
                    this.a = vVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, Ga.e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof fb.m.a.c.a.a
                        if (r0 == 0) goto L13
                        r0 = r6
                        fb.m$a$c$a$a r0 = (fb.m.a.c.a.a) r0
                        int r1 = r0.c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.c = r1
                        goto L18
                    L13:
                        fb.m$a$c$a$a r0 = new fb.m$a$c$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.a
                        java.lang.Object r1 = Ha.c.f()
                        int r2 = r0.c
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        Ca.t.b(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        Ca.t.b(r6)
                        eb.v r6 = r4.a
                        if (r5 != 0) goto L3a
                        hb.D r5 = gb.s.a
                    L3a:
                        r0.c = r3
                        java.lang.Object r5 = r6.e(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        Ca.I r5 = Ca.I.a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: fb.m.a.c.a.emit(java.lang.Object, Ga.e):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(e eVar, Ga.e eVar2) {
                super(2, eVar2);
                this.c = eVar;
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                c cVar = new c(this.c, eVar);
                cVar.b = obj;
                return cVar;
            }

            public final Object invoke(eb.v vVar, Ga.e eVar) {
                return ((c) create(vVar, eVar)).invokeSuspend(Ca.I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = Ha.c.f();
                int i = this.a;
                if (i == 0) {
                    Ca.t.b(obj);
                    eb.v vVar = (eb.v) this.b;
                    e eVar = this.c;
                    a aVar = new a(vVar);
                    this.a = 1;
                    if (eVar.collect(aVar, this) == f) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Qa.l lVar, e eVar, Ga.e eVar2) {
            super(3, eVar2);
            this.f = lVar;
            this.g = eVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(cb.O o, f fVar, Ga.e eVar) {
            a aVar = new a(this.f, this.g, eVar);
            aVar.d = o;
            aVar.e = fVar;
            return aVar.invokeSuspend(Ca.I.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0066  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00e2 -> B:6:0x001e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 232
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: fb.m.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static /* synthetic */ long a(long j, Object obj) {
        return c(j, obj);
    }

    public static final e b(e eVar, long j) {
        if (j >= 0) {
            return j == 0 ? eVar : d(eVar, new l(j));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    public static final e d(e eVar, Qa.l lVar) {
        return gb.n.b(new a(lVar, eVar, null));
    }

    public static final long c(long j, Object obj) {
        return j;
    }
}
