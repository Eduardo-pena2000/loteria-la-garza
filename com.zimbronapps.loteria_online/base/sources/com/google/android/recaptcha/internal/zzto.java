package com.google.android.recaptcha.internal;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzto extends zznd implements zzoj {
    private static final zzto zzb;
    private static volatile zzoq zzd;
    private int zzh;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        zzto zztoVar = new zzto();
        zzb = zztoVar;
        zznd.zzI(zzto.class, zztoVar);
    }

    private zzto() {
    }

    public static /* synthetic */ void zzM(zzto zztoVar, String str) {
        str.getClass();
        zztoVar.zzi = str;
    }

    public static /* synthetic */ void zzN(zzto zztoVar, String str) {
        str.getClass();
        zztoVar.zze = str;
    }

    public static /* synthetic */ void zzO(zzto zztoVar, int i) {
        zztoVar.zzh = i - 2;
    }

    public static zztn zzf() {
        return (zztn) zzb.zzq();
    }

    public static /* bridge */ /* synthetic */ zzto zzg() {
        return zzb;
    }

    public static /* synthetic */ void zzi(zzto zztoVar, String str) {
        zztoVar.zzk = str;
    }

    public static /* synthetic */ void zzj(zzto zztoVar, String str) {
        str.getClass();
        zztoVar.zzj = str;
    }

    public static /* synthetic */ void zzk(zzto zztoVar, String str) {
        str.getClass();
        zztoVar.zzf = str;
    }

    public static /* synthetic */ void zzl(zzto zztoVar, String str) {
        zztoVar.zzg = "18.6.1";
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznd.zzF(zzb, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0006Ȉ\u0007Ȉ\bȈ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzto();
        }
        if (i2 == 4) {
            return new zztn(null);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zzto.class) {
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
