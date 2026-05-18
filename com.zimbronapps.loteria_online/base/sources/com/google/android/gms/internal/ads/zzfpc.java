package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfpc extends zzibr implements zzidd {
    private static final zzfpc zzi;
    private static volatile zzidk zzj;
    private long zzb;
    private long zzc;
    private boolean zzd;
    private long zze;
    private long zzf;
    private int zzh;
    private String zza = "";
    private String zzg = "";

    static {
        zzfpc zzfpcVar = new zzfpc();
        zzi = zzfpcVar;
        zzibr.zzbu(zzfpc.class, zzfpcVar);
    }

    private zzfpc() {
    }

    public static zzfpb zza() {
        return (zzfpb) zzi.zzbn();
    }

    public static /* synthetic */ zzfpc zzj() {
        return zzi;
    }

    public final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void zzc(long j) {
        this.zzb = j;
    }

    public final /* synthetic */ void zzd(long j) {
        this.zzc = j;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0007\u0005\u0002\u0006\u0002\u0007Ȉ\b\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (ordinal == 3) {
            return new zzfpc();
        }
        if (ordinal == 4) {
            return new zzfpb(null);
        }
        if (ordinal == 5) {
            return zzi;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzj;
        if (zzidkVar == null) {
            synchronized (zzfpc.class) {
                try {
                    zzidkVar = zzj;
                    if (zzidkVar == null) {
                        zzidkVar = new zzibm(zzi);
                        zzj = zzidkVar;
                    }
                } finally {
                }
            }
        }
        return zzidkVar;
    }

    public final /* synthetic */ void zze(boolean z) {
        this.zzd = z;
    }

    public final /* synthetic */ void zzg(long j) {
        this.zze = j;
    }

    public final /* synthetic */ void zzh(long j) {
        this.zzf = j;
    }

    public final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zzg = str;
    }

    public final /* synthetic */ void zzk(int i) {
        this.zzh = i - 2;
    }
}
