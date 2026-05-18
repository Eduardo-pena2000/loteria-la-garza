package r1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class u {
    public static final u a = new u("Inherit", 0);
    public static final u b = new u("SecureOn", 1);
    public static final u c = new u("SecureOff", 2);
    public static final /* synthetic */ u[] d;
    public static final /* synthetic */ Ja.a e;

    static {
        u[] a2 = a();
        d = a2;
        e = Ja.b.a(a2);
    }

    public u(String str, int i) {
    }

    public static final /* synthetic */ u[] a() {
        return new u[]{a, b, c};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) d.clone();
    }
}
