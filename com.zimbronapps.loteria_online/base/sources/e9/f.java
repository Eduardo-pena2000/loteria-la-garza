package e9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class f {
    public static final f b = new f("PAUSE", 0, 0);
    public static final f c = new f("RECORD", 1, 1);
    public static final f d = new f("STOP", 2, 2);
    public static final /* synthetic */ f[] e;
    public static final /* synthetic */ Ja.a f;
    public final int a;

    static {
        f[] a = a();
        e = a;
        f = Ja.b.a(a);
    }

    public f(String str, int i, int i2) {
        this.a = i2;
    }

    public static final /* synthetic */ f[] a() {
        return new f[]{b, c, d};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) e.clone();
    }

    public final int b() {
        return this.a;
    }
}
