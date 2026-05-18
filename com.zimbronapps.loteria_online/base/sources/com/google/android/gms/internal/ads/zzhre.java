package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhre extends zzibr implements zzidd {
    private static final zzhre zzb;
    private static volatile zzidk zzc;
    private int zza;

    static {
        zzhre zzhreVar = new zzhre();
        zzb = zzhreVar;
        zzibr.zzbu(zzhre.class, zzhreVar);
    }

    private zzhre() {
    }

    public static zzhrd zzb() {
        return (zzhrd) zzb.zzbn();
    }

    public static zzhre zzc() {
        return zzb;
    }

    public static /* synthetic */ zzhre zze() {
        return zzb;
    }

    public final zzhpt zza() {
        zzhpt zzb2 = zzhpt.zzb(this.zza);
        return zzb2 == null ? zzhpt.UNRECOGNIZED : zzb2;
    }

    public final /* synthetic */ void zzd(zzhpt zzhptVar) {
        this.zza = zzhptVar.zza();
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new zzhre();
        }
        if (ordinal == 4) {
            return new zzhrd(null);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzc;
        if (zzidkVar == null) {
            synchronized (zzhre.class) {
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
