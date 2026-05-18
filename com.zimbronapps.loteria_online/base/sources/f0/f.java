package f0;

import Da.p;
import b0.V0;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f extends c implements e0.e {
    public final Object[] a;
    public final Object[] b;
    public final int c;
    public final int d;

    public f(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.a = objArr;
        this.b = objArr2;
        this.c = i;
        this.d = i2;
        if (!(size() > 32)) {
            V0.a("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        i0.a.a(size() - n.d(size()) <= Wa.n.i(objArr2.length, 32));
    }

    public e0.e G(int i) {
        i0.d.a(i, size());
        int t = t();
        return i >= t ? s(this.a, t, this.d, i - t) : s(r(this.a, this.d, i, new e(this.b[0])), t, this.d, 0);
    }

    public e0.e add(Object obj) {
        int size = size() - t();
        if (size >= 32) {
            return p(this.a, this.b, n.c(obj));
        }
        Object[] copyOf = Arrays.copyOf(this.b, 32);
        t.f(copyOf, "copyOf(...)");
        copyOf[size] = obj;
        return new f(this.a, copyOf, size() + 1, this.d);
    }

    public e0.e b1(Qa.l lVar) {
        h d = d();
        d.K(lVar);
        return d.build();
    }

    public final Object[] g(int i) {
        if (t() <= i) {
            return this.b;
        }
        Object[] objArr = this.a;
        for (int i2 = this.d; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[n.a(i, i2)];
            t.e(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    public Object get(int i) {
        i0.d.a(i, size());
        return g(i)[i & 31];
    }

    public int getSize() {
        return this.c;
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public h d() {
        return new h(this, this.a, this.b, this.d);
    }

    public final Object[] j(Object[] objArr, int i, int i2, Object obj, e eVar) {
        Object[] copyOf;
        int a = n.a(i2, i);
        if (i == 0) {
            if (a == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                t.f(copyOf, "copyOf(...)");
            }
            p.k(objArr, copyOf, a + 1, a, 31);
            eVar.b(objArr[31]);
            copyOf[a] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        t.f(copyOf2, "copyOf(...)");
        int i3 = i - 5;
        Object obj2 = objArr[a];
        String str = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        t.e(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[a] = j((Object[]) obj2, i3, i2, obj, eVar);
        int i4 = a + 1;
        while (i4 < 32 && copyOf2[i4] != null) {
            Object obj3 = objArr[i4];
            t.e(obj3, str);
            Object[] objArr2 = copyOf2;
            objArr2[i4] = j((Object[]) obj3, i3, 0, eVar.a(), eVar);
            i4++;
            copyOf2 = objArr2;
            str = str;
        }
        return copyOf2;
    }

    public final f k(Object[] objArr, int i, Object obj) {
        int size = size() - t();
        Object[] copyOf = Arrays.copyOf(this.b, 32);
        t.f(copyOf, "copyOf(...)");
        if (size < 32) {
            p.k(this.b, copyOf, i + 1, i, size);
            copyOf[i] = obj;
            return new f(objArr, copyOf, size() + 1, this.d);
        }
        Object[] objArr2 = this.b;
        Object obj2 = objArr2[31];
        p.k(objArr2, copyOf, i + 1, i, size - 1);
        copyOf[i] = obj;
        return p(objArr, copyOf, n.c(obj2));
    }

    public ListIterator listIterator(int i) {
        i0.d.b(i, size());
        return new i(this.a, this.b, i, size(), (this.d / 5) + 1);
    }

    public final Object[] n(Object[] objArr, int i, int i2, e eVar) {
        Object[] n;
        int a = n.a(i2, i);
        if (i == 5) {
            eVar.b(objArr[a]);
            n = null;
        } else {
            Object obj = objArr[a];
            t.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            n = n((Object[]) obj, i - 5, i2, eVar);
        }
        if (n == null && a == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        t.f(copyOf, "copyOf(...)");
        copyOf[a] = n;
        return copyOf;
    }

    public final e0.e o(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                t.f(objArr, "copyOf(...)");
            }
            return new l(objArr);
        }
        e eVar = new e(null);
        Object[] n = n(objArr, i2, i - 1, eVar);
        t.d(n);
        Object a = eVar.a();
        t.e(a, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) a;
        if (n[1] != null) {
            return new f(n, objArr2, i, i2);
        }
        Object obj = n[0];
        t.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new f((Object[]) obj, objArr2, i, i2 - 5);
    }

    public final f p(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.d;
        if (size <= (1 << i)) {
            return new f(q(objArr, i, objArr2), objArr3, size() + 1, this.d);
        }
        Object[] c = n.c(objArr);
        int i2 = this.d + 5;
        return new f(q(c, i2, objArr2), objArr3, size() + 1, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object[] q(java.lang.Object[] r4, int r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + (-1)
            int r0 = f0.n.a(r0, r5)
            r1 = 32
            if (r4 == 0) goto L19
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r2 = "copyOf(...)"
            kotlin.jvm.internal.t.f(r4, r2)
            if (r4 != 0) goto L1b
        L19:
            java.lang.Object[] r4 = new java.lang.Object[r1]
        L1b:
            r1 = 5
            if (r5 != r1) goto L21
            r4[r0] = r6
            goto L2c
        L21:
            r2 = r4[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r5 = r5 - r1
            java.lang.Object[] r5 = r3.q(r2, r5, r6)
            r4[r0] = r5
        L2c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.f.q(java.lang.Object[], int, java.lang.Object[]):java.lang.Object[]");
    }

    public final Object[] r(Object[] objArr, int i, int i2, e eVar) {
        Object[] copyOf;
        int a = n.a(i2, i);
        if (i == 0) {
            if (a == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                t.f(copyOf, "copyOf(...)");
            }
            p.k(objArr, copyOf, a, a + 1, 32);
            copyOf[31] = eVar.a();
            eVar.b(objArr[a]);
            return copyOf;
        }
        int a2 = objArr[31] == null ? n.a(t() - 1, i) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        t.f(copyOf2, "copyOf(...)");
        int i3 = i - 5;
        int i4 = a + 1;
        if (i4 <= a2) {
            while (true) {
                Object obj = copyOf2[a2];
                t.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[a2] = r((Object[]) obj, i3, 0, eVar);
                if (a2 == i4) {
                    break;
                }
                a2--;
            }
        }
        Object obj2 = copyOf2[a];
        t.e(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[a] = r((Object[]) obj2, i3, i2, eVar);
        return copyOf2;
    }

    public final e0.e s(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        i0.a.a(i3 < size);
        if (size == 1) {
            return o(objArr, i, i2);
        }
        Object[] copyOf = Arrays.copyOf(this.b, 32);
        t.f(copyOf, "copyOf(...)");
        int i4 = size - 1;
        if (i3 < i4) {
            p.k(this.b, copyOf, i3, i3 + 1, size);
        }
        copyOf[i4] = null;
        return new f(objArr, copyOf, (i + size) - 1, i2);
    }

    public e0.e set(int i, Object obj) {
        i0.d.a(i, size());
        if (t() > i) {
            return new f(u(this.a, this.d, i, obj), this.b, size(), this.d);
        }
        Object[] copyOf = Arrays.copyOf(this.b, 32);
        t.f(copyOf, "copyOf(...)");
        copyOf[i & 31] = obj;
        return new f(this.a, copyOf, size(), this.d);
    }

    public final int t() {
        return n.d(size());
    }

    public final Object[] u(Object[] objArr, int i, int i2, Object obj) {
        int a = n.a(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        t.f(copyOf, "copyOf(...)");
        if (i == 0) {
            copyOf[a] = obj;
        } else {
            Object obj2 = copyOf[a];
            t.e(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[a] = u((Object[]) obj2, i - 5, i2, obj);
        }
        return copyOf;
    }

    public e0.e add(int i, Object obj) {
        i0.d.b(i, size());
        if (i == size()) {
            return add(obj);
        }
        int t = t();
        if (i >= t) {
            return k(this.a, i - t, obj);
        }
        e eVar = new e(null);
        return k(j(this.a, this.d, i, obj, eVar), 0, eVar.a());
    }
}
