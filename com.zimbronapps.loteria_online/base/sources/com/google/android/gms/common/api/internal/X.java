package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class x {
    public static void a(Status status, TaskCompletionSource taskCompletionSource) {
        b(status, null, taskCompletionSource);
    }

    public static void b(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.R1()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(com.google.android.gms.common.internal.b.a(status));
        }
    }

    public static boolean c(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        return status.R1() ? taskCompletionSource.trySetResult(obj) : taskCompletionSource.trySetException(com.google.android.gms.common.internal.b.a(status));
    }
}
