package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhdb {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private zzhdc zzd = zzhdc.zzc;

    private zzhdb() {
    }

    public final zzhdb zza(int i) throws GeneralSecurityException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(i)}));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzhdb zzb(int i) throws GeneralSecurityException {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", new Object[]{Integer.valueOf(i)}));
        }
        this.zzb = Integer.valueOf(i);
        return this;
    }

    public final zzhdb zzc(int i) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzhdb zzd(zzhdc zzhdcVar) {
        this.zzd = zzhdcVar;
        return this;
    }

    public final zzhdd zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int intValue = num.intValue();
        int intValue2 = this.zzb.intValue();
        this.zzc.intValue();
        return new zzhdd(intValue, intValue2, 16, this.zzd, null);
    }

    public /* synthetic */ zzhdb(byte[] bArr) {
    }
}
