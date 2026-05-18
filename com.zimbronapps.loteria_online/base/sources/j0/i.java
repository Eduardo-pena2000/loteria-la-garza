package j0;

import b0.d1;
import b0.f1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class i {
    public static final Object a = new Object();

    public static final int a(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final b b(int i, boolean z, Object obj) {
        return new h(i, z, obj);
    }

    public static final int c(int i) {
        return a(2, i);
    }

    public static final b d(int i, boolean z, Object obj, b0.m mVar, int i2) {
        if (b0.w.L()) {
            b0.w.U(-1573003438, i2, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:1371)");
        }
        Object C = mVar.C();
        if (C == b0.m.a.a()) {
            C = new h(i, z, obj);
            mVar.t(C);
        }
        h hVar = (h) C;
        hVar.u(obj);
        if (b0.w.L()) {
            b0.w.T();
        }
        return hVar;
    }

    public static final boolean e(d1 d1Var, d1 d1Var2) {
        if (d1Var != null) {
            if ((d1Var instanceof f1) && (d1Var2 instanceof f1)) {
                f1 f1Var = (f1) d1Var;
                if (!f1Var.u() || kotlin.jvm.internal.t.c(d1Var, d1Var2) || kotlin.jvm.internal.t.c(f1Var.h(), ((f1) d1Var2).h())) {
                }
            }
            return false;
        }
        return true;
    }

    public static final int f(int i) {
        return a(1, i);
    }
}
