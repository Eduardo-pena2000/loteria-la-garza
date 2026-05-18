package io.flutter.plugin.platform;

import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class l implements k {
    public final Map a = new HashMap();

    public boolean a(String str, j jVar) {
        if (this.a.containsKey(str)) {
            return false;
        }
        this.a.put(str, jVar);
        return true;
    }

    public j b(String str) {
        return (j) this.a.get(str);
    }
}
