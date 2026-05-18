package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfwa extends zzibr implements zzidd {
    private static final zzfwa zzf;
    private static volatile zzidk zzg;
    private int zza;
    private zzibz zzb = zzibr.zzbC();
    private String zzc = "";
    private String zzd = "";
    private String zze = "";

    static {
        zzfwa zzfwaVar = new zzfwa();
        zzf = zzfwaVar;
        zzibr.zzbu(zzfwa.class, zzfwaVar);
    }

    private zzfwa() {
    }

    public static zzfvz zza() {
        return (zzfvz) zzf.zzbn();
    }

    public static /* synthetic */ zzfwa zzc() {
        return zzf;
    }

    public final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzc = str;
    }

    public final /* synthetic */ void zzd(int i) {
        zzibz zzibzVar = this.zzb;
        if (!zzibzVar.zza()) {
            this.zzb = zzibr.zzbD(zzibzVar);
        }
        this.zzb.zzi(2);
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zza", "zzb", zzfvy.zza, "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzfwa();
        }
        if (ordinal == 4) {
            return new zzfvz(null);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzg;
        if (zzidkVar == null) {
            synchronized (zzfwa.class) {
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
}
