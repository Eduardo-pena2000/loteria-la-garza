package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfox extends zzibr implements zzidd {
    private static final zzfox zzc;
    private static volatile zzidk zzd;
    private int zza;
    private zzfou zzb;

    static {
        zzfox zzfoxVar = new zzfox();
        zzc = zzfoxVar;
        zzibr.zzbu(zzfox.class, zzfoxVar);
    }

    private zzfox() {
    }

    public static zzfow zza() {
        return (zzfow) zzc.zzbn();
    }

    public static /* synthetic */ zzfox zzc() {
        return zzc;
    }

    public final /* synthetic */ void zzb(zzfou zzfouVar) {
        zzfouVar.getClass();
        this.zzb = zzfouVar;
        this.zza |= 1;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzc, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzfox();
        }
        if (ordinal == 4) {
            return new zzfow(null);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzd;
        if (zzidkVar == null) {
            synchronized (zzfox.class) {
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
