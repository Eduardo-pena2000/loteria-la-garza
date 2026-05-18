package t9;

import java.util.HashMap;
import java.util.Map;
import r9.C;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class h {
    public static Map a(e eVar) {
        C g = eVar.g();
        if (g == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sql", g.c());
        hashMap.put("arguments", g.b());
        return hashMap;
    }
}
