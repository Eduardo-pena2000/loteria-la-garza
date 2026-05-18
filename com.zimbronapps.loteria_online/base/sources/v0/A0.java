package v0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a0 {
    public static final /* synthetic */ int a(float f, float[] fArr, int i) {
        return g(f, fArr, i);
    }

    public static final long b(float f, float f2, float f3, float f4, float[] fArr, int i) {
        float f5 = (f2 - f) * 3.0f;
        float f6 = (f3 - f2) * 3.0f;
        float f7 = (f4 - f3) * 3.0f;
        int f8 = f(f5, f6, f7, fArr, i);
        float f9 = (f6 - f5) * 2.0f;
        int a = f8 + a((-f9) / (((f7 - f6) * 2.0f) - f9), fArr, i + f8);
        float min = Math.min(f, f4);
        float max = Math.max(f, f4);
        for (int i2 = 0; i2 < a; i2++) {
            float d = d(f, f2, f3, f4, fArr[i2]);
            min = Math.min(min, d);
            max = Math.max(max, d);
        }
        return w.h.a(min, max);
    }

    public static final float c(float f, float f2, float f3) {
        return ((((((f - f2) + 0.33333334f) * f3) + (f2 - (2.0f * f))) * f3) + f) * 3.0f * f3;
    }

    public static final float d(float f, float f2, float f3, float f4, float f5) {
        float f6 = (f4 + ((f2 - f3) * 3.0f)) - f;
        return (((((f6 * f5) + (((f3 - (2.0f * f2)) + f) * 3.0f)) * f5) + ((f2 - f) * 3.0f)) * f5) + f;
    }

    public static final float e(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        double d = f;
        double d2 = ((d - (f2 * 2.0d)) + f3) * 3.0d;
        double d3 = (f2 - f) * 3.0d;
        double d4 = (-f) + ((f2 - f3) * 3.0d) + f4;
        if (Math.abs(d4 - 0.0d) < 1.0E-7d) {
            if (Math.abs(d2 - 0.0d) < 1.0E-7d) {
                if (Math.abs(d3 - 0.0d) < 1.0E-7d) {
                    return Float.NaN;
                }
                float f7 = (float) ((-d) / d3);
                f5 = f7 >= 0.0f ? f7 : 0.0f;
                f6 = f5 <= 1.0f ? f5 : 1.0f;
                if (Math.abs(f6 - f7) > 1.05E-6f) {
                    return Float.NaN;
                }
                return f6;
            }
            double sqrt = Math.sqrt((d3 * d3) - ((4.0d * d2) * d));
            double d5 = d2 * 2.0d;
            float f8 = (float) ((sqrt - d3) / d5);
            float f9 = f8 < 0.0f ? 0.0f : f8;
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            if (Math.abs(f9 - f8) > 1.05E-6f) {
                f9 = Float.NaN;
            }
            if (!Float.isNaN(f9)) {
                return f9;
            }
            float f10 = (float) (((-d3) - sqrt) / d5);
            f5 = f10 >= 0.0f ? f10 : 0.0f;
            f6 = f5 <= 1.0f ? f5 : 1.0f;
            if (Math.abs(f6 - f10) > 1.05E-6f) {
                return Float.NaN;
            }
            return f6;
        }
        double d6 = d2 / d4;
        double d7 = d3 / d4;
        double d8 = d / d4;
        double d9 = ((d7 * 3.0d) - (d6 * d6)) / 9.0d;
        double d10 = (((((2.0d * d6) * d6) * d6) - ((9.0d * d6) * d7)) + (d8 * 27.0d)) / 54.0d;
        double d11 = d9 * d9 * d9;
        double d12 = (d10 * d10) + d11;
        double d13 = d6 / 3.0d;
        if (d12 >= 0.0d) {
            if (d12 != 0.0d) {
                double sqrt2 = Math.sqrt(d12);
                float a = (float) ((p1.b.a((float) ((-d10) + sqrt2)) - p1.b.a((float) (d10 + sqrt2))) - d13);
                f5 = a >= 0.0f ? a : 0.0f;
                f6 = f5 <= 1.0f ? f5 : 1.0f;
                if (Math.abs(f6 - a) > 1.05E-6f) {
                    return Float.NaN;
                }
                return f6;
            }
            float f11 = -p1.b.a((float) d10);
            float f12 = (float) d13;
            float f13 = (2.0f * f11) - f12;
            float f14 = f13 < 0.0f ? 0.0f : f13;
            if (f14 > 1.0f) {
                f14 = 1.0f;
            }
            if (Math.abs(f14 - f13) > 1.05E-6f) {
                f14 = Float.NaN;
            }
            if (!Float.isNaN(f14)) {
                return f14;
            }
            float f15 = (-f11) - f12;
            f5 = f15 >= 0.0f ? f15 : 0.0f;
            f6 = f5 <= 1.0f ? f5 : 1.0f;
            if (Math.abs(f6 - f15) > 1.05E-6f) {
                return Float.NaN;
            }
            return f6;
        }
        double sqrt3 = Math.sqrt(-d11);
        double d14 = (-d10) / sqrt3;
        if (d14 < -1.0d) {
            d14 = -1.0d;
        }
        if (d14 > 1.0d) {
            d14 = 1.0d;
        }
        double acos = Math.acos(d14);
        double a2 = p1.b.a((float) sqrt3) * 2.0f;
        float cos = (float) ((Math.cos(acos / 3.0d) * a2) - d13);
        float f16 = cos < 0.0f ? 0.0f : cos;
        if (f16 > 1.0f) {
            f16 = 1.0f;
        }
        if (Math.abs(f16 - cos) > 1.05E-6f) {
            f16 = Float.NaN;
        }
        if (!Float.isNaN(f16)) {
            return f16;
        }
        float cos2 = (float) ((Math.cos((6.283185307179586d + acos) / 3.0d) * a2) - d13);
        float f17 = cos2 < 0.0f ? 0.0f : cos2;
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        if (Math.abs(f17 - cos2) > 1.05E-6f) {
            f17 = Float.NaN;
        }
        if (!Float.isNaN(f17)) {
            return f17;
        }
        float cos3 = (float) ((a2 * Math.cos((acos + 12.566370614359172d) / 3.0d)) - d13);
        f5 = cos3 >= 0.0f ? cos3 : 0.0f;
        f6 = f5 <= 1.0f ? f5 : 1.0f;
        if (Math.abs(f6 - cos3) > 1.05E-6f) {
            return Float.NaN;
        }
        return f6;
    }

    public static final int f(float f, float f2, float f3, float[] fArr, int i) {
        double d = f;
        double d2 = f2;
        double d3 = f3;
        double d4 = d2 * 2.0d;
        double d5 = (d - d4) + d3;
        if (d5 == 0.0d) {
            if (d2 == d3) {
                return 0;
            }
            return g((float) ((d4 - d3) / (d4 - (d3 * 2.0d))), fArr, i);
        }
        double d6 = -Math.sqrt((d2 * d2) - (d3 * d));
        double d7 = (-d) + d2;
        int g = g((float) ((-(d6 + d7)) / d5), fArr, i);
        int g2 = g + g((float) ((d6 - d7) / d5), fArr, i + g);
        if (g2 > 1) {
            float f4 = fArr[i];
            int i2 = i + 1;
            float f5 = fArr[i2];
            if (f4 > f5) {
                fArr[i] = f5;
                fArr[i2] = f4;
            } else if (f4 == f5) {
                return g2 - 1;
            }
        }
        return g2;
    }

    public static final int g(float f, float[] fArr, int i) {
        float f2 = f >= 0.0f ? f : 0.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }
}
