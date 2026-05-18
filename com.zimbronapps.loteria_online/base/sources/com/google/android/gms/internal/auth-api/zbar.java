package com.google.android.gms.internal.auth-api;

import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;
import l6.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zbar implements r {
    private final /* synthetic */ zbat zba;
    private final /* synthetic */ g zbb;

    public /* synthetic */ zbar(zbat zbatVar, g gVar) {
        this.zba = zbatVar;
        this.zbb = gVar;
    }

    public final /* synthetic */ void accept(Object obj, Object obj2) {
        this.zba.zbb(this.zbb, (zbau) obj, (TaskCompletionSource) obj2);
    }
}
