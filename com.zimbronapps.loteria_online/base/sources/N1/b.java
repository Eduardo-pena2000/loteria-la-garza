package n1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b {
    public static final a b = new a(null);
    public final long a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final long a(int i, int i2, int i3, int i4) {
            int i5 = 262142;
            int min = Math.min(i3, 262142);
            int min2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
            int i6 = min2 == Integer.MAX_VALUE ? min : min2;
            if (i6 >= 8191) {
                if (i6 < 32767) {
                    i5 = 65534;
                } else if (i6 < 65535) {
                    i5 = 32766;
                } else {
                    if (i6 >= 262143) {
                        c.m(i6);
                        throw new Ca.i();
                    }
                    i5 = 8190;
                }
            }
            return c.a(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, min, min2);
        }

        public final long b(int i, int i2, int i3, int i4) {
            int i5 = 262142;
            int min = Math.min(i, 262142);
            int min2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
            int i6 = min2 == Integer.MAX_VALUE ? min : min2;
            if (i6 >= 8191) {
                if (i6 < 32767) {
                    i5 = 65534;
                } else if (i6 < 65535) {
                    i5 = 32766;
                } else {
                    if (i6 >= 262143) {
                        c.m(i6);
                        throw new Ca.i();
                    }
                    i5 = 8190;
                }
            }
            return c.a(min, min2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
        }

        public final long c(int i, int i2) {
            if (!((i2 >= 0) & (i >= 0))) {
                m.a("width and height must be >= 0");
            }
            return c.h(i, i, i2, i2);
        }

        public final long d(int i) {
            if (!(i >= 0)) {
                m.a("height must be >= 0");
            }
            return c.h(0, Integer.MAX_VALUE, i, i);
        }

        public final long e(int i) {
            if (!(i >= 0)) {
                m.a("width must be >= 0");
            }
            return c.h(i, i, 0, Integer.MAX_VALUE);
        }

        public a() {
        }
    }

    public /* synthetic */ b(long j) {
        this.a = j;
    }

    public static final /* synthetic */ b a(long j) {
        return new b(j);
    }

    public static final long c(long j, int i, int i2, int i3, int i4) {
        if (!(i2 >= i && i4 >= i3 && i >= 0 && i3 >= 0)) {
            m.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return c.h(i, i2, i3, i4);
    }

    public static /* synthetic */ long d(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = n(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = l(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = m(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = k(j);
        }
        return c(j, i6, i7, i8, i4);
    }

    public static boolean e(long j, Object obj) {
        return (obj instanceof b) && j == ((b) obj).r();
    }

    public static final boolean f(long j, long j2) {
        return j == j2;
    }

    public static final boolean g(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    public static final boolean h(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1)) != 0;
    }

    public static final boolean i(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    public static final boolean j(long j) {
        int i = (int) (3 & j);
        int i2 = (1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1;
        int i3 = ((int) (j >> 2)) & i2;
        int i4 = ((int) (j >> 33)) & i2;
        return i3 == (i4 == 0 ? Integer.MAX_VALUE : i4 - 1);
    }

    public static final int k(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    public static final int l(long j) {
        int i = (int) (3 & j);
        int i2 = ((int) (j >> 33)) & ((1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1);
        if (i2 == 0) {
            return Integer.MAX_VALUE;
        }
        return i2 - 1;
    }

    public static final int m(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    public static final int n(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1);
    }

    public static int o(long j) {
        return Long.hashCode(j);
    }

    public static final boolean p(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        return ((((int) (j >> 33)) & ((1 << (i2 + 13)) - 1)) - 1 == 0) | ((((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) - 1 == 0);
    }

    public static String q(long j) {
        int l = l(j);
        String valueOf = l == Integer.MAX_VALUE ? "Infinity" : String.valueOf(l);
        int k = k(j);
        return "Constraints(minWidth = " + n(j) + ", maxWidth = " + valueOf + ", minHeight = " + m(j) + ", maxHeight = " + (k != Integer.MAX_VALUE ? String.valueOf(k) : "Infinity") + ')';
    }

    public boolean equals(Object obj) {
        return e(this.a, obj);
    }

    public int hashCode() {
        return o(this.a);
    }

    public final /* synthetic */ long r() {
        return this.a;
    }

    public String toString() {
        return q(this.a);
    }

    public static long b(long j) {
        return j;
    }
}
