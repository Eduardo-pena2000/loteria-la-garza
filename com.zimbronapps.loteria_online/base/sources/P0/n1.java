package P0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n1 {
    public final String a;
    public final Object b;

    public n1(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return kotlin.jvm.internal.t.c(this.a, n1Var.a) && kotlin.jvm.internal.t.c(this.b, n1Var.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "ValueElement(name=" + this.a + ", value=" + this.b + ')';
    }
}
