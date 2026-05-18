package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaxq extends zzibr implements zzidd {
    private static final zzaxq zzh;
    private static volatile zzidk zzi;
    private int zza;
    private long zzd;
    private long zzf;
    private long zzg;
    private String zzb = "";
    private String zzc = "";
    private String zze = "D";

    static {
        zzaxq zzaxqVar = new zzaxq();
        zzh = zzaxqVar;
        zzibr.zzbu(zzaxq.class, zzaxqVar);
    }

    private zzaxq() {
    }

    public static zzaxp zza() {
        return (zzaxp) zzh.zzbn();
    }

    public static /* synthetic */ zzaxq zzi() {
        return zzh;
    }

    public final /* synthetic */ void zzb(String str) {
        this.zza |= 1;
        this.zzb = "0.825731049";
    }

    public final /* synthetic */ void zzc(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void zzd(long j) {
        this.zza |= 4;
        this.zzd = j;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzh, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new zzaxq();
        }
        if (ordinal == 4) {
            return new zzaxp(null);
        }
        if (ordinal == 5) {
            return zzh;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzi;
        if (zzidkVar == null) {
            synchronized (zzaxq.class) {
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

    public final /* synthetic */ void zzh(long j) {
        this.zza |= 32;
        this.zzg = j;
    }
}
