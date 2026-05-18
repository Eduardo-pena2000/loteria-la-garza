package b0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class r1 implements d {
    public static final a d = new a(null);
    public static final int e = 8;
    public final w.E a = new w.E(0, 1, null);
    public final w.L b = new w.L(0, 1, null);
    public Object c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public r1(Object obj) {
        this.c = obj;
    }

    public Object a() {
        return this.c;
    }

    public void b(int i, int i2) {
        this.a.h(2);
        this.a.h(i);
        this.a.h(i2);
    }

    public void c(Qa.p pVar, Object obj) {
        this.a.h(7);
        this.b.k(pVar);
        this.b.k(obj);
    }

    public void clear() {
        this.a.h(4);
    }

    public void d(int i, int i2, int i3) {
        this.a.h(3);
        this.a.h(i);
        this.a.h(i2);
        this.a.h(i3);
    }

    public void e(int i, Object obj) {
        this.a.h(6);
        this.a.h(i);
        this.b.k(obj);
    }

    public void g(int i, Object obj) {
        this.a.h(5);
        this.a.h(i);
        this.b.k(obj);
    }

    public void h(Object obj) {
        this.a.h(1);
        this.b.k(obj);
    }

    public void i() {
        this.a.h(8);
    }

    public void k() {
        this.a.h(0);
    }

    public final void l(d dVar, j0.q qVar) {
        Throwable th;
        int i;
        int i2;
        w.E e2 = this.a;
        int i3 = e2.b;
        w.L l = this.b;
        w.L l2 = new w.L(0, 1, null);
        dVar.j();
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = i4 + 1;
            try {
                try {
                    switch (e2.b(i4)) {
                        case 0:
                            dVar.k();
                            i4 = i6;
                        case 1:
                            int i7 = i5 + 1;
                            dVar.h(l.c(i5));
                            i5 = i7;
                            i4 = i6;
                        case 2:
                            int i8 = i4 + 2;
                            i4 += 3;
                            dVar.b(e2.b(i6), e2.b(i8));
                        case 3:
                            int i9 = i4 + 2;
                            try {
                                i = i4 + 3;
                            } catch (Exception e3) {
                                th = e3;
                                i4 = i9;
                            }
                            try {
                                i4 += 4;
                                dVar.d(e2.b(i6), e2.b(i9), e2.b(i));
                            } catch (Exception e4) {
                                th = e4;
                                i4 = i;
                                throw new j(l, l2, e2, i4, th);
                            }
                        case 4:
                            dVar.clear();
                            i4 = i6;
                        case 5:
                            i4 += 2;
                            i2 = i5 + 1;
                            dVar.g(e2.b(i6), l.c(i5));
                            i5 = i2;
                        case 6:
                            i4 += 2;
                            try {
                                i2 = i5 + 1;
                                dVar.e(e2.b(i6), l.c(i5));
                                i5 = i2;
                            } catch (Exception e5) {
                                th = e5;
                                throw new j(l, l2, e2, i4, th);
                            }
                        case 7:
                            int i10 = i5 + 1;
                            Object c = l.c(i5);
                            kotlin.jvm.internal.t.e(c, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                            i5 += 2;
                            dVar.c((Qa.p) kotlin.jvm.internal.V.e(c, 2), l.c(i10));
                            i4 = i6;
                        case 8:
                            Object a2 = dVar.a();
                            if (a2 instanceof i) {
                                qVar.k((i) a2);
                            }
                            l2.k(a2);
                            dVar.i();
                            i4 = i6;
                        default:
                            i4 = i6;
                    }
                } catch (Throwable th2) {
                    dVar.f();
                    throw th2;
                }
            } catch (Exception e6) {
                th = e6;
                i4 = i6;
            }
        }
        if (!(i5 == l.d())) {
            w.t("Applier operation size mismatch");
        }
        l.n();
        e2.j();
        dVar.f();
    }
}
