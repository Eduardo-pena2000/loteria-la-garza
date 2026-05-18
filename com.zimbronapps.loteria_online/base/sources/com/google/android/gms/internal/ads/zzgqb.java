package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzgqb implements Runnable {
    private final /* synthetic */ zzgqf zza;
    private final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzgqb(zzgqf zzgqfVar, Runnable runnable) {
        this.zza = zzgqfVar;
        this.zzb = runnable;
    }

    public final /* synthetic */ void run() {
        this.zza.zze(this.zzb);
    }
}
