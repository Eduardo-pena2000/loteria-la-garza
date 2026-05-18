package A;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k0 extends e.c implements O0.E {
    public androidx.compose.foundation.f a;
    public boolean b;
    public boolean c;

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ int b;
        public final /* synthetic */ androidx.compose.ui.layout.q c;

        public static final class a extends kotlin.jvm.internal.u implements Qa.l {
            public final /* synthetic */ androidx.compose.ui.layout.q a;
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(androidx.compose.ui.layout.q qVar, int i, int i2) {
                super(1);
                this.a = qVar;
                this.b = i;
                this.c = i2;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((q.a) obj);
                return Ca.I.a;
            }

            public final void invoke(q.a aVar) {
                q.a.l0(aVar, this.a, this.b, this.c, 0.0f, null, 12, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, androidx.compose.ui.layout.q qVar) {
            super(1);
            this.b = i;
            this.c = qVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return Ca.I.a;
        }

        public final void invoke(q.a aVar) {
            int m = Wa.n.m(k0.this.E1().m(), 0, this.b);
            int i = k0.this.F1() ? m - this.b : -m;
            aVar.F0(new a(this.c, k0.this.G1() ? 0 : i, k0.this.G1() ? i : 0));
        }
    }

    public k0(androidx.compose.foundation.f fVar, boolean z, boolean z2) {
        this.a = fVar;
        this.b = z;
        this.c = z2;
    }

    public final androidx.compose.foundation.f E1() {
        return this.a;
    }

    public final boolean F1() {
        return this.b;
    }

    public final boolean G1() {
        return this.c;
    }

    public final void H1(boolean z) {
        this.b = z;
    }

    public final void I1(androidx.compose.foundation.f fVar) {
        this.a = fVar;
    }

    public final void J1(boolean z) {
        this.c = z;
    }

    public int maxIntrinsicHeight(M0.m mVar, M0.l lVar, int i) {
        return this.c ? lVar.J(i) : lVar.J(Integer.MAX_VALUE);
    }

    public int maxIntrinsicWidth(M0.m mVar, M0.l lVar, int i) {
        return this.c ? lVar.B0(Integer.MAX_VALUE) : lVar.B0(i);
    }

    public M0.C measure-3p2s80s(androidx.compose.ui.layout.l lVar, M0.A a2, long j) {
        l.a(j, this.c ? C.q.a : C.q.b);
        androidx.compose.ui.layout.q C0 = a2.C0(n1.b.d(j, 0, this.c ? n1.b.l(j) : Integer.MAX_VALUE, 0, this.c ? Integer.MAX_VALUE : n1.b.k(j), 5, null));
        int i = Wa.n.i(C0.W0(), n1.b.l(j));
        int i2 = Wa.n.i(C0.P0(), n1.b.k(j));
        int P0 = C0.P0() - i2;
        int W0 = C0.W0() - i;
        if (!this.c) {
            P0 = W0;
        }
        this.a.n(P0);
        this.a.p(this.c ? i2 : i);
        return androidx.compose.ui.layout.l.O0(lVar, i, i2, null, new a(P0, C0), 4, null);
    }

    public int minIntrinsicHeight(M0.m mVar, M0.l lVar, int i) {
        return this.c ? lVar.q0(i) : lVar.q0(Integer.MAX_VALUE);
    }

    public int minIntrinsicWidth(M0.m mVar, M0.l lVar, int i) {
        return this.c ? lVar.A0(Integer.MAX_VALUE) : lVar.A0(i);
    }
}
