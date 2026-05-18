package H;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class f {
    public static final I.l a(I i, b0.m mVar, int i2) {
        if (b0.w.L()) {
            b0.w.U(2004349821, i2, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridBeyondBoundsState (LazyGridBeyondBoundsModifier.kt:23)");
        }
        boolean z = (((i2 & 14) ^ 6) > 4 && mVar.U(i)) || (i2 & 6) == 4;
        Object C = mVar.C();
        if (z || C == b0.m.a.a()) {
            C = new g(i);
            mVar.t(C);
        }
        g gVar = (g) C;
        if (b0.w.L()) {
            b0.w.T();
        }
        return gVar;
    }
}
