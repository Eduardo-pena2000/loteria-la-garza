package za;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class q0 {
    public static final a b;
    public static final q0 c = new q0("ALWAYS", 0, 0);
    public static final q0 d = new q0("IF_CONTENT_SCROLLS", 1, 1);
    public static final q0 e = new q0("NEVER", 2, 2);
    public static final q0 f = new q0("UNKNOWN", 3, 3);
    public static final /* synthetic */ q0[] g;
    public static final /* synthetic */ Ja.a h;
    public final int a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final q0 a(int i) {
            for (q0 q0Var : q0.values()) {
                if (q0Var.b() == i) {
                    return q0Var;
                }
            }
            return null;
        }

        public a() {
        }
    }

    static {
        q0[] a2 = a();
        g = a2;
        h = Ja.b.a(a2);
        b = new a(null);
    }

    public q0(String str, int i, int i2) {
        this.a = i2;
    }

    public static final /* synthetic */ q0[] a() {
        return new q0[]{c, d, e, f};
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) g.clone();
    }

    public final int b() {
        return this.a;
    }
}
