package Wa;

import Wa.g;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class n extends m {
    public static double c(double d, double d2) {
        return d < d2 ? d2 : d;
    }

    public static float d(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static int e(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static long f(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static double g(double d, double d2) {
        return d > d2 ? d2 : d;
    }

    public static float h(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public static int i(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static long j(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static double k(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static float l(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int m(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static int n(int i, f range) {
        t.g(range, "range");
        if (range instanceof e) {
            return q(Integer.valueOf(i), (e) range).intValue();
        }
        if (!range.isEmpty()) {
            return i < range.b().intValue() ? range.b().intValue() : i > range.e().intValue() ? range.e().intValue() : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static long o(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    public static long p(long j, f range) {
        t.g(range, "range");
        if (range instanceof e) {
            return q(Long.valueOf(j), (e) range).longValue();
        }
        if (!range.isEmpty()) {
            return j < range.b().longValue() ? range.b().longValue() : j > range.e().longValue() ? range.e().longValue() : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static final Comparable q(Comparable comparable, e range) {
        t.g(comparable, "<this>");
        t.g(range, "range");
        if (!range.isEmpty()) {
            return (!range.a(comparable, range.b()) || range.a(range.b(), comparable)) ? (!range.a(range.e(), comparable) || range.a(comparable, range.e())) ? comparable : range.e() : range.b();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static Comparable r(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        t.g(comparable, "<this>");
        if (comparable2 == null || comparable3 == null) {
            if (comparable2 != null && comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable3 != null && comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        } else {
            if (comparable2.compareTo(comparable3) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + comparable3 + " is less than minimum " + comparable2 + '.');
            }
            if (comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        }
        return comparable;
    }

    public static g s(int i, int i2) {
        return g.d.a(i, i2, -1);
    }

    public static long t(l lVar, Ua.c random) {
        t.g(lVar, "<this>");
        t.g(random, "random");
        try {
            return Ua.d.d(random, lVar);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public static g u(g gVar) {
        t.g(gVar, "<this>");
        return g.d.a(gVar.g(), gVar.f(), -gVar.h());
    }

    public static g v(g gVar, int i) {
        t.g(gVar, "<this>");
        m.a(i > 0, Integer.valueOf(i));
        g.a aVar = g.d;
        int f = gVar.f();
        int g = gVar.g();
        if (gVar.h() <= 0) {
            i = -i;
        }
        return aVar.a(f, g, i);
    }

    public static i w(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? i.e.a() : new i(i, i2 - 1);
    }
}
