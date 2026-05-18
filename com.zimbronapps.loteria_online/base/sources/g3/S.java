package g3;

import T2.a1;
import T2.x0;
import g3.v;
import g3.w;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class s implements v, v.a {
    public final w.b a;
    public final long b;
    public final k3.b c;
    public w d;
    public v e;
    public v.a f;
    public long g = -9223372036854775807L;

    public s(w.b bVar, k3.b bVar2, long j) {
        this.a = bVar;
        this.c = bVar2;
        this.b = j;
    }

    public void a(w.b bVar) {
        long s = s(this.b);
        v l = ((w) P2.a.e(this.d)).l(bVar, this.c, s);
        this.e = l;
        if (this.f != null) {
            l.r(this, s);
        }
    }

    public long b() {
        return ((v) P2.K.i(this.e)).b();
    }

    public boolean c() {
        v vVar = this.e;
        return vVar != null && vVar.c();
    }

    public boolean d(x0 x0Var) {
        v vVar = this.e;
        return vVar != null && vVar.d(x0Var);
    }

    public long f() {
        return ((v) P2.K.i(this.e)).f();
    }

    public long g(long j, a1 a1Var) {
        return ((v) P2.K.i(this.e)).g(j, a1Var);
    }

    public void h(long j) {
        ((v) P2.K.i(this.e)).h(j);
    }

    public long j(j3.x[] xVarArr, boolean[] zArr, P[] pArr, boolean[] zArr2, long j) {
        long j2 = this.g;
        long j3 = (j2 == -9223372036854775807L || j != this.b) ? j : j2;
        this.g = -9223372036854775807L;
        return ((v) P2.K.i(this.e)).j(xVarArr, zArr, pArr, zArr2, j3);
    }

    public long l(long j) {
        return ((v) P2.K.i(this.e)).l(j);
    }

    public long m() {
        return ((v) P2.K.i(this.e)).m();
    }

    public void n(v vVar) {
        ((v.a) P2.K.i(this.f)).n(this);
    }

    public long o() {
        return this.g;
    }

    public long p() {
        return this.b;
    }

    public void q() {
        v vVar = this.e;
        if (vVar != null) {
            vVar.q();
            return;
        }
        w wVar = this.d;
        if (wVar != null) {
            wVar.n();
        }
    }

    public void r(v.a aVar, long j) {
        this.f = aVar;
        v vVar = this.e;
        if (vVar != null) {
            vVar.r(this, s(this.b));
        }
    }

    public final long s(long j) {
        long j2 = this.g;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    public Y t() {
        return ((v) P2.K.i(this.e)).t();
    }

    public void u(long j, boolean z) {
        ((v) P2.K.i(this.e)).u(j, z);
    }

    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void i(v vVar) {
        ((v.a) P2.K.i(this.f)).i(this);
    }

    public void w(long j) {
        this.g = j;
    }

    public void x() {
        if (this.e != null) {
            ((w) P2.a.e(this.d)).c(this.e);
        }
    }

    public void y(w wVar) {
        P2.a.f(this.d == null);
        this.d = wVar;
    }
}
