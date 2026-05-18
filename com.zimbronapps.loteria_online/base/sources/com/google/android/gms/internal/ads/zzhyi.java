package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhyi extends zzibr implements zzidd {
    private static final zzhyi zzf;
    private static volatile zzidk zzg;
    private int zza;
    private zzian zzb = zzian.zza;
    private String zzc = "";
    private zzicd zzd = zzibr.zzbM();
    private boolean zze;

    static {
        zzhyi zzhyiVar = new zzhyi();
        zzf = zzhyiVar;
        zzibr.zzbu(zzhyi.class, zzhyiVar);
    }

    private zzhyi() {
    }

    public static /* synthetic */ zzhyi zza() {
        return zzf;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ည\u0000\u0002\u001c\u0003ဇ\u0002\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzd", "zze", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhyi();
        }
        if (ordinal == 4) {
            return new zzhyh(null);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzg;
        if (zzidkVar == null) {
            synchronized (zzhyi.class) {
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
