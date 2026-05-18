package I0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class r {
    public static final boolean a(C c) {
        return (c.p() || c.l() || !c.i()) ? false : true;
    }

    public static final boolean b(C c) {
        return !c.l() && c.i();
    }

    public static final boolean c(C c) {
        return (c.p() || !c.l() || c.i()) ? false : true;
    }

    public static final boolean d(C c) {
        return c.l() && !c.i();
    }

    public static final boolean e(C c, long j) {
        long h = c.h();
        float intBitsToFloat = Float.intBitsToFloat((int) (h >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (h & 4294967295L));
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return (intBitsToFloat > ((float) i)) | (intBitsToFloat < 0.0f) | (intBitsToFloat2 < 0.0f) | (intBitsToFloat2 > ((float) i2));
    }

    public static final boolean f(C c, long j, long j2) {
        boolean g = Q.g(c.n(), Q.a.d());
        long h = c.h();
        float intBitsToFloat = Float.intBitsToFloat((int) (h >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (h & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        float f = g ? 1.0f : 0.0f;
        float f2 = intBitsToFloat3 * f;
        float f3 = ((int) (j >> 32)) + f2;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (intBitsToFloat > f3) | (intBitsToFloat < (-f2)) | (intBitsToFloat2 < (-intBitsToFloat4)) | (intBitsToFloat2 > ((int) (j & 4294967295L)) + intBitsToFloat4);
    }

    public static final long g(C c) {
        return i(c, false);
    }

    public static final long h(C c) {
        return i(c, true);
    }

    public static final long i(C c, boolean z) {
        long p = u0.f.p(c.h(), c.k());
        return (z || !c.p()) ? p : u0.f.b.c();
    }

    public static final boolean j(C c) {
        return !u0.f.j(i(c, true), u0.f.b.c());
    }
}
