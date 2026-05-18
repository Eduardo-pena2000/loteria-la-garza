package Db;

import java.io.InputStream;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class h extends InputStream {
    public final byte[] a;
    public final int b;
    public int c;
    public int d;

    public static class b extends Ab.d {
        public int k;
        public int l;

        public static /* synthetic */ byte[] l(b bVar) {
            return bVar.o();
        }

        public static /* synthetic */ int m(b bVar) {
            return bVar.k;
        }

        public static /* synthetic */ int n(b bVar) {
            return bVar.l;
        }

        public final byte[] o() {
            return b().c();
        }

        public h p() {
            return new h(this, null);
        }

        public b q(byte[] bArr) {
            Objects.requireNonNull(bArr, "origin");
            this.l = bArr.length;
            return (b) super.d(bArr);
        }

        public b r(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("length cannot be negative");
            }
            this.l = i;
            return this;
        }

        public b s(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("offset cannot be negative");
            }
            this.k = i;
            return this;
        }
    }

    public /* synthetic */ h(b bVar, a aVar) {
        this(bVar);
    }

    public static b a() {
        return new b();
    }

    public static int b(byte[] bArr, int i) {
        c(i, "defaultValue");
        return Math.min(i, bArr.length > 0 ? bArr.length : i);
    }

    public static int c(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative");
    }

    public int available() {
        int i = this.c;
        int i2 = this.b;
        if (i < i2) {
            return i2 - i;
        }
        return 0;
    }

    public void mark(int i) {
        this.d = this.c;
    }

    public boolean markSupported() {
        return true;
    }

    public int read() {
        int i = this.c;
        if (i >= this.b) {
            return -1;
        }
        byte[] bArr = this.a;
        this.c = i + 1;
        return bArr[i] & 255;
    }

    public void reset() {
        this.c = this.d;
    }

    public long skip(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Skipping backward is not supported");
        }
        int i = this.b;
        int i2 = this.c;
        long j2 = i - i2;
        if (j < j2) {
            j2 = j;
        }
        this.c = Math.addExact(i2, Math.toIntExact(j));
        return j2;
    }

    public h(b bVar) {
        this(b.l(bVar), b.m(bVar), b.n(bVar));
    }

    public int read(byte[] bArr) {
        Objects.requireNonNull(bArr, "dest");
        return read(bArr, 0, bArr.length);
    }

    public h(byte[] bArr) {
        this(bArr, bArr.length, 0, 0);
    }

    public h(byte[] bArr, int i, int i2) {
        c(i, "offset");
        c(i2, "length");
        Objects.requireNonNull(bArr, "data");
        this.a = bArr;
        this.b = Math.min(b(bArr, i) + i2, bArr.length);
        this.c = b(bArr, i);
        this.d = b(bArr, i);
    }

    public int read(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr, "dest");
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            int i3 = this.c;
            int i4 = this.b;
            if (i3 >= i4) {
                return -1;
            }
            int i5 = i4 - i3;
            if (i2 >= i5) {
                i2 = i5;
            }
            if (i2 <= 0) {
                return 0;
            }
            System.arraycopy(this.a, i3, bArr, i, i2);
            this.c += i2;
            return i2;
        }
        throw new IndexOutOfBoundsException();
    }

    public h(byte[] bArr, int i, int i2, int i3) {
        Objects.requireNonNull(bArr, "data");
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
