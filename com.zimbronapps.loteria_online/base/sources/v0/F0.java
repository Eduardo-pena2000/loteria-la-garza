package v0;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f0 extends e.c implements O0.E, O0.A0 {
    public Qa.l a;
    public final boolean b;

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ androidx.compose.ui.layout.q a;
        public final /* synthetic */ f0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.layout.q qVar, f0 f0Var) {
            super(1);
            this.a = qVar;
            this.b = f0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return Ca.I.a;
        }

        public final void invoke(q.a aVar) {
            q.a.A0(aVar, this.a, 0, 0, 0.0f, this.b.E1(), 4, null);
        }
    }

    public f0(Qa.l lVar) {
        this.a = lVar;
    }

    public final Qa.l E1() {
        return this.a;
    }

    public final void F1() {
        O0.e0 O2 = O0.k.i(this, O0.g0.a(2)).O2();
        if (O2 != null) {
            O2.F3(this.a, true);
        }
    }

    public final void G1(Qa.l lVar) {
        this.a = lVar;
    }

    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public M0.C measure-3p2s80s(androidx.compose.ui.layout.l lVar, M0.A a2, long j) {
        androidx.compose.ui.layout.q C0 = a2.C0(j);
        return androidx.compose.ui.layout.l.O0(lVar, C0.W0(), C0.P0(), null, new a(C0, this), 4, null);
    }

    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.a + ')';
    }

    public boolean z() {
        return this.b;
    }

    public void g1(W0.D d) {
    }
}
