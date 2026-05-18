package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcfm implements Runnable {
    final /* synthetic */ zzcfs zza;

    public zzcfm(zzcfs zzcfsVar) {
        Objects.requireNonNull(zzcfsVar);
        this.zza = zzcfsVar;
    }

    public final void run() {
        this.zza.zzI("surfaceCreated", new String[0]);
    }
}
