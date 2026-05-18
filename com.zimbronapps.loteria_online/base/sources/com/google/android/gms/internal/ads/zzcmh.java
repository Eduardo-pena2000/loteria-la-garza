package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcmh implements zzikg {
    private final zzcmc zza;

    private zzcmh(zzcmc zzcmcVar) {
        this.zza = zzcmcVar;
    }

    public static zzcmh zzc(zzcmc zzcmcVar) {
        return new zzcmh(zzcmcVar);
    }

    public static Context zzd(zzcmc zzcmcVar) {
        Context zzb = zzcmcVar.zzb();
        zziko.zzb(zzb);
        return zzb;
    }

    public final Context zza() {
        return zzd(this.zza);
    }

    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
