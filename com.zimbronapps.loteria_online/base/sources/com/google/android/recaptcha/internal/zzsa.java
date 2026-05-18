package com.google.android.recaptcha.internal;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzsa extends zznd implements zzoj {
    private static final zzsa zzb;
    private static volatile zzoq zzd;
    private zzle zze = zzle.zzb;

    static {
        zzsa zzsaVar = new zzsa();
        zzb = zzsaVar;
        zznd.zzI(zzsa.class, zzsaVar);
    }

    private zzsa() {
    }

    public static /* bridge */ /* synthetic */ zzsa zzf() {
        return zzb;
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznd.zzF(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzsa();
        }
        if (i2 == 4) {
            return new zzrz(null);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zzsa.class) {
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
