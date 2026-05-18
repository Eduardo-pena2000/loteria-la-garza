package Z2;

import M2.x;
import P2.E;
import P2.G;
import P2.z;
import R2.j;
import U2.x1;
import Z2.f;
import a3.f;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import k3.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j extends h3.m {
    public static final AtomicInteger N = new AtomicInteger();
    public final boolean A;
    public final boolean B;
    public final x1 C;
    public final long D;
    public k E;
    public s F;
    public int G;
    public boolean H;
    public volatile boolean I;
    public boolean J;
    public t7.r K;
    public boolean L;
    public boolean M;
    public final int k;
    public final int l;
    public final Uri m;
    public final boolean n;
    public final int o;
    public final R2.f p;
    public final R2.j q;
    public final k r;
    public final boolean s;
    public final boolean t;
    public final E u;
    public final h v;
    public final List w;
    public final M2.m x;
    public final C3.h y;
    public final z z;

    public j(h hVar, R2.f fVar, R2.j jVar, M2.q qVar, boolean z, R2.f fVar2, R2.j jVar2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, E e, long j4, M2.m mVar, k kVar, C3.h hVar2, z zVar, boolean z6, x1 x1Var) {
        super(fVar, jVar, qVar, i, obj, j, j2, j3);
        this.A = z;
        this.o = i2;
        this.M = z3;
        this.l = i3;
        this.q = jVar2;
        this.p = fVar2;
        this.H = jVar2 != null;
        this.B = z2;
        this.m = uri;
        this.s = z5;
        this.u = e;
        this.D = j4;
        this.t = z4;
        this.v = hVar;
        this.w = list;
        this.x = mVar;
        this.r = kVar;
        this.y = hVar2;
        this.z = zVar;
        this.n = z6;
        this.C = x1Var;
        this.K = t7.r.s();
        this.k = N.getAndIncrement();
    }

    public static R2.f i(R2.f fVar, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return fVar;
        }
        P2.a.e(bArr2);
        return new a(fVar, bArr, bArr2);
    }

    public static j j(h hVar, R2.f fVar, M2.q qVar, long j, a3.f fVar2, f.e eVar, Uri uri, List list, int i, Object obj, boolean z, v vVar, long j2, j jVar, byte[] bArr, byte[] bArr2, boolean z2, x1 x1Var, f.a aVar) {
        R2.j jVar2;
        R2.f fVar3;
        boolean z3;
        C3.h hVar2;
        z zVar;
        k kVar;
        f.e eVar2 = eVar.a;
        R2.j a = new j.b().i(G.f(fVar2.a, eVar2.a)).h(eVar2.i).g(eVar2.j).b(eVar.d ? 8 : 0).a();
        boolean z4 = bArr != null;
        R2.f i2 = i(fVar, bArr, z4 ? l((String) P2.a.e(eVar2.h)) : null);
        f.d dVar = eVar2.b;
        if (dVar != null) {
            boolean z5 = bArr2 != null;
            byte[] l = z5 ? l((String) P2.a.e(dVar.h)) : null;
            jVar2 = new j.b().i(G.f(fVar2.a, dVar.a)).h(dVar.i).g(dVar.j).a();
            z3 = z5;
            fVar3 = i(fVar, bArr2, l);
        } else {
            jVar2 = null;
            fVar3 = null;
            z3 = false;
        }
        long j3 = j + eVar2.e;
        long j4 = j3 + eVar2.c;
        int i3 = fVar2.j + eVar2.d;
        if (jVar != null) {
            R2.j jVar3 = jVar.q;
            boolean z6 = jVar2 == jVar3 || (jVar2 != null && jVar3 != null && jVar2.a.equals(jVar3.a) && jVar2.g == jVar.q.g);
            boolean z7 = uri.equals(jVar.m) && jVar.J;
            C3.h hVar3 = jVar.y;
            z zVar2 = jVar.z;
            kVar = (z6 && z7 && !jVar.L && jVar.l == i3) ? jVar.E : null;
            hVar2 = hVar3;
            zVar = zVar2;
        } else {
            hVar2 = new C3.h();
            zVar = new z(10);
            kVar = null;
        }
        return new j(hVar, i2, a, qVar, z4, fVar3, jVar2, z3, uri, list, i, obj, j3, j4, eVar.b, eVar.c, !eVar.d, i3, eVar2.k, z, vVar.a(i3), j2, eVar2.f, kVar, hVar2, zVar, z2, x1Var);
    }

    public static byte[] l(String str) {
        if (s7.c.e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    public static boolean p(f.e eVar, a3.f fVar) {
        f.e eVar2 = eVar.a;
        return eVar2 instanceof f.b ? ((f.b) eVar2).l || (eVar.c == 0 && fVar.c) : fVar.c;
    }

    public static boolean w(j jVar, Uri uri, a3.f fVar, f.e eVar, long j) {
        if (jVar == null) {
            return false;
        }
        if (uri.equals(jVar.m) && jVar.J) {
            return false;
        }
        return !p(eVar, fVar) || j + eVar.a.e < jVar.h;
    }

    public void b() {
        k kVar;
        P2.a.e(this.F);
        if (this.E == null && (kVar = this.r) != null && kVar.d()) {
            this.E = this.r;
            this.H = false;
        }
        s();
        if (this.I) {
            return;
        }
        if (!this.t) {
            r();
        }
        this.J = !this.I;
    }

    public void c() {
        this.I = true;
    }

    public boolean h() {
        return this.J;
    }

    public final void k(R2.f fVar, R2.j jVar, boolean z, boolean z2) {
        R2.j e;
        long b;
        long j;
        if (z) {
            r0 = this.G != 0;
            e = jVar;
        } else {
            e = jVar.e(this.G);
        }
        try {
            o3.i u = u(fVar, e, z2);
            if (r0) {
                u.m(this.G);
            }
            while (!this.I && this.E.a(u)) {
                try {
                    try {
                    } catch (EOFException e2) {
                        if ((this.d.f & 16384) == 0) {
                            throw e2;
                        }
                        this.E.c();
                        b = u.b();
                        j = jVar.g;
                    }
                } catch (Throwable th) {
                    this.G = (int) (u.b() - jVar.g);
                    throw th;
                }
            }
            b = u.b();
            j = jVar.g;
            this.G = (int) (b - j);
        } finally {
            R2.i.a(fVar);
        }
    }

    public int m(int i) {
        P2.a.f(!this.n);
        if (i >= this.K.size()) {
            return 0;
        }
        return ((Integer) this.K.get(i)).intValue();
    }

    public void n(s sVar, t7.r rVar) {
        this.F = sVar;
        this.K = rVar;
    }

    public void o() {
        this.L = true;
    }

    public boolean q() {
        return this.M;
    }

    public final void r() {
        k(this.i, this.b, this.A, true);
    }

    public final void s() {
        if (this.H) {
            P2.a.e(this.p);
            P2.a.e(this.q);
            k(this.p, this.q, this.B, false);
            this.G = 0;
            this.H = false;
        }
    }

    public final long t(o3.q qVar) {
        qVar.f();
        try {
            this.z.P(10);
            qVar.p(this.z.e(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.z.J() != 4801587) {
            return -9223372036854775807L;
        }
        this.z.U(3);
        int F = this.z.F();
        int i = F + 10;
        if (i > this.z.b()) {
            byte[] e = this.z.e();
            this.z.P(i);
            System.arraycopy(e, 0, this.z.e(), 0, 10);
        }
        qVar.p(this.z.e(), 10, F);
        x e2 = this.y.e(this.z.e(), F);
        if (e2 == null) {
            return -9223372036854775807L;
        }
        int j = e2.j();
        for (int i2 = 0; i2 < j; i2++) {
            x.b i3 = e2.i(i2);
            if (i3 instanceof C3.m) {
                C3.m mVar = (C3.m) i3;
                if ("com.apple.streaming.transportStreamTimestamp".equals(mVar.b)) {
                    System.arraycopy(mVar.c, 0, this.z.e(), 0, 8);
                    this.z.T(0);
                    this.z.S(8);
                    return this.z.z() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final o3.i u(R2.f fVar, R2.j jVar, boolean z) {
        long g = fVar.g(jVar);
        if (z) {
            try {
                this.u.j(this.s, this.g, this.D);
            } catch (TimeoutException e) {
                throw new IOException(e);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        }
        o3.i iVar = new o3.i(fVar, jVar.g, g);
        if (this.E == null) {
            long t = t(iVar);
            iVar.f();
            k kVar = this.r;
            k f = kVar != null ? kVar.f() : this.v.c(jVar.a, this.d, this.w, this.u, fVar.e(), iVar, this.C);
            this.E = f;
            if (f.e()) {
                this.F.p0(t != -9223372036854775807L ? this.u.b(t) : this.g);
            } else {
                this.F.p0(0L);
            }
            this.F.b0();
            this.E.b(this.F);
        }
        this.F.m0(this.x);
        return iVar;
    }

    public void v() {
        this.M = true;
    }
}
