package n1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e implements d {
    public final float a;
    public final float b;

    public e(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public float e1() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.a, eVar.a) == 0 && Float.compare(this.b, eVar.b) == 0;
    }

    public float getDensity() {
        return this.a;
    }

    public int hashCode() {
        return (Float.hashCode(this.a) * 31) + Float.hashCode(this.b);
    }

    public String toString() {
        return "DensityImpl(density=" + this.a + ", fontScale=" + this.b + ')';
    }
}
