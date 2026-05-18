package z;

import b0.U1;
import b0.h2;
import java.util.concurrent.CancellationException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a {
    public final s0 a;
    public final Object b;
    public final String c;
    public final k d;
    public final b0.C0 e;
    public final b0.C0 f;
    public final Z g;
    public final h0 h;
    public final q i;
    public final q j;
    public q k;
    public q l;

    public static final class a extends Ia.l implements Qa.l {
        public Object a;
        public Object b;
        public int c;
        public final /* synthetic */ Object e;
        public final /* synthetic */ d f;
        public final /* synthetic */ long g;
        public final /* synthetic */ Qa.l h;

        public static final class a extends kotlin.jvm.internal.u implements Qa.l {
            public final /* synthetic */ a a;
            public final /* synthetic */ k b;
            public final /* synthetic */ Qa.l c;
            public final /* synthetic */ kotlin.jvm.internal.J d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a aVar, k kVar, Qa.l lVar, kotlin.jvm.internal.J j) {
                super(1);
                this.a = aVar;
                this.b = kVar;
                this.c = lVar;
                this.d = j;
            }

            public final void a(h hVar) {
                m0.o(hVar, this.a.j());
                Object a = a.a(this.a, hVar.e());
                if (kotlin.jvm.internal.t.c(a, hVar.e())) {
                    Qa.l lVar = this.c;
                    if (lVar != null) {
                        lVar.invoke(this.a);
                        return;
                    }
                    return;
                }
                this.a.j().s(a);
                this.b.s(a);
                Qa.l lVar2 = this.c;
                if (lVar2 != null) {
                    lVar2.invoke(this.a);
                }
                hVar.a();
                this.d.a = true;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((h) obj);
                return Ca.I.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, d dVar, long j, Qa.l lVar, Ga.e eVar) {
            super(1, eVar);
            this.e = obj;
            this.f = dVar;
            this.g = j;
            this.h = lVar;
        }

        public final Ga.e create(Ga.e eVar) {
            return a.this.new a(this.e, this.f, this.g, this.h, eVar);
        }

        public final Object invoke(Ga.e eVar) {
            return create(eVar).invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            k kVar;
            kotlin.jvm.internal.J j;
            Object f = Ha.c.f();
            int i = this.c;
            try {
                if (i == 0) {
                    Ca.t.b(obj);
                    a.this.j().t((q) a.this.l().a().invoke(this.e));
                    a.d(a.this, this.f.g());
                    a.c(a.this, true);
                    k h = l.h(a.this.j(), null, null, 0L, Long.MIN_VALUE, false, 23, null);
                    kotlin.jvm.internal.J j2 = new kotlin.jvm.internal.J();
                    d dVar = this.f;
                    long j3 = this.g;
                    a aVar = new a(a.this, h, this.h, j2);
                    this.a = h;
                    this.b = j2;
                    this.c = 1;
                    if (m0.c(h, dVar, j3, aVar, this) == f) {
                        return f;
                    }
                    kVar = h;
                    j = j2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = (kotlin.jvm.internal.J) this.b;
                    kVar = (k) this.a;
                    Ca.t.b(obj);
                }
                e eVar = j.a ? e.a : e.b;
                a.b(a.this);
                return new g(kVar, eVar);
            } catch (CancellationException e) {
                a.b(a.this);
                throw e;
            }
        }
    }

    public static final class b extends Ia.l implements Qa.l {
        public int a;
        public final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, Ga.e eVar) {
            super(1, eVar);
            this.c = obj;
        }

        public final Ga.e create(Ga.e eVar) {
            return a.this.new b(this.c, eVar);
        }

        public final Object invoke(Ga.e eVar) {
            return create(eVar).invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Ha.c.f();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ca.t.b(obj);
            a.b(a.this);
            Object a = a.a(a.this, this.c);
            a.this.j().s(a);
            a.d(a.this, a);
            return Ca.I.a;
        }
    }

    public static final class c extends Ia.l implements Qa.l {
        public int a;

        public c(Ga.e eVar) {
            super(1, eVar);
        }

        public final Ga.e create(Ga.e eVar) {
            return a.this.new c(eVar);
        }

        public final Object invoke(Ga.e eVar) {
            return create(eVar).invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Ha.c.f();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ca.t.b(obj);
            a.b(a.this);
            return Ca.I.a;
        }
    }

    public a(Object obj, s0 s0Var, Object obj2, String str) {
        this.a = s0Var;
        this.b = obj2;
        this.c = str;
        this.d = new k(s0Var, obj, null, 0L, 0L, false, 60, null);
        this.e = U1.i(Boolean.FALSE, null, 2, null);
        this.f = U1.i(obj, null, 2, null);
        this.g = new Z();
        this.h = new h0(0.0f, 0.0f, obj2, 3, null);
        q o = o();
        q c2 = o instanceof m ? z.b.c() : o instanceof n ? z.b.d() : o instanceof o ? z.b.e() : z.b.f();
        kotlin.jvm.internal.t.e(c2, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.i = c2;
        q o2 = o();
        q g = o2 instanceof m ? z.b.g() : o2 instanceof n ? z.b.h() : o2 instanceof o ? z.b.i() : z.b.j();
        kotlin.jvm.internal.t.e(g, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.j = g;
        this.k = c2;
        this.l = g;
    }

    public static final /* synthetic */ Object a(a aVar, Object obj) {
        return aVar.h(obj);
    }

    public static final /* synthetic */ void b(a aVar) {
        aVar.i();
    }

    public static final /* synthetic */ void c(a aVar, boolean z) {
        aVar.q(z);
    }

    public static final /* synthetic */ void d(a aVar, Object obj) {
        aVar.r(obj);
    }

    public static /* synthetic */ Object f(a aVar, Object obj, i iVar, Object obj2, Qa.l lVar, Ga.e eVar, int i, Object obj3) {
        if ((i & 2) != 0) {
            iVar = aVar.h;
        }
        i iVar2 = iVar;
        if ((i & 4) != 0) {
            obj2 = aVar.n();
        }
        Object obj4 = obj2;
        if ((i & 8) != 0) {
            lVar = null;
        }
        return aVar.e(obj, iVar2, obj4, lVar, eVar);
    }

    public final Object e(Object obj, i iVar, Object obj2, Qa.l lVar, Ga.e eVar) {
        return p(f.a(iVar, this.a, m(), obj, obj2), obj2, lVar, eVar);
    }

    public final h2 g() {
        return this.d;
    }

    public final Object h(Object obj) {
        if (kotlin.jvm.internal.t.c(this.k, this.i) && kotlin.jvm.internal.t.c(this.l, this.j)) {
            return obj;
        }
        q qVar = (q) this.a.a().invoke(obj);
        int b2 = qVar.b();
        boolean z = false;
        for (int i = 0; i < b2; i++) {
            if (qVar.a(i) < this.k.a(i) || qVar.a(i) > this.l.a(i)) {
                qVar.e(i, Wa.n.l(qVar.a(i), this.k.a(i), this.l.a(i)));
                z = true;
            }
        }
        return z ? this.a.b().invoke(qVar) : obj;
    }

    public final void i() {
        k kVar = this.d;
        kVar.h().d();
        kVar.p(Long.MIN_VALUE);
        q(false);
    }

    public final k j() {
        return this.d;
    }

    public final Object k() {
        return this.f.getValue();
    }

    public final s0 l() {
        return this.a;
    }

    public final Object m() {
        return this.d.getValue();
    }

    public final Object n() {
        return this.a.b().invoke(o());
    }

    public final q o() {
        return this.d.h();
    }

    public final Object p(d dVar, Object obj, Qa.l lVar, Ga.e eVar) {
        return Z.e(this.g, null, new a(obj, dVar, this.d.e(), lVar, null), eVar, 1, null);
    }

    public final void q(boolean z) {
        this.e.setValue(Boolean.valueOf(z));
    }

    public final void r(Object obj) {
        this.f.setValue(obj);
    }

    public final Object s(Object obj, Ga.e eVar) {
        Object e = Z.e(this.g, null, new b(obj, null), eVar, 1, null);
        return e == Ha.c.f() ? e : Ca.I.a;
    }

    public final Object t(Ga.e eVar) {
        Object e = Z.e(this.g, null, new c(null), eVar, 1, null);
        return e == Ha.c.f() ? e : Ca.I.a;
    }

    public /* synthetic */ a(Object obj, s0 s0Var, Object obj2, String str, int i, kotlin.jvm.internal.k kVar) {
        this(obj, s0Var, (i & 4) != 0 ? null : obj2, (i & 8) != 0 ? "Animatable" : str);
    }
}
