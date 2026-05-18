package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfpx extends zzibr implements zzidd {
    private static final zzfpx zzd;
    private static volatile zzidk zze;
    private long zza;
    private long zzb;
    private zzicd zzc = zzibr.zzbM();

    static {
        zzfpx zzfpxVar = new zzfpx();
        zzd = zzfpxVar;
        zzibr.zzbu(zzfpx.class, zzfpxVar);
    }

    private zzfpx() {
    }

    public static /* synthetic */ zzfpx zza() {
        return zzd;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzd, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0002\u0002\u0002\u0003Ț", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzfpx();
        }
        if (ordinal == 4) {
            return new zzfpw(null);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zze;
        if (zzidkVar == null) {
            synchronized (zzfpx.class) {
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
}
