package androidx.compose.foundation.layout;

import Ca.I;
import P0.L0;
import P0.N0;
import Qa.l;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b {

    public static final class a extends u implements l {
        public final /* synthetic */ float a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, boolean z) {
            super(1);
            this.a = f;
            this.b = z;
        }

        public final void a(N0 n0) {
            n0.d("aspectRatio");
            n0.b().c("ratio", Float.valueOf(this.a));
            n0.b().c("matchHeightConstraintsFirst", Boolean.valueOf(this.b));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f, boolean z) {
        return eVar.then(new AspectRatioElement(f, z, L0.b() ? new a(f, z) : L0.a()));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, float f, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return a(eVar, f, z);
    }
}
