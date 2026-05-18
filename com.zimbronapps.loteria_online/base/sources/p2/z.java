package P2;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class z {
    public static final char[] d = {'\r', '\n'};
    public static final char[] e = {'\n'};
    public static final t7.t f = t7.t.v(s7.e.a, s7.e.c, s7.e.f, s7.e.d, s7.e.e);
    public byte[] a;
    public int b;
    public int c;

    public z() {
        this.a = K.f;
    }

    public String A() {
        return n((char) 0);
    }

    public String B(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        String I = K.I(this.a, i2, (i3 >= this.c || this.a[i3] != 0) ? i : i - 1);
        this.b += i;
        return I;
    }

    public short C() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public String D(int i) {
        return E(i, s7.e.c);
    }

    public String E(int i, Charset charset) {
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public int F() {
        return (G() << 21) | (G() << 14) | (G() << 7) | G();
    }

    public int G() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public int H() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.b = i + 4;
        return i4;
    }

    public long I() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = ((bArr[i] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.b = i + 4;
        return (bArr[r4] & 255) | j;
    }

    public int J() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    public int K() {
        int p = p();
        if (p >= 0) {
            return p;
        }
        throw new IllegalStateException("Top bit not zero: " + p);
    }

    public long L() {
        long z = z();
        if (z >= 0) {
            return z;
        }
        throw new IllegalStateException("Top bit not zero: " + z);
    }

    public int M() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public long N() {
        int i;
        int i2;
        long j = this.a[this.b];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= r6 - 1;
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i = 1; i < i2; i++) {
            if ((this.a[this.b + i] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | (r3 & 63);
        }
        this.b += i2;
        return j;
    }

    public Charset O() {
        if (a() >= 3) {
            byte[] bArr = this.a;
            int i = this.b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.b = i + 3;
                return s7.e.c;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.a;
        int i2 = this.b;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.b = i2 + 2;
            return s7.e.d;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.b = i2 + 2;
        return s7.e.e;
    }

    public void P(int i) {
        R(b() < i ? new byte[i] : this.a, i);
    }

    public void Q(byte[] bArr) {
        R(bArr, bArr.length);
    }

    public void R(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public void S(int i) {
        a.a(i >= 0 && i <= this.a.length);
        this.c = i;
    }

    public void T(int i) {
        a.a(i >= 0 && i <= this.c);
        this.b = i;
    }

    public void U(int i) {
        T(this.b + i);
    }

    public final void V(Charset charset) {
        if (m(charset, d) == '\r') {
            m(charset, e);
        }
    }

    public int a() {
        return this.c - this.b;
    }

    public int b() {
        return this.a.length;
    }

    public void c(int i) {
        if (i > b()) {
            this.a = Arrays.copyOf(this.a, i);
        }
    }

    public final int d(Charset charset) {
        int i;
        if (charset.equals(s7.e.c) || charset.equals(s7.e.a)) {
            i = 1;
        } else {
            if (!charset.equals(s7.e.f) && !charset.equals(s7.e.e) && !charset.equals(s7.e.d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i = 2;
        }
        int i2 = this.b;
        while (true) {
            int i3 = this.c;
            if (i2 >= i3 - (i - 1)) {
                return i3;
            }
            if ((charset.equals(s7.e.c) || charset.equals(s7.e.a)) && K.C0(this.a[i2])) {
                return i2;
            }
            if (charset.equals(s7.e.f) || charset.equals(s7.e.d)) {
                byte[] bArr = this.a;
                if (bArr[i2] == 0 && K.C0(bArr[i2 + 1])) {
                    return i2;
                }
            }
            if (charset.equals(s7.e.e)) {
                byte[] bArr2 = this.a;
                if (bArr2[i2 + 1] == 0 && K.C0(bArr2[i2])) {
                    return i2;
                }
            }
            i2 += i;
        }
    }

    public byte[] e() {
        return this.a;
    }

    public int f() {
        return this.b;
    }

    public int g() {
        return this.c;
    }

    public char h(Charset charset) {
        a.b(f.contains(charset), "Unsupported charset: " + charset);
        return (char) (i(charset) >> 16);
    }

    public final int i(Charset charset) {
        byte a;
        char c;
        int i = 1;
        if ((charset.equals(s7.e.c) || charset.equals(s7.e.a)) && a() >= 1) {
            a = (byte) w7.b.a(w7.i.b(this.a[this.b]));
        } else {
            if ((charset.equals(s7.e.f) || charset.equals(s7.e.d)) && a() >= 2) {
                byte[] bArr = this.a;
                int i2 = this.b;
                c = w7.b.c(bArr[i2], bArr[i2 + 1]);
            } else {
                if (!charset.equals(s7.e.e) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.a;
                int i3 = this.b;
                c = w7.b.c(bArr2[i3 + 1], bArr2[i3]);
            }
            a = (byte) c;
            i = 2;
        }
        return (w7.b.a(a) << 16) + i;
    }

    public int j() {
        return this.a[this.b] & 255;
    }

    public void k(y yVar, int i) {
        l(yVar.a, 0, i);
        yVar.p(0);
    }

    public void l(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final char m(Charset charset, char[] cArr) {
        int i = i(charset);
        if (i == 0) {
            return (char) 0;
        }
        char c = (char) (i >> 16);
        if (!w7.b.b(cArr, c)) {
            return (char) 0;
        }
        this.b += i & 65535;
        return c;
    }

    public String n(char c) {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != c) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        String I = K.I(bArr, i2, i - i2);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return I;
    }

    public double o() {
        return Double.longBitsToDouble(z());
    }

    public int p() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.b = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    public int q() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = ((bArr[i] & 255) << 24) >> 8;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    public String r() {
        return s(s7.e.c);
    }

    public String s(Charset charset) {
        a.b(f.contains(charset), "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        if (!charset.equals(s7.e.a)) {
            O();
        }
        String E = E(d(charset) - this.b, charset);
        if (this.b == this.c) {
            return E;
        }
        V(charset);
        return E;
    }

    public int t() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.b = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    public long u() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.b = i + 4;
        long j2 = j | ((bArr[r8] & 255) << 24);
        this.b = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 32);
        this.b = i + 6;
        long j4 = j3 | ((bArr[r8] & 255) << 40);
        this.b = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 48);
        this.b = i + 8;
        return ((bArr[r8] & 255) << 56) | j5;
    }

    public short v() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public long w() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.b = i + 4;
        return ((bArr[r4] & 255) << 24) | j;
    }

    public int x() {
        int t = t();
        if (t >= 0) {
            return t;
        }
        throw new IllegalStateException("Top bit not zero: " + t);
    }

    public int y() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public long z() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = ((bArr[i] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.b = i + 4;
        long j2 = j | ((bArr[r4] & 255) << 32);
        this.b = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 24);
        this.b = i + 6;
        long j4 = j3 | ((bArr[r4] & 255) << 16);
        this.b = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 8);
        this.b = i + 8;
        return (bArr[r4] & 255) | j5;
    }

    public z(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public z(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public z(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }
}
