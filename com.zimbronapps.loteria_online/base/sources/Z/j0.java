package z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j0 implements v0 {
    public final v0 a;
    public final long b;

    public j0(v0 v0Var, long j) {
        this.a = v0Var;
        this.b = j;
    }

    public boolean a() {
        return this.a.a();
    }

    public long b(q qVar, q qVar2, q qVar3) {
        return this.a.b(qVar, qVar2, qVar3) + this.b;
    }

    public q c(long j, q qVar, q qVar2, q qVar3) {
        long j2 = this.b;
        return j < j2 ? qVar : this.a.c(j - j2, qVar, qVar2, qVar3);
    }

    public q e(long j, q qVar, q qVar2, q qVar3) {
        long j2 = this.b;
        return j < j2 ? qVar3 : this.a.e(j - j2, qVar, qVar2, qVar3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return j0Var.b == this.b && kotlin.jvm.internal.t.c(j0Var.a, this.a);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Long.hashCode(this.b);
    }
}
