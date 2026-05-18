package com.google.android.recaptcha.internal;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzce extends Exception {
    private final Throwable zza;
    private final zztd zzb;
    private final int zzc;
    private final int zzd;

    public zzce(int i, int i2, Throwable th) {
        this.zzc = i;
        this.zzd = i2;
        this.zza = th;
        zztd zzf = zzte.zzf();
        zzf.zzq(i2);
        zzf.zzr(i);
        this.zzb = zzf;
    }

    public final Throwable getCause() {
        return this.zza;
    }

    public final zztd zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }
}
