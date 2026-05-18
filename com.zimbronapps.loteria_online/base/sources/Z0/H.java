package Z0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h {
    public static final h a = new h("Paragraph", 0);
    public static final h b = new h("Span", 1);
    public static final h c = new h("VerbatimTts", 2);
    public static final h d = new h("Url", 3);
    public static final h e = new h("Link", 4);
    public static final h f = new h("Clickable", 5);
    public static final h g = new h("String", 6);
    public static final /* synthetic */ h[] h;
    public static final /* synthetic */ Ja.a i;

    static {
        h[] a2 = a();
        h = a2;
        i = Ja.b.a(a2);
    }

    public h(String str, int i2) {
    }

    public static final /* synthetic */ h[] a() {
        return new h[]{a, b, c, d, e, f, g};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) h.clone();
    }
}
