package com.google.android.gms.internal.play_billing;

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
public final class zzhs {
    public static final zzhs zza;
    public static final zzhs zzb;
    public static final zzhs zzc;
    public static final zzhs zzd;
    public static final zzhs zze;
    public static final zzhs zzf;
    public static final zzhs zzg;
    public static final zzhs zzh;
    public static final zzhs zzi;
    public static final zzhs zzj;
    public static final zzhs zzk;
    public static final zzhs zzl;
    public static final zzhs zzm;
    public static final zzhs zzn;
    public static final zzhs zzo;
    public static final zzhs zzp;
    public static final zzhs zzq;
    public static final zzhs zzr;
    private static final /* synthetic */ zzhs[] zzs;
    private final zzht zzt;
    private final int zzu;

    static {
        zzhs zzhsVar = new zzhs("DOUBLE", 0, zzht.zzd, 1);
        zza = zzhsVar;
        zzhs zzhsVar2 = new zzhs("FLOAT", 1, zzht.zzc, 5);
        zzb = zzhsVar2;
        zzht zzhtVar = zzht.zzb;
        zzhs zzhsVar3 = new zzhs("INT64", 2, zzhtVar, 0);
        zzc = zzhsVar3;
        zzhs zzhsVar4 = new zzhs("UINT64", 3, zzhtVar, 0);
        zzd = zzhsVar4;
        zzht zzhtVar2 = zzht.zza;
        zzhs zzhsVar5 = new zzhs("INT32", 4, zzhtVar2, 0);
        zze = zzhsVar5;
        zzhs zzhsVar6 = new zzhs("FIXED64", 5, zzhtVar, 1);
        zzf = zzhsVar6;
        zzhs zzhsVar7 = new zzhs("FIXED32", 6, zzhtVar2, 5);
        zzg = zzhsVar7;
        zzhs zzhsVar8 = new zzhs("BOOL", 7, zzht.zze, 0);
        zzh = zzhsVar8;
        zzhs zzhsVar9 = new zzhs("STRING", 8, zzht.zzf, 2);
        zzi = zzhsVar9;
        zzht zzhtVar3 = zzht.zzi;
        zzhs zzhsVar10 = new zzhs("GROUP", 9, zzhtVar3, 3);
        zzj = zzhsVar10;
        zzhs zzhsVar11 = new zzhs("MESSAGE", 10, zzhtVar3, 2);
        zzk = zzhsVar11;
        zzhs zzhsVar12 = new zzhs("BYTES", 11, zzht.zzg, 2);
        zzl = zzhsVar12;
        zzhs zzhsVar13 = new zzhs("UINT32", 12, zzhtVar2, 0);
        zzm = zzhsVar13;
        zzhs zzhsVar14 = new zzhs("ENUM", 13, zzht.zzh, 0);
        zzn = zzhsVar14;
        zzhs zzhsVar15 = new zzhs("SFIXED32", 14, zzhtVar2, 5);
        zzo = zzhsVar15;
        zzhs zzhsVar16 = new zzhs("SFIXED64", 15, zzhtVar, 1);
        zzp = zzhsVar16;
        zzhs zzhsVar17 = new zzhs("SINT32", 16, zzhtVar2, 0);
        zzq = zzhsVar17;
        zzhs zzhsVar18 = new zzhs("SINT64", 17, zzhtVar, 0);
        zzr = zzhsVar18;
        zzs = new zzhs[]{zzhsVar, zzhsVar2, zzhsVar3, zzhsVar4, zzhsVar5, zzhsVar6, zzhsVar7, zzhsVar8, zzhsVar9, zzhsVar10, zzhsVar11, zzhsVar12, zzhsVar13, zzhsVar14, zzhsVar15, zzhsVar16, zzhsVar17, zzhsVar18};
    }

    private zzhs(String str, int i, zzht zzhtVar, int i2) {
        this.zzt = zzhtVar;
        this.zzu = i2;
    }

    public static zzhs[] values() {
        return (zzhs[]) zzs.clone();
    }

    public final zzht zza() {
        return this.zzt;
    }
}
