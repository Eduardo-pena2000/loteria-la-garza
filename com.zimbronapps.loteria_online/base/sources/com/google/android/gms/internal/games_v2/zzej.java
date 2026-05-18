package com.google.android.gms.internal.games_v2;

import T6.u;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzej extends zzfe {
    final /* synthetic */ TaskCompletionSource zza;

    public zzej(zzek zzekVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status) {
        this.zza.setException(new b(status));
    }

    public final void zzc(zzam zzamVar) {
        this.zza.setResult(u.a(zzamVar));
    }
}
