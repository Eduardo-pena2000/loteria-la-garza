package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class u extends BasePendingResult {
    public final m a;

    public u(h hVar, m mVar) {
        super(hVar);
        this.a = mVar;
    }

    public final m createFailedResult(Status status) {
        return this.a;
    }
}
