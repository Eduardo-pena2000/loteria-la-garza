package u0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class k {
    public static final j a(float f, float f2, float f3, float f4, float f5, float f6) {
        long b = a.b((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L));
        return new j(f, f2, f3, f4, b, b, b, b, null);
    }

    public static final j b(h hVar, long j, long j2, long j3, long j4) {
        return new j(hVar.i(), hVar.l(), hVar.j(), hVar.e(), j, j2, j3, j4, null);
    }

    public static final j c(float f, float f2, float f3, float f4, long j) {
        return a(f, f2, f3, f4, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final h d(j jVar) {
        return new h(jVar.e(), jVar.g(), jVar.f(), jVar.a());
    }

    public static final boolean e(j jVar) {
        long h = jVar.h();
        return (h >>> 32) == (h & 4294967295L) && jVar.h() == jVar.i() && jVar.h() == jVar.c() && jVar.h() == jVar.b();
    }

    public static final j f(j jVar, long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new j(Float.intBitsToFloat(i) + jVar.e(), Float.intBitsToFloat(i2) + jVar.g(), jVar.f() + Float.intBitsToFloat(i), jVar.a() + Float.intBitsToFloat(i2), jVar.h(), jVar.i(), jVar.c(), jVar.b(), null);
    }
}
