package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzeko implements zzgqt {
    private final /* synthetic */ zzcjl zza;
    private final /* synthetic */ zzfir zzb;
    private final /* synthetic */ zzcti zzc;

    public /* synthetic */ zzeko(zzekr zzekrVar, zzcjl zzcjlVar, zzfir zzfirVar, zzcti zzctiVar) {
        this.zza = zzcjlVar;
        this.zzb = zzfirVar;
        this.zzc = zzctiVar;
    }

    public final /* synthetic */ Object apply(Object obj) {
        zzcjl zzcjlVar = this.zza;
        if (this.zzb.zzM) {
            zzcjlVar.zzav();
        }
        zzcti zzctiVar = this.zzc;
        zzcjlVar.zzJ();
        zzcjlVar.onPause();
        return zzctiVar.zzh();
    }
}
