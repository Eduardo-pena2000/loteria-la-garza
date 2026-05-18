package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zziv;
import com.google.android.gms.internal.firebase-auth-api.zzwx;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzes {
    private static final zzbh zza = zzod.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzba.class, zzwx.zzb.SYMMETRIC, zzxt.zze());
    private static final zzor zzb = new zzer();
    private static final zzps zzc = zzps.zza(new zzeu(), zzfd.class, zzba.class);

    public static /* synthetic */ zzba zza(zzfd zzfdVar) {
        String zzd = ((zzfc) ((zzcy) zzfdVar.zza())).zzd();
        return zzia.zza(zzep.zza(((zzfc) ((zzcy) zzfdVar.zza())).zzb(), zzca.zza(zzd).zza(zzd)), zzfdVar.zzd());
    }

    public static /* synthetic */ zzfd zza(zzfc zzfcVar, Integer num) {
        return zzfd.zza(zzfcVar, num);
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        if (zziv.zza.zza.zza()) {
            zzfg.zza();
            zzop.zza().zza(zzb, zzfc.class);
            zzpa.zza().zza(zzc);
            zznq.zza().zza(zza, true);
            return;
        }
        throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
    }
}
