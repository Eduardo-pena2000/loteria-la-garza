package Da;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class w extends v {
    public static List A(Iterable iterable) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            A.D(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }

    public static int y(Iterable iterable, int i) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static final Integer z(Iterable iterable) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }
}
