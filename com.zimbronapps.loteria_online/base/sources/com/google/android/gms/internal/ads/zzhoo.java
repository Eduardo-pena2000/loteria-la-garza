package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhoo extends zzibr implements zzidd {
    private static final zzhoo zzd;
    private static volatile zzidk zze;
    private int zza;
    private zzhoq zzb;
    private int zzc;

    static {
        zzhoo zzhooVar = new zzhoo();
        zzd = zzhooVar;
        zzibr.zzbu(zzhoo.class, zzhooVar);
    }

    private zzhoo() {
    }

    public static zzhoo zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhoo) zzibr.zzbT(zzd, zzianVar, zzibbVar);
    }

    public static zzhon zzd() {
        return (zzhon) zzd.zzbn();
    }

    public static /* synthetic */ zzhoo zzh() {
        return zzd;
    }

    public final zzhoq zza() {
        zzhoq zzhoqVar = this.zzb;
        return zzhoqVar == null ? zzhoq.zzc() : zzhoqVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhoo();
        }
        if (ordinal == 4) {
            return new zzhon(null);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zze;
        if (zzidkVar == null) {
            synchronized (zzhoo.class) {
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

    public final /* synthetic */ void zze(zzhoq zzhoqVar) {
        zzhoqVar.getClass();
        this.zzb = zzhoqVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzg(int i) {
        this.zzc = i;
    }
}
