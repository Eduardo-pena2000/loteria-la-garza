package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeua implements zzfax {
    private final zzgzy zza;
    private final zzfjk zzb;
    private final zzcdz zzc;

    public zzeua(zzgzy zzgzyVar, zzfjk zzfjkVar, zzcdz zzcdzVar) {
        this.zza = zzgzyVar;
        this.zzb = zzfjkVar;
        this.zzc = zzcdzVar;
    }

    public final x7.e zza() {
        return this.zza.submit(new zzetz(this));
    }

    public final int zzb() {
        return 9;
    }

    public final /* synthetic */ zzeub zzc() {
        return new zzeub(this.zzb.zzk, this.zzc.zzl());
    }
}
