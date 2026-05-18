package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzub extends zznd implements zzoj {
    private static final zzub zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";
    private zzni zzg = zznd.zzy();
    private zznj zzh = zznd.zzA();
    private zztl zzi;

    static {
        zzub zzubVar = new zzub();
        zzb = zzubVar;
        zznd.zzI(zzub.class, zzubVar);
    }

    private zzub() {
    }

    public static /* bridge */ /* synthetic */ zzub zzg() {
        return zzb;
    }

    public static zzub zzi(byte[] bArr) throws zznn {
        return (zzub) zznd.zzx(zzb, bArr);
    }

    public final zztl zzf() {
        zztl zztlVar = this.zzi;
        return zztlVar == null ? zztl.zzg() : zztlVar;
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznd.zzF(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ȉ\u0002'\u0003%\u0004ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzub();
        }
        if (i2 == 4) {
            return new zzua(null);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zzub.class) {
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

    public final String zzj() {
        return this.zzf;
    }

    public final List zzk() {
        return this.zzh;
    }
}
