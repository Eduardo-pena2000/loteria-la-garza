package M0;

import O0.e0;
import u0.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class y implements p {
    public final O0.U a;

    public y(O0.U u) {
        this.a = u;
    }

    public long B(long j) {
        return b().B(u0.f.q(j, c()));
    }

    public p D0() {
        O0.U I2;
        if (!g()) {
            L0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        e0 P2 = b().L1().v0().P2();
        if (P2 == null || (I2 = P2.I2()) == null) {
            return null;
        }
        return I2.x();
    }

    public long E0(long j) {
        return b().E0(u0.f.q(j, c()));
    }

    public long F0(p pVar, long j, boolean z) {
        if (!(pVar instanceof y)) {
            O0.U a = z.a(this.a);
            long F0 = F0(a.j2(), j, z);
            long P1 = a.P1();
            float k = n1.n.k(P1);
            float l = n1.n.l(P1);
            long p = u0.f.p(F0, u0.f.e((4294967295L & Float.floatToRawIntBits(l)) | (Float.floatToRawIntBits(k) << 32)));
            p K2 = a.i2().K2();
            if (K2 == null) {
                K2 = a.i2().x();
            }
            return u0.f.q(p, K2.F0(pVar, u0.f.b.c(), z));
        }
        O0.U u = ((y) pVar).a;
        u.i2().d3();
        O0.U I2 = b().y2(u.i2()).I2();
        if (I2 != null) {
            long n = n1.n.n(n1.n.o(u.n2(I2, !z), n1.o.d(j)), this.a.n2(I2, !z));
            float k2 = n1.n.k(n);
            float l2 = n1.n.l(n);
            return u0.f.e((Float.floatToRawIntBits(k2) << 32) | (Float.floatToRawIntBits(l2) & 4294967295L));
        }
        O0.U a2 = z.a(u);
        long o = n1.n.o(n1.n.o(u.n2(a2, !z), a2.P1()), n1.o.d(j));
        O0.U a3 = z.a(this.a);
        long n2 = n1.n.n(o, n1.n.o(this.a.n2(a3, !z), a3.P1()));
        float k3 = n1.n.k(n2);
        float l3 = n1.n.l(n2);
        long e = u0.f.e((Float.floatToRawIntBits(l3) & 4294967295L) | (Float.floatToRawIntBits(k3) << 32));
        e0 P2 = a3.i2().P2();
        kotlin.jvm.internal.t.d(P2);
        e0 P22 = a2.i2().P2();
        kotlin.jvm.internal.t.d(P22);
        return P2.F0(P22, e, z);
    }

    public long P(p pVar, long j) {
        return F0(pVar, j, true);
    }

    public long Z(long j) {
        return u0.f.q(b().Z(j), c());
    }

    public long a() {
        O0.U u = this.a;
        return n1.r.c((u.W0() << 32) | (u.P0() & 4294967295L));
    }

    public final e0 b() {
        return this.a.i2();
    }

    public u0.h b0(p pVar, boolean z) {
        return b().b0(pVar, z);
    }

    public final long c() {
        O0.U a = z.a(this.a);
        p x = a.x();
        f.a aVar = u0.f.b;
        return u0.f.p(P(x, aVar.c()), b().P(a.i2(), aVar.c()));
    }

    public boolean g() {
        return b().g();
    }

    public void l0(p pVar, float[] fArr) {
        b().l0(pVar, fArr);
    }

    public long q(long j) {
        return u0.f.q(b().q(j), c());
    }

    public long v0(long j) {
        return b().v0(u0.f.q(j, c()));
    }

    public void x0(float[] fArr) {
        b().x0(fArr);
    }
}
