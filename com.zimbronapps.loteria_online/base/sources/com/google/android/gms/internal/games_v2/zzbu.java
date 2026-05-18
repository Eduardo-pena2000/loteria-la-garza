package com.google.android.gms.internal.games_v2;

import W6.k;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzbu implements r {
    public final /* synthetic */ String zza;
    public final /* synthetic */ int zzb;

    public /* synthetic */ zzbu(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final void accept(Object obj, Object obj2) {
        ((k) obj).t((TaskCompletionSource) obj2, this.zza, this.zzb);
    }
}
