package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzaz {
    private static final zzbl zza;

    static {
        zzbl zzayVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            zzayVar = new zzax();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            zzayVar = new zzay();
        }
        zza = zzayVar;
    }

    public static zzbl zza() {
        return zza;
    }
}
