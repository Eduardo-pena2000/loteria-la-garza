package com.google.android.gms.internal.ads;

import android.view.Surface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzacu {
    public static void zza(Surface surface, float f) {
        try {
            m3.p.a(surface, f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            zzee.zzf("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
