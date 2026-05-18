package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhpx extends zzibr implements zzidd {
    private static final zzhpx zze;
    private static volatile zzidk zzf;
    private int zza;
    private zzhpz zzb;
    private int zzc;
    private int zzd;

    static {
        zzhpx zzhpxVar = new zzhpx();
        zze = zzhpxVar;
        zzibr.zzbu(zzhpx.class, zzhpxVar);
    }

    private zzhpx() {
    }

    public static zzhpx zzd(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhpx) zzibr.zzbT(zze, zzianVar, zzibbVar);
    }

    public static zzhpw zze() {
        return (zzhpw) zze.zzbn();
    }

    public static zzhpx zzg() {
        return zze;
    }

    public static /* synthetic */ zzhpx zzj() {
        return zze;
    }

    public final zzhpz zza() {
        zzhpz zzhpzVar = this.zzb;
        return zzhpzVar == null ? zzhpz.zzd() : zzhpzVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhpx();
        }
        if (ordinal == 4) {
            return new zzhpw(null);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzf;
        if (zzidkVar == null) {
            synchronized (zzhpx.class) {
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

    public final /* synthetic */ void zzh(zzhpz zzhpzVar) {
        zzhpzVar.getClass();
        this.zzb = zzhpzVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzi(int i) {
        this.zzc = i;
    }
}
