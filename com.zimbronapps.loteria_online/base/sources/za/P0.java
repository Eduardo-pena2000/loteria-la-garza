package za;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class p0 {
    public static final a b;
    public static final p0 c = new p0("ALWAYS_ALLOW", 0, 0);
    public static final p0 d = new p0("COMPATIBILITY_MODE", 1, 1);
    public static final p0 e = new p0("NEVER_ALLOW", 2, 2);
    public static final /* synthetic */ p0[] f;
    public static final /* synthetic */ Ja.a g;
    public final int a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final p0 a(int i) {
            for (p0 p0Var : p0.values()) {
                if (p0Var.b() == i) {
                    return p0Var;
                }
            }
            return null;
        }

        public a() {
        }
    }

    static {
        p0[] a2 = a();
        f = a2;
        g = Ja.b.a(a2);
        b = new a(null);
    }

    public p0(String str, int i, int i2) {
        this.a = i2;
    }

    public static final /* synthetic */ p0[] a() {
        return new p0[]{c, d, e};
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) f.clone();
    }

    public final int b() {
        return this.a;
    }
}
