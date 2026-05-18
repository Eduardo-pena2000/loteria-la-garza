package p6;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class b {
    public int a = 1;

    public b a(Object obj) {
        this.a = (this.a * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int b() {
        return this.a;
    }

    public final b c(boolean z) {
        this.a = (this.a * 31) + (z ? 1 : 0);
        return this;
    }
}
