package Fa;

import Qa.l;
import java.util.Comparator;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class b {
    public static /* synthetic */ int a(l[] lVarArr, Object obj, Object obj2) {
        return c(lVarArr, obj, obj2);
    }

    public static Comparator b(l... selectors) {
        t.g(selectors, "selectors");
        if (selectors.length > 0) {
            return new a(selectors);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final int c(l[] lVarArr, Object obj, Object obj2) {
        return e(obj, obj2, lVarArr);
    }

    public static int d(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final int e(Object obj, Object obj2, l[] lVarArr) {
        for (l lVar : lVarArr) {
            int d = d((Comparable) lVar.invoke(obj), (Comparable) lVar.invoke(obj2));
            if (d != 0) {
                return d;
            }
        }
        return 0;
    }

    public static Comparator f() {
        d dVar = d.a;
        t.e(dVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return dVar;
    }
}
