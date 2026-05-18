package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzgpc implements Runnable {
    private final /* synthetic */ zzgpo zza;
    private final /* synthetic */ zzgpv zzb;
    private final /* synthetic */ int zzc;
    private final /* synthetic */ zzgpt zzd;

    public /* synthetic */ zzgpc(zzgpo zzgpoVar, zzgpv zzgpvVar, int i, zzgpt zzgptVar) {
        this.zza = zzgpoVar;
        this.zzb = zzgpvVar;
        this.zzc = i;
        this.zzd = zzgptVar;
    }

    public final /* synthetic */ void run() {
        this.zza.zzg(this.zzb, this.zzc, this.zzd);
    }
}
