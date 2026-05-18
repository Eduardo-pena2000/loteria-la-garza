package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhpp extends zzibr implements zzidd {
    private static final zzhpp zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb;
    private zzian zzc = zzian.zza;
    private zzhpr zzd;

    static {
        zzhpp zzhppVar = new zzhpp();
        zze = zzhppVar;
        zzibr.zzbu(zzhpp.class, zzhppVar);
    }

    private zzhpp() {
    }

    public static zzhpp zzd(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhpp) zzibr.zzbT(zze, zzianVar, zzibbVar);
    }

    public static zzhpo zze() {
        return (zzhpo) zze.zzbn();
    }

    public static zzidk zzg() {
        return zze.zzbd();
    }

    public static /* synthetic */ zzhpp zzj() {
        return zze;
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzian zzb() {
        return this.zzc;
    }

    public final zzhpr zzc() {
        zzhpr zzhprVar = this.zzd;
        return zzhprVar == null ? zzhpr.zze() : zzhprVar;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhpp();
        }
        if (ordinal == 4) {
            return new zzhpo(null);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzf;
        if (zzidkVar == null) {
            synchronized (zzhpp.class) {
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

    public final /* synthetic */ void zzh(zzian zzianVar) {
        this.zzc = zzianVar;
    }

    public final /* synthetic */ void zzi(zzhpr zzhprVar) {
        zzhprVar.getClass();
        this.zzd = zzhprVar;
        this.zza |= 1;
    }
}
