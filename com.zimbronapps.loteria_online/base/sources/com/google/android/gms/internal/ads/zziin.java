package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zziin extends zzibr implements zzidd {
    private static final zziin zzb;
    private static volatile zzidk zzc;
    private zzicd zza = zzibr.zzbM();

    static {
        zziin zziinVar = new zziin();
        zzb = zziinVar;
        zzibr.zzbu(zziin.class, zziinVar);
    }

    private zziin() {
    }

    public static /* synthetic */ zziin zzc() {
        return zzb;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zziil.class});
        }
        if (ordinal == 3) {
            return new zziin();
        }
        if (ordinal == 4) {
            return new zziim(null);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzc;
        if (zzidkVar == null) {
            synchronized (zziin.class) {
                try {
                    zzidkVar = zzc;
                    if (zzidkVar == null) {
                        zzidkVar = new zzibm(zzb);
                        zzc = zzidkVar;
                    }
                } finally {
                }
            }
        }
        return zzidkVar;
    }
}
