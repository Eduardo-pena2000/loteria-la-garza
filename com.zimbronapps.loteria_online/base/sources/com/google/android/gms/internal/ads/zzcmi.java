package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcmi implements zzikg {
    private final zzikp zza;

    private zzcmi(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzcmi zza(zzikp zzikpVar) {
        return new zzcmi(zzikpVar);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        ApplicationInfo applicationInfo = ((zzcmj) this.zza).zza().getApplicationInfo();
        zziko.zzb(applicationInfo);
        return applicationInfo;
    }
}
