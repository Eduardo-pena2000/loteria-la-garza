package Da;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class z extends y {
    public static void B(List list) {
        kotlin.jvm.internal.t.g(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void C(List list, Comparator comparator) {
        kotlin.jvm.internal.t.g(list, "<this>");
        kotlin.jvm.internal.t.g(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
