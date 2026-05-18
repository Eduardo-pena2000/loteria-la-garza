package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhde {
    private zzhdm zza = null;
    private zzhyg zzb = null;
    private Integer zzc = null;

    private zzhde() {
    }

    public final zzhde zza(zzhdm zzhdmVar) {
        this.zza = zzhdmVar;
        return this;
    }

    public final zzhde zzb(zzhyg zzhygVar) {
        this.zzb = zzhygVar;
        return this;
    }

    public final zzhde zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhdf zzd() throws GeneralSecurityException {
        zzhyg zzhygVar;
        zzhye zzb;
        zzhdm zzhdmVar = this.zza;
        if (zzhdmVar == null || (zzhygVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhdmVar.zzc() != zzhygVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhdmVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzhdl.zzc) {
            zzb = zzhkh.zza;
        } else if (this.zza.zzd() == zzhdl.zzb) {
            zzb = zzhkh.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzhdl.zza) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            zzb = zzhkh.zzb(this.zzc.intValue());
        }
        return new zzhdf(this.zza, this.zzb, zzb, this.zzc, null);
    }

    public /* synthetic */ zzhde(byte[] bArr) {
    }
}
