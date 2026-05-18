package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfua implements Runnable {
    final /* synthetic */ zzfub zza;
    private final WebView zzb;

    public zzfua(zzfub zzfubVar) {
        Objects.requireNonNull(zzfubVar);
        this.zza = zzfubVar;
        this.zzb = zzfubVar.zzq();
    }

    public final void run() {
        this.zzb.destroy();
    }
}
