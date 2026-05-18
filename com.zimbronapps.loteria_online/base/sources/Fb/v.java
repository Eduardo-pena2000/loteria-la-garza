package fb;

import cb.B0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class v {

    public static final class a extends Ia.l implements Qa.p {
        public int a;
        public final /* synthetic */ J b;
        public final /* synthetic */ e c;
        public final /* synthetic */ y d;
        public final /* synthetic */ Object e;

        public static final class a extends Ia.l implements Qa.p {
            public int a;
            public /* synthetic */ int b;

            public a(Ga.e eVar) {
                super(2, eVar);
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                a aVar = new a(eVar);
                aVar.b = ((Number) obj).intValue();
                return aVar;
            }

            public final Object invoke(int i, Ga.e eVar) {
                return ((a) create(Integer.valueOf(i), eVar)).invokeSuspend(Ca.I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Ha.c.f();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
                return Ia.b.a(this.b > 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (Ga.e) obj2);
            }
        }

        public static final class b extends Ia.l implements Qa.p {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ e c;
            public final /* synthetic */ y d;
            public final /* synthetic */ Object e;

            public /* synthetic */ class a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[H.values().length];
                    try {
                        iArr[H.a.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[H.b.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[H.c.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(e eVar, y yVar, Object obj, Ga.e eVar2) {
                super(2, eVar2);
                this.c = eVar;
                this.d = yVar;
                this.e = obj;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(H h, Ga.e eVar) {
                return ((b) create(h, eVar)).invokeSuspend(Ca.I.a);
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                b bVar = new b(this.c, this.d, this.e, eVar);
                bVar.b = obj;
                return bVar;
            }

            public final Object invokeSuspend(Object obj) {
                Object f = Ha.c.f();
                int i = this.a;
                if (i == 0) {
                    Ca.t.b(obj);
                    int i2 = a.a[((H) this.b).ordinal()];
                    if (i2 == 1) {
                        e eVar = this.c;
                        y yVar = this.d;
                        this.a = 1;
                        if (eVar.collect(yVar, this) == f) {
                            return f;
                        }
                    } else if (i2 != 2) {
                        if (i2 != 3) {
                            throw new Ca.o();
                        }
                        Object obj2 = this.e;
                        if (obj2 == F.a) {
                            this.d.f();
                        } else {
                            Ia.b.a(this.d.b(obj2));
                        }
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
        public a(J j, e eVar, y yVar, Object obj, Ga.e eVar2) {
            super(2, eVar2);
            this.b = j;
            this.c = eVar;
            this.d = yVar;
            this.e = obj;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return new a(this.b, this.c, this.d, this.e, eVar);
        }

        public final Object invoke(cb.O o, Ga.e eVar) {
            return ((a) create(o, eVar)).invokeSuspend(Ca.I.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0068 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = Ha.c.f()
                int r1 = r7.a
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                Ca.t.b(r8)
                goto L5c
            L21:
                Ca.t.b(r8)
                goto L8d
            L25:
                Ca.t.b(r8)
                fb.J r8 = r7.b
                fb.J$a r1 = fb.J.a
                fb.J r6 = r1.c()
                if (r8 != r6) goto L3f
                fb.e r8 = r7.c
                fb.y r1 = r7.d
                r7.a = r5
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L3f:
                fb.J r8 = r7.b
                fb.J r1 = r1.d()
                r5 = 0
                if (r8 != r1) goto L69
                fb.y r8 = r7.d
                fb.N r8 = r8.c()
                fb.v$a$a r1 = new fb.v$a$a
                r1.<init>(r5)
                r7.a = r4
                java.lang.Object r8 = fb.g.t(r8, r1, r7)
                if (r8 != r0) goto L5c
                return r0
            L5c:
                fb.e r8 = r7.c
                fb.y r1 = r7.d
                r7.a = r3
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L69:
                fb.J r8 = r7.b
                fb.y r1 = r7.d
                fb.N r1 = r1.c()
                fb.e r8 = r8.a(r1)
                fb.e r8 = fb.g.m(r8)
                fb.v$a$b r1 = new fb.v$a$b
                fb.e r3 = r7.c
                fb.y r4 = r7.d
                java.lang.Object r6 = r7.e
                r1.<init>(r3, r4, r6, r5)
                r7.a = r2
                java.lang.Object r8 = fb.g.j(r8, r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L8d:
                Ca.I r8 = Ca.I.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: fb.v.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final D a(y yVar) {
        return new A(yVar, null);
    }

    public static final N b(z zVar) {
        return new B(zVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final fb.I c(fb.e r7, int r8) {
        /*
            eb.g$a r0 = eb.g.R8
            int r0 = r0.a()
            int r0 = Wa.n.e(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof gb.e
            if (r1 == 0) goto L3c
            r1 = r7
            gb.e r1 = (gb.e) r1
            fb.e r2 = r1.j()
            if (r2 == 0) goto L3c
            fb.I r7 = new fb.I
            int r3 = r1.b
            r4 = -3
            if (r3 == r4) goto L26
            r4 = -2
            if (r3 == r4) goto L26
            if (r3 == 0) goto L26
            r0 = r3
            goto L34
        L26:
            eb.a r4 = r1.c
            eb.a r5 = eb.a.a
            r6 = 0
            if (r4 != r5) goto L31
            if (r3 != 0) goto L34
        L2f:
            r0 = r6
            goto L34
        L31:
            if (r8 != 0) goto L2f
            r0 = 1
        L34:
            eb.a r8 = r1.c
            Ga.i r1 = r1.a
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3c:
            fb.I r8 = new fb.I
            eb.a r1 = eb.a.a
            Ga.j r2 = Ga.j.a
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.v.c(fb.e, int):fb.I");
    }

    public static final B0 d(cb.O o, Ga.i iVar, e eVar, y yVar, J j, Object obj) {
        return cb.i.c(o, iVar, kotlin.jvm.internal.t.c(j, J.a.c()) ? cb.Q.a : cb.Q.d, new a(j, eVar, yVar, obj, null));
    }

    public static final D e(D d, Qa.p pVar) {
        return new T(d, pVar);
    }

    public static final D f(e eVar, cb.O o, J j, int i) {
        I c = c(eVar, i);
        y a2 = F.a(i, c.b, c.c);
        return new A(a2, d(o, c.d, c.a, a2, j, F.a));
    }

    public static final N g(e eVar, cb.O o, J j, Object obj) {
        I c = c(eVar, 1);
        z a2 = P.a(obj);
        return new B(a2, d(o, c.d, c.a, a2, j, obj));
    }
}
