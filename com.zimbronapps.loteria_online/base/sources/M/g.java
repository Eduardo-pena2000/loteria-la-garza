package M;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g implements b {
    public final float a;

    public g(float f) {
        this.a = f;
    }

    public float a(long j, n1.d dVar) {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Float.compare(this.a, ((g) obj).a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.a);
    }

    public String toString() {
        return "CornerSize(size = " + this.a + ".px)";
    }
}
