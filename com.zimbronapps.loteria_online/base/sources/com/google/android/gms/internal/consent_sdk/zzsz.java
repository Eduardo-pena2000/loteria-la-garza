package com.google.android.gms.internal.consent_sdk;

/* JADX WARN: Enum visitor error
LI11I1ll1Ii11.IIiLliI1l1li1: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:112)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:91)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:52)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:46)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:136)
	at jadx.core.dex.visitors.EnumVisitor.visit(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzsz {
    public static final zzsz zza;
    public static final zzsz zzb;
    public static final zzsz zzc;
    public static final zzsz zzd;
    public static final zzsz zze;
    public static final zzsz zzf;
    public static final zzsz zzg;
    public static final zzsz zzh;
    public static final zzsz zzi;
    public static final zzsz zzj;
    public static final zzsz zzk;
    public static final zzsz zzl;
    public static final zzsz zzm;
    public static final zzsz zzn;
    public static final zzsz zzo;
    public static final zzsz zzp;
    public static final zzsz zzq;
    public static final zzsz zzr;
    private static final /* synthetic */ zzsz[] zzs;
    private final zzta zzt;
    private final int zzu;

    static {
        zzsz zzszVar = new zzsz("DOUBLE", 0, zzta.zzd, 1);
        zza = zzszVar;
        zzsz zzszVar2 = new zzsz("FLOAT", 1, zzta.zzc, 5);
        zzb = zzszVar2;
        zzta zztaVar = zzta.zzb;
        zzsz zzszVar3 = new zzsz("INT64", 2, zztaVar, 0);
        zzc = zzszVar3;
        zzsz zzszVar4 = new zzsz("UINT64", 3, zztaVar, 0);
        zzd = zzszVar4;
        zzta zztaVar2 = zzta.zza;
        zzsz zzszVar5 = new zzsz("INT32", 4, zztaVar2, 0);
        zze = zzszVar5;
        zzsz zzszVar6 = new zzsz("FIXED64", 5, zztaVar, 1);
        zzf = zzszVar6;
        zzsz zzszVar7 = new zzsz("FIXED32", 6, zztaVar2, 5);
        zzg = zzszVar7;
        zzsz zzszVar8 = new zzsz("BOOL", 7, zzta.zze, 0);
        zzh = zzszVar8;
        zzsz zzszVar9 = new zzsz("STRING", 8, zzta.zzf, 2);
        zzi = zzszVar9;
        zzta zztaVar3 = zzta.zzi;
        zzsz zzszVar10 = new zzsz("GROUP", 9, zztaVar3, 3);
        zzj = zzszVar10;
        zzsz zzszVar11 = new zzsz("MESSAGE", 10, zztaVar3, 2);
        zzk = zzszVar11;
        zzsz zzszVar12 = new zzsz("BYTES", 11, zzta.zzg, 2);
        zzl = zzszVar12;
        zzsz zzszVar13 = new zzsz("UINT32", 12, zztaVar2, 0);
        zzm = zzszVar13;
        zzsz zzszVar14 = new zzsz("ENUM", 13, zzta.zzh, 0);
        zzn = zzszVar14;
        zzsz zzszVar15 = new zzsz("SFIXED32", 14, zztaVar2, 5);
        zzo = zzszVar15;
        zzsz zzszVar16 = new zzsz("SFIXED64", 15, zztaVar, 1);
        zzp = zzszVar16;
        zzsz zzszVar17 = new zzsz("SINT32", 16, zztaVar2, 0);
        zzq = zzszVar17;
        zzsz zzszVar18 = new zzsz("SINT64", 17, zztaVar, 0);
        zzr = zzszVar18;
        zzs = new zzsz[]{zzszVar, zzszVar2, zzszVar3, zzszVar4, zzszVar5, zzszVar6, zzszVar7, zzszVar8, zzszVar9, zzszVar10, zzszVar11, zzszVar12, zzszVar13, zzszVar14, zzszVar15, zzszVar16, zzszVar17, zzszVar18};
    }

    private zzsz(String str, int i, zzta zztaVar, int i2) {
        this.zzt = zztaVar;
        this.zzu = i2;
    }

    public static zzsz[] values() {
        return (zzsz[]) zzs.clone();
    }

    public final int zza() {
        return this.zzu;
    }

    public final zzta zzb() {
        return this.zzt;
    }
}
