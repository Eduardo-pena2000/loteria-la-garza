package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzifp extends zzibr implements zzidd {
    private static final zzifp zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb;
    private long zzc;
    private zzian zzd = zzian.zza;

    static {
        zzifp zzifpVar = new zzifp();
        zze = zzifpVar;
        zzibr.zzbu(zzifp.class, zzifpVar);
    }

    private zzifp() {
    }

    public static /* synthetic */ zzifp zzc() {
        return zze;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", zzifo.zza, "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzifp();
        }
        if (ordinal == 4) {
            return new zzifn(null);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzf;
        if (zzidkVar == null) {
            synchronized (zzifp.class) {
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
}
