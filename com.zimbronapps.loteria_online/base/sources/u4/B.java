package U4;

import Ca.I;
import Ca.o;
import Qa.l;
import Qa.p;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import b0.C0;
import b0.U1;
import b0.v1;
import cb.B0;
import cb.O;
import cb.Q;
import cb.W0;
import cb.e0;
import e5.h;
import e5.i;
import e5.q;
import fb.P;
import fb.z;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b extends A0.c implements v1 {
    public static final b v = new b(null);
    public static final l w = a.a;
    public O g;
    public final z h = P.a(u0.l.c(u0.l.b.b()));
    public final C0 i = U1.i(null, null, 2, null);
    public final C0 j = U1.i(Float.valueOf(1.0f), null, 2, null);
    public final C0 k = U1.i(null, null, 2, null);
    public c l;
    public A0.c m;
    public l n;
    public l o;
    public M0.f p;
    public int q;
    public boolean r;
    public final C0 s;
    public final C0 t;
    public final C0 u;

    public static final class b {
        public /* synthetic */ b(k kVar) {
            this();
        }

        public final l a() {
            return b.n();
        }

        public b() {
        }
    }

    public static abstract class c {

        public static final class a extends c {
            public static final a a = new a();

            public a() {
                super(null);
            }

            public A0.c a() {
                return null;
            }
        }

        public static final class b extends c {
            public final A0.c a;
            public final e5.f b;

            public b(A0.c cVar, e5.f fVar) {
                super(null);
                this.a = cVar;
                this.b = fVar;
            }

            public static /* synthetic */ b c(b bVar, A0.c cVar, e5.f fVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    cVar = bVar.a;
                }
                if ((i & 2) != 0) {
                    fVar = bVar.b;
                }
                return bVar.b(cVar, fVar);
            }

            public A0.c a() {
                return this.a;
            }

            public final b b(A0.c cVar, e5.f fVar) {
                return new b(cVar, fVar);
            }

            public final e5.f d() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return t.c(this.a, bVar.a) && t.c(this.b, bVar.b);
            }

            public int hashCode() {
                A0.c cVar = this.a;
                return ((cVar == null ? 0 : cVar.hashCode()) * 31) + this.b.hashCode();
            }

            public String toString() {
                return "Error(painter=" + this.a + ", result=" + this.b + ')';
            }
        }

        public static final class c extends c {
            public final A0.c a;

            public c(A0.c cVar) {
                super(null);
                this.a = cVar;
            }

            public A0.c a() {
                return this.a;
            }

            public final c b(A0.c cVar) {
                return new c(cVar);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && t.c(this.a, ((c) obj).a);
            }

            public int hashCode() {
                A0.c cVar = this.a;
                if (cVar == null) {
                    return 0;
                }
                return cVar.hashCode();
            }

            public String toString() {
                return "Loading(painter=" + this.a + ')';
            }
        }

        public static final class d extends c {
            public final A0.c a;
            public final q b;

            public d(A0.c cVar, q qVar) {
                super(null);
                this.a = cVar;
                this.b = qVar;
            }

            public A0.c a() {
                return this.a;
            }

            public final q b() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return t.c(this.a, dVar.a) && t.c(this.b, dVar.b);
            }

            public int hashCode() {
                return (this.a.hashCode() * 31) + this.b.hashCode();
            }

            public String toString() {
                return "Success(painter=" + this.a + ", result=" + this.b + ')';
            }
        }

        public /* synthetic */ c(k kVar) {
            this();
        }

        public abstract A0.c a();

        public c() {
        }
    }

    public static final class d extends Ia.l implements p {
        public int a;

        public static final class a extends u implements Qa.a {
            public final /* synthetic */ b a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar) {
                super(0);
                this.a = bVar;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h invoke() {
                return this.a.y();
            }
        }

        public static final class b extends Ia.l implements p {
            public Object a;
            public int b;
            public final /* synthetic */ b c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(b bVar, Ga.e eVar) {
                super(2, eVar);
                this.c = bVar;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h hVar, Ga.e eVar) {
                return create(hVar, eVar).invokeSuspend(I.a);
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                return new b(this.c, eVar);
            }

            public final Object invokeSuspend(Object obj) {
                b bVar;
                Object f = Ha.c.f();
                int i = this.b;
                if (i == 0) {
                    Ca.t.b(obj);
                    b bVar2 = this.c;
                    T4.d w = bVar2.w();
                    b bVar3 = this.c;
                    h r = b.r(bVar3, bVar3.y());
                    this.a = bVar2;
                    this.b = 1;
                    Object b = w.b(r, this);
                    if (b == f) {
                        return f;
                    }
                    bVar = bVar2;
                    obj = b;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (b) this.a;
                    Ca.t.b(obj);
                }
                return b.q(bVar, (i) obj);
            }
        }

        public /* synthetic */ class c implements fb.f, n {
            public final /* synthetic */ b a;

            public c(b bVar) {
                this.a = bVar;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(c cVar, Ga.e eVar) {
                Object a = d.a(this.a, cVar, eVar);
                return a == Ha.c.f() ? a : I.a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof fb.f) && (obj instanceof n)) {
                    return t.c(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
                }
                return false;
            }

            public final Ca.h getFunctionDelegate() {
                return new kotlin.jvm.internal.a(2, this.a, b.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        public d(Ga.e eVar) {
            super(2, eVar);
        }

        public static final /* synthetic */ Object a(b bVar, c cVar, Ga.e eVar) {
            return i(bVar, cVar, eVar);
        }

        public static final /* synthetic */ Object i(b bVar, c cVar, Ga.e eVar) {
            b.s(bVar, cVar);
            return I.a;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return b.this.new d(eVar);
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                fb.e A = fb.g.A(U1.p(new a(b.this)), new b(b.this, null));
                c cVar = new c(b.this);
                this.a = 1;
                if (A.collect(cVar, this) == f) {
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

    public static final class f implements f5.i {

        public static final class a implements fb.e {
            public final /* synthetic */ fb.e a;

            public static final class a implements fb.f {
                public final /* synthetic */ fb.f a;

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

                public a(fb.f fVar) {
                    this.a = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, Ga.e r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof U4.b.f.a.a.a
                        if (r0 == 0) goto L13
                        r0 = r8
                        U4.b$f$a$a$a r0 = (U4.b.f.a.a.a) r0
                        int r1 = r0.b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.b = r1
                        goto L18
                    L13:
                        U4.b$f$a$a$a r0 = new U4.b$f$a$a$a
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.a
                        java.lang.Object r1 = Ha.c.f()
                        int r2 = r0.b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        Ca.t.b(r8)
                        goto L4b
                    L29:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L31:
                        Ca.t.b(r8)
                        fb.f r8 = r6.a
                        u0.l r7 = (u0.l) r7
                        long r4 = r7.m()
                        f5.h r7 = U4.c.b(r4)
                        if (r7 == 0) goto L4b
                        r0.b = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L4b
                        return r1
                    L4b:
                        Ca.I r7 = Ca.I.a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: U4.b.f.a.a.emit(java.lang.Object, Ga.e):java.lang.Object");
                }
            }

            public a(fb.e eVar) {
                this.a = eVar;
            }

            public Object collect(fb.f fVar, Ga.e eVar) {
                Object collect = this.a.collect(new a(fVar), eVar);
                return collect == Ha.c.f() ? collect : I.a;
            }
        }

        public f() {
        }

        public final Object b(Ga.e eVar) {
            return fb.g.s(new a(b.o(b.this)), eVar);
        }
    }

    public b(h hVar, T4.d dVar) {
        c.a aVar = c.a.a;
        this.l = aVar;
        this.n = w;
        this.p = M0.f.a.b();
        this.q = x0.f.a9.b();
        this.s = U1.i(aVar, null, 2, null);
        this.t = U1.i(hVar, null, 2, null);
        this.u = U1.i(dVar, null, 2, null);
    }

    private final void A(float f2) {
        this.j.setValue(Float.valueOf(f2));
    }

    private final void B(androidx.compose.ui.graphics.d dVar) {
        this.k.setValue(dVar);
    }

    private final void G(A0.c cVar) {
        this.i.setValue(cVar);
    }

    public static final /* synthetic */ l n() {
        return w;
    }

    public static final /* synthetic */ z o(b bVar) {
        return bVar.h;
    }

    public static final /* synthetic */ A0.c p(b bVar, Drawable drawable) {
        return bVar.N(drawable);
    }

    public static final /* synthetic */ c q(b bVar, i iVar) {
        return bVar.O(iVar);
    }

    public static final /* synthetic */ h r(b bVar, h hVar) {
        return bVar.P(hVar);
    }

    public static final /* synthetic */ void s(b bVar, c cVar) {
        bVar.Q(cVar);
    }

    private final void t() {
        O o = this.g;
        if (o != null) {
            cb.P.d(o, (CancellationException) null, 1, (Object) null);
        }
        this.g = null;
    }

    private final float u() {
        return ((Number) this.j.getValue()).floatValue();
    }

    private final androidx.compose.ui.graphics.d v() {
        return (androidx.compose.ui.graphics.d) this.k.getValue();
    }

    private final A0.c x() {
        return (A0.c) this.i.getValue();
    }

    public final void C(M0.f fVar) {
        this.p = fVar;
    }

    public final void D(int i) {
        this.q = i;
    }

    public final void E(T4.d dVar) {
        this.u.setValue(dVar);
    }

    public final void F(l lVar) {
        this.o = lVar;
    }

    public final void H(boolean z) {
        this.r = z;
    }

    public final void I(h hVar) {
        this.t.setValue(hVar);
    }

    public final void J(c cVar) {
        this.s.setValue(cVar);
    }

    public final void K(l lVar) {
        this.n = lVar;
    }

    public final void L(A0.c cVar) {
        this.m = cVar;
        G(cVar);
    }

    public final void M(c cVar) {
        this.l = cVar;
        J(cVar);
    }

    public final A0.c N(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? A0.b.b(v0.O.c(((BitmapDrawable) drawable).getBitmap()), 0L, 0L, this.q, 6, null) : new t5.a(drawable.mutate());
    }

    public final c O(i iVar) {
        if (iVar instanceof q) {
            q qVar = (q) iVar;
            return new c.d(N(qVar.a()), qVar);
        }
        if (!(iVar instanceof e5.f)) {
            throw new o();
        }
        Drawable a2 = iVar.a();
        return new c.b(a2 != null ? N(a2) : null, (e5.f) iVar);
    }

    public final h P(h hVar) {
        h.a o = h.R(hVar, null, 1, null).o(new e());
        if (hVar.q().m() == null) {
            o.n(new f());
        }
        if (hVar.q().l() == null) {
            o.m(g.g(this.p));
        }
        if (hVar.q().k() != f5.e.EXACT) {
            o.g(f5.e.INEXACT);
        }
        return o.a();
    }

    public final void Q(c cVar) {
        c cVar2 = this.l;
        c cVar3 = (c) this.n.invoke(cVar);
        M(cVar3);
        A0.c z = z(cVar2, cVar3);
        if (z == null) {
            z = cVar3.a();
        }
        L(z);
        if (this.g != null && cVar2.a() != cVar3.a()) {
            Object a2 = cVar2.a();
            v1 v1Var = a2 instanceof v1 ? (v1) a2 : null;
            if (v1Var != null) {
                v1Var.g();
            }
            Object a3 = cVar3.a();
            v1 v1Var2 = a3 instanceof v1 ? (v1) a3 : null;
            if (v1Var2 != null) {
                v1Var2.c();
            }
        }
        l lVar = this.o;
        if (lVar != null) {
            lVar.invoke(cVar3);
        }
    }

    public boolean a(float f2) {
        A(f2);
        return true;
    }

    public boolean b(androidx.compose.ui.graphics.d dVar) {
        B(dVar);
        return true;
    }

    public void c() {
        if (this.g != null) {
            return;
        }
        O a2 = cb.P.a(W0.b((B0) null, 1, (Object) null).plus(e0.c().E()));
        this.g = a2;
        Object obj = this.m;
        v1 v1Var = obj instanceof v1 ? (v1) obj : null;
        if (v1Var != null) {
            v1Var.c();
        }
        if (!this.r) {
            cb.i.d(a2, (Ga.i) null, (Q) null, new d(null), 3, (Object) null);
        } else {
            Drawable F = h.R(y(), null, 1, null).d(w().a()).a().F();
            Q(new c.c(F != null ? N(F) : null));
        }
    }

    public void e() {
        t();
        Object obj = this.m;
        v1 v1Var = obj instanceof v1 ? (v1) obj : null;
        if (v1Var != null) {
            v1Var.e();
        }
    }

    public void g() {
        t();
        Object obj = this.m;
        v1 v1Var = obj instanceof v1 ? (v1) obj : null;
        if (v1Var != null) {
            v1Var.g();
        }
    }

    public long k() {
        A0.c x = x();
        return x != null ? x.k() : u0.l.b.a();
    }

    public void m(x0.f fVar) {
        this.h.setValue(u0.l.c(fVar.e()));
        A0.c x = x();
        if (x != null) {
            x.j(fVar, fVar.e(), u(), v());
        }
    }

    public final T4.d w() {
        return (T4.d) this.u.getValue();
    }

    public final h y() {
        return (h) this.t.getValue();
    }

    public final U4.f z(c cVar, c cVar2) {
        i d2;
        if (!(cVar2 instanceof c.d)) {
            if (cVar2 instanceof c.b) {
                d2 = ((c.b) cVar2).d();
            }
            return null;
        }
        d2 = ((c.d) cVar2).b();
        i5.c a2 = d2.b().P().a(U4.c.a(), d2);
        if (a2 instanceof i5.a) {
            i5.a aVar = (i5.a) a2;
            return new U4.f(cVar instanceof c.c ? cVar.a() : null, cVar2.a(), this.p, aVar.b(), ((d2 instanceof q) && ((q) d2).d()) ? false : true, aVar.c());
        }
        return null;
    }

    public static final class a extends u implements l {
        public static final a a = new a();

        public a() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke(c cVar) {
            return cVar;
        }
    }

    public static final class e implements g5.a {
        public e() {
        }

        public void b(Drawable drawable) {
            b.s(b.this, new c.c(drawable != null ? b.p(b.this, drawable) : null));
        }

        public void a(Drawable drawable) {
        }

        public void c(Drawable drawable) {
        }
    }
}
