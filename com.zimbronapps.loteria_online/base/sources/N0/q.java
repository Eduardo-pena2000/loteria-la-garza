package n0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class q {
    public final int a;
    public final Integer b;

    public q(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final int a() {
        return this.a;
    }

    public final Integer b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a == qVar.a && kotlin.jvm.internal.t.c(this.b, qVar.b);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "ObjectLocation(group=" + this.a + ", dataOffset=" + this.b + ')';
    }
}
