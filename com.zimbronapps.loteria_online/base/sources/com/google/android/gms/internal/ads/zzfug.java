package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfug {
    private static int zza = 2;

    public static void zza(Context context) {
        context.registerReceiver(new zzfuf(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int zzb() {
        if (zzfuc.zzb() != zzfsp.CTV) {
            return 2;
        }
        return zza;
    }

    public static /* synthetic */ void zzc(int i) {
        zza = i;
    }
}
