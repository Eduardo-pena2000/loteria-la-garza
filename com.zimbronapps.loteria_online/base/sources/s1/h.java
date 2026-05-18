package S1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h {
    public final float a;
    public final float b;

    public h(float f, float f2) {
        this.a = g.c(f, "width");
        this.b = g.c(f2, "height");
    }

    public float a() {
        return this.b;
    }

    public float b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hVar.a == this.a && hVar.b == this.b;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.a) ^ Float.floatToIntBits(this.b);
    }

    public String toString() {
        return this.a + "x" + this.b;
    }
}
