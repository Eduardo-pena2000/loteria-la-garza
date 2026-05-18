package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzayy implements Runnable {
    final /* synthetic */ zzayz zza;

    public zzayy(zzayz zzayzVar) {
        Objects.requireNonNull(zzayzVar);
        this.zza = zzayzVar;
    }

    public final void run() {
        zzayz zzayzVar = this.zza;
        synchronized (zzayzVar.zzp()) {
            if (zzayzVar.zzq()) {
                return;
            }
            zzayzVar.zzr(true);
            try {
                zzayzVar.zzn();
            } catch (Exception e) {
                this.zza.zzo().zzc(2023, -1L, e);
            }
            zzayz zzayzVar2 = this.zza;
            synchronized (zzayzVar2.zzp()) {
                zzayzVar2.zzr(false);
            }
        }
    }
}
