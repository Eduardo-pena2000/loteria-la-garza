package ub;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class i0 {
    public static final i0 c = new i0("OBJ", 0, '{', '}');
    public static final i0 d = new i0("LIST", 1, '[', ']');
    public static final i0 e = new i0("MAP", 2, '{', '}');
    public static final i0 f = new i0("POLY_OBJ", 3, '[', ']');
    public static final /* synthetic */ i0[] g;
    public static final /* synthetic */ Ja.a h;
    public final char a;
    public final char b;

    static {
        i0[] a = a();
        g = a;
        h = Ja.b.a(a);
    }

    public i0(String str, int i, char c2, char c3) {
        this.a = c2;
        this.b = c3;
    }

    public static final /* synthetic */ i0[] a() {
        return new i0[]{c, d, e, f};
    }

    public static Ja.a b() {
        return h;
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) g.clone();
    }
}
