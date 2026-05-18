package com.google.android.gms.internal.auth-api;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zbao extends zbn {
    final /* synthetic */ TaskCompletionSource zba;

    public zbao(zbat zbatVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        Objects.requireNonNull(zbatVar);
    }

    public final void zbb(Status status, PendingIntent pendingIntent) {
        x.b(status, pendingIntent, this.zba);
    }
}
