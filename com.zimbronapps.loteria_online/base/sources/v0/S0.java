package v0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class s0 {
    /* JADX WARN: Removed duplicated region for block: B:106:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long a(float r20, float r21, float r22, float r23, w0.c r24) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.s0.a(float, float, float, float, w0.c):long");
    }

    public static final long b(int i) {
        return r0.n(Ca.C.b(Ca.C.b(i) << 32));
    }

    public static final long c(int i, int i2, int i3, int i4) {
        return b(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static final long d(long j) {
        return r0.n(Ca.C.b(j << 32));
    }

    public static /* synthetic */ long e(float f, float f2, float f3, float f4, w0.c cVar, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            cVar = w0.k.a.G();
        }
        return a(f, f2, f3, f4, cVar);
    }

    public static /* synthetic */ long f(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = 255;
        }
        return c(i, i2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long g(float r17, float r18, float r19, float r20, w0.c r21) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.s0.g(float, float, float, float, w0.c):long");
    }

    public static final long h(long j, long j2) {
        long o = r0.o(j, r0.v(j2));
        float t = r0.t(j2);
        float t2 = r0.t(o);
        float f = 1.0f - t2;
        float f2 = (t * f) + t2;
        return g(f2 == 0.0f ? 0.0f : ((r0.x(o) * t2) + ((r0.x(j2) * t) * f)) / f2, f2 == 0.0f ? 0.0f : ((r0.w(o) * t2) + ((r0.w(j2) * t) * f)) / f2, f2 != 0.0f ? ((r0.u(o) * t2) + ((r0.u(j2) * t) * f)) / f2 : 0.0f, f2, r0.v(j2));
    }

    public static final long i(long j, long j2, float f) {
        w0.c D = w0.k.a.D();
        long o = r0.o(j, D);
        long o2 = r0.o(j2, D);
        float t = r0.t(o);
        float x = r0.x(o);
        float w = r0.w(o);
        float u = r0.u(o);
        float t2 = r0.t(o2);
        float x2 = r0.x(o2);
        float w2 = r0.w(o2);
        float u2 = r0.u(o2);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return r0.o(g(p1.b.b(x, x2, f), p1.b.b(w, w2, f), p1.b.b(u, u2, f), p1.b.b(t, t2, f), D), r0.v(j2));
    }

    public static final float j(long j) {
        w0.c v = r0.v(j);
        if (!w0.b.e(v.e(), w0.b.a.b())) {
            e1.a("The specified color must be encoded in an RGB color space. The supplied color space is " + w0.b.h(v.e()));
        }
        kotlin.jvm.internal.t.e(v, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        w0.n w = ((w0.F) v).w();
        float a = (float) ((w.a(r0.x(j)) * 0.2126d) + (w.a(r0.w(j)) * 0.7152d) + (w.a(r0.u(j)) * 0.0722d));
        if (a < 0.0f) {
            a = 0.0f;
        }
        if (a > 1.0f) {
            return 1.0f;
        }
        return a;
    }

    public static final int k(long j) {
        return (int) Ca.C.b(r0.o(j, w0.k.a.G()) >>> 32);
    }
}
