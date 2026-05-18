package P0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class l1 {
    public static final l1 a = new l1("Shown", 0);
    public static final l1 b = new l1("Hidden", 1);
    public static final /* synthetic */ l1[] c;
    public static final /* synthetic */ Ja.a d;

    static {
        l1[] a2 = a();
        c = a2;
        d = Ja.b.a(a2);
    }

    public l1(String str, int i) {
    }

    public static final /* synthetic */ l1[] a() {
        return new l1[]{a, b};
    }

    public static l1 valueOf(String str) {
        return (l1) Enum.valueOf(l1.class, str);
    }

    public static l1[] values() {
        return (l1[]) c.clone();
    }
}
