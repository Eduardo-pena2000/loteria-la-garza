package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzift extends zzibr implements zzidd {
    private static final zzift zzy;
    private static volatile zzidk zzz;
    private int zza;
    private int zzb;
    private boolean zzc;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzp;
    private long zzu;
    private boolean zzw;
    private String zzd = "";
    private zzicd zze = zzibr.zzbM();
    private String zzj = "";
    private zzicd zzo = zzibr.zzbM();
    private zzibz zzv = zzibr.zzbC();
    private zzibz zzx = zzibr.zzbC();

    static {
        zzift zziftVar = new zzift();
        zzy = zziftVar;
        zzibr.zzbu(zzift.class, zziftVar);
    }

    private zzift() {
    }

    public static /* synthetic */ zzift zzc() {
        return zzy;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzy, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zza", "zzb", zzifs.zza, "zzc", "zzd", "zze", "zzf", zzifq.zza, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzifp.class, "zzp", "zzu", "zzv", zzifh.zza(), "zzw", "zzx", zzifr.zza});
        }
        if (ordinal == 3) {
            return new zzift();
        }
        if (ordinal == 4) {
            return new zzifm(null);
        }
        if (ordinal == 5) {
            return zzy;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzz;
        if (zzidkVar == null) {
            synchronized (zzift.class) {
                try {
                    zzidkVar = zzz;
                    if (zzidkVar == null) {
                        zzidkVar = new zzibm(zzy);
                        zzz = zzidkVar;
                    }
                } finally {
                }
            }
        }
        return zzidkVar;
    }
}
