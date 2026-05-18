package X;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public /* synthetic */ n0(long j, long j2, long j3, long j4, long j5, kotlin.jvm.internal.k kVar) {
        this(j, j2, j3, j4, j5);
    }

    public final long a(float f) {
        return v0.s0.i(this.a, this.b, z.F.c().a(f));
    }

    public final n0 b(long j, long j2, long j3, long j4, long j5) {
        return new n0(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d, j5 != 16 ? j5 : this.e, null);
    }

    public final long c() {
        return this.e;
    }

    public final long d() {
        return this.c;
    }

    public final long e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return v0.r0.s(this.a, n0Var.a) && v0.r0.s(this.b, n0Var.b) && v0.r0.s(this.c, n0Var.c) && v0.r0.s(this.d, n0Var.d) && v0.r0.s(this.e, n0Var.e);
    }

    public int hashCode() {
        return (((((((v0.r0.y(this.a) * 31) + v0.r0.y(this.b)) * 31) + v0.r0.y(this.c)) * 31) + v0.r0.y(this.d)) * 31) + v0.r0.y(this.e);
    }

    public n0(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }
}
