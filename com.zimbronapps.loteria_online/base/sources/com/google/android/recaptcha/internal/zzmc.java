package com.google.android.recaptcha.internal;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzmc extends zznd implements zzoj {
    private static final zzmc zzb;
    private static volatile zzoq zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh = "";
    private int zzi;

    static {
        zzmc zzmcVar = new zzmc();
        zzb = zzmcVar;
        zznd.zzI(zzmc.class, zzmcVar);
    }

    private zzmc() {
    }

    public static /* bridge */ /* synthetic */ zzmc zzf() {
        return zzb;
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zznh zznhVar = zzlp.zza;
            return new zzou(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004᠌\u0003", new Object[]{"zze", "zzf", zznhVar, "zzg", zznhVar, "zzh", "zzi", zznhVar});
        }
        if (i2 == 3) {
            return new zzmc();
        }
        if (i2 == 4) {
            return new zzmb(null);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zzmc.class) {
                try {
                    zzoqVar = zzd;
                    if (zzoqVar == null) {
                        zzoqVar = new zzmy(zzb);
                        zzd = zzoqVar;
                    }
                } finally {
                }
            }
        }
        return zzoqVar;
    }
}
