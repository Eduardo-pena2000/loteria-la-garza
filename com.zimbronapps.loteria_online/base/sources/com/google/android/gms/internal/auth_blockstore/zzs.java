package com.google.android.gms.internal.auth_blockstore;

import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;
import q6.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzs implements r {
    public final /* synthetic */ zzaa zza;
    public final /* synthetic */ d zzb;

    public /* synthetic */ zzs(zzaa zzaaVar, d dVar) {
        this.zza = zzaaVar;
        this.zzb = dVar;
    }

    public final void accept(Object obj, Object obj2) {
        ((zzg) ((zzf) obj).getService()).zzd(new zzw(this.zza, (TaskCompletionSource) obj2), this.zzb);
    }
}
