package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcmk implements zzikg {
    private final zzcmc zza;

    private zzcmk(zzcmc zzcmcVar) {
        this.zza = zzcmcVar;
    }

    public static zzcmk zzc(zzcmc zzcmcVar) {
        return new zzcmk(zzcmcVar);
    }

    public static WeakReference zzd(zzcmc zzcmcVar) {
        WeakReference zzc = zzcmcVar.zzc();
        zziko.zzb(zzc);
        return zzc;
    }

    public final WeakReference zza() {
        return zzd(this.zza);
    }

    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
