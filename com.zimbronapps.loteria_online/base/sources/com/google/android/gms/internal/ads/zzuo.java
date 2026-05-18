package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzuo {
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        List a = c3.p.a(videoCapabilities);
        if (a == null || a.isEmpty()) {
            return 0;
        }
        int zzc = zzc(a, c3.n.a(i, i2, (int) d));
        boolean z = true;
        if (zzc == 1 && zzup.zzb() == null) {
            int zzb = Build.VERSION.SDK_INT >= 35 ? 2 : zzb(false);
            int zzb2 = zzb(true);
            if (zzb != 0 && (zzb2 != 0 ? !(zzb != 2 || zzb2 != 2) : zzb == 2)) {
                z = false;
            }
            zzup.zzc(Boolean.valueOf(z));
            if (zzup.zzb().booleanValue()) {
                return 0;
            }
        }
        return zzc;
    }

    private static int zzb(boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List a;
        try {
            zzt zztVar = new zzt();
            zztVar.zzm("video/avc");
            zzv zzM = zztVar.zzM();
            if (zzM.zzo != null) {
                List zzc = zzvg.zzc(zzuw.zzb, zzM, z, false);
                for (int i = 0; i < zzc.size(); i++) {
                    if (((zzun) zzc.get(i)).zzd != null && (videoCapabilities = ((zzun) zzc.get(i)).zzd.getVideoCapabilities()) != null && (a = c3.p.a(videoCapabilities)) != null && !a.isEmpty()) {
                        c3.o.a();
                        return zzc(a, c3.n.a(1280, 720, 60));
                    }
                }
            }
        } catch (zzuy unused) {
        }
        return 0;
    }

    private static int zzc(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i = 0; i < list.size(); i++) {
            if (c3.r.a(c3.q.a(list.get(i)), performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
