package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaxf extends zzibr implements zzidd {
    private static final zzaxf zzj;
    private static volatile zzidk zzk;
    private int zza;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;

    static {
        zzaxf zzaxfVar = new zzaxf();
        zzj = zzaxfVar;
        zzibr.zzbu(zzaxf.class, zzaxfVar);
    }

    private zzaxf() {
    }

    public static zzaxe zza() {
        return (zzaxe) zzj.zzbn();
    }

    public static /* synthetic */ zzaxf zzh() {
        return zzj;
    }

    public final /* synthetic */ void zzb(long j) {
        this.zza |= 1;
        this.zzb = j;
    }

    public final /* synthetic */ void zzc(long j) {
        this.zza |= 4;
        this.zzd = j;
    }

    public final /* synthetic */ void zzd(long j) {
        this.zza |= 8;
        this.zze = j;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new zzaxf();
        }
        if (ordinal == 4) {
            return new zzaxe(null);
        }
        if (ordinal == 5) {
            return zzj;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzk;
        if (zzidkVar == null) {
            synchronized (zzaxf.class) {
                try {
                    zzidkVar = zzk;
                    if (zzidkVar == null) {
                        zzidkVar = new zzibm(zzj);
                        zzk = zzidkVar;
                    }
                } finally {
                }
            }
        }
        return zzidkVar;
    }

    public final /* synthetic */ void zze(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    public final /* synthetic */ void zzg(long j) {
        this.zza |= 32;
        this.zzg = j;
    }
}
