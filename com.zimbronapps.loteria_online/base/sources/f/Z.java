package F;

import androidx.compose.ui.layout.q;
import b0.C0;
import b0.U1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class z implements M0.v, N0.d, N0.j {
    public final e0 b;
    public final C0 c;
    public final C0 d;

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
            q.a.P(aVar, this.a, this.b, this.c, 0.0f, 4, null);
        }
    }

    public z(e0 e0Var) {
        this.b = e0Var;
        this.c = U1.i(e0Var, null, 2, null);
        this.d = U1.i(e0Var, null, 2, null);
    }

    private final e0 f() {
        return (e0) this.c.getValue();
    }

    private final void j(e0 e0Var) {
        this.c.setValue(e0Var);
    }

    public void a(N0.k kVar) {
        e0 e0Var = (e0) kVar.j(h0.a());
        j(g0.d(this.b, e0Var));
        i(g0.f(e0Var, this.b));
    }

    public final e0 b() {
        return (e0) this.d.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return kotlin.jvm.internal.t.c(((z) obj).b, this.b);
        }
        return false;
    }

    public N0.l getKey() {
        return h0.a();
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public e0 getValue() {
        return b();
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public final void i(e0 e0Var) {
        this.d.setValue(e0Var);
    }

    public M0.C measure-3p2s80s(androidx.compose.ui.layout.l lVar, M0.A a2, long j) {
        int b = f().b(lVar, lVar.getLayoutDirection());
        int d = f().d(lVar);
        int a3 = f().a(lVar, lVar.getLayoutDirection()) + b;
        int c = f().c(lVar) + d;
        androidx.compose.ui.layout.q C0 = a2.C0(n1.c.j(j, -a3, -c));
        return androidx.compose.ui.layout.l.O0(lVar, n1.c.g(j, C0.W0() + a3), n1.c.f(j, C0.P0() + c), null, new a(C0, b, d), 4, null);
    }
}
