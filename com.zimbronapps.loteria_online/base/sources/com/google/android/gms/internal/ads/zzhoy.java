package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhoy extends zzibr implements zzidd {
    private static final zzhoy zzc;
    private static volatile zzidk zzd;
    private int zza;
    private int zzb;

    static {
        zzhoy zzhoyVar = new zzhoy();
        zzc = zzhoyVar;
        zzibr.zzbu(zzhoy.class, zzhoyVar);
    }

    private zzhoy() {
    }

    public static zzhoy zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhoy) zzibr.zzbT(zzc, zzianVar, zzibbVar);
    }

    public static zzhox zzd() {
        return (zzhox) zzc.zzbn();
    }

    public static /* synthetic */ zzhoy zzg() {
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
            return zzibr.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzb", "zza"});
        }
        if (ordinal == 3) {
            return new zzhoy();
        }
        if (ordinal == 4) {
            return new zzhox(null);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzd;
        if (zzidkVar == null) {
            synchronized (zzhoy.class) {
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
