package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zziiq extends zzibr implements zzidd {
    private static final zziiq zze;
    private static volatile zzidk zzf;
    private int zza;
    private String zzb = "";
    private boolean zzc;
    private boolean zzd;

    static {
        zziiq zziiqVar = new zziiq();
        zze = zziiqVar;
        zzibr.zzbu(zziiq.class, zziiqVar);
    }

    private zziiq() {
    }

    public static /* synthetic */ zziiq zzc() {
        return zze;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zziiq();
        }
        if (ordinal == 4) {
            return new zziip(null);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzf;
        if (zzidkVar == null) {
            synchronized (zziiq.class) {
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
