package xb;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class e implements g, f, Cloneable, ByteChannel {
    public G a;
    public long b;

    public static final class a implements Closeable {
        public e a;
        public boolean b;
        public G c;
        public byte[] e;
        public long d = -1;
        public int f = -1;
        public int g = -1;

        public final G a() {
            return this.c;
        }

        public final int b() {
            long j = this.d;
            e eVar = this.a;
            kotlin.jvm.internal.t.d(eVar);
            if (j == eVar.A()) {
                throw new IllegalStateException("no more bytes");
            }
            long j2 = this.d;
            return d(j2 == -1 ? 0L : j2 + (this.g - this.f));
        }

        public final long c(long j) {
            e eVar = this.a;
            if (eVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.b) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long A = eVar.A();
            if (j <= A) {
                if (j < 0) {
                    throw new IllegalArgumentException(("newSize < 0: " + j).toString());
                }
                long j2 = A - j;
                while (true) {
                    if (j2 <= 0) {
                        break;
                    }
                    G g = eVar.a;
                    kotlin.jvm.internal.t.d(g);
                    G g2 = g.g;
                    kotlin.jvm.internal.t.d(g2);
                    int i = g2.c;
                    long j3 = i - g2.b;
                    if (j3 > j2) {
                        g2.c = i - ((int) j2);
                        break;
                    }
                    eVar.a = g2.b();
                    H.b(g2);
                    j2 -= j3;
                }
                f(null);
                this.d = j;
                this.e = null;
                this.f = -1;
                this.g = -1;
            } else if (j > A) {
                long j4 = j - A;
                boolean z = true;
                while (j4 > 0) {
                    G E = eVar.E(1);
                    int min = (int) Math.min(j4, 8192 - E.c);
                    E.c += min;
                    j4 -= min;
                    if (z) {
                        f(E);
                        this.d = A;
                        this.e = E.a;
                        int i2 = E.c;
                        this.f = i2 - min;
                        this.g = i2;
                        z = false;
                    }
                }
            }
            eVar.z(j);
            return A;
        }

        public void close() {
            if (this.a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.a = null;
            f(null);
            this.d = -1L;
            this.e = null;
            this.f = -1;
            this.g = -1;
        }

        public final int d(long j) {
            G g;
            e eVar = this.a;
            if (eVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j < -1 || j > eVar.A()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + eVar.A());
            }
            if (j == -1 || j == eVar.A()) {
                f(null);
                this.d = j;
                this.e = null;
                this.f = -1;
                this.g = -1;
                return -1;
            }
            long A = eVar.A();
            G g2 = eVar.a;
            long j2 = 0;
            if (a() != null) {
                long j3 = this.d;
                int i = this.f;
                kotlin.jvm.internal.t.d(a());
                long j4 = j3 - (i - r9.b);
                if (j4 > j) {
                    g = g2;
                    g2 = a();
                    A = j4;
                } else {
                    g = a();
                    j2 = j4;
                }
            } else {
                g = g2;
            }
            if (A - j > j - j2) {
                while (true) {
                    kotlin.jvm.internal.t.d(g);
                    int i2 = g.c;
                    int i3 = g.b;
                    if (j < (i2 - i3) + j2) {
                        break;
                    }
                    j2 += i2 - i3;
                    g = g.f;
                }
            } else {
                while (A > j) {
                    kotlin.jvm.internal.t.d(g2);
                    g2 = g2.g;
                    kotlin.jvm.internal.t.d(g2);
                    A -= g2.c - g2.b;
                }
                j2 = A;
                g = g2;
            }
            if (this.b) {
                kotlin.jvm.internal.t.d(g);
                if (g.d) {
                    G f = g.f();
                    if (eVar.a == g) {
                        eVar.a = f;
                    }
                    g = g.c(f);
                    G g3 = g.g;
                    kotlin.jvm.internal.t.d(g3);
                    g3.b();
                }
            }
            f(g);
            this.d = j;
            kotlin.jvm.internal.t.d(g);
            this.e = g.a;
            int i4 = g.b + ((int) (j - j2));
            this.f = i4;
            int i5 = g.c;
            this.g = i5;
            return i5 - i4;
        }

        public final void f(G g) {
            this.c = g;
        }
    }

    public static /* synthetic */ a x(e eVar, a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = xb.b.d();
        }
        return eVar.v(aVar);
    }

    public final long A() {
        return this.b;
    }

    public final h B() {
        if (A() <= 2147483647L) {
            return C((int) A());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + A()).toString());
    }

    public final h C(int i) {
        if (i == 0) {
            return h.e;
        }
        xb.b.b(A(), 0L, i);
        G g = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            kotlin.jvm.internal.t.d(g);
            int i5 = g.c;
            int i6 = g.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            g = g.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        G g2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            kotlin.jvm.internal.t.d(g2);
            bArr[i7] = g2.a;
            i2 += g2.c - g2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = g2.b;
            g2.d = true;
            i7++;
            g2 = g2.f;
        }
        return new I(bArr, iArr);
    }

    public int C0(A options) {
        kotlin.jvm.internal.t.g(options, "options");
        int f = yb.a.f(this, options, false, 2, null);
        if (f == -1) {
            return -1;
        }
        skip(options.g()[f].size());
        return f;
    }

    public final G E(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        G g = this.a;
        if (g != null) {
            kotlin.jvm.internal.t.d(g);
            G g2 = g.g;
            kotlin.jvm.internal.t.d(g2);
            return (g2.c + i > 8192 || !g2.e) ? g2.c(H.c()) : g2;
        }
        G c = H.c();
        this.a = c;
        c.g = c;
        c.f = c;
        return c;
    }

    public long F(e sink, long j) {
        kotlin.jvm.internal.t.g(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (A() == 0) {
            return -1L;
        }
        if (j > A()) {
            j = A();
        }
        sink.j1(this, j);
        return j;
    }

    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public e m0(h byteString) {
        kotlin.jvm.internal.t.g(byteString, "byteString");
        byteString.I(this, 0, byteString.size());
        return this;
    }

    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public e write(byte[] source) {
        kotlin.jvm.internal.t.g(source, "source");
        return write(source, 0, source.length);
    }

    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public e write(byte[] source, int i, int i2) {
        kotlin.jvm.internal.t.g(source, "source");
        long j = i2;
        xb.b.b(source.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            G E = E(1);
            int min = Math.min(i3 - i, 8192 - E.c);
            int i4 = i + min;
            Da.p.f(source, E.a, E.c, i, i4);
            E.c += min;
            i = i4;
        }
        z(A() + j);
        return this;
    }

    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public e writeByte(int i) {
        G E = E(1);
        byte[] bArr = E.a;
        int i2 = E.c;
        E.c = i2 + 1;
        bArr[i2] = (byte) i;
        z(A() + 1);
        return this;
    }

    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public e writeDecimalLong(long j) {
        boolean z;
        if (j == 0) {
            return writeByte(48);
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        G E = E(i);
        byte[] bArr = E.a;
        int i2 = E.c + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr[i2] = yb.a.b()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        E.c += i;
        z(A() + i);
        return this;
    }

    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public e writeHexadecimalUnsignedLong(long j) {
        if (j == 0) {
            return writeByte(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        G E = E(i);
        byte[] bArr = E.a;
        int i2 = E.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = yb.a.b()[(int) (15 & j)];
            j >>>= 4;
        }
        E.c += i;
        z(A() + i);
        return this;
    }

    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public e writeInt(int i) {
        G E = E(4);
        byte[] bArr = E.a;
        int i2 = E.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        E.c = i2 + 4;
        z(A() + 4);
        return this;
    }

    public e R(long j) {
        G E = E(8);
        byte[] bArr = E.a;
        int i = E.c;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        E.c = i + 8;
        z(A() + 8);
        return this;
    }

    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public e writeShort(int i) {
        G E = E(2);
        byte[] bArr = E.a;
        int i2 = E.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        E.c = i2 + 2;
        z(A() + 2);
        return this;
    }

    public e V(String string, int i, int i2, Charset charset) {
        kotlin.jvm.internal.t.g(string, "string");
        kotlin.jvm.internal.t.g(charset, "charset");
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (i2 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + string.length()).toString());
        }
        if (kotlin.jvm.internal.t.c(charset, Za.c.b)) {
            return X(string, i, i2);
        }
        String substring = string.substring(i, i2);
        kotlin.jvm.internal.t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        byte[] bytes = substring.getBytes(charset);
        kotlin.jvm.internal.t.f(bytes, "this as java.lang.String).getBytes(charset)");
        return write(bytes, 0, bytes.length);
    }

    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public e writeUtf8(String string) {
        kotlin.jvm.internal.t.g(string, "string");
        return X(string, 0, string.length());
    }

    public e X(String string, int i, int i2) {
        char charAt;
        kotlin.jvm.internal.t.g(string, "string");
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (i2 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + string.length()).toString());
        }
        while (i < i2) {
            char charAt2 = string.charAt(i);
            if (charAt2 < 128) {
                G E = E(1);
                byte[] bArr = E.a;
                int i3 = E.c - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = string.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = E.c;
                int i6 = (i3 + i) - i5;
                E.c = i5 + i6;
                z(A() + i6);
            } else {
                if (charAt2 < 2048) {
                    G E2 = E(2);
                    byte[] bArr2 = E2.a;
                    int i7 = E2.c;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    E2.c = i7 + 2;
                    z(A() + 2);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    G E3 = E(3);
                    byte[] bArr3 = E3.a;
                    int i8 = E3.c;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    E3.c = i8 + 3;
                    z(A() + 3);
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? string.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        writeByte(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        G E4 = E(4);
                        byte[] bArr4 = E4.a;
                        int i11 = E4.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        E4.c = i11 + 4;
                        z(A() + 4);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return this;
    }

    public e Y(int i) {
        if (i < 128) {
            writeByte(i);
        } else if (i < 2048) {
            G E = E(2);
            byte[] bArr = E.a;
            int i2 = E.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            E.c = i2 + 2;
            z(A() + 2);
        } else if (55296 <= i && i < 57344) {
            writeByte(63);
        } else if (i < 65536) {
            G E2 = E(3);
            byte[] bArr2 = E2.a;
            int i3 = E2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            E2.c = i3 + 3;
            z(A() + 3);
        } else {
            if (i > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: 0x" + xb.b.l(i));
            }
            G E3 = E(4);
            byte[] bArr3 = E3.a;
            int i4 = E3.c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            E3.c = i4 + 4;
            z(A() + 4);
        }
        return this;
    }

    public final void a() {
        skip(A());
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e clone() {
        return d();
    }

    public final long c() {
        long A = A();
        if (A == 0) {
            return 0L;
        }
        G g = this.a;
        kotlin.jvm.internal.t.d(g);
        G g2 = g.g;
        kotlin.jvm.internal.t.d(g2);
        if (g2.c < 8192 && g2.e) {
            A -= r3 - g2.b;
        }
        return A;
    }

    public final e d() {
        e eVar = new e();
        if (A() != 0) {
            G g = this.a;
            kotlin.jvm.internal.t.d(g);
            G d = g.d();
            eVar.a = d;
            d.g = d;
            d.f = d;
            for (G g2 = g.f; g2 != g; g2 = g2.f) {
                G g3 = d.g;
                kotlin.jvm.internal.t.d(g3);
                kotlin.jvm.internal.t.d(g2);
                g3.c(g2.d());
            }
            eVar.z(A());
        }
        return eVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (A() == eVar.A()) {
                if (A() == 0) {
                    return true;
                }
                G g = this.a;
                kotlin.jvm.internal.t.d(g);
                G g2 = eVar.a;
                kotlin.jvm.internal.t.d(g2);
                int i = g.b;
                int i2 = g2.b;
                long j = 0;
                while (j < A()) {
                    long min = Math.min(g.c - i, g2.c - i2);
                    long j2 = 0;
                    while (j2 < min) {
                        int i3 = i + 1;
                        int i4 = i2 + 1;
                        if (g.a[i] == g2.a[i2]) {
                            j2++;
                            i = i3;
                            i2 = i4;
                        }
                    }
                    if (i == g.c) {
                        g = g.f;
                        kotlin.jvm.internal.t.d(g);
                        i = g.b;
                    }
                    if (i2 == g2.c) {
                        g2 = g2.f;
                        kotlin.jvm.internal.t.d(g2);
                        i2 = g2.b;
                    }
                    j += min;
                }
                return true;
            }
        }
        return false;
    }

    public boolean exhausted() {
        return this.b == 0;
    }

    public final e f(e out, long j, long j2) {
        kotlin.jvm.internal.t.g(out, "out");
        xb.b.b(A(), j, j2);
        if (j2 != 0) {
            out.z(out.A() + j2);
            G g = this.a;
            while (true) {
                kotlin.jvm.internal.t.d(g);
                int i = g.c;
                int i2 = g.b;
                if (j < i - i2) {
                    break;
                }
                j -= i - i2;
                g = g.f;
            }
            while (j2 > 0) {
                kotlin.jvm.internal.t.d(g);
                G d = g.d();
                int i3 = d.b + ((int) j);
                d.b = i3;
                d.c = Math.min(i3 + ((int) j2), d.c);
                G g2 = out.a;
                if (g2 == null) {
                    d.g = d;
                    d.f = d;
                    out.a = d;
                } else {
                    kotlin.jvm.internal.t.d(g2);
                    G g3 = g2.g;
                    kotlin.jvm.internal.t.d(g3);
                    g3.c(d);
                }
                j2 -= d.c - d.b;
                g = g.f;
                j = 0;
            }
        }
        return this;
    }

    public void h0(e sink, long j) {
        kotlin.jvm.internal.t.g(sink, "sink");
        if (A() >= j) {
            sink.j1(this, j);
        } else {
            sink.j1(this, A());
            throw new EOFException();
        }
    }

    public int hashCode() {
        G g = this.a;
        if (g == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = g.c;
            for (int i3 = g.b; i3 < i2; i3++) {
                i = (i * 31) + g.a[i3];
            }
            g = g.f;
            kotlin.jvm.internal.t.d(g);
        } while (g != this.a);
        return i;
    }

    public long indexOf(byte b2, long j, long j2) {
        G g;
        int i;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + A() + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        if (j2 > A()) {
            j2 = A();
        }
        if (j == j2 || (g = this.a) == null) {
            return -1L;
        }
        if (A() - j < j) {
            j3 = A();
            while (j3 > j) {
                g = g.g;
                kotlin.jvm.internal.t.d(g);
                j3 -= g.c - g.b;
            }
            while (j3 < j2) {
                byte[] bArr = g.a;
                int min = (int) Math.min(g.c, (g.b + j2) - j3);
                i = (int) ((g.b + j) - j3);
                while (i < min) {
                    if (bArr[i] != b2) {
                        i++;
                    }
                }
                j3 += g.c - g.b;
                g = g.f;
                kotlin.jvm.internal.t.d(g);
                j = j3;
            }
            return -1L;
        }
        while (true) {
            long j4 = (g.c - g.b) + j3;
            if (j4 > j) {
                break;
            }
            g = g.f;
            kotlin.jvm.internal.t.d(g);
            j3 = j4;
        }
        while (j3 < j2) {
            byte[] bArr2 = g.a;
            int min2 = (int) Math.min(g.c, (g.b + j2) - j3);
            i = (int) ((g.b + j) - j3);
            while (i < min2) {
                if (bArr2[i] != b2) {
                    i++;
                }
            }
            j3 += g.c - g.b;
            g = g.f;
            kotlin.jvm.internal.t.d(g);
            j = j3;
        }
        return -1L;
        return (i - g.b) + j3;
    }

    public InputStream inputStream() {
        return new b();
    }

    public boolean isOpen() {
        return true;
    }

    public void j1(e source, long j) {
        G g;
        kotlin.jvm.internal.t.g(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        xb.b.b(source.A(), 0L, j);
        while (j > 0) {
            G g2 = source.a;
            kotlin.jvm.internal.t.d(g2);
            int i = g2.c;
            kotlin.jvm.internal.t.d(source.a);
            if (j < i - r1.b) {
                G g3 = this.a;
                if (g3 != null) {
                    kotlin.jvm.internal.t.d(g3);
                    g = g3.g;
                } else {
                    g = null;
                }
                if (g != null && g.e) {
                    if ((g.c + j) - (g.d ? 0 : g.b) <= 8192) {
                        G g4 = source.a;
                        kotlin.jvm.internal.t.d(g4);
                        g4.g(g, (int) j);
                        source.z(source.A() - j);
                        z(A() + j);
                        return;
                    }
                }
                G g5 = source.a;
                kotlin.jvm.internal.t.d(g5);
                source.a = g5.e((int) j);
            }
            G g6 = source.a;
            kotlin.jvm.internal.t.d(g6);
            long j2 = g6.c - g6.b;
            source.a = g6.b();
            G g7 = this.a;
            if (g7 == null) {
                this.a = g6;
                g6.g = g6;
                g6.f = g6;
            } else {
                kotlin.jvm.internal.t.d(g7);
                G g8 = g7.g;
                kotlin.jvm.internal.t.d(g8);
                g8.c(g6).a();
            }
            source.z(source.A() - j2);
            z(A() + j2);
            j -= j2;
        }
    }

    public final byte k(long j) {
        xb.b.b(A(), j, 1L);
        G g = this.a;
        if (g == null) {
            kotlin.jvm.internal.t.d(null);
            throw null;
        }
        if (A() - j < j) {
            long A = A();
            while (A > j) {
                g = g.g;
                kotlin.jvm.internal.t.d(g);
                A -= g.c - g.b;
            }
            kotlin.jvm.internal.t.d(g);
            return g.a[(int) ((g.b + j) - A)];
        }
        long j2 = 0;
        while (true) {
            long j3 = (g.c - g.b) + j2;
            if (j3 > j) {
                kotlin.jvm.internal.t.d(g);
                return g.a[(int) ((g.b + j) - j2)];
            }
            g = g.f;
            kotlin.jvm.internal.t.d(g);
            j2 = j3;
        }
    }

    public long m(h bytes) {
        kotlin.jvm.internal.t.g(bytes, "bytes");
        return o(bytes, 0L);
    }

    public long m1(J sink) {
        kotlin.jvm.internal.t.g(sink, "sink");
        long A = A();
        if (A > 0) {
            sink.j1(this, A);
        }
        return A;
    }

    public long o(h bytes, long j) {
        int i;
        long j2 = j;
        kotlin.jvm.internal.t.g(bytes, "bytes");
        if (bytes.size() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j3 = 0;
        if (j2 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
        }
        G g = this.a;
        if (g != null) {
            if (A() - j2 < j2) {
                j3 = A();
                while (j3 > j2) {
                    g = g.g;
                    kotlin.jvm.internal.t.d(g);
                    j3 -= g.c - g.b;
                }
                byte[] q = bytes.q();
                byte b2 = q[0];
                int size = bytes.size();
                long A = (A() - size) + 1;
                while (j3 < A) {
                    byte[] bArr = g.a;
                    long j4 = A;
                    int min = (int) Math.min(g.c, (g.b + A) - j3);
                    i = (int) ((g.b + j2) - j3);
                    while (i < min) {
                        if (bArr[i] == b2 && yb.a.c(g, i + 1, q, 1, size)) {
                            return (i - g.b) + j3;
                        }
                        i++;
                    }
                    j3 += g.c - g.b;
                    g = g.f;
                    kotlin.jvm.internal.t.d(g);
                    j2 = j3;
                    A = j4;
                }
            } else {
                while (true) {
                    long j5 = (g.c - g.b) + j3;
                    if (j5 > j2) {
                        break;
                    }
                    g = g.f;
                    kotlin.jvm.internal.t.d(g);
                    j3 = j5;
                }
                byte[] q2 = bytes.q();
                byte b3 = q2[0];
                int size2 = bytes.size();
                long A2 = (A() - size2) + 1;
                while (j3 < A2) {
                    byte[] bArr2 = g.a;
                    int min2 = (int) Math.min(g.c, (g.b + A2) - j3);
                    i = (int) ((g.b + j2) - j3);
                    while (i < min2) {
                        if (bArr2[i] == b3 && yb.a.c(g, i + 1, q2, 1, size2)) {
                            return (i - g.b) + j3;
                        }
                        i++;
                    }
                    j3 += g.c - g.b;
                    g = g.f;
                    kotlin.jvm.internal.t.d(g);
                    j2 = j3;
                }
            }
        }
        return -1L;
    }

    public long p1(L source) {
        kotlin.jvm.internal.t.g(source, "source");
        long j = 0;
        while (true) {
            long F = source.F(this, 8192L);
            if (F == -1) {
                return j;
            }
            j += F;
        }
    }

    public g peek() {
        return x.d(new D(this));
    }

    public long r(h targetBytes) {
        kotlin.jvm.internal.t.g(targetBytes, "targetBytes");
        return s(targetBytes, 0L);
    }

    public int read(ByteBuffer sink) {
        kotlin.jvm.internal.t.g(sink, "sink");
        G g = this.a;
        if (g == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), g.c - g.b);
        sink.put(g.a, g.b, min);
        int i = g.b + min;
        g.b = i;
        this.b -= min;
        if (i == g.c) {
            this.a = g.b();
            H.b(g);
        }
        return min;
    }

    public byte readByte() {
        if (A() == 0) {
            throw new EOFException();
        }
        G g = this.a;
        kotlin.jvm.internal.t.d(g);
        int i = g.b;
        int i2 = g.c;
        int i3 = i + 1;
        byte b2 = g.a[i];
        z(A() - 1);
        if (i3 == i2) {
            this.a = g.b();
            H.b(g);
        } else {
            g.b = i3;
        }
        return b2;
    }

    public byte[] readByteArray() {
        return readByteArray(A());
    }

    public h readByteString(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (A() < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new h(readByteArray(j));
        }
        h C = C((int) j);
        skip(j);
        return C;
    }

    public long readDecimalLong() {
        if (A() == 0) {
            throw new EOFException();
        }
        int i = 0;
        boolean z = false;
        long j = 0;
        long j2 = -7;
        boolean z2 = false;
        do {
            G g = this.a;
            kotlin.jvm.internal.t.d(g);
            byte[] bArr = g.a;
            int i2 = g.b;
            int i3 = g.c;
            while (i2 < i3) {
                byte b2 = bArr[i2];
                if (b2 >= 48 && b2 <= 57) {
                    int i4 = 48 - b2;
                    if (j < -922337203685477580L || (j == -922337203685477580L && i4 < j2)) {
                        e writeByte = new e().writeDecimalLong(j).writeByte(b2);
                        if (!z) {
                            writeByte.readByte();
                        }
                        throw new NumberFormatException("Number too large: " + writeByte.readUtf8());
                    }
                    j = (j * 10) + i4;
                } else {
                    if (b2 != 45 || i != 0) {
                        z2 = true;
                        break;
                    }
                    j2--;
                    z = true;
                }
                i2++;
                i++;
            }
            if (i2 == i3) {
                this.a = g.b();
                H.b(g);
            } else {
                g.b = i2;
            }
            if (z2) {
                break;
            }
        } while (this.a != null);
        z(A() - i);
        if (i >= (z ? 2 : 1)) {
            return z ? j : -j;
        }
        if (A() == 0) {
            throw new EOFException();
        }
        throw new NumberFormatException((z ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + xb.b.k(k(0L)));
    }

    public void readFully(byte[] sink) {
        kotlin.jvm.internal.t.g(sink, "sink");
        int i = 0;
        while (i < sink.length) {
            int read = read(sink, i, sink.length - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7 A[EDGE_INSN: B:40:0x00a7->B:37:0x00a7 BREAK  A[LOOP:0: B:4:0x000d->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readHexadecimalUnsignedLong() {
        /*
            r14 = this;
            long r0 = r14.A()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb1
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            xb.G r6 = r14.a
            kotlin.jvm.internal.t.d(r6)
            byte[] r7 = r6.a
            int r8 = r6.b
            int r9 = r6.c
        L18:
            if (r8 >= r9) goto L93
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3c
        L27:
            r11 = 97
            if (r10 < r11) goto L32
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L32
            int r11 = r10 + (-87)
            goto L3c
        L32:
            r11 = 65
            if (r10 < r11) goto L74
            r11 = 70
            if (r10 > r11) goto L74
            int r11 = r10 + (-55)
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4c:
            xb.e r0 = new xb.e
            r0.<init>()
            xb.e r0 = r0.writeHexadecimalUnsignedLong(r4)
            xb.e r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L74:
            if (r0 == 0) goto L78
            r1 = 1
            goto L93
        L78:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = xb.b.k(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L93:
            if (r8 != r9) goto L9f
            xb.G r7 = r6.b()
            r14.a = r7
            xb.H.b(r6)
            goto La1
        L9f:
            r6.b = r8
        La1:
            if (r1 != 0) goto La7
            xb.G r6 = r14.a
            if (r6 != 0) goto Ld
        La7:
            long r1 = r14.A()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.z(r1)
            return r4
        Lb1:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xb.e.readHexadecimalUnsignedLong():long");
    }

    public int readInt() {
        if (A() < 4) {
            throw new EOFException();
        }
        G g = this.a;
        kotlin.jvm.internal.t.d(g);
        int i = g.b;
        int i2 = g.c;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = g.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        z(A() - 4);
        if (i5 == i2) {
            this.a = g.b();
            H.b(g);
        } else {
            g.b = i5;
        }
        return i6;
    }

    public int readIntLe() {
        return xb.b.h(readInt());
    }

    public long readLong() {
        if (A() < 8) {
            throw new EOFException();
        }
        G g = this.a;
        kotlin.jvm.internal.t.d(g);
        int i = g.b;
        int i2 = g.c;
        if (i2 - i < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = g.a;
        int i3 = i + 7;
        long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (bArr[i3] & 255);
        z(A() - 8);
        if (i4 == i2) {
            this.a = g.b();
            H.b(g);
        } else {
            g.b = i4;
        }
        return j2;
    }

    public long readLongLe() {
        return xb.b.i(readLong());
    }

    public short readShort() {
        if (A() < 2) {
            throw new EOFException();
        }
        G g = this.a;
        kotlin.jvm.internal.t.d(g);
        int i = g.b;
        int i2 = g.c;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = g.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        z(A() - 2);
        if (i5 == i2) {
            this.a = g.b();
            H.b(g);
        } else {
            g.b = i5;
        }
        return (short) i6;
    }

    public short readShortLe() {
        return xb.b.j(readShort());
    }

    public String readString(Charset charset) {
        kotlin.jvm.internal.t.g(charset, "charset");
        return readString(this.b, charset);
    }

    public String readUtf8() {
        return readString(this.b, Za.c.b);
    }

    public String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    public boolean request(long j) {
        return this.b >= j;
    }

    public void require(long j) {
        if (this.b < j) {
            throw new EOFException();
        }
    }

    public long s(h targetBytes, long j) {
        int i;
        int i2;
        kotlin.jvm.internal.t.g(targetBytes, "targetBytes");
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
        }
        G g = this.a;
        if (g == null) {
            return -1L;
        }
        if (A() - j < j) {
            j2 = A();
            while (j2 > j) {
                g = g.g;
                kotlin.jvm.internal.t.d(g);
                j2 -= g.c - g.b;
            }
            if (targetBytes.size() == 2) {
                byte f = targetBytes.f(0);
                byte f2 = targetBytes.f(1);
                while (j2 < A()) {
                    byte[] bArr = g.a;
                    i = (int) ((g.b + j) - j2);
                    int i3 = g.c;
                    while (i < i3) {
                        byte b2 = bArr[i];
                        if (b2 != f && b2 != f2) {
                            i++;
                        }
                        i2 = g.b;
                    }
                    j2 += g.c - g.b;
                    g = g.f;
                    kotlin.jvm.internal.t.d(g);
                    j = j2;
                }
                return -1L;
            }
            byte[] q = targetBytes.q();
            while (j2 < A()) {
                byte[] bArr2 = g.a;
                i = (int) ((g.b + j) - j2);
                int i4 = g.c;
                while (i < i4) {
                    byte b3 = bArr2[i];
                    for (byte b4 : q) {
                        if (b3 == b4) {
                            i2 = g.b;
                        }
                    }
                    i++;
                }
                j2 += g.c - g.b;
                g = g.f;
                kotlin.jvm.internal.t.d(g);
                j = j2;
            }
            return -1L;
        }
        while (true) {
            long j3 = (g.c - g.b) + j2;
            if (j3 > j) {
                break;
            }
            g = g.f;
            kotlin.jvm.internal.t.d(g);
            j2 = j3;
        }
        if (targetBytes.size() == 2) {
            byte f3 = targetBytes.f(0);
            byte f4 = targetBytes.f(1);
            while (j2 < A()) {
                byte[] bArr3 = g.a;
                i = (int) ((g.b + j) - j2);
                int i5 = g.c;
                while (i < i5) {
                    byte b5 = bArr3[i];
                    if (b5 != f3 && b5 != f4) {
                        i++;
                    }
                    i2 = g.b;
                }
                j2 += g.c - g.b;
                g = g.f;
                kotlin.jvm.internal.t.d(g);
                j = j2;
            }
            return -1L;
        }
        byte[] q2 = targetBytes.q();
        while (j2 < A()) {
            byte[] bArr4 = g.a;
            i = (int) ((g.b + j) - j2);
            int i6 = g.c;
            while (i < i6) {
                byte b6 = bArr4[i];
                for (byte b7 : q2) {
                    if (b6 == b7) {
                        i2 = g.b;
                    }
                }
                i++;
            }
            j2 += g.c - g.b;
            g = g.f;
            kotlin.jvm.internal.t.d(g);
            j = j2;
        }
        return -1L;
        return (i - i2) + j2;
    }

    public void skip(long j) {
        while (j > 0) {
            G g = this.a;
            if (g == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, g.c - g.b);
            long j2 = min;
            z(A() - j2);
            j -= j2;
            int i = g.b + min;
            g.b = i;
            if (i == g.c) {
                this.a = g.b();
                H.b(g);
            }
        }
    }

    public boolean t(long j, h bytes) {
        kotlin.jvm.internal.t.g(bytes, "bytes");
        return u(j, bytes, 0, bytes.size());
    }

    public M timeout() {
        return M.e;
    }

    public String toString() {
        return B().toString();
    }

    public boolean u(long j, h bytes, int i, int i2) {
        kotlin.jvm.internal.t.g(bytes, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || A() - j < i2 || bytes.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (k(i3 + j) != bytes.f(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public final a v(a unsafeCursor) {
        kotlin.jvm.internal.t.g(unsafeCursor, "unsafeCursor");
        return yb.a.a(this, unsafeCursor);
    }

    public h y() {
        return readByteString(A());
    }

    public final void z(long j) {
        this.b = j;
    }

    public static final class b extends InputStream {
        public b() {
        }

        public int available() {
            return (int) Math.min(e.this.A(), Integer.MAX_VALUE);
        }

        public int read() {
            if (e.this.A() > 0) {
                return e.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return e.this + ".inputStream()";
        }

        public int read(byte[] sink, int i, int i2) {
            kotlin.jvm.internal.t.g(sink, "sink");
            return e.this.read(sink, i, i2);
        }

        public void close() {
        }
    }

    public byte[] readByteArray(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (A() < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    public String readString(long j, Charset charset) {
        kotlin.jvm.internal.t.g(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        G g = this.a;
        kotlin.jvm.internal.t.d(g);
        int i = g.b;
        if (i + j > g.c) {
            return new String(readByteArray(j), charset);
        }
        int i2 = (int) j;
        String str = new String(g.a, i, i2, charset);
        int i3 = g.b + i2;
        g.b = i3;
        this.b -= j;
        if (i3 == g.c) {
            this.a = g.b();
            H.b(g);
        }
        return str;
    }

    public String readUtf8(long j) {
        return readString(j, Za.c.b);
    }

    public String readUtf8LineStrict(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long indexOf = indexOf((byte) 10, 0L, j2);
        if (indexOf != -1) {
            return yb.a.d(this, indexOf);
        }
        if (j2 < A() && k(j2 - 1) == 13 && k(j2) == 10) {
            return yb.a.d(this, j2);
        }
        e eVar = new e();
        f(eVar, 0L, Math.min(32, A()));
        throw new EOFException("\\n not found: limit=" + Math.min(A(), j) + " content=" + eVar.y().l() + (char) 8230);
    }

    public int write(ByteBuffer source) {
        kotlin.jvm.internal.t.g(source, "source");
        int remaining = source.remaining();
        int i = remaining;
        while (i > 0) {
            G E = E(1);
            int min = Math.min(i, 8192 - E.c);
            source.get(E.a, E.c, min);
            i -= min;
            E.c += min;
        }
        this.b += remaining;
        return remaining;
    }

    public int read(byte[] sink, int i, int i2) {
        kotlin.jvm.internal.t.g(sink, "sink");
        xb.b.b(sink.length, i, i2);
        G g = this.a;
        if (g == null) {
            return -1;
        }
        int min = Math.min(i2, g.c - g.b);
        byte[] bArr = g.a;
        int i3 = g.b;
        Da.p.f(bArr, sink, i, i3, i3 + min);
        g.b += min;
        z(A() - min);
        if (g.b == g.c) {
            this.a = g.b();
            H.b(g);
        }
        return min;
    }

    public e buffer() {
        return this;
    }

    public void close() {
    }

    public void flush() {
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public e emit() {
        return this;
    }

    public e getBuffer() {
        return this;
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public e emitCompleteSegments() {
        return this;
    }
}
