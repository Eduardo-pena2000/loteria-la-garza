package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzgyp implements Runnable {
    private final /* synthetic */ zzgyq zza;
    private final /* synthetic */ int zzb;
    private final /* synthetic */ x7.e zzc;

    public /* synthetic */ zzgyp(zzgyq zzgyqVar, int i, x7.e eVar) {
        this.zza = zzgyqVar;
        this.zzb = i;
        this.zzc = eVar;
    }

    public final /* synthetic */ void run() {
        this.zza.zzy(this.zzb, this.zzc);
    }
}
