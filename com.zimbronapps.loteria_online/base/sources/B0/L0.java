package b0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class l0 {
    public static final l0 a = new l0("IGNORED", 0);
    public static final l0 b = new l0("SCHEDULED", 1);
    public static final l0 c = new l0("DEFERRED", 2);
    public static final l0 d = new l0("IMMINENT", 3);
    public static final /* synthetic */ l0[] e;
    public static final /* synthetic */ Ja.a f;

    static {
        l0[] a2 = a();
        e = a2;
        f = Ja.b.a(a2);
    }

    public l0(String str, int i) {
    }

    public static final /* synthetic */ l0[] a() {
        return new l0[]{a, b, c, d};
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) e.clone();
    }
}
