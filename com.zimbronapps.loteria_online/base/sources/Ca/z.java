package Ca;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class z implements Collection, Ra.a {
    public final byte[] a;

    public static final class a implements Iterator, Ra.a {
        public final byte[] a;
        public int b;

        public a(byte[] array) {
            kotlin.jvm.internal.t.g(array, "array");
            this.a = array;
        }

        public byte a() {
            int i = this.b;
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.b));
            }
            this.b = i + 1;
            return y.b(bArr[i]);
        }

        public boolean hasNext() {
            return this.b < this.a.length;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return y.a(a());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ z(byte[] bArr) {
        this.a = bArr;
    }

    public static final /* synthetic */ z a(byte[] bArr) {
        return new z(bArr);
    }

    public static byte[] b(int i) {
        return e(new byte[i]);
    }

    public static byte[] e(byte[] storage) {
        kotlin.jvm.internal.t.g(storage, "storage");
        return storage;
    }

    public static boolean g(byte[] bArr, byte b) {
        return Da.r.K(bArr, b);
    }

    public static boolean h(byte[] bArr, Collection elements) {
        kotlin.jvm.internal.t.g(elements, "elements");
        Collection collection = (Iterable) elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof y) || !Da.r.K(bArr, ((y) obj).f())) {
                return false;
            }
        }
        return true;
    }

    public static boolean j(byte[] bArr, Object obj) {
        return (obj instanceof z) && kotlin.jvm.internal.t.c(bArr, ((z) obj).t());
    }

    public static final byte k(byte[] bArr, int i) {
        return y.b(bArr[i]);
    }

    public static int n(byte[] bArr) {
        return bArr.length;
    }

    public static int o(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean p(byte[] bArr) {
        return bArr.length == 0;
    }

    public static Iterator q(byte[] bArr) {
        return new a(bArr);
    }

    public static final void r(byte[] bArr, int i, byte b) {
        bArr[i] = b;
    }

    public static String s(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof y) {
            return f(((y) obj).f());
        }
        return false;
    }

    public boolean containsAll(Collection elements) {
        kotlin.jvm.internal.t.g(elements, "elements");
        return h(this.a, elements);
    }

    public boolean equals(Object obj) {
        return j(this.a, obj);
    }

    public boolean f(byte b) {
        return g(this.a, b);
    }

    public int hashCode() {
        return o(this.a);
    }

    public boolean isEmpty() {
        return p(this.a);
    }

    public Iterator iterator() {
        return q(this.a);
    }

    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public int size() {
        return n(this.a);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ byte[] t() {
        return this.a;
    }

    public Object[] toArray() {
        return kotlin.jvm.internal.j.a(this);
    }

    public String toString() {
        return s(this.a);
    }

    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.t.g(array, "array");
        return kotlin.jvm.internal.j.b(this, array);
    }
}
