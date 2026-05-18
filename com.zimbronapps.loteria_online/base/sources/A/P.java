package A;

import O0.B0;
import O0.v0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class p extends A.a implements v0 {
    public String w;
    public Qa.a x;
    public Qa.a y;

    public static final class a extends kotlin.jvm.internal.u implements Qa.a {
        public a() {
            super(0);
        }

        public final Boolean invoke() {
            Qa.a e2 = p.e2(p.this);
            if (e2 != null) {
                e2.invoke();
            }
            return Boolean.TRUE;
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public b() {
            super(1);
        }

        public final void a(long j) {
            Qa.a d2 = p.d2(p.this);
            if (d2 != null) {
                d2.invoke();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((u0.f) obj).u());
            return Ca.I.a;
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.l {
        public c() {
            super(1);
        }

        public final void a(long j) {
            Qa.a e2 = p.e2(p.this);
            if (e2 != null) {
                e2.invoke();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((u0.f) obj).u());
            return Ca.I.a;
        }
    }

    public static final class d extends Ia.l implements Qa.q {
        public int a;
        public /* synthetic */ Object b;
        public /* synthetic */ long c;

        public d(Ga.e eVar) {
            super(3, eVar);
        }

        public final Object a(C.r rVar, long j, Ga.e eVar) {
            d dVar = p.this.new d(eVar);
            dVar.b = rVar;
            dVar.c = j;
            return dVar.invokeSuspend(Ca.I.a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((C.r) obj, ((u0.f) obj2).u(), (Ga.e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                C.r rVar = (C.r) this.b;
                long j = this.c;
                if (p.this.W1()) {
                    p pVar = p.this;
                    this.a = 1;
                    if (pVar.Y1(rVar, j, this) == f) {
                        return f;
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

    public static final class e extends kotlin.jvm.internal.u implements Qa.l {
        public e() {
            super(1);
        }

        public final void a(long j) {
            if (p.this.W1()) {
                p.this.X1().invoke();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((u0.f) obj).u());
            return Ca.I.a;
        }
    }

    public /* synthetic */ p(Qa.a aVar, String str, Qa.a aVar2, Qa.a aVar3, E.m mVar, Q q, boolean z, String str2, W0.h hVar, kotlin.jvm.internal.k kVar) {
        this(aVar, str, aVar2, aVar3, mVar, q, z, str2, hVar);
    }

    public static final /* synthetic */ Qa.a d2(p pVar) {
        return pVar.y;
    }

    public static final /* synthetic */ Qa.a e2(p pVar) {
        return pVar.x;
    }

    public void Q1(W0.D d2) {
        if (this.x != null) {
            W0.B.w(d2, this.w, new a());
        }
    }

    public Object R1(I0.L l, Ga.e eVar) {
        Object i = C.B.i(l, (!W1() || this.y == null) ? null : new b(), (!W1() || this.x == null) ? null : new c(), new d(null), new e(), eVar);
        return i == Ha.c.f() ? i : Ca.I.a;
    }

    public void f2(Qa.a aVar, String str, Qa.a aVar2, Qa.a aVar3, E.m mVar, Q q, boolean z, String str2, W0.h hVar) {
        boolean z2;
        if (!kotlin.jvm.internal.t.c(this.w, str)) {
            this.w = str;
            B0.b(this);
        }
        if ((this.x == null) != (aVar2 == null)) {
            T1();
            B0.b(this);
            z2 = true;
        } else {
            z2 = false;
        }
        this.x = aVar2;
        if ((this.y == null) != (aVar3 == null)) {
            z2 = true;
        }
        this.y = aVar3;
        boolean z3 = W1() != z ? true : z2;
        c2(mVar, q, z, str2, hVar, aVar);
        if (z3) {
            a2();
        }
    }

    public p(Qa.a aVar, String str, Qa.a aVar2, Qa.a aVar3, E.m mVar, Q q, boolean z, String str2, W0.h hVar) {
        super(mVar, q, z, str2, hVar, aVar, null);
        this.w = str;
        this.x = aVar2;
        this.y = aVar3;
    }
}
