package z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class x implements D {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public x(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) ? false : true)) {
            a0.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f2 + ", " + f3 + ", " + f4 + '.');
        }
        long b = v0.a0.b(0.0f, f2, f4, 1.0f, new float[5], 0);
        this.e = Float.intBitsToFloat((int) (b >> 32));
        this.f = Float.intBitsToFloat((int) (b & 4294967295L));
    }

    public float a(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            return f;
        }
        float e = v0.a0.e(0.0f - f, this.a - f, this.c - f, 1.0f - f);
        if (Float.isNaN(e)) {
            b(f);
        }
        float c = v0.a0.c(this.b, this.d, e);
        float f2 = this.e;
        float f3 = this.f;
        if (c < f2) {
            c = f2;
        }
        return c > f3 ? f3 : c;
    }

    public final void b(float f) {
        throw new IllegalArgumentException("The cubic curve with parameters (" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ") has no solution at " + f);
    }

    public boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.a == xVar.a && this.b == xVar.b && this.c == xVar.c && this.d == xVar.d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.a) * 31) + Float.hashCode(this.b)) * 31) + Float.hashCode(this.c)) * 31) + Float.hashCode(this.d);
    }

    public String toString() {
        return "CubicBezierEasing(a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + ')';
    }
}
