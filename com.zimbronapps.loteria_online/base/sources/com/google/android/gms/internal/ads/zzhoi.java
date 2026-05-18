package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhoi extends zzibr implements zzidd {
    private static final zzhoi zzd;
    private static volatile zzidk zze;
    private int zza;
    private zzhok zzb;
    private int zzc;

    static {
        zzhoi zzhoiVar = new zzhoi();
        zzd = zzhoiVar;
        zzibr.zzbu(zzhoi.class, zzhoiVar);
    }

    private zzhoi() {
    }

    public static zzhoh zzc() {
        return (zzhoh) zzd.zzbn();
    }

    public static zzhoi zzd() {
        return zzd;
    }

    public static /* synthetic */ zzhoi zzh() {
        return zzd;
    }

    public final zzhok zza() {
        zzhok zzhokVar = this.zzb;
        return zzhokVar == null ? zzhok.zzc() : zzhokVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhoi();
        }
        if (ordinal == 4) {
            return new zzhoh(null);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zze;
        if (zzidkVar == null) {
            synchronized (zzhoi.class) {
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

    public final /* synthetic */ void zze(zzhok zzhokVar) {
        zzhokVar.getClass();
        this.zzb = zzhokVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzg(int i) {
        this.zzc = i;
    }
}
