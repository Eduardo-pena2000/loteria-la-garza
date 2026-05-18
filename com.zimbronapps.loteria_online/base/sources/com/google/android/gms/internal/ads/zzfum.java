package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfum implements Runnable {
    final /* synthetic */ zzfur zza;

    public zzfum(zzfur zzfurVar) {
        Objects.requireNonNull(zzfurVar);
        this.zza = zzfurVar;
    }

    public final void run() {
        this.zza.zzh().zzc();
    }
}
