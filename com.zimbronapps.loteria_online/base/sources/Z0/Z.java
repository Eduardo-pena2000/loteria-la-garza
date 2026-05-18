package Z0;

import d1.u;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class z {
    public static final y a(String str, Y0 y0, List list, List list2, n1.d dVar, u.b bVar) {
        return i1.f.a(str, y0, list, list2, dVar, bVar);
    }

    public static final y b(String str, Y0 y0, List list, n1.d dVar, u.b bVar, List list2) {
        return i1.f.a(str, y0, list, list2, dVar, bVar);
    }

    public static /* synthetic */ y c(String str, Y0 y0, List list, List list2, n1.d dVar, u.b bVar, int i, Object obj) {
        if ((i & 4) != 0) {
            list = Da.v.n();
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = Da.v.n();
        }
        return a(str, y0, list3, list2, dVar, bVar);
    }
}
