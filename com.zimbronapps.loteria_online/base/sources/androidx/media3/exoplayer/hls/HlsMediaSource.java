package androidx.media3.exoplayer.hls;

import M2.u;
import M2.v;
import P2.K;
import R2.f;
import R2.x;
import Y2.l;
import Y2.u;
import Z2.c;
import Z2.g;
import Z2.h;
import Z2.i;
import a3.e;
import a3.f;
import a3.k;
import android.os.Looper;
import g3.D;
import g3.U;
import g3.j;
import g3.m;
import g3.w;
import java.util.List;
import k3.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class HlsMediaSource extends g3.a implements k.e {
    public final h h;
    public final g i;
    public final j j;
    public final u k;
    public final k3.k l;
    public final boolean m;
    public final int n;
    public final boolean o;
    public final k p;
    public final long q;
    public final long r;
    public u.g s;
    public x t;
    public M2.u u;

    public static final class Factory implements w.a {
        public final g a;
        public h b;
        public a3.j c;
        public k.a d;
        public j e;
        public Y2.w f;
        public k3.k g;
        public boolean h;
        public int i;
        public boolean j;
        public long k;
        public long l;

        public Factory(f.a aVar) {
            this(new c(aVar));
        }

        public HlsMediaSource a(M2.u uVar) {
            P2.a.e(uVar.b);
            a3.j jVar = this.c;
            List list = uVar.b.d;
            a3.j eVar = !list.isEmpty() ? new e(jVar, list) : jVar;
            g gVar = this.a;
            h hVar = this.b;
            j jVar2 = this.e;
            Y2.u a = this.f.a(uVar);
            k3.k kVar = this.g;
            return new HlsMediaSource(uVar, gVar, hVar, jVar2, null, a, kVar, this.d.a(this.a, kVar, eVar), this.k, this.h, this.i, this.j, this.l, null);
        }

        public Factory b(boolean z) {
            this.b.a(z);
            return this;
        }

        public Factory(g gVar) {
            this.a = (g) P2.a.e(gVar);
            this.f = new l();
            this.c = new a3.a();
            this.d = a3.c.p;
            this.b = h.a;
            this.g = new k3.j();
            this.e = new m();
            this.i = 1;
            this.k = -9223372036854775807L;
            this.h = true;
            b(true);
        }
    }

    static {
        v.a("media3.exoplayer.hls");
    }

    public /* synthetic */ HlsMediaSource(M2.u uVar, g gVar, h hVar, j jVar, k3.e eVar, Y2.u uVar2, k3.k kVar, k kVar2, long j, boolean z, int i, boolean z2, long j2, a aVar) {
        this(uVar, gVar, hVar, jVar, eVar, uVar2, kVar, kVar2, j, z, i, z2, j2);
    }

    public static f.b E(List list, long j) {
        f.b bVar = null;
        for (int i = 0; i < list.size(); i++) {
            f.b bVar2 = (f.b) list.get(i);
            long j2 = bVar2.e;
            if (j2 > j || !bVar2.l) {
                if (j2 > j) {
                    break;
                }
            } else {
                bVar = bVar2;
            }
        }
        return bVar;
    }

    public static f.d F(List list, long j) {
        return (f.d) list.get(K.f(list, Long.valueOf(j), true, true));
    }

    public static long I(a3.f fVar, long j) {
        long j2;
        f.f fVar2 = fVar.v;
        long j3 = fVar.e;
        if (j3 != -9223372036854775807L) {
            j2 = fVar.u - j3;
        } else {
            long j4 = fVar2.d;
            if (j4 == -9223372036854775807L || fVar.n == -9223372036854775807L) {
                long j5 = fVar2.c;
                j2 = j5 != -9223372036854775807L ? j5 : fVar.m * 3;
            } else {
                j2 = j4;
            }
        }
        return j2 + j;
    }

    public void B() {
        this.p.stop();
        this.k.release();
    }

    public final U C(a3.f fVar, long j, long j2, i iVar) {
        long e = fVar.h - this.p.e();
        long j3 = fVar.o ? e + fVar.u : -9223372036854775807L;
        long G = G(fVar);
        long j4 = this.s.a;
        J(fVar, K.q(j4 != -9223372036854775807L ? K.K0(j4) : I(fVar, G), G, fVar.u + G));
        return new U(j, j2, -9223372036854775807L, j3, fVar.u, e, H(fVar, G), true, !fVar.o, fVar.d == 2 && fVar.f, iVar, f(), this.s);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final g3.U D(a3.f r25, long r26, long r28, Z2.i r30) {
        /*
            r24 = this;
            r0 = r25
            long r1 = r0.e
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L31
            java.util.List r1 = r0.r
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L16
            goto L31
        L16:
            boolean r1 = r0.g
            if (r1 != 0) goto L2e
            long r1 = r0.e
            long r3 = r0.u
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto L23
            goto L2e
        L23:
            java.util.List r3 = r0.r
            a3.f$d r1 = F(r3, r1)
            long r1 = r1.e
        L2b:
            r16 = r1
            goto L34
        L2e:
            long r1 = r0.e
            goto L2b
        L31:
            r1 = 0
            goto L2b
        L34:
            g3.U r1 = new g3.U
            r3 = r1
            long r10 = r0.u
            r12 = r10
            M2.u r22 = r24.f()
            r23 = 0
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = 0
            r18 = 1
            r19 = 0
            r20 = 1
            r4 = r26
            r6 = r28
            r21 = r30
            r3.<init>(r4, r6, r8, r10, r12, r14, r16, r18, r19, r20, r21, r22, r23)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.HlsMediaSource.D(a3.f, long, long, Z2.i):g3.U");
    }

    public final long G(a3.f fVar) {
        if (fVar.p) {
            return K.K0(K.d0(this.q)) - fVar.e();
        }
        return 0L;
    }

    public final long H(a3.f fVar, long j) {
        long j2 = fVar.e;
        if (j2 == -9223372036854775807L) {
            j2 = (fVar.u + j) - K.K0(this.s.a);
        }
        if (fVar.g) {
            return j2;
        }
        f.b E = E(fVar.s, j2);
        if (E != null) {
            return E.e;
        }
        if (fVar.r.isEmpty()) {
            return 0L;
        }
        f.d F = F(fVar.r, j2);
        f.b E2 = E(F.m, j2);
        return E2 != null ? E2.e : F.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(a3.f r5, long r6) {
        /*
            r4 = this;
            M2.u r0 = r4.f()
            M2.u$g r0 = r0.d
            float r1 = r0.d
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L2a
            float r0 = r0.e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            a3.f$f r5 = r5.v
            long r0 = r5.c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            long r0 = r5.d
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L2a
            r5 = 1
            goto L2b
        L2a:
            r5 = 0
        L2b:
            M2.u$g$a r0 = new M2.u$g$a
            r0.<init>()
            long r6 = P2.K.j1(r6)
            M2.u$g$a r6 = r0.k(r6)
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L3e
            r0 = r7
            goto L42
        L3e:
            M2.u$g r0 = r4.s
            float r0 = r0.d
        L42:
            M2.u$g$a r6 = r6.j(r0)
            if (r5 == 0) goto L49
            goto L4d
        L49:
            M2.u$g r5 = r4.s
            float r7 = r5.e
        L4d:
            M2.u$g$a r5 = r6.h(r7)
            M2.u$g r5 = r5.f()
            r4.s = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.HlsMediaSource.J(a3.f, long):void");
    }

    public void c(g3.v vVar) {
        ((Z2.m) vVar).D();
    }

    public synchronized void e(M2.u uVar) {
        this.u = uVar;
    }

    public synchronized M2.u f() {
        return this.u;
    }

    public g3.v l(w.b bVar, b bVar2, long j) {
        D.a u = u(bVar);
        return new Z2.m(this.h, this.p, this.i, this.t, null, this.k, s(bVar), this.l, u, bVar2, this.j, this.m, this.n, this.o, x(), this.r);
    }

    public void n() {
        this.p.m();
    }

    public void q(a3.f fVar) {
        long j1 = fVar.p ? K.j1(fVar.h) : -9223372036854775807L;
        int i = fVar.d;
        long j = (i == 2 || i == 1) ? j1 : -9223372036854775807L;
        i iVar = new i((a3.g) P2.a.e(this.p.f()), fVar);
        A(this.p.j() ? C(fVar, j, j1, iVar) : D(fVar, j, j1, iVar));
    }

    public void z(x xVar) {
        this.t = xVar;
        this.k.a((Looper) P2.a.e(Looper.myLooper()), x());
        this.k.e();
        this.p.d(((u.h) P2.a.e(f().b)).a, u(null), this);
    }

    public HlsMediaSource(M2.u uVar, g gVar, h hVar, j jVar, k3.e eVar, Y2.u uVar2, k3.k kVar, k kVar2, long j, boolean z, int i, boolean z2, long j2) {
        this.u = uVar;
        this.s = uVar.d;
        this.i = gVar;
        this.h = hVar;
        this.j = jVar;
        this.k = uVar2;
        this.l = kVar;
        this.p = kVar2;
        this.q = j;
        this.m = z;
        this.n = i;
        this.o = z2;
        this.r = j2;
    }
}
