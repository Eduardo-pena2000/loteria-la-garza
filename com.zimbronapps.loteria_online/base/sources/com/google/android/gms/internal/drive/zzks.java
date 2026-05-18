package com.google.android.gms.internal.drive;

/* JADX WARN: Enum visitor error
LI11I1ll1Ii11.IIiLliI1l1li1: Init of enum field 'zzss' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:112)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:91)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:52)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:46)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:136)
	at jadx.core.dex.visitors.EnumVisitor.visit(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzks {
    public static final zzks zzsr;
    public static final zzks zzss;
    public static final zzks zzst;
    public static final zzks zzsu;
    public static final zzks zzsv;
    public static final zzks zzsw;
    public static final zzks zzsx;
    public static final zzks zzsy;
    public static final zzks zzsz;
    public static final zzks zzta;
    private static final /* synthetic */ zzks[] zzte;
    private final Class zztb;
    private final Class zztc;
    private final Object zztd;

    static {
        zzks zzksVar = new zzks("VOID", 0, Void.class, Void.class, null);
        zzsr = zzksVar;
        Class cls = Integer.TYPE;
        zzks zzksVar2 = new zzks("INT", 1, cls, Integer.class, 0);
        zzss = zzksVar2;
        zzks zzksVar3 = new zzks("LONG", 2, Long.TYPE, Long.class, 0L);
        zzst = zzksVar3;
        zzks zzksVar4 = new zzks("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzsu = zzksVar4;
        zzks zzksVar5 = new zzks("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zzsv = zzksVar5;
        zzks zzksVar6 = new zzks("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzsw = zzksVar6;
        zzks zzksVar7 = new zzks("STRING", 6, String.class, String.class, "");
        zzsx = zzksVar7;
        zzks zzksVar8 = new zzks("BYTE_STRING", 7, zzjc.class, zzjc.class, zzjc.zznq);
        zzsy = zzksVar8;
        zzks zzksVar9 = new zzks("ENUM", 8, cls, Integer.class, null);
        zzsz = zzksVar9;
        zzks zzksVar10 = new zzks("MESSAGE", 9, Object.class, Object.class, null);
        zzta = zzksVar10;
        zzte = new zzks[]{zzksVar, zzksVar2, zzksVar3, zzksVar4, zzksVar5, zzksVar6, zzksVar7, zzksVar8, zzksVar9, zzksVar10};
    }

    private zzks(String str, int i, Class cls, Class cls2, Object obj) {
        this.zztb = cls;
        this.zztc = cls2;
        this.zztd = obj;
    }

    public static zzks[] values() {
        return (zzks[]) zzte.clone();
    }

    public final Class zzdo() {
        return this.zztc;
    }
}
