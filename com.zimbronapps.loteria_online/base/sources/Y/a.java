package y;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a {
    public static final a a = new a();
    public static final float[] b;
    public static final float[] c;
    public static final int d;

    public static final class a {
        public final float a;
        public final float b;

        public a(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public final float a() {
            return this.a;
        }

        public final float b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.a) * 31) + Float.hashCode(this.b);
        }

        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.a + ", velocityCoefficient=" + this.b + ')';
        }
    }

    static {
        float[] fArr = new float[101];
        b = fArr;
        float[] fArr2 = new float[101];
        c = fArr2;
        D.a(fArr, fArr2, 100);
        d = 8;
    }

    public final double a(float f, float f2) {
        return Math.log((Math.abs(f) * 0.35f) / f2);
    }

    public final a b(float f) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        float l = Wa.n.l(f, 0.0f, 1.0f);
        float f4 = 100;
        int i = (int) (f4 * l);
        if (i < 100) {
            float f5 = i / f4;
            int i2 = i + 1;
            float f6 = i2 / f4;
            float[] fArr = b;
            float f7 = fArr[i];
            float f8 = (fArr[i2] - f7) / (f6 - f5);
            float f9 = ((l - f5) * f8) + f7;
            f2 = f8;
            f3 = f9;
        }
        return new a(f3, f2);
    }
}
