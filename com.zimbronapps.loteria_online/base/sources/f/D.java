package F;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import n1.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d extends e.c implements O0.E {
    public float a;
    public boolean b;

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ androidx.compose.ui.layout.q a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.layout.q qVar) {
            super(1);
            this.a = qVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return Ca.I.a;
        }

        public final void invoke(q.a aVar) {
            q.a.Z(aVar, this.a, 0, 0, 0.0f, 4, null);
        }
    }

    public d(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public static /* synthetic */ long I1(d dVar, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return dVar.H1(j, z);
    }

    public static /* synthetic */ long K1(d dVar, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return dVar.J1(j, z);
    }

    public static /* synthetic */ long M1(d dVar, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return dVar.L1(j, z);
    }

    public static /* synthetic */ long O1(d dVar, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return dVar.N1(j, z);
    }

    public final long E1(long j) {
        if (this.b) {
            long I1 = I1(this, j, false, 1, null);
            r.a aVar = n1.r.b;
            if (!n1.r.e(I1, aVar.a())) {
                return I1;
            }
            long K1 = K1(this, j, false, 1, null);
            if (!n1.r.e(K1, aVar.a())) {
                return K1;
            }
            long M1 = M1(this, j, false, 1, null);
            if (!n1.r.e(M1, aVar.a())) {
                return M1;
            }
            long O1 = O1(this, j, false, 1, null);
            if (!n1.r.e(O1, aVar.a())) {
                return O1;
            }
            long H1 = H1(j, false);
            if (!n1.r.e(H1, aVar.a())) {
                return H1;
            }
            long J1 = J1(j, false);
            if (!n1.r.e(J1, aVar.a())) {
                return J1;
            }
            long L1 = L1(j, false);
            if (!n1.r.e(L1, aVar.a())) {
                return L1;
            }
            long N1 = N1(j, false);
            if (!n1.r.e(N1, aVar.a())) {
                return N1;
            }
        } else {
            long K12 = K1(this, j, false, 1, null);
            r.a aVar2 = n1.r.b;
            if (!n1.r.e(K12, aVar2.a())) {
                return K12;
            }
            long I12 = I1(this, j, false, 1, null);
            if (!n1.r.e(I12, aVar2.a())) {
                return I12;
            }
            long O12 = O1(this, j, false, 1, null);
            if (!n1.r.e(O12, aVar2.a())) {
                return O12;
            }
            long M12 = M1(this, j, false, 1, null);
            if (!n1.r.e(M12, aVar2.a())) {
                return M12;
            }
            long J12 = J1(j, false);
            if (!n1.r.e(J12, aVar2.a())) {
                return J12;
            }
            long H12 = H1(j, false);
            if (!n1.r.e(H12, aVar2.a())) {
                return H12;
            }
            long N12 = N1(j, false);
            if (!n1.r.e(N12, aVar2.a())) {
                return N12;
            }
            long L12 = L1(j, false);
            if (!n1.r.e(L12, aVar2.a())) {
                return L12;
            }
        }
        return n1.r.b.a();
    }

    public final void F1(float f) {
        this.a = f;
    }

    public final void G1(boolean z) {
        this.b = z;
    }

    public final long H1(long j, boolean z) {
        int round;
        int k = n1.b.k(j);
        if (k != Integer.MAX_VALUE && (round = Math.round(k * this.a)) > 0) {
            long a2 = n1.s.a(round, k);
            if (!z || n1.c.i(j, a2)) {
                return a2;
            }
        }
        return n1.r.b.a();
    }

    public final long J1(long j, boolean z) {
        int round;
        int l = n1.b.l(j);
        if (l != Integer.MAX_VALUE && (round = Math.round(l / this.a)) > 0) {
            long a2 = n1.s.a(l, round);
            if (!z || n1.c.i(j, a2)) {
                return a2;
            }
        }
        return n1.r.b.a();
    }

    public final long L1(long j, boolean z) {
        int m = n1.b.m(j);
        int round = Math.round(m * this.a);
        if (round > 0) {
            long a2 = n1.s.a(round, m);
            if (!z || n1.c.i(j, a2)) {
                return a2;
            }
        }
        return n1.r.b.a();
    }

    public final long N1(long j, boolean z) {
        int n = n1.b.n(j);
        int round = Math.round(n / this.a);
        if (round > 0) {
            long a2 = n1.s.a(n, round);
            if (!z || n1.c.i(j, a2)) {
                return a2;
            }
        }
        return n1.r.b.a();
    }

    public int maxIntrinsicHeight(M0.m mVar, M0.l lVar, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.a) : lVar.J(i);
    }

    public int maxIntrinsicWidth(M0.m mVar, M0.l lVar, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.a) : lVar.B0(i);
    }

    public M0.C measure-3p2s80s(androidx.compose.ui.layout.l lVar, M0.A a2, long j) {
        long E1 = E1(j);
        if (!n1.r.e(E1, n1.r.b.a())) {
            j = n1.b.b.c(n1.r.g(E1), n1.r.f(E1));
        }
        androidx.compose.ui.layout.q C0 = a2.C0(j);
        return androidx.compose.ui.layout.l.O0(lVar, C0.W0(), C0.P0(), null, new a(C0), 4, null);
    }

    public int minIntrinsicHeight(M0.m mVar, M0.l lVar, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.a) : lVar.q0(i);
    }

    public int minIntrinsicWidth(M0.m mVar, M0.l lVar, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.a) : lVar.A0(i);
    }
}
