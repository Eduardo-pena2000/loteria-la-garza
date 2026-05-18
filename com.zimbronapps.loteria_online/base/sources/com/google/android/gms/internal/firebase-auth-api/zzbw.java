package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzxh;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbw {
    private final zzxh.zza zza;

    private zzbw(zzxh.zza zzaVar) {
        this.zza = zzaVar;
    }

    public final synchronized zzbm zza() throws GeneralSecurityException {
        return zzbm.zza((zzxh) ((zzalf) this.zza.zze()));
    }

    public static zzbw zza(zzbm zzbmVar) {
        return new zzbw((zzxh.zza) zzbmVar.zzd().zzn());
    }
}
