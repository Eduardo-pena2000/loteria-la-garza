package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zziir extends zzibr implements zzidd {
    private static final zziir zzn;
    private static volatile zzidk zzo;
    private int zza;
    private int zzd;
    private boolean zzf;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private zziiw zzk;
    private zziiq zzm;
    private String zzb = "";
    private String zzc = "";
    private int zze = 1;
    private String zzg = "";
    private String zzl = "";

    static {
        zziir zziirVar = new zziir();
        zzn = zziirVar;
        zzibr.zzbu(zziir.class, zziirVar);
    }

    private zziir() {
    }

    public static /* synthetic */ zziir zzc() {
        return zzn;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bင\u0007\t᠌\b\nဉ\t\u000bဈ\n\fဉ\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", zzija.zza, "zze", zziiz.zza, "zzf", "zzg", "zzh", "zzi", "zzj", zziis.zza, "zzk", "zzl", "zzm"});
        }
        if (ordinal == 3) {
            return new zziir();
        }
        if (ordinal == 4) {
            return new zziio(null);
        }
        if (ordinal == 5) {
            return zzn;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzo;
        if (zzidkVar == null) {
            synchronized (zziir.class) {
                try {
                    zzidkVar = zzo;
                    if (zzidkVar == null) {
                        zzidkVar = new zzibm(zzn);
                        zzo = zzidkVar;
                    }
                } finally {
                }
            }
        }
        return zzidkVar;
    }
}
