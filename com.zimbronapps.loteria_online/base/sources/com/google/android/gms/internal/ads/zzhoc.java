package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhoc extends zzibr implements zzidd {
    private static final zzhoc zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb;
    private zzhog zzc;
    private zzhpv zzd;

    static {
        zzhoc zzhocVar = new zzhoc();
        zze = zzhocVar;
        zzibr.zzbu(zzhoc.class, zzhocVar);
    }

    private zzhoc() {
    }

    public static zzhoc zzd(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhoc) zzibr.zzbT(zze, zzianVar, zzibbVar);
    }

    public static zzhob zze() {
        return (zzhob) zze.zzbn();
    }

    public static zzidk zzg() {
        return zze.zzbd();
    }

    public static /* synthetic */ zzhoc zzj() {
        return zze;
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhog zzb() {
        zzhog zzhogVar = this.zzc;
        return zzhogVar == null ? zzhog.zze() : zzhogVar;
    }

    public final zzhpv zzc() {
        zzhpv zzhpvVar = this.zzd;
        return zzhpvVar == null ? zzhpv.zzg() : zzhpvVar;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhoc();
        }
        if (ordinal == 4) {
            return new zzhob(null);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzf;
        if (zzidkVar == null) {
            synchronized (zzhoc.class) {
                try {
                    zzidkVar = zzf;
                    if (zzidkVar == null) {
                        zzidkVar = new zzibm(zze);
                        zzf = zzidkVar;
                    }
                } finally {
                }
            }
        }
        return zzidkVar;
    }

    public final /* synthetic */ void zzh(zzhog zzhogVar) {
        zzhogVar.getClass();
        this.zzc = zzhogVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzi(zzhpv zzhpvVar) {
        zzhpvVar.getClass();
        this.zzd = zzhpvVar;
        this.zza |= 2;
    }
}
