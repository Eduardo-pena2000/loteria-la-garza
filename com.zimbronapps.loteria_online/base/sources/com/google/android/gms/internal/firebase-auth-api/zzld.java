package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzld implements zzpz {
    private static final zzld zza = new zzld();
    private static final zzps zzb = zzps.zza(new zzlc(), zzof.class, zzbg.class);

    public static void zzc() throws GeneralSecurityException {
        zzpa.zza().zza(zza);
        zzpa.zza().zza(zzb);
    }

    public final Class zza() {
        return zzbg.class;
    }

    public final Class zzb() {
        return zzbg.class;
    }

    public final /* synthetic */ Object zza(zzob zzobVar, zzok zzokVar, zzqc zzqcVar) throws GeneralSecurityException {
        zzoo zza2 = !zzokVar.zza() ? zzow.zzb().zza().zza(zzobVar, zzokVar, "hybrid_encrypt", "encrypt") : zzon.zza;
        zzoa zzc = zzobVar.zzc();
        return new zzle(new zzlf((zzbg) zzqcVar.zza(zzc), zzc.zza()), zza2);
    }

    public static void zza(zzpy zzpyVar) throws GeneralSecurityException {
        zzpyVar.zza(zza);
    }
}
