package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgdu extends zzibr implements zzidd {
    private static final zzgdu zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb = 0;
    private Object zzc;
    private int zzd;

    static {
        zzgdu zzgduVar = new zzgdu();
        zze = zzgduVar;
        zzibr.zzbu(zzgdu.class, zzgduVar);
    }

    private zzgdu() {
    }

    public static zzgdu zzd(zzian zzianVar) throws zzicg {
        return (zzgdu) zzibr.zzbS(zze, zzianVar);
    }

    public static zzgdt zze() {
        return (zzgdt) zze.zzbn();
    }

    public static zzgdu zzg() {
        return zze;
    }

    public static /* synthetic */ zzgdu zzk() {
        return zze;
    }

    public final zzbcp zza() {
        return this.zzb == 1 ? (zzbcp) this.zzc : zzbcp.zzj();
    }

    public final zzbcn zzb() {
        return this.zzb == 2 ? (zzbcn) this.zzc : zzbcn.zzd();
    }

    public final zzbch zzc() {
        zzbch zzb = zzbch.zzb(this.zzd);
        return zzb == null ? zzbch.zza : zzb;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zze, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000", new Object[]{"zzc", "zzb", "zza", zzbcp.class, zzbcn.class, "zzd", zzbch.zzc()});
        }
        if (ordinal == 3) {
            return new zzgdu();
        }
        if (ordinal == 4) {
            return new zzgdt(null);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzf;
        if (zzidkVar == null) {
            synchronized (zzgdu.class) {
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

    public final /* synthetic */ void zzh(zzbcp zzbcpVar) {
        zzbcpVar.getClass();
        this.zzc = zzbcpVar;
        this.zzb = 1;
    }

    public final /* synthetic */ void zzi(zzbcn zzbcnVar) {
        zzbcnVar.getClass();
        this.zzc = zzbcnVar;
        this.zzb = 2;
    }

    public final /* synthetic */ void zzj(zzbch zzbchVar) {
        this.zzd = zzbchVar.zza();
        this.zza |= 1;
    }
}
