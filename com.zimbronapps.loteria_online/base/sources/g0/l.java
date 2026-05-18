package g0;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class l extends Da.g implements Collection, Ra.b {
    public final f a;

    public l(f fVar) {
        this.a = fVar;
    }

    public int a() {
        return this.a.size();
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.a.clear();
    }

    public boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    public Iterator iterator() {
        return new m(this.a);
    }
}
