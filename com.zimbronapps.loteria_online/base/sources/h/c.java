package H;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c {
    public final long a;

    public /* synthetic */ c(long j) {
        this.a = j;
    }

    public static final /* synthetic */ c a(long j) {
        return new c(j);
    }

    public static boolean c(long j, Object obj) {
        return (obj instanceof c) && j == ((c) obj).g();
    }

    public static final int d(long j) {
        return (int) j;
    }

    public static int e(long j) {
        return Long.hashCode(j);
    }

    public static String f(long j) {
        return "GridItemSpan(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return c(this.a, obj);
    }

    public final /* synthetic */ long g() {
        return this.a;
    }

    public int hashCode() {
        return e(this.a);
    }

    public String toString() {
        return f(this.a);
    }

    public static long b(long j) {
        return j;
    }
}
