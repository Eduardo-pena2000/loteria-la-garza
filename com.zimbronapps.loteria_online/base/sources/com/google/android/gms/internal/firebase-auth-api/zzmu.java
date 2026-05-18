package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzmu implements zzmf {
    private final zzlz zza;
    private final zzmt zzb;

    public zzmu(zzlz zzlzVar) {
        zzmt zzmxVar;
        this.zza = zzlzVar;
        try {
            zzmxVar = zzmv.zzb();
        } catch (GeneralSecurityException unused) {
            zzmxVar = new zzmx(null);
        }
        this.zzb = zzmxVar;
    }

    public final byte[] zza(byte[] bArr, zzme zzmeVar) throws GeneralSecurityException {
        byte[] zza = this.zzb.zza(zzmeVar.zza().zzb(), bArr);
        byte[] zza2 = zzyz.zza(bArr, zzmeVar.zzb().zzb());
        byte[] zza3 = zzmk.zza(zzmk.zzb);
        zzlz zzlzVar = this.zza;
        return zzlzVar.zza(null, zza, "eae_prk", zza2, "shared_secret", zza3, zzlzVar.zza());
    }

    public final byte[] zza() throws GeneralSecurityException {
        if (Arrays.equals(this.zza.zzb(), zzmk.zzf)) {
            return zzmk.zzb;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
