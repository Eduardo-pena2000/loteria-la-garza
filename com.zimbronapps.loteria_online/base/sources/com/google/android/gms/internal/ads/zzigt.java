package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzigt extends zzibr implements zzidd {
    private static final zzigt zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb;
    private boolean zzc;
    private int zzd;

    static {
        zzigt zzigtVar = new zzigt();
        zze = zzigtVar;
        zzibr.zzbu(zzigt.class, zzigtVar);
    }

    private zzigt() {
    }

    public static /* synthetic */ zzigt zzc() {
        return zze;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            zzibx zzibxVar = zzigr.zza;
            return zzibr.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zza", "zzb", zzibxVar, "zzc", "zzd", zzibxVar});
        }
        if (ordinal == 3) {
            return new zzigt();
        }
        if (ordinal == 4) {
            return new zzigs(null);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzf;
        if (zzidkVar == null) {
            synchronized (zzigt.class) {
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
