package androidx.compose.foundation;

import A.j0;
import C.n;
import Ca.I;
import P0.L0;
import P0.N0;
import Qa.l;
import Qa.q;
import b0.m;
import b0.w;
import k0.v;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class e {

    public static final class a extends u implements Qa.a {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.a = i;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f invoke() {
            return new f(this.a);
        }
    }

    public static final class b extends u implements l {
        public final /* synthetic */ f a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ n c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar, boolean z, n nVar, boolean z2, boolean z3) {
            super(1);
            this.a = fVar;
            this.b = z;
            this.c = nVar;
            this.d = z2;
            this.e = z3;
        }

        public final void a(N0 n0) {
            n0.d("scroll");
            n0.b().c("state", this.a);
            n0.b().c("reverseScrolling", Boolean.valueOf(this.b));
            n0.b().c("flingBehavior", this.c);
            n0.b().c("isScrollable", Boolean.valueOf(this.d));
            n0.b().c("isVertical", Boolean.valueOf(this.e));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public static final class c extends u implements q {
        public final /* synthetic */ f a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ n c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f fVar, boolean z, n nVar, boolean z2, boolean z3) {
            super(3);
            this.a = fVar;
            this.b = z;
            this.c = nVar;
            this.d = z2;
            this.e = z3;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, m mVar, int i) {
            mVar.V(1478351300);
            if (w.L()) {
                w.U(1478351300, i, -1, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:276)");
            }
            androidx.compose.ui.e then = androidx.compose.ui.e.a.then(new ScrollSemanticsElement(this.a, this.b, this.c, this.d, this.e));
            f fVar = this.a;
            androidx.compose.ui.e then2 = j0.a(then, fVar, this.e ? C.q.Vertical : C.q.Horizontal, this.d, this.b, this.c, fVar.k(), null, mVar, 0, 64).then(new ScrollingLayoutElement(this.a, this.b, this.e));
            if (w.L()) {
                w.T();
            }
            mVar.P();
            return then2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, f fVar, boolean z, n nVar, boolean z2) {
        return d(eVar, fVar, z2, nVar, z, false);
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, f fVar, boolean z, n nVar, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            nVar = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return a(eVar, fVar, z, nVar, z2);
    }

    public static final f c(int i, m mVar, int i2, int i3) {
        boolean z = true;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if (w.L()) {
            w.U(-1464256199, i2, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:69)");
        }
        Object[] objArr = new Object[0];
        v a2 = f.i.a();
        if ((((i2 & 14) ^ 6) <= 4 || !mVar.d(i)) && (i2 & 6) != 4) {
            z = false;
        }
        Object C = mVar.C();
        if (z || C == m.a.a()) {
            C = new a(i);
            mVar.t(C);
        }
        f fVar = (f) k0.d.f(objArr, a2, null, (Qa.a) C, mVar, 0, 4);
        if (w.L()) {
            w.T();
        }
        return fVar;
    }

    public static final androidx.compose.ui.e d(androidx.compose.ui.e eVar, f fVar, boolean z, n nVar, boolean z2, boolean z3) {
        return androidx.compose.ui.c.b(eVar, L0.b() ? new b(fVar, z, nVar, z2, z3) : L0.a(), new c(fVar, z, nVar, z2, z3));
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, f fVar, boolean z, n nVar, boolean z2) {
        return d(eVar, fVar, z2, nVar, z, true);
    }

    public static /* synthetic */ androidx.compose.ui.e f(androidx.compose.ui.e eVar, f fVar, boolean z, n nVar, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            nVar = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return e(eVar, fVar, z, nVar, z2);
    }
}
