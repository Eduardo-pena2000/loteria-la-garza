package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzeca implements NativeAd.c {
    private final /* synthetic */ zzecc zza;
    private final /* synthetic */ String zzb;

    public /* synthetic */ zzeca(zzecc zzeccVar, String str) {
        this.zza = zzeccVar;
        this.zzb = str;
    }

    public final /* synthetic */ void onNativeAdLoaded(NativeAd nativeAd) {
        this.zza.zzf(this.zzb, nativeAd);
    }
}
