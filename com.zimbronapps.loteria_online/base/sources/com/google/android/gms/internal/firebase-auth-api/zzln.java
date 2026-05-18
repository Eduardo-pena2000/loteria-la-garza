package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzln {
    private static final byte[] zza = new byte[0];

    public static /* bridge */ /* synthetic */ byte[] zza() {
        return zza;
    }

    public static zzlr zza(zzkb zzkbVar) throws GeneralSecurityException {
        zzcb zzb = zzkbVar.zzb();
        if (zzb instanceof zzdx) {
            return new zzlp((zzdx) zzb);
        }
        if (zzb instanceof zzdi) {
            return new zzlm((zzdi) zzb);
        }
        if (zzb instanceof zzjf) {
            return new zzlo((zzjf) zzb);
        }
        throw new GeneralSecurityException("Unsupported DEM parameters: " + String.valueOf(zzb));
    }
}
