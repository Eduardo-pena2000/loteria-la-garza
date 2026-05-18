package X;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class N {
    public final long a;
    public final W.g b;

    public /* synthetic */ N(long j, W.g gVar, kotlin.jvm.internal.k kVar) {
        this(j, gVar);
    }

    public final long a() {
        return this.a;
    }

    public final W.g b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n = (N) obj;
        return v0.r0.s(this.a, n.a) && kotlin.jvm.internal.t.c(this.b, n.b);
    }

    public int hashCode() {
        int y = v0.r0.y(this.a) * 31;
        W.g gVar = this.b;
        return y + (gVar != null ? gVar.hashCode() : 0);
    }

    public String toString() {
        return "RippleConfiguration(color=" + v0.r0.z(this.a) + ", rippleAlpha=" + this.b + ')';
    }

    public N(long j, W.g gVar) {
        this.a = j;
        this.b = gVar;
    }

    public /* synthetic */ N(long j, W.g gVar, int i, kotlin.jvm.internal.k kVar) {
        this((i & 1) != 0 ? v0.r0.b.j() : j, (i & 2) != 0 ? null : gVar, null);
    }
}
