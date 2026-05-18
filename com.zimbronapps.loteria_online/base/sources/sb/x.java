package sb;

import java.util.List;
import qb.e;
import qb.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class X implements qb.e {
    public static final X a = new X();
    public static final qb.l b = m.d.a;
    public static final String c = "kotlin.Nothing";

    public final Void a() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public boolean b() {
        return e.a.c(this);
    }

    public int c(String name) {
        kotlin.jvm.internal.t.g(name, "name");
        a();
        throw new Ca.i();
    }

    public int d() {
        return 0;
    }

    public String e(int i) {
        a();
        throw new Ca.i();
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public List f(int i) {
        a();
        throw new Ca.i();
    }

    public qb.e g(int i) {
        a();
        throw new Ca.i();
    }

    public List getAnnotations() {
        return e.a.a(this);
    }

    public qb.l getKind() {
        return b;
    }

    public String h() {
        return c;
    }

    public int hashCode() {
        return h().hashCode() + (getKind().hashCode() * 31);
    }

    public boolean i(int i) {
        a();
        throw new Ca.i();
    }

    public boolean isInline() {
        return e.a.b(this);
    }

    public String toString() {
        return "NothingSerialDescriptor";
    }
}
