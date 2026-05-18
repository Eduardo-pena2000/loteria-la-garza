package n1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class w {
    public static final long a(float f, long j) {
        return i(j, f);
    }

    public static final void b(long j) {
        if (v.f(j) == 0) {
            m.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void c(long j, long j2) {
        if (!((v.f(j) == 0 || v.f(j2) == 0) ? false : true)) {
            m.a("Cannot perform operation for Unspecified type.");
        }
        if (x.g(v.g(j), v.g(j2))) {
            return;
        }
        m.a("Cannot perform operation for " + x.i(v.g(j)) + " and " + x.i(v.g(j2)));
    }

    public static final long d(double d) {
        return i(4294967296L, (float) d);
    }

    public static final long e(float f) {
        return i(4294967296L, f);
    }

    public static final long f(int i) {
        return i(4294967296L, i);
    }

    public static final boolean g(long j) {
        return v.f(j) == 0;
    }

    public static final long h(long j, long j2, float f) {
        c(j, j2);
        return i(v.f(j), p1.b.b(v.h(j), v.h(j2), f));
    }

    public static final long i(long j, float f) {
        return v.c(j | (Float.floatToRawIntBits(f) & 4294967295L));
    }
}
