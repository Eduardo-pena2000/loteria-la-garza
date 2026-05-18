package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzihf extends zzibr implements zzidd {
    private static final zzihf zzf;
    private static volatile zzidk zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private zzian zzd;
    private zzian zze;

    static {
        zzihf zzihfVar = new zzihf();
        zzf = zzihfVar;
        zzibr.zzbu(zzihf.class, zzihfVar);
    }

    private zzihf() {
        zzian zzianVar = zzian.zza;
        this.zzd = zzianVar;
        this.zze = zzianVar;
    }

    public static zzihd zzc() {
        return (zzihd) zzf.zzbn();
    }

    public static /* synthetic */ zzihf zzg() {
        return zzf;
    }

    public final /* synthetic */ void zzd(String str) {
        this.zza |= 2;
        this.zzc = "image/png";
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", zzihe.zza, "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzihf();
        }
        if (ordinal == 4) {
            return new zzihd(null);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzg;
        if (zzidkVar == null) {
            synchronized (zzihf.class) {
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

    public final /* synthetic */ void zze(zzian zzianVar) {
        zzianVar.getClass();
        this.zza |= 4;
        this.zzd = zzianVar;
    }

    public final /* synthetic */ void zzh(int i) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }
}
