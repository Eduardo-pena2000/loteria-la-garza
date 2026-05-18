package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzckp implements Runnable {
    private final /* synthetic */ zzckr zza;
    private final /* synthetic */ int zzb;
    private final /* synthetic */ int zzc;
    private final /* synthetic */ boolean zzd;
    private final /* synthetic */ boolean zze;

    public /* synthetic */ zzckp(zzckr zzckrVar, int i, int i2, boolean z, boolean z2) {
        this.zza = zzckrVar;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = z;
        this.zze = z2;
    }

    public final /* synthetic */ void run() {
        this.zza.zzu(this.zzb, this.zzc, this.zzd, this.zze);
    }
}
