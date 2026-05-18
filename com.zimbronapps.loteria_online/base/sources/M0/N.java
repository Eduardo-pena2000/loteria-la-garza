package M0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n {
    public static final n a = new n("Min", 0);
    public static final n b = new n("Max", 1);
    public static final /* synthetic */ n[] c;
    public static final /* synthetic */ Ja.a d;

    static {
        n[] a2 = a();
        c = a2;
        d = Ja.b.a(a2);
    }

    public n(String str, int i) {
    }

    public static final /* synthetic */ n[] a() {
        return new n[]{a, b};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) c.clone();
    }
}
