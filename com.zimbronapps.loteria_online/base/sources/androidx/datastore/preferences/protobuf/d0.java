package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class d0 extends AbstractMap {
    public List a;
    public Map b;
    public boolean c;
    public volatile f d;
    public Map e;
    public volatile c f;

    public class a extends d0 {
        public a() {
            super(null);
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.v((Comparable) obj, obj2);
        }

        public void t() {
            if (!s()) {
                if (o() > 0) {
                    android.support.v4.media.session.b.a(n(0).getKey());
                    throw null;
                }
                Iterator it = q().iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.t();
        }
    }

    public class c extends f {
        public c() {
            super(d0.this, null);
        }

        public Iterator iterator() {
            return new b(d0.this, null);
        }

        public /* synthetic */ c(d0 d0Var, a aVar) {
            this();
        }
    }

    public class d implements Map.Entry, Comparable {
        public final Comparable a;
        public Object b;

        public d(d0 d0Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return getKey().compareTo(dVar.getKey());
        }

        public final boolean b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b(this.a, entry.getKey()) && b(this.b, entry.getValue());
        }

        public Object getValue() {
            return this.b;
        }

        public int hashCode() {
            Comparable comparable = this.a;
            int hashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.b;
            return hashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        public Object setValue(Object obj) {
            d0.a(d0.this);
            Object obj2 = this.b;
            this.b = obj;
            return obj2;
        }

        public String toString() {
            return this.a + "=" + this.b;
        }

        public d(Comparable comparable, Object obj) {
            this.a = comparable;
            this.b = obj;
        }
    }

    public class f extends AbstractSet {
        public f() {
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            d0.this.v((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            d0.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = d0.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator iterator() {
            return new e(d0.this, null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            d0.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return d0.this.size();
        }

        public /* synthetic */ f(d0 d0Var, a aVar) {
            this();
        }
    }

    public /* synthetic */ d0(a aVar) {
        this();
    }

    public static /* synthetic */ void a(d0 d0Var) {
        d0Var.j();
    }

    public static /* synthetic */ List b(d0 d0Var) {
        return d0Var.a;
    }

    public static /* synthetic */ Map e(d0 d0Var) {
        return d0Var.b;
    }

    public static /* synthetic */ Object f(d0 d0Var, int i) {
        return d0Var.w(i);
    }

    public static /* synthetic */ Map g(d0 d0Var) {
        return d0Var.e;
    }

    public static d0 u() {
        return new a();
    }

    public void clear() {
        j();
        if (!this.a.isEmpty()) {
            this.a.clear();
        }
        if (this.b.isEmpty()) {
            return;
        }
        this.b.clear();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return h(comparable) >= 0 || this.b.containsKey(comparable);
    }

    public Set entrySet() {
        if (this.d == null) {
            this.d = new f(this, null);
        }
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return super.equals(obj);
        }
        d0 d0Var = (d0) obj;
        int size = size();
        if (size != d0Var.size()) {
            return false;
        }
        int o = o();
        if (o != d0Var.o()) {
            return entrySet().equals(d0Var.entrySet());
        }
        for (int i = 0; i < o; i++) {
            if (!n(i).equals(d0Var.n(i))) {
                return false;
            }
        }
        if (o != size) {
            return this.b.equals(d0Var.b);
        }
        return true;
    }

    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int h = h(comparable);
        return h >= 0 ? ((d) this.a.get(h)).getValue() : this.b.get(comparable);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.a
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List r2 = r4.a
            java.lang.Object r2 = r2.get(r1)
            androidx.datastore.preferences.protobuf.d0$d r2 = (androidx.datastore.preferences.protobuf.d0.d) r2
            java.lang.Comparable r2 = r2.getKey()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L20
            int r0 = r0 + 1
        L1e:
            int r5 = -r0
            return r5
        L20:
            if (r2 != 0) goto L23
            return r1
        L23:
            r0 = 0
        L24:
            if (r0 > r1) goto L47
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.a
            java.lang.Object r3 = r3.get(r2)
            androidx.datastore.preferences.protobuf.d0$d r3 = (androidx.datastore.preferences.protobuf.d0.d) r3
            java.lang.Comparable r3 = r3.getKey()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L40
            int r2 = r2 + (-1)
            r1 = r2
            goto L24
        L40:
            if (r3 <= 0) goto L46
            int r2 = r2 + 1
            r0 = r2
            goto L24
        L46:
            return r2
        L47:
            int r0 = r0 + 1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.d0.h(java.lang.Comparable):int");
    }

    public int hashCode() {
        int o = o();
        int i = 0;
        for (int i2 = 0; i2 < o; i2++) {
            i += ((d) this.a.get(i2)).hashCode();
        }
        return p() > 0 ? i + this.b.hashCode() : i;
    }

    public final void j() {
        if (this.c) {
            throw new UnsupportedOperationException();
        }
    }

    public Set k() {
        if (this.f == null) {
            this.f = new c(this, null);
        }
        return this.f;
    }

    public final void m() {
        j();
        if (!this.a.isEmpty() || (this.a instanceof ArrayList)) {
            return;
        }
        this.a = new ArrayList(16);
    }

    public Map.Entry n(int i) {
        return (Map.Entry) this.a.get(i);
    }

    public int o() {
        return this.a.size();
    }

    public int p() {
        return this.b.size();
    }

    public Iterable q() {
        return this.b.isEmpty() ? Collections.emptySet() : this.b.entrySet();
    }

    public final SortedMap r() {
        j();
        if (this.b.isEmpty() && !(this.b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.b = treeMap;
            this.e = treeMap.descendingMap();
        }
        return this.b;
    }

    public Object remove(Object obj) {
        j();
        Comparable comparable = (Comparable) obj;
        int h = h(comparable);
        if (h >= 0) {
            return w(h);
        }
        if (this.b.isEmpty()) {
            return null;
        }
        return this.b.remove(comparable);
    }

    public boolean s() {
        return this.c;
    }

    public int size() {
        return this.a.size() + this.b.size();
    }

    public void t() {
        if (this.c) {
            return;
        }
        this.b = this.b.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.b);
        this.e = this.e.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.e);
        this.c = true;
    }

    public Object v(Comparable comparable, Object obj) {
        j();
        int h = h(comparable);
        if (h >= 0) {
            return ((d) this.a.get(h)).setValue(obj);
        }
        m();
        int i = -(h + 1);
        if (i >= 16) {
            return r().put(comparable, obj);
        }
        if (this.a.size() == 16) {
            d dVar = (d) this.a.remove(15);
            r().put(dVar.getKey(), dVar.getValue());
        }
        this.a.add(i, new d(comparable, obj));
        return null;
    }

    public final Object w(int i) {
        j();
        Object value = ((d) this.a.remove(i)).getValue();
        if (!this.b.isEmpty()) {
            Iterator it = r().entrySet().iterator();
            this.a.add(new d(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public class b implements Iterator {
        public int a;
        public Iterator b;

        public b() {
            this.a = d0.b(d0.this).size();
        }

        public final Iterator a() {
            if (this.b == null) {
                this.b = d0.g(d0.this).entrySet().iterator();
            }
            return this.b;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List b = d0.b(d0.this);
            int i = this.a - 1;
            this.a = i;
            return (Map.Entry) b.get(i);
        }

        public boolean hasNext() {
            int i = this.a;
            return (i > 0 && i <= d0.b(d0.this).size()) || a().hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ b(d0 d0Var, a aVar) {
            this();
        }
    }

    public class e implements Iterator {
        public int a;
        public boolean b;
        public Iterator c;

        public e() {
            this.a = -1;
        }

        public final Iterator a() {
            if (this.c == null) {
                this.c = d0.e(d0.this).entrySet().iterator();
            }
            return this.c;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.b = true;
            int i = this.a + 1;
            this.a = i;
            return i < d0.b(d0.this).size() ? (Map.Entry) d0.b(d0.this).get(this.a) : (Map.Entry) a().next();
        }

        public boolean hasNext() {
            if (this.a + 1 >= d0.b(d0.this).size()) {
                return !d0.e(d0.this).isEmpty() && a().hasNext();
            }
            return true;
        }

        public void remove() {
            if (!this.b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.b = false;
            d0.a(d0.this);
            if (this.a >= d0.b(d0.this).size()) {
                a().remove();
                return;
            }
            d0 d0Var = d0.this;
            int i = this.a;
            this.a = i - 1;
            d0.f(d0Var, i);
        }

        public /* synthetic */ e(d0 d0Var, a aVar) {
            this();
        }
    }

    public d0() {
        this.a = Collections.emptyList();
        this.b = Collections.emptyMap();
        this.e = Collections.emptyMap();
    }
}
