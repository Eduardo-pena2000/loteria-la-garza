package P2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import t7.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b {
    public static t7.r a(s7.g gVar, List list) {
        r.a j = t7.r.j();
        for (int i = 0; i < list.size(); i++) {
            j.h(gVar.apply((Bundle) a.e((Bundle) list.get(i))));
        }
        return j.k();
    }

    public static ArrayList b(Collection collection, s7.g gVar) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) gVar.apply(it.next()));
        }
        return arrayList;
    }
}
