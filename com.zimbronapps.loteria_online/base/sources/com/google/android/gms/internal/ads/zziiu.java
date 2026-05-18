package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zziiu extends zzibr implements zzidd {
    private static final zziiu zzd;
    private static volatile zzidk zze;
    private int zza;
    private String zzb = "";
    private int zzc;

    static {
        zziiu zziiuVar = new zziiu();
        zzd = zziiuVar;
        zzibr.zzbu(zziiu.class, zziiuVar);
    }

    private zziiu() {
    }

    public static /* synthetic */ zziiu zzc() {
        return zzd;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", "zzc", zzijh.zza});
        }
        if (ordinal == 3) {
            return new zziiu();
        }
        if (ordinal == 4) {
            return new zziit(null);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zze;
        if (zzidkVar == null) {
            synchronized (zziiu.class) {
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
