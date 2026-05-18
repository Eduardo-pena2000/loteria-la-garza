package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhsj {
    private zzhsg zza = null;
    private ECPoint zzb = null;
    private Integer zzc = null;

    private zzhsj() {
    }

    public final zzhsj zza(zzhsg zzhsgVar) {
        this.zza = zzhsgVar;
        return this;
    }

    public final zzhsj zzb(ECPoint eCPoint) {
        this.zzb = eCPoint;
        return this;
    }

    public final zzhsj zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhsk zzd() throws GeneralSecurityException {
        zzhye zza;
        zzhsg zzhsgVar = this.zza;
        if (zzhsgVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        ECPoint eCPoint = this.zzb;
        if (eCPoint == null) {
            throw new GeneralSecurityException("Cannot build without public point");
        }
        zzhis.zza(eCPoint, zzhsgVar.zzd().zza().getCurve());
        if (this.zza.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzhsf.zzd) {
            zza = zzhkh.zza;
        } else if (this.zza.zzf() == zzhsf.zzc || this.zza.zzf() == zzhsf.zzb) {
            zza = zzhkh.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzhsf.zza) {
                throw new IllegalStateException("Unknown EcdsaParameters.Variant: ".concat(this.zza.zzf().toString()));
            }
            zza = zzhkh.zzb(this.zzc.intValue());
        }
        return new zzhsk(this.zza, this.zzb, zza, this.zzc, null);
    }

    public /* synthetic */ zzhsj(byte[] bArr) {
    }
}
