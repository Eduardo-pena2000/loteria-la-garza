package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
LI11I1ll1Ii11.IIiLliI1l1li1: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:112)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:91)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:52)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:46)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:136)
	at jadx.core.dex.visitors.EnumVisitor.visit(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzms {
    public static final zzms zza;
    public static final zzms zzb;
    public static final zzms zzc;
    public static final zzms zzd;
    public static final zzms zze;
    public static final zzms zzf;
    public static final zzms zzg;
    public static final zzms zzh;
    public static final zzms zzi;
    public static final zzms zzj;
    private static final /* synthetic */ zzms[] zzl;
    private final Class zzk;

    static {
        zzms zzmsVar = new zzms("VOID", 0, Void.class, Void.class, null);
        zza = zzmsVar;
        Class cls = Integer.TYPE;
        zzms zzmsVar2 = new zzms("INT", 1, cls, Integer.class, 0);
        zzb = zzmsVar2;
        zzms zzmsVar3 = new zzms("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzmsVar3;
        zzms zzmsVar4 = new zzms("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzmsVar4;
        zzms zzmsVar5 = new zzms("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzmsVar5;
        zzms zzmsVar6 = new zzms("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzmsVar6;
        zzms zzmsVar7 = new zzms("STRING", 6, String.class, String.class, "");
        zzg = zzmsVar7;
        zzms zzmsVar8 = new zzms("BYTE_STRING", 7, zzlh.class, zzlh.class, zzlh.zzb);
        zzh = zzmsVar8;
        zzms zzmsVar9 = new zzms("ENUM", 8, cls, Integer.class, null);
        zzi = zzmsVar9;
        zzms zzmsVar10 = new zzms("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzmsVar10;
        zzl = new zzms[]{zzmsVar, zzmsVar2, zzmsVar3, zzmsVar4, zzmsVar5, zzmsVar6, zzmsVar7, zzmsVar8, zzmsVar9, zzmsVar10};
    }

    private zzms(String str, int i, Class cls, Class cls2, Object obj) {
        this.zzk = cls2;
    }

    public static zzms[] values() {
        return (zzms[]) zzl.clone();
    }

    public final Class zza() {
        return this.zzk;
    }
}
