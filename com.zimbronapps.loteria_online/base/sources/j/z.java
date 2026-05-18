package J;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class z {
    public static final I.E a(C c, boolean z, b0.m mVar, int i) {
        if (b0.w.L()) {
            b0.w.U(-786344289, i, -1, "androidx.compose.foundation.pager.rememberPagerSemanticState (PagerSemantics.kt:26)");
        }
        boolean z2 = ((((i & 14) ^ 6) > 4 && mVar.U(c)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && mVar.a(z)) || (i & 48) == 32);
        Object C = mVar.C();
        if (z2 || C == b0.m.a.a()) {
            C = d.a(c, z);
            mVar.t(C);
        }
        I.E e = (I.E) C;
        if (b0.w.L()) {
            b0.w.T();
        }
        return e;
    }
}
