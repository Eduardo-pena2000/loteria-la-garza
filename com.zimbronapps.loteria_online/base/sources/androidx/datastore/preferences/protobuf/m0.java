package androidx.datastore.preferences.protobuf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class m0 {
    public static final int a = c(1, 3);
    public static final int b = c(1, 4);
    public static final int c = c(2, 0);
    public static final int d = c(3, 2);

    /* JADX WARN: Enum visitor error
    LI11I1ll1Ii11.IIiLliI1l1li1: Init of enum field 'e' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:112)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:91)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:52)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:46)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:136)
    	at jadx.core.dex.visitors.EnumVisitor.visit(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class b {
        public static final b c;
        public static final b d;
        public static final b e;
        public static final b f;
        public static final b g;
        public static final b h;
        public static final b i;
        public static final b j;
        public static final b k;
        public static final b l;
        public static final b m;
        public static final b n;
        public static final b o;
        public static final b p;
        public static final b q;
        public static final b r;
        public static final b s;
        public static final b t;
        public static final /* synthetic */ b[] u;
        public final c a;
        public final int b;

        public enum a extends b {
            public a(String str, int i, c cVar, int i2) {
                super(str, i, cVar, i2, null);
            }
        }

        public enum b extends b {
            public b(String str, int i, c cVar, int i2) {
                super(str, i, cVar, i2, null);
            }
        }

        public enum c extends b {
            public c(String str, int i, c cVar, int i2) {
                super(str, i, cVar, i2, null);
            }
        }

        public enum d extends b {
            public d(String str, int i, c cVar, int i2) {
                super(str, i, cVar, i2, null);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            g = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            h = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            i = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            j = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            k = aVar;
            c cVar3 = c.MESSAGE;
            b bVar9 = new b("GROUP", 9, cVar3, 3);
            l = bVar9;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            m = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            n = dVar;
            b bVar10 = new b("UINT32", 12, cVar2, 0);
            o = bVar10;
            b bVar11 = new b("ENUM", 13, c.ENUM, 0);
            p = bVar11;
            b bVar12 = new b("SFIXED32", 14, cVar2, 5);
            q = bVar12;
            b bVar13 = new b("SFIXED64", 15, cVar, 1);
            r = bVar13;
            b bVar14 = new b("SINT32", 16, cVar2, 0);
            s = bVar14;
            b bVar15 = new b("SINT64", 17, cVar, 0);
            t = bVar15;
            u = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, bVar9, cVar4, dVar, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15};
        }

        public /* synthetic */ b(String str, int i2, c cVar, int i3, a aVar) {
            this(str, i2, cVar, i3);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) u.clone();
        }

        public c a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public b(String str, int i2, c cVar, int i3) {
            this.a = cVar;
            this.b = i3;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(f.b),
        ENUM(null),
        MESSAGE(null);

        public final Object a;

        c(Object obj) {
            this.a = obj;
        }
    }

    public static int a(int i) {
        return i >>> 3;
    }

    public static int b(int i) {
        return i & 7;
    }

    public static int c(int i, int i2) {
        return (i << 3) | i2;
    }
}
