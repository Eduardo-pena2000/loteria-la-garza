package androidx.work;

import G4.i;
import androidx.work.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class OverwritingInputMerger extends i {
    public b b(List list) {
        b.a aVar = new b.a();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashMap.putAll(((b) it.next()).h());
        }
        aVar.d(hashMap);
        return aVar.a();
    }
}
