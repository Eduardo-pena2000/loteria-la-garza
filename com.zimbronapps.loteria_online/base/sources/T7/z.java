package t7;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import t7.P;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class z {

    public class a extends S {
        public a(Iterator it) {
            super(it);
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Object a(Map.Entry entry) {
            return entry.getValue();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class b implements s7.g {
        public static final b a = new a("KEY", 0);
        public static final b b = new b("VALUE", 1);
        public static final /* synthetic */ b[] c = a();

        public enum a extends b {
            public a(String str, int i) {
                super(str, i, null);
            }

            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        }

        public enum b extends b {
            public b(String str, int i) {
                super(str, i, null);
            }

            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        }

        public b(String str, int i) {
        }

        public static /* synthetic */ b[] a() {
            return new b[]{a, b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) c.clone();
        }

        public /* synthetic */ b(String str, int i, y yVar) {
            this(str, i);
        }
    }

    public static abstract class c extends P.e {
        public abstract Map a();

        public void clear() {
            a().clear();
        }

        public abstract boolean contains(Object obj);

        public boolean isEmpty() {
            return a().isEmpty();
        }

        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) s7.m.j(collection));
            } catch (UnsupportedOperationException unused) {
                return P.j(this, collection.iterator());
            }
        }

        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) s7.m.j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet g = P.g(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        g.add(((Map.Entry) obj).getKey());
                    }
                }
                return a().keySet().retainAll(g);
            }
        }

        public int size() {
            return a().size();
        }
    }

    public static class d extends P.e {
        public final Map a;

        public d(Map map) {
            this.a = (Map) s7.m.j(map);
        }

        public Map a() {
            return this.a;
        }

        public boolean contains(Object obj) {
            return a().containsKey(obj);
        }

        public boolean isEmpty() {
            return a().isEmpty();
        }

        public int size() {
            return a().size();
        }
    }

    public static class e extends AbstractCollection {
        public final Map a;

        public e(Map map) {
            this.a = (Map) s7.m.j(map);
        }

        public final Map a() {
            return this.a;
        }

        public void clear() {
            a().clear();
        }

        public boolean contains(Object obj) {
            return a().containsValue(obj);
        }

        public boolean isEmpty() {
            return a().isEmpty();
        }

        public Iterator iterator() {
            return z.l(a().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : a().entrySet()) {
                    if (s7.k.a(obj, entry.getValue())) {
                        a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) s7.m.j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f = P.f();
                for (Map.Entry entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f.add(entry.getKey());
                    }
                }
                return a().keySet().removeAll(f);
            }
        }

        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) s7.m.j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f = P.f();
                for (Map.Entry entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f.add(entry.getKey());
                    }
                }
                return a().keySet().retainAll(f);
            }
        }

        public int size() {
            return a().size();
        }
    }

    public static abstract class f extends AbstractMap {
        public transient Set a;
        public transient Collection b;

        public abstract Set a();

        public Collection b() {
            return new e(this);
        }

        public Set entrySet() {
            Set set = this.a;
            if (set != null) {
                return set;
            }
            Set a = a();
            this.a = a;
            return a;
        }

        public Collection values() {
            Collection collection = this.b;
            if (collection != null) {
                return collection;
            }
            Collection b = b();
            this.b = b;
            return b;
        }
    }

    public static int a(int i) {
        if (i < 3) {
            h.b(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(i / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static boolean b(Map map, Object obj) {
        return v.d(l(map.entrySet().iterator()), obj);
    }

    public static boolean c(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static Map.Entry d(Object obj, Object obj2) {
        return new q(obj, obj2);
    }

    public static HashMap e(int i) {
        return new HashMap(a(i));
    }

    public static IdentityHashMap f() {
        return new IdentityHashMap();
    }

    public static boolean g(Map map, Object obj) {
        s7.m.j(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static Object h(Map map, Object obj) {
        s7.m.j(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static Object i(Map map, Object obj) {
        s7.m.j(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String j(Map map) {
        StringBuilder b2 = i.b(map.size());
        b2.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                b2.append(", ");
            }
            b2.append(entry.getKey());
            b2.append('=');
            b2.append(entry.getValue());
            z = false;
        }
        b2.append('}');
        return b2.toString();
    }

    public static s7.g k() {
        return b.b;
    }

    public static Iterator l(Iterator it) {
        return new a(it);
    }
}
