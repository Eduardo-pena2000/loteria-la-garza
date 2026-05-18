package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbfh implements Runnable {
    final /* synthetic */ zzbfl zza;

    public zzbfh(zzbfl zzbflVar) {
        Objects.requireNonNull(zzbflVar);
        this.zza = zzbflVar;
    }

    public final void run() {
        this.zza.zzg();
    }
}
