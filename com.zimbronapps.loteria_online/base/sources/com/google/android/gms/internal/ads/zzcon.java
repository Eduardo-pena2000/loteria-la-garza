package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcon implements zzegd {
    private final zzcnp zza;
    private final zzcom zzb;
    private zzeek zzc;

    public /* synthetic */ zzcon(zzcnp zzcnpVar, zzcom zzcomVar, byte[] bArr) {
        this.zza = zzcnpVar;
        this.zzb = zzcomVar;
    }

    public final zzege zza() {
        zziko.zzc(this.zzc, zzeek.class);
        return new zzcoo(this.zza, this.zzb, this.zzc);
    }

    public final /* bridge */ /* synthetic */ zzegd zzb(zzeek zzeekVar) {
        this.zzc = zzeekVar;
        return this;
    }
}
