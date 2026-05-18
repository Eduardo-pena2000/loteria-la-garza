package com.google.android.recaptcha.internal;

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
public final class zzpw {
    public static final zzpw zza;
    public static final zzpw zzb;
    public static final zzpw zzc;
    public static final zzpw zzd;
    public static final zzpw zze;
    public static final zzpw zzf;
    public static final zzpw zzg;
    public static final zzpw zzh;
    public static final zzpw zzi;
    public static final zzpw zzj;
    public static final zzpw zzk;
    public static final zzpw zzl;
    public static final zzpw zzm;
    public static final zzpw zzn;
    public static final zzpw zzo;
    public static final zzpw zzp;
    public static final zzpw zzq;
    public static final zzpw zzr;
    private static final /* synthetic */ zzpw[] zzs;
    private final zzpx zzt;

    static {
        zzpw zzpwVar = new zzpw("DOUBLE", 0, zzpx.zzd, 1);
        zza = zzpwVar;
        zzpw zzpwVar2 = new zzpw("FLOAT", 1, zzpx.zzc, 5);
        zzb = zzpwVar2;
        zzpx zzpxVar = zzpx.zzb;
        zzpw zzpwVar3 = new zzpw("INT64", 2, zzpxVar, 0);
        zzc = zzpwVar3;
        zzpw zzpwVar4 = new zzpw("UINT64", 3, zzpxVar, 0);
        zzd = zzpwVar4;
        zzpx zzpxVar2 = zzpx.zza;
        zzpw zzpwVar5 = new zzpw("INT32", 4, zzpxVar2, 0);
        zze = zzpwVar5;
        zzpw zzpwVar6 = new zzpw("FIXED64", 5, zzpxVar, 1);
        zzf = zzpwVar6;
        zzpw zzpwVar7 = new zzpw("FIXED32", 6, zzpxVar2, 5);
        zzg = zzpwVar7;
        zzpw zzpwVar8 = new zzpw("BOOL", 7, zzpx.zze, 0);
        zzh = zzpwVar8;
        zzpw zzpwVar9 = new zzpw("STRING", 8, zzpx.zzf, 2);
        zzi = zzpwVar9;
        zzpx zzpxVar3 = zzpx.zzi;
        zzpw zzpwVar10 = new zzpw("GROUP", 9, zzpxVar3, 3);
        zzj = zzpwVar10;
        zzpw zzpwVar11 = new zzpw("MESSAGE", 10, zzpxVar3, 2);
        zzk = zzpwVar11;
        zzpw zzpwVar12 = new zzpw("BYTES", 11, zzpx.zzg, 2);
        zzl = zzpwVar12;
        zzpw zzpwVar13 = new zzpw("UINT32", 12, zzpxVar2, 0);
        zzm = zzpwVar13;
        zzpw zzpwVar14 = new zzpw("ENUM", 13, zzpx.zzh, 0);
        zzn = zzpwVar14;
        zzpw zzpwVar15 = new zzpw("SFIXED32", 14, zzpxVar2, 5);
        zzo = zzpwVar15;
        zzpw zzpwVar16 = new zzpw("SFIXED64", 15, zzpxVar, 1);
        zzp = zzpwVar16;
        zzpw zzpwVar17 = new zzpw("SINT32", 16, zzpxVar2, 0);
        zzq = zzpwVar17;
        zzpw zzpwVar18 = new zzpw("SINT64", 17, zzpxVar, 0);
        zzr = zzpwVar18;
        zzs = new zzpw[]{zzpwVar, zzpwVar2, zzpwVar3, zzpwVar4, zzpwVar5, zzpwVar6, zzpwVar7, zzpwVar8, zzpwVar9, zzpwVar10, zzpwVar11, zzpwVar12, zzpwVar13, zzpwVar14, zzpwVar15, zzpwVar16, zzpwVar17, zzpwVar18};
    }

    private zzpw(String str, int i, zzpx zzpxVar, int i2) {
        this.zzt = zzpxVar;
    }

    public static zzpw[] values() {
        return (zzpw[]) zzs.clone();
    }

    public final zzpx zza() {
        return this.zzt;
    }
}
