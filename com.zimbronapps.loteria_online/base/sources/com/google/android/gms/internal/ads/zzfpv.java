package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfpv extends zzibr implements zzidd {
    private static final zzfpv zzc;
    private static volatile zzidk zzd;
    private boolean zza;
    private boolean zzb;

    static {
        zzfpv zzfpvVar = new zzfpv();
        zzc = zzfpvVar;
        zzibr.zzbu(zzfpv.class, zzfpvVar);
    }

    private zzfpv() {
    }

    public static /* synthetic */ zzfpv zza() {
        return zzc;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzfpv();
        }
        if (ordinal == 4) {
            return new zzfpu(null);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzd;
        if (zzidkVar == null) {
            synchronized (zzfpv.class) {
                try {
                    zzidkVar = zzd;
                    if (zzidkVar == null) {
                        zzidkVar = new zzibm(zzc);
                        zzd = zzidkVar;
                    }
                } finally {
                }
            }
        }
        return zzidkVar;
    }
}
