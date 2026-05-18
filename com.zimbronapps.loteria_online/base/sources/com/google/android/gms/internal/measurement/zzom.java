package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzom extends zzoo {
    public zzom(Unsafe unsafe) {
        super(unsafe);
    }

    public final void zza(Object obj, long j, byte b) {
        if (zzop.zzb) {
            zzop.zzs(obj, j, b);
        } else {
            zzop.zzt(obj, j, b);
        }
    }

    public final boolean zzb(Object obj, long j) {
        return zzop.zzb ? zzop.zzu(obj, j) : zzop.zzv(obj, j);
    }

    public final void zzc(Object obj, long j, boolean z) {
        if (zzop.zzb) {
            zzop.zzw(obj, j, z);
        } else {
            zzop.zzx(obj, j, z);
        }
    }

    public final float zzd(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    public final void zze(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    public final double zzf(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    public final void zzg(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }
}
