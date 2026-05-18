package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhos extends zzibr implements zzidd {
    private static final zzhos zzc;
    private static volatile zzidk zzd;
    private int zza;
    private zzian zzb = zzian.zza;

    static {
        zzhos zzhosVar = new zzhos();
        zzc = zzhosVar;
        zzibr.zzbu(zzhos.class, zzhosVar);
    }

    private zzhos() {
    }

    public static zzhos zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhos) zzibr.zzbT(zzc, zzianVar, zzibbVar);
    }

    public static zzhor zzd() {
        return (zzhor) zzc.zzbn();
    }

    public static zzidk zze() {
        return zzc.zzbd();
    }

    public static /* synthetic */ zzhos zzh() {
        return zzc;
    }

    public final int zza() {
        return this.zza;
    }

    public final zzian zzb() {
        return this.zzb;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzhos();
        }
        if (ordinal == 4) {
            return new zzhor(null);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzd;
        if (zzidkVar == null) {
            synchronized (zzhos.class) {
                try {
                    zzidkVar = zzd;
                    if (zzidkVar == null) {
                        zzidkVar = new zzibm(zzc);
                        zzd = zzidkVar;
                    }
                } finally {
                }
            }
        }
        return zzidkVar;
    }

    public final /* synthetic */ void zzg(zzian zzianVar) {
        this.zzb = zzianVar;
    }
}
