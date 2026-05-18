package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzdh implements zzap {
    public final /* synthetic */ String zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ int zzd;
    public final /* synthetic */ boolean zze;

    public /* synthetic */ zzdh(String str, int i, int i2, int i3, boolean z) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = z;
    }

    public final Task zza(g gVar) {
        return gVar.doRead(w.builder().b(new zzdf(this.zza, this.zzb, this.zzc, this.zzd, this.zze)).e(6704).a());
    }
}
