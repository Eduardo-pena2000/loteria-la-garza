package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzfh implements ThreadFactory {
    public /* synthetic */ zzfh(String str) {
    }

    public final /* synthetic */ Thread newThread(Runnable runnable) {
        String str = zzfj.zza;
        return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
    }
}
