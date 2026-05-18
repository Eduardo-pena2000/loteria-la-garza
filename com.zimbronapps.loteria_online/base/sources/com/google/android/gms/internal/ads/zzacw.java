package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzacw extends zzacv implements Choreographer.FrameCallback {
    public /* synthetic */ zzacw(Choreographer choreographer, DisplayManager displayManager, byte[] bArr) {
        super(choreographer, displayManager, null);
    }

    private static long zzc(DisplayManager displayManager) {
        if (displayManager.getDisplay(0) != null) {
            return (long) (1.0E9d / r4.getRefreshRate());
        }
        zzee.zzc("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        return -9223372036854775807L;
    }

    public final void doFrame(long j) {
        this.zzc = j;
        this.zza.postFrameCallbackDelayed(this, 500L);
    }

    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.zza.postFrameCallback(this);
            this.zzd = zzc(this.zzb);
        }
    }

    public final void zza() {
        super.zza();
        this.zza.postFrameCallback(this);
        this.zzd = zzc(this.zzb);
    }

    public final void zzb() {
        this.zzb.unregisterDisplayListener(this);
        this.zza.removeFrameCallback(this);
        this.zzc = -9223372036854775807L;
        this.zzd = -9223372036854775807L;
    }
}
