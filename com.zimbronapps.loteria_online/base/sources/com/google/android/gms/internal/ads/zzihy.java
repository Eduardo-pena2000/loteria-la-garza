package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzihy extends zzibr implements zzidd {
    private static final zzihy zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private String zzc = "";

    static {
        zzihy zzihyVar = new zzihy();
        zzd = zzihyVar;
        zzibr.zzbu(zzihy.class, zzihyVar);
    }

    private zzihy() {
    }

    public static /* synthetic */ zzihy zzc() {
        return zzd;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zza", "zzb", zzihx.zza, "zzc"});
        }
        if (ordinal == 3) {
            return new zzihy();
        }
        if (ordinal == 4) {
            return new zzihw(null);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zze;
        if (zzidkVar == null) {
            synchronized (zzihy.class) {
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
