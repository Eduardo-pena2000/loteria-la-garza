package Q;

import P0.b1;
import Q.q0;
import Z0.T0;
import cb.B0;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.t;
import v0.g1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a extends q0 {
    public B0 b;
    public s0 c;
    public fb.y d;

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ f1.U a;
        public final /* synthetic */ a b;
        public final /* synthetic */ f1.t c;
        public final /* synthetic */ Qa.l d;
        public final /* synthetic */ Qa.l e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f1.U u, a aVar, f1.t tVar, Qa.l lVar, Qa.l lVar2) {
            super(1);
            this.a = u;
            this.b = aVar;
            this.c = tVar;
            this.d = lVar;
            this.e = lVar2;
        }

        public final void a(s0 s0Var) {
            s0Var.l(this.a, this.b.i(), this.c, this.d, this.e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((s0) obj);
            return Ca.I.a;
        }
    }

    public static final /* synthetic */ fb.y m(a aVar) {
        return aVar.p();
    }

    public static final /* synthetic */ void n(a aVar, s0 s0Var) {
        aVar.c = s0Var;
    }

    public static final /* synthetic */ void o(q0.a aVar, float[] fArr) {
        r(aVar, fArr);
    }

    public static final void r(q0.a aVar, float[] fArr) {
        M0.p p0 = aVar.p0();
        if (p0 != null) {
            if (!p0.g()) {
                p0 = null;
            }
            if (p0 == null) {
                return;
            }
            p0.x0(fArr);
        }
    }

    public void a(f1.U u, f1.t tVar, Qa.l lVar, Qa.l lVar2) {
        q(new a(u, this, tVar, lVar, lVar2));
    }

    public void b() {
        q(null);
    }

    public void c() {
        B0 b0 = this.b;
        if (b0 != null) {
            B0.a.b(b0, (CancellationException) null, 1, (Object) null);
        }
        this.b = null;
        fb.y p = p();
        if (p != null) {
            p.f();
        }
    }

    public void e(u0.h hVar) {
        s0 s0Var = this.c;
        if (s0Var != null) {
            s0Var.j(hVar);
        }
    }

    public void f(f1.U u, f1.J j, T0 t0, Qa.l lVar, u0.h hVar, u0.h hVar2) {
        s0 s0Var = this.c;
        if (s0Var != null) {
            s0Var.n(u, j, t0, hVar, hVar2);
        }
    }

    public void h(f1.U u, f1.U u2) {
        s0 s0Var = this.c;
        if (s0Var != null) {
            s0Var.m(u, u2);
        }
    }

    public void k() {
        fb.y p = p();
        if (p != null) {
            p.b(Ca.I.a);
        }
    }

    public final fb.y p() {
        fb.y yVar = this.d;
        if (yVar != null) {
            return yVar;
        }
        if (!O.c.a()) {
            return null;
        }
        fb.y b2 = fb.F.b(1, 0, eb.a.c, 2, (Object) null);
        this.d = b2;
        return b2;
    }

    public final void q(Qa.l lVar) {
        q0.a i = i();
        if (i == null) {
            return;
        }
        this.b = i.E0(new b(lVar, this, i, null));
    }

    public static final class b extends Ia.l implements Qa.p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Qa.l c;
        public final /* synthetic */ a d;
        public final /* synthetic */ q0.a e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Qa.l lVar, a aVar, q0.a aVar2, Ga.e eVar) {
            super(2, eVar);
            this.c = lVar;
            this.d = aVar;
            this.e = aVar2;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b1 b1Var, Ga.e eVar) {
            return create(b1Var, eVar).invokeSuspend(Ca.I.a);
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
                a aVar = new a((b1) this.b, this.c, this.d, this.e, null);
                this.a = 1;
                if (cb.P.e(aVar, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
            }
            throw new Ca.i();
        }

        public static final class a extends Ia.l implements Qa.p {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ b1 c;
            public final /* synthetic */ Qa.l d;
            public final /* synthetic */ a e;
            public final /* synthetic */ q0.a f;

            public /* synthetic */ class b extends kotlin.jvm.internal.q implements Qa.l {
                public final /* synthetic */ q0.a a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(q0.a aVar) {
                    super(1, t.a.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
                    this.a = aVar;
                }

                public final void b(float[] fArr) {
                    a.o(this.a, fArr);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b(((g1) obj).p());
                    return Ca.I.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b1 b1Var, Qa.l lVar, a aVar, q0.a aVar2, Ga.e eVar) {
                super(2, eVar);
                this.c = b1Var;
                this.d = lVar;
                this.e = aVar;
                this.f = aVar2;
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                a aVar = new a(this.c, this.d, this.e, this.f, eVar);
                aVar.b = obj;
                return aVar;
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
                        cb.O o = (cb.O) this.b;
                        l0 l0Var = (l0) r0.c().invoke(this.c.getView());
                        s0 s0Var = new s0(this.c.getView(), new b(this.f), l0Var);
                        if (O.c.a()) {
                            cb.i.d(o, (Ga.i) null, (cb.Q) null, new a(this.e, l0Var, null), 3, (Object) null);
                        }
                        Qa.l lVar = this.d;
                        if (lVar != null) {
                            lVar.invoke(s0Var);
                        }
                        a.n(this.e, s0Var);
                        b1 b1Var = this.c;
                        this.a = 1;
                        if (b1Var.a(s0Var, this) == f) {
                            return f;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Ca.t.b(obj);
                    }
                    throw new Ca.i();
                } catch (Throwable th) {
                    a.n(this.e, null);
                    throw th;
                }
            }

            public static final class a extends Ia.l implements Qa.p {
                public int a;
                public final /* synthetic */ a b;
                public final /* synthetic */ l0 c;

                public static final class b implements fb.f {
                    public final /* synthetic */ l0 a;

                    public b(l0 l0Var) {
                        this.a = l0Var;
                    }

                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object emit(Ca.I i, Ga.e eVar) {
                        this.a.d();
                        return Ca.I.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(a aVar, l0 l0Var, Ga.e eVar) {
                    super(2, eVar);
                    this.b = aVar;
                    this.c = l0Var;
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
                        a aVar = a.a;
                        this.a = 1;
                        if (b0.v0.b(aVar, this) == f) {
                            return f;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Ca.t.b(obj);
                            throw new Ca.i();
                        }
                        Ca.t.b(obj);
                    }
                    fb.y m = a.m(this.b);
                    if (m == null) {
                        return Ca.I.a;
                    }
                    b bVar = new b(this.c);
                    this.a = 2;
                    if (m.collect(bVar, this) == f) {
                        return f;
                    }
                    throw new Ca.i();
                }

                public static final class a extends kotlin.jvm.internal.u implements Qa.l {
                    public static final a a = new a();

                    public a() {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a(((Number) obj).longValue());
                        return Ca.I.a;
                    }

                    public final void a(long j) {
                    }
                }
            }
        }
    }
}
