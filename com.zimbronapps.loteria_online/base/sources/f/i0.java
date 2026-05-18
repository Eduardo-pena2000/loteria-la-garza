package F;

import P0.L0;
import P0.N0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class i0 {

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public a() {
            super(1);
        }

        public final void a(N0 n0) {
            n0.d("navigationBarsPadding");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return Ca.I.a;
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.q {
        public b() {
            super(3);
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, b0.m mVar, int i) {
            mVar.V(359872873);
            if (b0.w.L()) {
                b0.w.U(359872873, i, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
            }
            f0 c = f0.x.c(mVar, 6);
            boolean U = mVar.U(c);
            Object C = mVar.C();
            if (U || C == b0.m.a.a()) {
                C = new z(c.d());
                mVar.t(C);
            }
            z zVar = (z) C;
            if (b0.w.L()) {
                b0.w.T();
            }
            mVar.P();
            return zVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (b0.m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar) {
        return androidx.compose.ui.c.b(eVar, L0.b() ? new a() : L0.a(), new b());
    }
}
