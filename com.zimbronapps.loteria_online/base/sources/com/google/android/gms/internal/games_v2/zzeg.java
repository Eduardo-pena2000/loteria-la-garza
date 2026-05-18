package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzeg implements r {
    public final /* synthetic */ zzek zza;

    public /* synthetic */ zzeg(zzek zzekVar) {
        this.zza = zzekVar;
    }

    public final void accept(Object obj, Object obj2) {
        ((zzal) ((zzff) obj).getService()).zzd(new zzej(this.zza, (TaskCompletionSource) obj2), "unusedServerClientId");
    }
}
