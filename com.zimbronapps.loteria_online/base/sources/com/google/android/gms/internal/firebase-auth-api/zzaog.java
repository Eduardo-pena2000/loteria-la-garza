package com.google.android.gms.internal.firebase-auth-api;

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
public class zzaog {
    public static final zzaog zza;
    public static final zzaog zzb;
    public static final zzaog zzc;
    public static final zzaog zzd;
    public static final zzaog zze;
    public static final zzaog zzf;
    public static final zzaog zzg;
    public static final zzaog zzh;
    public static final zzaog zzi;
    public static final zzaog zzj;
    public static final zzaog zzk;
    public static final zzaog zzl;
    public static final zzaog zzm;
    public static final zzaog zzn;
    public static final zzaog zzo;
    public static final zzaog zzp;
    public static final zzaog zzq;
    public static final zzaog zzr;
    private static final /* synthetic */ zzaog[] zzs;
    private final zzaoj zzt;
    private final int zzu;

    static {
        zzaog zzaogVar = new zzaog("DOUBLE", 0, zzaoj.zzd, 1);
        zza = zzaogVar;
        zzaog zzaogVar2 = new zzaog("FLOAT", 1, zzaoj.zzc, 5);
        zzb = zzaogVar2;
        zzaoj zzaojVar = zzaoj.zzb;
        zzaog zzaogVar3 = new zzaog("INT64", 2, zzaojVar, 0);
        zzc = zzaogVar3;
        zzaog zzaogVar4 = new zzaog("UINT64", 3, zzaojVar, 0);
        zzd = zzaogVar4;
        zzaoj zzaojVar2 = zzaoj.zza;
        zzaog zzaogVar5 = new zzaog("INT32", 4, zzaojVar2, 0);
        zze = zzaogVar5;
        zzaog zzaogVar6 = new zzaog("FIXED64", 5, zzaojVar, 1);
        zzf = zzaogVar6;
        zzaog zzaogVar7 = new zzaog("FIXED32", 6, zzaojVar2, 5);
        zzg = zzaogVar7;
        zzaog zzaogVar8 = new zzaog("BOOL", 7, zzaoj.zze, 0);
        zzh = zzaogVar8;
        zzaof zzaofVar = new zzaof("STRING", 8, zzaoj.zzf, 2, null);
        zzi = zzaofVar;
        zzaoj zzaojVar3 = zzaoj.zzi;
        zzaoi zzaoiVar = new zzaoi("GROUP", 9, zzaojVar3, 3, null);
        zzj = zzaoiVar;
        zzaoh zzaohVar = new zzaoh("MESSAGE", 10, zzaojVar3, 2, null);
        zzk = zzaohVar;
        zzaok zzaokVar = new zzaok("BYTES", 11, zzaoj.zzg, 2, null);
        zzl = zzaokVar;
        zzaog zzaogVar9 = new zzaog("UINT32", 12, zzaojVar2, 0);
        zzm = zzaogVar9;
        zzaog zzaogVar10 = new zzaog("ENUM", 13, zzaoj.zzh, 0);
        zzn = zzaogVar10;
        zzaog zzaogVar11 = new zzaog("SFIXED32", 14, zzaojVar2, 5);
        zzo = zzaogVar11;
        zzaog zzaogVar12 = new zzaog("SFIXED64", 15, zzaojVar, 1);
        zzp = zzaogVar12;
        zzaog zzaogVar13 = new zzaog("SINT32", 16, zzaojVar2, 0);
        zzq = zzaogVar13;
        zzaog zzaogVar14 = new zzaog("SINT64", 17, zzaojVar, 0);
        zzr = zzaogVar14;
        zzs = new zzaog[]{zzaogVar, zzaogVar2, zzaogVar3, zzaogVar4, zzaogVar5, zzaogVar6, zzaogVar7, zzaogVar8, zzaofVar, zzaoiVar, zzaohVar, zzaokVar, zzaogVar9, zzaogVar10, zzaogVar11, zzaogVar12, zzaogVar13, zzaogVar14};
    }

    public /* synthetic */ zzaog(String str, int i, zzaoj zzaojVar, int i2, zzaom zzaomVar) {
        this(str, i, zzaojVar, i2);
    }

    public static zzaog[] values() {
        return (zzaog[]) zzs.clone();
    }

    public final int zza() {
        return this.zzu;
    }

    public final zzaoj zzb() {
        return this.zzt;
    }

    private zzaog(String str, int i, zzaoj zzaojVar, int i2) {
        this.zzt = zzaojVar;
        this.zzu = i2;
    }
}
