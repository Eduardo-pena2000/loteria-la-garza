package com.google.android.gms.internal.firebase-auth-api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzajz extends zzakg {
    private final int zzc;
    private final int zzd;

    public zzajz(byte[] bArr, int i, int i2) {
        super(bArr);
        zzajv.zza(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    public final byte zza(int i) {
        int zzb = zzb();
        if (((zzb - (i + 1)) | i) >= 0) {
            return this.zzb[this.zzc + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + zzb);
    }

    public final byte zzb(int i) {
        return this.zzb[this.zzc + i];
    }

    public final int zze() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final void zza(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzb, zze(), bArr, 0, i3);
    }
}
