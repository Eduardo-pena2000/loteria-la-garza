package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzes implements zzap {
    public final /* synthetic */ String zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ boolean zzc;
    public final /* synthetic */ int zzd;

    public /* synthetic */ zzes(String str, boolean z, boolean z2, int i) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = i;
    }

    public final Task zza(g gVar) {
        return gVar.doRead(w.builder().b(new zzel(this.zza, this.zzb, this.zzc, this.zzd)).e(6719).a());
    }
}
