package t7;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import t7.p;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class s implements Map, Serializable {
    public static final Map.Entry[] d = new Map.Entry[0];
    public transient t a;
    public transient t b;
    public transient p c;

    public static class a {
        public Comparator a;
        public Object[] b;
        public int c;
        public boolean d;
        public a e;

        public static final class a {
            public final Object a;
            public final Object b;
            public final Object c;

            public a(Object obj, Object obj2, Object obj3) {
                this.a = obj;
                this.b = obj2;
                this.c = obj3;
            }

            public IllegalArgumentException a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.a + "=" + this.b + " and " + this.a + "=" + this.c);
            }
        }

        public a() {
            this(4);
        }

        public static void j(Object[] objArr, int i, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i];
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 2;
                Object obj = objArr[i3];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i3 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i2] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i, I.b(comparator).d(z.k()));
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = i4 * 2;
                objArr[i5] = entryArr[i4].getKey();
                objArr[i5 + 1] = entryArr[i4].getValue();
            }
        }

        public s a() {
            return c();
        }

        public final s b(boolean z) {
            Object[] objArr;
            a aVar;
            a aVar2;
            if (z && (aVar2 = this.e) != null) {
                throw aVar2.a();
            }
            int i = this.c;
            if (this.a == null) {
                objArr = this.b;
            } else {
                if (this.d) {
                    this.b = Arrays.copyOf(this.b, i * 2);
                }
                objArr = this.b;
                if (!z) {
                    objArr = e(objArr, this.c);
                    if (objArr.length < this.b.length) {
                        i = objArr.length >>> 1;
                    }
                }
                j(objArr, i, this.a);
            }
            this.d = true;
            L u = L.u(i, objArr, this);
            if (!z || (aVar = this.e) == null) {
                return u;
            }
            throw aVar.a();
        }

        public s c() {
            return b(true);
        }

        public final void d(int i) {
            int i2 = i * 2;
            Object[] objArr = this.b;
            if (i2 > objArr.length) {
                this.b = Arrays.copyOf(objArr, p.b.c(objArr.length, i2));
                this.d = false;
            }
        }

        public final Object[] e(Object[] objArr, int i) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                Object obj = objArr[i2 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i2);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i - bitSet.cardinality()) * 2];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i * 2) {
                if (bitSet.get(i3 >>> 1)) {
                    i3 += 2;
                } else {
                    int i5 = i4 + 1;
                    int i6 = i3 + 1;
                    Object obj2 = objArr[i3];
                    Objects.requireNonNull(obj2);
                    objArr2[i4] = obj2;
                    i4 += 2;
                    i3 += 2;
                    Object obj3 = objArr[i6];
                    Objects.requireNonNull(obj3);
                    objArr2[i5] = obj3;
                }
            }
            return objArr2;
        }

        public a f(Object obj, Object obj2) {
            d(this.c + 1);
            h.a(obj, obj2);
            Object[] objArr = this.b;
            int i = this.c;
            objArr[i * 2] = obj;
            objArr[(i * 2) + 1] = obj2;
            this.c = i + 1;
            return this;
        }

        public a g(Map.Entry entry) {
            return f(entry.getKey(), entry.getValue());
        }

        public a h(Iterable iterable) {
            if (iterable instanceof Collection) {
                d(this.c + ((Collection) iterable).size());
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                g((Map.Entry) it.next());
            }
            return this;
        }

        public a i(Map map) {
            return h(map.entrySet());
        }

        public a(int i) {
            this.b = new Object[i * 2];
            this.c = 0;
            this.d = false;
        }
    }

    public static a a() {
        return new a();
    }

    public static s b(Iterable iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.h(iterable);
        return aVar.a();
    }

    public static s e(Map map) {
        if ((map instanceof s) && !(map instanceof SortedMap)) {
            s sVar = (s) map;
            if (!sVar.k()) {
                return sVar;
            }
        }
        return b(map.entrySet());
    }

    public static s o() {
        return L.h;
    }

    public static s p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        h.a(obj, obj2);
        h.a(obj3, obj4);
        h.a(obj5, obj6);
        h.a(obj7, obj8);
        return L.t(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    public static s q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        h.a(obj, obj2);
        h.a(obj3, obj4);
        h.a(obj5, obj6);
        h.a(obj7, obj8);
        h.a(obj9, obj10);
        return L.t(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10});
    }

    public static s r(Map.Entry... entryArr) {
        return b(Arrays.asList(entryArr));
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public boolean equals(Object obj) {
        return z.c(this, obj);
    }

    public abstract t f();

    public abstract t g();

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public abstract p h();

    public int hashCode() {
        return P.d(entrySet());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public t entrySet() {
        t tVar = this.a;
        if (tVar != null) {
            return tVar;
        }
        t f = f();
        this.a = f;
        return f;
    }

    public abstract boolean k();

    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public t keySet() {
        t tVar = this.b;
        if (tVar != null) {
            return tVar;
        }
        t g = g();
        this.b = g;
        return g;
    }

    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public p values() {
        p pVar = this.c;
        if (pVar != null) {
            return pVar;
        }
        p h = h();
        this.c = h;
        return h;
    }

    public String toString() {
        return z.j(this);
    }
}
