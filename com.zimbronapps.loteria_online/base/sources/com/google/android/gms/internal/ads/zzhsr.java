package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhsr extends zzhuv {
    private final zzhsx zza;
    private final zzhyg zzb;

    private zzhsr(zzhsx zzhsxVar, zzhyg zzhygVar) {
        this.zza = zzhsxVar;
        this.zzb = zzhygVar;
    }

    public static zzhsr zzc(zzhsx zzhsxVar, zzhyg zzhygVar) throws GeneralSecurityException {
        if (zzhygVar.zzd() == 32) {
            if (Arrays.equals(zzhsxVar.zzd().zzc(), zzhio.zza(zzhio.zzb(zzhygVar.zzc(zzhax.zza()))))) {
                return new zzhsr(zzhsxVar, zzhygVar);
            }
            throw new GeneralSecurityException("Ed25519 keys mismatch");
        }
        int zzd = zzhygVar.zzd();
        StringBuilder sb = new StringBuilder(String.valueOf(zzd).length() + 65);
        sb.append("Ed25519 key must be constructed with key of length 32 bytes, not ");
        sb.append(zzd);
        throw new GeneralSecurityException(sb.toString());
    }

    public final /* synthetic */ zzhbp zza() {
        return this.zza.zzf();
    }

    public final zzhsq zzd() {
        return this.zza.zzf();
    }

    public final zzhsx zze() {
        return this.zza;
    }

    public final zzhyg zzf() {
        return this.zzb;
    }

    public final /* synthetic */ zzhuw zzg() {
        return this.zza;
    }
}
