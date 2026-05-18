package com.google.android.gms.internal.measurement;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzhl extends zzmf implements zznn {
    private static final zzhl zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        zzhl zzhlVar = new zzhl();
        zzf = zzhlVar;
        zzmf.zzcp(zzhl.class, zzhlVar);
    }

    private zzhl() {
    }

    public static zzhk zza() {
        return (zzhk) zzf.zzck();
    }

    public static /* synthetic */ zzhl zzb() {
        return zzf;
    }

    public final int zzc() {
        int zza = zzhj.zza(this.zzd);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzd() {
        int zza = zzhn.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final /* synthetic */ void zze(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void zzf(int i) {
        this.zze = i - 1;
        this.zzb |= 2;
    }

    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", zzhi.zza, "zze", zzhm.zza});
        }
        if (i2 == 3) {
            return new zzhl();
        }
        if (i2 == 4) {
            return new zzhk(null);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
