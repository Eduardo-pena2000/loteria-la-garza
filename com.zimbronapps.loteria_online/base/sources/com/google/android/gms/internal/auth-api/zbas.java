package com.google.android.gms.internal.auth-api;

import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;
import l6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zbas implements r {
    private final /* synthetic */ zbat zba;
    private final /* synthetic */ c zbb;

    public /* synthetic */ zbas(zbat zbatVar, c cVar) {
        this.zba = zbatVar;
        this.zbb = cVar;
    }

    public final /* synthetic */ void accept(Object obj, Object obj2) {
        zbau zbauVar = (zbau) obj;
        ((zbv) zbauVar.getService()).zbc(new zbal(this.zba, (TaskCompletionSource) obj2), (c) t.l(this.zbb), zbaz.zba(zbauVar.getContext()));
    }
}
