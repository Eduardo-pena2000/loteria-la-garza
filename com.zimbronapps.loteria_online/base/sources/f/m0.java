package F;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m0 extends e.c implements O0.E {
    public s a;
    public boolean b;
    public Qa.p c;

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ int b;
        public final /* synthetic */ androidx.compose.ui.layout.q c;
        public final /* synthetic */ int d;
        public final /* synthetic */ androidx.compose.ui.layout.l e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, androidx.compose.ui.layout.q qVar, int i2, androidx.compose.ui.layout.l lVar) {
            super(1);
            this.b = i;
            this.c = qVar;
            this.d = i2;
            this.e = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return Ca.I.a;
        }

        public final void invoke(q.a aVar) {
            q.a.U(aVar, this.c, ((n1.n) m0.this.E1().invoke(n1.r.b(n1.s.a(this.b - this.c.W0(), this.d - this.c.P0())), this.e.getLayoutDirection())).q(), 0.0f, 2, null);
        }
    }

    public m0(s sVar, boolean z, Qa.p pVar) {
        this.a = sVar;
        this.b = z;
        this.c = pVar;
    }

    public final Qa.p E1() {
        return this.c;
    }

    public final void F1(Qa.p pVar) {
        this.c = pVar;
    }

    public final void G1(s sVar) {
        this.a = sVar;
    }

    public final void H1(boolean z) {
        this.b = z;
    }

    public M0.C measure-3p2s80s(androidx.compose.ui.layout.l lVar, M0.A a2, long j) {
        s sVar = this.a;
        s sVar2 = s.a;
        int n = sVar != sVar2 ? 0 : n1.b.n(j);
        s sVar3 = this.a;
        s sVar4 = s.b;
        androidx.compose.ui.layout.q C0 = a2.C0(n1.c.a(n, (this.a == sVar2 || !this.b) ? n1.b.l(j) : Integer.MAX_VALUE, sVar3 == sVar4 ? n1.b.m(j) : 0, (this.a == sVar4 || !this.b) ? n1.b.k(j) : Integer.MAX_VALUE));
        int m = Wa.n.m(C0.W0(), n1.b.n(j), n1.b.l(j));
        int m2 = Wa.n.m(C0.P0(), n1.b.m(j), n1.b.k(j));
        return androidx.compose.ui.layout.l.O0(lVar, m, m2, null, new a(m, C0, m2, lVar), 4, null);
    }
}
