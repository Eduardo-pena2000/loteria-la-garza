package ab;

import Da.M;
import Wa.n;
import Za.B;
import Za.E;
import Za.G;
import ab.b;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class d {
    public static final /* synthetic */ long a(long j, int i) {
        return i(j, i);
    }

    public static final /* synthetic */ long b(long j) {
        return j(j);
    }

    public static final /* synthetic */ long c(long j) {
        return k(j);
    }

    public static final /* synthetic */ long d(long j) {
        return l(j);
    }

    public static final /* synthetic */ long e(long j) {
        return m(j);
    }

    public static final /* synthetic */ long f(long j) {
        return n(j);
    }

    public static final /* synthetic */ long g(long j) {
        return o(j);
    }

    public static final /* synthetic */ long h(String str, boolean z) {
        return p(str, z);
    }

    public static final long i(long j, int i) {
        return b.i((j << 1) + i);
    }

    public static final long j(long j) {
        return b.i((j << 1) + 1);
    }

    public static final long k(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? j(n.o(j, -4611686018427387903L, 4611686018427387903L)) : l(n(j));
    }

    public static final long l(long j) {
        return b.i(j << 1);
    }

    public static final long m(long j) {
        return (-4611686018426999999L > j || j >= 4611686018427000000L) ? j(o(j)) : l(j);
    }

    public static final long n(long j) {
        return j * 1000000;
    }

    public static final long o(long j) {
        return j / 1000000;
    }

    public static final long p(String str, boolean z) {
        long j;
        char charAt;
        char charAt2;
        int i;
        char charAt3;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        b.a aVar = b.b;
        long c = aVar.c();
        char charAt4 = str.charAt(0);
        boolean z2 = true;
        int i2 = (charAt4 == '+' || charAt4 == '-') ? 1 : 0;
        boolean z3 = i2 > 0;
        boolean z4 = z3 && E.P0(str, '-', false, 2, null);
        if (length <= i2) {
            throw new IllegalArgumentException("No components");
        }
        char c2 = ':';
        char c3 = '0';
        if (str.charAt(i2) == 'P') {
            int i3 = i2 + 1;
            if (i3 == length) {
                throw new IllegalArgumentException();
            }
            e eVar = null;
            boolean z5 = false;
            while (i3 < length) {
                if (str.charAt(i3) != 'T') {
                    int i4 = i3;
                    while (i4 < str.length() && ((c3 <= (charAt3 = str.charAt(i4)) && charAt3 < c2) || E.S("+-.", charAt3, false, 2, null))) {
                        i4++;
                        c2 = ':';
                        c3 = '0';
                    }
                    t.e(str, "null cannot be cast to non-null type java.lang.String");
                    String substring = str.substring(i3, i4);
                    t.f(substring, "substring(...)");
                    if (substring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length2 = i3 + substring.length();
                    if (length2 < 0 || length2 >= str.length()) {
                        throw new IllegalArgumentException("Missing unit for value " + substring);
                    }
                    char charAt5 = str.charAt(length2);
                    int i5 = length2 + 1;
                    e d = g.d(charAt5, z5);
                    if (eVar != null && eVar.compareTo(d) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int e0 = E.e0(substring, '.', 0, false, 6, null);
                    if (d != e.e || e0 <= 0) {
                        i = i5;
                        c = b.F(c, t(q(substring), d));
                    } else {
                        t.e(substring, "null cannot be cast to non-null type java.lang.String");
                        String substring2 = substring.substring(0, e0);
                        t.f(substring2, "substring(...)");
                        i = i5;
                        long F = b.F(c, t(q(substring2), d));
                        t.e(substring, "null cannot be cast to non-null type java.lang.String");
                        String substring3 = substring.substring(e0);
                        t.f(substring3, "substring(...)");
                        c = b.F(F, r(Double.parseDouble(substring3), d));
                    }
                    i3 = i;
                    eVar = d;
                    c2 = ':';
                    c3 = '0';
                    z2 = true;
                } else {
                    if (z5 || (i3 = i3 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z5 = z2;
                }
            }
        } else {
            if (z) {
                throw new IllegalArgumentException();
            }
            String str2 = "Unexpected order of duration components";
            if (B.B(str, i2, "Infinity", 0, Math.max(length - i2, 8), true)) {
                c = aVar.a();
            } else {
                boolean z6 = !z3;
                if (z3 && str.charAt(i2) == '(' && G.o1(str) == ')') {
                    i2++;
                    length--;
                    if (i2 == length) {
                        throw new IllegalArgumentException("No components");
                    }
                    j = c;
                    z6 = true;
                } else {
                    j = c;
                }
                e eVar2 = null;
                boolean z7 = false;
                while (i2 < length) {
                    if (z7 && z6) {
                        while (i2 < str.length() && str.charAt(i2) == ' ') {
                            i2++;
                        }
                    }
                    int i6 = i2;
                    while (i6 < str.length() && (('0' <= (charAt2 = str.charAt(i6)) && charAt2 < ':') || charAt2 == '.')) {
                        i6++;
                    }
                    t.e(str, "null cannot be cast to non-null type java.lang.String");
                    String substring4 = str.substring(i2, i6);
                    t.f(substring4, "substring(...)");
                    if (substring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i2 + substring4.length();
                    int i7 = length3;
                    while (i7 < str.length() && 'a' <= (charAt = str.charAt(i7)) && charAt < '{') {
                        i7++;
                    }
                    t.e(str, "null cannot be cast to non-null type java.lang.String");
                    String substring5 = str.substring(length3, i7);
                    t.f(substring5, "substring(...)");
                    i2 = length3 + substring5.length();
                    e e = g.e(substring5);
                    if (eVar2 != null && eVar2.compareTo(e) <= 0) {
                        throw new IllegalArgumentException(str2);
                    }
                    String str3 = str2;
                    int e02 = E.e0(substring4, '.', 0, false, 6, null);
                    if (e02 > 0) {
                        t.e(substring4, "null cannot be cast to non-null type java.lang.String");
                        String substring6 = substring4.substring(0, e02);
                        t.f(substring6, "substring(...)");
                        long F2 = b.F(j, t(Long.parseLong(substring6), e));
                        t.e(substring4, "null cannot be cast to non-null type java.lang.String");
                        String substring7 = substring4.substring(e02);
                        t.f(substring7, "substring(...)");
                        j = b.F(F2, r(Double.parseDouble(substring7), e));
                        i2 = i2;
                        if (i2 < length) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        j = b.F(j, t(Long.parseLong(substring4), e));
                    }
                    str2 = str3;
                    eVar2 = e;
                    z7 = true;
                }
                c = j;
            }
        }
        return z4 ? b.L(c) : c;
    }

    public static final long q(String str) {
        int length = str.length();
        int i = (length <= 0 || !E.S("+-", str.charAt(0), false, 2, null)) ? 0 : 1;
        if (length - i > 16) {
            Collection iVar = new Wa.i(i, E.Z(str));
            if (!(iVar instanceof Collection) || !iVar.isEmpty()) {
                Iterator it = iVar.iterator();
                while (it.hasNext()) {
                    char charAt = str.charAt(((M) it).a());
                    if ('0' <= charAt && charAt < ':') {
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        if (B.N(str, "+", false, 2, null)) {
            str = G.l1(str, 1);
        }
        return Long.parseLong(str);
    }

    public static final long r(double d, e unit) {
        t.g(unit, "unit");
        double a = f.a(d, unit, e.b);
        if (Double.isNaN(a)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long e = Sa.c.e(a);
        return (-4611686018426999999L > e || e >= 4611686018427000000L) ? k(Sa.c.e(f.a(d, unit, e.d))) : l(e);
    }

    public static final long s(int i, e unit) {
        t.g(unit, "unit");
        return unit.compareTo(e.e) <= 0 ? l(f.c(i, unit, e.b)) : t(i, unit);
    }

    public static final long t(long j, e unit) {
        t.g(unit, "unit");
        e eVar = e.b;
        long c = f.c(4611686018426999999L, eVar, unit);
        return ((-c) > j || j > c) ? j(n.o(f.b(j, unit, e.d), -4611686018427387903L, 4611686018427387903L)) : l(f.c(j, unit, eVar));
    }
}
