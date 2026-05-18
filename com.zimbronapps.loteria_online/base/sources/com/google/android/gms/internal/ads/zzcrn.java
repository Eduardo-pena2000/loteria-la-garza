package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzcrn implements Runnable {
    private final /* synthetic */ zzcro zza;
    private final /* synthetic */ Throwable zzb;
    private final /* synthetic */ zzfqk zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ W5.w zze;

    public /* synthetic */ zzcrn(zzcro zzcroVar, Throwable th, zzfqk zzfqkVar, String str, W5.w wVar) {
        this.zza = zzcroVar;
        this.zzb = th;
        this.zzc = zzfqkVar;
        this.zzd = str;
        this.zze = wVar;
    }

    public final /* synthetic */ void run() {
        boolean booleanValue = ((Boolean) S5.D.c().zzd(zzbhe.zzlM)).booleanValue();
        Throwable th = this.zzb;
        zzcro zzcroVar = this.zza;
        if (booleanValue) {
            zzcrv zzcrvVar = zzcroVar.zzd;
            zzbyr zzc = zzbyp.zzc(zzcrvVar.zzi());
            zzcrvVar.zzb = zzc;
            zzc.zzh(th, "AttributionReporting.registerSourceAndPingClickUrl");
        } else {
            zzcrv zzcrvVar2 = zzcroVar.zzd;
            zzbyr zza = zzbyp.zza(zzcrvVar2.zzi());
            zzcrvVar2.zza = zza;
            zza.zzh(th, "AttributionReportingSampled.registerSourceAndPingClickUrl");
        }
        W5.w wVar = this.zze;
        this.zzc.zzb(this.zzd, wVar, null, null);
    }
}
