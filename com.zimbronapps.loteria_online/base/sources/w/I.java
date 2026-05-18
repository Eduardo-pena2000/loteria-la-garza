package W;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class i {
    public static final float a = n1.h.g(10);

    public static final float a(n1.d dVar, boolean z, long j) {
        float k = u0.f.k(u0.g.a(u0.l.i(j), u0.l.g(j))) / 2.0f;
        return z ? k + dVar.j1(a) : k;
    }

    public static final float b(long j) {
        return Math.max(u0.l.i(j), u0.l.g(j)) * 0.3f;
    }
}
