package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhwt {
    private final byte[] zza;
    private final byte[] zzb;

    private zzhwt(byte[] bArr, byte[] bArr2) {
        this.zza = bArr;
        this.zzb = bArr2;
    }

    public static zzhwt zzc() throws GeneralSecurityException {
        byte[] zza = zzhle.zza(32);
        if (zza.length == 32) {
            return new zzhwt(zzhio.zza(zzhio.zzb(zza)), zza);
        }
        throw new IllegalArgumentException(String.format("Given secret seed length is not %s", new Object[]{32}));
    }

    public final byte[] zza() {
        return Arrays.copyOf(this.zza, 32);
    }

    public final byte[] zzb() {
        byte[] bArr = this.zzb;
        return Arrays.copyOf(bArr, bArr.length);
    }
}
