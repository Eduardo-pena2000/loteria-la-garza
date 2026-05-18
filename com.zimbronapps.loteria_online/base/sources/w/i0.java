package w;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class i0 {
    public int[] a;
    public Object[] b;
    public int c;

    public i0() {
        this(0, 1, null);
    }

    public final int a(Object obj) {
        int i = this.c * 2;
        Object[] objArr = this.b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (kotlin.jvm.internal.t.c(obj, objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public void b(int i) {
        int i2 = this.c;
        int[] iArr = this.a;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i * 2);
            kotlin.jvm.internal.t.f(copyOf2, "copyOf(...)");
            this.b = copyOf2;
        }
        if (this.c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.c > 0) {
            this.a = x.a.a;
            this.b = x.a.c;
            this.c = 0;
        }
        if (this.c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int e(Object obj, int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        int a = x.a.a(this.a, i2, i);
        if (a < 0) {
            return a;
        }
        if (kotlin.jvm.internal.t.c(obj, this.b[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.a[i3] == i) {
            if (kotlin.jvm.internal.t.c(obj, this.b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a - 1; i4 >= 0 && this.a[i4] == i; i4--) {
            if (kotlin.jvm.internal.t.c(obj, this.b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof i0) {
                if (size() != ((i0) obj).size()) {
                    return false;
                }
                i0 i0Var = (i0) obj;
                int i = this.c;
                for (int i2 = 0; i2 < i; i2++) {
                    Object h = h(i2);
                    Object n = n(i2);
                    Object obj2 = i0Var.get(h);
                    if (n == null) {
                        if (obj2 != null || !i0Var.containsKey(h)) {
                            return false;
                        }
                    } else if (!kotlin.jvm.internal.t.c(n, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.c;
            for (int i4 = 0; i4 < i3; i4++) {
                Object h2 = h(i4);
                Object n2 = n(i4);
                Object obj3 = ((Map) obj).get(h2);
                if (n2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(h2)) {
                        return false;
                    }
                } else if (!kotlin.jvm.internal.t.c(n2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (NullPointerException | ClassCastException unused) {
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    public final int g() {
        int i = this.c;
        if (i == 0) {
            return -1;
        }
        int a = x.a.a(this.a, i, 0);
        if (a < 0) {
            return a;
        }
        if (this.b[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.a[i2] == 0) {
            if (this.b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = a - 1; i3 >= 0 && this.a[i3] == 0; i3--) {
            if (this.b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public Object get(Object obj) {
        int f = f(obj);
        if (f >= 0) {
            return this.b[(f << 1) + 1];
        }
        return null;
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int f = f(obj);
        return f >= 0 ? this.b[(f << 1) + 1] : obj2;
    }

    public Object h(int i) {
        boolean z = false;
        if (i >= 0 && i < this.c) {
            z = true;
        }
        if (!z) {
            x.d.a("Expected index to be within 0..size()-1, but was " + i);
        }
        return this.b[i << 1];
    }

    public int hashCode() {
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int i = this.c;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        return this.c <= 0;
    }

    public void j(i0 i0Var) {
        kotlin.jvm.internal.t.g(i0Var, "map");
        int i = i0Var.c;
        b(this.c + i);
        if (this.c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(i0Var.h(i2), i0Var.n(i2));
            }
        } else if (i > 0) {
            Da.p.i(i0Var.a, this.a, 0, 0, i);
            Da.p.k(i0Var.b, this.b, 0, 0, i << 1);
            this.c = i;
        }
    }

    public Object k(int i) {
        if (!(i >= 0 && i < this.c)) {
            x.d.a("Expected index to be within 0..size()-1, but was " + i);
        }
        Object[] objArr = this.b;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.c;
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.a;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i4) {
                    int i5 = i + 1;
                    Da.p.i(iArr, iArr, i, i5, i3);
                    Object[] objArr2 = this.b;
                    Da.p.k(objArr2, objArr2, i2, i5 << 1, i3 << 1);
                }
                Object[] objArr3 = this.b;
                int i6 = i4 << 1;
                objArr3[i6] = null;
                objArr3[i6 + 1] = null;
            } else {
                int i7 = i3 > 8 ? i3 + (i3 >> 1) : 8;
                int[] copyOf = Arrays.copyOf(iArr, i7);
                kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
                this.a = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.b, i7 << 1);
                kotlin.jvm.internal.t.f(copyOf2, "copyOf(...)");
                this.b = copyOf2;
                if (i3 != this.c) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    Da.p.i(iArr, this.a, 0, 0, i);
                    Da.p.k(objArr, this.b, 0, 0, i2);
                }
                if (i < i4) {
                    int i8 = i + 1;
                    Da.p.i(iArr, this.a, i, i8, i3);
                    Da.p.k(objArr, this.b, i2, i8 << 1, i3 << 1);
                }
            }
            if (i3 != this.c) {
                throw new ConcurrentModificationException();
            }
            this.c = i4;
        }
        return obj;
    }

    public Object m(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.c) {
            z = true;
        }
        if (!z) {
            x.d.a("Expected index to be within 0..size()-1, but was " + i);
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public Object n(int i) {
        boolean z = false;
        if (i >= 0 && i < this.c) {
            z = true;
        }
        if (!z) {
            x.d.a("Expected index to be within 0..size()-1, but was " + i);
        }
        return this.b[(i << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i = this.c;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int e = obj != null ? e(obj, hashCode) : g();
        if (e >= 0) {
            int i2 = (e << 1) + 1;
            Object[] objArr = this.b;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~e;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i4);
            kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i4 << 1);
            kotlin.jvm.internal.t.f(copyOf2, "copyOf(...)");
            this.b = copyOf2;
            if (i != this.c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.a;
            int i5 = i3 + 1;
            Da.p.i(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.b;
            Da.p.k(objArr2, objArr2, i5 << 1, i3 << 1, this.c << 1);
        }
        int i6 = this.c;
        if (i == i6) {
            int[] iArr3 = this.a;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.b;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.c = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int f = f(obj);
        if (f >= 0) {
            return k(f);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int f = f(obj);
        if (f >= 0) {
            return m(f, obj2);
        }
        return null;
    }

    public int size() {
        return this.c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 28);
        sb.append('{');
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object h = h(i2);
            if (h != sb) {
                sb.append(h);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object n = n(i2);
            if (n != sb) {
                sb.append(n);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.t.f(sb2, "toString(...)");
        return sb2;
    }

    public i0(int i) {
        this.a = i == 0 ? x.a.a : new int[i];
        this.b = i == 0 ? x.a.c : new Object[i << 1];
    }

    public boolean remove(Object obj, Object obj2) {
        int f = f(obj);
        if (f < 0 || !kotlin.jvm.internal.t.c(obj2, n(f))) {
            return false;
        }
        k(f);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int f = f(obj);
        if (f < 0 || !kotlin.jvm.internal.t.c(obj2, n(f))) {
            return false;
        }
        m(f, obj3);
        return true;
    }

    public /* synthetic */ i0(int i, int i2, kotlin.jvm.internal.k kVar) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public i0(i0 i0Var) {
        this(0, 1, null);
        if (i0Var != null) {
            j(i0Var);
        }
    }
}
