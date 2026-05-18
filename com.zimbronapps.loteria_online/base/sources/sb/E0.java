package sb;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class e0 {
    public static final qb.e[] a = new qb.e[0];

    public static final Set a(qb.e eVar) {
        kotlin.jvm.internal.t.g(eVar, "<this>");
        if (eVar instanceof l) {
            return ((l) eVar).a();
        }
        HashSet hashSet = new HashSet(eVar.d());
        int d = eVar.d();
        for (int i = 0; i < d; i++) {
            hashSet.add(eVar.e(i));
        }
        return hashSet;
    }

    public static final qb.e[] b(List list) {
        qb.e[] eVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (eVarArr = (qb.e[]) list.toArray(new qb.e[0])) == null) ? a : eVarArr;
    }
}
