package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzn extends zze {
    final /* synthetic */ TaskCompletionSource zza;

    public zzn(zzo zzoVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status, zzs zzsVar) {
        if (zzsVar == null) {
            this.zza.setException(new b(status));
        } else {
            this.zza.setResult(zzsVar);
        }
    }
}
