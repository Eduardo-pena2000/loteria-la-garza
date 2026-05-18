package com.google.android.gms.internal.games_v2;

import a7.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzda implements zzap {
    public final /* synthetic */ f zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzda(f fVar, int i, int i2) {
        this.zza = fVar;
        this.zzb = i;
        this.zzc = i2;
    }

    public final Task zza(g gVar) {
        return gVar.doRead(w.builder().b(new zzcz(this.zza, this.zzb, this.zzc)).e(6706).a());
    }
}
