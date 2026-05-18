package com.google.android.gms.internal.auth_blockstore;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzy extends zzh {
    final /* synthetic */ TaskCompletionSource zza;

    public zzy(zzaa zzaaVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zza(Status status, boolean z) {
        x.b(status, Boolean.valueOf(z), this.zza);
    }
}
