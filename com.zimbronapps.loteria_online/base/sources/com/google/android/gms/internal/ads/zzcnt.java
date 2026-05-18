package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcnt implements zzfdu {
    private final zzcnp zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcnt(zzcnp zzcnpVar, byte[] bArr) {
        this.zza = zzcnpVar;
    }

    public final zzfdv zza() {
        zziko.zzc(this.zzb, Context.class);
        zziko.zzc(this.zzc, String.class);
        return new zzcnu(this.zza, this.zzb, this.zzc);
    }

    public final /* bridge */ /* synthetic */ zzfdu zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfdu zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
