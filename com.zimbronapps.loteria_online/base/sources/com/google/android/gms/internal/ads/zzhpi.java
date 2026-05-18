package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhpi extends zzibr implements zzidd {
    private static final zzhpi zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb;
    private zzhpk zzc;
    private zzian zzd = zzian.zza;

    static {
        zzhpi zzhpiVar = new zzhpi();
        zze = zzhpiVar;
        zzibr.zzbu(zzhpi.class, zzhpiVar);
    }

    private zzhpi() {
    }

    public static zzhpi zzd(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhpi) zzibr.zzbT(zze, zzianVar, zzibbVar);
    }

    public static zzhph zze() {
        return (zzhph) zze.zzbn();
    }

    public static zzidk zzg() {
        return zze.zzbd();
    }

    public static /* synthetic */ zzhpi zzj() {
        return zze;
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhpk zzb() {
        zzhpk zzhpkVar = this.zzc;
        return zzhpkVar == null ? zzhpk.zzh() : zzhpkVar;
    }

    public final zzian zzc() {
        return this.zzd;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhpi();
        }
        if (ordinal == 4) {
            return new zzhph(null);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzf;
        if (zzidkVar == null) {
            synchronized (zzhpi.class) {
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

    public final /* synthetic */ void zzh(zzhpk zzhpkVar) {
        zzhpkVar.getClass();
        this.zzc = zzhpkVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzi(zzian zzianVar) {
        this.zzd = zzianVar;
    }
}
