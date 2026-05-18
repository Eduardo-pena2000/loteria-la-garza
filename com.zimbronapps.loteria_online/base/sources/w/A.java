package W;

import Ca.I;
import E.o;
import android.view.ViewGroup;
import b0.C0;
import b0.U1;
import b0.h2;
import b0.v1;
import cb.O;
import v0.E;
import v0.j0;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a extends o implements v1, k {
    public final boolean c;
    public final float d;
    public final h2 e;
    public final h2 f;
    public final ViewGroup g;
    public j h;
    public final C0 i;
    public final C0 j;
    public long k;
    public int l;
    public final Qa.a m;

    public static final class a extends kotlin.jvm.internal.u implements Qa.a {
        public a() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            a.j(a.this, !a.i(r0));
        }
    }

    public /* synthetic */ a(boolean z, float f, h2 h2Var, h2 h2Var2, ViewGroup viewGroup, kotlin.jvm.internal.k kVar) {
        this(z, f, h2Var, h2Var2, viewGroup);
    }

    public static final /* synthetic */ boolean i(a aVar) {
        return aVar.l();
    }

    public static final /* synthetic */ void j(a aVar, boolean z) {
        aVar.o(z);
    }

    private final void k() {
        j jVar = this.h;
        if (jVar != null) {
            jVar.a(this);
        }
    }

    public void W0() {
        p(null);
    }

    public void a(x0.c cVar) {
        this.k = cVar.e();
        this.l = Float.isNaN(this.d) ? Sa.c.d(i.a(cVar, this.c, cVar.e())) : cVar.s0(this.d);
        long A = ((r0) this.e.getValue()).A();
        float d = ((g) this.f.getValue()).d();
        cVar.B1();
        d(cVar, this.d, A);
        j0 f = cVar.m1().f();
        l();
        n n = n();
        if (n != null) {
            n.f(cVar.e(), A, d);
            n.draw(E.d(f));
        }
    }

    public void b(o.b bVar, O o) {
        n b = m().b(this);
        b.b(bVar, this.c, this.k, this.l, ((r0) this.e.getValue()).A(), ((g) this.f.getValue()).d(), this.m);
        p(b);
    }

    public void e() {
        k();
    }

    public void f(o.b bVar) {
        n n = n();
        if (n != null) {
            n.e();
        }
    }

    public void g() {
        k();
    }

    public final boolean l() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    public final j m() {
        j jVar = this.h;
        if (jVar != null) {
            kotlin.jvm.internal.t.d(jVar);
            return jVar;
        }
        j a2 = t.a(this.g);
        this.h = a2;
        kotlin.jvm.internal.t.d(a2);
        return a2;
    }

    public final n n() {
        return (n) this.i.getValue();
    }

    public final void o(boolean z) {
        this.j.setValue(Boolean.valueOf(z));
    }

    public final void p(n nVar) {
        this.i.setValue(nVar);
    }

    public a(boolean z, float f, h2 h2Var, h2 h2Var2, ViewGroup viewGroup) {
        super(z, h2Var2);
        this.c = z;
        this.d = f;
        this.e = h2Var;
        this.f = h2Var2;
        this.g = viewGroup;
        this.i = U1.i(null, null, 2, null);
        this.j = U1.i(Boolean.TRUE, null, 2, null);
        this.k = u0.l.b.b();
        this.l = -1;
        this.m = new a();
    }

    public void c() {
    }
}
