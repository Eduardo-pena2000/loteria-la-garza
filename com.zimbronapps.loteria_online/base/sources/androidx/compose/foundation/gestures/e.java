package androidx.compose.foundation.gestures;

import A.U;
import A.b0;
import C.A;
import C.n;
import C.q;
import C.t;
import C.v;
import C.x;
import C.y;
import Ca.I;
import E.m;
import G0.a;
import I0.C;
import I0.s;
import O0.A0;
import O0.B0;
import O0.j0;
import O0.k;
import O0.k0;
import P0.p0;
import Qa.p;
import W0.B;
import android.view.KeyEvent;
import androidx.compose.foundation.gestures.a;
import cb.O;
import cb.Q;
import cb.i;
import java.util.List;
import kotlin.jvm.internal.u;
import n1.r;
import t0.l;
import y.D;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e extends androidx.compose.foundation.gestures.b implements j0, O0.h, l, G0.e, A0 {
    public b0 l;
    public n m;
    public final boolean n;
    public final H0.b o;
    public final v p;
    public final C.h q;
    public final A r;
    public final x s;
    public final C.f t;
    public t u;
    public p v;
    public p w;

    public static final class a extends u implements Qa.l {
        public a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((M0.p) obj);
            return I.a;
        }

        public final void invoke(M0.p pVar) {
            e.f2(e.this).Y1(pVar);
        }
    }

    public static final class b extends Ia.l implements p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ p c;
        public final /* synthetic */ A d;

        public static final class a extends u implements Qa.l {
            public final /* synthetic */ C.p a;
            public final /* synthetic */ A b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C.p pVar, A a) {
                super(1);
                this.a = pVar;
                this.b = a;
            }

            public final void a(a.b bVar) {
                this.a.a(this.b.x(bVar.a()), H0.e.a.b());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a.b) obj);
                return I.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p pVar, A a2, Ga.e eVar) {
            super(2, eVar);
            this.c = pVar;
            this.d = a2;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C.p pVar, Ga.e eVar) {
            return create(pVar, eVar).invokeSuspend(I.a);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            b bVar = new b(this.c, this.d, eVar);
            bVar.b = obj;
            return bVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                C.p pVar = (C.p) this.b;
                p pVar2 = this.c;
                a aVar = new a(pVar, this.d);
                this.a = 1;
                if (pVar2.invoke(aVar, this) == f) {
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

    public static final class c extends Ia.l implements p {
        public int a;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, Ga.e eVar) {
            super(2, eVar);
            this.c = j;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return e.this.new c(this.c, eVar);
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                A h2 = e.h2(e.this);
                long j = this.c;
                this.a = 1;
                if (h2.q(j, this) == f) {
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

    public static final class d extends Ia.l implements p {
        public int a;
        public final /* synthetic */ long c;

        public static final class a extends Ia.l implements p {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ long c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j, Ga.e eVar) {
                super(2, eVar);
                this.c = j;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C.p pVar, Ga.e eVar) {
                return create(pVar, eVar).invokeSuspend(I.a);
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                a aVar = new a(this.c, eVar);
                aVar.b = obj;
                return aVar;
            }

            public final Object invokeSuspend(Object obj) {
                Ha.c.f();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
                ((C.p) this.b).b(this.c, H0.e.a.b());
                return I.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j, Ga.e eVar) {
            super(2, eVar);
            this.c = j;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return e.this.new d(this.c, eVar);
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                A h2 = e.h2(e.this);
                U u = U.UserInput;
                a aVar = new a(this.c, null);
                this.a = 1;
                if (h2.v(u, aVar, this) == f) {
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

    public static final class e extends Ia.l implements p {
        public int a;
        public final /* synthetic */ long c;

        public static final class a extends Ia.l implements p {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ long c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j, Ga.e eVar) {
                super(2, eVar);
                this.c = j;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C.p pVar, Ga.e eVar) {
                return create(pVar, eVar).invokeSuspend(I.a);
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                a aVar = new a(this.c, eVar);
                aVar.b = obj;
                return aVar;
            }

            public final Object invokeSuspend(Object obj) {
                Ha.c.f();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
                ((C.p) this.b).b(this.c, H0.e.a.b());
                return I.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j, Ga.e eVar) {
            super(2, eVar);
            this.c = j;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return e.this.new e(this.c, eVar);
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                A h2 = e.h2(e.this);
                U u = U.UserInput;
                a aVar = new a(this.c, null);
                this.a = 1;
                if (h2.v(u, aVar, this) == f) {
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

    public static final class f extends u implements p {

        public static final class a extends Ia.l implements p {
            public int a;
            public final /* synthetic */ e b;
            public final /* synthetic */ float c;
            public final /* synthetic */ float d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, float f, float f2, Ga.e eVar2) {
                super(2, eVar2);
                this.b = eVar;
                this.c = f;
                this.d = f2;
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
                    A h2 = e.h2(this.b);
                    long a = u0.g.a(this.c, this.d);
                    this.a = 1;
                    if (androidx.compose.foundation.gestures.d.d(h2, a, this) == f) {
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

        public f() {
            super(2);
        }

        public final Boolean a(float f, float f2) {
            i.d(e.this.getCoroutineScope(), (Ga.i) null, (Q) null, new a(e.this, f, f2, null), 3, (Object) null);
            return Boolean.TRUE;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
        }
    }

    public static final class g extends Ia.l implements p {
        public int a;
        public /* synthetic */ long b;

        public g(Ga.e eVar) {
            super(2, eVar);
        }

        public final Object a(long j, Ga.e eVar) {
            return create(u0.f.d(j), eVar).invokeSuspend(I.a);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            g gVar = e.this.new g(eVar);
            gVar.b = ((u0.f) obj).u();
            return gVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((u0.f) obj).u(), (Ga.e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                long j = this.b;
                A h2 = e.h2(e.this);
                this.a = 1;
                obj = androidx.compose.foundation.gestures.d.d(h2, j, this);
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

    public static final class h extends u implements Qa.a {
        public h() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            e.g2(e.this).f(D.c((n1.d) O0.i.a(e.this, p0.e())));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [C.n] */
    public e(y yVar, b0 b0Var, n nVar, q qVar, boolean z, boolean z2, m mVar, C.d dVar) {
        super(androidx.compose.foundation.gestures.d.a(), z, mVar, qVar);
        this.l = b0Var;
        this.m = nVar;
        H0.b bVar = new H0.b();
        this.o = bVar;
        this.p = (v) E1(new v(z));
        C.h hVar = new C.h(D.c(androidx.compose.foundation.gestures.d.c()), null, 2, null);
        this.q = hVar;
        b0 b0Var2 = this.l;
        ?? r2 = this.m;
        A a2 = new A(yVar, b0Var2, r2 == 0 ? hVar : r2, qVar, z2, bVar);
        this.r = a2;
        x xVar = new x(a2, z);
        this.s = xVar;
        C.f fVar = (C.f) E1(new C.f(qVar, a2, z2, dVar));
        this.t = fVar;
        E1(H0.d.c(xVar, bVar));
        E1(androidx.compose.ui.focus.n.a());
        E1(new K.h(fVar));
        E1(new A.I(new a()));
    }

    public static final /* synthetic */ C.f f2(e eVar) {
        return eVar.t;
    }

    public static final /* synthetic */ C.h g2(e eVar) {
        return eVar.q;
    }

    public static final /* synthetic */ A h2(e eVar) {
        return eVar.r;
    }

    public boolean F0(KeyEvent keyEvent) {
        return false;
    }

    public void J0(I0.q qVar, s sVar, long j) {
        List c2 = qVar.c();
        int size = c2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((Boolean) U1().invoke((C) c2.get(i))).booleanValue()) {
                super.J0(qVar, sVar, j);
                break;
            }
            i++;
        }
        if (sVar == s.b && I0.u.i(qVar.f(), I0.u.a.f())) {
            j2(qVar, j);
        }
    }

    public void P0(androidx.compose.ui.focus.h hVar) {
        hVar.h(false);
    }

    public boolean R0(KeyEvent keyEvent) {
        long a2;
        if (V1()) {
            long a3 = G0.d.a(keyEvent);
            a.a aVar = G0.a.b;
            if ((G0.a.r(a3, aVar.l()) || G0.a.r(G0.d.a(keyEvent), aVar.m())) && G0.c.e(G0.d.b(keyEvent), G0.c.a.a()) && !G0.d.e(keyEvent)) {
                if (this.r.p()) {
                    int f2 = r.f(this.t.U1());
                    a2 = u0.g.a(0.0f, G0.a.r(G0.d.a(keyEvent), aVar.m()) ? f2 : -f2);
                } else {
                    int g2 = r.g(this.t.U1());
                    a2 = u0.g.a(G0.a.r(G0.d.a(keyEvent), aVar.m()) ? g2 : -g2, 0.0f);
                }
                i.d(getCoroutineScope(), (Ga.i) null, (Q) null, new d(a2, null), 3, (Object) null);
                return true;
            }
        }
        return false;
    }

    public Object T1(p pVar, Ga.e eVar) {
        A a2 = this.r;
        Object v = a2.v(U.UserInput, new b(pVar, a2, null), eVar);
        return v == Ha.c.f() ? v : I.a;
    }

    public void X1(long j) {
    }

    public void Y1(long j) {
        i.d(this.o.e(), (Ga.i) null, (Q) null, new c(j, null), 3, (Object) null);
    }

    public boolean c2() {
        return this.r.w();
    }

    public void g1(W0.D d2) {
        if (V1() && (this.v == null || this.w == null)) {
            k2();
        }
        p pVar = this.v;
        if (pVar != null) {
            B.N(d2, null, pVar, 1, null);
        }
        p pVar2 = this.w;
        if (pVar2 != null) {
            B.O(d2, pVar2);
        }
    }

    public boolean getShouldAutoInvalidate() {
        return this.n;
    }

    public final void i2() {
        this.v = null;
        this.w = null;
    }

    public final void j2(I0.q qVar, long j) {
        List c2 = qVar.c();
        int size = c2.size();
        for (int i = 0; i < size; i++) {
            if (((C) c2.get(i)).p()) {
                return;
            }
        }
        t tVar = this.u;
        kotlin.jvm.internal.t.d(tVar);
        i.d(getCoroutineScope(), (Ga.i) null, (Q) null, new e(tVar.a(k.j(this), qVar, j), null), 3, (Object) null);
        List c3 = qVar.c();
        int size2 = c3.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((C) c3.get(i2)).a();
        }
    }

    public final void k2() {
        this.v = new f();
        this.w = new g(null);
    }

    public final void l2(y yVar, q qVar, b0 b0Var, boolean z, boolean z2, n nVar, m mVar, C.d dVar) {
        boolean z3;
        if (V1() != z) {
            this.s.a(z);
            this.p.F1(z);
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z4 = z3;
        boolean C = this.r.C(yVar, qVar, b0Var, z2, nVar == null ? this.q : nVar, this.o);
        this.t.b2(qVar, z2, dVar);
        this.l = b0Var;
        this.m = nVar;
        e2(androidx.compose.foundation.gestures.d.a(), z, mVar, this.r.p() ? q.Vertical : q.Horizontal, C);
        if (z4) {
            i2();
            B0.b(this);
        }
    }

    public final void m2() {
        k0.a(this, new h());
    }

    public void onAttach() {
        m2();
        this.u = C.b.a(this);
    }

    public void q0() {
        m2();
    }
}
