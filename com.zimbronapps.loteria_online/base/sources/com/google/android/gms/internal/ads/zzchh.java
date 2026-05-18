package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzchh implements Runnable {
    final /* synthetic */ zzchj zza;

    public zzchh(zzchj zzchjVar) {
        Objects.requireNonNull(zzchjVar);
        this.zza = zzchjVar;
    }

    public final void run() {
        R5.t.b().zzd(this.zza);
    }
}
