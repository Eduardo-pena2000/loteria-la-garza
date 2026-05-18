package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzcp implements zzap {
    public final /* synthetic */ String zza;
    public final /* synthetic */ long zzb;

    public /* synthetic */ zzcp(String str, long j) {
        this.zza = str;
        this.zzb = j;
    }

    public final Task zza(g gVar) {
        return gVar.doWrite(w.builder().b(new zzcx(this.zza, this.zzb)).e(6707).a());
    }
}
