package ab;

import Wa.n;
import Za.E;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class b implements Comparable {
    public static final a b = new a(null);
    public static final long c = i(0);
    public static final long d = d.b(4611686018427387903L);
    public static final long e = d.b(-4611686018427387903L);
    public final long a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final long a() {
            return b.a();
        }

        public final long b() {
            return b.b();
        }

        public final long c() {
            return b.c();
        }

        public final long d(String value) {
            t.g(value, "value");
            try {
                return d.h(value, true);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e);
            }
        }

        public a() {
        }
    }

    public /* synthetic */ b(long j) {
        this.a = j;
    }

    public static final boolean A(long j) {
        return (((int) j) & 1) == 1;
    }

    public static final boolean B(long j) {
        return (((int) j) & 1) == 0;
    }

    public static final boolean C(long j) {
        return j == d || j == e;
    }

    public static final boolean D(long j) {
        return j < 0;
    }

    public static final boolean E(long j) {
        return j > 0;
    }

    public static final long F(long j, long j2) {
        if (C(j)) {
            if (z(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (C(j2)) {
            return j2;
        }
        if ((((int) j) & 1) != (((int) j2) & 1)) {
            return A(j) ? d(j, x(j), x(j2)) : d(j, x(j2), x(j));
        }
        long x = x(j) + x(j2);
        return B(j) ? d.e(x) : d.c(x);
    }

    public static final long G(long j, int i) {
        if (C(j)) {
            if (i != 0) {
                return i > 0 ? j : L(j);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i == 0) {
            return c;
        }
        long x = x(j);
        long j2 = i;
        long j3 = x * j2;
        if (!B(j)) {
            return j3 / j2 == x ? d.b(n.p(j3, new Wa.l(-4611686018427387903L, 4611686018427387903L))) : Sa.c.b(x) * Sa.c.a(i) > 0 ? d : e;
        }
        if (-2147483647L <= x && x < 2147483648L) {
            return d.d(j3);
        }
        if (j3 / j2 == x) {
            return d.e(j3);
        }
        long g = d.g(x);
        long j4 = g * j2;
        long g2 = d.g((x - d.f(g)) * j2) + j4;
        return (j4 / j2 != g || (g2 ^ j4) < 0) ? Sa.c.b(x) * Sa.c.a(i) > 0 ? d : e : d.b(n.p(g2, new Wa.l(-4611686018427387903L, 4611686018427387903L)));
    }

    public static final double H(long j, e unit) {
        t.g(unit, "unit");
        if (j == d) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == e) {
            return Double.NEGATIVE_INFINITY;
        }
        return f.a(x(j), w(j), unit);
    }

    public static final String I(long j) {
        StringBuilder sb = new StringBuilder();
        if (D(j)) {
            sb.append('-');
        }
        sb.append("PT");
        long m = m(j);
        long p = p(m);
        int t = t(m);
        int v = v(m);
        int u = u(m);
        if (C(j)) {
            p = 9999999999999L;
        }
        boolean z = false;
        boolean z2 = p != 0;
        boolean z3 = (v == 0 && u == 0) ? false : true;
        if (t != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(p);
            sb.append('H');
        }
        if (z) {
            sb.append(t);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            e(j, sb, v, u, 9, "S", true);
        }
        return sb.toString();
    }

    public static final long J(long j, e unit) {
        t.g(unit, "unit");
        if (j == d) {
            return Long.MAX_VALUE;
        }
        if (j == e) {
            return Long.MIN_VALUE;
        }
        return f.b(x(j), w(j), unit);
    }

    public static String K(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == d) {
            return "Infinity";
        }
        if (j == e) {
            return "-Infinity";
        }
        boolean D = D(j);
        StringBuilder sb = new StringBuilder();
        if (D) {
            sb.append('-');
        }
        long m = m(j);
        long o = o(m);
        int n = n(m);
        int t = t(m);
        int v = v(m);
        int u = u(m);
        int i = 0;
        boolean z = o != 0;
        boolean z2 = n != 0;
        boolean z3 = t != 0;
        boolean z4 = (v == 0 && u == 0) ? false : true;
        if (z) {
            sb.append(o);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(n);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(t);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (v != 0 || z || z2 || z3) {
                e(j, sb, v, u, 9, "s", false);
            } else if (u >= 1000000) {
                e(j, sb, u / 1000000, u % 1000000, 6, "ms", false);
            } else if (u >= 1000) {
                e(j, sb, u / 1000, u % 1000, 3, "us", false);
            } else {
                sb.append(u);
                sb.append("ns");
            }
            i = i4;
        }
        if (D && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long L(long j) {
        return d.a(-x(j), ((int) j) & 1);
    }

    public static final /* synthetic */ long a() {
        return d;
    }

    public static final /* synthetic */ long b() {
        return e;
    }

    public static final /* synthetic */ long c() {
        return c;
    }

    public static final long d(long j, long j2, long j3) {
        long g = d.g(j3);
        long j4 = j2 + g;
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            return d.b(n.o(j4, -4611686018427387903L, 4611686018427387903L));
        }
        return d.d(d.f(j4) + (j3 - d.f(g)));
    }

    public static final void e(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String t0 = E.t0(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = t0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (t0.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append(t0, 0, ((i4 + 3) / 3) * 3);
                t.f(sb, "append(...)");
            } else {
                sb.append(t0, 0, i6);
                t.f(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    public static final /* synthetic */ b f(long j) {
        return new b(j);
    }

    public static int h(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return t.i(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return D(j) ? -i : i;
    }

    public static long i(long j) {
        if (c.a()) {
            if (B(j)) {
                long x = x(j);
                if (-4611686018426999999L > x || x >= 4611686018427000000L) {
                    throw new AssertionError(x(j) + " ns is out of nanoseconds range");
                }
            } else {
                long x2 = x(j);
                if (-4611686018427387903L > x2 || x2 >= 4611686018427387904L) {
                    throw new AssertionError(x(j) + " ms is out of milliseconds range");
                }
                long x3 = x(j);
                if (-4611686018426L <= x3 && x3 < 4611686018427L) {
                    throw new AssertionError(x(j) + " ms is denormalized");
                }
            }
        }
        return j;
    }

    public static boolean k(long j, Object obj) {
        return (obj instanceof b) && j == ((b) obj).M();
    }

    public static final boolean l(long j, long j2) {
        return j == j2;
    }

    public static final long m(long j) {
        return D(j) ? L(j) : j;
    }

    public static final int n(long j) {
        if (C(j)) {
            return 0;
        }
        return (int) (p(j) % 24);
    }

    public static final long o(long j) {
        return J(j, e.h);
    }

    public static final long p(long j) {
        return J(j, e.g);
    }

    public static final long q(long j) {
        return (A(j) && z(j)) ? x(j) : J(j, e.d);
    }

    public static final long r(long j) {
        return J(j, e.f);
    }

    public static final long s(long j) {
        return J(j, e.e);
    }

    public static final int t(long j) {
        if (C(j)) {
            return 0;
        }
        return (int) (r(j) % 60);
    }

    public static final int u(long j) {
        if (C(j)) {
            return 0;
        }
        return (int) (A(j) ? d.f(x(j) % 1000) : x(j) % 1000000000);
    }

    public static final int v(long j) {
        if (C(j)) {
            return 0;
        }
        return (int) (s(j) % 60);
    }

    public static final e w(long j) {
        return B(j) ? e.b : e.d;
    }

    public static final long x(long j) {
        return j >> 1;
    }

    public static int y(long j) {
        return Long.hashCode(j);
    }

    public static final boolean z(long j) {
        return !C(j);
    }

    public final /* synthetic */ long M() {
        return this.a;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return g(((b) obj).M());
    }

    public boolean equals(Object obj) {
        return k(this.a, obj);
    }

    public int g(long j) {
        return h(this.a, j);
    }

    public int hashCode() {
        return y(this.a);
    }

    public String toString() {
        return K(this.a);
    }
}
