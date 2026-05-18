package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfpe extends zzibr implements zzidd {
    private static final zzfpe zzc;
    private static volatile zzidk zzd;
    private String zza = "";
    private int zzb;

    static {
        zzfpe zzfpeVar = new zzfpe();
        zzc = zzfpeVar;
        zzibr.zzbu(zzfpe.class, zzfpeVar);
    }

    private zzfpe() {
    }

    public static /* synthetic */ zzfpe zza() {
        return zzc;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzfpe();
        }
        if (ordinal == 4) {
            return new zzfpd(null);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzd;
        if (zzidkVar == null) {
            synchronized (zzfpe.class) {
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
