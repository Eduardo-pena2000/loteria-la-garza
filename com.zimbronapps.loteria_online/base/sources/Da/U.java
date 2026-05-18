package Da;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class u {
    public static List a(List builder) {
        kotlin.jvm.internal.t.g(builder, "builder");
        return ((Ea.b) builder).s();
    }

    public static final Object[] b(Object[] objArr, boolean z) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        if (z && kotlin.jvm.internal.t.c(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static List c() {
        return new Ea.b(0, 1, null);
    }

    public static List d(int i) {
        return new Ea.b(i);
    }

    public static List e(Object obj) {
        List singletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.t.f(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static List f(Iterable iterable) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        List N0 = D.N0(iterable);
        Collections.shuffle(N0);
        return N0;
    }

    public static Object[] g(int i, Object[] array) {
        kotlin.jvm.internal.t.g(array, "array");
        if (i < array.length) {
            array[i] = null;
        }
        return array;
    }
}
