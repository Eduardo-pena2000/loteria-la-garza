package com.google.android.gms.internal.games_v2;

import W6.k;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzeo implements r {
    public final /* synthetic */ String zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzeo(String str, boolean z, int i) {
        this.zza = str;
        this.zzb = z;
        this.zzc = i;
    }

    public final void accept(Object obj, Object obj2) {
        ((k) obj).p((TaskCompletionSource) obj2, this.zza, this.zzb, this.zzc);
    }
}
