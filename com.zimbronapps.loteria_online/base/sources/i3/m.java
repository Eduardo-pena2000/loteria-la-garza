package I3;

import I3.a;
import L3.s;
import M2.q;
import M2.x;
import P2.K;
import P2.z;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import o3.B;
import o3.I;
import o3.J;
import o3.N;
import o3.O;
import o3.P;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m implements o3.p, J {
    public static final o3.u B = new l();
    public D3.a A;
    public final s.a a;
    public final int b;
    public final z c;
    public final z d;
    public final z e;
    public final z f;
    public final ArrayDeque g;
    public final p h;
    public final List i;
    public t7.r j = t7.r.s();
    public int k;
    public int l;
    public long m;
    public int n;
    public z o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public o3.r u;
    public a[] v;
    public long[][] w;
    public int x;
    public long y;
    public int z;

    public static final class a {
        public final s a;
        public final v b;
        public final O c;
        public final P d;
        public int e;

        public a(s sVar, v vVar, O o) {
            this.a = sVar;
            this.b = vVar;
            this.c = o;
            this.d = "audio/true-hd".equals(sVar.f.n) ? new P() : null;
        }
    }

    public m(s.a aVar, int i) {
        this.a = aVar;
        this.b = i;
        this.k = (i & 4) != 0 ? 3 : 0;
        this.h = new p();
        this.i = new ArrayList();
        this.f = new z(16);
        this.g = new ArrayDeque();
        this.c = new z(Q2.d.a);
        this.d = new z(4);
        this.e = new z();
        this.p = -1;
        this.u = o3.r.V8;
        this.v = new a[0];
    }

    public static int B(z zVar) {
        zVar.T(8);
        int o = o(zVar.p());
        if (o != 0) {
            return o;
        }
        zVar.U(4);
        while (zVar.a() > 0) {
            int o2 = o(zVar.p());
            if (o2 != 0) {
                return o2;
            }
        }
        return 0;
    }

    public static boolean I(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473;
    }

    public static boolean J(int i) {
        return i == 1835296868 || i == 1836476516 || i == 1751411826 || i == 1937011556 || i == 1937011827 || i == 1937011571 || i == 1668576371 || i == 1701606260 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1953196132 || i == 1718909296 || i == 1969517665 || i == 1801812339 || i == 1768715124;
    }

    public static /* synthetic */ s m(s sVar) {
        return v(sVar);
    }

    public static /* synthetic */ o3.p[] n() {
        return w();
    }

    public static int o(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    public static long[][] p(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            jArr[i] = new long[aVarArr[i].b.b];
            jArr2[i] = aVarArr[i].b.f[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < aVarArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < aVarArr.length; i4++) {
                if (!zArr[i4]) {
                    long j3 = jArr2[i4];
                    if (j3 <= j2) {
                        i3 = i4;
                        j2 = j3;
                    }
                }
            }
            int i5 = iArr[i3];
            long[] jArr3 = jArr[i3];
            jArr3[i5] = j;
            v vVar = aVarArr[i3].b;
            j += vVar.d[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr3.length) {
                jArr2[i3] = vVar.f[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    public static int t(v vVar, long j) {
        int a2 = vVar.a(j);
        return a2 == -1 ? vVar.b(j) : a2;
    }

    public static /* synthetic */ o3.p[] w() {
        return new o3.p[]{new m(s.a.a, 16)};
    }

    public static long x(v vVar, long j, long j2) {
        int t = t(vVar, j);
        return t == -1 ? j2 : Math.min(vVar.c[t], j2);
    }

    public final void A() {
        if (this.z != 2 || (this.b & 2) == 0) {
            return;
        }
        this.u.e(0, 4).b(new q.b().h0(this.A == null ? null : new x(this.A)).K());
        this.u.s();
        this.u.n(new J.b(-9223372036854775807L));
    }

    public final void C(a.a aVar) {
        x xVar;
        int i;
        List list;
        x xVar2;
        x xVar3;
        x xVar4;
        int i2;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        boolean z = this.z == 1;
        B b = new B();
        a.b g = aVar.g(1969517665);
        if (g != null) {
            x C = b.C(g);
            b.c(C);
            xVar = C;
        } else {
            xVar = null;
        }
        a.a f = aVar.f(1835365473);
        x p = f != null ? b.p(f) : null;
        long j = -9223372036854775807L;
        x xVar5 = new x(b.r(((a.b) P2.a.e(aVar.g(1836476516))).b));
        List B2 = b.B(aVar, b, -9223372036854775807L, null, (this.b & 1) != 0, z, new k());
        long j2 = -9223372036854775807L;
        int i4 = 0;
        int i5 = -1;
        while (i4 < B2.size()) {
            v vVar = (v) B2.get(i4);
            if (vVar.b == 0) {
                list = B2;
                i = i3;
                xVar4 = xVar5;
                xVar3 = xVar;
            } else {
                s sVar = vVar.a;
                x xVar6 = xVar5;
                x xVar7 = xVar;
                long j3 = sVar.e;
                if (j3 == j) {
                    j3 = vVar.h;
                }
                j2 = Math.max(j2, j3);
                i = i3 + 1;
                list = B2;
                a aVar2 = new a(sVar, vVar, this.u.e(i3, sVar.b));
                int i6 = "audio/true-hd".equals(sVar.f.n) ? vVar.e * 16 : vVar.e + 30;
                q.b a2 = sVar.f.a();
                a2.f0(i6);
                if (sVar.b == 2) {
                    if ((this.b & 8) != 0) {
                        a2.m0(sVar.f.f | (i5 == -1 ? 1 : 2));
                    }
                    if (j3 > 0 && (i2 = vVar.b) > 0) {
                        a2.X(i2 / (j3 / 1000000.0f));
                    }
                }
                j.k(sVar.b, b, a2);
                int i7 = sVar.b;
                if (this.i.isEmpty()) {
                    xVar3 = xVar7;
                    xVar4 = xVar6;
                    xVar2 = null;
                } else {
                    xVar2 = new x(this.i);
                    xVar3 = xVar7;
                    xVar4 = xVar6;
                }
                j.l(i7, p, a2, xVar2, xVar3, xVar4);
                aVar2.c.b(a2.K());
                if (sVar.b == 2 && i5 == -1) {
                    i5 = arrayList.size();
                }
                arrayList.add(aVar2);
            }
            i4++;
            xVar = xVar3;
            B2 = list;
            j = -9223372036854775807L;
            xVar5 = xVar4;
            i3 = i;
        }
        this.x = i5;
        this.y = j2;
        a[] aVarArr = (a[]) arrayList.toArray(new a[0]);
        this.v = aVarArr;
        this.w = p(aVarArr);
        this.u.s();
        this.u.n(this);
    }

    public final void D(long j) {
        if (this.l == 1836086884) {
            int i = this.n;
            this.A = new D3.a(0L, j, -9223372036854775807L, j + i, this.m - i);
        }
    }

    public final boolean E(o3.q qVar) {
        a.a aVar;
        if (this.n == 0) {
            if (!qVar.h(this.f.e(), 0, 8, true)) {
                A();
                return false;
            }
            this.n = 8;
            this.f.T(0);
            this.m = this.f.I();
            this.l = this.f.p();
        }
        long j = this.m;
        if (j == 1) {
            qVar.readFully(this.f.e(), 8, 8);
            this.n += 8;
            this.m = this.f.L();
        } else if (j == 0) {
            long a2 = qVar.a();
            if (a2 == -1 && (aVar = (a.a) this.g.peek()) != null) {
                a2 = aVar.b;
            }
            if (a2 != -1) {
                this.m = (a2 - qVar.b()) + this.n;
            }
        }
        if (this.m < this.n) {
            throw M2.z.d("Atom size less than header length (unsupported).");
        }
        if (I(this.l)) {
            long b = qVar.b();
            long j2 = this.m;
            int i = this.n;
            long j3 = (b + j2) - i;
            if (j2 != i && this.l == 1835365473) {
                y(qVar);
            }
            this.g.push(new a.a(this.l, j3));
            if (this.m == this.n) {
                z(j3);
            } else {
                q();
            }
        } else if (J(this.l)) {
            P2.a.f(this.n == 8);
            P2.a.f(this.m <= 2147483647L);
            z zVar = new z((int) this.m);
            System.arraycopy(this.f.e(), 0, zVar.e(), 0, 8);
            this.o = zVar;
            this.k = 1;
        } else {
            D(qVar.b() - this.n);
            this.o = null;
            this.k = 1;
        }
        return true;
    }

    public final boolean F(o3.q qVar, I i) {
        boolean z;
        long j = this.m - this.n;
        long b = qVar.b() + j;
        z zVar = this.o;
        if (zVar != null) {
            qVar.readFully(zVar.e(), this.n, (int) j);
            if (this.l == 1718909296) {
                this.t = true;
                this.z = B(zVar);
            } else if (!this.g.isEmpty()) {
                ((a.a) this.g.peek()).e(new a.b(this.l, zVar));
            }
        } else {
            if (!this.t && this.l == 1835295092) {
                this.z = 1;
            }
            if (j >= 262144) {
                i.a = qVar.b() + j;
                z = true;
                z(b);
                return (z || this.k == 2) ? false : true;
            }
            qVar.m((int) j);
        }
        z = false;
        z(b);
        if (z) {
        }
    }

    public final int G(o3.q qVar, I i) {
        int i2;
        I i3;
        long b = qVar.b();
        if (this.p == -1) {
            int u = u(b);
            this.p = u;
            if (u == -1) {
                return -1;
            }
        }
        a aVar = this.v[this.p];
        O o = aVar.c;
        int i4 = aVar.e;
        v vVar = aVar.b;
        long j = vVar.c[i4];
        int i5 = vVar.d[i4];
        P p = aVar.d;
        long j2 = (j - b) + this.q;
        if (j2 < 0) {
            i2 = 1;
            i3 = i;
        } else {
            if (j2 < 262144) {
                if (aVar.a.g == 1) {
                    j2 += 8;
                    i5 -= 8;
                }
                qVar.m((int) j2);
                s sVar = aVar.a;
                if (sVar.j == 0) {
                    if ("audio/ac4".equals(sVar.f.n)) {
                        if (this.r == 0) {
                            o3.c.a(i5, this.e);
                            o.f(this.e, 7);
                            this.r += 7;
                        }
                        i5 += 7;
                    } else if (p != null) {
                        p.d(qVar);
                    }
                    while (true) {
                        int i6 = this.r;
                        if (i6 >= i5) {
                            break;
                        }
                        int c = o.c(qVar, i5 - i6, false);
                        this.q += c;
                        this.r += c;
                        this.s -= c;
                    }
                } else {
                    byte[] e = this.d.e();
                    e[0] = 0;
                    e[1] = 0;
                    e[2] = 0;
                    int i7 = aVar.a.j;
                    int i8 = 4 - i7;
                    while (this.r < i5) {
                        int i9 = this.s;
                        if (i9 == 0) {
                            qVar.readFully(e, i8, i7);
                            this.q += i7;
                            this.d.T(0);
                            int p2 = this.d.p();
                            if (p2 < 0) {
                                throw M2.z.a("Invalid NAL length", null);
                            }
                            this.s = p2;
                            this.c.T(0);
                            o.f(this.c, 4);
                            this.r += 4;
                            i5 += i8;
                        } else {
                            int c2 = o.c(qVar, i9, false);
                            this.q += c2;
                            this.r += c2;
                            this.s -= c2;
                        }
                    }
                }
                int i10 = i5;
                v vVar2 = aVar.b;
                long j3 = vVar2.f[i4];
                int i11 = vVar2.g[i4];
                if (p != null) {
                    p.c(o, j3, i11, i10, 0, null);
                    if (i4 + 1 == aVar.b.b) {
                        p.a(o, null);
                    }
                } else {
                    o.a(j3, i11, i10, 0, null);
                }
                aVar.e++;
                this.p = -1;
                this.q = 0;
                this.r = 0;
                this.s = 0;
                return 0;
            }
            i3 = i;
            i2 = 1;
        }
        i3.a = j;
        return i2;
    }

    public final int H(o3.q qVar, I i) {
        int c = this.h.c(qVar, i, this.i);
        if (c == 1 && i.a == 0) {
            q();
        }
        return c;
    }

    public final void K(a aVar, long j) {
        v vVar = aVar.b;
        int a2 = vVar.a(j);
        if (a2 == -1) {
            a2 = vVar.b(j);
        }
        aVar.e = a2;
    }

    public void a(long j, long j2) {
        this.g.clear();
        this.n = 0;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        if (j == 0) {
            if (this.k != 3) {
                q();
                return;
            } else {
                this.h.g();
                this.i.clear();
                return;
            }
        }
        for (a aVar : this.v) {
            K(aVar, j2);
            P p = aVar.d;
            if (p != null) {
                p.b();
            }
        }
    }

    public void b(o3.r rVar) {
        if ((this.b & 16) == 0) {
            rVar = new L3.u(rVar, this.a);
        }
        this.u = rVar;
    }

    public boolean d(o3.q qVar) {
        N d = r.d(qVar, (this.b & 2) != 0);
        this.j = d != null ? t7.r.t(d) : t7.r.s();
        return d == null;
    }

    public int e(o3.q qVar, I i) {
        while (true) {
            int i2 = this.k;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return G(qVar, i);
                    }
                    if (i2 == 3) {
                        return H(qVar, i);
                    }
                    throw new IllegalStateException();
                }
                if (F(qVar, i)) {
                    return 1;
                }
            } else if (!E(qVar)) {
                return -1;
            }
        }
    }

    public J.a f(long j) {
        return r(j, -1);
    }

    public boolean i() {
        return true;
    }

    public long l() {
        return this.y;
    }

    public final void q() {
        this.k = 0;
        this.n = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o3.J.a r(long r17, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            I3.m$a[] r4 = r0.v
            int r5 = r4.length
            if (r5 != 0) goto L13
            o3.J$a r1 = new o3.J$a
            o3.K r2 = o3.K.c
            r1.<init>(r2)
            return r1
        L13:
            r5 = -1
            if (r3 == r5) goto L18
            r6 = r3
            goto L1a
        L18:
            int r6 = r0.x
        L1a:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = -1
            if (r6 == r5) goto L58
            r4 = r4[r6]
            I3.v r4 = r4.b
            int r6 = t(r4, r1)
            if (r6 != r5) goto L35
            o3.J$a r1 = new o3.J$a
            o3.K r2 = o3.K.c
            r1.<init>(r2)
            return r1
        L35:
            long[] r11 = r4.f
            r12 = r11[r6]
            long[] r11 = r4.c
            r14 = r11[r6]
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 >= 0) goto L5e
            int r11 = r4.b
            int r11 = r11 + (-1)
            if (r6 >= r11) goto L5e
            int r1 = r4.b(r1)
            if (r1 == r5) goto L5e
            if (r1 == r6) goto L5e
            long[] r2 = r4.f
            r9 = r2[r1]
            long[] r2 = r4.c
            r1 = r2[r1]
            goto L60
        L58:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = r1
        L5e:
            r1 = r9
            r9 = r7
        L60:
            if (r3 != r5) goto L80
            r3 = 0
        L63:
            I3.m$a[] r4 = r0.v
            int r5 = r4.length
            if (r3 >= r5) goto L80
            int r5 = r0.x
            if (r3 == r5) goto L7d
            r4 = r4[r3]
            I3.v r4 = r4.b
            long r5 = x(r4, r12, r14)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L7c
            long r1 = x(r4, r9, r1)
        L7c:
            r14 = r5
        L7d:
            int r3 = r3 + 1
            goto L63
        L80:
            o3.K r3 = new o3.K
            r3.<init>(r12, r14)
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 != 0) goto L8f
            o3.J$a r1 = new o3.J$a
            r1.<init>(r3)
            return r1
        L8f:
            o3.K r4 = new o3.K
            r4.<init>(r9, r1)
            o3.J$a r1 = new o3.J$a
            r1.<init>(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.m.r(long, int):o3.J$a");
    }

    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public t7.r j() {
        return this.j;
    }

    public final int u(long j) {
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.v;
            if (i3 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i3];
            int i4 = aVar.e;
            v vVar = aVar.b;
            if (i4 != vVar.b) {
                long j5 = vVar.c[i4];
                long j6 = ((long[][]) K.i(this.w))[i3][i4];
                long j7 = j5 - j;
                boolean z3 = j7 < 0 || j7 >= 262144;
                if ((!z3 && z2) || (z3 == z2 && j7 < j4)) {
                    z2 = z3;
                    j4 = j7;
                    i2 = i3;
                    j3 = j6;
                }
                if (j6 < j2) {
                    z = z3;
                    i = i3;
                    j2 = j6;
                }
            }
            i3++;
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + 10485760) ? i2 : i;
    }

    public final void y(o3.q qVar) {
        this.e.P(8);
        qVar.p(this.e.e(), 0, 8);
        b.f(this.e);
        qVar.m(this.e.f());
        qVar.f();
    }

    public final void z(long j) {
        while (!this.g.isEmpty() && ((a.a) this.g.peek()).b == j) {
            a.a aVar = (a.a) this.g.pop();
            if (aVar.a == 1836019574) {
                C(aVar);
                this.g.clear();
                this.k = 2;
            } else if (!this.g.isEmpty()) {
                ((a.a) this.g.peek()).d(aVar);
            }
        }
        if (this.k != 2) {
            q();
        }
    }

    public void release() {
    }

    public static /* synthetic */ s v(s sVar) {
        return sVar;
    }
}
