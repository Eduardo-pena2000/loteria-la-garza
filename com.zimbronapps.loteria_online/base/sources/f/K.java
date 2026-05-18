package F;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k implements j, h {
    public final n1.d a;
    public final long b;
    public final /* synthetic */ androidx.compose.foundation.layout.c c;

    public /* synthetic */ k(n1.d dVar, long j, kotlin.jvm.internal.k kVar) {
        this(dVar, j);
    }

    public androidx.compose.ui.e a(androidx.compose.ui.e eVar, o0.e eVar2) {
        return this.c.a(eVar, eVar2);
    }

    public float b() {
        return n1.b.h(d()) ? this.a.A(n1.b.l(d())) : n1.h.b.b();
    }

    public androidx.compose.ui.e c(androidx.compose.ui.e eVar) {
        return this.c.c(eVar);
    }

    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.t.c(this.a, kVar.a) && n1.b.f(this.b, kVar.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + n1.b.o(this.b);
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + n1.b.q(this.b) + ')';
    }

    public k(n1.d dVar, long j) {
        this.a = dVar;
        this.b = j;
        this.c = androidx.compose.foundation.layout.c.a;
    }
}
