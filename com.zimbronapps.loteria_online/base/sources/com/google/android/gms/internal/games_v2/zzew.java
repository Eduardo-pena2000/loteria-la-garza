package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzew implements zzap {
    public final /* synthetic */ String zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzew(String str, boolean z, int i) {
        this.zza = str;
        this.zzb = z;
        this.zzc = i;
    }

    public final Task zza(g gVar) {
        return gVar.doWrite(w.builder().b(new zzeo(this.zza, this.zzb, this.zzc)).e(6721).a());
    }
}
