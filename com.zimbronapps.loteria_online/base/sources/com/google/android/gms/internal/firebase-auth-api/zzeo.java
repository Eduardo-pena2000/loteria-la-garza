package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zziv;
import com.google.android.gms.internal.firebase-auth-api.zzwx;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzeo {
    private static final zzps zza = zzps.zza(new zzen(), zzet.class, zzba.class);
    private static final zzbh zzb = zzod.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzba.class, zzwx.zzb.REMOTE, zzxn.zze());
    private static final zzor zzc = new zzeq();

    public static /* synthetic */ zzba zza(zzet zzetVar) {
        return zzia.zza(zzca.zza(((zzev) ((zzcy) zzetVar.zza())).zzc()).zza(((zzev) ((zzcy) zzetVar.zza())).zzc()), zzetVar.zzd());
    }

    public static /* synthetic */ zzet zza(zzev zzevVar, Integer num) {
        return zzet.zza(zzevVar, num);
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        if (zziv.zza.zza.zza()) {
            zzex.zza();
            zzpa.zza().zza(zza);
            zzop.zza().zza(zzc, zzev.class);
            zznq.zza().zza(zzb, true);
            return;
        }
        throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
    }
}
