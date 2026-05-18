package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzaro implements Runnable {
    private final zzary zza;
    private final zzase zzb;
    private final Runnable zzc;

    public zzaro(zzary zzaryVar, zzase zzaseVar, Runnable runnable) {
        this.zza = zzaryVar;
        this.zzb = zzaseVar;
        this.zzc = runnable;
    }

    public final void run() {
        zzary zzaryVar = this.zza;
        zzaryVar.zzl();
        zzase zzaseVar = this.zzb;
        if (zzaseVar.zzc()) {
            zzaryVar.zzs(zzaseVar.zza);
        } else {
            zzaryVar.zzt(zzaseVar.zzc);
        }
        if (zzaseVar.zzd) {
            zzaryVar.zzc("intermediate-response");
        } else {
            zzaryVar.zzd("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}
