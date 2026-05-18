package androidx.datastore.preferences.protobuf;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class g {
    public static volatile int f = 100;
    public int a;
    public int b;
    public int c;
    public h d;
    public boolean e;

    public static final class b extends g {
        public final byte[] g;
        public final boolean h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public boolean n;
        public int o;

        public /* synthetic */ b(byte[] bArr, int i, int i2, boolean z, a aVar) {
            this(bArr, i, i2, z);
        }

        public String A() {
            int L = L();
            if (L > 0) {
                int i = this.i;
                int i2 = this.k;
                if (L <= i - i2) {
                    String str = new String(this.g, i2, L, u.b);
                    this.k += L;
                    return str;
                }
            }
            if (L == 0) {
                return "";
            }
            if (L < 0) {
                throw v.g();
            }
            throw v.n();
        }

        public String B() {
            int L = L();
            if (L > 0) {
                int i = this.i;
                int i2 = this.k;
                if (L <= i - i2) {
                    String a = l0.a(this.g, i2, L);
                    this.k += L;
                    return a;
                }
            }
            if (L == 0) {
                return "";
            }
            if (L <= 0) {
                throw v.g();
            }
            throw v.n();
        }

        public int C() {
            if (f()) {
                this.m = 0;
                return 0;
            }
            int L = L();
            this.m = L;
            if (m0.a(L) != 0) {
                return this.m;
            }
            throw v.c();
        }

        public int D() {
            return L();
        }

        public long E() {
            return M();
        }

        public boolean F(int i) {
            int b = m0.b(i);
            if (b == 0) {
                Q();
                return true;
            }
            if (b == 1) {
                P(8);
                return true;
            }
            if (b == 2) {
                P(L());
                return true;
            }
            if (b == 3) {
                G();
                a(m0.c(m0.a(i), 4));
                return true;
            }
            if (b == 4) {
                return false;
            }
            if (b != 5) {
                throw v.e();
            }
            P(4);
            return true;
        }

        public byte H() {
            int i = this.k;
            if (i == this.i) {
                throw v.n();
            }
            byte[] bArr = this.g;
            this.k = i + 1;
            return bArr[i];
        }

        public byte[] I(int i) {
            if (i > 0) {
                int i2 = this.i;
                int i3 = this.k;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.k = i4;
                    return Arrays.copyOfRange(this.g, i3, i4);
                }
            }
            if (i > 0) {
                throw v.n();
            }
            if (i == 0) {
                return u.d;
            }
            throw v.g();
        }

        public int J() {
            int i = this.k;
            if (this.i - i < 4) {
                throw v.n();
            }
            byte[] bArr = this.g;
            this.k = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public long K() {
            int i = this.k;
            if (this.i - i < 8) {
                throw v.n();
            }
            byte[] bArr = this.g;
            this.k = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        public int L() {
            int i;
            int i2 = this.k;
            int i3 = this.i;
            if (i3 != i2) {
                byte[] bArr = this.g;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.k = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.k = i5;
                    return i;
                }
            }
            return (int) N();
        }

        public long M() {
            long j;
            long j2;
            long j3;
            int i = this.k;
            int i2 = this.i;
            if (i2 != i) {
                byte[] bArr = this.g;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.k = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                long j4 = (-2080896) ^ i9;
                                i4 = i8;
                                j = j4;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (bArr[i8] << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i10 = i + 6;
                                    long j7 = j6 ^ (bArr[i4] << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (bArr[i10] << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i10 = i + 8;
                                            j7 = j6 ^ (bArr[i4] << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i11 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i11;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j = j7 ^ j2;
                                    i4 = i10;
                                }
                                j = j6 ^ j3;
                            }
                        }
                    }
                    this.k = i4;
                    return j;
                }
            }
            return N();
        }

        public long N() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((H() & 128) == 0) {
                    return j;
                }
            }
            throw v.f();
        }

        public final void O() {
            int i = this.i + this.j;
            this.i = i;
            int i2 = i - this.l;
            int i3 = this.o;
            if (i2 <= i3) {
                this.j = 0;
                return;
            }
            int i4 = i2 - i3;
            this.j = i4;
            this.i = i - i4;
        }

        public void P(int i) {
            if (i >= 0) {
                int i2 = this.i;
                int i3 = this.k;
                if (i <= i2 - i3) {
                    this.k = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw v.n();
            }
            throw v.g();
        }

        public final void Q() {
            if (this.i - this.k >= 10) {
                R();
            } else {
                S();
            }
        }

        public final void R() {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.g;
                int i2 = this.k;
                this.k = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw v.f();
        }

        public final void S() {
            for (int i = 0; i < 10; i++) {
                if (H() >= 0) {
                    return;
                }
            }
            throw v.f();
        }

        public void a(int i) {
            if (this.m != i) {
                throw v.b();
            }
        }

        public int e() {
            return this.k - this.l;
        }

        public boolean f() {
            return this.k == this.i;
        }

        public void l(int i) {
            this.o = i;
            O();
        }

        public int m(int i) {
            if (i < 0) {
                throw v.g();
            }
            int e = i + e();
            if (e < 0) {
                throw v.h();
            }
            int i2 = this.o;
            if (e > i2) {
                throw v.n();
            }
            this.o = e;
            O();
            return i2;
        }

        public boolean n() {
            return M() != 0;
        }

        public f o() {
            int L = L();
            if (L > 0) {
                int i = this.i;
                int i2 = this.k;
                if (L <= i - i2) {
                    f t = (this.h && this.n) ? f.t(this.g, i2, L) : f.g(this.g, i2, L);
                    this.k += L;
                    return t;
                }
            }
            return L == 0 ? f.b : f.s(I(L));
        }

        public double p() {
            return Double.longBitsToDouble(K());
        }

        public int q() {
            return L();
        }

        public int r() {
            return J();
        }

        public long s() {
            return K();
        }

        public float t() {
            return Float.intBitsToFloat(J());
        }

        public int u() {
            return L();
        }

        public long v() {
            return M();
        }

        public int w() {
            return J();
        }

        public long x() {
            return K();
        }

        public int y() {
            return g.c(L());
        }

        public long z() {
            return g.d(M());
        }

        public b(byte[] bArr, int i, int i2, boolean z) {
            super(null);
            this.o = Integer.MAX_VALUE;
            this.g = bArr;
            this.i = i2 + i;
            this.k = i;
            this.l = i;
            this.h = z;
        }
    }

    public static final class c extends g {
        public final InputStream g;
        public final byte[] h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;

        public /* synthetic */ c(InputStream inputStream, int i, a aVar) {
            this(inputStream, i);
        }

        public static int H(InputStream inputStream) {
            try {
                return inputStream.available();
            } catch (v e) {
                e.j();
                throw e;
            }
        }

        public static int I(InputStream inputStream, byte[] bArr, int i, int i2) {
            try {
                return inputStream.read(bArr, i, i2);
            } catch (v e) {
                e.j();
                throw e;
            }
        }

        private void T() {
            int i = this.i + this.j;
            this.i = i;
            int i2 = this.m + i;
            int i3 = this.n;
            if (i2 <= i3) {
                this.j = 0;
                return;
            }
            int i4 = i2 - i3;
            this.j = i4;
            this.i = i - i4;
        }

        public static long V(InputStream inputStream, long j) {
            try {
                return inputStream.skip(j);
            } catch (v e) {
                e.j();
                throw e;
            }
        }

        private void Y() {
            if (this.i - this.k >= 10) {
                Z();
            } else {
                a0();
            }
        }

        private void Z() {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.h;
                int i2 = this.k;
                this.k = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw v.f();
        }

        private void a0() {
            for (int i = 0; i < 10; i++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw v.f();
        }

        public String A() {
            int Q = Q();
            if (Q > 0) {
                int i = this.i;
                int i2 = this.k;
                if (Q <= i - i2) {
                    String str = new String(this.h, i2, Q, u.b);
                    this.k += Q;
                    return str;
                }
            }
            if (Q == 0) {
                return "";
            }
            if (Q < 0) {
                throw v.g();
            }
            if (Q > this.i) {
                return new String(L(Q, false), u.b);
            }
            U(Q);
            String str2 = new String(this.h, this.k, Q, u.b);
            this.k += Q;
            return str2;
        }

        public String B() {
            byte[] L;
            int Q = Q();
            int i = this.k;
            int i2 = this.i;
            if (Q <= i2 - i && Q > 0) {
                L = this.h;
                this.k = i + Q;
            } else {
                if (Q == 0) {
                    return "";
                }
                if (Q < 0) {
                    throw v.g();
                }
                i = 0;
                if (Q <= i2) {
                    U(Q);
                    L = this.h;
                    this.k = Q;
                } else {
                    L = L(Q, false);
                }
            }
            return l0.a(L, i, Q);
        }

        public int C() {
            if (f()) {
                this.l = 0;
                return 0;
            }
            int Q = Q();
            this.l = Q;
            if (m0.a(Q) != 0) {
                return this.l;
            }
            throw v.c();
        }

        public int D() {
            return Q();
        }

        public long E() {
            return R();
        }

        public boolean F(int i) {
            int b = m0.b(i);
            if (b == 0) {
                Y();
                return true;
            }
            if (b == 1) {
                W(8);
                return true;
            }
            if (b == 2) {
                W(Q());
                return true;
            }
            if (b == 3) {
                G();
                a(m0.c(m0.a(i), 4));
                return true;
            }
            if (b == 4) {
                return false;
            }
            if (b != 5) {
                throw v.e();
            }
            W(4);
            return true;
        }

        public final f J(int i) {
            byte[] M = M(i);
            if (M != null) {
                return f.f(M);
            }
            int i2 = this.k;
            int i3 = this.i;
            int i4 = i3 - i2;
            this.m += i3;
            this.k = 0;
            this.i = 0;
            List<byte[]> N = N(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.h, i2, bArr, 0, i4);
            for (byte[] bArr2 : N) {
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return f.s(bArr);
        }

        public byte K() {
            if (this.k == this.i) {
                U(1);
            }
            byte[] bArr = this.h;
            int i = this.k;
            this.k = i + 1;
            return bArr[i];
        }

        public final byte[] L(int i, boolean z) {
            byte[] M = M(i);
            if (M != null) {
                return z ? (byte[]) M.clone() : M;
            }
            int i2 = this.k;
            int i3 = this.i;
            int i4 = i3 - i2;
            this.m += i3;
            this.k = 0;
            this.i = 0;
            List<byte[]> N = N(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.h, i2, bArr, 0, i4);
            for (byte[] bArr2 : N) {
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] M(int i) {
            if (i == 0) {
                return u.d;
            }
            if (i < 0) {
                throw v.g();
            }
            int i2 = this.m;
            int i3 = this.k;
            int i4 = i2 + i3 + i;
            if (i4 - this.c > 0) {
                throw v.l();
            }
            int i5 = this.n;
            if (i4 > i5) {
                W((i5 - i2) - i3);
                throw v.n();
            }
            int i6 = this.i - i3;
            int i7 = i - i6;
            if (i7 >= 4096 && i7 > H(this.g)) {
                return null;
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.h, this.k, bArr, 0, i6);
            this.m += this.i;
            this.k = 0;
            this.i = 0;
            while (i6 < i) {
                int I = I(this.g, bArr, i6, i - i6);
                if (I == -1) {
                    throw v.n();
                }
                this.m += I;
                i6 += I;
            }
            return bArr;
        }

        public final List N(int i) {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.g.read(bArr, i2, min - i2);
                    if (read == -1) {
                        throw v.n();
                    }
                    this.m += read;
                    i2 += read;
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public int O() {
            int i = this.k;
            if (this.i - i < 4) {
                U(4);
                i = this.k;
            }
            byte[] bArr = this.h;
            this.k = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public long P() {
            int i = this.k;
            if (this.i - i < 8) {
                U(8);
                i = this.k;
            }
            byte[] bArr = this.h;
            this.k = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        public int Q() {
            int i;
            int i2 = this.k;
            int i3 = this.i;
            if (i3 != i2) {
                byte[] bArr = this.h;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.k = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.k = i5;
                    return i;
                }
            }
            return (int) S();
        }

        public long R() {
            long j;
            long j2;
            long j3;
            int i = this.k;
            int i2 = this.i;
            if (i2 != i) {
                byte[] bArr = this.h;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.k = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                long j4 = (-2080896) ^ i9;
                                i4 = i8;
                                j = j4;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (bArr[i8] << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i10 = i + 6;
                                    long j7 = j6 ^ (bArr[i4] << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (bArr[i10] << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i10 = i + 8;
                                            j7 = j6 ^ (bArr[i4] << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i11 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i11;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j = j7 ^ j2;
                                    i4 = i10;
                                }
                                j = j6 ^ j3;
                            }
                        }
                    }
                    this.k = i4;
                    return j;
                }
            }
            return S();
        }

        public long S() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((K() & 128) == 0) {
                    return j;
                }
            }
            throw v.f();
        }

        public final void U(int i) {
            if (b0(i)) {
                return;
            }
            if (i <= (this.c - this.m) - this.k) {
                throw v.n();
            }
            throw v.l();
        }

        public void W(int i) {
            int i2 = this.i;
            int i3 = this.k;
            if (i > i2 - i3 || i < 0) {
                X(i);
            } else {
                this.k = i3 + i;
            }
        }

        public final void X(int i) {
            if (i < 0) {
                throw v.g();
            }
            int i2 = this.m;
            int i3 = this.k;
            int i4 = i2 + i3 + i;
            int i5 = this.n;
            if (i4 > i5) {
                W((i5 - i2) - i3);
                throw v.n();
            }
            this.m = i2 + i3;
            int i6 = this.i - i3;
            this.i = 0;
            this.k = 0;
            while (i6 < i) {
                try {
                    long j = i - i6;
                    long V = V(this.g, j);
                    if (V < 0 || V > j) {
                        throw new IllegalStateException(this.g.getClass() + "#skip returned invalid result: " + V + "\nThe InputStream implementation is buggy.");
                    }
                    if (V == 0) {
                        break;
                    } else {
                        i6 += (int) V;
                    }
                } finally {
                    this.m += i6;
                    T();
                }
            }
            if (i6 >= i) {
                return;
            }
            int i7 = this.i;
            int i8 = i7 - this.k;
            this.k = i7;
            U(1);
            while (true) {
                int i9 = i - i8;
                int i10 = this.i;
                if (i9 <= i10) {
                    this.k = i9;
                    return;
                } else {
                    i8 += i10;
                    this.k = i10;
                    U(1);
                }
            }
        }

        public void a(int i) {
            if (this.l != i) {
                throw v.b();
            }
        }

        public final boolean b0(int i) {
            int i2 = this.k;
            int i3 = i2 + i;
            int i4 = this.i;
            if (i3 <= i4) {
                throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
            }
            int i5 = this.c;
            int i6 = this.m;
            if (i > (i5 - i6) - i2 || i6 + i2 + i > this.n) {
                return false;
            }
            if (i2 > 0) {
                if (i4 > i2) {
                    byte[] bArr = this.h;
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.m += i2;
                this.i -= i2;
                this.k = 0;
            }
            InputStream inputStream = this.g;
            byte[] bArr2 = this.h;
            int i7 = this.i;
            int I = I(inputStream, bArr2, i7, Math.min(bArr2.length - i7, (this.c - this.m) - i7));
            if (I == 0 || I < -1 || I > this.h.length) {
                throw new IllegalStateException(this.g.getClass() + "#read(byte[]) returned invalid result: " + I + "\nThe InputStream implementation is buggy.");
            }
            if (I <= 0) {
                return false;
            }
            this.i += I;
            T();
            if (this.i >= i) {
                return true;
            }
            return b0(i);
        }

        public int e() {
            return this.m + this.k;
        }

        public boolean f() {
            return this.k == this.i && !b0(1);
        }

        public void l(int i) {
            this.n = i;
            T();
        }

        public int m(int i) {
            if (i < 0) {
                throw v.g();
            }
            int i2 = i + this.m + this.k;
            if (i2 < 0) {
                throw v.h();
            }
            int i3 = this.n;
            if (i2 > i3) {
                throw v.n();
            }
            this.n = i2;
            T();
            return i3;
        }

        public boolean n() {
            return R() != 0;
        }

        public f o() {
            int Q = Q();
            int i = this.i;
            int i2 = this.k;
            if (Q <= i - i2 && Q > 0) {
                f g = f.g(this.h, i2, Q);
                this.k += Q;
                return g;
            }
            if (Q == 0) {
                return f.b;
            }
            if (Q >= 0) {
                return J(Q);
            }
            throw v.g();
        }

        public double p() {
            return Double.longBitsToDouble(P());
        }

        public int q() {
            return Q();
        }

        public int r() {
            return O();
        }

        public long s() {
            return P();
        }

        public float t() {
            return Float.intBitsToFloat(O());
        }

        public int u() {
            return Q();
        }

        public long v() {
            return R();
        }

        public int w() {
            return O();
        }

        public long x() {
            return P();
        }

        public int y() {
            return g.c(Q());
        }

        public long z() {
            return g.d(R());
        }

        public c(InputStream inputStream, int i) {
            super(null);
            this.n = Integer.MAX_VALUE;
            u.b(inputStream, "input");
            this.g = inputStream;
            this.h = new byte[i];
            this.i = 0;
            this.k = 0;
            this.m = 0;
        }
    }

    public /* synthetic */ g(a aVar) {
        this();
    }

    public static int c(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long d(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static g g(InputStream inputStream) {
        return h(inputStream, 4096);
    }

    public static g h(InputStream inputStream, int i) {
        if (i > 0) {
            return inputStream == null ? i(u.d) : new c(inputStream, i, null);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static g i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static g j(byte[] bArr, int i, int i2) {
        return k(bArr, i, i2, false);
    }

    public static g k(byte[] bArr, int i, int i2, boolean z) {
        b bVar = new b(bArr, i, i2, z, null);
        try {
            bVar.m(i2);
            return bVar;
        } catch (v e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract String A();

    public abstract String B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public abstract boolean F(int i);

    public void G() {
        int C;
        do {
            C = C();
            if (C == 0) {
                return;
            }
            b();
            this.a++;
            this.a--;
        } while (F(C));
    }

    public abstract void a(int i);

    public void b() {
        if (this.a >= this.b) {
            throw v.i();
        }
    }

    public abstract int e();

    public abstract boolean f();

    public abstract void l(int i);

    public abstract int m(int i);

    public abstract boolean n();

    public abstract f o();

    public abstract double p();

    public abstract int q();

    public abstract int r();

    public abstract long s();

    public abstract float t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();

    public g() {
        this.b = f;
        this.c = Integer.MAX_VALUE;
        this.e = false;
    }
}
