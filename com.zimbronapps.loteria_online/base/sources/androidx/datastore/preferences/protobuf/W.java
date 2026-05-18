package androidx.datastore.preferences.protobuf;

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
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class w {
    public static final w d;
    public static final w e;
    public static final w f;
    public static final w g;
    public static final w h;
    public static final w i;
    public static final w j;
    public static final w k;
    public static final w l;
    public static final w m;
    public static final /* synthetic */ w[] n;
    public final Class a;
    public final Class b;
    public final Object c;

    static {
        w wVar = new w("VOID", 0, Void.class, Void.class, null);
        d = wVar;
        Class cls = Integer.TYPE;
        w wVar2 = new w("INT", 1, cls, Integer.class, 0);
        e = wVar2;
        w wVar3 = new w("LONG", 2, Long.TYPE, Long.class, 0L);
        f = wVar3;
        w wVar4 = new w("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        g = wVar4;
        w wVar5 = new w("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        h = wVar5;
        w wVar6 = new w("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        i = wVar6;
        w wVar7 = new w("STRING", 6, String.class, String.class, "");
        j = wVar7;
        w wVar8 = new w("BYTE_STRING", 7, f.class, f.class, f.b);
        k = wVar8;
        w wVar9 = new w("ENUM", 8, cls, Integer.class, null);
        l = wVar9;
        w wVar10 = new w("MESSAGE", 9, Object.class, Object.class, null);
        m = wVar10;
        n = new w[]{wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7, wVar8, wVar9, wVar10};
    }

    public w(String str, int i2, Class cls, Class cls2, Object obj) {
        this.a = cls;
        this.b = cls2;
        this.c = obj;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) n.clone();
    }

    public Class a() {
        return this.b;
    }
}
