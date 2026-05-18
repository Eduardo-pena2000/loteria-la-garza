package com.google.android.gms.internal.auth-api;

import com.google.android.gms.auth.api.identity.ClearTokenRequest;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zbab implements r {
    private final /* synthetic */ zbad zba;
    private final /* synthetic */ ClearTokenRequest zbb;

    public /* synthetic */ zbab(zbad zbadVar, ClearTokenRequest clearTokenRequest) {
        this.zba = zbadVar;
        this.zbb = clearTokenRequest;
    }

    public final /* synthetic */ void accept(Object obj, Object obj2) {
        zbf zbfVar = (zbf) obj;
        ((zbj) zbfVar.getService()).zbe(new zbz(this.zba, (TaskCompletionSource) obj2), (ClearTokenRequest) t.l(this.zbb), zbaz.zba(zbfVar.getContext()));
    }
}
