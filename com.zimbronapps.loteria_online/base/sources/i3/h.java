package I3;

import I3.a;
import L3.s;
import M2.m;
import M2.q;
import P2.E;
import P2.K;
import P2.z;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import o3.B;
import o3.I;
import o3.J;
import o3.N;
import o3.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class h implements o3.p {
    public static final o3.u K = new f();
    public static final byte[] L = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final M2.q M = new q.b().o0("application/x-emsg").K();
    public long A;
    public b B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public o3.r G;
    public O[] H;
    public O[] I;
    public boolean J;
    public final s.a a;
    public final int b;
    public final s c;
    public final List d;
    public final SparseArray e;
    public final z f;
    public final z g;
    public final z h;
    public final byte[] i;
    public final z j;
    public final E k;
    public final z3.c l;
    public final z m;
    public final ArrayDeque n;
    public final ArrayDeque o;
    public final O p;
    public t7.r q;
    public int r;
    public int s;
    public long t;
    public int u;
    public z v;
    public long w;
    public int x;
    public long y;
    public long z;

    public static final class a {
        public final long a;
        public final boolean b;
        public final int c;

        public a(long j, boolean z, int i) {
            this.a = j;
            this.b = z;
            this.c = i;
        }
    }

    public static final class b {
        public final O a;
        public v d;
        public d e;
        public int f;
        public int g;
        public int h;
        public int i;
        public boolean l;
        public final u b = new u();
        public final z c = new z();
        public final z j = new z(1);
        public final z k = new z();

        public b(O o, v vVar, d dVar) {
            this.a = o;
            this.d = vVar;
            this.e = dVar;
            j(vVar, dVar);
        }

        public static /* synthetic */ boolean a(b bVar) {
            return bVar.l;
        }

        public static /* synthetic */ boolean b(b bVar, boolean z) {
            bVar.l = z;
            return z;
        }

        public int c() {
            int i = !this.l ? this.d.g[this.f] : this.b.k[this.f] ? 1 : 0;
            return g() != null ? i | 1073741824 : i;
        }

        public long d() {
            return !this.l ? this.d.c[this.f] : this.b.g[this.h];
        }

        public long e() {
            return !this.l ? this.d.f[this.f] : this.b.c(this.f);
        }

        public int f() {
            return !this.l ? this.d.d[this.f] : this.b.i[this.f];
        }

        public t g() {
            if (!this.l) {
                return null;
            }
            int i = ((d) K.i(this.b.a)).a;
            t tVar = this.b.n;
            if (tVar == null) {
                tVar = this.d.a.a(i);
            }
            if (tVar == null || !tVar.a) {
                return null;
            }
            return tVar;
        }

        public boolean h() {
            this.f++;
            if (!this.l) {
                return false;
            }
            int i = this.g + 1;
            this.g = i;
            int[] iArr = this.b.h;
            int i2 = this.h;
            if (i != iArr[i2]) {
                return true;
            }
            this.h = i2 + 1;
            this.g = 0;
            return false;
        }

        public int i(int i, int i2) {
            z zVar;
            t g = g();
            if (g == null) {
                return 0;
            }
            int i3 = g.d;
            if (i3 != 0) {
                zVar = this.b.o;
            } else {
                byte[] bArr = (byte[]) K.i(g.e);
                this.k.R(bArr, bArr.length);
                z zVar2 = this.k;
                i3 = bArr.length;
                zVar = zVar2;
            }
            boolean g2 = this.b.g(this.f);
            boolean z = g2 || i2 != 0;
            this.j.e()[0] = (byte) ((z ? 128 : 0) | i3);
            this.j.T(0);
            this.a.d(this.j, 1, 1);
            this.a.d(zVar, i3, 1);
            if (!z) {
                return i3 + 1;
            }
            if (!g2) {
                this.c.P(8);
                byte[] e = this.c.e();
                e[0] = 0;
                e[1] = 1;
                e[2] = (byte) ((i2 >> 8) & 255);
                e[3] = (byte) (i2 & 255);
                e[4] = (byte) ((i >> 24) & 255);
                e[5] = (byte) ((i >> 16) & 255);
                e[6] = (byte) ((i >> 8) & 255);
                e[7] = (byte) (i & 255);
                this.a.d(this.c, 8, 1);
                return i3 + 9;
            }
            z zVar3 = this.b.o;
            int M = zVar3.M();
            zVar3.U(-2);
            int i4 = (M * 6) + 2;
            if (i2 != 0) {
                this.c.P(i4);
                byte[] e2 = this.c.e();
                zVar3.l(e2, 0, i4);
                int i5 = (((e2[2] & 255) << 8) | (e2[3] & 255)) + i2;
                e2[2] = (byte) ((i5 >> 8) & 255);
                e2[3] = (byte) (i5 & 255);
                zVar3 = this.c;
            }
            this.a.d(zVar3, i4, 1);
            return i3 + 1 + i4;
        }

        public void j(v vVar, d dVar) {
            this.d = vVar;
            this.e = dVar;
            this.a.b(vVar.a.f);
            k();
        }

        public void k() {
            this.b.f();
            this.f = 0;
            this.h = 0;
            this.g = 0;
            this.i = 0;
            this.l = false;
        }

        public void l(long j) {
            int i = this.f;
            while (true) {
                u uVar = this.b;
                if (i >= uVar.f || uVar.c(i) > j) {
                    return;
                }
                if (this.b.k[i]) {
                    this.i = i;
                }
                i++;
            }
        }

        public void m() {
            t g = g();
            if (g == null) {
                return;
            }
            z zVar = this.b.o;
            int i = g.d;
            if (i != 0) {
                zVar.U(i);
            }
            if (this.b.g(this.f)) {
                zVar.U(zVar.M() * 6);
            }
        }

        public void n(M2.m mVar) {
            t a = this.d.a.a(((d) K.i(this.b.a)).a);
            this.a.b(this.d.a.f.a().U(mVar.d(a != null ? a.b : null)).K());
        }
    }

    public h(s.a aVar, int i) {
        this(aVar, i, null, null, t7.r.s(), null);
    }

    public static void A(t tVar, z zVar, u uVar) {
        int i;
        int i2 = tVar.d;
        zVar.T(8);
        if ((I3.a.b(zVar.p()) & 1) == 1) {
            zVar.U(8);
        }
        int G = zVar.G();
        int K2 = zVar.K();
        if (K2 > uVar.f) {
            throw M2.z.a("Saiz sample count " + K2 + " is greater than fragment sample count" + uVar.f, null);
        }
        if (G == 0) {
            boolean[] zArr = uVar.m;
            i = 0;
            for (int i3 = 0; i3 < K2; i3++) {
                int G2 = zVar.G();
                i += G2;
                zArr[i3] = G2 > i2;
            }
        } else {
            i = G * K2;
            Arrays.fill(uVar.m, 0, K2, G > i2);
        }
        Arrays.fill(uVar.m, K2, uVar.f, false);
        if (i > 0) {
            uVar.d(i);
        }
    }

    public static void B(a.a aVar, String str, u uVar) {
        byte[] bArr = null;
        z zVar = null;
        z zVar2 = null;
        for (int i = 0; i < aVar.c.size(); i++) {
            a.b bVar = (a.b) aVar.c.get(i);
            z zVar3 = bVar.b;
            int i2 = bVar.a;
            if (i2 == 1935828848) {
                zVar3.T(12);
                if (zVar3.p() == 1936025959) {
                    zVar = zVar3;
                }
            } else if (i2 == 1936158820) {
                zVar3.T(12);
                if (zVar3.p() == 1936025959) {
                    zVar2 = zVar3;
                }
            }
        }
        if (zVar == null || zVar2 == null) {
            return;
        }
        zVar.T(8);
        int c = I3.a.c(zVar.p());
        zVar.U(4);
        if (c == 1) {
            zVar.U(4);
        }
        if (zVar.p() != 1) {
            throw M2.z.d("Entry count in sbgp != 1 (unsupported).");
        }
        zVar2.T(8);
        int c2 = I3.a.c(zVar2.p());
        zVar2.U(4);
        if (c2 == 1) {
            if (zVar2.I() == 0) {
                throw M2.z.d("Variable length description in sgpd found (unsupported)");
            }
        } else if (c2 >= 2) {
            zVar2.U(4);
        }
        if (zVar2.I() != 1) {
            throw M2.z.d("Entry count in sgpd != 1 (unsupported).");
        }
        zVar2.U(1);
        int G = zVar2.G();
        int i3 = (G & 240) >> 4;
        int i4 = G & 15;
        boolean z = zVar2.G() == 1;
        if (z) {
            int G2 = zVar2.G();
            byte[] bArr2 = new byte[16];
            zVar2.l(bArr2, 0, 16);
            if (G2 == 0) {
                int G3 = zVar2.G();
                bArr = new byte[G3];
                zVar2.l(bArr, 0, G3);
            }
            uVar.l = true;
            uVar.n = new t(z, str, G2, bArr2, i3, i4, bArr);
        }
    }

    public static void C(z zVar, int i, u uVar) {
        zVar.T(i + 8);
        int b2 = I3.a.b(zVar.p());
        if ((b2 & 1) != 0) {
            throw M2.z.d("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (b2 & 2) != 0;
        int K2 = zVar.K();
        if (K2 == 0) {
            Arrays.fill(uVar.m, 0, uVar.f, false);
            return;
        }
        if (K2 == uVar.f) {
            Arrays.fill(uVar.m, 0, K2, z);
            uVar.d(zVar.a());
            uVar.a(zVar);
        } else {
            throw M2.z.a("Senc sample count " + K2 + " is different from fragment sample count" + uVar.f, null);
        }
    }

    public static void D(z zVar, u uVar) {
        C(zVar, 0, uVar);
    }

    public static Pair E(z zVar, long j) {
        long L2;
        long L3;
        zVar.T(8);
        int c = I3.a.c(zVar.p());
        zVar.U(4);
        long I = zVar.I();
        if (c == 0) {
            L2 = zVar.I();
            L3 = zVar.I();
        } else {
            L2 = zVar.L();
            L3 = zVar.L();
        }
        long j2 = L2;
        long j3 = j + L3;
        long X0 = K.X0(j2, 1000000L, I);
        zVar.U(2);
        int M2 = zVar.M();
        int[] iArr = new int[M2];
        long[] jArr = new long[M2];
        long[] jArr2 = new long[M2];
        long[] jArr3 = new long[M2];
        long j4 = X0;
        int i = 0;
        long j5 = j2;
        while (i < M2) {
            int p = zVar.p();
            if ((p & Integer.MIN_VALUE) != 0) {
                throw M2.z.a("Unhandled indirect reference", null);
            }
            long I2 = zVar.I();
            iArr[i] = p & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            long j6 = j5 + I2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i2 = M2;
            long X02 = K.X0(j6, 1000000L, I);
            jArr4[i] = X02 - jArr5[i];
            zVar.U(4);
            j3 += r1[i];
            i++;
            iArr = iArr;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            M2 = i2;
            j5 = j6;
            j4 = X02;
        }
        return Pair.create(Long.valueOf(X0), new o3.g(iArr, jArr, jArr2, jArr3));
    }

    public static long F(z zVar) {
        zVar.T(8);
        return I3.a.c(zVar.p()) == 1 ? zVar.L() : zVar.I();
    }

    public static b G(z zVar, SparseArray sparseArray, boolean z) {
        zVar.T(8);
        int b2 = I3.a.b(zVar.p());
        b bVar = (b) (z ? sparseArray.valueAt(0) : sparseArray.get(zVar.p()));
        if (bVar == null) {
            return null;
        }
        if ((b2 & 1) != 0) {
            long L2 = zVar.L();
            u uVar = bVar.b;
            uVar.c = L2;
            uVar.d = L2;
        }
        d dVar = bVar.e;
        bVar.b.a = new d((b2 & 2) != 0 ? zVar.p() - 1 : dVar.a, (b2 & 8) != 0 ? zVar.p() : dVar.b, (b2 & 16) != 0 ? zVar.p() : dVar.c, (b2 & 32) != 0 ? zVar.p() : dVar.d);
        return bVar;
    }

    public static void H(a.a aVar, SparseArray sparseArray, boolean z, int i, byte[] bArr) {
        b G = G(((a.b) P2.a.e(aVar.g(1952868452))).b, sparseArray, z);
        if (G == null) {
            return;
        }
        u uVar = G.b;
        long j = uVar.q;
        boolean z2 = uVar.r;
        G.k();
        b.b(G, true);
        a.b g = aVar.g(1952867444);
        if (g == null || (i & 2) != 0) {
            uVar.q = j;
            uVar.r = z2;
        } else {
            uVar.q = F(g.b);
            uVar.r = true;
        }
        K(aVar, G, i);
        t a2 = G.d.a.a(((d) P2.a.e(uVar.a)).a);
        a.b g2 = aVar.g(1935763834);
        if (g2 != null) {
            A((t) P2.a.e(a2), g2.b, uVar);
        }
        a.b g3 = aVar.g(1935763823);
        if (g3 != null) {
            z(g3.b, uVar);
        }
        a.b g4 = aVar.g(1936027235);
        if (g4 != null) {
            D(g4.b, uVar);
        }
        B(aVar, a2 != null ? a2.b : null, uVar);
        int size = aVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            a.b bVar = (a.b) aVar.c.get(i2);
            if (bVar.a == 1970628964) {
                L(bVar.b, uVar, bArr);
            }
        }
    }

    public static Pair I(z zVar) {
        zVar.T(12);
        return Pair.create(Integer.valueOf(zVar.p()), new d(zVar.p() - 1, zVar.p(), zVar.p(), zVar.p()));
    }

    public static int J(b bVar, int i, int i2, z zVar, int i3) {
        boolean z;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        boolean z4;
        boolean z5;
        int i6;
        b bVar2 = bVar;
        zVar.T(8);
        int b2 = I3.a.b(zVar.p());
        s sVar = bVar2.d.a;
        u uVar = bVar2.b;
        d dVar = (d) K.i(uVar.a);
        uVar.h[i] = zVar.K();
        long[] jArr = uVar.g;
        long j = uVar.c;
        jArr[i] = j;
        if ((b2 & 1) != 0) {
            jArr[i] = j + zVar.p();
        }
        boolean z6 = (b2 & 4) != 0;
        int i7 = dVar.d;
        if (z6) {
            i7 = zVar.p();
        }
        boolean z7 = (b2 & 256) != 0;
        boolean z8 = (b2 & 512) != 0;
        boolean z9 = (b2 & 1024) != 0;
        boolean z10 = (b2 & 2048) != 0;
        long j2 = o(sVar) ? ((long[]) K.i(sVar.i))[0] : 0L;
        int[] iArr = uVar.i;
        long[] jArr2 = uVar.j;
        boolean[] zArr = uVar.k;
        int i8 = i7;
        boolean z11 = sVar.b == 2 && (i2 & 1) != 0;
        int i9 = i3 + uVar.h[i];
        boolean z12 = z11;
        long j3 = sVar.c;
        long j4 = uVar.q;
        int i10 = i3;
        while (i10 < i9) {
            int f = f(z7 ? zVar.p() : dVar.b);
            if (z8) {
                i4 = zVar.p();
                z = z7;
            } else {
                z = z7;
                i4 = dVar.c;
            }
            int f2 = f(i4);
            if (z9) {
                z2 = z6;
                i5 = zVar.p();
            } else if (i10 == 0 && z6) {
                z2 = z6;
                i5 = i8;
            } else {
                z2 = z6;
                i5 = dVar.d;
            }
            if (z10) {
                z3 = z10;
                z4 = z8;
                z5 = z9;
                i6 = zVar.p();
            } else {
                z3 = z10;
                z4 = z8;
                z5 = z9;
                i6 = 0;
            }
            long X0 = K.X0((i6 + j4) - j2, 1000000L, j3);
            jArr2[i10] = X0;
            if (!uVar.r) {
                jArr2[i10] = X0 + bVar2.d.h;
            }
            iArr[i10] = f2;
            zArr[i10] = ((i5 >> 16) & 1) == 0 && (!z12 || i10 == 0);
            j4 += f;
            i10++;
            bVar2 = bVar;
            z7 = z;
            z6 = z2;
            z10 = z3;
            z8 = z4;
            z9 = z5;
        }
        uVar.q = j4;
        return i9;
    }

    public static void K(a.a aVar, b bVar, int i) {
        List list = aVar.c;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            a.b bVar2 = (a.b) list.get(i4);
            if (bVar2.a == 1953658222) {
                z zVar = bVar2.b;
                zVar.T(12);
                int K2 = zVar.K();
                if (K2 > 0) {
                    i3 += K2;
                    i2++;
                }
            }
        }
        bVar.h = 0;
        bVar.g = 0;
        bVar.f = 0;
        bVar.b.e(i2, i3);
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            a.b bVar3 = (a.b) list.get(i7);
            if (bVar3.a == 1953658222) {
                i6 = J(bVar, i5, i, bVar3.b, i6);
                i5++;
            }
        }
    }

    public static void L(z zVar, u uVar, byte[] bArr) {
        zVar.T(8);
        zVar.l(bArr, 0, 16);
        if (Arrays.equals(bArr, L)) {
            C(zVar, 16, uVar);
        }
    }

    private void M(long j) {
        while (!this.n.isEmpty() && ((a.a) this.n.peek()).b == j) {
            r((a.a) this.n.pop());
        }
        h();
    }

    private boolean N(o3.q qVar) {
        if (this.u == 0) {
            if (!qVar.h(this.m.e(), 0, 8, true)) {
                return false;
            }
            this.u = 8;
            this.m.T(0);
            this.t = this.m.I();
            this.s = this.m.p();
        }
        long j = this.t;
        if (j == 1) {
            qVar.readFully(this.m.e(), 8, 8);
            this.u += 8;
            this.t = this.m.L();
        } else if (j == 0) {
            long a2 = qVar.a();
            if (a2 == -1 && !this.n.isEmpty()) {
                a2 = ((a.a) this.n.peek()).b;
            }
            if (a2 != -1) {
                this.t = (a2 - qVar.b()) + this.u;
            }
        }
        if (this.t < this.u) {
            throw M2.z.d("Atom size less than header length (unsupported).");
        }
        long b2 = qVar.b() - this.u;
        int i = this.s;
        if ((i == 1836019558 || i == 1835295092) && !this.J) {
            this.G.n(new J.b(this.z, b2));
            this.J = true;
        }
        if (this.s == 1836019558) {
            int size = this.e.size();
            for (int i2 = 0; i2 < size; i2++) {
                u uVar = ((b) this.e.valueAt(i2)).b;
                uVar.b = b2;
                uVar.d = b2;
                uVar.c = b2;
            }
        }
        int i3 = this.s;
        if (i3 == 1835295092) {
            this.B = null;
            this.w = b2 + this.t;
            this.r = 2;
            return true;
        }
        if (R(i3)) {
            long b3 = (qVar.b() + this.t) - 8;
            this.n.push(new a.a(this.s, b3));
            if (this.t == this.u) {
                M(b3);
            } else {
                h();
            }
        } else if (S(this.s)) {
            if (this.u != 8) {
                throw M2.z.d("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.t > 2147483647L) {
                throw M2.z.d("Leaf atom with length > 2147483647 (unsupported).");
            }
            z zVar = new z((int) this.t);
            System.arraycopy(this.m.e(), 0, zVar.e(), 0, 8);
            this.v = zVar;
            this.r = 1;
        } else {
            if (this.t > 2147483647L) {
                throw M2.z.d("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.v = null;
            this.r = 1;
        }
        return true;
    }

    private static boolean R(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    private static boolean S(int i) {
        return i == 1751411826 || i == 1835296868 || i == 1836476516 || i == 1936286840 || i == 1937011556 || i == 1937011827 || i == 1668576371 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1937011571 || i == 1952867444 || i == 1952868452 || i == 1953196132 || i == 1953654136 || i == 1953658222 || i == 1886614376 || i == 1935763834 || i == 1935763823 || i == 1936027235 || i == 1970628964 || i == 1935828848 || i == 1936158820 || i == 1701606260 || i == 1835362404 || i == 1701671783;
    }

    public static /* synthetic */ o3.p[] c() {
        return p();
    }

    public static int f(int i) {
        if (i >= 0) {
            return i;
        }
        throw M2.z.a("Unexpected negative value: " + i, null);
    }

    private void h() {
        this.r = 0;
        this.u = 0;
    }

    public static M2.m k(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            a.b bVar = (a.b) list.get(i);
            if (bVar.a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] e = bVar.b.e();
                UUID f = o.f(e);
                if (f == null) {
                    P2.o.h("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new m.b(f, "video/mp4", e));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new M2.m((List) arrayList);
    }

    public static b l(SparseArray sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            b bVar2 = (b) sparseArray.valueAt(i);
            if ((b.a(bVar2) || bVar2.f != bVar2.d.b) && (!b.a(bVar2) || bVar2.h != bVar2.b.e)) {
                long d = bVar2.d();
                if (d < j) {
                    bVar = bVar2;
                    j = d;
                }
            }
        }
        return bVar;
    }

    public static boolean o(s sVar) {
        long[] jArr;
        long[] jArr2 = sVar.h;
        if (jArr2 == null || jArr2.length != 1 || (jArr = sVar.i) == null) {
            return false;
        }
        long j = jArr2[0];
        return j == 0 || K.X0(j + jArr[0], 1000000L, sVar.d) >= sVar.e;
    }

    private static /* synthetic */ o3.p[] p() {
        return new o3.p[]{new h(s.a.a, 32)};
    }

    public static long x(z zVar) {
        zVar.T(8);
        return I3.a.c(zVar.p()) == 0 ? zVar.I() : zVar.L();
    }

    public static void y(a.a aVar, SparseArray sparseArray, boolean z, int i, byte[] bArr) {
        int size = aVar.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            a.a aVar2 = (a.a) aVar.d.get(i2);
            if (aVar2.a == 1953653094) {
                H(aVar2, sparseArray, z, i, bArr);
            }
        }
    }

    public static void z(z zVar, u uVar) {
        zVar.T(8);
        int p = zVar.p();
        if ((I3.a.b(p) & 1) == 1) {
            zVar.U(8);
        }
        int K2 = zVar.K();
        if (K2 == 1) {
            uVar.d += I3.a.c(p) == 0 ? zVar.I() : zVar.L();
        } else {
            throw M2.z.a("Unexpected saio entry count: " + K2, null);
        }
    }

    public final void O(o3.q qVar) {
        int i = ((int) this.t) - this.u;
        z zVar = this.v;
        if (zVar != null) {
            qVar.readFully(zVar.e(), 8, i);
            t(new a.b(this.s, zVar), qVar.b());
        } else {
            qVar.m(i);
        }
        M(qVar.b());
    }

    public final void P(o3.q qVar) {
        int size = this.e.size();
        long j = Long.MAX_VALUE;
        b bVar = null;
        for (int i = 0; i < size; i++) {
            u uVar = ((b) this.e.valueAt(i)).b;
            if (uVar.p) {
                long j2 = uVar.d;
                if (j2 < j) {
                    bVar = (b) this.e.valueAt(i);
                    j = j2;
                }
            }
        }
        if (bVar == null) {
            this.r = 3;
            return;
        }
        int b2 = (int) (j - qVar.b());
        if (b2 < 0) {
            throw M2.z.a("Offset to encryption data was negative.", null);
        }
        qVar.m(b2);
        bVar.b.b(qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean Q(o3.q qVar) {
        int c;
        b bVar = this.B;
        Throwable th = null;
        if (bVar == null) {
            bVar = l(this.e);
            if (bVar == null) {
                int b2 = (int) (this.w - qVar.b());
                if (b2 < 0) {
                    throw M2.z.a("Offset to end of mdat was negative.", null);
                }
                qVar.m(b2);
                h();
                return false;
            }
            int d = (int) (bVar.d() - qVar.b());
            if (d < 0) {
                P2.o.h("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                d = 0;
            }
            qVar.m(d);
            this.B = bVar;
        }
        int i = 4;
        int i2 = 1;
        if (this.r == 3) {
            int f = bVar.f();
            this.C = f;
            if (bVar.f < bVar.i) {
                qVar.m(f);
                bVar.m();
                if (!bVar.h()) {
                    this.B = null;
                }
                this.r = 3;
                return true;
            }
            if (bVar.d.a.g == 1) {
                this.C = f - 8;
                qVar.m(8);
            }
            if ("audio/ac4".equals(bVar.d.a.f.n)) {
                this.D = bVar.i(this.C, 7);
                o3.c.a(this.C, this.j);
                bVar.a.f(this.j, 7);
                this.D += 7;
            } else {
                this.D = bVar.i(this.C, 0);
            }
            this.C += this.D;
            this.r = 4;
            this.E = 0;
        }
        s sVar = bVar.d.a;
        O o = bVar.a;
        long e = bVar.e();
        E e2 = this.k;
        if (e2 != null) {
            e = e2.a(e);
        }
        long j = e;
        if (sVar.j == 0) {
            while (true) {
                int i3 = this.D;
                int i4 = this.C;
                if (i3 >= i4) {
                    break;
                }
                this.D += o.c(qVar, i4 - i3, false);
            }
        } else {
            byte[] e3 = this.g.e();
            e3[0] = 0;
            e3[1] = 0;
            e3[2] = 0;
            int i5 = sVar.j;
            int i6 = i5 + 1;
            int i7 = 4 - i5;
            while (this.D < this.C) {
                int i8 = this.E;
                if (i8 == 0) {
                    qVar.readFully(e3, i7, i6);
                    this.g.T(0);
                    int p = this.g.p();
                    if (p < i2) {
                        throw M2.z.a("Invalid NAL length", th);
                    }
                    this.E = p - 1;
                    this.f.T(0);
                    o.f(this.f, i);
                    o.f(this.g, i2);
                    this.F = (this.I.length <= 0 || !Q2.d.g(sVar.f.n, e3[i])) ? 0 : i2;
                    this.D += 5;
                    this.C += i7;
                } else {
                    if (this.F) {
                        this.h.P(i8);
                        qVar.readFully(this.h.e(), 0, this.E);
                        o.f(this.h, this.E);
                        c = this.E;
                        int r = Q2.d.r(this.h.e(), this.h.g());
                        this.h.T("video/hevc".equals(sVar.f.n) ? 1 : 0);
                        this.h.S(r);
                        o3.f.a(j, this.h, this.I);
                    } else {
                        c = o.c(qVar, i8, false);
                    }
                    this.D += c;
                    this.E -= c;
                    th = null;
                    i = 4;
                    i2 = 1;
                }
            }
        }
        int c2 = bVar.c();
        t g = bVar.g();
        o.a(j, c2, this.C, 0, g != null ? g.c : null);
        w(j);
        if (!bVar.h()) {
            this.B = null;
        }
        this.r = 3;
        return true;
    }

    public void a(long j, long j2) {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            ((b) this.e.valueAt(i)).k();
        }
        this.o.clear();
        this.x = 0;
        this.y = j2;
        this.n.clear();
        h();
    }

    public void b(o3.r rVar) {
        this.G = (this.b & 32) == 0 ? new L3.u(rVar, this.a) : rVar;
        h();
        n();
        s sVar = this.c;
        if (sVar != null) {
            this.e.put(0, new b(rVar.e(0, sVar.b), new v(this.c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new d(0, 0, 0, 0)));
            this.G.s();
        }
    }

    public boolean d(o3.q qVar) {
        N b2 = r.b(qVar);
        this.q = b2 != null ? t7.r.t(b2) : t7.r.s();
        return b2 == null;
    }

    public int e(o3.q qVar, I i) {
        while (true) {
            int i2 = this.r;
            if (i2 != 0) {
                if (i2 == 1) {
                    O(qVar);
                } else if (i2 == 2) {
                    P(qVar);
                } else if (Q(qVar)) {
                    return 0;
                }
            } else if (!N(qVar)) {
                return -1;
            }
        }
    }

    public final d i(SparseArray sparseArray, int i) {
        return sparseArray.size() == 1 ? (d) sparseArray.valueAt(0) : (d) P2.a.e((d) sparseArray.get(i));
    }

    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public t7.r j() {
        return this.q;
    }

    public final void n() {
        int i;
        O[] oArr = new O[2];
        this.H = oArr;
        O o = this.p;
        int i2 = 0;
        if (o != null) {
            oArr[0] = o;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.b & 4) != 0) {
            oArr[i] = this.G.e(100, 5);
            i3 = 101;
            i++;
        }
        O[] oArr2 = (O[]) K.P0(this.H, i);
        this.H = oArr2;
        for (O o2 : oArr2) {
            o2.b(M);
        }
        this.I = new O[this.d.size()];
        while (i2 < this.I.length) {
            O e = this.G.e(i3, 3);
            e.b((M2.q) this.d.get(i2));
            this.I[i2] = e;
            i2++;
            i3++;
        }
    }

    public final void r(a.a aVar) {
        int i = aVar.a;
        if (i == 1836019574) {
            v(aVar);
        } else if (i == 1836019558) {
            u(aVar);
        } else {
            if (this.n.isEmpty()) {
                return;
            }
            ((a.a) this.n.peek()).d(aVar);
        }
    }

    public final void s(z zVar) {
        long X0;
        String str;
        long X02;
        String str2;
        long I;
        long j;
        if (this.H.length == 0) {
            return;
        }
        zVar.T(8);
        int c = I3.a.c(zVar.p());
        if (c == 0) {
            String str3 = (String) P2.a.e(zVar.A());
            String str4 = (String) P2.a.e(zVar.A());
            long I2 = zVar.I();
            X0 = K.X0(zVar.I(), 1000000L, I2);
            long j2 = this.A;
            long j3 = j2 != -9223372036854775807L ? j2 + X0 : -9223372036854775807L;
            str = str3;
            X02 = K.X0(zVar.I(), 1000L, I2);
            str2 = str4;
            I = zVar.I();
            j = j3;
        } else {
            if (c != 1) {
                P2.o.h("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + c);
                return;
            }
            long I3 = zVar.I();
            j = K.X0(zVar.L(), 1000000L, I3);
            long X03 = K.X0(zVar.I(), 1000L, I3);
            long I4 = zVar.I();
            str = (String) P2.a.e(zVar.A());
            X02 = X03;
            I = I4;
            str2 = (String) P2.a.e(zVar.A());
            X0 = -9223372036854775807L;
        }
        byte[] bArr = new byte[zVar.a()];
        zVar.l(bArr, 0, zVar.a());
        z zVar2 = new z(this.l.a(new z3.a(str, str2, X02, I, bArr)));
        int a2 = zVar2.a();
        for (O o : this.H) {
            zVar2.T(0);
            o.f(zVar2, a2);
        }
        if (j == -9223372036854775807L) {
            this.o.addLast(new a(X0, true, a2));
            this.x += a2;
            return;
        }
        if (!this.o.isEmpty()) {
            this.o.addLast(new a(j, false, a2));
            this.x += a2;
            return;
        }
        E e = this.k;
        if (e != null && !e.g()) {
            this.o.addLast(new a(j, false, a2));
            this.x += a2;
            return;
        }
        E e2 = this.k;
        if (e2 != null) {
            j = e2.a(j);
        }
        for (O o2 : this.H) {
            o2.a(j, 1, a2, 0, null);
        }
    }

    public final void t(a.b bVar, long j) {
        if (!this.n.isEmpty()) {
            ((a.a) this.n.peek()).e(bVar);
            return;
        }
        int i = bVar.a;
        if (i != 1936286840) {
            if (i == 1701671783) {
                s(bVar.b);
            }
        } else {
            Pair E = E(bVar.b, j);
            this.A = ((Long) E.first).longValue();
            this.G.n((J) E.second);
            this.J = true;
        }
    }

    public final void u(a.a aVar) {
        y(aVar, this.e, this.c != null, this.b, this.i);
        M2.m k = k(aVar.c);
        if (k != null) {
            int size = this.e.size();
            for (int i = 0; i < size; i++) {
                ((b) this.e.valueAt(i)).n(k);
            }
        }
        if (this.y != -9223372036854775807L) {
            int size2 = this.e.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((b) this.e.valueAt(i2)).l(this.y);
            }
            this.y = -9223372036854775807L;
        }
    }

    public final void v(a.a aVar) {
        int i = 0;
        P2.a.g(this.c == null, "Unexpected moov box.");
        M2.m k = k(aVar.c);
        a.a aVar2 = (a.a) P2.a.e(aVar.f(1836475768));
        SparseArray sparseArray = new SparseArray();
        int size = aVar2.c.size();
        long j = -9223372036854775807L;
        for (int i2 = 0; i2 < size; i2++) {
            a.b bVar = (a.b) aVar2.c.get(i2);
            int i3 = bVar.a;
            if (i3 == 1953654136) {
                Pair I = I(bVar.b);
                sparseArray.put(((Integer) I.first).intValue(), (d) I.second);
            } else if (i3 == 1835362404) {
                j = x(bVar.b);
            }
        }
        List B = I3.b.B(aVar, new B(), j, k, (this.b & 16) != 0, false, new g(this));
        int size2 = B.size();
        if (this.e.size() != 0) {
            P2.a.f(this.e.size() == size2);
            while (i < size2) {
                v vVar = (v) B.get(i);
                s sVar = vVar.a;
                ((b) this.e.get(sVar.a)).j(vVar, i(sparseArray, sVar.a));
                i++;
            }
            return;
        }
        while (i < size2) {
            v vVar2 = (v) B.get(i);
            s sVar2 = vVar2.a;
            this.e.put(sVar2.a, new b(this.G.e(i, sVar2.b), vVar2, i(sparseArray, sVar2.a)));
            this.z = Math.max(this.z, sVar2.e);
            i++;
        }
        this.G.s();
    }

    public final void w(long j) {
        while (!this.o.isEmpty()) {
            a aVar = (a) this.o.removeFirst();
            this.x -= aVar.c;
            long j2 = aVar.a;
            if (aVar.b) {
                j2 += j;
            }
            E e = this.k;
            if (e != null) {
                j2 = e.a(j2);
            }
            for (O o : this.H) {
                o.a(j2, 1, aVar.c, this.x, null);
            }
        }
    }

    public h(s.a aVar, int i, E e, s sVar, List list, O o) {
        this.a = aVar;
        this.b = i;
        this.k = e;
        this.c = sVar;
        this.d = Collections.unmodifiableList(list);
        this.p = o;
        this.l = new z3.c();
        this.m = new z(16);
        this.f = new z(Q2.d.a);
        this.g = new z(5);
        this.h = new z();
        byte[] bArr = new byte[16];
        this.i = bArr;
        this.j = new z(bArr);
        this.n = new ArrayDeque();
        this.o = new ArrayDeque();
        this.e = new SparseArray();
        this.q = t7.r.s();
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.G = o3.r.V8;
        this.H = new O[0];
        this.I = new O[0];
    }

    public void release() {
    }

    public s q(s sVar) {
        return sVar;
    }
}
