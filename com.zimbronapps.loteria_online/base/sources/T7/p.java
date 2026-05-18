package t7;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class p extends AbstractCollection implements Serializable {
    public static final Object[] a = new Object[0];

    public static abstract class a extends b {
        public Object[] a;
        public int b;
        public boolean c;

        public a(int i) {
            h.b(i, "initialCapacity");
            this.a = new Object[i];
            this.b = 0;
        }

        public b b(Iterable iterable) {
            if (iterable instanceof Collection) {
                p pVar = (Collection) iterable;
                g(this.b + pVar.size());
                if (pVar instanceof p) {
                    this.b = pVar.b(this.a, this.b);
                    return this;
                }
            }
            super.b(iterable);
            return this;
        }

        public a d(Object obj) {
            s7.m.j(obj);
            g(this.b + 1);
            Object[] objArr = this.a;
            int i = this.b;
            this.b = i + 1;
            objArr[i] = obj;
            return this;
        }

        public b e(Object... objArr) {
            f(objArr, objArr.length);
            return this;
        }

        public final void f(Object[] objArr, int i) {
            H.c(objArr, i);
            g(this.b + i);
            System.arraycopy(objArr, 0, this.a, this.b, i);
            this.b += i;
        }

        public final void g(int i) {
            Object[] objArr = this.a;
            if (objArr.length < i) {
                this.a = Arrays.copyOf(objArr, b.c(objArr.length, i));
                this.c = false;
            } else if (this.c) {
                this.a = (Object[]) objArr.clone();
                this.c = false;
            }
        }
    }

    public static abstract class b {
        public static int c(int i, int i2) {
            if (i2 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i3 = i + (i >> 1) + 1;
            if (i3 < i2) {
                i3 = Integer.highestOneBit(i2 - 1) << 1;
            }
            if (i3 < 0) {
                return Integer.MAX_VALUE;
            }
            return i3;
        }

        public abstract b a(Object obj);

        public b b(Iterable iterable) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }
    }

    public abstract r a();

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public abstract int b(Object[] objArr, int i);

    public Object[] c() {
        return null;
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    public int e() {
        throw new UnsupportedOperationException();
    }

    public int f() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean g();

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(a);
    }

    public final Object[] toArray(Object[] objArr) {
        s7.m.j(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] c = c();
            if (c != null) {
                return J.a(c, f(), e(), objArr);
            }
            objArr = H.d(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        b(objArr, 0);
        return objArr;
    }
}
