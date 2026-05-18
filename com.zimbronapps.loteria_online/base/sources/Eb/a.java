package eb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class a {
    public static final a a = new a("SUSPEND", 0);
    public static final a b = new a("DROP_OLDEST", 1);
    public static final a c = new a("DROP_LATEST", 2);
    public static final /* synthetic */ a[] d;
    public static final /* synthetic */ Ja.a e;

    static {
        a[] a2 = a();
        d = a2;
        e = Ja.b.a(a2);
    }

    public a(String str, int i) {
    }

    public static final /* synthetic */ a[] a() {
        return new a[]{a, b, c};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) d.clone();
    }
}
