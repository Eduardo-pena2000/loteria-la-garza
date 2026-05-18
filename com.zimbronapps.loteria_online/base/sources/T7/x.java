package t7;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class x {

    public static class a extends AbstractList implements RandomAccess, Serializable {
        public final List a;
        public final s7.g b;

        public class a extends T {
            public a(ListIterator listIterator) {
                super(listIterator);
            }

            public Object a(Object obj) {
                return a.this.b.apply(obj);
            }
        }

        public a(List list, s7.g gVar) {
            this.a = (List) s7.m.j(list);
            this.b = (s7.g) s7.m.j(gVar);
        }

        public Object get(int i) {
            return this.b.apply(this.a.get(i));
        }

        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        public Iterator iterator() {
            return listIterator();
        }

        public ListIterator listIterator(int i) {
            return new a(this.a.listIterator(i));
        }

        public Object remove(int i) {
            return this.b.apply(this.a.remove(i));
        }

        public void removeRange(int i, int i2) {
            this.a.subList(i, i2).clear();
        }

        public int size() {
            return this.a.size();
        }
    }

    public static class b extends AbstractSequentialList implements Serializable {
        public final List a;
        public final s7.g b;

        public class a extends T {
            public a(ListIterator listIterator) {
                super(listIterator);
            }

            public Object a(Object obj) {
                return b.this.b.apply(obj);
            }
        }

        public b(List list, s7.g gVar) {
            this.a = (List) s7.m.j(list);
            this.b = (s7.g) s7.m.j(gVar);
        }

        public ListIterator listIterator(int i) {
            return new a(this.a.listIterator(i));
        }

        public void removeRange(int i, int i2) {
            this.a.subList(i, i2).clear();
        }

        public int size() {
            return this.a.size();
        }
    }

    public static List a(Iterable iterable) {
        return (List) iterable;
    }

    public static int b(int i) {
        h.b(i, "arraySize");
        return w7.f.l(i + 5 + (i / 10));
    }

    public static boolean c(List list, Object obj) {
        if (obj == s7.m.j(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return v.e(list.iterator(), list2.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!s7.k.a(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static int d(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return e(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (s7.k.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public static int e(List list, Object obj) {
        int size = list.size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < size) {
            if (obj.equals(list.get(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int f(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return g(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (s7.k.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static int g(List list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static ArrayList h() {
        return new ArrayList();
    }

    public static ArrayList i(Iterator it) {
        ArrayList h = h();
        v.a(h, it);
        return h;
    }

    public static ArrayList j(Object... objArr) {
        s7.m.j(objArr);
        ArrayList arrayList = new ArrayList(b(objArr.length));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static List k(List list, s7.g gVar) {
        return list instanceof RandomAccess ? new a(list, gVar) : new b(list, gVar);
    }
}
