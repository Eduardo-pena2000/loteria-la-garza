package ab;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class e {
    public static final e b = new e("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    public static final e c = new e("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    public static final e d = new e("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    public static final e e = new e("SECONDS", 3, TimeUnit.SECONDS);
    public static final e f = new e("MINUTES", 4, TimeUnit.MINUTES);
    public static final e g = new e("HOURS", 5, TimeUnit.HOURS);
    public static final e h = new e("DAYS", 6, TimeUnit.DAYS);
    public static final /* synthetic */ e[] i;
    public static final /* synthetic */ Ja.a j;
    public final TimeUnit a;

    static {
        e[] a = a();
        i = a;
        j = Ja.b.a(a);
    }

    public e(String str, int i2, TimeUnit timeUnit) {
        this.a = timeUnit;
    }

    public static final /* synthetic */ e[] a() {
        return new e[]{b, c, d, e, f, g, h};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) i.clone();
    }

    public final TimeUnit b() {
        return this.a;
    }
}
