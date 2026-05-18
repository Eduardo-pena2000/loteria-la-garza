package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.u;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class c0 {
    public static final Class a = A();
    public static final h0 b = B();
    public static final h0 c = new j0();

    public static Class A() {
        if (W.d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static h0 B() {
        try {
            Class C = C();
            if (C == null) {
                return null;
            }
            return (h0) C.getConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class C() {
        if (W.d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void D(n nVar, Object obj, Object obj2) {
        q c2 = nVar.c(obj2);
        if (c2.j()) {
            return;
        }
        nVar.d(obj).p(c2);
    }

    public static void E(F f, Object obj, Object obj2, long j) {
        k0.O(obj, j, f.a(k0.z(obj, j), k0.z(obj2, j)));
    }

    public static void F(h0 h0Var, Object obj, Object obj2) {
        h0Var.p(obj, h0Var.k(h0Var.g(obj), h0Var.g(obj2)));
    }

    public static void G(Class cls) {
        Class cls2;
        if (!t.class.isAssignableFrom(cls) && !W.d && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean H(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static Object I(Object obj, int i, int i2, Object obj2, h0 h0Var) {
        if (obj2 == null) {
            obj2 = h0Var.f(obj);
        }
        h0Var.e(obj2, i, i2);
        return obj2;
    }

    public static h0 J() {
        return b;
    }

    public static h0 K() {
        return c;
    }

    public static void L(int i, List list, n0 n0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.A(i, list, z);
    }

    public static void M(int i, List list, n0 n0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.I(i, list);
    }

    public static void N(int i, List list, n0 n0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.G(i, list, z);
    }

    public static void O(int i, List list, n0 n0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.n(i, list, z);
    }

    public static void P(int i, List list, n0 n0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.j(i, list, z);
    }

    public static void Q(int i, List list, n0 n0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.y(i, list, z);
    }

    public static void R(int i, List list, n0 n0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.a(i, list, z);
    }

    public static void S(int i, List list, n0 n0Var, a0 a0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.J(i, list, a0Var);
    }

    public static void T(int i, List list, n0 n0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.g(i, list, z);
    }

    public static void U(int i, List list, n0 n0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.F(i, list, z);
    }

    public static void V(int i, List list, n0 n0Var, a0 a0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.O(i, list, a0Var);
    }

    public static void W(int i, List list, n0 n0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.z(i, list, z);
    }

    public static void X(int i, List list, n0 n0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.q(i, list, z);
    }

    public static void Y(int i, List list, n0 n0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.D(i, list, z);
    }

    public static void Z(int i, List list, n0 n0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.l(i, list, z);
    }

    public static int a(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? i.O(i) + i.y(size) : size * i.c(i, true);
    }

    public static void a0(int i, List list, n0 n0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.d(i, list);
    }

    public static int b(List list) {
        return list.size();
    }

    public static void b0(int i, List list, n0 n0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.k(i, list, z);
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int O = size * i.O(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            O += i.g((f) list.get(i2));
        }
        return O;
    }

    public static void c0(int i, List list, n0 n0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.r(i, list, z);
    }

    public static int d(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = e(list);
        return z ? i.O(i) + i.y(e) : e + (size * i.O(i));
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += i.k(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int f(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? i.O(i) + i.y(size * 4) : size * i.l(i, 0);
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? i.O(i) + i.y(size * 8) : size * i.n(i, 0L);
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i, List list, a0 a0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += i.r(i, (K) list.get(i3), a0Var);
        }
        return i2;
    }

    public static int k(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = l(list);
        return z ? i.O(i) + i.y(l) : l + (size * i.O(i));
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += i.v(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int m(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int n = n(list);
        return z ? i.O(i) + i.y(n) : n + (list.size() * i.O(i));
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += i.x(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int o(int i, Object obj, a0 a0Var) {
        return i.z(i, (K) obj, a0Var);
    }

    public static int p(int i, List list, a0 a0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int O = i.O(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            O += i.B((K) list.get(i2), a0Var);
        }
        return O;
    }

    public static int q(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r = r(list);
        return z ? i.O(i) + i.y(r) : r + (size * i.O(i));
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += i.J(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int s(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = t(list);
        return z ? i.O(i) + i.y(t) : t + (size * i.O(i));
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += i.L(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int u(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int O = i.O(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            O += obj instanceof f ? i.g((f) obj) : i.N((String) obj);
        }
        return O;
    }

    public static int v(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w = w(list);
        return z ? i.O(i) + i.y(w) : w + (size * i.O(i));
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += i.Q(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int x(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = y(list);
        return z ? i.O(i) + i.y(y) : y + (size * i.O(i));
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += i.S(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static Object z(Object obj, int i, List list, u.a aVar, Object obj2, h0 h0Var) {
        if (aVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int intValue = num.intValue();
                if (aVar.isInRange(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj2 = I(obj, i, intValue, obj2, h0Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!aVar.isInRange(intValue2)) {
                    obj2 = I(obj, i, intValue2, obj2, h0Var);
                    it.remove();
                }
            }
        }
        return obj2;
    }
}
