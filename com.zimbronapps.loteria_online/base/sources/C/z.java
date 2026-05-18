package C;

import b0.U1;
import b0.h2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class z {

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ h2 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h2 h2Var) {
            super(1);
            this.a = h2Var;
        }

        public final Float a(float f) {
            return (Float) ((Qa.l) this.a.getValue()).invoke(Float.valueOf(f));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    public static final y a(Qa.l lVar) {
        return new i(lVar);
    }

    public static final y b(Qa.l lVar, b0.m mVar, int i) {
        if (b0.w.L()) {
            b0.w.U(-180460798, i, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:161)");
        }
        h2 o = U1.o(lVar, mVar, i & 14);
        Object C = mVar.C();
        if (C == b0.m.a.a()) {
            C = a(new a(o));
            mVar.t(C);
        }
        y yVar = (y) C;
        if (b0.w.L()) {
            b0.w.T();
        }
        return yVar;
    }
}
