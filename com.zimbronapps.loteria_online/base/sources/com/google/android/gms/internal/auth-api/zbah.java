package com.google.android.gms.internal.auth-api;

import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;
import l6.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zbah implements r {
    private final /* synthetic */ zbaj zba;
    private final /* synthetic */ k zbb;

    public /* synthetic */ zbah(zbaj zbajVar, k kVar) {
        this.zba = zbajVar;
        this.zbb = kVar;
    }

    public final /* synthetic */ void accept(Object obj, Object obj2) {
        zbg zbgVar = (zbg) obj;
        ((zbm) zbgVar.getService()).zbd(new zbag(this.zba, (TaskCompletionSource) obj2), (k) t.l(this.zbb), zbaz.zba(zbgVar.getContext()));
    }
}
