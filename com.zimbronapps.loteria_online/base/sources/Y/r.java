package y;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class r {
    public final float a;
    public final z.G b;

    public r(float f, z.G g) {
        this.a = f;
        this.b = g;
    }

    public final float a() {
        return this.a;
    }

    public final z.G b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.a, rVar.a) == 0 && kotlin.jvm.internal.t.c(this.b, rVar.b);
    }

    public int hashCode() {
        return (Float.hashCode(this.a) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "Fade(alpha=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
