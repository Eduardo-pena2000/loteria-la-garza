package I8;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class g extends AbstractMap implements Serializable {
    public static final Comparator i = new a();
    public final Comparator a;
    public final boolean b;
    public e c;
    public int d;
    public int e;
    public final e f;
    public b g;
    public c h;

    public class a implements Comparator {
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public class b extends AbstractSet {

        public class a extends d {
            public a() {
                super();
            }

            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                return a();
            }
        }

        public b() {
        }

        public void clear() {
            g.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && g.this.e((Map.Entry) obj) != null;
        }

        public Iterator iterator() {
            return new a();
        }

        public boolean remove(Object obj) {
            e e;
            if (!(obj instanceof Map.Entry) || (e = g.this.e((Map.Entry) obj)) == null) {
                return false;
            }
            g.this.h(e, true);
            return true;
        }

        public int size() {
            return g.this.d;
        }
    }

    public final class c extends AbstractSet {

        public class a extends d {
            public a() {
                super();
            }

            public Object next() {
                return a().f;
            }
        }

        public c() {
        }

        public void clear() {
            g.this.clear();
        }

        public boolean contains(Object obj) {
            return g.this.containsKey(obj);
        }

        public Iterator iterator() {
            return new a();
        }

        public boolean remove(Object obj) {
            return g.this.j(obj) != null;
        }

        public int size() {
            return g.this.d;
        }
    }

    public abstract class d implements Iterator {
        public e a;
        public e b = null;
        public int c;

        public d() {
            this.a = g.this.f.d;
            this.c = g.this.e;
        }

        public final e a() {
            e eVar = this.a;
            g gVar = g.this;
            if (eVar == gVar.f) {
                throw new NoSuchElementException();
            }
            if (gVar.e != this.c) {
                throw new ConcurrentModificationException();
            }
            this.a = eVar.d;
            this.b = eVar;
            return eVar;
        }

        public final boolean hasNext() {
            return this.a != g.this.f;
        }

        public final void remove() {
            e eVar = this.b;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            g.this.h(eVar, true);
            this.b = null;
            this.c = g.this.e;
        }
    }

    public g() {
        this(i, true);
    }

    public final boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public e b(Object obj, boolean z) {
        int i2;
        e eVar;
        Comparator comparator = this.a;
        e eVar2 = this.c;
        if (eVar2 != null) {
            Comparable comparable = comparator == i ? (Comparable) obj : null;
            while (true) {
                i2 = comparable != null ? comparable.compareTo(eVar2.f) : comparator.compare(obj, eVar2.f);
                if (i2 == 0) {
                    return eVar2;
                }
                e eVar3 = i2 < 0 ? eVar2.b : eVar2.c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i2 = 0;
        }
        if (!z) {
            return null;
        }
        e eVar4 = this.f;
        if (eVar2 != null) {
            eVar = new e(this.b, eVar2, obj, eVar4, eVar4.e);
            if (i2 < 0) {
                eVar2.b = eVar;
            } else {
                eVar2.c = eVar;
            }
            g(eVar2, true);
        } else {
            if (comparator == i && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
            }
            eVar = new e(this.b, eVar2, obj, eVar4, eVar4.e);
            this.c = eVar;
        }
        this.d++;
        this.e++;
        return eVar;
    }

    public void clear() {
        this.c = null;
        this.d = 0;
        this.e++;
        e eVar = this.f;
        eVar.e = eVar;
        eVar.d = eVar;
    }

    public boolean containsKey(Object obj) {
        return f(obj) != null;
    }

    public e e(Map.Entry entry) {
        e f = f(entry.getKey());
        if (f == null || !a(f.h, entry.getValue())) {
            return null;
        }
        return f;
    }

    public Set entrySet() {
        b bVar = this.g;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.g = bVar2;
        return bVar2;
    }

    public e f(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final void g(e eVar, boolean z) {
        while (eVar != null) {
            e eVar2 = eVar.b;
            e eVar3 = eVar.c;
            int i2 = eVar2 != null ? eVar2.i : 0;
            int i3 = eVar3 != null ? eVar3.i : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                e eVar4 = eVar3.b;
                e eVar5 = eVar3.c;
                int i5 = (eVar4 != null ? eVar4.i : 0) - (eVar5 != null ? eVar5.i : 0);
                if (i5 == -1 || (i5 == 0 && !z)) {
                    n(eVar);
                } else {
                    o(eVar3);
                    n(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                e eVar6 = eVar2.b;
                e eVar7 = eVar2.c;
                int i6 = (eVar6 != null ? eVar6.i : 0) - (eVar7 != null ? eVar7.i : 0);
                if (i6 == 1 || (i6 == 0 && !z)) {
                    o(eVar);
                } else {
                    n(eVar2);
                    o(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.i = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.i = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.a;
        }
    }

    public Object get(Object obj) {
        e f = f(obj);
        if (f != null) {
            return f.h;
        }
        return null;
    }

    public void h(e eVar, boolean z) {
        int i2;
        if (z) {
            e eVar2 = eVar.e;
            eVar2.d = eVar.d;
            eVar.d.e = eVar2;
        }
        e eVar3 = eVar.b;
        e eVar4 = eVar.c;
        e eVar5 = eVar.a;
        int i3 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                k(eVar, eVar3);
                eVar.b = null;
            } else if (eVar4 != null) {
                k(eVar, eVar4);
                eVar.c = null;
            } else {
                k(eVar, null);
            }
            g(eVar5, false);
            this.d--;
            this.e++;
            return;
        }
        e b2 = eVar3.i > eVar4.i ? eVar3.b() : eVar4.a();
        h(b2, false);
        e eVar6 = eVar.b;
        if (eVar6 != null) {
            i2 = eVar6.i;
            b2.b = eVar6;
            eVar6.a = b2;
            eVar.b = null;
        } else {
            i2 = 0;
        }
        e eVar7 = eVar.c;
        if (eVar7 != null) {
            i3 = eVar7.i;
            b2.c = eVar7;
            eVar7.a = b2;
            eVar.c = null;
        }
        b2.i = Math.max(i2, i3) + 1;
        k(eVar, b2);
    }

    public e j(Object obj) {
        e f = f(obj);
        if (f != null) {
            h(f, true);
        }
        return f;
    }

    public final void k(e eVar, e eVar2) {
        e eVar3 = eVar.a;
        eVar.a = null;
        if (eVar2 != null) {
            eVar2.a = eVar3;
        }
        if (eVar3 == null) {
            this.c = eVar2;
        } else if (eVar3.b == eVar) {
            eVar3.b = eVar2;
        } else {
            eVar3.c = eVar2;
        }
    }

    public Set keySet() {
        c cVar = this.h;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.h = cVar2;
        return cVar2;
    }

    public final void n(e eVar) {
        e eVar2 = eVar.b;
        e eVar3 = eVar.c;
        e eVar4 = eVar3.b;
        e eVar5 = eVar3.c;
        eVar.c = eVar4;
        if (eVar4 != null) {
            eVar4.a = eVar;
        }
        k(eVar, eVar3);
        eVar3.b = eVar;
        eVar.a = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.i : 0, eVar4 != null ? eVar4.i : 0) + 1;
        eVar.i = max;
        eVar3.i = Math.max(max, eVar5 != null ? eVar5.i : 0) + 1;
    }

    public final void o(e eVar) {
        e eVar2 = eVar.b;
        e eVar3 = eVar.c;
        e eVar4 = eVar2.b;
        e eVar5 = eVar2.c;
        eVar.b = eVar5;
        if (eVar5 != null) {
            eVar5.a = eVar;
        }
        k(eVar, eVar2);
        eVar2.c = eVar;
        eVar.a = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.i : 0, eVar5 != null ? eVar5.i : 0) + 1;
        eVar.i = max;
        eVar2.i = Math.max(max, eVar4 != null ? eVar4.i : 0) + 1;
    }

    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.b) {
            throw new NullPointerException("value == null");
        }
        e b2 = b(obj, true);
        Object obj3 = b2.h;
        b2.h = obj2;
        return obj3;
    }

    public Object remove(Object obj) {
        e j = j(obj);
        if (j != null) {
            return j.h;
        }
        return null;
    }

    public int size() {
        return this.d;
    }

    public g(boolean z) {
        this(i, z);
    }

    public g(Comparator comparator, boolean z) {
        this.d = 0;
        this.e = 0;
        this.a = comparator == null ? i : comparator;
        this.b = z;
        this.f = new e(z);
    }

    public static final class e implements Map.Entry {
        public e a;
        public e b;
        public e c;
        public e d;
        public e e;
        public final Object f;
        public final boolean g;
        public Object h;
        public int i;

        public e(boolean z) {
            this.f = null;
            this.g = z;
            this.e = this;
            this.d = this;
        }

        public e a() {
            e eVar = this;
            for (e eVar2 = this.b; eVar2 != null; eVar2 = eVar2.b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e b() {
            e eVar = this;
            for (e eVar2 = this.c; eVar2 != null; eVar2 = eVar2.c) {
                eVar = eVar2;
            }
            return eVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f;
            if (obj2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!obj2.equals(entry.getKey())) {
                return false;
            }
            Object obj3 = this.h;
            if (obj3 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!obj3.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public Object getKey() {
            return this.f;
        }

        public Object getValue() {
            return this.h;
        }

        public int hashCode() {
            Object obj = this.f;
            int hashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.h;
            return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        }

        public Object setValue(Object obj) {
            if (obj == null && !this.g) {
                throw new NullPointerException("value == null");
            }
            Object obj2 = this.h;
            this.h = obj;
            return obj2;
        }

        public String toString() {
            return this.f + "=" + this.h;
        }

        public e(boolean z, e eVar, Object obj, e eVar2, e eVar3) {
            this.a = eVar;
            this.f = obj;
            this.g = z;
            this.i = 1;
            this.d = eVar2;
            this.e = eVar3;
            eVar3.d = this;
            eVar2.e = this;
        }
    }
}
