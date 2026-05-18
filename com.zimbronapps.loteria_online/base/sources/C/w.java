package C;

import A.b0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class w {
    public static final w a = new w();

    public final n a(b0.m mVar, int i) {
        if (b0.w.L()) {
            b0.w.U(1107739818, i, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:570)");
        }
        z.z b = y.F.b(mVar, 0);
        boolean U = mVar.U(b);
        Object C = mVar.C();
        if (U || C == b0.m.a.a()) {
            C = new h(b, null, 2, null);
            mVar.t(C);
        }
        h hVar = (h) C;
        if (b0.w.L()) {
            b0.w.T();
        }
        return hVar;
    }

    public final b0 b(b0.m mVar, int i) {
        if (b0.w.L()) {
            b0.w.U(1809802212, i, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:583)");
        }
        b0 a2 = A.c.a(mVar, 0);
        if (b0.w.L()) {
            b0.w.T();
        }
        return a2;
    }

    public final boolean c(n1.t tVar, q qVar, boolean z) {
        return (tVar != n1.t.b || qVar == q.Vertical) ? !z : z;
    }
}
