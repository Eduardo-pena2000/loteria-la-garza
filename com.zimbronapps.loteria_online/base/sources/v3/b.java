package V3;

import M2.q;
import P2.K;
import P2.o;
import P2.z;
import android.util.Pair;
import o3.I;
import o3.O;
import o3.T;
import o3.p;
import o3.r;
import o3.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b implements p {
    public static final u h = new V3.a();
    public r a;
    public O b;
    public b e;
    public int c = 0;
    public long d = -1;
    public int f = -1;
    public long g = -1;

    public static final class a implements b {
        public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
        public final r a;
        public final O b;
        public final V3.c c;
        public final int d;
        public final byte[] e;
        public final z f;
        public final int g;
        public final q h;
        public int i;
        public long j;
        public int k;
        public long l;

        public a(r rVar, O o, V3.c cVar) {
            this.a = rVar;
            this.b = o;
            this.c = cVar;
            int max = Math.max(1, cVar.c / 10);
            this.g = max;
            z zVar = new z(cVar.g);
            zVar.y();
            int y = zVar.y();
            this.d = y;
            int i = cVar.b;
            int i2 = (((cVar.e - (i * 4)) * 8) / (cVar.f * i)) + 1;
            if (y == i2) {
                int k = K.k(max, y);
                this.e = new byte[cVar.e * k];
                this.f = new z(k * h(y, i));
                int i3 = ((cVar.c * cVar.e) * 8) / y;
                this.h = new q.b().o0("audio/raw").M(i3).j0(i3).f0(h(max, i)).N(cVar.b).p0(cVar.c).i0(2).K();
                return;
            }
            throw M2.z.a("Expected frames per block: " + i2 + "; got: " + y, null);
        }

        public static int h(int i, int i2) {
            return i * 2 * i2;
        }

        public void a(int i, long j) {
            this.a.n(new e(this.c, this.d, i, j));
            this.b.b(this.h);
        }

        public void b(long j) {
            this.i = 0;
            this.j = j;
            this.k = 0;
            this.l = 0L;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0035 -> B:3:0x001b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean c(o3.q r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.g
                int r1 = r6.k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.d
                int r0 = P2.K.k(r0, r1)
                V3.c r1 = r6.c
                int r1 = r1.e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.e
                int r5 = r6.i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.i
                int r4 = r4 + r3
                r6.i = r4
                goto L1e
            L3e:
                int r7 = r6.i
                V3.c r8 = r6.c
                int r8 = r8.e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.e
                P2.z r9 = r6.f
                r6.d(r8, r7, r9)
                int r8 = r6.i
                V3.c r9 = r6.c
                int r9 = r9.e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.i = r8
                P2.z r7 = r6.f
                int r7 = r7.g()
                o3.O r8 = r6.b
                P2.z r9 = r6.f
                r8.f(r9, r7)
                int r8 = r6.k
                int r8 = r8 + r7
                r6.k = r8
                int r7 = r6.f(r8)
                int r8 = r6.g
                if (r7 < r8) goto L75
                r6.i(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L82
                r6.i(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: V3.b.a.c(o3.q, long):boolean");
        }

        public final void d(byte[] bArr, int i, z zVar) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < this.c.b; i3++) {
                    e(bArr, i2, i3, zVar.e());
                }
            }
            int g = g(this.d * i);
            zVar.T(0);
            zVar.S(g);
        }

        public final void e(byte[] bArr, int i, int i2, byte[] bArr2) {
            V3.c cVar = this.c;
            int i3 = cVar.e;
            int i4 = cVar.b;
            int i5 = (i * i3) + (i2 * 4);
            int i6 = (i4 * 4) + i5;
            int i7 = (i3 / i4) - 4;
            int i8 = (short) (((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255));
            int min = Math.min(bArr[i5 + 2] & 255, 88);
            int i9 = n[min];
            int i10 = ((i * this.d * i4) + i2) * 2;
            bArr2[i10] = (byte) (i8 & 255);
            bArr2[i10 + 1] = (byte) (i8 >> 8);
            for (int i11 = 0; i11 < i7 * 2; i11++) {
                byte b = bArr[((i11 / 8) * i4 * 4) + i6 + ((i11 / 2) % 4)];
                int i12 = i11 % 2 == 0 ? b & 15 : (b & 255) >> 4;
                int i13 = ((((i12 & 7) * 2) + 1) * i9) >> 3;
                if ((i12 & 8) != 0) {
                    i13 = -i13;
                }
                i8 = K.p(i8 + i13, -32768, 32767);
                i10 += i4 * 2;
                bArr2[i10] = (byte) (i8 & 255);
                bArr2[i10 + 1] = (byte) (i8 >> 8);
                int i14 = min + m[i12];
                int[] iArr = n;
                min = K.p(i14, 0, iArr.length - 1);
                i9 = iArr[min];
            }
        }

        public final int f(int i) {
            return i / (this.c.b * 2);
        }

        public final int g(int i) {
            return h(i, this.c.b);
        }

        public final void i(int i) {
            long X0 = this.j + K.X0(this.l, 1000000L, this.c.c);
            int g = g(i);
            this.b.a(X0, 1, g, this.k - g, null);
            this.l += i;
            this.k -= g;
        }
    }

    public interface b {
        void a(int i, long j);

        void b(long j);

        boolean c(o3.q qVar, long j);
    }

    public static final class c implements b {
        public final r a;
        public final O b;
        public final V3.c c;
        public final q d;
        public final int e;
        public long f;
        public int g;
        public long h;

        public c(r rVar, O o, V3.c cVar, String str, int i) {
            this.a = rVar;
            this.b = o;
            this.c = cVar;
            int i2 = (cVar.b * cVar.f) / 8;
            if (cVar.e == i2) {
                int i3 = cVar.c;
                int i4 = i3 * i2 * 8;
                int max = Math.max(i2, (i3 * i2) / 10);
                this.e = max;
                this.d = new q.b().o0(str).M(i4).j0(i4).f0(max).N(cVar.b).p0(cVar.c).i0(i).K();
                return;
            }
            throw M2.z.a("Expected block size: " + i2 + "; got: " + cVar.e, null);
        }

        public void a(int i, long j) {
            this.a.n(new e(this.c, 1, i, j));
            this.b.b(this.d);
        }

        public void b(long j) {
            this.f = j;
            this.g = 0;
            this.h = 0L;
        }

        public boolean c(o3.q qVar, long j) {
            int i;
            int i2;
            long j2 = j;
            while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
                int c = this.b.c(qVar, (int) Math.min(i2 - i, j2), true);
                if (c == -1) {
                    j2 = 0;
                } else {
                    this.g += c;
                    j2 -= c;
                }
            }
            int i3 = this.c.e;
            int i4 = this.g / i3;
            if (i4 > 0) {
                long X0 = this.f + K.X0(this.h, 1000000L, r1.c);
                int i5 = i4 * i3;
                int i6 = this.g - i5;
                this.b.a(X0, 1, i5, i6, null);
                this.h += i4;
                this.g = i6;
            }
            return j2 <= 0;
        }
    }

    public static /* synthetic */ p[] c() {
        return h();
    }

    private void f() {
        P2.a.h(this.b);
        K.i(this.a);
    }

    private static /* synthetic */ p[] h() {
        return new p[]{new b()};
    }

    public void a(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        b bVar = this.e;
        if (bVar != null) {
            bVar.b(j2);
        }
    }

    public void b(r rVar) {
        this.a = rVar;
        this.b = rVar.e(0, 1);
        rVar.s();
    }

    public boolean d(o3.q qVar) {
        return d.a(qVar);
    }

    public int e(o3.q qVar, I i) {
        f();
        int i2 = this.c;
        if (i2 == 0) {
            i(qVar);
            return 0;
        }
        if (i2 == 1) {
            l(qVar);
            return 0;
        }
        if (i2 == 2) {
            k(qVar);
            return 0;
        }
        if (i2 == 3) {
            n(qVar);
            return 0;
        }
        if (i2 == 4) {
            return m(qVar);
        }
        throw new IllegalStateException();
    }

    public final void i(o3.q qVar) {
        P2.a.f(qVar.b() == 0);
        int i = this.f;
        if (i != -1) {
            qVar.m(i);
            this.c = 4;
        } else {
            if (!d.a(qVar)) {
                throw M2.z.a("Unsupported or unrecognized wav file type.", null);
            }
            qVar.m((int) (qVar.i() - qVar.b()));
            this.c = 1;
        }
    }

    public final void k(o3.q qVar) {
        V3.c b2 = d.b(qVar);
        int i = b2.a;
        if (i == 17) {
            this.e = new a(this.a, this.b, b2);
        } else if (i == 6) {
            this.e = new c(this.a, this.b, b2, "audio/g711-alaw", -1);
        } else if (i == 7) {
            this.e = new c(this.a, this.b, b2, "audio/g711-mlaw", -1);
        } else {
            int a2 = T.a(i, b2.f);
            if (a2 == 0) {
                throw M2.z.d("Unsupported WAV format type: " + b2.a);
            }
            this.e = new c(this.a, this.b, b2, "audio/raw", a2);
        }
        this.c = 3;
    }

    public final void l(o3.q qVar) {
        this.d = d.c(qVar);
        this.c = 2;
    }

    public final int m(o3.q qVar) {
        P2.a.f(this.g != -1);
        return ((b) P2.a.e(this.e)).c(qVar, this.g - qVar.b()) ? -1 : 0;
    }

    public final void n(o3.q qVar) {
        Pair e = d.e(qVar);
        this.f = ((Long) e.first).intValue();
        long longValue = ((Long) e.second).longValue();
        long j = this.d;
        if (j != -1 && longValue == 4294967295L) {
            longValue = j;
        }
        this.g = this.f + longValue;
        long a2 = qVar.a();
        if (a2 != -1 && this.g > a2) {
            o.h("WavExtractor", "Data exceeds input length: " + this.g + ", " + a2);
            this.g = a2;
        }
        ((b) P2.a.e(this.e)).a(this.f, this.g);
        this.c = 4;
    }

    public void release() {
    }
}
