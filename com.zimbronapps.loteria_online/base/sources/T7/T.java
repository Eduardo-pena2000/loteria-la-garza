package t7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import t7.p;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class t extends p implements Set {
    public transient r b;

    public static class a extends p.a {
        public Object[] d;
        public int e;

        public a() {
            super(4);
        }

        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            s7.m.j(obj);
            if (this.d != null && t.j(this.b) <= this.d.length) {
                k(obj);
                return this;
            }
            this.d = null;
            super.d(obj);
            return this;
        }

        public a i(Object... objArr) {
            if (this.d != null) {
                for (Object obj : objArr) {
                    a(obj);
                }
            } else {
                super.e(objArr);
            }
            return this;
        }

        public a j(Iterable iterable) {
            s7.m.j(iterable);
            if (this.d != null) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            } else {
                super.b(iterable);
            }
            return this;
        }

        public final void k(Object obj) {
            Objects.requireNonNull(this.d);
            int length = this.d.length - 1;
            int hashCode = obj.hashCode();
            int a = o.a(hashCode);
            while (true) {
                int i = a & length;
                Object[] objArr = this.d;
                Object obj2 = objArr[i];
                if (obj2 == null) {
                    objArr[i] = obj;
                    this.e += hashCode;
                    super.d(obj);
                    return;
                } else if (obj2.equals(obj)) {
                    return;
                } else {
                    a = i + 1;
                }
            }
        }

        public t l() {
            t i;
            int i2 = this.b;
            if (i2 == 0) {
                return t.r();
            }
            if (i2 == 1) {
                Object obj = this.a[0];
                Objects.requireNonNull(obj);
                return t.s(obj);
            }
            if (this.d == null || t.j(i2) != this.d.length) {
                i = t.i(this.b, this.a);
                this.b = i.size();
            } else {
                Object[] copyOf = t.h(this.b, this.a.length) ? Arrays.copyOf(this.a, this.b) : this.a;
                i = new M(copyOf, this.e, this.d, r5.length - 1, this.b);
            }
            this.c = true;
            this.d = null;
            return i;
        }
    }

    public static /* synthetic */ boolean h(int i, int i2) {
        return x(i, i2);
    }

    public static /* synthetic */ t i(int i, Object[] objArr) {
        return k(i, objArr);
    }

    public static int j(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            s7.m.e(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static t k(int i, Object... objArr) {
        if (i == 0) {
            return r();
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return s(obj);
        }
        int j = j(i);
        Object[] objArr2 = new Object[j];
        int i2 = j - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object a2 = H.a(objArr[i5], i5);
            int hashCode = a2.hashCode();
            int a3 = o.a(hashCode);
            while (true) {
                int i6 = a3 & i2;
                Object obj2 = objArr2[i6];
                if (obj2 == null) {
                    objArr[i4] = a2;
                    objArr2[i6] = a2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (obj2.equals(a2)) {
                    break;
                }
                a3++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new Q(obj3);
        }
        if (j(i4) < j / 2) {
            return k(i4, objArr);
        }
        if (x(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new M(objArr, i3, objArr2, i2, i4);
    }

    public static t l(Collection collection) {
        if ((collection instanceof t) && !(collection instanceof SortedSet)) {
            t tVar = (t) collection;
            if (!tVar.g()) {
                return tVar;
            }
        }
        Object[] array = collection.toArray();
        return k(array.length, array);
    }

    public static t n(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? k(objArr.length, (Object[]) objArr.clone()) : s(objArr[0]) : r();
    }

    public static t r() {
        return M.i;
    }

    public static t s(Object obj) {
        return new Q(obj);
    }

    public static t t(Object obj, Object obj2) {
        return k(2, obj, obj2);
    }

    public static t u(Object obj, Object obj2, Object obj3) {
        return k(3, obj, obj2, obj3);
    }

    public static t v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return k(5, obj, obj2, obj3, obj4, obj5);
    }

    public static t w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        s7.m.e(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return k(length, objArr2);
    }

    public static boolean x(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public r a() {
        r rVar = this.b;
        if (rVar != null) {
            return rVar;
        }
        r o = o();
        this.b = o;
        return o;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof t) && p() && ((t) obj).p() && hashCode() != obj.hashCode()) {
            return false;
        }
        return P.a(this, obj);
    }

    public int hashCode() {
        return P.d(this);
    }

    public r o() {
        return r.h(toArray());
    }

    public boolean p() {
        return false;
    }

    public abstract U q();
}
