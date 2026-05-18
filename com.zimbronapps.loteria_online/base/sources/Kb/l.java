package kb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class l {
    public static final l a = new l("SUCCESSFUL", 0);
    public static final l b = new l("REREGISTER", 1);
    public static final l c = new l("CANCELLED", 2);
    public static final l d = new l("ALREADY_SELECTED", 3);
    public static final /* synthetic */ l[] e;
    public static final /* synthetic */ Ja.a f;

    static {
        l[] a2 = a();
        e = a2;
        f = Ja.b.a(a2);
    }

    public l(String str, int i) {
    }

    public static final /* synthetic */ l[] a() {
        return new l[]{a, b, c, d};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) e.clone();
    }
}
