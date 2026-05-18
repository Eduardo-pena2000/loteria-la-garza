package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzeh implements SuccessContinuation {
    public final /* synthetic */ zzek zza;
    public final /* synthetic */ w zzb;

    public /* synthetic */ zzeh(zzek zzekVar, w wVar) {
        this.zza = zzekVar;
        this.zzb = wVar;
    }

    public final Task then(Object obj) {
        return this.zza.doRead(this.zzb);
    }
}
