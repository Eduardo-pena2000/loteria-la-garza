package F;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class t implements e0 {
    public final e0 b;
    public final e0 c;

    public t(e0 e0Var, e0 e0Var2) {
        this.b = e0Var;
        this.c = e0Var2;
    }

    public int a(n1.d dVar, n1.t tVar) {
        return Wa.n.e(this.b.a(dVar, tVar) - this.c.a(dVar, tVar), 0);
    }

    public int b(n1.d dVar, n1.t tVar) {
        return Wa.n.e(this.b.b(dVar, tVar) - this.c.b(dVar, tVar), 0);
    }

    public int c(n1.d dVar) {
        return Wa.n.e(this.b.c(dVar) - this.c.c(dVar), 0);
    }

    public int d(n1.d dVar) {
        return Wa.n.e(this.b.d(dVar) - this.c.d(dVar), 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.t.c(tVar.b, this.b) && kotlin.jvm.internal.t.c(tVar.c, this.c);
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        return '(' + this.b + " - " + this.c + ')';
    }
}
