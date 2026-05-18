package g0;

import java.util.Iterator;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j extends Da.j implements Set, Ra.f {
    public final f a;

    public j(f fVar) {
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
        return this.a.containsKey(obj);
    }

    public Iterator iterator() {
        return new k(this.a);
    }

    public boolean remove(Object obj) {
        if (!this.a.containsKey(obj)) {
            return false;
        }
        this.a.remove(obj);
        return true;
    }
}
