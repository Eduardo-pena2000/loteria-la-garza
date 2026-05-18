package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfc implements zzdn {
    public final long zza() {
        return System.currentTimeMillis();
    }

    public final long zzb() {
        return SystemClock.elapsedRealtime();
    }

    public final long zzc() {
        return System.nanoTime();
    }

    public final zzdx zzd(Looper looper, Handler.Callback callback) {
        return new zzfe(new Handler(looper, callback));
    }
}
