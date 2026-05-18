package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbcn extends zzibr implements zzidd {
    private static final zzbcn zzf;
    private static volatile zzidk zzg;
    private int zza;
    private zzbcr zzb;
    private zzian zzc = zzian.zza;
    private long zzd;
    private long zze;

    static {
        zzbcn zzbcnVar = new zzbcn();
        zzf = zzbcnVar;
        zzibr.zzbu(zzbcn.class, zzbcnVar);
    }

    private zzbcn() {
    }

    public static zzbcn zzd() {
        return zzf;
    }

    public static /* synthetic */ zzbcn zze() {
        return zzf;
    }

    public final zzbcr zza() {
        zzbcr zzbcrVar = this.zzb;
        return zzbcrVar == null ? zzbcr.zzc() : zzbcrVar;
    }

    public final zzian zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return this.zze;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzbcn();
        }
        if (ordinal == 4) {
            return new zzbcm(null);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzg;
        if (zzidkVar == null) {
            synchronized (zzbcn.class) {
                try {
                    zzidkVar = zzg;
                    if (zzidkVar == null) {
                        zzidkVar = new zzibm(zzf);
                        zzg = zzidkVar;
                    }
                } finally {
                }
            }
        }
        return zzidkVar;
    }
}
