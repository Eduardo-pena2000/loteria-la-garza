package com.google.android.gms.internal.games_v2;

import c7.b;
import c7.g;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzet implements zzap {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ g zzc;
    public final /* synthetic */ b zzd;

    public /* synthetic */ zzet(String str, String str2, g gVar, b bVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = gVar;
        this.zzd = bVar;
    }

    public final Task zza(com.google.android.gms.common.api.g gVar) {
        return gVar.doWrite(w.builder().b(new zzep(this.zza, this.zzb, this.zzc, this.zzd)).e(6725).a());
    }
}
