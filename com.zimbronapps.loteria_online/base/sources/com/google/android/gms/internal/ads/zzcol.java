package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcol implements zzefw {
    private final zzcnp zza;
    private Context zzb;

    public /* synthetic */ zzcol(zzcnp zzcnpVar, byte[] bArr) {
        this.zza = zzcnpVar;
    }

    public final zzefx zza() {
        zziko.zzc(this.zzb, Context.class);
        return new zzcom(this.zza, this.zzb);
    }

    public final /* bridge */ /* synthetic */ zzefw zzb(Context context) {
        this.zzb = context;
        return this;
    }
}
