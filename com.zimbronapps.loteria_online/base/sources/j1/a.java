package J1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class a {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;

    public a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = f9;
    }

    public static a b(float f, float f2, float f3) {
        float f4 = 100.0f;
        float f5 = 1000.0f;
        float f6 = 0.0f;
        a aVar = null;
        float f7 = 1000.0f;
        while (Math.abs(f6 - f4) > 0.01f) {
            float f8 = ((f4 - f6) / 2.0f) + f6;
            int p = e(f8, f2, f).p();
            float b = b.b(p);
            float abs = Math.abs(f3 - b);
            if (abs < 0.2f) {
                a c = c(p);
                float a = c.a(e(c.k(), c.i(), f));
                if (a <= 1.0f) {
                    aVar = c;
                    f5 = abs;
                    f7 = a;
                }
            }
            if (f5 == 0.0f && f7 == 0.0f) {
                break;
            }
            if (b < f3) {
                f6 = f8;
            } else {
                f4 = f8;
            }
        }
        return aVar;
    }

    public static a c(int i) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        d(i, l.k, fArr, fArr2);
        return new a(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    public static void d(int i, l lVar, float[] fArr, float[] fArr2) {
        b.f(i, fArr2);
        float[][] fArr3 = b.a;
        float f = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f2 = fArr4[0] * f;
        float f3 = fArr2[1];
        float f4 = f2 + (fArr4[1] * f3);
        float f5 = fArr2[2];
        float f6 = f4 + (fArr4[2] * f5);
        float[] fArr5 = fArr3[1];
        float f7 = (fArr5[0] * f) + (fArr5[1] * f3) + (fArr5[2] * f5);
        float[] fArr6 = fArr3[2];
        float f8 = (f * fArr6[0]) + (f3 * fArr6[1]) + (f5 * fArr6[2]);
        float f9 = lVar.i()[0] * f6;
        float f10 = lVar.i()[1] * f7;
        float f11 = lVar.i()[2] * f8;
        float pow = (float) Math.pow((lVar.c() * Math.abs(f9)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((lVar.c() * Math.abs(f10)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((lVar.c() * Math.abs(f11)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f9) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f10) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f11) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = signum3;
        float f12 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d)) / 11.0f;
        float f13 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f14 = signum2 * 20.0f;
        float f15 = (((signum * 20.0f) + f14) + (21.0f * signum3)) / 20.0f;
        float f16 = (((signum * 40.0f) + f14) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f13, f12)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f17 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f16 * lVar.f()) / lVar.a(), lVar.b() * lVar.j())) * 100.0f;
        float b = (4.0f / lVar.b()) * ((float) Math.sqrt(pow4 / 100.0f)) * (lVar.a() + 4.0f) * lVar.d();
        float sqrt = ((float) Math.sqrt(pow4 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, lVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) atan2) < 20.14d ? 360.0f + atan2 : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.g()) * lVar.h()) * ((float) Math.sqrt((f12 * f12) + (f13 * f13)))) / (f15 + 0.305f), 0.9d));
        float d2 = lVar.d() * sqrt;
        float sqrt2 = ((float) Math.sqrt((r7 * lVar.b()) / (lVar.a() + 4.0f))) * 50.0f;
        float f18 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * d2) + 1.0f)) * 43.85965f;
        double d3 = f17;
        float cos = ((float) Math.cos(d3)) * log;
        float sin = log * ((float) Math.sin(d3));
        fArr2[0] = atan2;
        fArr2[1] = sqrt;
        if (fArr != null) {
            fArr[0] = pow4;
            fArr[1] = b;
            fArr[2] = d2;
            fArr[3] = sqrt2;
            fArr[4] = f18;
            fArr[5] = cos;
            fArr[6] = sin;
        }
    }

    public static a e(float f, float f2, float f3) {
        return f(f, f2, f3, l.k);
    }

    public static a f(float f, float f2, float f3, l lVar) {
        float b = (4.0f / lVar.b()) * ((float) Math.sqrt(f / 100.0d)) * (lVar.a() + 4.0f) * lVar.d();
        float d = f2 * lVar.d();
        float sqrt = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(r4))) * lVar.b()) / (lVar.a() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((d * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new a(f3, f2, f, b, d, sqrt, f4, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public static int m(float f, float f2, float f3) {
        return n(f, f2, f3, l.k);
    }

    public static int n(float f, float f2, float f3, l lVar) {
        if (f2 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
            return b.a(f3);
        }
        float min = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        a aVar = null;
        boolean z = true;
        float f4 = 0.0f;
        float f5 = f2;
        while (Math.abs(f4 - f2) >= 0.4f) {
            a b = b(min, f5, f3);
            if (!z) {
                if (b == null) {
                    f2 = f5;
                } else {
                    f4 = f5;
                    aVar = b;
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
            } else {
                if (b != null) {
                    return b.o(lVar);
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
                z = false;
            }
        }
        return aVar == null ? b.a(f3) : aVar.o(lVar);
    }

    public float a(a aVar) {
        float l = l() - aVar.l();
        float g = g() - aVar.g();
        float h = h() - aVar.h();
        return (float) (Math.pow(Math.sqrt((l * l) + (g * g) + (h * h)), 0.63d) * 1.41d);
    }

    public float g() {
        return this.h;
    }

    public float h() {
        return this.i;
    }

    public float i() {
        return this.b;
    }

    public float j() {
        return this.a;
    }

    public float k() {
        return this.c;
    }

    public float l() {
        return this.g;
    }

    public int o(l lVar) {
        float pow = (float) Math.pow(((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(k() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, lVar.e()), 0.73d), 1.1111111111111112d);
        double j = (j() * 3.1415927f) / 180.0f;
        float cos = ((float) (Math.cos(2.0d + j) + 3.8d)) * 0.25f;
        float a = lVar.a() * ((float) Math.pow(k() / 100.0d, (1.0d / lVar.b()) / lVar.j()));
        float g = cos * 3846.1538f * lVar.g() * lVar.h();
        float f = a / lVar.f();
        float sin = (float) Math.sin(j);
        float cos2 = (float) Math.cos(j);
        float f2 = (((0.305f + f) * 23.0f) * pow) / (((g * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f3 = cos2 * f2;
        float f4 = f2 * sin;
        float f5 = f * 460.0f;
        float f6 = (((451.0f * f3) + f5) + (288.0f * f4)) / 1403.0f;
        float f7 = ((f5 - (891.0f * f3)) - (261.0f * f4)) / 1403.0f;
        float signum = Math.signum(f6) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f6) * 27.13d) / (400.0d - Math.abs(f6))), 2.380952380952381d));
        float signum2 = Math.signum(f7) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f7) * 27.13d) / (400.0d - Math.abs(f7))), 2.380952380952381d));
        float signum3 = Math.signum(((f5 - (f3 * 220.0f)) - (f4 * 6300.0f)) / 1403.0f) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8))), 2.380952380952381d));
        float f8 = signum / lVar.i()[0];
        float f9 = signum2 / lVar.i()[1];
        float f10 = signum3 / lVar.i()[2];
        float[][] fArr = b.b;
        float[] fArr2 = fArr[0];
        float f11 = (fArr2[0] * f8) + (fArr2[1] * f9) + (fArr2[2] * f10);
        float[] fArr3 = fArr[1];
        float f12 = (fArr3[0] * f8) + (fArr3[1] * f9) + (fArr3[2] * f10);
        float[] fArr4 = fArr[2];
        return K1.a.a(f11, f12, (f8 * fArr4[0]) + (f9 * fArr4[1]) + (f10 * fArr4[2]));
    }

    public int p() {
        return o(l.k);
    }
}
