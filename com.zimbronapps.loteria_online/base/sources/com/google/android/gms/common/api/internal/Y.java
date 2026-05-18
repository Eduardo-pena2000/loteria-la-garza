package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class y {
    private final l.a zaa;

    public y(l.a aVar) {
        this.zaa = aVar;
    }

    public l.a getListenerKey() {
        return this.zaa;
    }

    public abstract void unregisterListener(a.b bVar, TaskCompletionSource taskCompletionSource);
}
