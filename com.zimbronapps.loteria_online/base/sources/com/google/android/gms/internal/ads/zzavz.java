package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzavz extends zzibr implements zzidd {
    private static final zzavz zzg;
    private static volatile zzidk zzh;
    private int zza;
    private boolean zzb;
    private int zzc = 5000;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzavz zzavzVar = new zzavz();
        zzg = zzavzVar;
        zzibr.zzbu(zzavz.class, zzavzVar);
    }

    private zzavz() {
    }

    public static zzavz zzg() {
        return zzg;
    }

    public static /* synthetic */ zzavz zzh() {
        return zzg;
    }

    public final boolean zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final boolean zzc() {
        return this.zzd;
    }

    public final boolean zzd() {
        return this.zze;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzg, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zzavz();
        }
        if (ordinal == 4) {
            return new zzavy(null);
        }
        if (ordinal == 5) {
            return zzg;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzh;
        if (zzidkVar == null) {
            synchronized (zzavz.class) {
                try {
                    zzidkVar = zzh;
                    if (zzidkVar == null) {
                        zzidkVar = new zzibm(zzg);
                        zzh = zzidkVar;
                    }
                } finally {
                }
            }
        }
        return zzidkVar;
    }

    public final boolean zze() {
        return this.zzf;
    }
}
