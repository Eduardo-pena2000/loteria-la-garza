package I;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class k {
    public static final /* synthetic */ Void a() {
        return c();
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, l lVar, i iVar, boolean z, n1.t tVar, C.q qVar, boolean z2, b0.m mVar, int i) {
        if (b0.w.L()) {
            b0.w.U(1331498025, i, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutBeyondBoundsModifier (LazyLayoutBeyondBoundsModifierLocal.kt:51)");
        }
        if (z2) {
            mVar.V(-1890632411);
            boolean z3 = ((((i & 112) ^ 48) > 32 && mVar.U(lVar)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && mVar.U(iVar)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && mVar.a(z)) || (i & 3072) == 2048) | ((((57344 & i) ^ 24576) > 16384 && mVar.U(tVar)) || (i & 24576) == 16384) | ((((458752 & i) ^ 196608) > 131072 && mVar.U(qVar)) || (i & 196608) == 131072);
            Object C = mVar.C();
            if (z3 || C == b0.m.a.a()) {
                C = new j(lVar, iVar, z, tVar, qVar);
                mVar.t(C);
            }
            eVar = eVar.then((j) C);
            mVar.P();
        } else {
            mVar.V(-1890658823);
            mVar.P();
        }
        if (b0.w.L()) {
            b0.w.T();
        }
        return eVar;
    }

    public static final Void c() {
        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
    }
}
