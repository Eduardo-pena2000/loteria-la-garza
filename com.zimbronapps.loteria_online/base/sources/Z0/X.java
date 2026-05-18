package Z0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class x {
    public final y a;
    public final int b;
    public final int c;

    public x(y yVar, int i, int i2) {
        this.a = yVar;
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        return this.c;
    }

    public final y b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return kotlin.jvm.internal.t.c(this.a, xVar.a) && this.b == xVar.b && this.c == xVar.c;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c);
    }

    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ')';
    }
}
