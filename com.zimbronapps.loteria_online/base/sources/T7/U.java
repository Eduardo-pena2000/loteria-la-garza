package t7;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class u {
    public static boolean a(Iterable iterable, s7.n nVar) {
        return v.b(iterable.iterator(), nVar);
    }

    public static Collection b(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : x.i(iterable.iterator());
    }

    public static Object c(Iterable iterable, Object obj) {
        return v.k(iterable.iterator(), obj);
    }

    public static Object d(Iterable iterable) {
        if (!(iterable instanceof List)) {
            return v.i(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return f(list);
    }

    public static Object e(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return obj;
            }
            if (iterable instanceof List) {
                return f(x.a(iterable));
            }
        }
        return v.j(iterable.iterator(), obj);
    }

    public static Object f(List list) {
        return list.get(list.size() - 1);
    }

    public static Object g(Iterable iterable) {
        return v.l(iterable.iterator());
    }

    public static boolean h(Iterable iterable, s7.n nVar) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? i((List) iterable, (s7.n) s7.m.j(nVar)) : v.p(iterable.iterator(), nVar);
    }

    public static boolean i(List list, s7.n nVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!nVar.apply(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException unused) {
                        j(list, nVar, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        j(list, nVar, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }

    public static void j(List list, s7.n nVar, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (nVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static Object[] k(Iterable iterable) {
        return b(iterable).toArray();
    }
}
