package com.google.android.gms.internal.ads;

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
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzici {
    public static final zzici zza;
    public static final zzici zzb;
    public static final zzici zzc;
    public static final zzici zzd;
    public static final zzici zze;
    public static final zzici zzf;
    public static final zzici zzg;
    public static final zzici zzh;
    public static final zzici zzi;
    public static final zzici zzj;
    private static final /* synthetic */ zzici[] zzl;
    private final Class zzk;

    static {
        zzici zziciVar = new zzici("VOID", 0, Void.class, Void.class, null);
        zza = zziciVar;
        Class cls = Integer.TYPE;
        zzici zziciVar2 = new zzici("INT", 1, cls, Integer.class, 0);
        zzb = zziciVar2;
        zzici zziciVar3 = new zzici("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zziciVar3;
        zzici zziciVar4 = new zzici("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zziciVar4;
        zzici zziciVar5 = new zzici("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zziciVar5;
        zzici zziciVar6 = new zzici("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zziciVar6;
        zzici zziciVar7 = new zzici("STRING", 6, String.class, String.class, "");
        zzg = zziciVar7;
        zzici zziciVar8 = new zzici("BYTE_STRING", 7, zzian.class, zzian.class, zzian.zza);
        zzh = zziciVar8;
        zzici zziciVar9 = new zzici("ENUM", 8, cls, Integer.class, null);
        zzi = zziciVar9;
        zzici zziciVar10 = new zzici("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zziciVar10;
        zzl = new zzici[]{zziciVar, zziciVar2, zziciVar3, zziciVar4, zziciVar5, zziciVar6, zziciVar7, zziciVar8, zziciVar9, zziciVar10};
    }

    private zzici(String str, int i, Class cls, Class cls2, Object obj) {
        this.zzk = cls2;
    }

    public static zzici[] values() {
        return (zzici[]) zzl.clone();
    }

    public final Class zza() {
        return this.zzk;
    }
}
