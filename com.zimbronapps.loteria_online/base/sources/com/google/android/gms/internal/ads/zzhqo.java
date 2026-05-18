package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhqo extends zzibr implements zzidd {
    private static final zzhqo zze;
    private static volatile zzidk zzf;
    private String zza = "";
    private int zzb;
    private int zzc;
    private int zzd;

    static {
        zzhqo zzhqoVar = new zzhqo();
        zze = zzhqoVar;
        zzibr.zzbu(zzhqo.class, zzhqoVar);
    }

    private zzhqo() {
    }

    public static zzhqn zza() {
        return (zzhqn) zze.zzbn();
    }

    public static /* synthetic */ zzhqo zze() {
        return zze;
    }

    public final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void zzc(int i) {
        this.zzc = i;
    }

    public final /* synthetic */ void zzd(zzhqy zzhqyVar) {
        this.zzd = zzhqyVar.zza();
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zze, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhqo();
        }
        if (ordinal == 4) {
            return new zzhqn(null);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzf;
        if (zzidkVar == null) {
            synchronized (zzhqo.class) {
                try {
                    zzidkVar = zzf;
                    if (zzidkVar == null) {
                        zzidkVar = new zzibm(zze);
                        zzf = zzidkVar;
                    }
                } finally {
                }
            }
        }
        return zzidkVar;
    }

    public final /* synthetic */ void zzg(int i) {
        this.zzb = zzhqd.zza(i);
    }
}
