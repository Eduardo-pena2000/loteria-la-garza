package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.l0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class i extends e {
    public static final Logger c = Logger.getLogger(i.class.getName());
    public static final boolean d = k0.B();
    public j a;
    public boolean b;

    public static abstract class b extends i {
        public final byte[] e;
        public final int f;
        public int g;
        public int h;

        public b(int i) {
            super(null);
            if (i < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i, 20)];
            this.e = bArr;
            this.f = bArr.length;
        }

        public final void R0(byte b) {
            byte[] bArr = this.e;
            int i = this.g;
            this.g = i + 1;
            bArr[i] = b;
            this.h++;
        }

        public final void S0(int i) {
            byte[] bArr = this.e;
            int i2 = this.g;
            int i3 = i2 + 1;
            this.g = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.g = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.g = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.g = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
            this.h += 4;
        }

        public final void T0(long j) {
            byte[] bArr = this.e;
            int i = this.g;
            int i2 = i + 1;
            this.g = i2;
            bArr[i] = (byte) (j & 255);
            int i3 = i + 2;
            this.g = i3;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i + 3;
            this.g = i4;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i + 4;
            this.g = i5;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i + 5;
            this.g = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.g = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.g = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.g = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            this.h += 8;
        }

        public final void U0(int i) {
            if (i >= 0) {
                W0(i);
            } else {
                X0(i);
            }
        }

        public final void V0(int i, int i2) {
            W0(m0.c(i, i2));
        }

        public final void W0(int i) {
            if (!i.b()) {
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    bArr[i2] = (byte) ((i | 128) & 255);
                    this.h++;
                    i >>>= 7;
                }
                byte[] bArr2 = this.e;
                int i3 = this.g;
                this.g = i3 + 1;
                bArr2[i3] = (byte) i;
                this.h++;
                return;
            }
            long j = this.g;
            while ((i & (-128)) != 0) {
                byte[] bArr3 = this.e;
                int i4 = this.g;
                this.g = i4 + 1;
                k0.H(bArr3, i4, (byte) ((i | 128) & 255));
                i >>>= 7;
            }
            byte[] bArr4 = this.e;
            int i5 = this.g;
            this.g = i5 + 1;
            k0.H(bArr4, i5, (byte) i);
            this.h += (int) (this.g - j);
        }

        public final void X0(long j) {
            if (!i.b()) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    bArr[i] = (byte) ((((int) j) | 128) & 255);
                    this.h++;
                    j >>>= 7;
                }
                byte[] bArr2 = this.e;
                int i2 = this.g;
                this.g = i2 + 1;
                bArr2[i2] = (byte) j;
                this.h++;
                return;
            }
            long j2 = this.g;
            while ((j & (-128)) != 0) {
                byte[] bArr3 = this.e;
                int i3 = this.g;
                this.g = i3 + 1;
                k0.H(bArr3, i3, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
            byte[] bArr4 = this.e;
            int i4 = this.g;
            this.g = i4 + 1;
            k0.H(bArr4, i4, (byte) j);
            this.h += (int) (this.g - j2);
        }
    }

    public static class c extends IOException {
        public c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    public static final class d extends b {
        public final OutputStream i;

        public d(OutputStream outputStream, int i) {
            super(i);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.i = outputStream;
        }

        public void A0(int i, K k) {
            M0(1, 3);
            N0(2, i);
            b1(3, k);
            M0(1, 4);
        }

        public void B0(int i, f fVar) {
            M0(1, 3);
            N0(2, i);
            e0(3, fVar);
            M0(1, 4);
        }

        public void K0(int i, String str) {
            M0(i, 2);
            L0(str);
        }

        public void L0(String str) {
            int c;
            try {
                int length = str.length() * 3;
                int Q = i.Q(length);
                int i = Q + length;
                int i2 = this.f;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int b = l0.b(str, bArr, 0, length);
                    O0(b);
                    a(bArr, 0, b);
                    return;
                }
                if (i > i2 - this.g) {
                    Y0();
                }
                int Q2 = i.Q(str.length());
                int i3 = this.g;
                try {
                    if (Q2 == Q) {
                        int i4 = i3 + Q2;
                        this.g = i4;
                        int b2 = l0.b(str, this.e, i4, this.f - i4);
                        this.g = i3;
                        c = (b2 - i3) - Q2;
                        W0(c);
                        this.g = b2;
                    } else {
                        c = l0.c(str);
                        W0(c);
                        this.g = l0.b(str, this.e, this.g, c);
                    }
                    this.h += c;
                } catch (l0.d e) {
                    this.h -= this.g - i3;
                    this.g = i3;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new c(e2);
                }
            } catch (l0.d e3) {
                W(str, e3);
            }
        }

        public void M0(int i, int i2) {
            O0(m0.c(i, i2));
        }

        public void N0(int i, int i2) {
            Z0(20);
            V0(i, 0);
            W0(i2);
        }

        public void O0(int i) {
            Z0(5);
            W0(i);
        }

        public void P0(int i, long j) {
            Z0(20);
            V0(i, 0);
            X0(j);
        }

        public void Q0(long j) {
            Z0(10);
            X0(j);
        }

        public void V() {
            if (this.g > 0) {
                Y0();
            }
        }

        public final void Y0() {
            this.i.write(this.e, 0, this.g);
            this.g = 0;
        }

        public void Z(byte b) {
            if (this.g == this.f) {
                Y0();
            }
            R0(b);
        }

        public final void Z0(int i) {
            if (this.f - this.g < i) {
                Y0();
            }
        }

        public void a(byte[] bArr, int i, int i2) {
            a1(bArr, i, i2);
        }

        public void a0(int i, boolean z) {
            Z0(11);
            V0(i, 0);
            R0(z ? (byte) 1 : (byte) 0);
        }

        public void a1(byte[] bArr, int i, int i2) {
            int i3 = this.f;
            int i4 = this.g;
            if (i3 - i4 >= i2) {
                System.arraycopy(bArr, i, this.e, i4, i2);
                this.g += i2;
                this.h += i2;
                return;
            }
            int i5 = i3 - i4;
            System.arraycopy(bArr, i, this.e, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.g = this.f;
            this.h += i5;
            Y0();
            if (i7 <= this.f) {
                System.arraycopy(bArr, i6, this.e, 0, i7);
                this.g = i7;
            } else {
                this.i.write(bArr, i6, i7);
            }
            this.h += i7;
        }

        public void b1(int i, K k) {
            M0(i, 2);
            z0(k);
        }

        public void c1(K k, a0 a0Var) {
            O0(((androidx.datastore.preferences.protobuf.a) k).c(a0Var));
            a0Var.f(k, this.a);
        }

        public void d0(byte[] bArr, int i, int i2) {
            O0(i2);
            a1(bArr, i, i2);
        }

        public void e0(int i, f fVar) {
            M0(i, 2);
            f0(fVar);
        }

        public void f0(f fVar) {
            O0(fVar.size());
            fVar.u(this);
        }

        public void k0(int i, int i2) {
            Z0(14);
            V0(i, 5);
            S0(i2);
        }

        public void l0(int i) {
            Z0(4);
            S0(i);
        }

        public void m0(int i, long j) {
            Z0(18);
            V0(i, 1);
            T0(j);
        }

        public void n0(long j) {
            Z0(8);
            T0(j);
        }

        public void u0(int i, int i2) {
            Z0(20);
            V0(i, 0);
            U0(i2);
        }

        public void v0(int i) {
            if (i >= 0) {
                O0(i);
            } else {
                Q0(i);
            }
        }

        public void y0(int i, K k, a0 a0Var) {
            M0(i, 2);
            c1(k, a0Var);
        }

        public void z0(K k) {
            O0(k.getSerializedSize());
            k.a(this);
        }
    }

    public /* synthetic */ i(a aVar) {
        this();
    }

    public static int A(K k) {
        return y(k.getSerializedSize());
    }

    public static int B(K k, a0 a0Var) {
        return y(((androidx.datastore.preferences.protobuf.a) k).c(a0Var));
    }

    public static int C(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int D(int i, f fVar) {
        return (O(1) * 2) + P(2, i) + f(3, fVar);
    }

    public static int E(int i, int i2) {
        return O(i) + F(i2);
    }

    public static int F(int i) {
        return 4;
    }

    public static int G(int i, long j) {
        return O(i) + H(j);
    }

    public static int H(long j) {
        return 8;
    }

    public static int I(int i, int i2) {
        return O(i) + J(i2);
    }

    public static int J(int i) {
        return Q(T(i));
    }

    public static int K(int i, long j) {
        return O(i) + L(j);
    }

    public static int L(long j) {
        return S(U(j));
    }

    public static int M(int i, String str) {
        return O(i) + N(str);
    }

    public static int N(String str) {
        int length;
        try {
            length = l0.c(str);
        } catch (l0.d unused) {
            length = str.getBytes(u.b).length;
        }
        return y(length);
    }

    public static int O(int i) {
        return Q(m0.c(i, 0));
    }

    public static int P(int i, int i2) {
        return O(i) + Q(i2);
    }

    public static int Q(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int R(int i, long j) {
        return O(i) + S(j);
    }

    public static int S(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int T(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long U(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static i Y(OutputStream outputStream, int i) {
        return new d(outputStream, i);
    }

    public static /* synthetic */ boolean b() {
        return d;
    }

    public static int c(int i, boolean z) {
        return O(i) + d(z);
    }

    public static int d(boolean z) {
        return 1;
    }

    public static int e(byte[] bArr) {
        return y(bArr.length);
    }

    public static int f(int i, f fVar) {
        return O(i) + g(fVar);
    }

    public static int g(f fVar) {
        return y(fVar.size());
    }

    public static int h(int i, double d2) {
        return O(i) + i(d2);
    }

    public static int i(double d2) {
        return 8;
    }

    public static int j(int i, int i2) {
        return O(i) + k(i2);
    }

    public static int k(int i) {
        return v(i);
    }

    public static int l(int i, int i2) {
        return O(i) + m(i2);
    }

    public static int m(int i) {
        return 4;
    }

    public static int n(int i, long j) {
        return O(i) + o(j);
    }

    public static int o(long j) {
        return 8;
    }

    public static int p(int i, float f) {
        return O(i) + q(f);
    }

    public static int q(float f) {
        return 4;
    }

    public static int r(int i, K k, a0 a0Var) {
        return (O(i) * 2) + t(k, a0Var);
    }

    public static int s(K k) {
        return k.getSerializedSize();
    }

    public static int t(K k, a0 a0Var) {
        return ((androidx.datastore.preferences.protobuf.a) k).c(a0Var);
    }

    public static int u(int i, int i2) {
        return O(i) + v(i2);
    }

    public static int v(int i) {
        return S(i);
    }

    public static int w(int i, long j) {
        return O(i) + x(j);
    }

    public static int x(long j) {
        return S(j);
    }

    public static int y(int i) {
        return Q(i) + i;
    }

    public static int z(int i, K k, a0 a0Var) {
        return O(i) + B(k, a0Var);
    }

    public abstract void A0(int i, K k);

    public abstract void B0(int i, f fVar);

    public final void C0(int i, int i2) {
        k0(i, i2);
    }

    public final void D0(int i) {
        l0(i);
    }

    public final void E0(int i, long j) {
        m0(i, j);
    }

    public final void F0(long j) {
        n0(j);
    }

    public final void G0(int i, int i2) {
        N0(i, T(i2));
    }

    public final void H0(int i) {
        O0(T(i));
    }

    public final void I0(int i, long j) {
        P0(i, U(j));
    }

    public final void J0(long j) {
        Q0(U(j));
    }

    public abstract void K0(int i, String str);

    public abstract void L0(String str);

    public abstract void M0(int i, int i2);

    public abstract void N0(int i, int i2);

    public abstract void O0(int i);

    public abstract void P0(int i, long j);

    public abstract void Q0(long j);

    public abstract void V();

    public final void W(String str, l0.d dVar) {
        c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", dVar);
        byte[] bytes = str.getBytes(u.b);
        try {
            O0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new c(e);
        }
    }

    public boolean X() {
        return this.b;
    }

    public abstract void Z(byte b2);

    public abstract void a(byte[] bArr, int i, int i2);

    public abstract void a0(int i, boolean z);

    public final void b0(boolean z) {
        Z(z ? (byte) 1 : (byte) 0);
    }

    public final void c0(byte[] bArr) {
        d0(bArr, 0, bArr.length);
    }

    public abstract void d0(byte[] bArr, int i, int i2);

    public abstract void e0(int i, f fVar);

    public abstract void f0(f fVar);

    public final void g0(int i, double d2) {
        m0(i, Double.doubleToRawLongBits(d2));
    }

    public final void h0(double d2) {
        n0(Double.doubleToRawLongBits(d2));
    }

    public final void i0(int i, int i2) {
        u0(i, i2);
    }

    public final void j0(int i) {
        v0(i);
    }

    public abstract void k0(int i, int i2);

    public abstract void l0(int i);

    public abstract void m0(int i, long j);

    public abstract void n0(long j);

    public final void o0(int i, float f) {
        k0(i, Float.floatToRawIntBits(f));
    }

    public final void p0(float f) {
        l0(Float.floatToRawIntBits(f));
    }

    public final void q0(int i, K k) {
        M0(i, 3);
        s0(k);
        M0(i, 4);
    }

    public final void r0(int i, K k, a0 a0Var) {
        M0(i, 3);
        t0(k, a0Var);
        M0(i, 4);
    }

    public final void s0(K k) {
        k.a(this);
    }

    public final void t0(K k, a0 a0Var) {
        a0Var.f(k, this.a);
    }

    public abstract void u0(int i, int i2);

    public abstract void v0(int i);

    public final void w0(int i, long j) {
        P0(i, j);
    }

    public final void x0(long j) {
        Q0(j);
    }

    public abstract void y0(int i, K k, a0 a0Var);

    public abstract void z0(K k);

    public i() {
    }
}
