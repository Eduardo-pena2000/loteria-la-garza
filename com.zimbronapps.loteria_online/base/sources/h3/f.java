package H3;

import C3.h;
import C3.l;
import C3.n;
import H3.g;
import M2.q;
import M2.x;
import P2.K;
import P2.o;
import P2.z;
import java.io.EOFException;
import java.math.RoundingMode;
import o3.B;
import o3.D;
import o3.F;
import o3.I;
import o3.O;
import o3.m;
import o3.p;
import o3.q;
import o3.r;
import o3.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f implements p {
    public static final u u = new d();
    public static final h.a v = new e();
    public final int a;
    public final long b;
    public final z c;
    public final F.a d;
    public final B e;
    public final D f;
    public final O g;
    public r h;
    public O i;
    public O j;
    public int k;
    public x l;
    public long m;
    public long n;
    public long o;
    public int p;
    public g q;
    public boolean r;
    public boolean s;
    public long t;

    public f() {
        this(0);
    }

    public static /* synthetic */ p[] c() {
        return r();
    }

    public static /* synthetic */ boolean f(int i, int i2, int i3, int i4, int i5) {
        return s(i, i2, i3, i4, i5);
    }

    private void h() {
        P2.a.h(this.i);
        K.i(this.h);
    }

    public static long o(x xVar) {
        if (xVar == null) {
            return -9223372036854775807L;
        }
        int j = xVar.j();
        for (int i = 0; i < j; i++) {
            x.b i2 = xVar.i(i);
            if (i2 instanceof n) {
                n nVar = (n) i2;
                if (nVar.a.equals("TLEN")) {
                    return K.K0(Long.parseLong((String) nVar.d.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    public static int p(z zVar, int i) {
        if (zVar.g() >= i + 4) {
            zVar.T(i);
            int p = zVar.p();
            if (p == 1483304551 || p == 1231971951) {
                return p;
            }
        }
        if (zVar.g() < 40) {
            return 0;
        }
        zVar.T(36);
        return zVar.p() == 1447187017 ? 1447187017 : 0;
    }

    public static boolean q(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    private static /* synthetic */ p[] r() {
        return new p[]{new f()};
    }

    public static /* synthetic */ boolean s(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    public static c t(x xVar, long j) {
        if (xVar == null) {
            return null;
        }
        int j2 = xVar.j();
        for (int i = 0; i < j2; i++) {
            x.b i2 = xVar.i(i);
            if (i2 instanceof l) {
                return c.a(j, (l) i2, o(xVar));
            }
        }
        return null;
    }

    private int x(q qVar) {
        if (this.p == 0) {
            qVar.f();
            if (v(qVar)) {
                return -1;
            }
            this.c.T(0);
            int p = this.c.p();
            if (!q(p, this.k) || F.j(p) == -1) {
                qVar.m(1);
                this.k = 0;
                return 0;
            }
            this.d.a(p);
            if (this.m == -9223372036854775807L) {
                this.m = this.q.c(qVar.b());
                if (this.b != -9223372036854775807L) {
                    this.m += this.b - this.q.c(0L);
                }
            }
            this.p = this.d.c;
            g gVar = this.q;
            if (gVar instanceof b) {
                b bVar = (b) gVar;
                bVar.b(k(this.n + r0.g), qVar.b() + this.d.c);
                if (this.s && bVar.a(this.t)) {
                    this.s = false;
                    this.j = this.i;
                }
            }
        }
        int c = this.j.c(qVar, this.p, true);
        if (c == -1) {
            return -1;
        }
        int i = this.p - c;
        this.p = i;
        if (i > 0) {
            return 0;
        }
        this.j.a(k(this.n), 1, this.d.c, 0, null);
        this.n += this.d.g;
        this.p = 0;
        return 0;
    }

    public void a(long j, long j2) {
        this.k = 0;
        this.m = -9223372036854775807L;
        this.n = 0L;
        this.p = 0;
        this.t = j2;
        g gVar = this.q;
        if (!(gVar instanceof b) || ((b) gVar).a(j2)) {
            return;
        }
        this.s = true;
        this.j = this.g;
    }

    public void b(r rVar) {
        this.h = rVar;
        O e = rVar.e(0, 1);
        this.i = e;
        this.j = e;
        this.h.s();
    }

    public boolean d(q qVar) {
        return y(qVar, true);
    }

    public int e(q qVar, I i) {
        h();
        int w = w(qVar);
        if (w == -1 && (this.q instanceof b)) {
            long k = k(this.n);
            if (this.q.l() != k) {
                ((b) this.q).d(k);
                this.h.n(this.q);
            }
        }
        return w;
    }

    public final g i(q qVar) {
        long o;
        long j;
        g u2 = u(qVar);
        c t = t(this.l, qVar.b());
        if (this.r) {
            return new g.a();
        }
        if ((this.a & 4) != 0) {
            if (t != null) {
                o = t.l();
                j = t.h();
            } else if (u2 != null) {
                o = u2.l();
                j = u2.h();
            } else {
                o = o(this.l);
                j = -1;
            }
            u2 = new b(o, qVar.b(), j);
        } else if (t != null) {
            u2 = t;
        } else if (u2 == null) {
            u2 = null;
        }
        if (u2 == null || !(u2.i() || (this.a & 1) == 0)) {
            return n(qVar, (this.a & 2) != 0);
        }
        return u2;
    }

    public final long k(long j) {
        return this.m + ((j * 1000000) / this.d.d);
    }

    public void l() {
        this.r = true;
    }

    public final g m(long j, i iVar, long j2) {
        long j3;
        long j4;
        long a = iVar.a();
        if (a == -9223372036854775807L) {
            return null;
        }
        long j5 = iVar.c;
        if (j5 != -1) {
            long j6 = j + j5;
            j3 = j5 - iVar.a.c;
            j4 = j6;
        } else {
            if (j2 == -1) {
                return null;
            }
            j3 = (j2 - j) - iVar.a.c;
            j4 = j2;
        }
        long j7 = j3;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        return new a(j4, j + iVar.a.c, w7.f.d(K.Z0(j7, 8000000L, a, roundingMode)), w7.f.d(v7.e.b(j7, iVar.b, roundingMode)), false);
    }

    public final g n(q qVar, boolean z) {
        qVar.p(this.c.e(), 0, 4);
        this.c.T(0);
        this.d.a(this.c.p());
        return new a(qVar.a(), qVar.b(), this.d, z);
    }

    public final g u(q qVar) {
        int i;
        int i2;
        z zVar = new z(this.d.c);
        qVar.p(zVar.e(), 0, this.d.c);
        F.a aVar = this.d;
        int i3 = 21;
        if ((aVar.a & 1) != 0) {
            if (aVar.e != 1) {
                i3 = 36;
            }
        } else if (aVar.e == 1) {
            i3 = 13;
        }
        int p = p(zVar, i3);
        if (p != 1231971951) {
            if (p == 1447187017) {
                h a = h.a(qVar.a(), qVar.b(), this.d, zVar);
                qVar.m(this.d.c);
                return a;
            }
            if (p != 1483304551) {
                qVar.f();
                return null;
            }
        }
        i b = i.b(this.d, zVar);
        if (!this.e.a() && (i = b.d) != -1 && (i2 = b.e) != -1) {
            B b2 = this.e;
            b2.a = i;
            b2.b = i2;
        }
        long b3 = qVar.b();
        if (qVar.a() != -1 && b.c != -1 && qVar.a() != b.c + b3) {
            o.f("Mp3Extractor", "Data size mismatch between stream (" + qVar.a() + ") and Xing frame (" + (b.c + b3) + "), using Xing value.");
        }
        qVar.m(this.d.c);
        return p == 1483304551 ? j.a(b, b3) : m(b3, b, qVar.a());
    }

    public final boolean v(q qVar) {
        g gVar = this.q;
        if (gVar != null) {
            long h = gVar.h();
            if (h != -1 && qVar.i() > h - 4) {
                return true;
            }
        }
        try {
            return !qVar.d(this.c.e(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final int w(q qVar) {
        if (this.k == 0) {
            try {
                y(qVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.q == null) {
            g i = i(qVar);
            this.q = i;
            this.h.n(i);
            q.b h0 = new q.b().o0(this.d.b).f0(4096).N(this.d.e).p0(this.d.d).V(this.e.a).W(this.e.b).h0((this.a & 8) != 0 ? null : this.l);
            if (this.q.k() != -2147483647) {
                h0.M(this.q.k());
            }
            this.j.b(h0.K());
            this.o = qVar.b();
        } else if (this.o != 0) {
            long b = qVar.b();
            long j = this.o;
            if (b < j) {
                qVar.m((int) (j - b));
            }
        }
        return x(qVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x009a, code lost:
    
        if (r13 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009c, code lost:
    
        r12.m(r1 + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a4, code lost:
    
        r11.k = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a6, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a1, code lost:
    
        r12.f();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean y(o3.q r12, boolean r13) {
        /*
            r11 = this;
            if (r13 == 0) goto L6
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L8
        L6:
            r0 = 131072(0x20000, float:1.83671E-40)
        L8:
            r12.f()
            long r1 = r12.b()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L3e
            int r1 = r11.a
            r1 = r1 & 8
            if (r1 != 0) goto L1f
            r1 = r2
            goto L21
        L1f:
            C3.h$a r1 = H3.f.v
        L21:
            o3.D r4 = r11.f
            M2.x r1 = r4.a(r12, r1)
            r11.l = r1
            if (r1 == 0) goto L30
            o3.B r4 = r11.e
            r4.c(r1)
        L30:
            long r4 = r12.i()
            int r1 = (int) r4
            if (r13 != 0) goto L3a
            r12.m(r1)
        L3a:
            r4 = r3
        L3b:
            r5 = r4
            r6 = r5
            goto L41
        L3e:
            r1 = r3
            r4 = r1
            goto L3b
        L41:
            boolean r7 = r11.v(r12)
            r8 = 1
            if (r7 == 0) goto L51
            if (r5 <= 0) goto L4b
            goto L9a
        L4b:
            java.io.EOFException r12 = new java.io.EOFException
            r12.<init>()
            throw r12
        L51:
            P2.z r7 = r11.c
            r7.T(r3)
            P2.z r7 = r11.c
            int r7 = r7.p()
            if (r4 == 0) goto L65
            long r9 = (long) r4
            boolean r9 = q(r7, r9)
            if (r9 == 0) goto L6c
        L65:
            int r9 = o3.F.j(r7)
            r10 = -1
            if (r9 != r10) goto L8c
        L6c:
            int r4 = r6 + 1
            if (r6 != r0) goto L7a
            if (r13 == 0) goto L73
            return r3
        L73:
            java.lang.String r12 = "Searched too many bytes."
            M2.z r12 = M2.z.a(r12, r2)
            throw r12
        L7a:
            if (r13 == 0) goto L85
            r12.f()
            int r5 = r1 + r4
            r12.j(r5)
            goto L88
        L85:
            r12.m(r8)
        L88:
            r5 = r3
            r6 = r4
            r4 = r5
            goto L41
        L8c:
            int r5 = r5 + 1
            if (r5 != r8) goto L97
            o3.F$a r4 = r11.d
            r4.a(r7)
            r4 = r7
            goto La7
        L97:
            r7 = 4
            if (r5 != r7) goto La7
        L9a:
            if (r13 == 0) goto La1
            int r1 = r1 + r6
            r12.m(r1)
            goto La4
        La1:
            r12.f()
        La4:
            r11.k = r4
            return r8
        La7:
            int r9 = r9 + (-4)
            r12.j(r9)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: H3.f.y(o3.q, boolean):boolean");
    }

    public f(int i) {
        this(i, -9223372036854775807L);
    }

    public f(int i, long j) {
        this.a = (i & 2) != 0 ? i | 1 : i;
        this.b = j;
        this.c = new z(10);
        this.d = new F.a();
        this.e = new B();
        this.m = -9223372036854775807L;
        this.f = new D();
        m mVar = new m();
        this.g = mVar;
        this.j = mVar;
    }

    public void release() {
    }
}
