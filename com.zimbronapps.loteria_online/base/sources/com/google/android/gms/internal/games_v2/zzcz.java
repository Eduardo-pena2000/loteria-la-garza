package com.google.android.gms.internal.games_v2;

import W6.k;
import a7.f;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzcz implements r {
    public final /* synthetic */ f zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzcz(f fVar, int i, int i2) {
        this.zza = fVar;
        this.zzb = i;
        this.zzc = i2;
    }

    public final void accept(Object obj, Object obj2) {
        ((k) obj).i((TaskCompletionSource) obj2, this.zza, this.zzb, this.zzc);
    }
}
