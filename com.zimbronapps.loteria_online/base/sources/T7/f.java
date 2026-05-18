package t7;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class f implements A {
    public transient Set a;
    public transient Collection b;
    public transient Map c;

    public class a extends AbstractCollection {
        public a() {
        }

        public void clear() {
            f.this.clear();
        }

        public boolean contains(Object obj) {
            return f.this.b(obj);
        }

        public Iterator iterator() {
            return f.this.g();
        }

        public int size() {
            return f.this.size();
        }
    }

    public Map a() {
        Map map = this.c;
        if (map != null) {
            return map;
        }
        Map c = c();
        this.c = c;
        return c;
    }

    public boolean b(Object obj) {
        Iterator it = a().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map c();

    public abstract Set d();

    public abstract Collection e();

    public boolean equals(Object obj) {
        return D.a(this, obj);
    }

    public Set f() {
        Set set = this.a;
        if (set != null) {
            return set;
        }
        Set d = d();
        this.a = d;
        return d;
    }

    public abstract Iterator g();

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }

    public Collection values() {
        Collection collection = this.b;
        if (collection != null) {
            return collection;
        }
        Collection e = e();
        this.b = e;
        return e;
    }
}
