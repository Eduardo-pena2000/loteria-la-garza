package t0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b {
    public static final b a = new b("None", 0);
    public static final b b = new b("Cancelled", 1);
    public static final b c = new b("Redirected", 2);
    public static final b d = new b("RedirectCancelled", 3);
    public static final /* synthetic */ b[] e;
    public static final /* synthetic */ Ja.a f;

    static {
        b[] a2 = a();
        e = a2;
        f = Ja.b.a(a2);
    }

    public b(String str, int i) {
    }

    public static final /* synthetic */ b[] a() {
        return new b[]{a, b, c, d};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) e.clone();
    }
}
