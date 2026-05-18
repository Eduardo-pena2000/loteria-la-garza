package n1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class t {
    public static final t a = new t("Ltr", 0);
    public static final t b = new t("Rtl", 1);
    public static final /* synthetic */ t[] c;
    public static final /* synthetic */ Ja.a d;

    static {
        t[] a2 = a();
        c = a2;
        d = Ja.b.a(a2);
    }

    public t(String str, int i) {
    }

    public static final /* synthetic */ t[] a() {
        return new t[]{a, b};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) c.clone();
    }
}
