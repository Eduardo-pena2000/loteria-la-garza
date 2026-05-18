package W;

import A.M;
import b0.U1;
import b0.h2;
import b0.w;
import v0.t0;
import z.F;
import z.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class p {
    public static final r0 a = new r0(15, 0, F.e(), 2, null);

    public static final /* synthetic */ z.i a(E.j jVar) {
        return d(jVar);
    }

    public static final /* synthetic */ z.i b(E.j jVar) {
        return e(jVar);
    }

    public static final O0.j c(E.k kVar, boolean z, float f, t0 t0Var, Qa.a aVar) {
        return t.d(kVar, z, f, t0Var, aVar);
    }

    public static final z.i d(E.j jVar) {
        return jVar instanceof E.g ? a : jVar instanceof E.d ? new r0(45, 0, F.e(), 2, null) : jVar instanceof E.b ? new r0(45, 0, F.e(), 2, null) : a;
    }

    public static final z.i e(E.j jVar) {
        return jVar instanceof E.g ? a : jVar instanceof E.d ? a : jVar instanceof E.b ? new r0(150, 0, F.e(), 2, null) : a;
    }

    public static final M f(boolean z, float f, long j, b0.m mVar, int i, int i2) {
        boolean z2 = true;
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            f = n1.h.b.c();
        }
        if ((i2 & 4) != 0) {
            j = v0.r0.b.j();
        }
        if (w.L()) {
            w.U(1635163520, i, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:146)");
        }
        h2 o = U1.o(v0.r0.m(j), mVar, (i >> 6) & 14);
        boolean z3 = (((i & 14) ^ 6) > 4 && mVar.a(z)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !mVar.c(f)) && (i & 48) != 32) {
            z2 = false;
        }
        boolean z4 = z3 | z2;
        Object C = mVar.C();
        if (z4 || C == b0.m.a.a()) {
            C = new e(z, f, o, null);
            mVar.t(C);
        }
        e eVar = (e) C;
        if (w.L()) {
            w.T();
        }
        return eVar;
    }
}
