package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbcj extends zzibr implements zzidd {
    private static final zzbcj zze;
    private static volatile zzidk zzf;
    private int zza;
    private zzbcp zzb;
    private zzian zzc;
    private zzian zzd;

    static {
        zzbcj zzbcjVar = new zzbcj();
        zze = zzbcjVar;
        zzibr.zzbu(zzbcj.class, zzbcjVar);
    }

    private zzbcj() {
        zzian zzianVar = zzian.zza;
        this.zzc = zzianVar;
        this.zzd = zzianVar;
    }

    public static zzbcj zzd(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzbcj) zzibr.zzbT(zze, zzianVar, zzibbVar);
    }

    public static zzbcj zze(byte[] bArr, zzibb zzibbVar) throws zzicg {
        return (zzbcj) zzibr.zzbV(zze, bArr, zzibbVar);
    }

    public static /* synthetic */ zzbcj zzg() {
        return zze;
    }

    public final zzbcp zza() {
        zzbcp zzbcpVar = this.zzb;
        return zzbcpVar == null ? zzbcp.zzj() : zzbcpVar;
    }

    public final zzian zzb() {
        return this.zzc;
    }

    public final zzian zzc() {
        return this.zzd;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzbcj();
        }
        if (ordinal == 4) {
            return new zzbci(null);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzf;
        if (zzidkVar == null) {
            synchronized (zzbcj.class) {
                try {
                    zzidkVar = zzf;
                    if (zzidkVar == null) {
                        zzidkVar = new zzibm(zze);
                        zzf = zzidkVar;
                    }
                } finally {
                }
            }
        }
        return zzidkVar;
    }
}
