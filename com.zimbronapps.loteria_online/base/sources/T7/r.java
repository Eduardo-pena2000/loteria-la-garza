package t7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import t7.p;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class r extends p implements List, RandomAccess {
    public static final V b = new b(K.e, 0);

    public static final class a extends p.a {
        public a() {
            this(4);
        }

        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            super.d(obj);
            return this;
        }

        public a i(Object... objArr) {
            super.e(objArr);
            return this;
        }

        public a j(Iterable iterable) {
            super.b(iterable);
            return this;
        }

        public r k() {
            this.c = true;
            return r.i(this.a, this.b);
        }

        public a(int i) {
            super(i);
        }
    }

    public static class b extends t7.a {
        public final r c;

        public b(r rVar, int i) {
            super(rVar.size(), i);
            this.c = rVar;
        }

        public Object a(int i) {
            return this.c.get(i);
        }
    }

    public class c extends r {
        public final transient int c;
        public final transient int d;

        public c(int i, int i2) {
            this.c = i;
            this.d = i2;
        }

        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public r subList(int i, int i2) {
            s7.m.n(i, i2, this.d);
            r rVar = r.this;
            int i3 = this.c;
            return rVar.subList(i + i3, i2 + i3);
        }

        public Object[] c() {
            return r.this.c();
        }

        public int e() {
            return r.this.f() + this.c + this.d;
        }

        public int f() {
            return r.this.f() + this.c;
        }

        public boolean g() {
            return true;
        }

        public Object get(int i) {
            s7.m.h(i, this.d);
            return r.this.get(i + this.c);
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        public int size() {
            return this.d;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }
    }

    public static r h(Object[] objArr) {
        return i(objArr, objArr.length);
    }

    public static r i(Object[] objArr, int i) {
        return i == 0 ? s() : new K(objArr, i);
    }

    public static a j() {
        return new a();
    }

    public static a k(int i) {
        h.b(i, "expectedSize");
        return new a(i);
    }

    public static r l(Object... objArr) {
        return h(H.b(objArr));
    }

    public static r n(Collection collection) {
        if (!(collection instanceof p)) {
            return l(collection.toArray());
        }
        r a2 = ((p) collection).a();
        return a2.g() ? h(a2.toArray()) : a2;
    }

    public static r o(Object[] objArr) {
        return objArr.length == 0 ? s() : l((Object[]) objArr.clone());
    }

    public static r s() {
        return K.e;
    }

    public static r t(Object obj) {
        return l(obj);
    }

    public static r u(Object obj, Object obj2) {
        return l(obj, obj2);
    }

    public static r v(Object obj, Object obj2, Object obj3) {
        return l(obj, obj2, obj3);
    }

    public static r w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return l(obj, obj2, obj3, obj4, obj5);
    }

    public static r x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return l(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static r y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        s7.m.e(objArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr2 = new Object[objArr.length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        return l(objArr2);
    }

    public static r z(Comparator comparator, Iterable iterable) {
        s7.m.j(comparator);
        Object[] k = u.k(iterable);
        H.b(k);
        Arrays.sort(k, comparator);
        return h(k);
    }

    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public r subList(int i, int i2) {
        s7.m.n(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? s() : B(i, i2);
    }

    public r B(int i, int i2) {
        return new c(i, i2 - i);
    }

    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public int b(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean equals(Object obj) {
        return x.c(this, obj);
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return x.d(this, obj);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return x.f(this, obj);
    }

    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public U iterator() {
        return listIterator();
    }

    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public V listIterator() {
        return listIterator(0);
    }

    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public V listIterator(int i) {
        s7.m.l(i, size());
        return isEmpty() ? b : new b(this, i);
    }

    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public final r a() {
        return this;
    }
}
