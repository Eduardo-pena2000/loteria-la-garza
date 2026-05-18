package v0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface j0 {
    static /* synthetic */ void l(j0 j0Var, m1 m1Var, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i2 & 2) != 0) {
            i = q0.a.b();
        }
        j0Var.b(m1Var, i);
    }

    static /* synthetic */ void p(j0 j0Var, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i2 & 16) != 0) {
            i = q0.a.b();
        }
        j0Var.c(f, f2, f3, f4, i);
    }

    static /* synthetic */ void x(j0 j0Var, u0.h hVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i2 & 2) != 0) {
            i = q0.a.b();
        }
        j0Var.i(hVar, i);
    }

    void b(m1 m1Var, int i);

    void c(float f, float f2, float f3, float f4, int i);

    void d(float f, float f2);

    void e(float f, float f2);

    void f(float f, float f2, float f3, float f4, float f5, float f6, k1 k1Var);

    void g(long j, long j2, k1 k1Var);

    void h(long j, float f, k1 k1Var);

    default void i(u0.h hVar, int i) {
        c(hVar.i(), hVar.l(), hVar.j(), hVar.e(), i);
    }

    void j(float f, float f2, float f3, float f4, float f5, float f6, boolean z, k1 k1Var);

    void k();

    void m(b1 b1Var, long j, k1 k1Var);

    void n(b1 b1Var, long j, long j2, long j3, long j4, k1 k1Var);

    void o();

    void q(float f, float f2, float f3, float f4, k1 k1Var);

    void r(float f);

    void s();

    void t();

    void u(float[] fArr);

    void v(m1 m1Var, k1 k1Var);

    void w(u0.h hVar, k1 k1Var);
}
