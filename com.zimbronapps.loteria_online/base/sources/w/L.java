package W;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class l {
    public final Map a = new LinkedHashMap();
    public final Map b = new LinkedHashMap();

    public final k a(n nVar) {
        return (k) this.b.get(nVar);
    }

    public final n b(k kVar) {
        return (n) this.a.get(kVar);
    }

    public final void c(k kVar) {
        n nVar = (n) this.a.get(kVar);
        if (nVar != null) {
        }
        this.a.remove(kVar);
    }

    public final void d(k kVar, n nVar) {
        this.a.put(kVar, nVar);
        this.b.put(nVar, kVar);
    }
}
