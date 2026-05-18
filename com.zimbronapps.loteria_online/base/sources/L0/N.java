package l0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n {
    public int a;
    public long[] b = q.b(16);
    public int[] c = new int[16];
    public int[] d;
    public int e;

    public n() {
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        this.d = iArr;
    }

    public final int a(long j) {
        c(this.a + 1);
        int i = this.a;
        this.a = i + 1;
        int b = b();
        this.b[i] = j;
        this.c[i] = b;
        this.d[b] = i;
        h(i);
        return b;
    }

    public final int b() {
        int length = this.d.length;
        if (this.e >= length) {
            int i = length * 2;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                iArr[i2] = i3;
                i2 = i3;
            }
            Da.p.n(this.d, iArr, 0, 0, 0, 14, (Object) null);
            this.d = iArr;
        }
        int i4 = this.e;
        this.e = this.d[i4];
        return i4;
    }

    public final void c(int i) {
        int length = this.b.length;
        if (i <= length) {
            return;
        }
        int i2 = length * 2;
        long[] b = q.b(i2);
        int[] iArr = new int[i2];
        Da.p.o(this.b, b, 0, 0, 0, 12, (Object) null);
        Da.p.n(this.c, iArr, 0, 0, 0, 14, (Object) null);
        this.b = b;
        this.c = iArr;
    }

    public final void d(int i) {
        this.d[i] = this.e;
        this.e = i;
    }

    public final long e(long j) {
        return this.a > 0 ? this.b[0] : j;
    }

    public final void f(int i) {
        int i2 = this.d[i];
        i(i2, this.a - 1);
        this.a--;
        h(i2);
        g(i2);
        d(i);
    }

    public final void g(int i) {
        long[] jArr = this.b;
        int i2 = this.a >> 1;
        while (i < i2) {
            int i3 = (i + 1) << 1;
            int i4 = i3 - 1;
            if (i3 >= this.a || kotlin.jvm.internal.t.i(jArr[i3], jArr[i4]) >= 0) {
                if (kotlin.jvm.internal.t.i(jArr[i4], jArr[i]) >= 0) {
                    return;
                }
                i(i4, i);
                i = i4;
            } else {
                if (kotlin.jvm.internal.t.i(jArr[i3], jArr[i]) >= 0) {
                    return;
                }
                i(i3, i);
                i = i3;
            }
        }
    }

    public final void h(int i) {
        long[] jArr = this.b;
        long j = jArr[i];
        while (i > 0) {
            int i2 = ((i + 1) >> 1) - 1;
            if (kotlin.jvm.internal.t.i(jArr[i2], j) <= 0) {
                return;
            }
            i(i2, i);
            i = i2;
        }
    }

    public final void i(int i, int i2) {
        long[] jArr = this.b;
        int[] iArr = this.c;
        int[] iArr2 = this.d;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }
}
