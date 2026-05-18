package ab;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class f {
    public static final double a(double d, e sourceUnit, e targetUnit) {
        t.g(sourceUnit, "sourceUnit");
        t.g(targetUnit, "targetUnit");
        long convert = targetUnit.b().convert(1L, sourceUnit.b());
        return convert > 0 ? d * convert : d / sourceUnit.b().convert(1L, targetUnit.b());
    }

    public static final long b(long j, e sourceUnit, e targetUnit) {
        t.g(sourceUnit, "sourceUnit");
        t.g(targetUnit, "targetUnit");
        return targetUnit.b().convert(j, sourceUnit.b());
    }

    public static final long c(long j, e sourceUnit, e targetUnit) {
        t.g(sourceUnit, "sourceUnit");
        t.g(targetUnit, "targetUnit");
        return targetUnit.b().convert(j, sourceUnit.b());
    }
}
