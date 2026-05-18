package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhry extends zzibr implements zzidd {
    private static final zzhry zzc;
    private static volatile zzidk zzd;
    private int zza;
    private zzian zzb = zzian.zza;

    static {
        zzhry zzhryVar = new zzhry();
        zzc = zzhryVar;
        zzibr.zzbu(zzhry.class, zzhryVar);
    }

    private zzhry() {
    }

    public static zzhry zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhry) zzibr.zzbT(zzc, zzianVar, zzibbVar);
    }

    public static zzhrx zzd() {
        return (zzhrx) zzc.zzbn();
    }

    public static zzidk zze() {
        return zzc.zzbd();
    }

    public static /* synthetic */ zzhry zzh() {
        return zzc;
    }

    public final int zza() {
        return this.zza;
    }

    public final zzian zzb() {
        return this.zzb;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzhry();
        }
        if (ordinal == 4) {
            return new zzhrx(null);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzd;
        if (zzidkVar == null) {
            synchronized (zzhry.class) {
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

    public final /* synthetic */ void zzg(zzian zzianVar) {
        this.zzb = zzianVar;
    }
}
