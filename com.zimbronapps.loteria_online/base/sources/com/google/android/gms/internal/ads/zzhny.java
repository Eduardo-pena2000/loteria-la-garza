package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhny extends zzibr implements zzidd {
    private static final zzhny zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private zzhoa zzc;

    static {
        zzhny zzhnyVar = new zzhny();
        zzd = zzhnyVar;
        zzibr.zzbu(zzhny.class, zzhnyVar);
    }

    private zzhny() {
    }

    public static zzhny zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhny) zzibr.zzbT(zzd, zzianVar, zzibbVar);
    }

    public static zzhnx zzd() {
        return (zzhnx) zzd.zzbn();
    }

    public static /* synthetic */ zzhny zzh() {
        return zzd;
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhoa zzb() {
        zzhoa zzhoaVar = this.zzc;
        return zzhoaVar == null ? zzhoa.zzc() : zzhoaVar;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhny();
        }
        if (ordinal == 4) {
            return new zzhnx(null);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zze;
        if (zzidkVar == null) {
            synchronized (zzhny.class) {
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

    public final /* synthetic */ void zze(int i) {
        this.zzb = i;
    }

    public final /* synthetic */ void zzg(zzhoa zzhoaVar) {
        zzhoaVar.getClass();
        this.zzc = zzhoaVar;
        this.zza |= 1;
    }
}
