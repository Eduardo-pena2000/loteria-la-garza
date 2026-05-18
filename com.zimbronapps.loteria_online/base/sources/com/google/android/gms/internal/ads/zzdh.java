package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdh {
    private static Executor zza;

    public static synchronized Executor zza() {
        Executor executor;
        synchronized (zzdh.class) {
            try {
                if (zza == null) {
                    zza = zzfj.zzf("ExoPlayer:BackgroundExecutor");
                }
                executor = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executor;
    }
}
