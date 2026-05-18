package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhdt {
    private Integer zza = null;
    private zzhdu zzb = zzhdu.zzc;

    private zzhdt() {
    }

    public final zzhdt zza(int i) throws GeneralSecurityException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(i)}));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzhdt zzb(zzhdu zzhduVar) {
        this.zzb = zzhduVar;
        return this;
    }

    public final zzhdv zzc() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzb != null) {
            return new zzhdv(num.intValue(), this.zzb, null);
        }
        throw new GeneralSecurityException("Variant is not set");
    }

    public /* synthetic */ zzhdt(byte[] bArr) {
    }
}
