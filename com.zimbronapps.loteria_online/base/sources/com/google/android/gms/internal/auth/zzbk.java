package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzbk implements r {
    public final /* synthetic */ zzbo zza;

    public /* synthetic */ zzbk(zzbo zzboVar) {
        this.zza = zzboVar;
    }

    public final void accept(Object obj, Object obj2) {
        ((zzbh) ((zzbe) obj).getService()).zzd(new zzbn(this.zza, (TaskCompletionSource) obj2));
    }
}
