package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgds extends zzibr implements zzidd {
    private static final zzgds zzf;
    private static volatile zzidk zzg;
    private int zza;
    private zzgdu zzb;
    private zzian zzc;
    private zzian zzd;
    private int zze;

    static {
        zzgds zzgdsVar = new zzgds();
        zzf = zzgdsVar;
        zzibr.zzbu(zzgds.class, zzgdsVar);
    }

    private zzgds() {
        zzian zzianVar = zzian.zza;
        this.zzc = zzianVar;
        this.zzd = zzianVar;
    }

    public static zzgdr zzd() {
        return (zzgdr) zzf.zzbn();
    }

    public static /* synthetic */ zzgds zzi() {
        return zzf;
    }

    public final zzgdu zza() {
        zzgdu zzgduVar = this.zzb;
        return zzgduVar == null ? zzgdu.zzg() : zzgduVar;
    }

    public final zzian zzb() {
        return this.zzc;
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
            return zzibr.zzbv(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", zzgei.zza});
        }
        if (ordinal == 3) {
            return new zzgds();
        }
        if (ordinal == 4) {
            return new zzgdr(null);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzg;
        if (zzidkVar == null) {
            synchronized (zzgds.class) {
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

    public final /* synthetic */ void zze(zzgdu zzgduVar) {
        zzgduVar.getClass();
        this.zzb = zzgduVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzg(zzian zzianVar) {
        zzianVar.getClass();
        this.zza |= 2;
        this.zzc = zzianVar;
    }

    public final /* synthetic */ void zzh(zzian zzianVar) {
        zzianVar.getClass();
        this.zza |= 4;
        this.zzd = zzianVar;
    }

    public final int zzj() {
        int zza = zzgej.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final /* synthetic */ void zzk(int i) {
        this.zze = i - 1;
        this.zza |= 8;
    }
}
