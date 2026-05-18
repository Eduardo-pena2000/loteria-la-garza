package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzigb extends zzibr implements zzidd {
    private static final zzigb zzf;
    private static volatile zzidk zzg;
    private int zza;
    private zziga zzc;
    private long zzd;
    private String zzb = "";
    private String zze = "";

    static {
        zzigb zzigbVar = new zzigb();
        zzf = zzigbVar;
        zzibr.zzbu(zzigb.class, zzigbVar);
    }

    private zzigb() {
    }

    public static /* synthetic */ zzigb zzc() {
        return zzf;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzigb();
        }
        if (ordinal == 4) {
            return new zzify(null);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzg;
        if (zzidkVar == null) {
            synchronized (zzigb.class) {
                try {
                    zzidkVar = zzg;
                    if (zzidkVar == null) {
                        zzidkVar = new zzibm(zzf);
                        zzg = zzidkVar;
                    }
                } finally {
                }
            }
        }
        return zzidkVar;
    }
}
