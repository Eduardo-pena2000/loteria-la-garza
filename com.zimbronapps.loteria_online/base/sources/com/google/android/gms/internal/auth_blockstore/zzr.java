package com.google.android.gms.internal.auth_blockstore;

import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzr implements r {
    public final /* synthetic */ zzaa zza;

    public /* synthetic */ zzr(zzaa zzaaVar) {
        this.zza = zzaaVar;
    }

    public final void accept(Object obj, Object obj2) {
        ((zzg) ((zzf) obj).getService()).zzb(new zzz(this.zza, (TaskCompletionSource) obj2));
    }
}
