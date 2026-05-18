package z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class k0 {
    public static long a(int i, int i2) {
        return b(i * i2);
    }

    public static /* synthetic */ long c(int i, int i2, int i3, kotlin.jvm.internal.k kVar) {
        if ((i3 & 2) != 0) {
            i2 = l0.a.a();
        }
        return a(i, i2);
    }

    public static final boolean d(long j, long j2) {
        return j == j2;
    }

    public static int e(long j) {
        return Long.hashCode(j);
    }

    public static long b(long j) {
        return j;
    }
}
