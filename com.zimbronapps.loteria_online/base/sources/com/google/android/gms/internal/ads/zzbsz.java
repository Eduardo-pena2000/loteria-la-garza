package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbsz {
    static final V5.E zza = new zzbsx();
    static final V5.E zzb = new zzbsy();
    private final zzbsl zzc;

    public zzbsz(Context context, W5.a aVar, String str, zzfor zzforVar) {
        this.zzc = new zzbsl(context, aVar, str, zza, zzb, zzforVar);
    }

    public final zzbsp zza(String str, zzbss zzbssVar, zzbsr zzbsrVar) {
        return new zzbtd(this.zzc, str, zzbssVar, zzbsrVar);
    }

    public final zzbti zzb() {
        return new zzbti(this.zzc);
    }

    public final void zzc() {
        this.zzc.zzc();
    }
}
