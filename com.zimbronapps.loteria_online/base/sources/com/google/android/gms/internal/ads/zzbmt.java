package com.google.android.gms.internal.ads;

import S5.Y;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbmt implements Runnable {
    final /* synthetic */ M5.b zza;
    final /* synthetic */ Y zzb;
    final /* synthetic */ zzbmu zzc;

    public zzbmt(zzbmu zzbmuVar, M5.b bVar, Y y) {
        this.zza = bVar;
        this.zzb = y;
        Objects.requireNonNull(zzbmuVar);
        this.zzc = zzbmuVar;
    }

    public final void run() {
        if (this.zza.f(this.zzb)) {
            this.zzc.zzc();
            throw null;
        }
        W5.p.f("Could not bind.");
    }
}
