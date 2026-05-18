package b0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j2 implements n2 {
    public final Object a;

    public j2(Object obj) {
        this.a = obj;
    }

    public Object a(U0 u0) {
        return this.a;
    }

    public final Object b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2) && kotlin.jvm.internal.t.c(this.a, ((j2) obj).a);
    }

    public int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "StaticValueHolder(value=" + this.a + ')';
    }
}
