package com.google.android.gms.internal.auth-api;

import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;
import l6.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zbaq implements r {
    private final /* synthetic */ zbat zba;
    private final /* synthetic */ h zbb;

    public /* synthetic */ zbaq(zbat zbatVar, h hVar) {
        this.zba = zbatVar;
        this.zbb = hVar;
    }

    public final /* synthetic */ void accept(Object obj, Object obj2) {
        zbau zbauVar = (zbau) obj;
        ((zbv) zbauVar.getService()).zbe(new zban(this.zba, (TaskCompletionSource) obj2), (h) t.l(this.zbb), zbaz.zba(zbauVar.getContext()));
    }
}
