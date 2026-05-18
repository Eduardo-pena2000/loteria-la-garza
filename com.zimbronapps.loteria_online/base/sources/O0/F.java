package O0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class f {
    public static final int b(int[] iArr, int i) {
        return iArr[i + c(iArr)];
    }

    public static final int c(int[] iArr) {
        return iArr.length / 2;
    }

    public static final void d(int[] iArr, int i, int i2) {
        iArr[i + c(iArr)] = i2;
    }

    public static int[] a(int[] iArr) {
        return iArr;
    }
}
