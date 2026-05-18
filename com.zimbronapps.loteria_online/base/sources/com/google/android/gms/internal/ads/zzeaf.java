package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzeaf implements Runnable {
    private final /* synthetic */ zzeak zza;
    private final /* synthetic */ Object zzb;
    private final /* synthetic */ zzcen zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ long zze;
    private final /* synthetic */ zzfoe zzf;

    public /* synthetic */ zzeaf(zzeak zzeakVar, Object obj, zzcen zzcenVar, String str, long j, zzfoe zzfoeVar) {
        this.zza = zzeakVar;
        this.zzb = obj;
        this.zzc = zzcenVar;
        this.zzd = str;
        this.zze = j;
        this.zzf = zzfoeVar;
    }

    public final /* synthetic */ void run() {
        this.zza.zzi(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
