package x1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class e extends c {
    public float f;

    public e(float f) {
        super(null);
        this.f = f;
    }

    public float c() {
        if (Float.isNaN(this.f) && h()) {
            this.f = Float.parseFloat(b());
        }
        return this.f;
    }

    public int e() {
        if (Float.isNaN(this.f) && h()) {
            this.f = Integer.parseInt(b());
        }
        return (int) this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        float c = c();
        float c2 = ((e) obj).c();
        return (Float.isNaN(c) && Float.isNaN(c2)) || c == c2;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        float f = this.f;
        return hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0);
    }
}
