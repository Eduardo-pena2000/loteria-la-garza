package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgyh;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzhad extends zzgyh.zzf implements Runnable {
    private final Runnable zza;

    public zzhad(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zzb(th);
            throw th;
        }
    }

    public final String zzd() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 7);
        sb.append("task=[");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }
}
