package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcmj implements zzikg {
    private final zzcmc zza;

    private zzcmj(zzcmc zzcmcVar) {
        this.zza = zzcmcVar;
    }

    public static zzcmj zzc(zzcmc zzcmcVar) {
        return new zzcmj(zzcmcVar);
    }

    public static Context zzd(zzcmc zzcmcVar) {
        Context zza = zzcmcVar.zza();
        zziko.zzb(zza);
        return zza;
    }

    public final Context zza() {
        return zzd(this.zza);
    }

    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
