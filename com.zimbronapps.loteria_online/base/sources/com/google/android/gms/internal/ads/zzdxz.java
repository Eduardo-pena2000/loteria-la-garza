package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdxz {
    private final zzdye zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdxz(zzdye zzdyeVar, Executor executor) {
        this.zza = zzdyeVar;
        this.zzc = zzdyeVar.zza();
        this.zzb = executor;
    }

    public final zzdxy zza() {
        zzdxy zzdxyVar = new zzdxy(this);
        zzdxyVar.zzl();
        return zzdxyVar;
    }

    public final void zzb() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zznb)).booleanValue()) {
            zzdxy zza = zza();
            zza.zzc("action", "pecr");
            zza.zzd();
        }
    }

    public final /* synthetic */ zzdye zzc() {
        return this.zza;
    }

    public final /* synthetic */ Executor zzd() {
        return this.zzb;
    }

    public final /* synthetic */ Map zze() {
        return this.zzc;
    }
}
