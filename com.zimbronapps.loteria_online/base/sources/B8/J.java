package B8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class j implements g8.f {
    public static final j b = new j("EVENT_TYPE_UNKNOWN", 0, 0);
    public static final j c = new j("SESSION_START", 1, 1);
    public static final /* synthetic */ j[] d;
    public static final /* synthetic */ Ja.a e;
    public final int a;

    static {
        j[] a = a();
        d = a;
        e = Ja.b.a(a);
    }

    public j(String str, int i, int i2) {
        this.a = i2;
    }

    public static final /* synthetic */ j[] a() {
        return new j[]{b, c};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) d.clone();
    }

    public int getNumber() {
        return this.a;
    }
}
