package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzup {
    private static Boolean zza;

    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (Build.VERSION.SDK_INT < 29) {
            return 0;
        }
        Boolean bool = zza;
        if (bool == null || !bool.booleanValue()) {
            return zzuo.zza(videoCapabilities, i, i2, d);
        }
        return 0;
    }

    public static /* synthetic */ Boolean zzb() {
        return zza;
    }

    public static /* synthetic */ void zzc(Boolean bool) {
        zza = bool;
    }
}
