package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbbw implements Runnable {
    final /* synthetic */ zzbbx zza;

    public zzbbw(zzbbx zzbbxVar) {
        Objects.requireNonNull(zzbbxVar);
        this.zza = zzbbxVar;
    }

    public final void run() {
        this.zza.zzb();
    }
}
