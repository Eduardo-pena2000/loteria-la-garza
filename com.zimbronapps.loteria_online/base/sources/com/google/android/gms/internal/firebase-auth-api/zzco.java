package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzco {
    private static final zznp zza = zzb();

    public static /* synthetic */ zzba zza(zzgb zzgbVar) {
        return zzik.zza() ? zzik.zza(zzgbVar) : zzaak.zza(zzgbVar);
    }

    private static zznp zzb() {
        try {
            zzpy zza2 = zzpw.zza();
            zzcx.zza(zza2);
            zza2.zza(zzps.zza(new zzcn(), zzdd.class, zzba.class));
            zza2.zza(zzps.zza(new zzcq(), zzds.class, zzba.class));
            zza2.zza(zzps.zza(new zzcp(), zzdz.class, zzba.class));
            zza2.zza(zzps.zza(new zzcs(), zzdl.class, zzba.class));
            zza2.zza(zzps.zza(new zzcr(), zzej.class, zzba.class));
            zza2.zza(zzps.zza(new zzcu(), zzgb.class, zzba.class));
            zza2.zza(zzps.zza(new zzct(), zzfw.class, zzba.class));
            return zznp.zza(zza2.zza());
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    public static /* synthetic */ zzba zza(zzej zzejVar) {
        if (zzhh.zzb()) {
            return zzhh.zza(zzejVar);
        }
        return zzzc.zza(zzejVar);
    }

    public static zzbb zza() throws GeneralSecurityException {
        if (!zziv.zzb()) {
            return zza;
        }
        throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
    }
}
