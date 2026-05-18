package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbcr extends zzibr implements zzidd {
    private static final zzbcr zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzbcr zzbcrVar = new zzbcr();
        zzd = zzbcrVar;
        zzibr.zzbu(zzbcr.class, zzbcrVar);
    }

    private zzbcr() {
    }

    public static zzbcr zzc() {
        return zzd;
    }

    public static /* synthetic */ zzbcr zzd() {
        return zzd;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzbcr();
        }
        if (ordinal == 4) {
            return new zzbcq(null);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zze;
        if (zzidkVar == null) {
            synchronized (zzbcr.class) {
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
}
