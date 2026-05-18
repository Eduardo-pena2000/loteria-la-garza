package sb;

import java.util.List;
import qb.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class q0 implements qb.e {
    public final String a;
    public final qb.d b;

    public q0(String serialName, qb.d kind) {
        kotlin.jvm.internal.t.g(serialName, "serialName");
        kotlin.jvm.internal.t.g(kind, "kind");
        this.a = serialName;
        this.b = kind;
    }

    private final Void a() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
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
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return kotlin.jvm.internal.t.c(h(), q0Var.h()) && kotlin.jvm.internal.t.c(getKind(), q0Var.getKind());
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

    public String h() {
        return this.a;
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

    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public qb.d getKind() {
        return this.b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + h() + ')';
    }
}
