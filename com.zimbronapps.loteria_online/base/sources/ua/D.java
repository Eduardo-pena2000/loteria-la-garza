package Ua;

import Wa.l;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class d {
    public static final String a(Object from, Object until) {
        t.g(from, "from");
        t.g(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    public static final void b(long j, long j2) {
        if (j2 <= j) {
            throw new IllegalArgumentException(a(Long.valueOf(j), Long.valueOf(j2)).toString());
        }
    }

    public static final int c(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static final long d(c cVar, l range) {
        t.g(cVar, "<this>");
        t.g(range, "range");
        if (!range.isEmpty()) {
            return range.g() < Long.MAX_VALUE ? cVar.f(range.f(), range.g() + 1) : range.f() > Long.MIN_VALUE ? cVar.f(range.f() - 1, range.g()) + 1 : cVar.e();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final int e(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }
}
