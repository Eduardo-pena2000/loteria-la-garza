package com.google.android.gms.internal.measurement;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzgt extends zzmf implements zznn {
    private static final zzgt zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        zzgt zzgtVar = new zzgt();
        zzf = zzgtVar;
        zzmf.zzcp(zzgt.class, zzgtVar);
    }

    private zzgt() {
    }

    public static /* synthetic */ zzgt zzc() {
        return zzf;
    }

    public final String zza() {
        return this.zzd;
    }

    public final String zzb() {
        return this.zze;
    }

    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzgt();
        }
        if (i2 == 4) {
            return new zzgs(null);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
