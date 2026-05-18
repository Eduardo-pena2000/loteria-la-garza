package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhlu {
    private Integer zza = null;
    private Integer zzb = null;
    private zzhlv zzc = zzhlv.zzd;

    private zzhlu() {
    }

    public final zzhlu zza(int i) throws GeneralSecurityException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(i * 8)}));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzhlu zzb(int i) throws GeneralSecurityException {
        if (i >= 10 && i <= 16) {
            this.zzb = Integer.valueOf(i);
            return this;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 40);
        sb.append("Invalid tag size for AesCmacParameters: ");
        sb.append(i);
        throw new GeneralSecurityException(sb.toString());
    }

    public final zzhlu zzc(zzhlv zzhlvVar) {
        this.zzc = zzhlvVar;
        return this;
    }

    public final zzhlw zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.zzc != null) {
            return new zzhlw(num.intValue(), this.zzb.intValue(), this.zzc, null);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public /* synthetic */ zzhlu(byte[] bArr) {
    }
}
