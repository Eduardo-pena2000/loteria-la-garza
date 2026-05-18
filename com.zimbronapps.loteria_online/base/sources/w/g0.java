package w;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class g0 implements Set, Ra.a {
    public final e0 a;

    public g0(e0 e0Var) {
        kotlin.jvm.internal.t.g(e0Var, "parent");
        this.a = e0Var;
    }

    public int a() {
        return this.a.d;
    }

    public boolean contains(Object obj) {
        return this.a.a(obj);
    }

    public boolean containsAll(Collection collection) {
        kotlin.jvm.internal.t.g(collection, "elements");
        Iterator it = ((Iterable) collection).iterator();
        while (it.hasNext()) {
            if (!this.a.a(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.t.c(this.a, ((g0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean isEmpty() {
        return this.a.d();
    }

    public final /* bridge */ int size() {
        return a();
    }

    public Object[] toArray() {
        return kotlin.jvm.internal.j.a(this);
    }

    public String toString() {
        return this.a.toString();
    }

    public Object[] toArray(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "array");
        return kotlin.jvm.internal.j.b(this, objArr);
    }
}
