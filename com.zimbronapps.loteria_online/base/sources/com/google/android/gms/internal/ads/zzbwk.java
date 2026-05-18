package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbwk implements Runnable {
    final /* synthetic */ AdOverlayInfoParcel zza;
    final /* synthetic */ zzbwl zzb;

    public zzbwk(zzbwl zzbwlVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        Objects.requireNonNull(zzbwlVar);
        this.zzb = zzbwlVar;
    }

    public final void run() {
        R5.t.f();
        U5.A.a(this.zzb.zza(), this.zza, true, null);
    }
}
