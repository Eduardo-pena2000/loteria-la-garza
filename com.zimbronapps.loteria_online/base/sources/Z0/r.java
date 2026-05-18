package Z0;

import Z0.e;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class r {
    public static final /* synthetic */ List a(List list, int i, int i2) {
        return b(list, i, i2);
    }

    public static final List b(List list, int i, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            e.d dVar = (e.d) list.get(i3);
            if (g.j(i, i2, dVar.h(), dVar.f())) {
                if (!(i <= dVar.h() && dVar.f() <= i2)) {
                    g1.a.a("placeholder can not overlap with paragraph.");
                }
                arrayList.add(new e.d(dVar.g(), dVar.h() - i, dVar.f() - i));
            }
        }
        return arrayList;
    }
}
