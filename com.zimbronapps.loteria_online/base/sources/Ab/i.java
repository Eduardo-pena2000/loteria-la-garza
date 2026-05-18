package ab;

import ab.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class i implements l {
    public static final i a = new i();
    public static final long b = System.nanoTime();

    public /* bridge */ /* synthetic */ a a() {
        return k.a.b(d());
    }

    public final long b(long j, long j2) {
        return h.d(j, j2, e.b);
    }

    public final long c(long j) {
        return h.b(e(), j, e.b);
    }

    public long d() {
        return k.a.d(e());
    }

    public final long e() {
        return System.nanoTime() - b;
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
