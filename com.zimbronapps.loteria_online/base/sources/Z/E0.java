package z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class e0 {
    public static final long a(double d, double d2, double d3, double d4, double d5) {
        double sqrt = 2.0d * d2 * Math.sqrt(d);
        double d6 = (sqrt * sqrt) - (4.0d * d);
        double d7 = -sqrt;
        v a = w.a(d6);
        v.d(a, v.b(a) + d7);
        v.d(a, v.b(a) * 0.5d);
        v.c(a, v.a(a) * 0.5d);
        v a2 = w.a(d6);
        double d8 = -1;
        v.d(a2, v.b(a2) * d8);
        v.c(a2, v.a(a2) * d8);
        v.d(a2, v.b(a2) + d7);
        v.d(a2, v.b(a2) * 0.5d);
        v.c(a2, v.a(a2) * 0.5d);
        return d(a, a2, d2, d3, d4, d5);
    }

    public static final long b(float f, float f2, float f3, float f4, float f5) {
        if (f2 == 0.0f) {
            return 9223372036854L;
        }
        return a(f, f2, f3, f4, f5);
    }

    public static final double c(v vVar, double d, double d2, double d3) {
        double d4 = d3;
        double f = vVar.f();
        double d5 = f * d;
        double d6 = d2 - d5;
        double log = Math.log(Math.abs(d4 / d)) / f;
        double log2 = Math.log(Math.abs(d4 / d6));
        double d7 = log2;
        for (int i = 0; i < 6; i++) {
            d7 = log2 - Math.log(Math.abs(d7 / f));
        }
        double d8 = d7 / f;
        if (!((Double.isInfinite(log) || Double.isNaN(log)) ? false : true)) {
            log = d8;
        } else if ((Double.isInfinite(d8) || Double.isNaN(d8)) ? false : true) {
            log = Math.max(log, d8);
        }
        double d9 = (-(d5 + d6)) / (f * d6);
        double d10 = f * d9;
        double exp = (Math.exp(d10) * d) + (d6 * d9 * Math.exp(d10));
        if (Double.isNaN(d9) || d9 <= 0.0d) {
            d4 = -d4;
        } else if (d9 <= 0.0d || (-exp) >= d4) {
            log = (-(2.0d / f)) - (d / d6);
        } else {
            if (d6 < 0.0d && d > 0.0d) {
                log = 0.0d;
            }
            d4 = -d4;
        }
        double d11 = Double.MAX_VALUE;
        int i2 = 0;
        while (d11 > 0.001d && i2 < 100) {
            i2++;
            double d12 = f * log;
            double d13 = d4;
            double exp2 = log - ((((d + (d6 * log)) * Math.exp(d12)) + d4) / ((((1 + d12) * d6) + d5) * Math.exp(d12)));
            d11 = Math.abs(log - exp2);
            log = exp2;
            d4 = d13;
        }
        return log;
    }

    public static final long d(v vVar, v vVar2, double d, double d2, double d3, double d4) {
        double d5 = d2;
        if (d3 == 0.0d && d5 == 0.0d) {
            return 0L;
        }
        if (d3 < 0.0d) {
            d5 = -d5;
        }
        double abs = Math.abs(d3);
        return (long) ((d > 1.0d ? e(vVar, vVar2, abs, d5, d4) : d < 1.0d ? g(vVar, abs, d5, d4) : c(vVar, abs, d5, d4)) * 1000.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final double e(z.v r29, z.v r30, double r31, double r33, double r35) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.e0.e(z.v, z.v, double, double, double):double");
    }

    public static final double f(double d, double d2, double d3, double d4, double d5) {
        return (d * Math.exp(d2 * d3)) + (d4 * Math.exp(d5 * d3));
    }

    public static final double g(v vVar, double d, double d2, double d3) {
        double f = vVar.f();
        double e = (d2 - (f * d)) / vVar.e();
        return Math.log(d3 / Math.sqrt((d * d) + (e * e))) / f;
    }
}
