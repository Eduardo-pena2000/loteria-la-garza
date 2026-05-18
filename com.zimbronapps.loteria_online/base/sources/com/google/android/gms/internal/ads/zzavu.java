package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzavu extends zzibr implements zzidd {
    private static final zzavu zzc;
    private static volatile zzidk zzd;
    private int zza;
    private int zzb = 2;

    static {
        zzavu zzavuVar = new zzavu();
        zzc = zzavuVar;
        zzibr.zzbu(zzavu.class, zzavuVar);
    }

    private zzavu() {
    }

    public static /* synthetic */ zzavu zza() {
        return zzc;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzc, "\u0004\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zza", "zzb", zzavv.zza});
        }
        if (ordinal == 3) {
            return new zzavu();
        }
        if (ordinal == 4) {
            return new zzavt(null);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzd;
        if (zzidkVar == null) {
            synchronized (zzavu.class) {
                try {
                    zzidkVar = zzd;
                    if (zzidkVar == null) {
                        zzidkVar = new zzibm(zzc);
                        zzd = zzidkVar;
                    }
                } finally {
                }
            }
        }
        return zzidkVar;
    }
}
