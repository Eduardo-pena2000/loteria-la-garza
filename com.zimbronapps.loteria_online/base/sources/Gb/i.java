package gb;

import Ca.I;
import cb.P;
import kotlin.jvm.internal.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class i extends g {
    public final Qa.q e;

    public static final class a extends Ia.l implements Qa.p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ fb.f d;

        public static final class a implements fb.f {
            public final /* synthetic */ O a;
            public final /* synthetic */ cb.O b;
            public final /* synthetic */ i c;
            public final /* synthetic */ fb.f d;

            public static final class a extends Ia.l implements Qa.p {
                public int a;
                public final /* synthetic */ i b;
                public final /* synthetic */ fb.f c;
                public final /* synthetic */ Object d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(i iVar, fb.f fVar, Object obj, Ga.e eVar) {
                    super(2, eVar);
                    this.b = iVar;
                    this.c = fVar;
                    this.d = obj;
                }

                public final Ga.e create(Object obj, Ga.e eVar) {
                    return new a(this.b, this.c, this.d, eVar);
                }

                public final Object invoke(cb.O o, Ga.e eVar) {
                    return ((a) create(o, eVar)).invokeSuspend(I.a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f = Ha.c.f();
                    int i = this.a;
                    if (i == 0) {
                        Ca.t.b(obj);
                        Qa.q r = i.r(this.b);
                        fb.f fVar = this.c;
                        Object obj2 = this.d;
                        this.a = 1;
                        if (r.invoke(fVar, obj2, this) == f) {
                            return f;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Ca.t.b(obj);
                    }
                    return I.a;
                }
            }

            public static final class b extends Ia.d {
                public Object a;
                public Object b;
                public Object c;
                public /* synthetic */ Object d;
                public int f;

                public b(Ga.e eVar) {
                    super(eVar);
                }

                public final Object invokeSuspend(Object obj) {
                    this.d = obj;
                    this.f |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(O o, cb.O o2, i iVar, fb.f fVar) {
                this.a = o;
                this.b = o2;
                this.c = iVar;
                this.d = fVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r8, Ga.e r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof gb.i.a.a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    gb.i$a$a$b r0 = (gb.i.a.a.b) r0
                    int r1 = r0.f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f = r1
                    goto L18
                L13:
                    gb.i$a$a$b r0 = new gb.i$a$a$b
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.d
                    java.lang.Object r1 = Ha.c.f()
                    int r2 = r0.f
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.c
                    cb.B0 r8 = (cb.B0) r8
                    java.lang.Object r8 = r0.b
                    java.lang.Object r0 = r0.a
                    gb.i$a$a r0 = (gb.i.a.a) r0
                    Ca.t.b(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    Ca.t.b(r9)
                    kotlin.jvm.internal.O r9 = r7.a
                    java.lang.Object r9 = r9.a
                    cb.B0 r9 = (cb.B0) r9
                    if (r9 == 0) goto L5d
                    gb.j r2 = new gb.j
                    r2.<init>()
                    r9.cancel(r2)
                    r0.a = r7
                    r0.b = r8
                    r0.c = r9
                    r0.f = r3
                    java.lang.Object r9 = r9.join(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    kotlin.jvm.internal.O r9 = r0.a
                    cb.O r1 = r0.b
                    cb.Q r3 = cb.Q.d
                    gb.i$a$a$a r4 = new gb.i$a$a$a
                    gb.i r2 = r0.c
                    fb.f r0 = r0.d
                    r5 = 0
                    r4.<init>(r2, r0, r8, r5)
                    r5 = 1
                    r6 = 0
                    r2 = 0
                    cb.B0 r8 = cb.i.d(r1, r2, r3, r4, r5, r6)
                    r9.a = r8
                    Ca.I r8 = Ca.I.a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: gb.i.a.a.emit(java.lang.Object, Ga.e):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fb.f fVar, Ga.e eVar) {
            super(2, eVar);
            this.d = fVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            a aVar = i.this.new a(this.d, eVar);
            aVar.b = obj;
            return aVar;
        }

        public final Object invoke(cb.O o, Ga.e eVar) {
            return ((a) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                cb.O o = (cb.O) this.b;
                O o2 = new O();
                i iVar = i.this;
                fb.e eVar = iVar.d;
                a aVar = new a(o2, o, iVar, this.d);
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
            return I.a;
        }
    }

    public /* synthetic */ i(Qa.q qVar, fb.e eVar, Ga.i iVar, int i, eb.a aVar, int i2, kotlin.jvm.internal.k kVar) {
        this(qVar, eVar, (i2 & 4) != 0 ? Ga.j.a : iVar, (i2 & 8) != 0 ? -2 : i, (i2 & 16) != 0 ? eb.a.a : aVar);
    }

    public static final /* synthetic */ Qa.q r(i iVar) {
        return iVar.e;
    }

    public e i(Ga.i iVar, int i, eb.a aVar) {
        return new i(this.e, this.d, iVar, i, aVar);
    }

    public Object q(fb.f fVar, Ga.e eVar) {
        Object e = P.e(new a(fVar, null), eVar);
        return e == Ha.c.f() ? e : I.a;
    }

    public i(Qa.q qVar, fb.e eVar, Ga.i iVar, int i, eb.a aVar) {
        super(eVar, iVar, i, aVar);
        this.e = qVar;
    }
}
