package sb;

import java.util.List;
import qb.e;
import qb.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class S implements qb.e {
    public final String a;
    public final qb.e b;
    public final qb.e c;
    public final int d;

    public /* synthetic */ S(String str, qb.e eVar, qb.e eVar2, kotlin.jvm.internal.k kVar) {
        this(str, eVar, eVar2);
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
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    public int d() {
        return this.d;
    }

    public String e(int i) {
        return String.valueOf(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s = (S) obj;
        return kotlin.jvm.internal.t.c(h(), s.h()) && kotlin.jvm.internal.t.c(this.b, s.b) && kotlin.jvm.internal.t.c(this.c, s.c);
    }

    public List f(int i) {
        if (i >= 0) {
            return Da.v.n();
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + h() + " expects only non-negative indices").toString());
    }

    public qb.e g(int i) {
        if (i >= 0) {
            int i2 = i % 2;
            if (i2 == 0) {
                return this.b;
            }
            if (i2 == 1) {
                return this.c;
            }
            throw new IllegalStateException("Unreached");
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + h() + " expects only non-negative indices").toString());
    }

    public List getAnnotations() {
        return e.a.a(this);
    }

    public qb.l getKind() {
        return m.c.a;
    }

    public String h() {
        return this.a;
    }

    public int hashCode() {
        return (((h().hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
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
        return h() + '(' + this.b + ", " + this.c + ')';
    }

    public S(String str, qb.e eVar, qb.e eVar2) {
        this.a = str;
        this.b = eVar;
        this.c = eVar2;
        this.d = 2;
    }
}
