package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhdk {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private zzhdl zzd = zzhdl.zzc;

    private zzhdk() {
    }

    public final zzhdk zza(int i) throws GeneralSecurityException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(i)}));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzhdk zzb(int i) throws GeneralSecurityException {
        this.zzb = 12;
        return this;
    }

    public final zzhdk zzc(int i) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzhdk zzd(zzhdl zzhdlVar) {
        this.zzd = zzhdlVar;
        return this;
    }

    public final zzhdm zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int intValue = num.intValue();
        this.zzb.intValue();
        this.zzc.intValue();
        return new zzhdm(intValue, 12, 16, this.zzd, null);
    }

    public /* synthetic */ zzhdk(byte[] bArr) {
    }
}
