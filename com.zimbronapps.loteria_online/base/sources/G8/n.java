package G8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class n implements o {
    public static final n a;
    public static final n b;
    public static final n c;
    public static final n d;
    public static final /* synthetic */ n[] e;

    public enum a extends n {
        public a(String str, int i) {
            super(str, i, null);
        }
    }

    public enum b extends n {
        public b(String str, int i) {
            super(str, i, null);
        }
    }

    public enum c extends n {
        public c(String str, int i) {
            super(str, i, null);
        }
    }

    public enum d extends n {
        public d(String str, int i) {
            super(str, i, null);
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        a = aVar;
        b bVar = new b("LAZILY_PARSED_NUMBER", 1);
        b = bVar;
        c cVar = new c("LONG_OR_DOUBLE", 2);
        c = cVar;
        d dVar = new d("BIG_DECIMAL", 3);
        d = dVar;
        e = new n[]{aVar, bVar, cVar, dVar};
    }

    public n(String str, int i) {
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) e.clone();
    }

    public /* synthetic */ n(String str, int i, a aVar) {
        this(str, i);
    }
}
