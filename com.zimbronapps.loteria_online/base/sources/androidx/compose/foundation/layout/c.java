package androidx.compose.foundation.layout;

import Ca.I;
import F.h;
import P0.L0;
import P0.N0;
import Qa.l;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c implements h {
    public static final c a = new c();

    public static final class a extends u implements l {
        public final /* synthetic */ o0.e a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o0.e eVar) {
            super(1);
            this.a = eVar;
        }

        public final void a(N0 n0) {
            n0.d("align");
            n0.e(this.a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public static final class b extends u implements l {
        public b() {
            super(1);
        }

        public final void a(N0 n0) {
            n0.d("matchParentSize");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public androidx.compose.ui.e a(androidx.compose.ui.e eVar, o0.e eVar2) {
        return eVar.then(new BoxChildDataElement(eVar2, false, L0.b() ? new a(eVar2) : L0.a()));
    }

    public androidx.compose.ui.e c(androidx.compose.ui.e eVar) {
        return eVar.then(new BoxChildDataElement(o0.e.a.e(), true, L0.b() ? new b() : L0.a()));
    }
}
