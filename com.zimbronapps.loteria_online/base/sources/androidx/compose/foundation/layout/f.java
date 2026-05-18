package androidx.compose.foundation.layout;

import Ca.I;
import F.L;
import F.M;
import P0.N0;
import Qa.l;
import kotlin.jvm.internal.u;
import n1.h;
import n1.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class f {

    public static final class a extends u implements l {
        public final /* synthetic */ float a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, float f2, float f3, float f4) {
            super(1);
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public final void a(N0 n0) {
            n0.d("padding");
            n0.b().c("start", h.d(this.a));
            n0.b().c("top", h.d(this.b));
            n0.b().c("end", h.d(this.c));
            n0.b().c("bottom", h.d(this.d));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public static final class b extends u implements l {
        public final /* synthetic */ float a;
        public final /* synthetic */ float b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f, float f2) {
            super(1);
            this.a = f;
            this.b = f2;
        }

        public final void a(N0 n0) {
            n0.d("padding");
            n0.b().c("horizontal", h.d(this.a));
            n0.b().c("vertical", h.d(this.b));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public static final class c extends u implements l {
        public final /* synthetic */ float a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f) {
            super(1);
            this.a = f;
        }

        public final void a(N0 n0) {
            n0.d("padding");
            n0.e(h.d(this.a));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public static final class d extends u implements l {
        public final /* synthetic */ L a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(L l) {
            super(1);
            this.a = l;
        }

        public final void a(N0 n0) {
            n0.d("padding");
            n0.b().c("paddingValues", this.a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public static final L a(float f) {
        return new M(f, f, f, f, null);
    }

    public static final L b(float f, float f2) {
        return new M(f, f2, f, f2, null);
    }

    public static /* synthetic */ L c(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = h.g(0);
        }
        if ((i & 2) != 0) {
            f2 = h.g(0);
        }
        return b(f, f2);
    }

    public static final L d(float f, float f2, float f3, float f4) {
        return new M(f, f2, f3, f4, null);
    }

    public static /* synthetic */ L e(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = h.g(0);
        }
        if ((i & 2) != 0) {
            f2 = h.g(0);
        }
        if ((i & 4) != 0) {
            f3 = h.g(0);
        }
        if ((i & 8) != 0) {
            f4 = h.g(0);
        }
        return d(f, f2, f3, f4);
    }

    public static final float f(L l, t tVar) {
        return tVar == t.a ? l.c(tVar) : l.b(tVar);
    }

    public static final float g(L l, t tVar) {
        return tVar == t.a ? l.b(tVar) : l.c(tVar);
    }

    public static final androidx.compose.ui.e h(androidx.compose.ui.e eVar, L l) {
        return eVar.then(new PaddingValuesElement(l, new d(l)));
    }

    public static final androidx.compose.ui.e i(androidx.compose.ui.e eVar, float f) {
        return eVar.then(new PaddingElement(f, f, f, f, true, new c(f), null));
    }

    public static final androidx.compose.ui.e j(androidx.compose.ui.e eVar, float f, float f2) {
        return eVar.then(new PaddingElement(f, f2, f, f2, true, new b(f, f2), null));
    }

    public static /* synthetic */ androidx.compose.ui.e k(androidx.compose.ui.e eVar, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = h.g(0);
        }
        if ((i & 2) != 0) {
            f2 = h.g(0);
        }
        return j(eVar, f, f2);
    }

    public static final androidx.compose.ui.e l(androidx.compose.ui.e eVar, float f, float f2, float f3, float f4) {
        return eVar.then(new PaddingElement(f, f2, f3, f4, true, new a(f, f2, f3, f4), null));
    }

    public static /* synthetic */ androidx.compose.ui.e m(androidx.compose.ui.e eVar, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = h.g(0);
        }
        if ((i & 2) != 0) {
            f2 = h.g(0);
        }
        if ((i & 4) != 0) {
            f3 = h.g(0);
        }
        if ((i & 8) != 0) {
            f4 = h.g(0);
        }
        return l(eVar, f, f2, f3, f4);
    }
}
