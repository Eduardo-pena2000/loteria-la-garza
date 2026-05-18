package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzckj implements Runnable {
    final /* synthetic */ zzcko zza;

    public zzckj(zzcko zzckoVar) {
        Objects.requireNonNull(zzckoVar);
        this.zza = zzckoVar;
    }

    public final void run() {
        zzcko.zzaT(this.zza);
    }
}
