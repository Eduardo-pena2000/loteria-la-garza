package ab;

import ab.b;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class h {
    public static final long a(long j) {
        return j < 0 ? b.b.b() : b.b.a();
    }

    public static final long b(long j, long j2, e unit) {
        t.g(unit, "unit");
        return (1 | (j2 - 1)) == Long.MAX_VALUE ? b.L(a(j2)) : c(j, j2, unit);
    }

    public static final long c(long j, long j2, e eVar) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return d.t(j3, eVar);
        }
        e eVar2 = e.d;
        if (eVar.compareTo(eVar2) >= 0) {
            return b.L(a(j3));
        }
        long b = f.b(1L, eVar2, eVar);
        long j4 = (j / b) - (j2 / b);
        long j5 = (j % b) - (j2 % b);
        b.a aVar = b.b;
        return b.F(d.t(j4, eVar2), d.t(j5, eVar));
    }

    public static final long d(long j, long j2, e unit) {
        t.g(unit, "unit");
        return ((j2 - 1) | 1) == Long.MAX_VALUE ? j == j2 ? b.b.c() : b.L(a(j2)) : (1 | (j - 1)) == Long.MAX_VALUE ? a(j) : c(j, j2, unit);
    }
}
