package F;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class u extends e.c implements O0.E {
    public s a;
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

    public u(s sVar, float f) {
        this.a = sVar;
        this.b = f;
    }

    public final void E1(s sVar) {
        this.a = sVar;
    }

    public final void F1(float f) {
        this.b = f;
    }

    public M0.C measure-3p2s80s(androidx.compose.ui.layout.l lVar, M0.A a2, long j) {
        int n;
        int l;
        int k;
        int i;
        if (!n1.b.h(j) || this.a == s.Vertical) {
            n = n1.b.n(j);
            l = n1.b.l(j);
        } else {
            n = Wa.n.m(Math.round(n1.b.l(j) * this.b), n1.b.n(j), n1.b.l(j));
            l = n;
        }
        if (!n1.b.g(j) || this.a == s.Horizontal) {
            int m = n1.b.m(j);
            k = n1.b.k(j);
            i = m;
        } else {
            i = Wa.n.m(Math.round(n1.b.k(j) * this.b), n1.b.m(j), n1.b.k(j));
            k = i;
        }
        androidx.compose.ui.layout.q C0 = a2.C0(n1.c.a(n, l, i, k));
        return androidx.compose.ui.layout.l.O0(lVar, C0.W0(), C0.P0(), null, new a(C0), 4, null);
    }
}
