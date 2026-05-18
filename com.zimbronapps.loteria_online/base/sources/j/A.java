package J;

import java.util.concurrent.CancellationException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a implements H0.a {
    public final C a;
    public final C.q b;

    public a(C c, C.q qVar) {
        this.a = c;
        this.b = qVar;
    }

    public Object V0(long j, long j2, Ga.e eVar) {
        return n1.y.b(a(j2, this.b));
    }

    public final long a(long j, C.q qVar) {
        return qVar == C.q.Vertical ? n1.y.e(j, 0.0f, 0.0f, 2, null) : n1.y.e(j, 0.0f, 0.0f, 1, null);
    }

    public final float b(long j) {
        return this.b == C.q.Horizontal ? u0.f.m(j) : u0.f.n(j);
    }

    public long d1(long j, int i) {
        if (!H0.e.d(i, H0.e.a.b()) || Math.abs(this.a.w()) <= 1.0E-6d) {
            return u0.f.b.c();
        }
        float w = this.a.w() * this.a.G();
        float g = ((this.a.C().g() + this.a.C().i()) * (-Math.signum(this.a.w()))) + w;
        if (this.a.w() > 0.0f) {
            g = w;
            w = g;
        }
        C.q qVar = this.b;
        C.q qVar2 = C.q.Horizontal;
        float f = -this.a.e(-Wa.n.l(qVar == qVar2 ? u0.f.m(j) : u0.f.n(j), w, g));
        float m = this.b == qVar2 ? f : u0.f.m(j);
        if (this.b != C.q.Vertical) {
            f = u0.f.n(j);
        }
        return u0.f.f(j, m, f);
    }

    public long x0(long j, long j2, int i) {
        if (!H0.e.d(i, H0.e.a.a()) || b(j2) == 0.0f) {
            return u0.f.b.c();
        }
        throw new CancellationException("Scroll cancelled");
    }
}
