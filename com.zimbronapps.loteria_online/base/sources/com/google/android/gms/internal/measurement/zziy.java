package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zziy extends zzmf implements zznn {
    private static final zziy zzf;
    private int zzb;
    private String zzd = "";
    private zzmo zze = zzmf.zzcv();

    static {
        zziy zziyVar = new zziy();
        zzf = zziyVar;
        zzmf.zzcp(zziy.class, zziyVar);
    }

    private zziy() {
    }

    public static /* synthetic */ zziy zzc() {
        return zzf;
    }

    public final String zza() {
        return this.zzd;
    }

    public final List zzb() {
        return this.zze;
    }

    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zzd", "zze", zzje.class});
        }
        if (i2 == 3) {
            return new zziy();
        }
        if (i2 == 4) {
            return new zzix(null);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
