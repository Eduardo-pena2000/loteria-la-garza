package g0;

import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n extends Da.k implements e0.d {
    public final d b;

    public n(d dVar) {
        this.b = dVar;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return e((Map.Entry) obj);
        }
        return false;
    }

    public boolean e(Map.Entry entry) {
        if (entry == null) {
            return false;
        }
        Object obj = this.b.get(entry.getKey());
        return obj != null ? kotlin.jvm.internal.t.c(obj, entry.getValue()) : entry.getValue() == null && this.b.containsKey(entry.getKey());
    }

    public int getSize() {
        return this.b.size();
    }

    public Iterator iterator() {
        return new o(this.b.s());
    }
}
