package M;

import u0.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f implements b {
    public final float a;

    public f(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    public float a(long j, n1.d dVar) {
        return l.h(j) * (this.a / 100.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Float.compare(this.a, ((f) obj).a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.a);
    }

    public String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
