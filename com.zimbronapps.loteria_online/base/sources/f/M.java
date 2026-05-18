package F;

import F.c;
import androidx.compose.ui.layout.q;
import java.util.List;
import o0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m implements M0.B, P {
    public final c.m a;
    public final e.b b;

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ androidx.compose.ui.layout.q[] a;
        public final /* synthetic */ m b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ androidx.compose.ui.layout.l e;
        public final /* synthetic */ int[] f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.layout.q[] qVarArr, m mVar, int i, int i2, androidx.compose.ui.layout.l lVar, int[] iArr) {
            super(1);
            this.a = qVarArr;
            this.b = mVar;
            this.c = i;
            this.d = i2;
            this.e = lVar;
            this.f = iArr;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return Ca.I.a;
        }

        public final void invoke(q.a aVar) {
            androidx.compose.ui.layout.q[] qVarArr = this.a;
            m mVar = this.b;
            int i = this.c;
            int i2 = this.d;
            androidx.compose.ui.layout.l lVar = this.e;
            int[] iArr = this.f;
            int length = qVarArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                androidx.compose.ui.layout.q qVar = qVarArr[i3];
                kotlin.jvm.internal.t.d(qVar);
                q.a.P(aVar, qVar, m.g(mVar, qVar, O.d(qVar), i, i2, lVar.getLayoutDirection()), iArr[i4], 0.0f, 4, null);
                i3++;
                i4++;
            }
        }
    }

    public m(c.m mVar, e.b bVar) {
        this.a = mVar;
        this.b = bVar;
    }

    public static final /* synthetic */ int g(m mVar, androidx.compose.ui.layout.q qVar, S s, int i, int i2, n1.t tVar) {
        return mVar.h(qVar, s, i, i2, tVar);
    }

    public long a(int i, int i2, int i3, int i4, boolean z) {
        return l.b(z, i, i2, i3, i4);
    }

    public void c(int i, int[] iArr, int[] iArr2, androidx.compose.ui.layout.l lVar) {
        this.a.b(lVar, i, iArr, iArr2);
    }

    public M0.C d(androidx.compose.ui.layout.q[] qVarArr, androidx.compose.ui.layout.l lVar, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return androidx.compose.ui.layout.l.O0(lVar, i3, i2, null, new a(qVarArr, this, i3, i, lVar, iArr), 4, null);
    }

    public int e(androidx.compose.ui.layout.q qVar) {
        return qVar.P0();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.t.c(this.a, mVar.a) && kotlin.jvm.internal.t.c(this.b, mVar.b);
    }

    public int f(androidx.compose.ui.layout.q qVar) {
        return qVar.W0();
    }

    public final int h(androidx.compose.ui.layout.q qVar, S s, int i, int i2, n1.t tVar) {
        q a2 = s != null ? s.a() : null;
        return a2 != null ? a2.a(i - qVar.W0(), tVar, qVar, i2) : this.b.a(0, i - qVar.W0(), tVar);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public int maxIntrinsicHeight(M0.m mVar, List list, int i) {
        return D.a.e(list, i, mVar.s0(this.a.a()));
    }

    public int maxIntrinsicWidth(M0.m mVar, List list, int i) {
        return D.a.f(list, i, mVar.s0(this.a.a()));
    }

    public M0.C measure-3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j) {
        return Q.b(this, n1.b.m(j), n1.b.n(j), n1.b.k(j), n1.b.l(j), lVar.s0(this.a.a()), lVar, list, new androidx.compose.ui.layout.q[list.size()], 0, list.size(), null, 0, 3072, null);
    }

    public int minIntrinsicHeight(M0.m mVar, List list, int i) {
        return D.a.g(list, i, mVar.s0(this.a.a()));
    }

    public int minIntrinsicWidth(M0.m mVar, List list, int i) {
        return D.a.h(list, i, mVar.s0(this.a.a()));
    }

    public String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ')';
    }
}
