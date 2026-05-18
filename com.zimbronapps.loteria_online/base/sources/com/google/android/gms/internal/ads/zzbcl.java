package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbcl extends zzibr implements zzidd {
    private static final zzbcl zzd;
    private static volatile zzidk zze;
    private int zza;
    private zzbcn zzb;
    private zzian zzc = zzian.zza;

    static {
        zzbcl zzbclVar = new zzbcl();
        zzd = zzbclVar;
        zzibr.zzbu(zzbcl.class, zzbclVar);
    }

    private zzbcl() {
    }

    public static zzbcl zze() {
        return zzd;
    }

    public static /* synthetic */ zzbcl zzg() {
        return zzd;
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final zzbcn zzb() {
        zzbcn zzbcnVar = this.zzb;
        return zzbcnVar == null ? zzbcn.zzd() : zzbcnVar;
    }

    public final boolean zzc() {
        return (this.zza & 2) != 0;
    }

    public final zzian zzd() {
        return this.zzc;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzbcl();
        }
        if (ordinal == 4) {
            return new zzbck(null);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zze;
        if (zzidkVar == null) {
            synchronized (zzbcl.class) {
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
