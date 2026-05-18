package b0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a0 implements n2 {
    public final C0 a;

    public a0(C0 c0) {
        this.a = c0;
    }

    public Object a(U0 u0) {
        return this.a.getValue();
    }

    public final C0 b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && kotlin.jvm.internal.t.c(this.a, ((a0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}
