package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcro implements zzgzl {
    final /* synthetic */ zzfqk zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ W5.w zzc;
    final /* synthetic */ zzcrv zzd;

    public zzcro(zzcrv zzcrvVar, zzfqk zzfqkVar, String str, W5.w wVar) {
        this.zza = zzfqkVar;
        this.zzb = str;
        this.zzc = wVar;
        Objects.requireNonNull(zzcrvVar);
        this.zzd = zzcrvVar;
    }

    public final void zza(Throwable th) {
        this.zzd.zzj().submit(new zzcrn(this, th, this.zza, this.zzb, this.zzc));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzd.zzj().submit(new zzcrm(this.zza, (String) obj, this.zzc));
    }
}
