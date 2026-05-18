package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhqx extends zzibr implements zzidd {
    private static final zzhqx zzd;
    private static volatile zzidk zze;
    private int zza;
    private String zzb = "";
    private zzhqf zzc;

    static {
        zzhqx zzhqxVar = new zzhqx();
        zzd = zzhqxVar;
        zzibr.zzbu(zzhqx.class, zzhqxVar);
    }

    private zzhqx() {
    }

    public static zzhqx zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhqx) zzibr.zzbT(zzd, zzianVar, zzibbVar);
    }

    public static zzhqw zzd() {
        return (zzhqw) zzd.zzbn();
    }

    public static zzhqx zze() {
        return zzd;
    }

    public static /* synthetic */ zzhqx zzi() {
        return zzd;
    }

    public final String zza() {
        return this.zzb;
    }

    public final zzhqf zzb() {
        zzhqf zzhqfVar = this.zzc;
        return zzhqfVar == null ? zzhqf.zzh() : zzhqfVar;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhqx();
        }
        if (ordinal == 4) {
            return new zzhqw(null);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zze;
        if (zzidkVar == null) {
            synchronized (zzhqx.class) {
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

    public final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void zzh(zzhqf zzhqfVar) {
        zzhqfVar.getClass();
        this.zzc = zzhqfVar;
        this.zza |= 1;
    }
}
