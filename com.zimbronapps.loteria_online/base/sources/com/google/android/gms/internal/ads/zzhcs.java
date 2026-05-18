package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhcs {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private Integer zzd = null;
    private zzhct zze = null;
    private zzhcu zzf = zzhcu.zzc;

    private zzhcs() {
    }

    public final zzhcs zza(int i) throws GeneralSecurityException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(i)}));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzhcs zzb(int i) throws GeneralSecurityException {
        if (i < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", new Object[]{Integer.valueOf(i)}));
        }
        this.zzb = Integer.valueOf(i);
        return this;
    }

    public final zzhcs zzc(int i) throws GeneralSecurityException {
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", new Object[]{Integer.valueOf(i)}));
        }
        this.zzc = Integer.valueOf(i);
        return this;
    }

    public final zzhcs zzd(int i) throws GeneralSecurityException {
        if (i < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[]{Integer.valueOf(i)}));
        }
        this.zzd = Integer.valueOf(i);
        return this;
    }

    public final zzhcs zze(zzhcu zzhcuVar) {
        this.zzf = zzhcuVar;
        return this;
    }

    public final zzhcs zzf(zzhct zzhctVar) {
        this.zze = zzhctVar;
        return this;
    }

    public final zzhcv zzg() throws GeneralSecurityException {
        if (this.zza == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = this.zzd;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.zze == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.zzf == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        int intValue = num.intValue();
        zzhct zzhctVar = this.zze;
        if (zzhctVar == zzhct.zza) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[]{num}));
            }
        } else if (zzhctVar == zzhct.zzb) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[]{num}));
            }
        } else if (zzhctVar == zzhct.zzc) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[]{num}));
            }
        } else if (zzhctVar == zzhct.zzd) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[]{num}));
            }
        } else {
            if (zzhctVar != zzhct.zze) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[]{num}));
            }
        }
        return new zzhcv(this.zza.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zzd.intValue(), this.zzf, this.zze, null);
    }

    public /* synthetic */ zzhcs(byte[] bArr) {
    }
}
