package l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i {
    public static final i a = new i("Ltr", 0);
    public static final i b = new i("Rtl", 1);
    public static final /* synthetic */ i[] c;
    public static final /* synthetic */ Ja.a d;

    static {
        i[] a2 = a();
        c = a2;
        d = Ja.b.a(a2);
    }

    public i(String str, int i) {
    }

    public static final /* synthetic */ i[] a() {
        return new i[]{a, b};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) c.clone();
    }
}
