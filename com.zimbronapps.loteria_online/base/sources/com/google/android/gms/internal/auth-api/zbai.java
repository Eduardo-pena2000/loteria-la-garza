package com.google.android.gms.internal.auth-api;

import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zbai implements r {
    private final /* synthetic */ zbaj zba;
    private final /* synthetic */ SaveAccountLinkingTokenRequest zbb;

    public /* synthetic */ zbai(zbaj zbajVar, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        this.zba = zbajVar;
        this.zbb = saveAccountLinkingTokenRequest;
    }

    public final /* synthetic */ void accept(Object obj, Object obj2) {
        zbg zbgVar = (zbg) obj;
        ((zbm) zbgVar.getService()).zbc(new zbaf(this.zba, (TaskCompletionSource) obj2), (SaveAccountLinkingTokenRequest) t.l(this.zbb), zbaz.zba(zbgVar.getContext()));
    }
}
