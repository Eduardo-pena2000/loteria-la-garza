package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzifd extends zzibr implements zzidd {
    private static final zzifd zzd;
    private static volatile zzidk zze;
    private int zza;
    private String zzb = "";
    private zzibz zzc = zzibr.zzbC();

    static {
        zzifd zzifdVar = new zzifd();
        zzd = zzifdVar;
        zzibr.zzbu(zzifd.class, zzifdVar);
    }

    private zzifd() {
    }

    public static zzifc zzc() {
        return (zzifc) zzd.zzbn();
    }

    public static /* synthetic */ zzifd zzd() {
        return zzd;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzd, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003'", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzifd();
        }
        if (ordinal == 4) {
            return new zzifc(null);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zze;
        if (zzidkVar == null) {
            synchronized (zzifd.class) {
                try {
                    zzidkVar = zze;
                    if (zzidkVar == null) {
                        zzidkVar = new zzibm(zzd);
                        zze = zzidkVar;
                    }
                } finally {
                }
            }
        }
        return zzidkVar;
    }

    public final /* synthetic */ void zze(int i) {
        this.zza = 15;
    }
}
