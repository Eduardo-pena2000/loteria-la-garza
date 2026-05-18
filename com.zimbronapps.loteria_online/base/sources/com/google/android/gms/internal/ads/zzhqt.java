package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhqt extends zzibr implements zzidd {
    private static final zzhqt zzb;
    private static volatile zzidk zzc;
    private String zza = "";

    static {
        zzhqt zzhqtVar = new zzhqt();
        zzb = zzhqtVar;
        zzibr.zzbu(zzhqt.class, zzhqtVar);
    }

    private zzhqt() {
    }

    public static zzhqt zzb(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhqt) zzibr.zzbT(zzb, zzianVar, zzibbVar);
    }

    public static zzhqs zzc() {
        return (zzhqs) zzb.zzbn();
    }

    public static zzhqt zzd() {
        return zzb;
    }

    public static /* synthetic */ zzhqt zzg() {
        return zzb;
    }

    public final String zza() {
        return this.zza;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new zzhqt();
        }
        if (ordinal == 4) {
            return new zzhqs(null);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzc;
        if (zzidkVar == null) {
            synchronized (zzhqt.class) {
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

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza = str;
    }
}
