package androidx.compose.foundation.layout;

import Ca.I;
import P0.L0;
import P0.N0;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.WrapContentElement;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import o0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class g {
    public static final FillElement a;
    public static final FillElement b;
    public static final FillElement c;
    public static final WrapContentElement d;
    public static final WrapContentElement e;
    public static final WrapContentElement f;
    public static final WrapContentElement g;
    public static final WrapContentElement h;
    public static final WrapContentElement i;

    public static final class a extends u implements Qa.l {
        public final /* synthetic */ float a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f) {
            super(1);
            this.a = f;
        }

        public final void a(N0 n0) {
            n0.d("height");
            n0.e(n1.h.d(this.a));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public static final class b extends u implements Qa.l {
        public final /* synthetic */ float a;
        public final /* synthetic */ float b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f, float f2) {
            super(1);
            this.a = f;
            this.b = f2;
        }

        public final void a(N0 n0) {
            n0.d("heightIn");
            n0.b().c("min", n1.h.d(this.a));
            n0.b().c("max", n1.h.d(this.b));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public static final class c extends u implements Qa.l {
        public final /* synthetic */ float a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f) {
            super(1);
            this.a = f;
        }

        public final void a(N0 n0) {
            n0.d("requiredHeight");
            n0.e(n1.h.d(this.a));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public static final class d extends u implements Qa.l {
        public final /* synthetic */ float a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f) {
            super(1);
            this.a = f;
        }

        public final void a(N0 n0) {
            n0.d("requiredSize");
            n0.e(n1.h.d(this.a));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public static final class e extends u implements Qa.l {
        public final /* synthetic */ float a;
        public final /* synthetic */ float b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(float f, float f2) {
            super(1);
            this.a = f;
            this.b = f2;
        }

        public final void a(N0 n0) {
            n0.d("requiredSize");
            n0.b().c("width", n1.h.d(this.a));
            n0.b().c("height", n1.h.d(this.b));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public static final class f extends u implements Qa.l {
        public final /* synthetic */ float a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(float f, float f2, float f3, float f4) {
            super(1);
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public final void a(N0 n0) {
            n0.d("requiredSizeIn");
            n0.b().c("minWidth", n1.h.d(this.a));
            n0.b().c("minHeight", n1.h.d(this.b));
            n0.b().c("maxWidth", n1.h.d(this.c));
            n0.b().c("maxHeight", n1.h.d(this.d));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public static final class g extends u implements Qa.l {
        public final /* synthetic */ float a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(float f) {
            super(1);
            this.a = f;
        }

        public final void a(N0 n0) {
            n0.d("requiredWidth");
            n0.e(n1.h.d(this.a));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public static final class h extends u implements Qa.l {
        public final /* synthetic */ float a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(float f) {
            super(1);
            this.a = f;
        }

        public final void a(N0 n0) {
            n0.d("size");
            n0.e(n1.h.d(this.a));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public static final class i extends u implements Qa.l {
        public final /* synthetic */ float a;
        public final /* synthetic */ float b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(float f, float f2) {
            super(1);
            this.a = f;
            this.b = f2;
        }

        public final void a(N0 n0) {
            n0.d("size");
            n0.b().c("width", n1.h.d(this.a));
            n0.b().c("height", n1.h.d(this.b));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public static final class j extends u implements Qa.l {
        public final /* synthetic */ float a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(float f, float f2, float f3, float f4) {
            super(1);
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public final void a(N0 n0) {
            n0.d("sizeIn");
            n0.b().c("minWidth", n1.h.d(this.a));
            n0.b().c("minHeight", n1.h.d(this.b));
            n0.b().c("maxWidth", n1.h.d(this.c));
            n0.b().c("maxHeight", n1.h.d(this.d));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public static final class k extends u implements Qa.l {
        public final /* synthetic */ float a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(float f) {
            super(1);
            this.a = f;
        }

        public final void a(N0 n0) {
            n0.d("width");
            n0.e(n1.h.d(this.a));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public static final class l extends u implements Qa.l {
        public final /* synthetic */ float a;
        public final /* synthetic */ float b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(float f, float f2) {
            super(1);
            this.a = f;
            this.b = f2;
        }

        public final void a(N0 n0) {
            n0.d("widthIn");
            n0.b().c("min", n1.h.d(this.a));
            n0.b().c("max", n1.h.d(this.b));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    static {
        FillElement.a aVar = FillElement.e;
        a = aVar.c(1.0f);
        b = aVar.a(1.0f);
        c = aVar.b(1.0f);
        WrapContentElement.a aVar2 = WrapContentElement.g;
        e.a aVar3 = o0.e.a;
        d = aVar2.c(aVar3.g(), false);
        e = aVar2.c(aVar3.k(), false);
        f = aVar2.a(aVar3.i(), false);
        g = aVar2.a(aVar3.l(), false);
        h = aVar2.b(aVar3.e(), false);
        i = aVar2.b(aVar3.o(), false);
    }

    public static final androidx.compose.ui.e A(androidx.compose.ui.e eVar, o0.e eVar2, boolean z) {
        e.a aVar = o0.e.a;
        return eVar.then((!t.c(eVar2, aVar.e()) || z) ? (!t.c(eVar2, aVar.o()) || z) ? WrapContentElement.g.b(eVar2, z) : i : h);
    }

    public static /* synthetic */ androidx.compose.ui.e B(androidx.compose.ui.e eVar, o0.e eVar2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            eVar2 = o0.e.a.e();
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return A(eVar, eVar2, z);
    }

    public static final androidx.compose.ui.e C(androidx.compose.ui.e eVar, e.b bVar, boolean z) {
        e.a aVar = o0.e.a;
        return eVar.then((!t.c(bVar, aVar.g()) || z) ? (!t.c(bVar, aVar.k()) || z) ? WrapContentElement.g.c(bVar, z) : e : d);
    }

    public static /* synthetic */ androidx.compose.ui.e D(androidx.compose.ui.e eVar, e.b bVar, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bVar = o0.e.a.g();
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return C(eVar, bVar, z);
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f2, float f3) {
        return eVar.then(new UnspecifiedConstraintsElement(f2, f3, null));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = n1.h.b.c();
        }
        if ((i2 & 2) != 0) {
            f3 = n1.h.b.c();
        }
        return a(eVar, f2, f3);
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, float f2) {
        return eVar.then(f2 == 1.0f ? b : FillElement.e.a(f2));
    }

    public static /* synthetic */ androidx.compose.ui.e d(androidx.compose.ui.e eVar, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        return c(eVar, f2);
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, float f2) {
        return eVar.then(f2 == 1.0f ? c : FillElement.e.b(f2));
    }

    public static /* synthetic */ androidx.compose.ui.e f(androidx.compose.ui.e eVar, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        return e(eVar, f2);
    }

    public static final androidx.compose.ui.e g(androidx.compose.ui.e eVar, float f2) {
        return eVar.then(f2 == 1.0f ? a : FillElement.e.c(f2));
    }

    public static /* synthetic */ androidx.compose.ui.e h(androidx.compose.ui.e eVar, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        return g(eVar, f2);
    }

    public static final androidx.compose.ui.e i(androidx.compose.ui.e eVar, float f2) {
        return eVar.then(new SizeElement(0.0f, f2, 0.0f, f2, true, L0.b() ? new a(f2) : L0.a(), 5, null));
    }

    public static final androidx.compose.ui.e j(androidx.compose.ui.e eVar, float f2, float f3) {
        return eVar.then(new SizeElement(0.0f, f2, 0.0f, f3, true, L0.b() ? new b(f2, f3) : L0.a(), 5, null));
    }

    public static /* synthetic */ androidx.compose.ui.e k(androidx.compose.ui.e eVar, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = n1.h.b.c();
        }
        if ((i2 & 2) != 0) {
            f3 = n1.h.b.c();
        }
        return j(eVar, f2, f3);
    }

    public static final androidx.compose.ui.e l(androidx.compose.ui.e eVar, float f2) {
        return eVar.then(new SizeElement(0.0f, f2, 0.0f, f2, false, L0.b() ? new c(f2) : L0.a(), 5, null));
    }

    public static final androidx.compose.ui.e m(androidx.compose.ui.e eVar, float f2) {
        return eVar.then(new SizeElement(f2, f2, f2, f2, false, L0.b() ? new d(f2) : L0.a(), null));
    }

    public static final androidx.compose.ui.e n(androidx.compose.ui.e eVar, float f2, float f3) {
        return eVar.then(new SizeElement(f2, f3, f2, f3, false, L0.b() ? new e(f2, f3) : L0.a(), null));
    }

    public static final androidx.compose.ui.e o(androidx.compose.ui.e eVar, float f2, float f3, float f4, float f5) {
        return eVar.then(new SizeElement(f2, f3, f4, f5, false, L0.b() ? new f(f2, f3, f4, f5) : L0.a(), null));
    }

    public static /* synthetic */ androidx.compose.ui.e p(androidx.compose.ui.e eVar, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = n1.h.b.c();
        }
        if ((i2 & 2) != 0) {
            f3 = n1.h.b.c();
        }
        if ((i2 & 4) != 0) {
            f4 = n1.h.b.c();
        }
        if ((i2 & 8) != 0) {
            f5 = n1.h.b.c();
        }
        return o(eVar, f2, f3, f4, f5);
    }

    public static final androidx.compose.ui.e q(androidx.compose.ui.e eVar, float f2) {
        return eVar.then(new SizeElement(f2, 0.0f, f2, 0.0f, false, L0.b() ? new g(f2) : L0.a(), 10, null));
    }

    public static final androidx.compose.ui.e r(androidx.compose.ui.e eVar, float f2) {
        return eVar.then(new SizeElement(f2, f2, f2, f2, true, L0.b() ? new h(f2) : L0.a(), null));
    }

    public static final androidx.compose.ui.e s(androidx.compose.ui.e eVar, float f2, float f3) {
        return eVar.then(new SizeElement(f2, f3, f2, f3, true, L0.b() ? new i(f2, f3) : L0.a(), null));
    }

    public static final androidx.compose.ui.e t(androidx.compose.ui.e eVar, float f2, float f3, float f4, float f5) {
        return eVar.then(new SizeElement(f2, f3, f4, f5, true, L0.b() ? new j(f2, f3, f4, f5) : L0.a(), null));
    }

    public static /* synthetic */ androidx.compose.ui.e u(androidx.compose.ui.e eVar, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = n1.h.b.c();
        }
        if ((i2 & 2) != 0) {
            f3 = n1.h.b.c();
        }
        if ((i2 & 4) != 0) {
            f4 = n1.h.b.c();
        }
        if ((i2 & 8) != 0) {
            f5 = n1.h.b.c();
        }
        return t(eVar, f2, f3, f4, f5);
    }

    public static final androidx.compose.ui.e v(androidx.compose.ui.e eVar, float f2) {
        return eVar.then(new SizeElement(f2, 0.0f, f2, 0.0f, true, L0.b() ? new k(f2) : L0.a(), 10, null));
    }

    public static final androidx.compose.ui.e w(androidx.compose.ui.e eVar, float f2, float f3) {
        return eVar.then(new SizeElement(f2, 0.0f, f3, 0.0f, true, L0.b() ? new l(f2, f3) : L0.a(), 10, null));
    }

    public static /* synthetic */ androidx.compose.ui.e x(androidx.compose.ui.e eVar, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = n1.h.b.c();
        }
        if ((i2 & 2) != 0) {
            f3 = n1.h.b.c();
        }
        return w(eVar, f2, f3);
    }

    public static final androidx.compose.ui.e y(androidx.compose.ui.e eVar, e.c cVar, boolean z) {
        e.a aVar = o0.e.a;
        return eVar.then((!t.c(cVar, aVar.i()) || z) ? (!t.c(cVar, aVar.l()) || z) ? WrapContentElement.g.a(cVar, z) : g : f);
    }

    public static /* synthetic */ androidx.compose.ui.e z(androidx.compose.ui.e eVar, e.c cVar, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cVar = o0.e.a.i();
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return y(eVar, cVar, z);
    }
}
