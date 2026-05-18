package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzks {
    private static final zznp zza = zzb();

    public static zzbb zza() throws GeneralSecurityException {
        if (zziv.zzb()) {
            throw new GeneralSecurityException("Cannot use non-FIPS-compliant HybridConfigurationV1 in FIPS mode");
        }
        return zza;
    }

    private static zznp zzb() {
        try {
            zzpy zza2 = zzpw.zza();
            zzld.zza(zza2);
            zza2.zza(zzps.zza(new zzkv(), zzkh.class, zzbg.class));
            zza2.zza(zzps.zza(new zzku(), zzkq.class, zzbg.class));
            zzkz.zza(zza2);
            zza2.zza(zzps.zza(new zzkx(), zzke.class, zzbd.class));
            zza2.zza(zzps.zza(new zzkw(), zzki.class, zzbd.class));
            return zznp.zza(zza2.zza());
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
