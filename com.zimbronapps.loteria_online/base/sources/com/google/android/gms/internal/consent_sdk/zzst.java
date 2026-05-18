package com.google.android.gms.internal.consent_sdk;

import sun.misc.Unsafe;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzst extends zzsv {
    public zzst(Unsafe unsafe) {
        super(unsafe);
    }

    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    public final void zzc(Object obj, long j, boolean z) {
        if (zzsw.zzb) {
            zzsw.zzi(obj, j, z);
        } else {
            zzsw.zzj(obj, j, z);
        }
    }

    public final void zzd(Object obj, long j, byte b) {
        if (zzsw.zzb) {
            zzsw.zzk(obj, j, b);
        } else {
            zzsw.zzl(obj, j, b);
        }
    }

    public final void zze(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }

    public final void zzf(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    public final boolean zzg(Object obj, long j) {
        return zzsw.zzb ? zzsw.zzt(obj, j) : zzsw.zzu(obj, j);
    }
}
