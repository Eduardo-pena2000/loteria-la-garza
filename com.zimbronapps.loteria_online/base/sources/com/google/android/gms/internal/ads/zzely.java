package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzely implements zzgqt {
    private final /* synthetic */ zzcjl zza;
    private final /* synthetic */ zzfir zzb;
    private final /* synthetic */ zzdko zzc;

    public /* synthetic */ zzely(zzemc zzemcVar, zzcjl zzcjlVar, zzfir zzfirVar, zzdko zzdkoVar) {
        this.zza = zzcjlVar;
        this.zzb = zzfirVar;
        this.zzc = zzdkoVar;
    }

    public final /* synthetic */ Object apply(Object obj) {
        zzcjl zzcjlVar = this.zza;
        if (this.zzb.zzM) {
            zzcjlVar.zzav();
        }
        zzdko zzdkoVar = this.zzc;
        zzcjlVar.zzJ();
        zzcjlVar.onPause();
        return zzdkoVar.zzh();
    }
}
