package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzgqe implements zzgru {
    public /* synthetic */ zzgqe(String str) {
    }

    public final /* synthetic */ Object zza() {
        HandlerThread handlerThread = new HandlerThread("OverlayDisplayService", 10);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }
}
