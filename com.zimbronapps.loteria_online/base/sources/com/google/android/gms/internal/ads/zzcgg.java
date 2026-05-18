package com.google.android.gms.internal.ads;

import V5.F0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcgg implements Runnable {
    private final zzcfs zza;
    private boolean zzb = false;

    public zzcgg(zzcfs zzcfsVar) {
        this.zza = zzcfsVar;
    }

    private final void zzc() {
        zzfyn zzfynVar = F0.l;
        zzfynVar.removeCallbacks(this);
        zzfynVar.postDelayed(this, 250L);
    }

    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzF();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzF();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
