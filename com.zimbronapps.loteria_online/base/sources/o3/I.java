package o3;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i implements q {
    public final M2.i b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[65536];
    public final byte[] a = new byte[4096];

    static {
        M2.v.a("media3.extractor");
    }

    public i(M2.i iVar, long j, long j2) {
        this.b = iVar;
        this.d = j;
        this.c = j2;
    }

    public long a() {
        return this.c;
    }

    public long b() {
        return this.d;
    }

    public int c(int i) {
        int u = u(i);
        if (u == 0) {
            byte[] bArr = this.a;
            u = t(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        q(u);
        return u;
    }

    public boolean d(byte[] bArr, int i, int i2, boolean z) {
        if (!n(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    public void f() {
        this.f = 0;
    }

    public boolean h(byte[] bArr, int i, int i2, boolean z) {
        int s = s(bArr, i, i2);
        while (s < i2 && s != -1) {
            s = t(bArr, i, i2, s, z);
        }
        q(s);
        return s != -1;
    }

    public long i() {
        return this.d + this.f;
    }

    public void j(int i) {
        n(i, false);
    }

    public int k(byte[] bArr, int i, int i2) {
        int min;
        r(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            min = t(this.e, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            this.g += min;
        } else {
            min = Math.min(i2, i5);
        }
        System.arraycopy(this.e, this.f, bArr, i, min);
        this.f += min;
        return min;
    }

    public void m(int i) {
        v(i, false);
    }

    public boolean n(int i, boolean z) {
        r(i);
        int i2 = this.g - this.f;
        while (i2 < i) {
            i2 = t(this.e, this.f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.g = this.f + i2;
        }
        this.f += i;
        return true;
    }

    public void p(byte[] bArr, int i, int i2) {
        d(bArr, i, i2, false);
    }

    public final void q(int i) {
        if (i != -1) {
            this.d += i;
        }
    }

    public final void r(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, P2.K.p(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        int s = s(bArr, i, i2);
        if (s == 0) {
            s = t(bArr, i, i2, 0, true);
        }
        q(s);
        return s;
    }

    public void readFully(byte[] bArr, int i, int i2) {
        h(bArr, i, i2, false);
    }

    public final int s(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.e, 0, bArr, i, min);
        w(min);
        return min;
    }

    public final int t(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.b.read(bArr, i + i3, i2 - i3);
        if (read != -1) {
            return i3 + read;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final int u(int i) {
        int min = Math.min(this.g, i);
        w(min);
        return min;
    }

    public boolean v(int i, boolean z) {
        int u = u(i);
        while (u < i && u != -1) {
            u = t(this.a, -u, Math.min(i, this.a.length + u), u, z);
        }
        q(u);
        return u != -1;
    }

    public final void w(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }
}
