package f0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class n {
    public static final int a(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final e0.e b() {
        return l.b.a();
    }

    public static final Object[] c(Object obj) {
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return objArr;
    }

    public static final int d(int i) {
        return (i - 1) & (-32);
    }
}
