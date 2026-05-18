package y;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class y {
    public final float a;
    public final long b;
    public final z.G c;

    public /* synthetic */ y(float f, long j, z.G g, kotlin.jvm.internal.k kVar) {
        this(f, j, g);
    }

    public final z.G a() {
        return this.c;
    }

    public final float b() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Float.compare(this.a, yVar.a) == 0 && androidx.compose.ui.graphics.j.e(this.b, yVar.b) && kotlin.jvm.internal.t.c(this.c, yVar.c);
    }

    public int hashCode() {
        return (((Float.hashCode(this.a) * 31) + androidx.compose.ui.graphics.j.h(this.b)) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + androidx.compose.ui.graphics.j.i(this.b) + ", animationSpec=" + this.c + ')';
    }

    public y(float f, long j, z.G g) {
        this.a = f;
        this.b = j;
        this.c = g;
    }
}
