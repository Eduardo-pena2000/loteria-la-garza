package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcug implements zzikg {
    private final zzcue zza;

    private zzcug(zzcue zzcueVar) {
        this.zza = zzcueVar;
    }

    public static zzcug zzc(zzcue zzcueVar) {
        return new zzcug(zzcueVar);
    }

    public static View zzd(zzcue zzcueVar) {
        View zzb = zzcueVar.zzb();
        zziko.zzb(zzb);
        return zzb;
    }

    public final View zza() {
        return zzd(this.zza);
    }

    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
