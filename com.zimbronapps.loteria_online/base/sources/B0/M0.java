package b0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m0 {
    public final Object a;
    public final Object b;

    public m0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final int a(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return kotlin.jvm.internal.t.c(this.a, m0Var.a) && kotlin.jvm.internal.t.c(this.b, m0Var.b);
    }

    public int hashCode() {
        return (a(this.a) * 31) + a(this.b);
    }

    public String toString() {
        return "JoinedKey(left=" + this.a + ", right=" + this.b + ')';
    }
}
