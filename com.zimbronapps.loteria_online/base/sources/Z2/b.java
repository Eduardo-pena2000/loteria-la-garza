package Z2;

import L3.s;
import P2.E;
import U3.J;
import o3.I;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b implements k {
    public static final I f = new I();
    public final o3.p a;
    public final M2.q b;
    public final E c;
    public final s.a d;
    public final boolean e;

    public b(o3.p pVar, M2.q qVar, E e, s.a aVar, boolean z) {
        this.a = pVar;
        this.b = qVar;
        this.c = e;
        this.d = aVar;
        this.e = z;
    }

    public boolean a(o3.q qVar) {
        return this.a.e(qVar, f) == 0;
    }

    public void b(o3.r rVar) {
        this.a.b(rVar);
    }

    public void c() {
        this.a.a(0L, 0L);
    }

    public boolean d() {
        o3.p g = this.a.g();
        return (g instanceof J) || (g instanceof I3.h);
    }

    public boolean e() {
        o3.p g = this.a.g();
        return (g instanceof U3.h) || (g instanceof U3.b) || (g instanceof U3.e) || (g instanceof H3.f);
    }

    public k f() {
        o3.p fVar;
        P2.a.f(!d());
        P2.a.g(this.a.g() == this.a, "Can't recreate wrapped extractors. Outer type: " + this.a.getClass());
        o3.p pVar = this.a;
        if (pVar instanceof w) {
            fVar = new w(this.b.d, this.c, this.d, this.e);
        } else if (pVar instanceof U3.h) {
            fVar = new U3.h();
        } else if (pVar instanceof U3.b) {
            fVar = new U3.b();
        } else if (pVar instanceof U3.e) {
            fVar = new U3.e();
        } else {
            if (!(pVar instanceof H3.f)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: " + this.a.getClass().getSimpleName());
            }
            fVar = new H3.f();
        }
        return new b(fVar, this.b, this.c, this.d, this.e);
    }
}
