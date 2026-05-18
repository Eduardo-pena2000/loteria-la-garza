package g0;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class x {
    public static final /* synthetic */ Object[] a(Object[] objArr, int i, Object obj, Object obj2) {
        return g(objArr, i, obj, obj2);
    }

    public static final /* synthetic */ Object[] b(Object[] objArr, int i) {
        return h(objArr, i);
    }

    public static final /* synthetic */ Object[] c(Object[] objArr, int i) {
        return i(objArr, i);
    }

    public static final /* synthetic */ Object[] d(Object[] objArr, int i, int i2, t tVar) {
        return j(objArr, i, i2, tVar);
    }

    public static final /* synthetic */ Object[] e(Object[] objArr, int i, int i2, Object obj, Object obj2) {
        return k(objArr, i, i2, obj, obj2);
    }

    public static final int f(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final Object[] g(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        Da.p.p(objArr, objArr2, 0, 0, i, 6, (Object) null);
        Da.p.k(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] h(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 2];
        Da.p.p(objArr, objArr2, 0, 0, i, 6, (Object) null);
        Da.p.k(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] i(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 1];
        Da.p.p(objArr, objArr2, 0, 0, i, 6, (Object) null);
        Da.p.k(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    public static final Object[] j(Object[] objArr, int i, int i2, t tVar) {
        Object[] objArr2 = new Object[objArr.length - 1];
        Da.p.p(objArr, objArr2, 0, 0, i, 6, (Object) null);
        Da.p.k(objArr, objArr2, i, i + 2, i2);
        objArr2[i2 - 2] = tVar;
        Da.p.k(objArr, objArr2, i2 - 1, i2, objArr.length);
        return objArr2;
    }

    public static final Object[] k(Object[] objArr, int i, int i2, Object obj, Object obj2) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
        Da.p.k(copyOf, copyOf, i + 2, i + 1, objArr.length);
        Da.p.k(copyOf, copyOf, i2 + 2, i2, i);
        copyOf[i2] = obj;
        copyOf[i2 + 1] = obj2;
        return copyOf;
    }
}
