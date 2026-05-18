package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeue implements zzfax {
    private final Executor zza;
    private final zzcdu zzb;

    public zzeue(Executor executor, zzcdu zzcduVar) {
        this.zza = executor;
        this.zzb = zzcduVar;
    }

    public final x7.e zza() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzdJ)).booleanValue()) {
            return zzgzo.zza(new zzeuf(null));
        }
        zzcdu zzcduVar = this.zzb;
        return zzgzo.zzk(zzcduVar.zzq(), zzeud.zza, this.zza);
    }

    public final int zzb() {
        return 10;
    }
}
