package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbcd extends zzibr implements zzidd {
    private static final zzbcd zzh;
    private static volatile zzidk zzi;
    private int zza;
    private long zzc;
    private long zzf;
    private zzian zzb = zzian.zza;
    private String zzd = "";
    private String zze = "";
    private String zzg = "";

    static {
        zzbcd zzbcdVar = new zzbcd();
        zzh = zzbcdVar;
        zzibr.zzbu(zzbcd.class, zzbcdVar);
    }

    private zzbcd() {
    }

    public static zzbcc zza() {
        return (zzbcc) zzh.zzbn();
    }

    public static /* synthetic */ zzbcd zzi() {
        return zzh;
    }

    public final /* synthetic */ void zzb(zzian zzianVar) {
        this.zza |= 1;
        this.zzb = zzianVar;
    }

    public final /* synthetic */ void zzc(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    public final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzh, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new zzbcd();
        }
        if (ordinal == 4) {
            return new zzbcc(null);
        }
        if (ordinal == 5) {
            return zzh;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzi;
        if (zzidkVar == null) {
            synchronized (zzbcd.class) {
                try {
                    zzidkVar = zzi;
                    if (zzidkVar == null) {
                        zzidkVar = new zzibm(zzh);
                        zzi = zzidkVar;
                    }
                } finally {
                }
            }
        }
        return zzidkVar;
    }

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void zzg(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    public final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }
}
