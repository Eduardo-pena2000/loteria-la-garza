package androidx.compose.foundation;

import Ca.I;
import E.m;
import P0.K0;
import P0.L0;
import P0.N0;
import Qa.l;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class FocusableKt {
    public static final K0 a;
    public static final FocusableKt$FocusableInNonTouchModeElement$1 b;

    public static final class a extends u implements l {
        public a() {
            super(1);
        }

        public final void a(N0 n0) {
            n0.d("focusGroup");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    static {
        a = new K0(L0.b() ? new a() : L0.a());
        b = new FocusableKt$FocusableInNonTouchModeElement$1();
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, boolean z, m mVar) {
        return eVar.then(z ? new FocusableElement(mVar) : androidx.compose.ui.e.a);
    }
}
