package com.google.android.gms.internal.games_v2;

import W6.k;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzcx implements r {
    public final /* synthetic */ String zza;
    public final /* synthetic */ long zzb;

    public /* synthetic */ zzcx(String str, long j) {
        this.zza = str;
        this.zzb = j;
    }

    public final void accept(Object obj, Object obj2) {
        ((k) obj).v((TaskCompletionSource) obj2, this.zza, this.zzb, (String) null);
    }
}
