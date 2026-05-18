package F;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b0 extends e.c implements O0.E {
    public float a;
    public float b;

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

    public /* synthetic */ b0(float f, float f2, kotlin.jvm.internal.k kVar) {
        this(f, f2);
    }

    public final void E1(float f) {
        this.b = f;
    }

    public final void F1(float f) {
        this.a = f;
    }

    public int maxIntrinsicHeight(M0.m mVar, M0.l lVar, int i) {
        return Wa.n.e(lVar.J(i), !n1.h.i(this.b, n1.h.b.c()) ? mVar.s0(this.b) : 0);
    }

    public int maxIntrinsicWidth(M0.m mVar, M0.l lVar, int i) {
        return Wa.n.e(lVar.B0(i), !n1.h.i(this.a, n1.h.b.c()) ? mVar.s0(this.a) : 0);
    }

    public M0.C measure-3p2s80s(androidx.compose.ui.layout.l lVar, M0.A a2, long j) {
        float f = this.a;
        h.a aVar = n1.h.b;
        androidx.compose.ui.layout.q C0 = a2.C0(n1.c.a((n1.h.i(f, aVar.c()) || n1.b.n(j) != 0) ? n1.b.n(j) : Wa.n.e(Wa.n.i(lVar.s0(this.a), n1.b.l(j)), 0), n1.b.l(j), (n1.h.i(this.b, aVar.c()) || n1.b.m(j) != 0) ? n1.b.m(j) : Wa.n.e(Wa.n.i(lVar.s0(this.b), n1.b.k(j)), 0), n1.b.k(j)));
        return androidx.compose.ui.layout.l.O0(lVar, C0.W0(), C0.P0(), null, new a(C0), 4, null);
    }

    public int minIntrinsicHeight(M0.m mVar, M0.l lVar, int i) {
        return Wa.n.e(lVar.q0(i), !n1.h.i(this.b, n1.h.b.c()) ? mVar.s0(this.b) : 0);
    }

    public int minIntrinsicWidth(M0.m mVar, M0.l lVar, int i) {
        return Wa.n.e(lVar.A0(i), !n1.h.i(this.a, n1.h.b.c()) ? mVar.s0(this.a) : 0);
    }

    public b0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }
}
