package W;

import Ca.I;
import b0.C0;
import b0.U1;
import cb.B0;
import cb.O;
import cb.P;
import cb.Q;
import cb.x;
import cb.z;
import v0.q0;
import z.F;
import z.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h {
    public u0.f a;
    public final float b;
    public final boolean c;
    public Float d;
    public u0.f e;
    public final z.a f;
    public final z.a g;
    public final z.a h;
    public final x i;
    public final C0 j;
    public final C0 k;

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
            return h.this.d(this);
        }
    }

    public static final class b extends Ia.l implements Qa.p {
        public int a;
        public /* synthetic */ Object b;

        public static final class a extends Ia.l implements Qa.p {
            public int a;
            public final /* synthetic */ h b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h hVar, Ga.e eVar) {
                super(2, eVar);
                this.b = hVar;
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                return new a(this.b, eVar);
            }

            public final Object invoke(O o, Ga.e eVar) {
                return create(o, eVar).invokeSuspend(I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = Ha.c.f();
                int i = this.a;
                if (i == 0) {
                    Ca.t.b(obj);
                    z.a a = h.a(this.b);
                    Float c = Ia.b.c(1.0f);
                    r0 j = z.j.j(75, 0, F.e(), 2, null);
                    this.a = 1;
                    if (z.a.f(a, c, j, null, null, this, 12, null) == f) {
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

        public static final class b extends Ia.l implements Qa.p {
            public int a;
            public final /* synthetic */ h b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(h hVar, Ga.e eVar) {
                super(2, eVar);
                this.b = hVar;
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                return new b(this.b, eVar);
            }

            public final Object invoke(O o, Ga.e eVar) {
                return create(o, eVar).invokeSuspend(I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = Ha.c.f();
                int i = this.a;
                if (i == 0) {
                    Ca.t.b(obj);
                    z.a c = h.c(this.b);
                    Float c2 = Ia.b.c(1.0f);
                    r0 j = z.j.j(225, 0, F.d(), 2, null);
                    this.a = 1;
                    if (z.a.f(c, c2, j, null, null, this, 12, null) == f) {
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

        public static final class c extends Ia.l implements Qa.p {
            public int a;
            public final /* synthetic */ h b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(h hVar, Ga.e eVar) {
                super(2, eVar);
                this.b = hVar;
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                return new c(this.b, eVar);
            }

            public final Object invoke(O o, Ga.e eVar) {
                return create(o, eVar).invokeSuspend(I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = Ha.c.f();
                int i = this.a;
                if (i == 0) {
                    Ca.t.b(obj);
                    z.a b = h.b(this.b);
                    Float c = Ia.b.c(1.0f);
                    r0 j = z.j.j(225, 0, F.e(), 2, null);
                    this.a = 1;
                    if (z.a.f(b, c, j, null, null, this, 12, null) == f) {
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

        public b(Ga.e eVar) {
            super(2, eVar);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            b bVar = h.this.new b(eVar);
            bVar.b = obj;
            return bVar;
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Ha.c.f();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ca.t.b(obj);
            O o = (O) this.b;
            cb.i.d(o, (Ga.i) null, (Q) null, new a(h.this, null), 3, (Object) null);
            cb.i.d(o, (Ga.i) null, (Q) null, new b(h.this, null), 3, (Object) null);
            return cb.i.d(o, (Ga.i) null, (Q) null, new c(h.this, null), 3, (Object) null);
        }
    }

    public static final class c extends Ia.l implements Qa.p {
        public int a;
        public /* synthetic */ Object b;

        public static final class a extends Ia.l implements Qa.p {
            public int a;
            public final /* synthetic */ h b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h hVar, Ga.e eVar) {
                super(2, eVar);
                this.b = hVar;
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                return new a(this.b, eVar);
            }

            public final Object invoke(O o, Ga.e eVar) {
                return create(o, eVar).invokeSuspend(I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = Ha.c.f();
                int i = this.a;
                if (i == 0) {
                    Ca.t.b(obj);
                    z.a a = h.a(this.b);
                    Float c = Ia.b.c(0.0f);
                    r0 j = z.j.j(150, 0, F.e(), 2, null);
                    this.a = 1;
                    if (z.a.f(a, c, j, null, null, this, 12, null) == f) {
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

        public c(Ga.e eVar) {
            super(2, eVar);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            c cVar = h.this.new c(eVar);
            cVar.b = obj;
            return cVar;
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Ha.c.f();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ca.t.b(obj);
            return cb.i.d((O) this.b, (Ga.i) null, (Q) null, new a(h.this, null), 3, (Object) null);
        }
    }

    public /* synthetic */ h(u0.f fVar, float f, boolean z, kotlin.jvm.internal.k kVar) {
        this(fVar, f, z);
    }

    public static final /* synthetic */ z.a a(h hVar) {
        return hVar.f;
    }

    public static final /* synthetic */ z.a b(h hVar) {
        return hVar.h;
    }

    public static final /* synthetic */ z.a c(h hVar) {
        return hVar.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(Ga.e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof W.h.a
            if (r0 == 0) goto L13
            r0 = r7
            W.h$a r0 = (W.h.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            W.h$a r0 = new W.h$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            Ca.t.b(r7)
            goto L72
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.Object r2 = r0.a
            W.h r2 = (W.h) r2
            Ca.t.b(r7)
            goto L66
        L3f:
            java.lang.Object r2 = r0.a
            W.h r2 = (W.h) r2
            Ca.t.b(r7)
            goto L56
        L47:
            Ca.t.b(r7)
            r0.a = r6
            r0.d = r5
            java.lang.Object r7 = r6.f(r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            r2 = r6
        L56:
            r2.l(r5)
            cb.x r7 = r2.i
            r0.a = r2
            r0.d = r4
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            r7 = 0
            r0.a = r7
            r0.d = r3
            java.lang.Object r7 = r2.g(r0)
            if (r7 != r1) goto L72
            return r1
        L72:
            Ca.I r7 = Ca.I.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: W.h.d(Ga.e):java.lang.Object");
    }

    public final void e(x0.f fVar, long j) {
        if (this.d == null) {
            this.d = Float.valueOf(i.b(fVar.e()));
        }
        if (this.a == null) {
            this.a = u0.f.d(fVar.u1());
        }
        if (this.e == null) {
            this.e = u0.f.d(u0.g.a(u0.l.i(fVar.e()) / 2.0f, u0.l.g(fVar.e()) / 2.0f));
        }
        float floatValue = (!i() || j()) ? ((Number) this.f.m()).floatValue() : 1.0f;
        Float f = this.d;
        kotlin.jvm.internal.t.d(f);
        float b2 = p1.b.b(f.floatValue(), this.b, ((Number) this.g.m()).floatValue());
        u0.f fVar2 = this.a;
        kotlin.jvm.internal.t.d(fVar2);
        float m = u0.f.m(fVar2.u());
        u0.f fVar3 = this.e;
        kotlin.jvm.internal.t.d(fVar3);
        float b3 = p1.b.b(m, u0.f.m(fVar3.u()), ((Number) this.h.m()).floatValue());
        u0.f fVar4 = this.a;
        kotlin.jvm.internal.t.d(fVar4);
        float n = u0.f.n(fVar4.u());
        u0.f fVar5 = this.e;
        kotlin.jvm.internal.t.d(fVar5);
        long a2 = u0.g.a(b3, p1.b.b(n, u0.f.n(fVar5.u()), ((Number) this.h.m()).floatValue()));
        long q = v0.r0.q(j, v0.r0.t(j) * floatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.c) {
            x0.f.I(fVar, q, b2, a2, 0.0f, null, null, 0, 120, null);
            return;
        }
        float i = u0.l.i(fVar.e());
        float g = u0.l.g(fVar.e());
        int b4 = q0.a.b();
        x0.d m1 = fVar.m1();
        long e = m1.e();
        m1.f().s();
        m1.d().c(0.0f, 0.0f, i, g, b4);
        x0.f.I(fVar, q, b2, a2, 0.0f, null, null, 0, 120, null);
        m1.f().k();
        m1.g(e);
    }

    public final Object f(Ga.e eVar) {
        Object e = P.e(new b(null), eVar);
        return e == Ha.c.f() ? e : I.a;
    }

    public final Object g(Ga.e eVar) {
        Object e = P.e(new c(null), eVar);
        return e == Ha.c.f() ? e : I.a;
    }

    public final void h() {
        k(true);
        this.i.o(I.a);
    }

    public final boolean i() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final boolean j() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    public final void k(boolean z) {
        this.k.setValue(Boolean.valueOf(z));
    }

    public final void l(boolean z) {
        this.j.setValue(Boolean.valueOf(z));
    }

    public h(u0.f fVar, float f, boolean z) {
        this.a = fVar;
        this.b = f;
        this.c = z;
        this.f = z.b.b(0.0f, 0.0f, 2, null);
        this.g = z.b.b(0.0f, 0.0f, 2, null);
        this.h = z.b.b(0.0f, 0.0f, 2, null);
        this.i = z.a((B0) null);
        Boolean bool = Boolean.FALSE;
        this.j = U1.i(bool, null, 2, null);
        this.k = U1.i(bool, null, 2, null);
    }
}
