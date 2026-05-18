package Xb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public enum b {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");

    public final int a;
    public final String b;

    b(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public int b() {
        return this.a;
    }

    public String toString() {
        return this.b;
    }
}
