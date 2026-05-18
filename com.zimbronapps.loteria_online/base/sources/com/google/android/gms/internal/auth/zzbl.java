package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;
import n6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzbl implements r {
    public final /* synthetic */ zzbo zza;
    public final /* synthetic */ b zzb;

    public /* synthetic */ zzbl(zzbo zzboVar, b bVar) {
        this.zza = zzboVar;
        this.zzb = bVar;
    }

    public final void accept(Object obj, Object obj2) {
        zzbo zzboVar = this.zza;
        b bVar = this.zzb;
        ((zzbh) ((zzbe) obj).getService()).zze(new zzbm(zzboVar, (TaskCompletionSource) obj2), bVar);
    }
}
