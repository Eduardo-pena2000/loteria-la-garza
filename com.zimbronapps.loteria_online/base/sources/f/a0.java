package F;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a0 implements e0 {
    public final e0 b;
    public final e0 c;

    public a0(e0 e0Var, e0 e0Var2) {
        this.b = e0Var;
        this.c = e0Var2;
    }

    public int a(n1.d dVar, n1.t tVar) {
        return Math.max(this.b.a(dVar, tVar), this.c.a(dVar, tVar));
    }

    public int b(n1.d dVar, n1.t tVar) {
        return Math.max(this.b.b(dVar, tVar), this.c.b(dVar, tVar));
    }

    public int c(n1.d dVar) {
        return Math.max(this.b.c(dVar), this.c.c(dVar));
    }

    public int d(n1.d dVar) {
        return Math.max(this.b.d(dVar), this.c.d(dVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return kotlin.jvm.internal.t.c(a0Var.b, this.b) && kotlin.jvm.internal.t.c(a0Var.c, this.c);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.c.hashCode() * 31);
    }

    public String toString() {
        return '(' + this.b + " ∪ " + this.c + ')';
    }
}
