package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhqf extends zzibr implements zzidd {
    private static final zzhqf zzd;
    private static volatile zzidk zze;
    private String zza = "";
    private zzian zzb = zzian.zza;
    private int zzc;

    static {
        zzhqf zzhqfVar = new zzhqf();
        zzd = zzhqfVar;
        zzibr.zzbu(zzhqf.class, zzhqfVar);
    }

    private zzhqf() {
    }

    public static zzhqf zzd(byte[] bArr, zzibb zzibbVar) throws zzicg {
        return (zzhqf) zzibr.zzbV(zzd, bArr, zzibbVar);
    }

    public static zzhqe zze() {
        return (zzhqe) zzd.zzbn();
    }

    public static zzhqe zzg(zzhqf zzhqfVar) {
        return (zzhqe) zzd.zzbo(zzhqfVar);
    }

    public static zzhqf zzh() {
        return zzd;
    }

    public static /* synthetic */ zzhqf zzl() {
        return zzd;
    }

    public final String zza() {
        return this.zza;
    }

    public final zzian zzb() {
        return this.zzb;
    }

    public final zzhqy zzc() {
        zzhqy zzb = zzhqy.zzb(this.zzc);
        return zzb == null ? zzhqy.zzg : zzb;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhqf();
        }
        if (ordinal == 4) {
            return new zzhqe(null);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zze;
        if (zzidkVar == null) {
            synchronized (zzhqf.class) {
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

    public final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void zzj(zzian zzianVar) {
        zzianVar.getClass();
        this.zzb = zzianVar;
    }

    public final /* synthetic */ void zzk(zzhqy zzhqyVar) {
        this.zzc = zzhqyVar.zza();
    }
}
