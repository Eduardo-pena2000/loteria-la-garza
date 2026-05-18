package com.google.android.gms.common.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class s {
    public static final Q a = new N();

    public interface a {
        Object a(com.google.android.gms.common.api.m mVar);
    }

    public static Task a(com.google.android.gms.common.api.i iVar, a aVar) {
        Q q = a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        iVar.addStatusListener(new O(iVar, taskCompletionSource, aVar, q));
        return taskCompletionSource.getTask();
    }

    public static Task b(com.google.android.gms.common.api.i iVar) {
        return a(iVar, new P());
    }
}
