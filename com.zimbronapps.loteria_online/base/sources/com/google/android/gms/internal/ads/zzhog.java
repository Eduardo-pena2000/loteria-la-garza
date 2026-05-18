package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhog extends zzibr implements zzidd {
    private static final zzhog zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb;
    private zzhok zzc;
    private zzian zzd = zzian.zza;

    static {
        zzhog zzhogVar = new zzhog();
        zze = zzhogVar;
        zzibr.zzbu(zzhog.class, zzhogVar);
    }

    private zzhog() {
    }

    public static zzhof zzd() {
        return (zzhof) zze.zzbn();
    }

    public static zzhog zze() {
        return zze;
    }

    public static /* synthetic */ zzhog zzi() {
        return zze;
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhok zzb() {
        zzhok zzhokVar = this.zzc;
        return zzhokVar == null ? zzhok.zzc() : zzhokVar;
    }

    public final zzian zzc() {
        return this.zzd;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhog();
        }
        if (ordinal == 4) {
            return new zzhof(null);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzf;
        if (zzidkVar == null) {
            synchronized (zzhog.class) {
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

    public final /* synthetic */ void zzg(zzhok zzhokVar) {
        zzhokVar.getClass();
        this.zzc = zzhokVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzh(zzian zzianVar) {
        this.zzd = zzianVar;
    }
}
