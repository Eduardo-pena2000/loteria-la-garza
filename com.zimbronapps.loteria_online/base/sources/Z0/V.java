package Z0;

import java.util.List;
import v0.C1;
import v0.m1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface v {
    static /* synthetic */ void C(v vVar, v0.j0 j0Var, v0.h0 h0Var, float f, C1 c1, l1.k kVar, x0.g gVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
        }
        vVar.B(j0Var, h0Var, (i2 & 4) != 0 ? Float.NaN : f, (i2 & 8) != 0 ? null : c1, (i2 & 16) != 0 ? null : kVar, (i2 & 32) != 0 ? null : gVar, (i2 & 64) != 0 ? x0.f.a9.a() : i);
    }

    static /* synthetic */ void h(v vVar, v0.j0 j0Var, long j, C1 c1, l1.k kVar, x0.g gVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
        }
        vVar.z(j0Var, (i2 & 2) != 0 ? v0.r0.b.j() : j, (i2 & 4) != 0 ? null : c1, (i2 & 8) != 0 ? null : kVar, (i2 & 16) == 0 ? gVar : null, (i2 & 32) != 0 ? x0.f.a9.a() : i);
    }

    long A(u0.h hVar, int i, R0 r0);

    void B(v0.j0 j0Var, v0.h0 h0Var, float f, C1 c1, l1.k kVar, x0.g gVar, int i);

    float a();

    float b();

    l1.i c(int i);

    float d(int i);

    u0.h e(int i);

    long f(int i);

    float g();

    float getHeight();

    float getWidth();

    int i(long j);

    int j(int i);

    int k(int i, boolean z);

    int l();

    float m(int i);

    boolean n();

    int o(float f);

    m1 p(int i, int i2);

    float q(int i, boolean z);

    float r(int i);

    void s(long j, float[] fArr, int i);

    float t();

    int u(int i);

    l1.i v(int i);

    float w(int i);

    u0.h x(int i);

    List y();

    void z(v0.j0 j0Var, long j, C1 c1, l1.k kVar, x0.g gVar, int i);
}
