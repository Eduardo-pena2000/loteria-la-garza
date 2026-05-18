package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzl implements r {
    public final /* synthetic */ zzo zza;
    public final /* synthetic */ zzq zzb;

    public /* synthetic */ zzl(zzo zzoVar, zzq zzqVar) {
        this.zza = zzoVar;
        this.zzb = zzqVar;
    }

    public final void accept(Object obj, Object obj2) {
        ((zzw) ((zzp) obj).getService()).zzd(new zzn(this.zza, (TaskCompletionSource) obj2), this.zzb);
    }
}
