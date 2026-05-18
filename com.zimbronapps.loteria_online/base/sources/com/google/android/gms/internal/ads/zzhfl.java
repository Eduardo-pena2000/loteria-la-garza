package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhfl extends zzhcg {
    private final zzhfq zza;
    private final zzhyg zzb;
    private final zzhye zzc;
    private final Integer zzd;

    private zzhfl(zzhfq zzhfqVar, zzhyg zzhygVar, zzhye zzhyeVar, Integer num) {
        this.zza = zzhfqVar;
        this.zzb = zzhygVar;
        this.zzc = zzhyeVar;
        this.zzd = num;
    }

    public static zzhfl zzd(zzhfq zzhfqVar, zzhyg zzhygVar, Integer num) throws GeneralSecurityException {
        zzhye zzb;
        zzhfp zzc = zzhfqVar.zzc();
        zzhfp zzhfpVar = zzhfp.zzb;
        if (zzc != zzhfpVar && num == null) {
            String obj = zzhfqVar.zzc().toString();
            StringBuilder sb = new StringBuilder(obj.length() + 62);
            sb.append("For given Variant ");
            sb.append(obj);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (zzhfqVar.zzc() == zzhfpVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzhygVar.zzd() != 32) {
            int zzd = zzhygVar.zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzd).length() + 68);
            sb2.append("XAesGcmKey key must be constructed with key of length 32 bytes, not ");
            sb2.append(zzd);
            throw new GeneralSecurityException(sb2.toString());
        }
        if (zzhfqVar.zzc() == zzhfpVar) {
            zzb = zzhkh.zza;
        } else {
            if (zzhfqVar.zzc() != zzhfp.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhfqVar.zzc().toString()));
            }
            zzb = zzhkh.zzb(num.intValue());
        }
        return new zzhfl(zzhfqVar, zzhygVar, zzb, num);
    }

    public final /* synthetic */ zzhbp zza() {
        return this.zza;
    }

    public final Integer zzb() {
        return this.zzd;
    }

    public final zzhye zzc() {
        return this.zzc;
    }

    public final zzhyg zze() {
        return this.zzb;
    }

    public final zzhfq zzf() {
        return this.zza;
    }
}
