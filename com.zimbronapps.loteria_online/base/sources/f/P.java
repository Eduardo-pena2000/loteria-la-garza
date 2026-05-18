package F;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class p implements N0.d {
    public final Qa.l b;
    public e0 c;

    public p(Qa.l lVar) {
        this.b = lVar;
    }

    public void a(N0.k kVar) {
        e0 e0Var = (e0) kVar.j(h0.a());
        if (kotlin.jvm.internal.t.c(e0Var, this.c)) {
            return;
        }
        this.c = e0Var;
        this.b.invoke(e0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && ((p) obj).b == this.b;
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}
