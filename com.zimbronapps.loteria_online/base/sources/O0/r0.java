package O0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class r0 {
    public static final int i = l0.L.l;
    public final l0.L a;
    public final Qa.l b = f.a;
    public final Qa.l c = g.a;
    public final Qa.l d = h.a;
    public final Qa.l e = b.a;
    public final Qa.l f = c.a;
    public final Qa.l g = d.a;
    public final Qa.l h = e.a;

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public static final a a = new a();

        public a() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
            return Boolean.valueOf(!((q0) obj).N0());
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final void a(J j) {
            if (j.N0()) {
                J.F1(j, false, 1, null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J) obj);
            return Ca.I.a;
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.l {
        public static final c a = new c();

        public c() {
            super(1);
        }

        public final void a(J j) {
            if (j.N0()) {
                J.F1(j, false, 1, null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J) obj);
            return Ca.I.a;
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.l {
        public static final d a = new d();

        public d() {
            super(1);
        }

        public final void a(J j) {
            if (j.N0()) {
                J.B1(j, false, 1, null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J) obj);
            return Ca.I.a;
        }
    }

    public static final class e extends kotlin.jvm.internal.u implements Qa.l {
        public static final e a = new e();

        public e() {
            super(1);
        }

        public final void a(J j) {
            if (j.N0()) {
                J.B1(j, false, 1, null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J) obj);
            return Ca.I.a;
        }
    }

    public static final class f extends kotlin.jvm.internal.u implements Qa.l {
        public static final f a = new f();

        public f() {
            super(1);
        }

        public final void a(J j) {
            if (j.N0()) {
                J.D1(j, false, false, false, 7, null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J) obj);
            return Ca.I.a;
        }
    }

    public static final class g extends kotlin.jvm.internal.u implements Qa.l {
        public static final g a = new g();

        public g() {
            super(1);
        }

        public final void a(J j) {
            if (j.N0()) {
                J.H1(j, false, false, false, 7, null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J) obj);
            return Ca.I.a;
        }
    }

    public static final class h extends kotlin.jvm.internal.u implements Qa.l {
        public static final h a = new h();

        public h() {
            super(1);
        }

        public final void a(J j) {
            if (j.N0()) {
                j.U0();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J) obj);
            return Ca.I.a;
        }
    }

    public r0(Qa.l lVar) {
        this.a = new l0.L(lVar);
    }

    public static /* synthetic */ void d(r0 r0Var, J j, boolean z, Qa.a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        r0Var.c(j, z, aVar);
    }

    public static /* synthetic */ void f(r0 r0Var, J j, boolean z, Qa.a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        r0Var.e(j, z, aVar);
    }

    public static /* synthetic */ void h(r0 r0Var, J j, boolean z, Qa.a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        r0Var.g(j, z, aVar);
    }

    public final void a(Object obj) {
        this.a.g(obj);
    }

    public final void b() {
        this.a.h(a.a);
    }

    public final void c(J j, boolean z, Qa.a aVar) {
        if (!z || j.j0() == null) {
            i(j, this.f, aVar);
        } else {
            i(j, this.g, aVar);
        }
    }

    public final void e(J j, boolean z, Qa.a aVar) {
        if (!z || j.j0() == null) {
            i(j, this.e, aVar);
        } else {
            i(j, this.h, aVar);
        }
    }

    public final void g(J j, boolean z, Qa.a aVar) {
        if (!z || j.j0() == null) {
            i(j, this.c, aVar);
        } else {
            i(j, this.b, aVar);
        }
    }

    public final void i(q0 q0Var, Qa.l lVar, Qa.a aVar) {
        this.a.k(q0Var, lVar, aVar);
    }

    public final void j(J j, Qa.a aVar) {
        i(j, this.d, aVar);
    }

    public final void k() {
        this.a.q();
    }

    public final void l() {
        this.a.r();
        this.a.f();
    }
}
