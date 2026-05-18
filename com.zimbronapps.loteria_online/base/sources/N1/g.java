package n1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g implements d {
    public final float a;
    public final float b;
    public final o1.a c;

    public g(float f, float f2, o1.a aVar) {
        this.a = f;
        this.b = f2;
        this.c = aVar;
    }

    public long M(float f) {
        return w.e(this.c.a(f));
    }

    public float S(long j) {
        if (x.g(v.g(j), x.b.b())) {
            return h.g(this.c.b(v.h(j)));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public float e1() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.a, gVar.a) == 0 && Float.compare(this.b, gVar.b) == 0 && kotlin.jvm.internal.t.c(this.c, gVar.c);
    }

    public float getDensity() {
        return this.a;
    }

    public int hashCode() {
        return (((Float.hashCode(this.a) * 31) + Float.hashCode(this.b)) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "DensityWithConverter(density=" + this.a + ", fontScale=" + this.b + ", converter=" + this.c + ')';
    }
}
