package com.google.android.gms.internal.ads;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhra extends zzibr implements zzidd {
    public static final /* synthetic */ int zza = 0;
    private static final zzhra zzd;
    private static volatile zzidk zze;
    private String zzb = "";
    private zzicd zzc = zzibr.zzbM();

    static {
        zzhra zzhraVar = new zzhra();
        zzd = zzhraVar;
        zzibr.zzbu(zzhra.class, zzhraVar);
    }

    private zzhra() {
    }

    public static /* synthetic */ zzhra zza() {
        return zzd;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zzc", zzhqh.class});
        }
        if (ordinal == 3) {
            return new zzhra();
        }
        if (ordinal == 4) {
            return new zzhqz(null);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zze;
        if (zzidkVar == null) {
            synchronized (zzhra.class) {
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
