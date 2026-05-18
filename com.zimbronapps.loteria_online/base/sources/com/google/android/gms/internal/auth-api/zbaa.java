package com.google.android.gms.internal.auth-api;

import com.google.android.gms.auth.api.identity.RevokeAccessRequest;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zbaa implements r {
    private final /* synthetic */ zbad zba;
    private final /* synthetic */ RevokeAccessRequest zbb;

    public /* synthetic */ zbaa(zbad zbadVar, RevokeAccessRequest revokeAccessRequest) {
        this.zba = zbadVar;
        this.zbb = revokeAccessRequest;
    }

    public final /* synthetic */ void accept(Object obj, Object obj2) {
        zbf zbfVar = (zbf) obj;
        ((zbj) zbfVar.getService()).zbd(new zby(this.zba, (TaskCompletionSource) obj2), (RevokeAccessRequest) t.l(this.zbb), zbaz.zba(zbfVar.getContext()));
    }
}
