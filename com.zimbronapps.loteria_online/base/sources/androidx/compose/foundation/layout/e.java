package androidx.compose.foundation.layout;

import Ca.I;
import P0.N0;
import Qa.l;
import kotlin.jvm.internal.u;
import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class e {

    public static final class a extends u implements l {
        public final /* synthetic */ float a;
        public final /* synthetic */ float b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, float f2) {
            super(1);
            this.a = f;
            this.b = f2;
        }

        public final void a(N0 n0) {
            n0.d("offset");
            n0.b().c("x", h.d(this.a));
            n0.b().c("y", h.d(this.b));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f, float f2) {
        return eVar.then(new OffsetElement(f, f2, true, new a(f, f2), null));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = h.g(0);
        }
        if ((i & 2) != 0) {
            f2 = h.g(0);
        }
        return a(eVar, f, f2);
    }
}
