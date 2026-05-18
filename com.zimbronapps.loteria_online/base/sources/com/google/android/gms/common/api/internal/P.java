package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class p {
    private final l zaa;
    private final v6.d[] zab;
    private final boolean zac;
    private final int zad;

    public p(l lVar, v6.d[] dVarArr, boolean z, int i) {
        this.zaa = lVar;
        this.zab = dVarArr;
        this.zac = z;
        this.zad = i;
    }

    public void clearListener() {
        this.zaa.a();
    }

    public l.a getListenerKey() {
        return this.zaa.b();
    }

    public v6.d[] getRequiredFeatures() {
        return this.zab;
    }

    public abstract void registerListener(a.b bVar, TaskCompletionSource taskCompletionSource);

    public final int zaa() {
        return this.zad;
    }

    public final boolean zab() {
        return this.zac;
    }

    public p(l lVar) {
        this(lVar, null, false, 0);
    }
}
