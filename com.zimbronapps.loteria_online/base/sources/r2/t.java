package R2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class t {
    public final Map a = new HashMap();
    public Map b;

    public synchronized void a(Map map) {
        this.b = null;
        this.a.clear();
        this.a.putAll(map);
    }

    public synchronized Map b() {
        try {
            if (this.b == null) {
                this.b = Collections.unmodifiableMap(new HashMap(this.a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
