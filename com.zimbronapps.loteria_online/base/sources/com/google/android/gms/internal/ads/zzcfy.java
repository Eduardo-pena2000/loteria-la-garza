package com.google.android.gms.internal.ads;

import V5.F0;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcfy {
    private long zzb;
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) S5.D.c().zzd(zzbhe.zzan)).longValue());
    private boolean zzc = true;

    public final void zza() {
        this.zzc = true;
    }

    public final void zzb(SurfaceTexture surfaceTexture, zzcfj zzcfjVar) {
        if (zzcfjVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.zzc) {
            long j = timestamp - this.zzb;
            if (Math.abs(j) < this.zza) {
                return;
            }
        }
        this.zzc = false;
        this.zzb = timestamp;
        F0.l.post(new zzcfx(zzcfjVar));
    }
}
