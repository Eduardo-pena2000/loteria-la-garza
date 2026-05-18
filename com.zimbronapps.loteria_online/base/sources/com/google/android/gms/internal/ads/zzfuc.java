package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfuc {
    private static UiModeManager zza;

    public static void zza(Context context) {
        if (context != null) {
            zza = (UiModeManager) context.getSystemService("uimode");
        }
    }

    public static zzfsp zzb() {
        UiModeManager uiModeManager = zza;
        if (uiModeManager == null) {
            return zzfsp.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? zzfsp.OTHER : zzfsp.CTV : zzfsp.MOBILE;
    }
}
