package com.google.android.gms.internal.games_v2;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzbn implements Continuation {
    public final /* synthetic */ zzbp zza;
    public final /* synthetic */ zzq zzb;
    public final /* synthetic */ boolean zzc;

    public /* synthetic */ zzbn(zzbp zzbpVar, zzq zzqVar, boolean z) {
        this.zza = zzbpVar;
        this.zzb = zzqVar;
        this.zzc = z;
    }

    public final Object then(Task task) {
        return this.zza.zzb(this.zzb, this.zzc, task);
    }
}
