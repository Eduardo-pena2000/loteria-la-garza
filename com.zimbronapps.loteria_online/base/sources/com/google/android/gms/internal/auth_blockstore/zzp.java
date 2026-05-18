package com.google.android.gms.internal.auth_blockstore;

import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;
import q6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzp implements r {
    public final /* synthetic */ zzaa zza;
    public final /* synthetic */ c zzb;

    public /* synthetic */ zzp(zzaa zzaaVar, c cVar) {
        this.zza = zzaaVar;
        this.zzb = cVar;
    }

    public final void accept(Object obj, Object obj2) {
        ((zzg) ((zzf) obj).getService()).zza(new zzy(this.zza, (TaskCompletionSource) obj2), this.zzb);
    }
}
