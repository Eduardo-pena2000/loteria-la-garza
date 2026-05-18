package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhok extends zzibr implements zzidd {
    private static final zzhok zzb;
    private static volatile zzidk zzc;
    private int zza;

    static {
        zzhok zzhokVar = new zzhok();
        zzb = zzhokVar;
        zzibr.zzbu(zzhok.class, zzhokVar);
    }

    private zzhok() {
    }

    public static zzhoj zzb() {
        return (zzhoj) zzb.zzbn();
    }

    public static zzhok zzc() {
        return zzb;
    }

    public static /* synthetic */ zzhok zze() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    public final /* synthetic */ void zzd(int i) {
        this.zza = i;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new zzhok();
        }
        if (ordinal == 4) {
            return new zzhoj(null);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzc;
        if (zzidkVar == null) {
            synchronized (zzhok.class) {
                try {
                    zzidkVar = zzc;
                    if (zzidkVar == null) {
                        zzidkVar = new zzibm(zzb);
                        zzc = zzidkVar;
                    }
                } finally {
                }
            }
        }
        return zzidkVar;
    }
}
