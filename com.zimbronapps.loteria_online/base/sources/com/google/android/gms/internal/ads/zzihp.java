package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzihp extends zzibr implements zzidd {
    private static final zzihp zzf;
    private static volatile zzidk zzg;
    private int zza;
    private String zzb = "";
    private zzicd zzc = zzibr.zzbM();
    private zzicd zzd = zzibr.zzbM();
    private String zze = "";

    static {
        zzihp zzihpVar = new zzihp();
        zzf = zzihpVar;
        zzibr.zzbu(zzihp.class, zzihpVar);
    }

    private zzihp() {
    }

    public static /* synthetic */ zzihp zzc() {
        return zzf;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzihp();
        }
        if (ordinal == 4) {
            return new zziho(null);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzg;
        if (zzidkVar == null) {
            synchronized (zzihp.class) {
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
