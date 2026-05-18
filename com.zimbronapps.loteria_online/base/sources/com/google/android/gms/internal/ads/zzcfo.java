package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcfo implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcfs zzb;

    public zzcfo(zzcfs zzcfsVar, boolean z) {
        this.zza = z;
        Objects.requireNonNull(zzcfsVar);
        this.zzb = zzcfsVar;
    }

    public final void run() {
        this.zzb.zzI("windowVisibilityChanged", new String[]{"isVisible", String.valueOf(this.zza)});
    }
}
