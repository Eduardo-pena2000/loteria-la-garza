package com.google.android.gms.internal.auth_blockstore;

import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;
import q6.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzq implements r {
    public final /* synthetic */ zzaa zza;
    public final /* synthetic */ f zzb;

    public /* synthetic */ zzq(zzaa zzaaVar, f fVar) {
        this.zza = zzaaVar;
        this.zzb = fVar;
    }

    public final void accept(Object obj, Object obj2) {
        ((zzg) ((zzf) obj).getService()).zze(new zzv(this.zza, (TaskCompletionSource) obj2), this.zzb);
    }
}
