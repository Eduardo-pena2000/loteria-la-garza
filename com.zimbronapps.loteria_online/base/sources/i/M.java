package I;

import I.C;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class m {
    public static final List a(r rVar, C c, i iVar) {
        if (!iVar.d() && c.isEmpty()) {
            return Da.v.n();
        }
        ArrayList arrayList = new ArrayList();
        Wa.i iVar2 = iVar.d() ? new Wa.i(iVar.c(), Math.min(iVar.b(), rVar.c() - 1)) : Wa.i.e.a();
        int size = c.size();
        for (int i = 0; i < size; i++) {
            C.a aVar = (C.a) c.get(i);
            int a = s.a(rVar, aVar.getKey(), aVar.getIndex());
            int f = iVar2.f();
            if ((a > iVar2.g() || f > a) && a >= 0 && a < rVar.c()) {
                arrayList.add(Integer.valueOf(a));
            }
        }
        int f2 = iVar2.f();
        int g = iVar2.g();
        if (f2 <= g) {
            while (true) {
                arrayList.add(Integer.valueOf(f2));
                if (f2 == g) {
                    break;
                }
                f2++;
            }
        }
        return arrayList;
    }
}
