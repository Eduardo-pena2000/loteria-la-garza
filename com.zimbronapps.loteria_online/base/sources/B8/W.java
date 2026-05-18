package B8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class w implements g8.f {
    public static final w b = new w("LOG_ENVIRONMENT_UNKNOWN", 0, 0);
    public static final w c = new w("LOG_ENVIRONMENT_AUTOPUSH", 1, 1);
    public static final w d = new w("LOG_ENVIRONMENT_STAGING", 2, 2);
    public static final w e = new w("LOG_ENVIRONMENT_PROD", 3, 3);
    public static final /* synthetic */ w[] f;
    public static final /* synthetic */ Ja.a g;
    public final int a;

    static {
        w[] a = a();
        f = a;
        g = Ja.b.a(a);
    }

    public w(String str, int i, int i2) {
        this.a = i2;
    }

    public static final /* synthetic */ w[] a() {
        return new w[]{b, c, d, e};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f.clone();
    }

    public int getNumber() {
        return this.a;
    }
}
