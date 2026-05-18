package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzhh extends zzhi {
    public zzhh(Unsafe unsafe) {
        super(unsafe);
    }

    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    public final void zzc(Object obj, long j, boolean z) {
        if (zzhj.zza) {
            zzhj.zzi(obj, j, z);
        } else {
            zzhj.zzj(obj, j, z);
        }
    }

    public final void zzd(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }

    public final void zze(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    public final boolean zzf(Object obj, long j) {
        return zzhj.zza ? zzhj.zzq(obj, j) : zzhj.zzr(obj, j);
    }
}
