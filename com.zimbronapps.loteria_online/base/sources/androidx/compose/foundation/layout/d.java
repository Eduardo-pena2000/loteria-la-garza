package androidx.compose.foundation.layout;

import Ca.I;
import F.E;
import P0.L0;
import P0.N0;
import Qa.l;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class d {

    public static final class a extends u implements l {
        public final /* synthetic */ E a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(E e) {
            super(1);
            this.a = e;
        }

        public final void a(N0 n0) {
            n0.d("height");
            n0.b().c("intrinsicSize", this.a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public static final class b extends u implements l {
        public final /* synthetic */ E a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(E e) {
            super(1);
            this.a = e;
        }

        public final void a(N0 n0) {
            n0.d("width");
            n0.b().c("intrinsicSize", this.a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, E e) {
        return eVar.then(new IntrinsicHeightElement(e, true, L0.b() ? new a(e) : L0.a()));
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, E e) {
        return eVar.then(new IntrinsicWidthElement(e, true, L0.b() ? new b(e) : L0.a()));
    }
}
