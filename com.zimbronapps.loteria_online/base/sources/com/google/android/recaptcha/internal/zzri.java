package com.google.android.recaptcha.internal;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzri extends zznd implements zzoj {
    private static final zzri zzb;
    private static volatile zzoq zzd;
    private int zze;
    private int zzf = 0;
    private Object zzg;
    private zzrl zzh;
    private int zzi;
    private zzqq zzj;
    private zzqz zzk;

    static {
        zzri zzriVar = new zzri();
        zzb = zzriVar;
        zznd.zzI(zzri.class, zzriVar);
    }

    private zzri() {
    }

    public static /* bridge */ /* synthetic */ zzri zzf() {
        return zzb;
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznd.zzF(zzb, "\u0000,\u0001\u0001\u0001,,\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001\u0004?\u0000\u0005?\u0000\u0006?\u0000\u0007?\u0000\b?\u0000\t?\u0000\n?\u0000\u000b?\u0000\f?\u0000\r?\u0000\u000e?\u0000\u000f?\u0000\u0010?\u0000\u0011?\u0000\u0012?\u0000\u0013?\u0000\u0014?\u0000\u0015?\u0000\u0016?\u0000\u0017?\u0000\u0018?\u0000\u0019ဉ\u0002\u001a?\u0000\u001b?\u0000\u001c?\u0000\u001d?\u0000\u001e?\u0000\u001f?\u0000 ?\u0000!?\u0000\"?\u0000#?\u0000$?\u0000%?\u0000&?\u0000'?\u0000(?\u0000)?\u0000*?\u0000+?\u0000,?\u0000", new Object[]{"zzg", "zzf", "zze", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzri();
        }
        if (i2 == 4) {
            return new zzrg(null);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zzri.class) {
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
