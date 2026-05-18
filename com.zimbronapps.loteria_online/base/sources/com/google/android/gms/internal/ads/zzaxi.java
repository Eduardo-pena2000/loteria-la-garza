package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaxi extends zzibr implements zzidd {
    private static final zzaxi zzl;
    private static volatile zzidk zzm;
    private int zza;
    private long zzb;
    private int zzc;
    private boolean zzd;
    private long zzf;
    private boolean zzg;
    private long zzi;
    private long zzj;
    private long zzk;
    private zzibz zze = zzibr.zzbC();
    private zzicd zzh = zzibr.zzbM();

    static {
        zzaxi zzaxiVar = new zzaxi();
        zzl = zzaxiVar;
        zzibr.zzbu(zzaxi.class, zzaxiVar);
    }

    private zzaxi() {
    }

    public static /* synthetic */ zzaxi zza() {
        return zzl;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzl, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003\u0006ဇ\u0004\u0007\u001b\bဂ\u0005\tဂ\u0006\nဂ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", zzaxm.class, "zzi", "zzj", "zzk"});
        }
        if (ordinal == 3) {
            return new zzaxi();
        }
        if (ordinal == 4) {
            return new zzaxh(null);
        }
        if (ordinal == 5) {
            return zzl;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzm;
        if (zzidkVar == null) {
            synchronized (zzaxi.class) {
                try {
                    zzidkVar = zzm;
                    if (zzidkVar == null) {
                        zzidkVar = new zzibm(zzl);
                        zzm = zzidkVar;
                    }
                } finally {
                }
            }
        }
        return zzidkVar;
    }
}
