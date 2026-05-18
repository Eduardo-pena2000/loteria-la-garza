package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhou extends zzibr implements zzidd {
    private static final zzhou zzc;
    private static volatile zzidk zzd;
    private int zza;
    private int zzb;

    static {
        zzhou zzhouVar = new zzhou();
        zzc = zzhouVar;
        zzibr.zzbu(zzhou.class, zzhouVar);
    }

    private zzhou() {
    }

    public static zzhou zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhou) zzibr.zzbT(zzc, zzianVar, zzibbVar);
    }

    public static zzhot zzd() {
        return (zzhot) zzc.zzbn();
    }

    public static /* synthetic */ zzhou zzg() {
        return zzc;
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzhou();
        }
        if (ordinal == 4) {
            return new zzhot(null);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzd;
        if (zzidkVar == null) {
            synchronized (zzhou.class) {
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

    public final /* synthetic */ void zze(int i) {
        this.zza = i;
    }
}
