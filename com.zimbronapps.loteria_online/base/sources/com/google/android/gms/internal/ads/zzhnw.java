package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhnw extends zzibr implements zzidd {
    private static final zzhnw zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb;
    private zzian zzc = zzian.zza;
    private zzhoa zzd;

    static {
        zzhnw zzhnwVar = new zzhnw();
        zze = zzhnwVar;
        zzibr.zzbu(zzhnw.class, zzhnwVar);
    }

    private zzhnw() {
    }

    public static zzhnw zzd(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhnw) zzibr.zzbT(zze, zzianVar, zzibbVar);
    }

    public static zzhnv zze() {
        return (zzhnv) zze.zzbn();
    }

    public static zzidk zzg() {
        return zze.zzbd();
    }

    public static /* synthetic */ zzhnw zzj() {
        return zze;
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzian zzb() {
        return this.zzc;
    }

    public final zzhoa zzc() {
        zzhoa zzhoaVar = this.zzd;
        return zzhoaVar == null ? zzhoa.zzc() : zzhoaVar;
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
            return new zzhnw();
        }
        if (ordinal == 4) {
            return new zzhnv(null);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzf;
        if (zzidkVar == null) {
            synchronized (zzhnw.class) {
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

    public final /* synthetic */ void zzi(zzhoa zzhoaVar) {
        zzhoaVar.getClass();
        this.zzd = zzhoaVar;
        this.zza |= 1;
    }
}
