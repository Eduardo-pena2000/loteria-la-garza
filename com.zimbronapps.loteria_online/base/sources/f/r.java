package F;

import P0.O0;
import androidx.compose.ui.layout.q;
import b0.C0;
import b0.U1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class r extends O0 implements M0.v, N0.d {
    public final e0 c;
    public final Qa.p d;
    public final C0 e;

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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.ui.layout.q qVar) {
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

    public r(e0 e0Var, Qa.l lVar, Qa.p pVar) {
        super(lVar);
        this.c = e0Var;
        this.d = pVar;
        this.e = U1.i(e0Var, null, 2, null);
    }

    public void a(N0.k kVar) {
        f(g0.d(this.c, (e0) kVar.j(h0.a())));
    }

    public final e0 b() {
        return (e0) this.e.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.t.c(this.c, rVar.c) && this.d == rVar.d;
    }

    public final void f(e0 e0Var) {
        this.e.setValue(e0Var);
    }

    public int hashCode() {
        return (this.c.hashCode() * 31) + this.d.hashCode();
    }

    public M0.C measure-3p2s80s(androidx.compose.ui.layout.l lVar, M0.A a2, long j) {
        int intValue = ((Number) this.d.invoke(b(), lVar)).intValue();
        if (intValue == 0) {
            return androidx.compose.ui.layout.l.O0(lVar, 0, 0, null, a.a, 4, null);
        }
        androidx.compose.ui.layout.q C0 = a2.C0(n1.b.d(j, 0, 0, intValue, intValue, 3, null));
        return androidx.compose.ui.layout.l.O0(lVar, C0.W0(), intValue, null, new b(C0), 4, null);
    }
}
