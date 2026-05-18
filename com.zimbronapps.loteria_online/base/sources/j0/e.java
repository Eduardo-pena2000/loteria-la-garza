package J0;

import Da.p;
import I0.C;
import I0.r;
import java.util.List;
import u0.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class e {
    public static boolean a = true;
    public static boolean b;

    public static final /* synthetic */ float a(float[] fArr, float[] fArr2, int i, boolean z) {
        return g(fArr, fArr2, i, z);
    }

    public static final /* synthetic */ void b(a[] aVarArr, int i, long j, float f) {
        k(aVarArr, i, j, f);
    }

    public static final void c(d dVar, C c) {
        d(dVar, c, f.b.c());
    }

    public static final void d(d dVar, C c, long j) {
        if (a) {
            f(dVar, c, j);
        } else {
            e(dVar, c, j);
        }
    }

    public static final void e(d dVar, C c, long j) {
        if (r.b(c)) {
            dVar.f(c.h());
            dVar.e();
        }
        long k = c.k();
        List e = c.e();
        int size = e.size();
        int i = 0;
        while (i < size) {
            I0.d dVar2 = (I0.d) e.get(i);
            long p = f.p(dVar2.b(), k);
            long b2 = dVar2.b();
            dVar.f(f.q(dVar.c(), p));
            dVar.a(dVar2.c(), f.q(dVar.c(), j));
            i++;
            k = b2;
        }
        dVar.f(f.q(dVar.c(), f.p(c.h(), k)));
        dVar.a(c.o(), f.q(dVar.c(), j));
    }

    public static final void f(d dVar, C c, long j) {
        if (r.b(c)) {
            dVar.e();
        }
        if (!r.d(c)) {
            List e = c.e();
            int size = e.size();
            for (int i = 0; i < size; i++) {
                I0.d dVar2 = (I0.d) e.get(i);
                dVar.a(dVar2.c(), f.q(dVar2.a(), j));
            }
            dVar.a(c.o(), f.q(c.g(), j));
        }
        if (r.d(c) && c.o() - dVar.d() > 40) {
            dVar.e();
        }
        dVar.g(c.o());
    }

    public static final float g(float[] fArr, float[] fArr2, int i, boolean z) {
        int i2 = i - 1;
        float f = fArr2[i2];
        float f2 = 0.0f;
        int i3 = i2;
        while (i3 > 0) {
            int i4 = i3 - 1;
            float f3 = fArr2[i4];
            if (f != f3) {
                float f4 = (z ? -fArr[i4] : fArr[i3] - fArr[i4]) / (f - f3);
                f2 += (f4 - (Math.signum(f2) * ((float) Math.sqrt(2 * Math.abs(f2))))) * Math.abs(f4);
                if (i3 == i2) {
                    f2 *= 0.5f;
                }
            }
            i3--;
            f = f3;
        }
        return Math.signum(f2) * ((float) Math.sqrt(2 * Math.abs(f2)));
    }

    public static final float h(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final boolean i() {
        return b;
    }

    public static final float[] j(float[] fArr, float[] fArr2, int i, int i2, float[] fArr3) {
        int i3 = i2;
        if (i3 < 1) {
            L0.a.a("The degree must be at positive integer");
        }
        if (i == 0) {
            L0.a.a("At least one point must be provided");
        }
        if (i3 >= i) {
            i3 = i - 1;
        }
        int i4 = i3 + 1;
        float[][] fArr4 = new float[i4][];
        for (int i5 = 0; i5 < i4; i5++) {
            fArr4[i5] = new float[i];
        }
        for (int i6 = 0; i6 < i; i6++) {
            fArr4[0][i6] = 1.0f;
            for (int i7 = 1; i7 < i4; i7++) {
                fArr4[i7][i6] = fArr4[i7 - 1][i6] * fArr[i6];
            }
        }
        float[][] fArr5 = new float[i4][];
        for (int i8 = 0; i8 < i4; i8++) {
            fArr5[i8] = new float[i];
        }
        float[][] fArr6 = new float[i4][];
        for (int i9 = 0; i9 < i4; i9++) {
            fArr6[i9] = new float[i4];
        }
        int i10 = 0;
        while (i10 < i4) {
            float[] fArr7 = fArr5[i10];
            p.h(fArr4[i10], fArr7, 0, 0, i);
            for (int i11 = 0; i11 < i10; i11++) {
                float[] fArr8 = fArr5[i11];
                float h = h(fArr7, fArr8);
                for (int i12 = 0; i12 < i; i12++) {
                    fArr7[i12] = fArr7[i12] - (fArr8[i12] * h);
                }
            }
            float sqrt = (float) Math.sqrt(h(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f = 1.0f / sqrt;
            for (int i13 = 0; i13 < i; i13++) {
                fArr7[i13] = fArr7[i13] * f;
            }
            float[] fArr9 = fArr6[i10];
            int i14 = 0;
            while (i14 < i4) {
                fArr9[i14] = i14 < i10 ? 0.0f : h(fArr7, fArr4[i14]);
                i14++;
            }
            i10++;
        }
        for (int i15 = i3; -1 < i15; i15--) {
            float h2 = h(fArr5[i15], fArr2);
            float[] fArr10 = fArr6[i15];
            int i16 = i15 + 1;
            if (i16 <= i3) {
                int i17 = i3;
                while (true) {
                    h2 -= fArr10[i17] * fArr3[i17];
                    if (i17 != i16) {
                        i17--;
                    }
                }
            }
            fArr3[i15] = h2 / fArr10[i15];
        }
        return fArr3;
    }

    public static final void k(a[] aVarArr, int i, long j, float f) {
        a aVar = aVarArr[i];
        if (aVar == null) {
            aVarArr[i] = new a(j, f);
        } else {
            aVar.d(j);
            aVar.c(f);
        }
    }
}
