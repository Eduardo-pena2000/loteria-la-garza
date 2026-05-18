package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzdg implements zzap {
    public final /* synthetic */ String zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzdg(String str, long j, String str2) {
        this.zza = str;
        this.zzb = j;
        this.zzc = str2;
    }

    public final Task zza(g gVar) {
        return gVar.doWrite(w.builder().b(new zzde(this.zza, this.zzb, this.zzc)).e(6707).a());
    }
}
