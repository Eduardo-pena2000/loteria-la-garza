package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zziej extends zziel {
    public zziej(Unsafe unsafe) {
        super(unsafe);
    }

    public final void zza(Object obj, long j, byte b) {
        if (zziem.zzb) {
            zziem.zzu(obj, j, b);
        } else {
            zziem.zzv(obj, j, b);
        }
    }

    public final boolean zzb(Object obj, long j) {
        return zziem.zzb ? zziem.zzw(obj, j) : zziem.zzx(obj, j);
    }

    public final void zzc(Object obj, long j, boolean z) {
        if (zziem.zzb) {
            zziem.zzy(obj, j, z);
        } else {
            zziem.zzz(obj, j, z);
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

    public final byte zzh(long j) {
        return Memory.peekByte((int) j);
    }
}
