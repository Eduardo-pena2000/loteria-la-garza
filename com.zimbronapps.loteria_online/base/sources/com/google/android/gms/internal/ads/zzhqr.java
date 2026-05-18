package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhqr extends zzibr implements zzidd {
    private static final zzhqr zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private zzhqt zzc;

    static {
        zzhqr zzhqrVar = new zzhqr();
        zzd = zzhqrVar;
        zzibr.zzbu(zzhqr.class, zzhqrVar);
    }

    private zzhqr() {
    }

    public static zzhqr zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhqr) zzibr.zzbT(zzd, zzianVar, zzibbVar);
    }

    public static zzhqq zzd() {
        return (zzhqq) zzd.zzbn();
    }

    public static zzidk zze() {
        return zzd.zzbd();
    }

    public static /* synthetic */ zzhqr zzh() {
        return zzd;
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhqt zzb() {
        zzhqt zzhqtVar = this.zzc;
        return zzhqtVar == null ? zzhqt.zzd() : zzhqtVar;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhqr();
        }
        if (ordinal == 4) {
            return new zzhqq(null);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zze;
        if (zzidkVar == null) {
            synchronized (zzhqr.class) {
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

    public final /* synthetic */ void zzg(zzhqt zzhqtVar) {
        zzhqtVar.getClass();
        this.zzc = zzhqtVar;
        this.zza |= 1;
    }
}
