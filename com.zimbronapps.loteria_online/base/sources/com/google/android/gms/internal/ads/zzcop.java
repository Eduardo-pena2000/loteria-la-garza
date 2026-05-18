package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcop implements zzfik {
    private final zzcnp zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcop(zzcnp zzcnpVar, byte[] bArr) {
        this.zza = zzcnpVar;
    }

    public final zzfil zza() {
        zziko.zzc(this.zzb, Context.class);
        return new zzcoq(this.zza, this.zzb, this.zzc);
    }

    public final /* synthetic */ zzfik zzb(String str) {
        this.zzc = str;
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfik zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
