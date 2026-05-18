package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhqc extends zzibr implements zzidd {
    private static final zzhqc zzd;
    private static volatile zzidk zze;
    private String zza = "";
    private zzian zzb = zzian.zza;
    private int zzc;

    static {
        zzhqc zzhqcVar = new zzhqc();
        zzd = zzhqcVar;
        zzibr.zzbu(zzhqc.class, zzhqcVar);
    }

    private zzhqc() {
    }

    public static zzhqa zzd() {
        return (zzhqa) zzd.zzbn();
    }

    public static zzhqc zze() {
        return zzd;
    }

    public static /* synthetic */ zzhqc zzj() {
        return zzd;
    }

    public final String zza() {
        return this.zza;
    }

    public final zzian zzb() {
        return this.zzb;
    }

    public final zzhqb zzc() {
        int i = this.zzc;
        zzhqb zzhqbVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : zzhqb.REMOTE : zzhqb.ASYMMETRIC_PUBLIC : zzhqb.ASYMMETRIC_PRIVATE : zzhqb.SYMMETRIC : zzhqb.UNKNOWN_KEYMATERIAL;
        return zzhqbVar == null ? zzhqb.UNRECOGNIZED : zzhqbVar;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhqc();
        }
        if (ordinal == 4) {
            return new zzhqa(null);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zze;
        if (zzidkVar == null) {
            synchronized (zzhqc.class) {
                try {
                    zzidkVar = zze;
                    if (zzidkVar == null) {
                        zzidkVar = new zzibm(zzd);
                        zze = zzidkVar;
                    }
                } finally {
                }
            }
        }
        return zzidkVar;
    }

    public final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void zzh(zzian zzianVar) {
        zzianVar.getClass();
        this.zzb = zzianVar;
    }

    public final /* synthetic */ void zzi(zzhqb zzhqbVar) {
        this.zzc = zzhqbVar.zza();
    }
}
