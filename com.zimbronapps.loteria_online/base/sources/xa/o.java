package Xa;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class o {
    public static final o a = new o("PUBLIC", 0);
    public static final o b = new o("PROTECTED", 1);
    public static final o c = new o("INTERNAL", 2);
    public static final o d = new o("PRIVATE", 3);
    public static final /* synthetic */ o[] e;
    public static final /* synthetic */ Ja.a f;

    static {
        o[] a2 = a();
        e = a2;
        f = Ja.b.a(a2);
    }

    public o(String str, int i) {
    }

    public static final /* synthetic */ o[] a() {
        return new o[]{a, b, c, d};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) e.clone();
    }
}
