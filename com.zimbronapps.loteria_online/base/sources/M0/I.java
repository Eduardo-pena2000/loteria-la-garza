package M0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i implements f {
    public final float b;

    public i(float f) {
        this.b = f;
    }

    public long a(long j, long j2) {
        float f = this.b;
        return P.a((Float.floatToRawIntBits(f) << 32) | (4294967295L & Float.floatToRawIntBits(f)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Float.compare(this.b, ((i) obj).b) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.b);
    }

    public String toString() {
        return "FixedScale(value=" + this.b + ')';
    }
}
