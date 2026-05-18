package z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class v {
    public double a;
    public double b;

    public v(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public static final /* synthetic */ double a(v vVar) {
        return vVar.b;
    }

    public static final /* synthetic */ double b(v vVar) {
        return vVar.a;
    }

    public static final /* synthetic */ void c(v vVar, double d) {
        vVar.b = d;
    }

    public static final /* synthetic */ void d(v vVar, double d) {
        vVar.a = d;
    }

    public final double e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Double.compare(this.a, vVar.a) == 0 && Double.compare(this.b, vVar.b) == 0;
    }

    public final double f() {
        return this.a;
    }

    public int hashCode() {
        return (Double.hashCode(this.a) * 31) + Double.hashCode(this.b);
    }

    public String toString() {
        return "ComplexDouble(_real=" + this.a + ", _imaginary=" + this.b + ')';
    }
}
