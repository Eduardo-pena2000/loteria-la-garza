package G8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class l {
    public static final l a;
    public static final l b;
    public static final /* synthetic */ l[] c;

    public enum a extends l {
        public a(String str, int i) {
            super(str, i, null);
        }
    }

    public enum b extends l {
        public b(String str, int i) {
            super(str, i, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        a = aVar;
        b bVar = new b("STRING", 1);
        b = bVar;
        c = new l[]{aVar, bVar};
    }

    public l(String str, int i) {
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) c.clone();
    }

    public /* synthetic */ l(String str, int i, a aVar) {
        this(str, i);
    }
}
