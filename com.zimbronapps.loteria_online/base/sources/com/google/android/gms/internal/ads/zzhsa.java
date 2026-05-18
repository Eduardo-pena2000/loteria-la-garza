package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhsa extends zzibr implements zzidd {
    private static final zzhsa zzb;
    private static volatile zzidk zzc;
    private int zza;

    static {
        zzhsa zzhsaVar = new zzhsa();
        zzb = zzhsaVar;
        zzibr.zzbu(zzhsa.class, zzhsaVar);
    }

    private zzhsa() {
    }

    public static zzhsa zzb(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhsa) zzibr.zzbT(zzb, zzianVar, zzibbVar);
    }

    public static zzhsa zzc() {
        return zzb;
    }

    public static /* synthetic */ zzhsa zzd() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new zzhsa();
        }
        if (ordinal == 4) {
            return new zzhrz(null);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzc;
        if (zzidkVar == null) {
            synchronized (zzhsa.class) {
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
