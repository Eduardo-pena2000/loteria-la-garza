package C;

import A.U;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface y {
    static /* synthetic */ Object f(y yVar, U u, Qa.p pVar, Ga.e eVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
        }
        if ((i & 1) != 0) {
            u = U.Default;
        }
        return yVar.c(u, pVar, eVar);
    }

    boolean a();

    default boolean b() {
        return true;
    }

    Object c(U u, Qa.p pVar, Ga.e eVar);

    default boolean d() {
        return true;
    }

    float e(float f);
}
