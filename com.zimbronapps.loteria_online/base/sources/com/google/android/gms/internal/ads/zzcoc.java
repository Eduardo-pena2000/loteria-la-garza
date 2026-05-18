package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcoc implements zzdzj {
    private final zzcnp zza;
    private final zzcof zzb;
    private Long zzc;
    private String zzd;

    public /* synthetic */ zzcoc(zzcnp zzcnpVar, zzcof zzcofVar, byte[] bArr) {
        this.zza = zzcnpVar;
        this.zzb = zzcofVar;
    }

    public final zzdzk zza() {
        zziko.zzc(this.zzc, Long.class);
        zziko.zzc(this.zzd, String.class);
        return new zzcod(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final /* bridge */ /* synthetic */ zzdzj zzb(String str) {
        str.getClass();
        this.zzd = str;
        return this;
    }

    public final /* bridge */ /* synthetic */ zzdzj zzc(long j) {
        this.zzc = Long.valueOf(j);
        return this;
    }
}
