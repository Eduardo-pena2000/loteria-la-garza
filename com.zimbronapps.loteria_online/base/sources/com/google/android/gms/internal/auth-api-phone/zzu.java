package com.google.android.gms.internal.auth-api-phone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzu extends h.a {
    final /* synthetic */ TaskCompletionSource zza;

    public zzu(zzv zzvVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void onResult(Status status) {
        if (status.O1() == 6) {
            this.zza.trySetException(b.a(status));
        } else {
            x.a(status, this.zza);
        }
    }
}
