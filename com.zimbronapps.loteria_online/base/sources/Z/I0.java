package z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i0 implements i {
    public final i a;
    public final long b;

    public i0(i iVar, long j) {
        this.a = iVar;
        this.b = j;
    }

    public v0 a(s0 s0Var) {
        return new j0(this.a.a(s0Var), this.b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return i0Var.b == this.b && kotlin.jvm.internal.t.c(i0Var.a, this.a);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Long.hashCode(this.b);
    }
}
