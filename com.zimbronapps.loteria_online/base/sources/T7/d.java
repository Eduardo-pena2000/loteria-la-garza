package t7;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import t7.f;
import t7.z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class d extends t7.f implements Serializable {
    public transient Map d;
    public transient int e;

    public class b extends z.f {
        public final transient Map c;

        public class a extends z.c {
            public a() {
            }

            public Map a() {
                return b.this;
            }

            public boolean contains(Object obj) {
                return t7.i.c(b.this.c.entrySet(), obj);
            }

            public Iterator iterator() {
                return b.this.new b();
            }

            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                d.o(d.this, entry.getKey());
                return true;
            }
        }

        public class b implements Iterator {
            public final Iterator a;
            public Collection b;

            public b() {
                this.a = b.this.c.entrySet().iterator();
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                Map.Entry entry = (Map.Entry) this.a.next();
                this.b = (Collection) entry.getValue();
                return b.this.g(entry);
            }

            public boolean hasNext() {
                return this.a.hasNext();
            }

            public void remove() {
                s7.m.p(this.b != null, "no calls to next() since the last call to remove()");
                this.a.remove();
                d.n(d.this, this.b.size());
                this.b.clear();
                this.b = null;
            }
        }

        public b(Map map) {
            this.c = map;
        }

        public Set a() {
            return new a();
        }

        public void clear() {
            if (this.c == d.h(d.this)) {
                d.this.clear();
            } else {
                v.c(new b());
            }
        }

        public boolean containsKey(Object obj) {
            return z.g(this.c, obj);
        }

        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection get(Object obj) {
            Collection collection = (Collection) z.h(this.c, obj);
            if (collection == null) {
                return null;
            }
            return d.this.w(obj, collection);
        }

        public boolean equals(Object obj) {
            return this == obj || this.c.equals(obj);
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Collection remove(Object obj) {
            Collection collection = (Collection) this.c.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection p = d.this.p();
            p.addAll(collection);
            d.n(d.this, collection.size());
            collection.clear();
            return p;
        }

        public Map.Entry g(Map.Entry entry) {
            Object key = entry.getKey();
            return z.d(key, d.this.w(key, (Collection) entry.getValue()));
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public Set keySet() {
            return d.this.f();
        }

        public int size() {
            return this.c.size();
        }

        public String toString() {
            return this.c.toString();
        }
    }

    public abstract class c implements Iterator {
        public final Iterator a;
        public Object b = null;
        public Collection c = null;
        public Iterator d = v.f();

        public c() {
            this.a = d.h(d.this).entrySet().iterator();
        }

        public abstract Object a(Object obj, Object obj2);

        public boolean hasNext() {
            return this.a.hasNext() || this.d.hasNext();
        }

        public Object next() {
            if (!this.d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.a.next();
                this.b = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.c = collection;
                this.d = collection.iterator();
            }
            return a(G.a(this.b), this.d.next());
        }

        public void remove() {
            this.d.remove();
            Collection collection = this.c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.a.remove();
            }
            d.k(d.this);
        }
    }

    public class d extends z.d {

        public class a implements Iterator {
            public Map.Entry a;
            public final /* synthetic */ Iterator b;

            public a(Iterator it) {
                this.b = it;
            }

            public boolean hasNext() {
                return this.b.hasNext();
            }

            public Object next() {
                Map.Entry entry = (Map.Entry) this.b.next();
                this.a = entry;
                return entry.getKey();
            }

            public void remove() {
                s7.m.p(this.a != null, "no calls to next() since the last call to remove()");
                Collection collection = (Collection) this.a.getValue();
                this.b.remove();
                d.n(d.this, collection.size());
                collection.clear();
                this.a = null;
            }
        }

        public d(Map map) {
            super(map);
        }

        public void clear() {
            v.c(iterator());
        }

        public boolean containsAll(Collection collection) {
            return a().keySet().containsAll(collection);
        }

        public boolean equals(Object obj) {
            return this == obj || a().keySet().equals(obj);
        }

        public int hashCode() {
            return a().keySet().hashCode();
        }

        public Iterator iterator() {
            return new a(a().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            int i;
            Collection collection = (Collection) a().remove(obj);
            if (collection != null) {
                i = collection.size();
                collection.clear();
                d.n(d.this, i);
            } else {
                i = 0;
            }
            return i > 0;
        }
    }

    public final class e extends h implements NavigableMap {
        public e(NavigableMap navigableMap) {
            super(navigableMap);
        }

        public Map.Entry ceilingEntry(Object obj) {
            Map.Entry ceilingEntry = k().ceilingEntry(obj);
            if (ceilingEntry == null) {
                return null;
            }
            return g(ceilingEntry);
        }

        public Object ceilingKey(Object obj) {
            return k().ceilingKey(obj);
        }

        public NavigableSet descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        public NavigableMap descendingMap() {
            return d.this.new e(k().descendingMap());
        }

        public Map.Entry firstEntry() {
            Map.Entry firstEntry = k().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return g(firstEntry);
        }

        public Map.Entry floorEntry(Object obj) {
            Map.Entry floorEntry = k().floorEntry(obj);
            if (floorEntry == null) {
                return null;
            }
            return g(floorEntry);
        }

        public Object floorKey(Object obj) {
            return k().floorKey(obj);
        }

        public Map.Entry higherEntry(Object obj) {
            Map.Entry higherEntry = k().higherEntry(obj);
            if (higherEntry == null) {
                return null;
            }
            return g(higherEntry);
        }

        public Object higherKey(Object obj) {
            return k().higherKey(obj);
        }

        public Map.Entry lastEntry() {
            Map.Entry lastEntry = k().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return g(lastEntry);
        }

        public Map.Entry lowerEntry(Object obj) {
            Map.Entry lowerEntry = k().lowerEntry(obj);
            if (lowerEntry == null) {
                return null;
            }
            return g(lowerEntry);
        }

        public Object lowerKey(Object obj) {
            return k().lowerKey(obj);
        }

        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableSet h() {
            return d.this.new f(k());
        }

        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public NavigableMap headMap(Object obj) {
            return headMap(obj, false);
        }

        public NavigableSet navigableKeySet() {
            return keySet();
        }

        /* renamed from: o, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet keySet() {
            return super.keySet();
        }

        public Map.Entry p(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Collection p = d.this.p();
            p.addAll((Collection) entry.getValue());
            it.remove();
            return z.d(entry.getKey(), d.this.v(p));
        }

        public Map.Entry pollFirstEntry() {
            return p(entrySet().iterator());
        }

        public Map.Entry pollLastEntry() {
            return p(descendingMap().entrySet().iterator());
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public NavigableMap k() {
            return super.k();
        }

        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public NavigableMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public NavigableMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        public NavigableMap headMap(Object obj, boolean z) {
            return d.this.new e(k().headMap(obj, z));
        }

        public NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            return d.this.new e(k().subMap(obj, z, obj2, z2));
        }

        public NavigableMap tailMap(Object obj, boolean z) {
            return d.this.new e(k().tailMap(obj, z));
        }
    }

    public final class f extends i implements NavigableSet {
        public f(NavigableMap navigableMap) {
            super(navigableMap);
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public NavigableSet headSet(Object obj) {
            return headSet(obj, false);
        }

        public Object ceiling(Object obj) {
            return b().ceilingKey(obj);
        }

        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        public NavigableSet descendingSet() {
            return d.this.new f(b().descendingMap());
        }

        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public NavigableMap b() {
            return super.b();
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        public Object floor(Object obj) {
            return b().floorKey(obj);
        }

        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        public Object higher(Object obj) {
            return b().higherKey(obj);
        }

        public Object lower(Object obj) {
            return b().lowerKey(obj);
        }

        public Object pollFirst() {
            return v.n(iterator());
        }

        public Object pollLast() {
            return v.n(descendingIterator());
        }

        public NavigableSet headSet(Object obj, boolean z) {
            return d.this.new f(b().headMap(obj, z));
        }

        public NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
            return d.this.new f(b().subMap(obj, z, obj2, z2));
        }

        public NavigableSet tailSet(Object obj, boolean z) {
            return d.this.new f(b().tailMap(obj, z));
        }
    }

    public class g extends k implements RandomAccess {
        public g(d dVar, Object obj, List list, j jVar) {
            super(obj, list, jVar);
        }
    }

    public class h extends b implements SortedMap {
        public SortedSet e;

        public h(SortedMap sortedMap) {
            super(sortedMap);
        }

        public Comparator comparator() {
            return k().comparator();
        }

        public Object firstKey() {
            return k().firstKey();
        }

        public SortedSet h() {
            return d.this.new i(k());
        }

        public SortedMap headMap(Object obj) {
            return d.this.new h(k().headMap(obj));
        }

        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public SortedSet keySet() {
            SortedSet sortedSet = this.e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet h = h();
            this.e = h;
            return h;
        }

        public SortedMap k() {
            return this.c;
        }

        public Object lastKey() {
            return k().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return d.this.new h(k().subMap(obj, obj2));
        }

        public SortedMap tailMap(Object obj) {
            return d.this.new h(k().tailMap(obj));
        }
    }

    public class i extends d implements SortedSet {
        public i(SortedMap sortedMap) {
            super(sortedMap);
        }

        public SortedMap b() {
            return super.a();
        }

        public Comparator comparator() {
            return b().comparator();
        }

        public Object first() {
            return b().firstKey();
        }

        public SortedSet headSet(Object obj) {
            return d.this.new i(b().headMap(obj));
        }

        public Object last() {
            return b().lastKey();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return d.this.new i(b().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return d.this.new i(b().tailMap(obj));
        }
    }

    public d(Map map) {
        s7.m.d(map.isEmpty());
        this.d = map;
    }

    public static /* synthetic */ Map h(d dVar) {
        return dVar.d;
    }

    public static /* synthetic */ Iterator i(Collection collection) {
        return t(collection);
    }

    public static /* synthetic */ int j(d dVar) {
        int i2 = dVar.e;
        dVar.e = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int k(d dVar) {
        int i2 = dVar.e;
        dVar.e = i2 - 1;
        return i2;
    }

    public static /* synthetic */ int l(d dVar, int i2) {
        int i3 = dVar.e + i2;
        dVar.e = i3;
        return i3;
    }

    public static /* synthetic */ int n(d dVar, int i2) {
        int i3 = dVar.e - i2;
        dVar.e = i3;
        return i3;
    }

    public static /* synthetic */ void o(d dVar, Object obj) {
        dVar.u(obj);
    }

    public static Iterator t(Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void clear() {
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.d.clear();
        this.e = 0;
    }

    public Collection e() {
        return new f.a(this);
    }

    public Iterator g() {
        return new a(this);
    }

    public abstract Collection p();

    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.d.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.e++;
            return true;
        }
        Collection q = q(obj);
        if (!q.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.e++;
        this.d.put(obj, q);
        return true;
    }

    public Collection q(Object obj) {
        return p();
    }

    public final Map r() {
        Map map = this.d;
        return map instanceof NavigableMap ? new e(this.d) : map instanceof SortedMap ? new h(this.d) : new b(this.d);
    }

    public final Set s() {
        Map map = this.d;
        return map instanceof NavigableMap ? new f(this.d) : map instanceof SortedMap ? new i(this.d) : new d(this.d);
    }

    public int size() {
        return this.e;
    }

    public final void u(Object obj) {
        Collection collection = (Collection) z.i(this.d, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.e -= size;
        }
    }

    public abstract Collection v(Collection collection);

    public Collection values() {
        return super.values();
    }

    public abstract Collection w(Object obj, Collection collection);

    public final List x(Object obj, List list, j jVar) {
        return list instanceof RandomAccess ? new g(this, obj, list, jVar) : new k(obj, list, jVar);
    }

    public class j extends AbstractCollection {
        public final Object a;
        public Collection b;
        public final j c;
        public final Collection d;

        public j(Object obj, Collection collection, j jVar) {
            this.a = obj;
            this.b = collection;
            this.c = jVar;
            this.d = jVar == null ? null : jVar.c();
        }

        public void a() {
            j jVar = this.c;
            if (jVar != null) {
                jVar.a();
            } else {
                d.h(d.this).put(this.a, this.b);
            }
        }

        public boolean add(Object obj) {
            f();
            boolean isEmpty = this.b.isEmpty();
            boolean add = this.b.add(obj);
            if (add) {
                d.j(d.this);
                if (isEmpty) {
                    a();
                }
            }
            return add;
        }

        public boolean addAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.b.addAll(collection);
            if (addAll) {
                d.l(d.this, this.b.size() - size);
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        public j b() {
            return this.c;
        }

        public Collection c() {
            return this.b;
        }

        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.b.clear();
            d.n(d.this, size);
            g();
        }

        public boolean contains(Object obj) {
            f();
            return this.b.contains(obj);
        }

        public boolean containsAll(Collection collection) {
            f();
            return this.b.containsAll(collection);
        }

        public Object e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            f();
            return this.b.equals(obj);
        }

        public void f() {
            Collection collection;
            j jVar = this.c;
            if (jVar != null) {
                jVar.f();
                if (this.c.c() != this.d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.b.isEmpty() || (collection = (Collection) d.h(d.this).get(this.a)) == null) {
                    return;
                }
                this.b = collection;
            }
        }

        public void g() {
            j jVar = this.c;
            if (jVar != null) {
                jVar.g();
            } else if (this.b.isEmpty()) {
                d.h(d.this).remove(this.a);
            }
        }

        public int hashCode() {
            f();
            return this.b.hashCode();
        }

        public Iterator iterator() {
            f();
            return new a();
        }

        public boolean remove(Object obj) {
            f();
            boolean remove = this.b.remove(obj);
            if (remove) {
                d.k(d.this);
                g();
            }
            return remove;
        }

        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.b.removeAll(collection);
            if (removeAll) {
                d.l(d.this, this.b.size() - size);
                g();
            }
            return removeAll;
        }

        public boolean retainAll(Collection collection) {
            s7.m.j(collection);
            int size = size();
            boolean retainAll = this.b.retainAll(collection);
            if (retainAll) {
                d.l(d.this, this.b.size() - size);
                g();
            }
            return retainAll;
        }

        public int size() {
            f();
            return this.b.size();
        }

        public String toString() {
            f();
            return this.b.toString();
        }

        public class a implements Iterator {
            public final Iterator a;
            public final Collection b;

            public a() {
                Collection collection = j.this.b;
                this.b = collection;
                this.a = d.i(collection);
            }

            public Iterator a() {
                b();
                return this.a;
            }

            public void b() {
                j.this.f();
                if (j.this.b != this.b) {
                    throw new ConcurrentModificationException();
                }
            }

            public boolean hasNext() {
                b();
                return this.a.hasNext();
            }

            public Object next() {
                b();
                return this.a.next();
            }

            public void remove() {
                this.a.remove();
                d.k(d.this);
                j.this.g();
            }

            public a(Iterator it) {
                this.b = j.this.b;
                this.a = it;
            }
        }
    }

    public class k extends j implements List {

        public class a extends j.a implements ListIterator {
            public a() {
                super();
            }

            public void add(Object obj) {
                boolean isEmpty = k.this.isEmpty();
                c().add(obj);
                d.j(d.this);
                if (isEmpty) {
                    k.this.a();
                }
            }

            public final ListIterator c() {
                return a();
            }

            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            public int nextIndex() {
                return c().nextIndex();
            }

            public Object previous() {
                return c().previous();
            }

            public int previousIndex() {
                return c().previousIndex();
            }

            public void set(Object obj) {
                c().set(obj);
            }

            public a(int i) {
                super(k.this.h().listIterator(i));
            }
        }

        public k(Object obj, List list, j jVar) {
            super(obj, list, jVar);
        }

        public void add(int i, Object obj) {
            f();
            boolean isEmpty = c().isEmpty();
            h().add(i, obj);
            d.j(d.this);
            if (isEmpty) {
                a();
            }
        }

        public boolean addAll(int i, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = h().addAll(i, collection);
            if (addAll) {
                d.l(d.this, c().size() - size);
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        public Object get(int i) {
            f();
            return h().get(i);
        }

        public List h() {
            return c();
        }

        public int indexOf(Object obj) {
            f();
            return h().indexOf(obj);
        }

        public int lastIndexOf(Object obj) {
            f();
            return h().lastIndexOf(obj);
        }

        public ListIterator listIterator() {
            f();
            return new a();
        }

        public Object remove(int i) {
            f();
            Object remove = h().remove(i);
            d.k(d.this);
            g();
            return remove;
        }

        public Object set(int i, Object obj) {
            f();
            return h().set(i, obj);
        }

        public List subList(int i, int i2) {
            f();
            return d.this.x(e(), h().subList(i, i2), b() == null ? this : b());
        }

        public ListIterator listIterator(int i) {
            f();
            return new a(i);
        }
    }

    public class a extends c {
        public a(d dVar) {
            super();
        }

        public Object a(Object obj, Object obj2) {
            return obj2;
        }
    }
}
