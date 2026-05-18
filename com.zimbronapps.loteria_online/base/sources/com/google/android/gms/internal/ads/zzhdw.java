package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhdw extends zzhcg {
    private final zzheb zza;
    private final zzhyg zzb;
    private final zzhye zzc;
    private final Integer zzd;

    private zzhdw(zzheb zzhebVar, zzhyg zzhygVar, zzhye zzhyeVar, Integer num) {
        this.zza = zzhebVar;
        this.zzb = zzhygVar;
        this.zzc = zzhyeVar;
        this.zzd = num;
    }

    public static zzhdw zzd(zzhea zzheaVar, zzhyg zzhygVar, Integer num) throws GeneralSecurityException {
        zzhye zzb;
        zzhea zzheaVar2 = zzhea.zzc;
        if (zzheaVar != zzheaVar2 && num == null) {
            String obj = zzheaVar.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 62);
            sb.append("For given Variant ");
            sb.append(obj);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (zzheaVar == zzheaVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzhygVar.zzd() != 32) {
            int zzd = zzhygVar.zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzd).length() + 74);
            sb2.append("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
            sb2.append(zzd);
            throw new GeneralSecurityException(sb2.toString());
        }
        zzheb zzb2 = zzheb.zzb(zzheaVar);
        if (zzb2.zzc() == zzheaVar2) {
            zzb = zzhkh.zza;
        } else if (zzb2.zzc() == zzhea.zzb) {
            zzb = zzhkh.zza(num.intValue());
        } else {
            if (zzb2.zzc() != zzhea.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzb2.zzc().toString()));
            }
            zzb = zzhkh.zzb(num.intValue());
        }
        return new zzhdw(zzb2, zzhygVar, zzb, num);
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

    public final zzheb zzf() {
        return this.zza;
    }
}
