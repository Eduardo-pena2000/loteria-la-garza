package com.google.android.gms.internal.games_v2;

import W6.k;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzck implements r {
    public final /* synthetic */ boolean zza;
    public final /* synthetic */ String[] zzb;

    public /* synthetic */ zzck(boolean z, String[] strArr) {
        this.zza = z;
        this.zzb = strArr;
    }

    public final void accept(Object obj, Object obj2) {
        ((k) obj).f((TaskCompletionSource) obj2, this.zza, this.zzb);
    }
}
