package com.google.android.gms.internal.auth-api;

import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zbac implements r {
    private final /* synthetic */ zbad zba;
    private final /* synthetic */ AuthorizationRequest zbb;

    public /* synthetic */ zbac(zbad zbadVar, AuthorizationRequest authorizationRequest) {
        this.zba = zbadVar;
        this.zbb = authorizationRequest;
    }

    public final /* synthetic */ void accept(Object obj, Object obj2) {
        zbf zbfVar = (zbf) obj;
        ((zbj) zbfVar.getService()).zbc(new zbx(this.zba, (TaskCompletionSource) obj2), (AuthorizationRequest) t.l(this.zbb), zbaz.zba(zbfVar.getContext()));
    }
}
