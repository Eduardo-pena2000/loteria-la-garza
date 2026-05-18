package n1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class u implements o1.a {
    public final float a;

    public u(float f) {
        this.a = f;
    }

    public float a(float f) {
        return f / this.a;
    }

    public float b(float f) {
        return f * this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Float.compare(this.a, ((u) obj).a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.a);
    }

    public String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.a + ')';
    }
}
