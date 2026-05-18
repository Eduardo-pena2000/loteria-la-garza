package com.google.android.gms.tasks;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzs implements OnTokenCanceledListener {
    final /* synthetic */ TaskCompletionSource zza;

    public zzs(TaskCompletionSource taskCompletionSource) {
        Objects.requireNonNull(taskCompletionSource);
        this.zza = taskCompletionSource;
    }

    public final void onCanceled() {
        this.zza.zza().zze();
    }
}
