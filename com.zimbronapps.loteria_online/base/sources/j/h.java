package J;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class h {
    public static final I.l a(C c, int i, b0.m mVar, int i2) {
        if (b0.w.L()) {
            b0.w.U(373558254, i2, -1, "androidx.compose.foundation.pager.rememberPagerBeyondBoundsState (PagerBeyondBoundsModifier.kt:25)");
        }
        boolean z = ((((i2 & 14) ^ 6) > 4 && mVar.U(c)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && mVar.d(i)) || (i2 & 48) == 32);
        Object C = mVar.C();
        if (z || C == b0.m.a.a()) {
            C = new i(c, i);
            mVar.t(C);
        }
        i iVar = (i) C;
        if (b0.w.L()) {
            b0.w.T();
        }
        return iVar;
    }
}
