package F;

import F.c;
import o0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class l {
    public static final M0.B a = new m(c.a.h(), o0.e.a.k());

    public static final M0.B a(c.m mVar, e.b bVar, b0.m mVar2, int i) {
        M0.B b;
        if (b0.w.L()) {
            b0.w.U(1089876336, i, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:106)");
        }
        if (kotlin.jvm.internal.t.c(mVar, c.a.h()) && kotlin.jvm.internal.t.c(bVar, o0.e.a.k())) {
            mVar2.V(345962472);
            mVar2.P();
            b = a;
        } else {
            mVar2.V(346016319);
            boolean z = ((((i & 14) ^ 6) > 4 && mVar2.U(mVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && mVar2.U(bVar)) || (i & 48) == 32);
            Object C = mVar2.C();
            if (z || C == b0.m.a.a()) {
                C = new m(mVar, bVar);
                mVar2.t(C);
            }
            b = (m) C;
            mVar2.P();
        }
        if (b0.w.L()) {
            b0.w.T();
        }
        return b;
    }

    public static final long b(boolean z, int i, int i2, int i3, int i4) {
        return !z ? n1.c.a(i2, i4, i, i3) : n1.b.b.a(i2, i4, i, i3);
    }
}
