package J0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a {
    public long a;
    public float b;

    public a(long j, float f) {
        this.a = j;
        this.b = f;
    }

    public final float a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final void c(float f) {
        this.b = f;
    }

    public final void d(long j) {
        this.a = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && Float.compare(this.b, aVar.b) == 0;
    }

    public int hashCode() {
        return (Long.hashCode(this.a) * 31) + Float.hashCode(this.b);
    }

    public String toString() {
        return "DataPointAtTime(time=" + this.a + ", dataPoint=" + this.b + ')';
    }
}
