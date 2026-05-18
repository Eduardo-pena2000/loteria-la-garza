package t7;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class m extends n implements Map {
    public abstract Map b();

    public void clear() {
        b().clear();
    }

    public boolean containsKey(Object obj) {
        return b().containsKey(obj);
    }

    public boolean e(Object obj) {
        return z.b(this, obj);
    }

    public Set entrySet() {
        return b().entrySet();
    }

    public boolean f(Object obj) {
        return z.c(this, obj);
    }

    public int g() {
        return P.d(entrySet());
    }

    public Object get(Object obj) {
        return b().get(obj);
    }

    public boolean isEmpty() {
        return b().isEmpty();
    }

    public Set keySet() {
        return b().keySet();
    }

    public Object put(Object obj, Object obj2) {
        return b().put(obj, obj2);
    }

    public void putAll(Map map) {
        b().putAll(map);
    }

    public Object remove(Object obj) {
        return b().remove(obj);
    }

    public int size() {
        return b().size();
    }

    public Collection values() {
        return b().values();
    }
}
