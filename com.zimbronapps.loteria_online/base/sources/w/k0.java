package w;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class k0 {
    public static final Object a = new Object();

    public static final /* synthetic */ void a(j0 j0Var) {
        d(j0Var);
    }

    public static final /* synthetic */ Object b() {
        return a;
    }

    public static final Object c(j0 j0Var, int i) {
        Object obj;
        kotlin.jvm.internal.t.g(j0Var, "<this>");
        int a2 = x.a.a(j0Var.b, j0Var.d, i);
        if (a2 < 0 || (obj = j0Var.c[a2]) == a) {
            return null;
        }
        return obj;
    }

    public static final void d(j0 j0Var) {
        int i = j0Var.d;
        int[] iArr = j0Var.b;
        Object[] objArr = j0Var.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        j0Var.a = false;
        j0Var.d = i2;
    }
}
