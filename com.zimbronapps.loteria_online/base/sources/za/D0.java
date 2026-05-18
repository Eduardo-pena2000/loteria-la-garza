package za;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class d0 {
    public static final a b;
    public static final d0 c = new d0("OPEN", 0, 0);
    public static final d0 d = new d0("OPEN_MULTIPLE", 1, 1);
    public static final d0 e = new d0("SAVE", 2, 2);
    public static final d0 f = new d0("UNKNOWN", 3, 3);
    public static final /* synthetic */ d0[] g;
    public static final /* synthetic */ Ja.a h;
    public final int a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final d0 a(int i) {
            for (d0 d0Var : d0.values()) {
                if (d0Var.b() == i) {
                    return d0Var;
                }
            }
            return null;
        }

        public a() {
        }
    }

    static {
        d0[] a2 = a();
        g = a2;
        h = Ja.b.a(a2);
        b = new a(null);
    }

    public d0(String str, int i, int i2) {
        this.a = i2;
    }

    public static final /* synthetic */ d0[] a() {
        return new d0[]{c, d, e, f};
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) g.clone();
    }

    public final int b() {
        return this.a;
    }
}
