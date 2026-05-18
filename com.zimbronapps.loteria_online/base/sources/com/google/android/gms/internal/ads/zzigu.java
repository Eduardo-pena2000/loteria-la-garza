package com.google.android.gms.internal.ads;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzigu extends zzibr implements zzidd {
    private static final zzigu zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb;
    private zzigt zzc;
    private zzigt zzd;

    static {
        zzigu zziguVar = new zzigu();
        zze = zziguVar;
        zzibr.zzbu(zzigu.class, zziguVar);
    }

    private zzigu() {
    }

    public static /* synthetic */ zzigu zzc() {
        return zze;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zza", "zzb", zzigr.zza, "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzigu();
        }
        if (ordinal == 4) {
            return new zzigq(null);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzf;
        if (zzidkVar == null) {
            synchronized (zzigu.class) {
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
