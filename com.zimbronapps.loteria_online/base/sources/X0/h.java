package x0;

import v0.m1;
import v0.q0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface h {
    static /* synthetic */ void e(h hVar, m1 m1Var, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i2 & 2) != 0) {
            i = q0.a.b();
        }
        hVar.b(m1Var, i);
    }

    static /* synthetic */ void g(h hVar, float f, float f2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
        }
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        hVar.d(f, f2);
    }

    void a(float[] fArr);

    void b(m1 m1Var, int i);

    void c(float f, float f2, float f3, float f4, int i);

    void d(float f, float f2);

    void f(float f, float f2, long j);

    void h(float f, long j);

    void i(float f, float f2, float f3, float f4);
}
