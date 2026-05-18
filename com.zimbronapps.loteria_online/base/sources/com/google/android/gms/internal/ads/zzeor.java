package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzeor implements zzgqt {
    private final /* synthetic */ zzcjl zza;
    private final /* synthetic */ zzfir zzb;
    private final /* synthetic */ zzdua zzc;

    public /* synthetic */ zzeor(zzeot zzeotVar, zzcjl zzcjlVar, zzfir zzfirVar, zzdua zzduaVar) {
        this.zza = zzcjlVar;
        this.zzb = zzfirVar;
        this.zzc = zzduaVar;
    }

    public final /* synthetic */ Object apply(Object obj) {
        zzcjl zzcjlVar = this.zza;
        if (this.zzb.zzM) {
            zzcjlVar.zzav();
        }
        zzdua zzduaVar = this.zzc;
        zzcjlVar.zzJ();
        zzcjlVar.onPause();
        return zzduaVar.zzh();
    }
}
