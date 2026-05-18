package com.google.android.gms.internal.firebase-auth-api;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbz {
    public static zzbm zza(zzbv zzbvVar, zzch zzchVar) throws GeneralSecurityException, IOException {
        if (zzchVar != null) {
            return zzbm.zza(zzbvVar.zzb());
        }
        throw new NullPointerException("SecretKeyAccess cannot be null");
    }

    public static void zza(zzbm zzbmVar, zzby zzbyVar, zzch zzchVar) throws IOException {
        if (zzchVar != null) {
            zzbyVar.zza(zzbmVar.zzd());
            return;
        }
        throw new NullPointerException("SecretKeyAccess cannot be null");
    }
}
