package com.google.android.gms.internal.measurement;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzfw extends zzmf implements zznn {
    private static final zzfw zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        zzfw zzfwVar = new zzfw();
        zzf = zzfwVar;
        zzmf.zzcp(zzfw.class, zzfwVar);
    }

    private zzfw() {
    }

    public static /* synthetic */ zzfw zza() {
        return zzf;
    }

    public final int zzb() {
        int zza = zzga.zza(this.zzd);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzc() {
        int zza = zzga.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzmk zzmkVar = zzfz.zza;
            return zzmf.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", zzmkVar, "zze", zzmkVar});
        }
        if (i2 == 3) {
            return new zzfw();
        }
        if (i2 == 4) {
            return new zzfv(null);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
