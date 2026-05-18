package F;

import androidx.compose.ui.layout.q;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g implements M0.B {
    public final o0.e a;
    public final boolean b;

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return Ca.I.a;
        }

        public final void invoke(q.a aVar) {
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ androidx.compose.ui.layout.q a;
        public final /* synthetic */ M0.A b;
        public final /* synthetic */ androidx.compose.ui.layout.l c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ g f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.ui.layout.q qVar, M0.A a, androidx.compose.ui.layout.l lVar, int i, int i2, g gVar) {
            super(1);
            this.a = qVar;
            this.b = a;
            this.c = lVar;
            this.d = i;
            this.e = i2;
            this.f = gVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return Ca.I.a;
        }

        public final void invoke(q.a aVar) {
            f.c(aVar, this.a, this.b, this.c.getLayoutDirection(), this.d, this.e, g.a(this.f));
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ androidx.compose.ui.layout.q[] a;
        public final /* synthetic */ List b;
        public final /* synthetic */ androidx.compose.ui.layout.l c;
        public final /* synthetic */ kotlin.jvm.internal.M d;
        public final /* synthetic */ kotlin.jvm.internal.M e;
        public final /* synthetic */ g f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.compose.ui.layout.q[] qVarArr, List list, androidx.compose.ui.layout.l lVar, kotlin.jvm.internal.M m, kotlin.jvm.internal.M m2, g gVar) {
            super(1);
            this.a = qVarArr;
            this.b = list;
            this.c = lVar;
            this.d = m;
            this.e = m2;
            this.f = gVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return Ca.I.a;
        }

        public final void invoke(q.a aVar) {
            androidx.compose.ui.layout.q[] qVarArr = this.a;
            List list = this.b;
            androidx.compose.ui.layout.l lVar = this.c;
            kotlin.jvm.internal.M m = this.d;
            kotlin.jvm.internal.M m2 = this.e;
            g gVar = this.f;
            int length = qVarArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                androidx.compose.ui.layout.q qVar = qVarArr[i];
                kotlin.jvm.internal.t.e(qVar, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                f.c(aVar, qVar, (M0.A) list.get(i2), lVar.getLayoutDirection(), m.a, m2.a, g.a(gVar));
                i++;
                i2++;
            }
        }
    }

    public g(o0.e eVar, boolean z) {
        this.a = eVar;
        this.b = z;
    }

    public static final /* synthetic */ o0.e a(g gVar) {
        return gVar.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.t.c(this.a, gVar.a) && this.b == gVar.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Boolean.hashCode(this.b);
    }

    public M0.C measure-3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j) {
        int n;
        int m;
        androidx.compose.ui.layout.q C0;
        if (list.isEmpty()) {
            return androidx.compose.ui.layout.l.O0(lVar, n1.b.n(j), n1.b.m(j), null, a.a, 4, null);
        }
        long d = this.b ? j : n1.b.d(j, 0, 0, 0, 0, 10, null);
        if (list.size() == 1) {
            M0.A a2 = (M0.A) list.get(0);
            if (f.b(a2)) {
                n = n1.b.n(j);
                m = n1.b.m(j);
                C0 = a2.C0(n1.b.b.c(n1.b.n(j), n1.b.m(j)));
            } else {
                C0 = a2.C0(d);
                n = Math.max(n1.b.n(j), C0.W0());
                m = Math.max(n1.b.m(j), C0.P0());
            }
            int i = n;
            int i2 = m;
            return androidx.compose.ui.layout.l.O0(lVar, i, i2, null, new b(C0, a2, lVar, i, i2, this), 4, null);
        }
        androidx.compose.ui.layout.q[] qVarArr = new androidx.compose.ui.layout.q[list.size()];
        kotlin.jvm.internal.M m2 = new kotlin.jvm.internal.M();
        m2.a = n1.b.n(j);
        kotlin.jvm.internal.M m3 = new kotlin.jvm.internal.M();
        m3.a = n1.b.m(j);
        int size = list.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            M0.A a3 = (M0.A) list.get(i3);
            if (f.b(a3)) {
                z = true;
            } else {
                androidx.compose.ui.layout.q C02 = a3.C0(d);
                qVarArr[i3] = C02;
                m2.a = Math.max(m2.a, C02.W0());
                m3.a = Math.max(m3.a, C02.P0());
            }
        }
        if (z) {
            int i4 = m2.a;
            int i5 = i4 != Integer.MAX_VALUE ? i4 : 0;
            int i6 = m3.a;
            long a4 = n1.c.a(i5, i4, i6 != Integer.MAX_VALUE ? i6 : 0, i6);
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                M0.A a5 = (M0.A) list.get(i7);
                if (f.b(a5)) {
                    qVarArr[i7] = a5.C0(a4);
                }
            }
        }
        return androidx.compose.ui.layout.l.O0(lVar, m2.a, m3.a, null, new c(qVarArr, list, lVar, m2, m3, this), 4, null);
    }

    public String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ')';
    }
}
