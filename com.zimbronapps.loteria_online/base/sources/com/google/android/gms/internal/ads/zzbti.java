package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbti {
    private final zzbsl zza;
    private x7.e zzb;

    public zzbti(zzbsl zzbslVar) {
        this.zza = zzbslVar;
    }

    private final void zzd() {
        if (this.zzb == null) {
            zzcen zzcenVar = new zzcen();
            this.zzb = zzcenVar;
            this.zza.zzb(null).zze(new zzbth(zzcenVar), new zzbte(zzcenVar));
        }
    }

    public final zzbtl zza(String str, zzbss zzbssVar, zzbsr zzbsrVar) {
        zzd();
        return new zzbtl(this.zzb, "google.afma.activeView.handleUpdate", zzbssVar, zzbsrVar);
    }

    public final void zzb(String str, zzboh zzbohVar) {
        zzd();
        this.zzb = zzgzo.zzj(this.zzb, new zzbtf(str, zzbohVar), zzcei.zzg);
    }

    public final void zzc(String str, zzboh zzbohVar) {
        this.zzb = zzgzo.zzk(this.zzb, new zzbtg(str, zzbohVar), zzcei.zzg);
    }
}
