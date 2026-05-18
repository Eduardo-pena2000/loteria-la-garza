package e9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class c {
    public static final c a = new c("NONE", 0);
    public static final c b = new c("PAUSE", 1);
    public static final c c = new c("PAUSE_RESUME", 2);
    public static final /* synthetic */ c[] d;
    public static final /* synthetic */ Ja.a e;

    static {
        c[] a2 = a();
        d = a2;
        e = Ja.b.a(a2);
    }

    public c(String str, int i) {
    }

    public static final /* synthetic */ c[] a() {
        return new c[]{a, b, c};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
