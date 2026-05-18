package f1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d0 {
    public final Z0.e a;
    public final J b;

    public d0(Z0.e eVar, J j) {
        this.a = eVar;
        this.b = j;
    }

    public final J a() {
        return this.b;
    }

    public final Z0.e b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return kotlin.jvm.internal.t.c(this.a, d0Var.a) && kotlin.jvm.internal.t.c(this.b, d0Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "TransformedText(text=" + this.a + ", offsetMapping=" + this.b + ')';
    }
}
