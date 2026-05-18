package l1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class g {
    public static final /* synthetic */ int a(int i, int i2, int i3) {
        return e(i, i2, i3);
    }

    public static final /* synthetic */ int b(int i) {
        return f(i);
    }

    public static final /* synthetic */ int c(int i) {
        return g(i);
    }

    public static final /* synthetic */ int d(int i) {
        return h(i);
    }

    public static final int e(int i, int i2, int i3) {
        return i | (i2 << 8) | (i3 << 16);
    }

    public static final int f(int i) {
        return i & 255;
    }

    public static final int g(int i) {
        return (i >> 8) & 255;
    }

    public static final int h(int i) {
        return (i >> 16) & 255;
    }
}
