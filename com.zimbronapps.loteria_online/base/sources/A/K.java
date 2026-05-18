package A;

import b0.B1;
import b0.g1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class k {

    public static final class a extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ androidx.compose.ui.e a;
        public final /* synthetic */ Qa.l b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.e eVar, Qa.l lVar, int i) {
            super(2);
            this.a = eVar;
            this.b = lVar;
            this.c = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            k.a(this.a, this.b, mVar, g1.a(this.c | 1));
        }
    }

    public static final void a(androidx.compose.ui.e eVar, Qa.l lVar, b0.m mVar, int i) {
        int i2;
        b0.m i3 = mVar.i(-932836462);
        if ((i & 6) == 0) {
            i2 = (i3.U(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.E(lVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i3.j()) {
            i3.M();
        } else {
            if (b0.w.L()) {
                b0.w.U(-932836462, i2, -1, "androidx.compose.foundation.Canvas (Canvas.kt:42)");
            }
            F.Y.a(androidx.compose.ui.draw.a.b(eVar, lVar), i3, 0);
            if (b0.w.L()) {
                b0.w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new a(eVar, lVar, i));
        }
    }
}
