package W;

import Ca.I;
import E.o;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import v0.E;
import v0.j0;
import v0.t0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b extends q implements k {
    public j l;
    public n m;

    public static final class a extends kotlin.jvm.internal.u implements Qa.a {
        public a() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            O0.u.a(b.this);
        }
    }

    public /* synthetic */ b(E.k kVar, boolean z, float f, t0 t0Var, Qa.a aVar, kotlin.jvm.internal.k kVar2) {
        this(kVar, z, f, t0Var, aVar);
    }

    private final j S1() {
        j jVar = this.l;
        if (jVar != null) {
            kotlin.jvm.internal.t.d(jVar);
            return jVar;
        }
        j a2 = t.a(t.b((View) O0.i.a(this, AndroidCompositionLocals_androidKt.k())));
        this.l = a2;
        kotlin.jvm.internal.t.d(a2);
        return a2;
    }

    private final void T1(n nVar) {
        this.m = nVar;
        O0.u.a(this);
    }

    public void J1(o.b bVar, long j, float f) {
        n b = S1().b(this);
        b.b(bVar, L1(), j, Sa.c.d(f), N1(), ((g) M1().invoke()).d(), new a());
        T1(b);
    }

    public void K1(x0.f fVar) {
        j0 f = fVar.m1().f();
        n nVar = this.m;
        if (nVar != null) {
            nVar.f(O1(), N1(), ((g) M1().invoke()).d());
            nVar.draw(E.d(f));
        }
    }

    public void Q1(o.b bVar) {
        n nVar = this.m;
        if (nVar != null) {
            nVar.e();
        }
    }

    public void W0() {
        T1(null);
    }

    public void onDetach() {
        j jVar = this.l;
        if (jVar != null) {
            jVar.a(this);
        }
    }

    public b(E.k kVar, boolean z, float f, t0 t0Var, Qa.a aVar) {
        super(kVar, z, f, t0Var, aVar, null);
    }
}
