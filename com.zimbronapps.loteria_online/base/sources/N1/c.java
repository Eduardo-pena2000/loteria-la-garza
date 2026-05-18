package n1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class c {
    public static final long a(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            m.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return h(i, i2, i3, i4);
    }

    public static /* synthetic */ long b(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return a(i, i2, i3, i4);
    }

    public static final int c(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    public static final long d(long j, long j2) {
        int i = (int) (j2 >> 32);
        int n = b.n(j);
        int l = b.l(j);
        if (i < n) {
            i = n;
        }
        if (i <= l) {
            l = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int m = b.m(j);
        int k = b.k(j);
        if (i2 < m) {
            i2 = m;
        }
        if (i2 <= k) {
            k = i2;
        }
        return r.c((l << 32) | (k & 4294967295L));
    }

    public static final long e(long j, long j2) {
        int n = b.n(j);
        int l = b.l(j);
        int m = b.m(j);
        int k = b.k(j);
        int n2 = b.n(j2);
        if (n2 < n) {
            n2 = n;
        }
        if (n2 > l) {
            n2 = l;
        }
        int l2 = b.l(j2);
        if (l2 >= n) {
            n = l2;
        }
        if (n <= l) {
            l = n;
        }
        int m2 = b.m(j2);
        if (m2 < m) {
            m2 = m;
        }
        if (m2 > k) {
            m2 = k;
        }
        int k2 = b.k(j2);
        if (k2 >= m) {
            m = k2;
        }
        if (m <= k) {
            k = m;
        }
        return a(n2, l, m2, k);
    }

    public static final int f(long j, int i) {
        int m = b.m(j);
        int k = b.k(j);
        if (i < m) {
            i = m;
        }
        return i > k ? k : i;
    }

    public static final int g(long j, int i) {
        int n = b.n(j);
        int l = b.l(j);
        if (i < n) {
            i = n;
        }
        return i > l ? l : i;
    }

    public static final long h(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int c = c(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int c2 = c(i6);
        if (c + c2 > 31) {
            l(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = c2 - 13;
        return b.b(((i7 & (~(i7 >> 31))) << 33) | ((i9 >> 1) + (i9 & 1)) | (i << 2) | (i3 << (c2 + 2)) | ((i8 & (~(i8 >> 31))) << (c2 + 33)));
    }

    public static final boolean i(long j, long j2) {
        int n = b.n(j);
        int l = b.l(j);
        int i = (int) (j2 >> 32);
        if (n <= i && i <= l) {
            int m = b.m(j);
            int k = b.k(j);
            int i2 = (int) (j2 & 4294967295L);
            if (m <= i2 && i2 <= k) {
                return true;
            }
        }
        return false;
    }

    public static final long j(long j, int i, int i2) {
        int n = b.n(j) + i;
        if (n < 0) {
            n = 0;
        }
        int l = b.l(j);
        if (l != Integer.MAX_VALUE && (l = l + i) < 0) {
            l = 0;
        }
        int m = b.m(j) + i2;
        if (m < 0) {
            m = 0;
        }
        int k = b.k(j);
        return a(n, l, m, (k == Integer.MAX_VALUE || (k = k + i2) >= 0) ? k : 0);
    }

    public static /* synthetic */ long k(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return j(j, i, i2);
    }

    public static final void l(int i, int i2) {
        throw new IllegalArgumentException("Can't represent a width of " + i + " and height of " + i2 + " in Constraints");
    }

    public static final Void m(int i) {
        throw new IllegalArgumentException("Can't represent a size of " + i + " in Constraints");
    }
}
