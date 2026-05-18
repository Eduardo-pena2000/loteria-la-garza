package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzcw implements zzap {
    public final /* synthetic */ String zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzcw(String str, int i, int i2) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
    }

    public final Task zza(g gVar) {
        return gVar.doRead(w.builder().b(new zzcq(this.zza, this.zzb, this.zzc)).e(6701).a());
    }
}
