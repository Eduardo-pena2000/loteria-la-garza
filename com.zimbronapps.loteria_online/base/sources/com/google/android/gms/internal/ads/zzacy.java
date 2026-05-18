package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzacy extends zzacv implements Choreographer.VsyncCallback {
    private final Handler zzf;

    public /* synthetic */ zzacy(Choreographer choreographer, DisplayManager displayManager, byte[] bArr) {
        super(choreographer, displayManager, null);
        this.zzf = zzfj.zzc(null);
    }

    public final void onDisplayChanged(int i) {
        if (i == 0) {
            a.a(this.zza, this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.zzc = c.a(frameData);
        Choreographer.FrameTimeline[] a = d.a(frameData);
        if (a.length >= 2) {
            long a2 = e.a(a[1]) - e.a(a[0]);
            this.zzd = a2 != 0 ? a2 : -9223372036854775807L;
        } else {
            this.zzd = -9223372036854775807L;
        }
        this.zzf.postDelayed(new zzacx(this), 500L);
    }

    public final void zza() {
        super.zza();
        a.a(this.zza, this);
    }

    public final void zzb() {
        this.zzb.unregisterDisplayListener(this);
        this.zzf.removeCallbacksAndMessages((Object) null);
        b.a(this.zza, this);
        this.zzc = -9223372036854775807L;
        this.zzd = -9223372036854775807L;
    }
}
