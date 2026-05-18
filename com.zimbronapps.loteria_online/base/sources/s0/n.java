package s0;

import Ca.I;
import M0.A;
import M0.C;
import M0.Q;
import O0.E;
import O0.t;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import kotlin.jvm.internal.u;
import n1.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n extends e.c implements E, t {
    public A0.c a;
    public boolean b;
    public o0.e c;
    public M0.f d;
    public float e;
    public androidx.compose.ui.graphics.d f;

    public static final class a extends u implements Qa.l {
        public final /* synthetic */ q a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q qVar) {
            super(1);
            this.a = qVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return I.a;
        }

        public final void invoke(q.a aVar) {
            q.a.Z(aVar, this.a, 0, 0, 0.0f, 4, null);
        }
    }

    public n(A0.c cVar, boolean z, o0.e eVar, M0.f fVar, float f, androidx.compose.ui.graphics.d dVar) {
        this.a = cVar;
        this.b = z;
        this.c = eVar;
        this.d = fVar;
        this.e = f;
        this.f = dVar;
    }

    public final long E1(long j) {
        if (!H1()) {
            return j;
        }
        long d = u0.l.d((Float.floatToRawIntBits(!J1(this.a.k()) ? Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat((int) (this.a.k() >> 32))) << 32) | (Float.floatToRawIntBits(!I1(this.a.k()) ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (this.a.k() & 4294967295L))) & 4294967295L));
        return (Float.intBitsToFloat((int) (j >> 32)) == 0.0f || Float.intBitsToFloat((int) (j & 4294967295L)) == 0.0f) ? u0.l.b.b() : Q.a(d, this.d.a(d, j));
    }

    public final A0.c F1() {
        return this.a;
    }

    public final boolean G1() {
        return this.b;
    }

    public final boolean H1() {
        return this.b && this.a.k() != 9205357640488583168L;
    }

    public final boolean I1(long j) {
        return !u0.l.f(j, u0.l.b.a()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public final boolean J1(long j) {
        return !u0.l.f(j, u0.l.b.a()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    public final long K1(long j) {
        boolean z = false;
        boolean z2 = n1.b.h(j) && n1.b.g(j);
        if (n1.b.j(j) && n1.b.i(j)) {
            z = true;
        }
        if ((!H1() && z2) || z) {
            return n1.b.d(j, n1.b.l(j), 0, n1.b.k(j), 0, 10, null);
        }
        long k = this.a.k();
        int round = J1(k) ? Math.round(Float.intBitsToFloat((int) (k >> 32))) : n1.b.n(j);
        int round2 = I1(k) ? Math.round(Float.intBitsToFloat((int) (k & 4294967295L))) : n1.b.m(j);
        long E1 = E1(u0.l.d((Float.floatToRawIntBits(n1.c.g(j, round)) << 32) | (Float.floatToRawIntBits(n1.c.f(j, round2)) & 4294967295L)));
        return n1.b.d(j, n1.c.g(j, Math.round(Float.intBitsToFloat((int) (E1 >> 32)))), 0, n1.c.f(j, Math.round(Float.intBitsToFloat((int) (E1 & 4294967295L)))), 0, 10, null);
    }

    public final void L1(o0.e eVar) {
        this.c = eVar;
    }

    public final void M1(M0.f fVar) {
        this.d = fVar;
    }

    public final void N1(A0.c cVar) {
        this.a = cVar;
    }

    public final void O1(boolean z) {
        this.b = z;
    }

    public final void c(androidx.compose.ui.graphics.d dVar) {
        this.f = dVar;
    }

    public final void d(float f) {
        this.e = f;
    }

    public void draw(x0.c cVar) {
        long k = this.a.k();
        float intBitsToFloat = J1(k) ? Float.intBitsToFloat((int) (k >> 32)) : Float.intBitsToFloat((int) (cVar.e() >> 32));
        float intBitsToFloat2 = I1(k) ? Float.intBitsToFloat((int) (k & 4294967295L)) : Float.intBitsToFloat((int) (cVar.e() & 4294967295L));
        long d = u0.l.d((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
        long b = (Float.intBitsToFloat((int) (cVar.e() >> 32)) == 0.0f || Float.intBitsToFloat((int) (cVar.e() & 4294967295L)) == 0.0f) ? u0.l.b.b() : Q.a(d, this.d.a(d, cVar.e()));
        long a2 = this.c.a(r.c((Math.round(Float.intBitsToFloat((int) (b & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (b >> 32))) << 32)), r.c((Math.round(Float.intBitsToFloat((int) (cVar.e() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (cVar.e() & 4294967295L))) & 4294967295L)), cVar.getLayoutDirection());
        float k2 = n1.n.k(a2);
        float l = n1.n.l(a2);
        cVar.m1().d().d(k2, l);
        try {
            this.a.j(cVar, b, this.e, this.f);
            cVar.m1().d().d(-k2, -l);
            cVar.B1();
        } catch (Throwable th) {
            cVar.m1().d().d(-k2, -l);
            throw th;
        }
    }

    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public int maxIntrinsicHeight(M0.m mVar, M0.l lVar, int i) {
        if (!H1()) {
            return lVar.J(i);
        }
        long K1 = K1(n1.c.b(0, i, 0, 0, 13, null));
        return Math.max(n1.b.m(K1), lVar.J(i));
    }

    public int maxIntrinsicWidth(M0.m mVar, M0.l lVar, int i) {
        if (!H1()) {
            return lVar.B0(i);
        }
        long K1 = K1(n1.c.b(0, 0, 0, i, 7, null));
        return Math.max(n1.b.n(K1), lVar.B0(i));
    }

    public C measure-3p2s80s(androidx.compose.ui.layout.l lVar, A a2, long j) {
        q C0 = a2.C0(K1(j));
        return androidx.compose.ui.layout.l.O0(lVar, C0.W0(), C0.P0(), null, new a(C0), 4, null);
    }

    public int minIntrinsicHeight(M0.m mVar, M0.l lVar, int i) {
        if (!H1()) {
            return lVar.q0(i);
        }
        long K1 = K1(n1.c.b(0, i, 0, 0, 13, null));
        return Math.max(n1.b.m(K1), lVar.q0(i));
    }

    public int minIntrinsicWidth(M0.m mVar, M0.l lVar, int i) {
        if (!H1()) {
            return lVar.A0(i);
        }
        long K1 = K1(n1.c.b(0, 0, 0, i, 7, null));
        return Math.max(n1.b.n(K1), lVar.A0(i));
    }

    public String toString() {
        return "PainterModifier(painter=" + this.a + ", sizeToIntrinsics=" + this.b + ", alignment=" + this.c + ", alpha=" + this.e + ", colorFilter=" + this.f + ')';
    }
}
