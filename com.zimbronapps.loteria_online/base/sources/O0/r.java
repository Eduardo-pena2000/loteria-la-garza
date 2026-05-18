package O0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class r {
    public static final int a(long j, long j2) {
        boolean e = e(j);
        if (e != e(j2)) {
            return e ? -1 : 1;
        }
        int signum = (int) Math.signum(c(j) - c(j2));
        return Math.min(c(j), c(j2)) < 0.0f ? signum : d(j) != d(j2) ? d(j) ? -1 : 1 : signum;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean d(long j) {
        return (j & 2) != 0;
    }

    public static final boolean e(long j) {
        return (j & 1) != 0;
    }

    public static long b(long j) {
        return j;
    }
}
