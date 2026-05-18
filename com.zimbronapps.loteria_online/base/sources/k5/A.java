package K5;

import android.util.SparseArray;
import java.util.HashMap;
import w5.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class a {
    public static SparseArray a = new SparseArray();
    public static HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(f.a, 0);
        b.put(f.b, 1);
        b.put(f.c, 2);
        for (f fVar : b.keySet()) {
            a.append(((Integer) b.get(fVar)).intValue(), fVar);
        }
    }

    public static int a(f fVar) {
        Integer num = (Integer) b.get(fVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + fVar);
    }

    public static f b(int i) {
        f fVar = (f) a.get(i);
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
