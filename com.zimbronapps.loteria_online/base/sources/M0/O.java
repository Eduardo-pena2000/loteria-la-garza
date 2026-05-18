package M0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o {
    public static final o a = new o("Width", 0);
    public static final o b = new o("Height", 1);
    public static final /* synthetic */ o[] c;
    public static final /* synthetic */ Ja.a d;

    static {
        o[] a2 = a();
        c = a2;
        d = Ja.b.a(a2);
    }

    public o(String str, int i) {
    }

    public static final /* synthetic */ o[] a() {
        return new o[]{a, b};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) c.clone();
    }
}
