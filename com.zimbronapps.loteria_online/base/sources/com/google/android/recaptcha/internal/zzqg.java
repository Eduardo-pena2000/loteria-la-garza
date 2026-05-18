package com.google.android.recaptcha.internal;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzqg extends zznd implements zzoj {
    private static final zzqg zzb;
    private static volatile zzoq zzd;
    private int zze;
    private zzml zzf;
    private int zzg;

    static {
        zzqg zzqgVar = new zzqg();
        zzb = zzqgVar;
        zznd.zzI(zzqg.class, zzqgVar);
    }

    private zzqg() {
    }

    public static /* bridge */ /* synthetic */ zzqg zzf() {
        return zzb;
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznd.zzF(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzqg();
        }
        if (i2 == 4) {
            return new zzqe(null);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zzqg.class) {
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
