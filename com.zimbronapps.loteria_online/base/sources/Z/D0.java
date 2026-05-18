package z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d0 implements C {
    public final int a;

    public d0(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        return (obj instanceof d0) && ((d0) obj).a == this.a;
    }

    public int hashCode() {
        return this.a;
    }

    public y0 a(s0 s0Var) {
        return new F0(this.a);
    }

    public /* synthetic */ d0(int i, int i2, kotlin.jvm.internal.k kVar) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
