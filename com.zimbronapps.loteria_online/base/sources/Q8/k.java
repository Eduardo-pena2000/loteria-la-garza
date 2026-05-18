package Q8;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class k {
    public final String a;
    public final String b;

    public k(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static k a(String str, String str2) {
        V8.g.f(str, "Name is null or empty");
        V8.g.f(str2, "Version is null or empty");
        return new k(str, str2);
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }
}
