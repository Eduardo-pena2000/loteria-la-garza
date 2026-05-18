package j0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k {
    public int a;

    public k(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final void b(int i) {
        this.a = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IntRef(element = ");
        sb.append(this.a);
        sb.append(")@");
        String num = Integer.toString(hashCode(), Za.a.a(16));
        kotlin.jvm.internal.t.f(num, "toString(...)");
        sb.append(num);
        return sb.toString();
    }

    public /* synthetic */ k(int i, int i2, kotlin.jvm.internal.k kVar) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
