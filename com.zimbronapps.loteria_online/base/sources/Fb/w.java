package fb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class w {

    public static final class a implements e {
        public final /* synthetic */ e a;

        public static final class a implements f {
            public final /* synthetic */ f a;

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

            public a(f fVar) {
                this.a = fVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, Ga.e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof fb.w.a.a.a
                    if (r0 == 0) goto L13
                    r0 = r6
                    fb.w$a$a$a r0 = (fb.w.a.a.a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    fb.w$a$a$a r0 = new fb.w$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = Ha.c.f()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    Ca.t.b(r6)
                    goto L41
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    Ca.t.b(r6)
                    fb.f r6 = r4.a
                    if (r5 == 0) goto L41
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L41
                    return r1
                L41:
                    Ca.I r5 = Ca.I.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: fb.w.a.a.emit(java.lang.Object, Ga.e):java.lang.Object");
            }
        }

        public a(e eVar) {
            this.a = eVar;
        }

        public Object collect(f fVar, Ga.e eVar) {
            Object collect = this.a.collect(new a(fVar), eVar);
            return collect == Ha.c.f() ? collect : Ca.I.a;
        }
    }

    public static final class b implements e {
        public final /* synthetic */ e a;
        public final /* synthetic */ Qa.p b;

        public static final class a implements f {
            public final /* synthetic */ f a;
            public final /* synthetic */ Qa.p b;

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
                    return a.this.emit(null, this);
                }
            }

            public a(f fVar, Qa.p pVar) {
                this.a = fVar;
                this.b = pVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r6, Ga.e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof fb.w.b.a.a
                    if (r0 == 0) goto L13
                    r0 = r7
                    fb.w$b$a$a r0 = (fb.w.b.a.a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    fb.w$b$a$a r0 = new fb.w$b$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.a
                    java.lang.Object r1 = Ha.c.f()
                    int r2 = r0.b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    Ca.t.b(r7)
                    goto L6a
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.e
                    fb.f r6 = (fb.f) r6
                    java.lang.Object r2 = r0.d
                    Ca.t.b(r7)
                    goto L5c
                L3e:
                    Ca.t.b(r7)
                    fb.f r7 = r5.a
                    Qa.p r2 = r5.b
                    r0.d = r6
                    r0.e = r7
                    r0.b = r4
                    r4 = 6
                    kotlin.jvm.internal.r.c(r4)
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    r4 = 7
                    kotlin.jvm.internal.r.c(r4)
                    if (r2 != r1) goto L5a
                    return r1
                L5a:
                    r2 = r6
                    r6 = r7
                L5c:
                    r7 = 0
                    r0.d = r7
                    r0.e = r7
                    r0.b = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L6a
                    return r1
                L6a:
                    Ca.I r6 = Ca.I.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: fb.w.b.a.emit(java.lang.Object, Ga.e):java.lang.Object");
            }
        }

        public b(e eVar, Qa.p pVar) {
            this.a = eVar;
            this.b = pVar;
        }

        public Object collect(f fVar, Ga.e eVar) {
            Object collect = this.a.collect(new a(fVar, this.b), eVar);
            return collect == Ha.c.f() ? collect : Ca.I.a;
        }
    }

    public static final e a(e eVar) {
        return new a(eVar);
    }

    public static final e b(e eVar, Qa.p pVar) {
        return new b(eVar, pVar);
    }
}
