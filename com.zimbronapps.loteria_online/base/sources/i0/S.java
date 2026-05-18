package I0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class s {
    public static final s a = new s("Initial", 0);
    public static final s b = new s("Main", 1);
    public static final s c = new s("Final", 2);
    public static final /* synthetic */ s[] d;
    public static final /* synthetic */ Ja.a e;

    static {
        s[] a2 = a();
        d = a2;
        e = Ja.b.a(a2);
    }

    public s(String str, int i) {
    }

    public static final /* synthetic */ s[] a() {
        return new s[]{a, b, c};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) d.clone();
    }
}
