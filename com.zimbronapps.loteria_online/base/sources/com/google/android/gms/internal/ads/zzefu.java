package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzefu {
    private final zzcma zza;
    private final Context zzb;
    private final Executor zzc;

    public zzefu(zzcma zzcmaVar, Context context, Executor executor) {
        this.zza = zzcmaVar;
        this.zzb = context;
        this.zzc = executor;
    }

    public final void zza() {
        this.zzc.execute(new zzeft(this));
    }

    public final /* synthetic */ void zzb() {
        zzefw zzh = this.zza.zzh();
        zzh.zzb(this.zzb);
        zzh.zza().zza().zza();
    }
}
