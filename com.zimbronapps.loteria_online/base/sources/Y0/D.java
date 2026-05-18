package y0;

import android.graphics.Matrix;
import android.graphics.Outline;
import v0.j0;
import v0.r0;
import v0.u1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface d {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final Qa.l b = a.a;

        public static final class a extends kotlin.jvm.internal.u implements Qa.l {
            public static final a a = new a();

            public a() {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((x0.f) obj);
                return Ca.I.a;
            }

            public final void invoke(x0.f fVar) {
                x0.f.s1(fVar, r0.b.i(), 0L, 0L, 0.0f, null, null, 0, 126, null);
            }
        }

        public final Qa.l a() {
            return b;
        }
    }

    long A();

    long B();

    float C();

    void D(u1 u1Var);

    float E();

    float F();

    void G(float f);

    float H();

    void I(n1.d dVar, n1.t tVar, c cVar, Qa.l lVar);

    Matrix J();

    default boolean K() {
        return false;
    }

    void L(boolean z);

    void M(Outline outline, long j);

    void N(long j);

    void O(j0 j0Var);

    void P(int i);

    float Q();

    float a();

    void b(int i);

    void c(androidx.compose.ui.graphics.d dVar);

    void d(float f);

    u1 e();

    void f(float f);

    androidx.compose.ui.graphics.d g();

    float h();

    float i();

    int j();

    void k(long j);

    void l(float f);

    float m();

    void n(boolean z);

    void o(long j);

    void p();

    int q();

    void r(float f);

    void s(float f);

    void t(float f);

    float u();

    void v(float f);

    void w(float f);

    void x(int i, int i2, long j);

    void y(float f);

    default boolean z() {
        return true;
    }
}
