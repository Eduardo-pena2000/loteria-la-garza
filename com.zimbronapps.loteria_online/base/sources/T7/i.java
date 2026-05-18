package t7;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class i {

    public static class a extends AbstractCollection {
        public final Collection a;
        public final s7.n b;

        public a(Collection collection, s7.n nVar) {
            this.a = collection;
            this.b = nVar;
        }

        public boolean add(Object obj) {
            s7.m.d(this.b.apply(obj));
            return this.a.add(obj);
        }

        public boolean addAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                s7.m.d(this.b.apply(it.next()));
            }
            return this.a.addAll(collection);
        }

        public void clear() {
            u.h(this.a, this.b);
        }

        public boolean contains(Object obj) {
            if (i.c(this.a, obj)) {
                return this.b.apply(obj);
            }
            return false;
        }

        public boolean containsAll(Collection collection) {
            return i.a(this, collection);
        }

        public boolean isEmpty() {
            return !u.a(this.a, this.b);
        }

        public Iterator iterator() {
            return v.g(this.a.iterator(), this.b);
        }

        public boolean remove(Object obj) {
            return contains(obj) && this.a.remove(obj);
        }

        public boolean removeAll(Collection collection) {
            Iterator it = this.a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        public boolean retainAll(Collection collection) {
            Iterator it = this.a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        public int size() {
            Iterator it = this.a.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (this.b.apply(it.next())) {
                    i++;
                }
            }
            return i;
        }

        public Object[] toArray() {
            return x.i(iterator()).toArray();
        }

        public Object[] toArray(Object[] objArr) {
            return x.i(iterator()).toArray(objArr);
        }
    }

    public static boolean a(Collection collection, Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static StringBuilder b(int i) {
        h.b(i, "size");
        return new StringBuilder((int) Math.min(i * 8, 1073741824L));
    }

    public static boolean c(Collection collection, Object obj) {
        s7.m.j(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
