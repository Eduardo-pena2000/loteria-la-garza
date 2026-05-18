package ua;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class f {
    public static final a b;
    public static final f c = new f("UNEXPECTED_CREDENTIAL_TYPE", 0, 0);
    public static final f d = new f("MISSING_SERVER_CLIENT_ID", 1, 1);
    public static final f e = new f("NO_ACTIVITY", 2, 2);
    public static final f f = new f("INTERRUPTED", 3, 3);
    public static final f g = new f("CANCELED", 4, 4);
    public static final f h = new f("NO_CREDENTIAL", 5, 5);
    public static final f i = new f("PROVIDER_CONFIGURATION_ISSUE", 6, 6);
    public static final f j = new f("UNSUPPORTED", 7, 7);
    public static final f k = new f("UNKNOWN", 8, 8);
    public static final /* synthetic */ f[] l;
    public static final /* synthetic */ Ja.a m;
    public final int a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final f a(int i) {
            for (f fVar : f.values()) {
                if (fVar.b() == i) {
                    return fVar;
                }
            }
            return null;
        }

        public a() {
        }
    }

    static {
        f[] a2 = a();
        l = a2;
        m = Ja.b.a(a2);
        b = new a(null);
    }

    public f(String str, int i2, int i3) {
        this.a = i3;
    }

    public static final /* synthetic */ f[] a() {
        return new f[]{c, d, e, f, g, h, i, j, k};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) l.clone();
    }

    public final int b() {
        return this.a;
    }
}
