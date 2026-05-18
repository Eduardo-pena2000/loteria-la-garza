package f0;

import Da.p;
import b0.V0;
import e0.e;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h extends Da.h implements e.a {
    public e0.e a;
    public Object[] b;
    public Object[] c;
    public int d;
    public i0.e e = new i0.e();
    public Object[] f;
    public Object[] g;
    public int h;

    public h(e0.e eVar, Object[] objArr, Object[] objArr2, int i) {
        this.a = eVar;
        this.b = objArr;
        this.c = objArr2;
        this.d = i;
        this.f = this.b;
        this.g = this.c;
        this.h = this.a.size();
    }

    public static final boolean I(Collection collection, Object obj) {
        return collection.contains(obj);
    }

    private final Object[] L(Object[] objArr, int i, int i2, e eVar) {
        int a = n.a(i2, i);
        if (i == 0) {
            Object obj = objArr[a];
            Object[] k = p.k(objArr, t(objArr), a, a + 1, 32);
            k[31] = eVar.a();
            eVar.b(obj);
            return k;
        }
        int a2 = objArr[31] == null ? n.a(O() - 1, i) : 31;
        Object[] t = t(objArr);
        int i3 = i - 5;
        int i4 = a + 1;
        if (i4 <= a2) {
            while (true) {
                Object obj2 = t[a2];
                t.e(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                t[a2] = L((Object[]) obj2, i3, 0, eVar);
                if (a2 == i4) {
                    break;
                }
                a2--;
            }
        }
        Object obj3 = t[a];
        t.e(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        t[a] = L((Object[]) obj3, i3, i2, eVar);
        return t;
    }

    private final int O() {
        if (size() <= 32) {
            return 0;
        }
        return n.d(size());
    }

    public static /* synthetic */ boolean e(Collection collection, Object obj) {
        return I(collection, obj);
    }

    private final Object[] f(int i) {
        if (O() <= i) {
            return this.g;
        }
        Object[] objArr = this.f;
        t.d(objArr);
        for (int i2 = this.d; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[n.a(i, i2)];
            t.e(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] p(Object[] objArr, int i, int i2, Object obj, e eVar) {
        Object obj2;
        int a = n.a(i2, i);
        if (i == 0) {
            eVar.b(objArr[31]);
            Object[] k = p.k(objArr, t(objArr), a + 1, a, 31);
            k[a] = obj;
            return k;
        }
        Object[] t = t(objArr);
        int i3 = i - 5;
        Object obj3 = t[a];
        t.e(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        t[a] = p((Object[]) obj3, i3, i2, obj, eVar);
        while (true) {
            a++;
            if (a >= 32 || (obj2 = t[a]) == null) {
                break;
            }
            t.e(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            t[a] = p((Object[]) obj2, i3, 0, eVar.a(), eVar);
        }
        return t;
    }

    private final Object[] y(Object[] objArr, int i, int i2, e eVar) {
        Object[] y;
        int a = n.a(i2 - 1, i);
        if (i == 5) {
            eVar.b(objArr[a]);
            y = null;
        } else {
            Object obj = objArr[a];
            t.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            y = y((Object[]) obj, i - 5, i2, eVar);
        }
        if (y == null && a == 0) {
            return null;
        }
        Object[] t = t(objArr);
        t[a] = y;
        return t;
    }

    public final Object[] A(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            V0.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            V0.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] t = t(objArr);
        int a = n.a(i, i2);
        int i3 = i2 - 5;
        t[a] = A((Object[]) t[a], i, i3, it);
        while (true) {
            a++;
            if (a >= 32 || !it.hasNext()) {
                break;
            }
            t[a] = A((Object[]) t[a], 0, i3, it);
        }
        return t;
    }

    public final Object[] B(Object[] objArr, int i, Object[][] objArr2) {
        Iterator a = kotlin.jvm.internal.c.a(objArr2);
        int i2 = i >> 5;
        int i3 = this.d;
        Object[] A = i2 < (1 << i3) ? A(objArr, i, i3, a) : t(objArr);
        while (a.hasNext()) {
            this.d += 5;
            A = w(A);
            int i4 = this.d;
            A(A, 1 << i4, i4, a);
        }
        return A;
    }

    public final void C(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.d;
        if (size > (1 << i)) {
            this.f = D(w(objArr), objArr2, this.d + 5);
            this.g = objArr3;
            this.d += 5;
            this.h = size() + 1;
            return;
        }
        if (objArr == null) {
            this.f = objArr2;
            this.g = objArr3;
            this.h = size() + 1;
        } else {
            this.f = D(objArr, objArr2, i);
            this.g = objArr3;
            this.h = size() + 1;
        }
    }

    public final Object[] D(Object[] objArr, Object[] objArr2, int i) {
        int a = n.a(size() - 1, i);
        Object[] t = t(objArr);
        if (i == 5) {
            t[a] = objArr2;
        } else {
            t[a] = D((Object[]) t[a], objArr2, i - 5);
        }
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int E(Qa.l lVar, Object[] objArr, int i, int i2, e eVar, List list, List list2) {
        if (r(objArr)) {
            list.add(objArr);
        }
        Object a = eVar.a();
        t.e(a, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) a;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (!((Boolean) lVar.invoke(obj)).booleanValue()) {
                if (i2 == 32) {
                    objArr3 = !list.isEmpty() ? (Object[]) list.remove(list.size() - 1) : v();
                    i2 = 0;
                }
                objArr3[i2] = obj;
                i2++;
            }
        }
        eVar.b(objArr3);
        if (objArr2 != eVar.a()) {
            list2.add(objArr2);
        }
        return i2;
    }

    public final int F(Qa.l lVar, Object[] objArr, int i, e eVar) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = t(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        eVar.b(objArr2);
        return i2;
    }

    public final boolean H(Qa.l lVar) {
        Object[] A;
        int S = S();
        e eVar = new e(null);
        if (this.f == null) {
            return J(lVar, S, eVar) != S;
        }
        ListIterator s = s(0);
        int i = 32;
        while (i == 32 && s.hasNext()) {
            i = F(lVar, (Object[]) s.next(), 32, eVar);
        }
        if (i == 32) {
            i0.a.a(!s.hasNext());
            int J = J(lVar, S, eVar);
            if (J == 0) {
                z(this.f, size(), this.d);
            }
            return J != S;
        }
        int previousIndex = s.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = i;
        while (s.hasNext()) {
            i2 = E(lVar, (Object[]) s.next(), 32, i2, eVar, arrayList2, arrayList);
            previousIndex = previousIndex;
        }
        int i3 = previousIndex;
        int E = E(lVar, this.g, S, i2, eVar, arrayList2, arrayList);
        Object a = eVar.a();
        t.e(a, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) a;
        p.u(objArr, (Object) null, E, 32);
        if (arrayList.isEmpty()) {
            A = this.f;
            t.d(A);
        } else {
            A = A(this.f, i3, this.d, arrayList.iterator());
        }
        int size = i3 + (arrayList.size() << 5);
        this.f = N(A, size);
        this.g = objArr;
        this.h = size + E;
        return true;
    }

    public final int J(Qa.l lVar, int i, e eVar) {
        int F = F(lVar, this.g, i, eVar);
        if (F == i) {
            i0.a.a(eVar.a() == this.g);
            return i;
        }
        Object a = eVar.a();
        t.e(a, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) a;
        p.u(objArr, (Object) null, F, i);
        this.g = objArr;
        this.h = size() - (i - F);
        return F;
    }

    public final boolean K(Qa.l lVar) {
        boolean H = H(lVar);
        if (H) {
            ((AbstractList) this).modCount++;
        }
        return H;
    }

    public final Object M(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        i0.a.a(i3 < size);
        if (size == 1) {
            Object obj = this.g[0];
            z(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.g;
        Object obj2 = objArr2[i3];
        Object[] k = p.k(objArr2, t(objArr2), i3, i3 + 1, size);
        k[size - 1] = null;
        this.f = objArr;
        this.g = k;
        this.h = (i + size) - 1;
        this.d = i2;
        return obj2;
    }

    public final Object[] N(Object[] objArr, int i) {
        if (!((i & 31) == 0)) {
            V0.a("invalid size");
        }
        if (i == 0) {
            this.d = 0;
            return null;
        }
        int i2 = i - 1;
        while (true) {
            int i3 = this.d;
            if ((i2 >> i3) != 0) {
                return x(objArr, i2, i3);
            }
            this.d = i3 - 5;
            Object[] objArr2 = objArr[0];
            t.e(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
    }

    public final Object[] P(Object[] objArr, int i, int i2, Object obj, e eVar) {
        int a = n.a(i2, i);
        Object[] t = t(objArr);
        if (i != 0) {
            Object obj2 = t[a];
            t.e(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            t[a] = P((Object[]) obj2, i - 5, i2, obj, eVar);
            return t;
        }
        if (t != objArr) {
            ((AbstractList) this).modCount++;
        }
        eVar.b(t[a]);
        t[a] = obj;
        return t;
    }

    public final Object[] Q(int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f == null) {
            throw new IllegalStateException("root is null");
        }
        ListIterator s = s(O() >> 5);
        while (s.previousIndex() != i) {
            Object[] objArr3 = (Object[]) s.previous();
            p.k(objArr3, objArr2, 0, 32 - i2, 32);
            objArr2 = u(objArr3, i2);
            i3--;
            objArr[i3] = objArr2;
        }
        return (Object[]) s.previous();
    }

    public final void R(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] v;
        if (!(i3 >= 1)) {
            V0.a("requires at least one nullBuffer");
        }
        Object[] t = t(objArr);
        objArr2[0] = t;
        int i4 = i & 31;
        int size = ((i + collection.size()) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            p.k(t, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                v = t;
            } else {
                v = v();
                i3--;
                objArr2[i3] = v;
            }
            int i7 = i2 - i6;
            p.k(t, objArr3, 0, i7, i2);
            p.k(t, v, size + 1, i4, i7);
            objArr3 = v;
        }
        Iterator it = collection.iterator();
        g(t, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            objArr2[i8] = g(v(), 0, it);
        }
        g(objArr3, 0, it);
    }

    public final int S() {
        return T(size());
    }

    public final int T(int i) {
        return i <= 32 ? i : i - n.d(i);
    }

    public int a() {
        return this.h;
    }

    public boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int S = S();
        if (S < 32) {
            Object[] t = t(this.g);
            t[S] = obj;
            this.g = t;
            this.h = size() + 1;
        } else {
            C(this.f, this.g, w(obj));
        }
        return true;
    }

    public boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int S = S();
        Iterator it = collection.iterator();
        if (32 - S >= collection.size()) {
            this.g = g(t(this.g), S, it);
            this.h = size() + collection.size();
        } else {
            int size = ((collection.size() + S) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = g(t(this.g), S, it);
            for (int i = 1; i < size; i++) {
                objArr[i] = g(v(), 0, it);
            }
            this.f = B(this.f, O(), objArr);
            this.g = g(v(), 0, it);
            this.h = size() + collection.size();
        }
        return true;
    }

    public Object b(int i) {
        i0.d.a(i, size());
        ((AbstractList) this).modCount++;
        int O = O();
        if (i >= O) {
            return M(this.f, O, this.d, i - O);
        }
        e eVar = new e(this.g[0]);
        Object[] objArr = this.f;
        t.d(objArr);
        M(L(objArr, this.d, i, eVar), O, this.d, 0);
        return eVar.a();
    }

    public e0.e build() {
        e0.e fVar;
        if (this.f == this.b && this.g == this.c) {
            fVar = this.a;
        } else {
            this.e = new i0.e();
            Object[] objArr = this.f;
            this.b = objArr;
            Object[] objArr2 = this.g;
            this.c = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.f;
                t.d(objArr3);
                fVar = new f(objArr3, this.g, size(), this.d);
            } else if (objArr2.length == 0) {
                fVar = n.b();
            } else {
                Object[] copyOf = Arrays.copyOf(this.g, size());
                t.f(copyOf, "copyOf(...)");
                fVar = new l(copyOf);
            }
        }
        this.a = fVar;
        return fVar;
    }

    public final Object[] g(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    public Object get(int i) {
        i0.d.a(i, size());
        return f(i)[i & 31];
    }

    public final int h() {
        return ((AbstractList) this).modCount;
    }

    public Iterator iterator() {
        return listIterator();
    }

    public final Object[] j() {
        return this.f;
    }

    public final int k() {
        return this.d;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public final Object[] n() {
        return this.g;
    }

    public final void o(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f == null) {
            throw new IllegalStateException("root is null");
        }
        int i4 = i >> 5;
        Object[] Q = Q(i4, i2, objArr, i3, objArr2);
        int O = i3 - (((O() >> 5) - 1) - i4);
        if (O < i3) {
            objArr2 = objArr[O];
            t.d(objArr2);
        }
        R(collection, i, Q, 32, objArr, O, objArr2);
    }

    public final void q(Object[] objArr, int i, Object obj) {
        int S = S();
        Object[] t = t(this.g);
        if (S < 32) {
            p.k(this.g, t, i + 1, i, S);
            t[i] = obj;
            this.f = objArr;
            this.g = t;
            this.h = size() + 1;
            return;
        }
        Object[] objArr2 = this.g;
        Object obj2 = objArr2[31];
        p.k(objArr2, t, i + 1, i, 31);
        t[i] = obj;
        C(objArr, t, w(obj2));
    }

    public final boolean r(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.e;
    }

    public boolean removeAll(Collection collection) {
        return K(new g(collection));
    }

    public final ListIterator s(int i) {
        Object[] objArr = this.f;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int O = O() >> 5;
        i0.d.b(i, O);
        int i2 = this.d;
        return i2 == 0 ? new k(objArr, i) : new m(objArr, i, O, i2 / 5);
    }

    public Object set(int i, Object obj) {
        i0.d.a(i, size());
        if (O() > i) {
            e eVar = new e(null);
            Object[] objArr = this.f;
            t.d(objArr);
            this.f = P(objArr, this.d, i, obj, eVar);
            return eVar.a();
        }
        Object[] t = t(this.g);
        if (t != this.g) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = t[i2];
        t[i2] = obj;
        this.g = t;
        return obj2;
    }

    public final Object[] t(Object[] objArr) {
        return objArr == null ? v() : r(objArr) ? objArr : p.p(objArr, v(), 0, 0, Wa.n.i(objArr.length, 32), 6, (Object) null);
    }

    public final Object[] u(Object[] objArr, int i) {
        return r(objArr) ? p.k(objArr, objArr, i, 0, 32 - i) : p.k(objArr, v(), i, 0, 32 - i);
    }

    public final Object[] v() {
        Object[] objArr = new Object[33];
        objArr[32] = this.e;
        return objArr;
    }

    public final Object[] w(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.e;
        return objArr;
    }

    public final Object[] x(Object[] objArr, int i, int i2) {
        if (!(i2 >= 0)) {
            V0.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int a = n.a(i, i2);
        Object obj = objArr[a];
        t.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object x = x((Object[]) obj, i, i2 - 5);
        if (a < 31) {
            int i3 = a + 1;
            if (objArr[i3] != null) {
                if (r(objArr)) {
                    p.u(objArr, (Object) null, i3, 32);
                }
                objArr = p.k(objArr, v(), 0, 0, i3);
            }
        }
        if (x == objArr[a]) {
            return objArr;
        }
        Object[] t = t(objArr);
        t[a] = x;
        return t;
    }

    public final void z(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.g = objArr;
            this.h = i;
            this.d = i2;
            return;
        }
        e eVar = new e(null);
        t.d(objArr);
        Object[] y = y(objArr, i2, i, eVar);
        t.d(y);
        Object a = eVar.a();
        t.e(a, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.g = (Object[]) a;
        this.h = i;
        if (y[1] == null) {
            this.f = (Object[]) y[0];
            this.d = i2 - 5;
        } else {
            this.f = y;
            this.d = i2;
        }
    }

    public ListIterator listIterator(int i) {
        i0.d.b(i, size());
        return new j(this, i);
    }

    public void add(int i, Object obj) {
        i0.d.b(i, size());
        if (i == size()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int O = O();
        if (i >= O) {
            q(this.f, i - O, obj);
            return;
        }
        e eVar = new e(null);
        Object[] objArr = this.f;
        t.d(objArr);
        q(p(objArr, this.d, i, obj, eVar), 0, eVar.a());
    }

    public boolean addAll(int i, Collection collection) {
        Object[] k;
        i0.d.b(i, size());
        if (i == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = (((size() - i2) + collection.size()) - 1) / 32;
        if (size == 0) {
            i0.a.a(i >= O());
            int i3 = i & 31;
            int size2 = ((i + collection.size()) - 1) & 31;
            Object[] objArr = this.g;
            Object[] k2 = p.k(objArr, t(objArr), size2 + 1, i3, S());
            g(k2, i3, collection.iterator());
            this.g = k2;
            this.h = size() + collection.size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int S = S();
        int T = T(size() + collection.size());
        if (i >= O()) {
            k = v();
            R(collection, i, this.g, S, objArr2, size, k);
        } else if (T > S) {
            int i4 = T - S;
            k = u(this.g, i4);
            o(collection, i, i4, objArr2, size, k);
        } else {
            int i5 = S - T;
            k = p.k(this.g, v(), 0, i5, S);
            int i6 = 32 - i5;
            Object[] u = u(this.g, i6);
            int i7 = size - 1;
            objArr2[i7] = u;
            o(collection, i, i6, objArr2, i7, u);
        }
        this.f = B(this.f, i2, objArr2);
        this.g = k;
        this.h = size() + collection.size();
        return true;
    }
}
