package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhrm extends zzibr implements zzidd {
    private static final zzhrm zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhrm zzhrmVar = new zzhrm();
        zzd = zzhrmVar;
        zzibr.zzbu(zzhrm.class, zzhrmVar);
    }

    private zzhrm() {
    }

    public static zzhrl zzd() {
        return (zzhrl) zzd.zzbn();
    }

    public static zzhrm zze() {
        return zzd;
    }

    public static /* synthetic */ zzhrm zzj() {
        return zzd;
    }

    public final zzhpt zza() {
        zzhpt zzb = zzhpt.zzb(this.zza);
        return zzb == null ? zzhpt.UNRECOGNIZED : zzb;
    }

    public final zzhpt zzb() {
        zzhpt zzb = zzhpt.zzb(this.zzb);
        return zzb == null ? zzhpt.UNRECOGNIZED : zzb;
    }

    public final int zzc() {
        return this.zzc;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhrm();
        }
        if (ordinal == 4) {
            return new zzhrl(null);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zze;
        if (zzidkVar == null) {
            synchronized (zzhrm.class) {
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

    public final /* synthetic */ void zzg(zzhpt zzhptVar) {
        this.zza = zzhptVar.zza();
    }

    public final /* synthetic */ void zzh(zzhpt zzhptVar) {
        this.zzb = zzhptVar.zza();
    }

    public final /* synthetic */ void zzi(int i) {
        this.zzc = i;
    }
}
