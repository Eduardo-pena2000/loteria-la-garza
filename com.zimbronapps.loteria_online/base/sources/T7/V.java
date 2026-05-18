package t7;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class v {

    public class a extends t7.b {
        public final /* synthetic */ Iterator c;
        public final /* synthetic */ s7.n d;

        public a(Iterator it, s7.n nVar) {
            this.c = it;
            this.d = nVar;
        }

        public Object a() {
            while (this.c.hasNext()) {
                Object next = this.c.next();
                if (this.d.apply(next)) {
                    return next;
                }
            }
            return b();
        }
    }

    public enum b implements Iterator {
        INSTANCE;

        public boolean hasNext() {
            return false;
        }

        public Object next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            h.c(false);
        }
    }

    public static final class c extends U {
        public static final Object b = new Object();
        public Object a;

        public c(Object obj) {
            this.a = obj;
        }

        public boolean hasNext() {
            return this.a != b;
        }

        public Object next() {
            Object obj = this.a;
            Object obj2 = b;
            if (obj == obj2) {
                throw new NoSuchElementException();
            }
            this.a = obj2;
            return obj;
        }
    }

    public static boolean a(Collection collection, Iterator it) {
        s7.m.j(collection);
        s7.m.j(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    public static boolean b(Iterator it, s7.n nVar) {
        return m(it, nVar) != -1;
    }

    public static void c(Iterator it) {
        s7.m.j(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean d(Iterator it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !s7.k.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static Iterator f() {
        return b.INSTANCE;
    }

    public static U g(Iterator it, s7.n nVar) {
        s7.m.j(it);
        s7.m.j(nVar);
        return new a(it, nVar);
    }

    public static Object h(Iterator it, s7.n nVar) {
        s7.m.j(it);
        s7.m.j(nVar);
        while (it.hasNext()) {
            Object next = it.next();
            if (nVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static Object i(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object j(Iterator it, Object obj) {
        return it.hasNext() ? i(it) : obj;
    }

    public static Object k(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    public static Object l(Iterator it) {
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static int m(Iterator it, s7.n nVar) {
        s7.m.k(nVar, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (nVar.apply(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static Object n(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static boolean o(Iterator it, Collection collection) {
        s7.m.j(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean p(Iterator it, s7.n nVar) {
        s7.m.j(nVar);
        boolean z = false;
        while (it.hasNext()) {
            if (nVar.apply(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static U q(Object obj) {
        return new c(obj);
    }
}
