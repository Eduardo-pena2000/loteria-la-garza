package com.google.android.recaptcha.internal;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzma extends zzna implements zzoj {
    private static final zzma zzd;
    private static volatile zzoq zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private byte zzm = 2;

    static {
        zzma zzmaVar = new zzma();
        zzd = zzmaVar;
        zznd.zzI(zzma.class, zzmaVar);
    }

    private zzma() {
    }

    public static /* bridge */ /* synthetic */ zzma zzf() {
        return zzd;
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i2 == 2) {
            return new zzou(zzd, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005", new Object[]{"zzf", "zzg", zzlv.zza, "zzh", zzlu.zza, "zzi", zzly.zza, "zzj", zzlz.zza, "zzk", zzlx.zza, "zzl", zzlw.zza});
        }
        if (i2 == 3) {
            return new zzma();
        }
        if (i2 == 4) {
            return new zzlt(null);
        }
        if (i2 == 5) {
            return zzd;
        }
        if (i2 != 6) {
            this.zzm = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzoq zzoqVar = zze;
        if (zzoqVar == null) {
            synchronized (zzma.class) {
                try {
                    zzoqVar = zze;
                    if (zzoqVar == null) {
                        zzoqVar = new zzmy(zzd);
                        zze = zzoqVar;
                    }
                } finally {
                }
            }
        }
        return zzoqVar;
    }
}
