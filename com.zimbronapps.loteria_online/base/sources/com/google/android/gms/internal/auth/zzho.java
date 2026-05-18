package com.google.android.gms.internal.auth;

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
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzho {
    public static final zzho zza;
    public static final zzho zzb;
    public static final zzho zzc;
    public static final zzho zzd;
    public static final zzho zze;
    public static final zzho zzf;
    public static final zzho zzg;
    public static final zzho zzh;
    public static final zzho zzi;
    public static final zzho zzj;
    public static final zzho zzk;
    public static final zzho zzl;
    public static final zzho zzm;
    public static final zzho zzn;
    public static final zzho zzo;
    public static final zzho zzp;
    public static final zzho zzq;
    public static final zzho zzr;
    private static final /* synthetic */ zzho[] zzs;
    private final zzhp zzt;

    static {
        zzho zzhoVar = new zzho("DOUBLE", 0, zzhp.zzd, 1);
        zza = zzhoVar;
        zzho zzhoVar2 = new zzho("FLOAT", 1, zzhp.zzc, 5);
        zzb = zzhoVar2;
        zzhp zzhpVar = zzhp.zzb;
        zzho zzhoVar3 = new zzho("INT64", 2, zzhpVar, 0);
        zzc = zzhoVar3;
        zzho zzhoVar4 = new zzho("UINT64", 3, zzhpVar, 0);
        zzd = zzhoVar4;
        zzhp zzhpVar2 = zzhp.zza;
        zzho zzhoVar5 = new zzho("INT32", 4, zzhpVar2, 0);
        zze = zzhoVar5;
        zzho zzhoVar6 = new zzho("FIXED64", 5, zzhpVar, 1);
        zzf = zzhoVar6;
        zzho zzhoVar7 = new zzho("FIXED32", 6, zzhpVar2, 5);
        zzg = zzhoVar7;
        zzho zzhoVar8 = new zzho("BOOL", 7, zzhp.zze, 0);
        zzh = zzhoVar8;
        zzho zzhoVar9 = new zzho("STRING", 8, zzhp.zzf, 2);
        zzi = zzhoVar9;
        zzhp zzhpVar3 = zzhp.zzi;
        zzho zzhoVar10 = new zzho("GROUP", 9, zzhpVar3, 3);
        zzj = zzhoVar10;
        zzho zzhoVar11 = new zzho("MESSAGE", 10, zzhpVar3, 2);
        zzk = zzhoVar11;
        zzho zzhoVar12 = new zzho("BYTES", 11, zzhp.zzg, 2);
        zzl = zzhoVar12;
        zzho zzhoVar13 = new zzho("UINT32", 12, zzhpVar2, 0);
        zzm = zzhoVar13;
        zzho zzhoVar14 = new zzho("ENUM", 13, zzhp.zzh, 0);
        zzn = zzhoVar14;
        zzho zzhoVar15 = new zzho("SFIXED32", 14, zzhpVar2, 5);
        zzo = zzhoVar15;
        zzho zzhoVar16 = new zzho("SFIXED64", 15, zzhpVar, 1);
        zzp = zzhoVar16;
        zzho zzhoVar17 = new zzho("SINT32", 16, zzhpVar2, 0);
        zzq = zzhoVar17;
        zzho zzhoVar18 = new zzho("SINT64", 17, zzhpVar, 0);
        zzr = zzhoVar18;
        zzs = new zzho[]{zzhoVar, zzhoVar2, zzhoVar3, zzhoVar4, zzhoVar5, zzhoVar6, zzhoVar7, zzhoVar8, zzhoVar9, zzhoVar10, zzhoVar11, zzhoVar12, zzhoVar13, zzhoVar14, zzhoVar15, zzhoVar16, zzhoVar17, zzhoVar18};
    }

    private zzho(String str, int i, zzhp zzhpVar, int i2) {
        this.zzt = zzhpVar;
    }

    public static zzho[] values() {
        return (zzho[]) zzs.clone();
    }

    public final zzhp zza() {
        return this.zzt;
    }
}
