package com.google.android.gms.internal.games_v2;

import c7.a;
import c7.g;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzfc implements zzap {
    public final /* synthetic */ a zza;
    public final /* synthetic */ g zzb;

    public /* synthetic */ zzfc(a aVar, g gVar) {
        this.zza = aVar;
        this.zzb = gVar;
    }

    public final Task zza(com.google.android.gms.common.api.g gVar) {
        return gVar.doWrite(w.builder().b(new zzeu(this.zza, this.zzb)).e(6722).a());
    }
}
