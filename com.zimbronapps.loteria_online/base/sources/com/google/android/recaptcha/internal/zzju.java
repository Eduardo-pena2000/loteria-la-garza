package com.google.android.recaptcha.internal;

import java.io.Serializable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzju extends zzjv implements Serializable {
    final byte[] zza;

    public zzju(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    public final int zza() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        if (length < 4) {
            throw new IllegalStateException(zzji.zza("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        }
        int i = bArr[0] & 255;
        int i2 = bArr[1] & 255;
        int i3 = bArr[2] & 255;
        return ((bArr[3] & 255) << 24) | i | (i2 << 8) | (i3 << 16);
    }

    public final int zzb() {
        return this.zza.length * 8;
    }

    public final boolean zzc(zzjv zzjvVar) {
        if (this.zza.length != zzjvVar.zze().length) {
            return false;
        }
        boolean z = true;
        int i = 0;
        while (true) {
            byte[] bArr = this.zza;
            if (i >= bArr.length) {
                return z;
            }
            z &= bArr[i] == zzjvVar.zze()[i];
            i++;
        }
    }

    public final byte[] zzd() {
        return (byte[]) this.zza.clone();
    }

    public final byte[] zze() {
        return this.zza;
    }
}
