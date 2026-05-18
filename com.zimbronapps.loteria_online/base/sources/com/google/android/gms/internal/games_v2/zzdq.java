package com.google.android.gms.internal.games_v2;

import W6.k;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzdq implements r {
    public final /* synthetic */ String zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ boolean zzc;

    public /* synthetic */ zzdq(String str, int i, boolean z) {
        this.zza = str;
        this.zzb = i;
        this.zzc = z;
    }

    public final void accept(Object obj, Object obj2) {
        ((k) obj).m((TaskCompletionSource) obj2, this.zza, this.zzb, false, this.zzc);
    }
}
