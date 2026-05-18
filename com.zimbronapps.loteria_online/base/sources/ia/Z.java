package ia;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class z extends Throwable {
    public final String a;
    public final String b;
    public final Object c;

    public z(String code, String str, Object obj) {
        kotlin.jvm.internal.t.g(code, "code");
        this.a = code;
        this.b = str;
        this.c = obj;
    }

    public final String a() {
        return this.a;
    }

    public final Object b() {
        return this.c;
    }

    public String getMessage() {
        return this.b;
    }
}
