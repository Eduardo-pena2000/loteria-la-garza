package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhpv extends zzibr implements zzidd {
    private static final zzhpv zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb;
    private zzhpz zzc;
    private zzian zzd = zzian.zza;

    static {
        zzhpv zzhpvVar = new zzhpv();
        zze = zzhpvVar;
        zzibr.zzbu(zzhpv.class, zzhpvVar);
    }

    private zzhpv() {
    }

    public static zzhpv zzd(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhpv) zzibr.zzbT(zze, zzianVar, zzibbVar);
    }

    public static zzhpu zze() {
        return (zzhpu) zze.zzbn();
    }

    public static zzhpv zzg() {
        return zze;
    }

    public static zzidk zzh() {
        return zze.zzbd();
    }

    public static /* synthetic */ zzhpv zzk() {
        return zze;
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhpz zzb() {
        zzhpz zzhpzVar = this.zzc;
        return zzhpzVar == null ? zzhpz.zzd() : zzhpzVar;
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
            return new zzhpv();
        }
        if (ordinal == 4) {
            return new zzhpu(null);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzf;
        if (zzidkVar == null) {
            synchronized (zzhpv.class) {
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

    public final /* synthetic */ void zzi(zzhpz zzhpzVar) {
        zzhpzVar.getClass();
        this.zzc = zzhpzVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzj(zzian zzianVar) {
        this.zzd = zzianVar;
    }
}
