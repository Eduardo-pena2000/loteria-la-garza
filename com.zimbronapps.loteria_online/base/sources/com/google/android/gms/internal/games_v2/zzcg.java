package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzcg implements zzap {
    public final /* synthetic */ String zza;
    public final /* synthetic */ int zzb;

    public /* synthetic */ zzcg(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final Task zza(g gVar) {
        return gVar.doWrite(w.builder().b(new zzci(this.zza, this.zzb)).e(6729).a());
    }
}
