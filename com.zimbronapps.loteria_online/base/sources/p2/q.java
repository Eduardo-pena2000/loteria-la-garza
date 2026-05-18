package P2;

import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class q {
    public int a;
    public int b;
    public int c;
    public long[] d;
    public int e;

    public q() {
        this(16);
    }

    public void a() {
        this.a = 0;
        this.b = -1;
        this.c = 0;
    }

    public long b() {
        if (this.c != 0) {
            return this.d[this.a];
        }
        throw new NoSuchElementException();
    }

    public boolean c() {
        return this.c == 0;
    }

    public long d() {
        int i = this.c;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.d;
        int i2 = this.a;
        long j = jArr[i2];
        this.a = this.e & (i2 + 1);
        this.c = i - 1;
        return j;
    }

    public q(int i) {
        a.a(i >= 0 && i <= 1073741824);
        i = i == 0 ? 1 : i;
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.a = 0;
        this.b = -1;
        this.c = 0;
        long[] jArr = new long[i];
        this.d = jArr;
        this.e = jArr.length - 1;
    }
}
