package F;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class v implements e0 {
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public v(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public int a(n1.d dVar, n1.t tVar) {
        return this.d;
    }

    public int b(n1.d dVar, n1.t tVar) {
        return this.b;
    }

    public int c(n1.d dVar) {
        return this.e;
    }

    public int d(n1.d dVar) {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.b == vVar.b && this.c == vVar.c && this.d == vVar.d && this.e == vVar.e;
    }

    public int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public String toString() {
        return "Insets(left=" + this.b + ", top=" + this.c + ", right=" + this.d + ", bottom=" + this.e + ')';
    }
}
