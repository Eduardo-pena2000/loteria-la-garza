package F;

import T1.A0;
import b0.C0;
import b0.U1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b implements e0 {
    public final int b;
    public final String c;
    public final C0 d = U1.i(K1.b.e, null, 2, null);
    public final C0 e = U1.i(Boolean.TRUE, null, 2, null);

    public b(int i, String str) {
        this.b = i;
        this.c = str;
    }

    public int a(n1.d dVar, n1.t tVar) {
        return e().c;
    }

    public int b(n1.d dVar, n1.t tVar) {
        return e().a;
    }

    public int c(n1.d dVar) {
        return e().d;
    }

    public int d(n1.d dVar) {
        return e().b;
    }

    public final K1.b e() {
        return (K1.b) this.d.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.b == ((b) obj).b;
    }

    public final void f(K1.b bVar) {
        this.d.setValue(bVar);
    }

    public final void g(boolean z) {
        this.e.setValue(Boolean.valueOf(z));
    }

    public final void h(A0 a0, int i) {
        if (i == 0 || (i & this.b) != 0) {
            f(a0.f(this.b));
            g(a0.q(this.b));
        }
    }

    public int hashCode() {
        return this.b;
    }

    public String toString() {
        return this.c + '(' + e().a + ", " + e().b + ", " + e().c + ", " + e().d + ')';
    }
}
