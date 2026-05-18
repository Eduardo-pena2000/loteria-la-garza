package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzevr implements zzfax {
    private final zzgzy zza;
    private final zzdvu zzb;
    private final String zzc;
    private final zzfjk zzd;

    public zzevr(zzgzy zzgzyVar, zzdvu zzdvuVar, zzfjk zzfjkVar, String str) {
        this.zza = zzgzyVar;
        this.zzb = zzdvuVar;
        this.zzd = zzfjkVar;
        this.zzc = str;
    }

    public final x7.e zza() {
        return this.zza.submit(new zzevq(this));
    }

    public final int zzb() {
        return 17;
    }

    public final /* synthetic */ zzevs zzc() {
        zzfjk zzfjkVar = this.zzd;
        zzdvu zzdvuVar = this.zzb;
        return new zzevs(zzdvuVar.zzb(zzfjkVar.zzg, this.zzc), zzdvuVar.zzc());
    }
}
