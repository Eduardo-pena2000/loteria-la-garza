package X;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public /* synthetic */ h(long j, long j2, long j3, long j4, kotlin.jvm.internal.k kVar) {
        this(j, j2, j3, j4);
    }

    public final long a(boolean z) {
        return z ? this.a : this.c;
    }

    public final long b(boolean z) {
        return z ? this.b : this.d;
    }

    public final h c(long j, long j2, long j3, long j4) {
        return new h(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return v0.r0.s(this.a, hVar.a) && v0.r0.s(this.b, hVar.b) && v0.r0.s(this.c, hVar.c) && v0.r0.s(this.d, hVar.d);
    }

    public int hashCode() {
        return (((((v0.r0.y(this.a) * 31) + v0.r0.y(this.b)) * 31) + v0.r0.y(this.c)) * 31) + v0.r0.y(this.d);
    }

    public h(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }
}
