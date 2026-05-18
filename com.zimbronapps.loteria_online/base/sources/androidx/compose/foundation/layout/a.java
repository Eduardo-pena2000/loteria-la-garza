package androidx.compose.foundation.layout;

import Ca.I;
import M0.A;
import M0.C;
import M0.k;
import P0.L0;
import P0.N0;
import Qa.l;
import Wa.n;
import androidx.compose.ui.layout.q;
import kotlin.jvm.internal.u;
import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {

    public static final class a extends u implements l {
        public final /* synthetic */ M0.a a;
        public final /* synthetic */ float b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ q f;
        public final /* synthetic */ int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(M0.a aVar, float f, int i, int i2, int i3, q qVar, int i4) {
            super(1);
            this.a = aVar;
            this.b = f;
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = qVar;
            this.g = i4;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return I.a;
        }

        public final void invoke(q.a aVar) {
            int W0;
            if (a.b(this.a)) {
                W0 = 0;
            } else {
                W0 = !h.i(this.b, h.b.c()) ? this.c : (this.d - this.e) - this.f.W0();
            }
            q.a.Z(aVar, this.f, W0, a.b(this.a) ? !h.i(this.b, h.b.c()) ? this.c : (this.g - this.e) - this.f.P0() : 0, 0.0f, 4, null);
        }
    }

    public static final class b extends u implements l {
        public final /* synthetic */ M0.a a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(M0.a aVar, float f, float f2) {
            super(1);
            this.a = aVar;
            this.b = f;
            this.c = f2;
        }

        public final void a(N0 n0) {
            n0.d("paddingFrom");
            n0.b().c("alignmentLine", this.a);
            n0.b().c("before", h.d(this.b));
            n0.b().c("after", h.d(this.c));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public static final /* synthetic */ C a(androidx.compose.ui.layout.l lVar, M0.a aVar, float f, float f2, A a2, long j) {
        return c(lVar, aVar, f, f2, a2, j);
    }

    public static final /* synthetic */ boolean b(M0.a aVar) {
        return d(aVar);
    }

    public static final C c(androidx.compose.ui.layout.l lVar, M0.a aVar, float f, float f2, A a2, long j) {
        q C0 = a2.C0(d(aVar) ? n1.b.d(j, 0, 0, 0, 0, 11, null) : n1.b.d(j, 0, 0, 0, 0, 14, null));
        int W = C0.W(aVar);
        if (W == Integer.MIN_VALUE) {
            W = 0;
        }
        int P0 = d(aVar) ? C0.P0() : C0.W0();
        int k = d(aVar) ? n1.b.k(j) : n1.b.l(j);
        h.a aVar2 = h.b;
        int i = k - P0;
        int m = n.m((!h.i(f, aVar2.c()) ? lVar.s0(f) : 0) - W, 0, i);
        int m2 = n.m(((!h.i(f2, aVar2.c()) ? lVar.s0(f2) : 0) - P0) + W, 0, i - m);
        int W0 = d(aVar) ? C0.W0() : Math.max(C0.W0() + m + m2, n1.b.n(j));
        int max = d(aVar) ? Math.max(C0.P0() + m + m2, n1.b.m(j)) : C0.P0();
        return androidx.compose.ui.layout.l.O0(lVar, W0, max, null, new a(aVar, f, m, W0, m2, C0, max), 4, null);
    }

    public static final boolean d(M0.a aVar) {
        return aVar instanceof k;
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, M0.a aVar, float f, float f2) {
        return eVar.then(new AlignmentLineOffsetDpElement(aVar, f, f2, L0.b() ? new b(aVar, f, f2) : L0.a(), null));
    }

    public static /* synthetic */ androidx.compose.ui.e f(androidx.compose.ui.e eVar, M0.a aVar, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = h.b.c();
        }
        if ((i & 4) != 0) {
            f2 = h.b.c();
        }
        return e(eVar, aVar, f, f2);
    }

    public static final androidx.compose.ui.e g(androidx.compose.ui.e eVar, float f, float f2) {
        h.a aVar = h.b;
        return eVar.then(!h.i(f, aVar.c()) ? f(androidx.compose.ui.e.a, M0.b.a(), f, 0.0f, 4, null) : androidx.compose.ui.e.a).then(!h.i(f2, aVar.c()) ? f(androidx.compose.ui.e.a, M0.b.b(), 0.0f, f2, 2, null) : androidx.compose.ui.e.a);
    }
}
