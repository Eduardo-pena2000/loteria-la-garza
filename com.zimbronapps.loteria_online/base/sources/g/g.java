package G;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class g {
    public static final I.l a(B b, int i, b0.m mVar, int i2) {
        if (b0.w.L()) {
            b0.w.U(-1877443446, i2, -1, "androidx.compose.foundation.lazy.rememberLazyListBeyondBoundsState (LazyListBeyondBoundsModifier.kt:26)");
        }
        boolean z = ((((i2 & 14) ^ 6) > 4 && mVar.U(b)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && mVar.d(i)) || (i2 & 48) == 32);
        Object C = mVar.C();
        if (z || C == b0.m.a.a()) {
            C = new h(b, i);
            mVar.t(C);
        }
        h hVar = (h) C;
        if (b0.w.L()) {
            b0.w.T();
        }
        return hVar;
    }
}
