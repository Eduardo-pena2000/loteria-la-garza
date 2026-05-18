package K;

import Ca.I;
import Ia.l;
import O0.D;
import O0.I0;
import Qa.p;
import androidx.compose.ui.e;
import cb.O;
import cb.P;
import cb.Q;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h extends e.c implements K.a, D, I0 {
    public static final a d = new a(null);
    public static final int e = 8;
    public g a;
    public final boolean b;
    public boolean c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends l implements p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ M0.p d;
        public final /* synthetic */ Qa.a e;
        public final /* synthetic */ Qa.a f;

        public static final class a extends l implements p {
            public int a;
            public final /* synthetic */ h b;
            public final /* synthetic */ M0.p c;
            public final /* synthetic */ Qa.a d;

            public /* synthetic */ class a extends q implements Qa.a {
                public final /* synthetic */ h a;
                public final /* synthetic */ M0.p b;
                public final /* synthetic */ Qa.a c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(h hVar, M0.p pVar, Qa.a aVar) {
                    super(0, t.a.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                    this.a = hVar;
                    this.b = pVar;
                    this.c = aVar;
                }

                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final u0.h invoke() {
                    return h.E1(this.a, this.b, this.c);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h hVar, M0.p pVar, Qa.a aVar, Ga.e eVar) {
                super(2, eVar);
                this.b = hVar;
                this.c = pVar;
                this.d = aVar;
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                return new a(this.b, this.c, this.d, eVar);
            }

            public final Object invoke(O o, Ga.e eVar) {
                return create(o, eVar).invokeSuspend(I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = Ha.c.f();
                int i = this.a;
                if (i == 0) {
                    Ca.t.b(obj);
                    g G1 = this.b.G1();
                    a aVar = new a(this.b, this.c, this.d);
                    this.a = 1;
                    if (G1.n1(aVar, this) == f) {
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

        public static final class b extends l implements p {
            public int a;
            public final /* synthetic */ h b;
            public final /* synthetic */ Qa.a c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(h hVar, Qa.a aVar, Ga.e eVar) {
                super(2, eVar);
                this.b = hVar;
                this.c = aVar;
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                return new b(this.b, this.c, eVar);
            }

            public final Object invoke(O o, Ga.e eVar) {
                return create(o, eVar).invokeSuspend(I.a);
            }

            public final Object invokeSuspend(Object obj) {
                K.a c;
                Object f = Ha.c.f();
                int i = this.a;
                if (i == 0) {
                    Ca.t.b(obj);
                    if (this.b.isAttached() && (c = d.c(this.b)) != null) {
                        M0.p l = O0.k.l(this.b);
                        Qa.a aVar = this.c;
                        this.a = 1;
                        if (c.K0(l, aVar, this) == f) {
                            return f;
                        }
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(M0.p pVar, Qa.a aVar, Qa.a aVar2, Ga.e eVar) {
            super(2, eVar);
            this.d = pVar;
            this.e = aVar;
            this.f = aVar2;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            b bVar = h.this.new b(this.d, this.e, this.f, eVar);
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
            cb.i.d(o, (Ga.i) null, (Q) null, new a(h.this, this.d, this.e, null), 3, (Object) null);
            return cb.i.d(o, (Ga.i) null, (Q) null, new b(h.this, this.f, null), 3, (Object) null);
        }
    }

    public static final class c extends u implements Qa.a {
        public final /* synthetic */ M0.p b;
        public final /* synthetic */ Qa.a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(M0.p pVar, Qa.a aVar) {
            super(0);
            this.b = pVar;
            this.c = aVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u0.h invoke() {
            u0.h E1 = h.E1(h.this, this.b, this.c);
            if (E1 != null) {
                return h.this.G1().X0(E1);
            }
            return null;
        }
    }

    public h(g gVar) {
        this.a = gVar;
    }

    public static final /* synthetic */ u0.h E1(h hVar, M0.p pVar, Qa.a aVar) {
        return F1(hVar, pVar, aVar);
    }

    public static final u0.h F1(h hVar, M0.p pVar, Qa.a aVar) {
        u0.h hVar2;
        if (!hVar.isAttached() || !hVar.c) {
            return null;
        }
        M0.p l = O0.k.l(hVar);
        if (!pVar.g()) {
            pVar = null;
        }
        if (pVar == null || (hVar2 = (u0.h) aVar.invoke()) == null) {
            return null;
        }
        return e.a(l, pVar, hVar2);
    }

    public Object B() {
        return d;
    }

    public final g G1() {
        return this.a;
    }

    public Object K0(M0.p pVar, Qa.a aVar, Ga.e eVar) {
        Object e2 = P.e(new b(pVar, aVar, new c(pVar, aVar), null), eVar);
        return e2 == Ha.c.f() ? e2 : I.a;
    }

    public boolean getShouldAutoInvalidate() {
        return this.b;
    }

    public void l0(M0.p pVar) {
        this.c = true;
    }
}
