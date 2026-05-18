package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class aa implements IntegrityManager {
    private final aj a;

    public aa(aj ajVar) {
        this.a = ajVar;
    }

    public final Task requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.a.c(integrityTokenRequest);
    }
}
