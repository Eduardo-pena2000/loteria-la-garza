package T2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class s implements y0 {
    public final b1 a;
    public final a b;
    public W0 c;
    public y0 d;
    public boolean e = true;
    public boolean f;

    public interface a {
        void m(M2.B b);
    }

    public s(a aVar, P2.c cVar) {
        this.b = aVar;
        this.a = new b1(cVar);
    }

    public long H() {
        return this.e ? this.a.H() : ((y0) P2.a.e(this.d)).H();
    }

    public void a(W0 w0) {
        if (w0 == this.c) {
            this.d = null;
            this.c = null;
            this.e = true;
        }
    }

    public void b(W0 w0) {
        y0 y0Var;
        y0 P = w0.P();
        if (P == null || P == (y0Var = this.d)) {
            return;
        }
        if (y0Var != null) {
            throw u.d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.d = P;
        this.c = w0;
        P.d(this.a.c());
    }

    public M2.B c() {
        y0 y0Var = this.d;
        return y0Var != null ? y0Var.c() : this.a.c();
    }

    public void d(M2.B b) {
        y0 y0Var = this.d;
        if (y0Var != null) {
            y0Var.d(b);
            b = this.d.c();
        }
        this.a.d(b);
    }

    public void e(long j) {
        this.a.a(j);
    }

    public final boolean f(boolean z) {
        W0 w0 = this.c;
        return w0 == null || w0.b() || (z && this.c.getState() != 2) || (!this.c.isReady() && (z || this.c.k()));
    }

    public void g() {
        this.f = true;
        this.a.b();
    }

    public void h() {
        this.f = false;
        this.a.e();
    }

    public long i(boolean z) {
        j(z);
        return H();
    }

    public final void j(boolean z) {
        if (f(z)) {
            this.e = true;
            if (this.f) {
                this.a.b();
                return;
            }
            return;
        }
        y0 y0Var = (y0) P2.a.e(this.d);
        long H = y0Var.H();
        if (this.e) {
            if (H < this.a.H()) {
                this.a.e();
                return;
            } else {
                this.e = false;
                if (this.f) {
                    this.a.b();
                }
            }
        }
        this.a.a(H);
        M2.B c = y0Var.c();
        if (c.equals(this.a.c())) {
            return;
        }
        this.a.d(c);
        this.b.m(c);
    }

    public boolean u() {
        return this.e ? this.a.u() : ((y0) P2.a.e(this.d)).u();
    }
}
