package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzrt extends zznd implements zzoj {
    private static final zzrt zzb;
    private static volatile zzoq zzd;
    private zznk zze = zznd.zzB();

    static {
        zzrt zzrtVar = new zzrt();
        zzb = zzrtVar;
        zznd.zzI(zzrt.class, zzrtVar);
    }

    private zzrt() {
    }

    public static /* bridge */ /* synthetic */ zzrt zzf() {
        return zzb;
    }

    public static zzrt zzg() {
        return zzb;
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznd.zzF(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzrt();
        }
        if (i2 == 4) {
            return new zzrs(null);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zzrt.class) {
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

    public final List zzi() {
        return this.zze;
    }
}
