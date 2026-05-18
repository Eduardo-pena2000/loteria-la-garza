package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbxh extends zzbmf {
    private final NativeAd.c zza;

    public zzbxh(NativeAd.c cVar) {
        this.zza = cVar;
    }

    public final void zze(zzbmm zzbmmVar) {
        this.zza.onNativeAdLoaded(new zzbxc(zzbmmVar));
    }
}
