package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgdk extends zzibr implements zzidd {
    private static final zzgdk zzc;
    private static volatile zzidk zzd;
    private int zza;
    private zzavk zzb;

    static {
        zzgdk zzgdkVar = new zzgdk();
        zzc = zzgdkVar;
        zzibr.zzbu(zzgdk.class, zzgdkVar);
    }

    private zzgdk() {
    }

    public static zzgdj zza() {
        return (zzgdj) zzc.zzbn();
    }

    public static /* synthetic */ zzgdk zzc() {
        return zzc;
    }

    public final /* synthetic */ void zzb(zzavk zzavkVar) {
        zzavkVar.getClass();
        this.zzb = zzavkVar;
        this.zza |= 1;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzc, "\u0004\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzgdk();
        }
        if (ordinal == 4) {
            return new zzgdj(null);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzd;
        if (zzidkVar == null) {
            synchronized (zzgdk.class) {
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
