package K0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c {
    public final float a;
    public final float b;
    public final long c;
    public final int d;

    public c(float f, float f2, long j, int i) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.a == this.a && cVar.b == this.b && cVar.c == this.c && cVar.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.a) * 31) + Float.hashCode(this.b)) * 31) + Long.hashCode(this.c)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.a + ",horizontalScrollPixels=" + this.b + ",uptimeMillis=" + this.c + ",deviceId=" + this.d + ')';
    }
}
