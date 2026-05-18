package Da;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class v extends u {
    public static ArrayList h(Object... elements) {
        kotlin.jvm.internal.t.g(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new l(elements, true));
    }

    public static final Collection i(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        return new l(objArr, false);
    }

    public static final int j(List list, int i, int i2, Qa.l comparison) {
        kotlin.jvm.internal.t.g(list, "<this>");
        kotlin.jvm.internal.t.g(comparison, "comparison");
        v(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int intValue = ((Number) comparison.invoke(list.get(i4))).intValue();
            if (intValue < 0) {
                i = i4 + 1;
            } else {
                if (intValue <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    public static final int k(List list, Comparable comparable, int i, int i2) {
        kotlin.jvm.internal.t.g(list, "<this>");
        v(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int d = Fa.b.d((Comparable) list.get(i4), comparable);
            if (d < 0) {
                i = i4 + 1;
            } else {
                if (d <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    public static /* synthetic */ int l(List list, int i, int i2, Qa.l lVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = list.size();
        }
        return j(list, i, i2, lVar);
    }

    public static /* synthetic */ int m(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return k(list, comparable, i, i2);
    }

    public static List n() {
        return F.a;
    }

    public static Wa.i o(Collection collection) {
        kotlin.jvm.internal.t.g(collection, "<this>");
        return new Wa.i(0, collection.size() - 1);
    }

    public static int p(List list) {
        kotlin.jvm.internal.t.g(list, "<this>");
        return list.size() - 1;
    }

    public static List q(Object... elements) {
        kotlin.jvm.internal.t.g(elements, "elements");
        return elements.length > 0 ? p.c(elements) : n();
    }

    public static List r(Object obj) {
        return obj != null ? u.e(obj) : n();
    }

    public static List s(Object... elements) {
        kotlin.jvm.internal.t.g(elements, "elements");
        return r.R(elements);
    }

    public static List t(Object... elements) {
        kotlin.jvm.internal.t.g(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new l(elements, true));
    }

    public static final List u(List list) {
        kotlin.jvm.internal.t.g(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : u.e(list.get(0)) : n();
    }

    public static final void v(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than zero.");
        }
        if (i3 <= i) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i + ").");
    }

    public static void w() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void x() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
