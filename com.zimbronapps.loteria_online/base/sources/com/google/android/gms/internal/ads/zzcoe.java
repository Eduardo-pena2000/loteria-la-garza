package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcoe implements zzdzq {
    private final zzcnp zza;
    private Context zzb;
    private zzbph zzc;

    public /* synthetic */ zzcoe(zzcnp zzcnpVar, byte[] bArr) {
        this.zza = zzcnpVar;
    }

    public final zzdzr zza() {
        zziko.zzc(this.zzb, Context.class);
        zziko.zzc(this.zzc, zzbph.class);
        return new zzcof(this.zza, this.zzb, this.zzc);
    }

    public final /* bridge */ /* synthetic */ zzdzq zzb(zzbph zzbphVar) {
        zzbphVar.getClass();
        this.zzc = zzbphVar;
        return this;
    }

    public final /* bridge */ /* synthetic */ zzdzq zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
