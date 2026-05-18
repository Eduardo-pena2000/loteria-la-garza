package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzawx extends zzibr implements zzidd {
    private static final zzawx zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private long zzc = -1;

    static {
        zzawx zzawxVar = new zzawx();
        zzd = zzawxVar;
        zzibr.zzbu(zzawx.class, zzawxVar);
    }

    private zzawx() {
    }

    public static /* synthetic */ zzawx zza() {
        return zzd;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zza", "zzb", zzawk.zza, "zzc"});
        }
        if (ordinal == 3) {
            return new zzawx();
        }
        if (ordinal == 4) {
            return new zzaww(null);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zze;
        if (zzidkVar == null) {
            synchronized (zzawx.class) {
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
