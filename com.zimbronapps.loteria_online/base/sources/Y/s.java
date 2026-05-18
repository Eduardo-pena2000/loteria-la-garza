package y;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class s {
    public final float a;
    public final n1.d b;
    public final float c;

    public static final class a {
        public final float a;
        public final float b;
        public final long c;

        public a(float f, float f2, long j) {
            this.a = f;
            this.b = f2;
            this.c = j;
        }

        public final float a(long j) {
            long j2 = this.c;
            return this.b * Math.signum(this.a) * y.a.a.b(j2 > 0 ? j / j2 : 1.0f).a();
        }

        public final float b(long j) {
            long j2 = this.c;
            return (((y.a.a.b(j2 > 0 ? j / j2 : 1.0f).b() * Math.signum(this.a)) * this.b) / this.c) * 1000.0f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && this.c == aVar.c;
        }

        public int hashCode() {
            return (((Float.hashCode(this.a) * 31) + Float.hashCode(this.b)) * 31) + Long.hashCode(this.c);
        }

        public String toString() {
            return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.b + ", duration=" + this.c + ')';
        }
    }

    public s(float f, n1.d dVar) {
        this.a = f;
        this.b = dVar;
        this.c = a(dVar);
    }

    public final float a(n1.d dVar) {
        return t.a(0.84f, dVar.getDensity());
    }

    public final float b(float f) {
        return (float) (this.a * this.c * Math.exp((t.b() / (t.b() - 1.0d)) * e(f)));
    }

    public final long c(float f) {
        return (long) (Math.exp(e(f) / (t.b() - 1.0d)) * 1000.0d);
    }

    public final a d(float f) {
        double e = e(f);
        double b = t.b() - 1.0d;
        return new a(f, (float) (this.a * this.c * Math.exp((t.b() / b) * e)), (long) (Math.exp(e / b) * 1000.0d));
    }

    public final double e(float f) {
        return y.a.a.a(f, this.a * this.c);
    }
}
