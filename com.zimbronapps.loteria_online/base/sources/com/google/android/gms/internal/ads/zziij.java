package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zziij extends zzibr implements zzidd {
    private static final zziij zzp;
    private static volatile zzidk zzu;
    private int zza;
    private boolean zzh;
    private double zzi;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private String zzb = "";
    private String zzc = "";
    private int zzd = 4;
    private zzicd zze = zzibr.zzbM();
    private String zzf = "";
    private String zzg = "";
    private zzicd zzj = zzibr.zzbM();

    static {
        zziij zziijVar = new zziij();
        zzp = zziijVar;
        zzibr.zzbu(zziij.class, zziijVar);
    }

    private zziij() {
    }

    public static /* synthetic */ zziij zzc() {
        return zzp;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzp, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zza", "zzb", "zzd", zziii.zza, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zziih.class, "zzc", "zzk", zziif.zza, "zzl", "zzm", "zzn", "zzo"});
        }
        if (ordinal == 3) {
            return new zziij();
        }
        if (ordinal == 4) {
            return new zziie(null);
        }
        if (ordinal == 5) {
            return zzp;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzu;
        if (zzidkVar == null) {
            synchronized (zziij.class) {
                try {
                    zzidkVar = zzu;
                    if (zzidkVar == null) {
                        zzidkVar = new zzibm(zzp);
                        zzu = zzidkVar;
                    }
                } finally {
                }
            }
        }
        return zzidkVar;
    }
}
