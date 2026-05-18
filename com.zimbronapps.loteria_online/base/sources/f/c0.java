package F;

import b0.C0;
import b0.U1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c0 implements e0 {
    public final String b;
    public final C0 c;

    public c0(B b, String str) {
        this.b = str;
        this.c = U1.i(b, null, 2, null);
    }

    public int a(n1.d dVar, n1.t tVar) {
        return e().c();
    }

    public int b(n1.d dVar, n1.t tVar) {
        return e().b();
    }

    public int c(n1.d dVar) {
        return e().a();
    }

    public int d(n1.d dVar) {
        return e().d();
    }

    public final B e() {
        return (B) this.c.getValue();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0) {
            return kotlin.jvm.internal.t.c(e(), ((c0) obj).e());
        }
        return false;
    }

    public final void f(B b) {
        this.c.setValue(b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return this.b + "(left=" + e().b() + ", top=" + e().d() + ", right=" + e().c() + ", bottom=" + e().a() + ')';
    }
}
