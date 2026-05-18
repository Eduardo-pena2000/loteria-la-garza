package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzfaa implements Runnable {
    private final /* synthetic */ zzfad zza;
    private final /* synthetic */ zzbvs zzb;
    private final /* synthetic */ Bundle zzc;
    private final /* synthetic */ List zzd;
    private final /* synthetic */ zzeqn zze;
    private final /* synthetic */ zzcen zzf;

    public /* synthetic */ zzfaa(zzfad zzfadVar, zzbvs zzbvsVar, Bundle bundle, List list, zzeqn zzeqnVar, zzcen zzcenVar) {
        this.zza = zzfadVar;
        this.zzb = zzbvsVar;
        this.zzc = bundle;
        this.zzd = list;
        this.zze = zzeqnVar;
        this.zzf = zzcenVar;
    }

    public final /* synthetic */ void run() {
        this.zza.zze(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
