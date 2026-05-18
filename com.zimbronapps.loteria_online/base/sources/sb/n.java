package sb;

import java.util.List;
import qb.e;
import qb.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class N implements qb.e {
    public final qb.e a;
    public final int b;

    public /* synthetic */ N(qb.e eVar, kotlin.jvm.internal.k kVar) {
        this(eVar);
    }

    public boolean b() {
        return e.a.c(this);
    }

    public int c(String name) {
        kotlin.jvm.internal.t.g(name, "name");
        Integer p = Za.A.p(name);
        if (p != null) {
            return p.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    public int d() {
        return this.b;
    }

    public String e(int i) {
        return String.valueOf(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n = (N) obj;
        return kotlin.jvm.internal.t.c(this.a, n.a) && kotlin.jvm.internal.t.c(h(), n.h());
    }

    public List f(int i) {
        if (i >= 0) {
            return Da.v.n();
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + h() + " expects only non-negative indices").toString());
    }

    public qb.e g(int i) {
        if (i >= 0) {
            return this.a;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + h() + " expects only non-negative indices").toString());
    }

    public List getAnnotations() {
        return e.a.a(this);
    }

    public qb.l getKind() {
        return m.b.a;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + h().hashCode();
    }

    public boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + h() + " expects only non-negative indices").toString());
    }

    public boolean isInline() {
        return e.a.b(this);
    }

    public String toString() {
        return h() + '(' + this.a + ')';
    }

    public N(qb.e eVar) {
        this.a = eVar;
        this.b = 1;
    }
}
