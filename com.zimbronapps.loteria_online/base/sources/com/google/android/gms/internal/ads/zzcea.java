package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzcea implements Runnable {
    private final /* synthetic */ AtomicBoolean zza;

    public /* synthetic */ zzcea(AtomicBoolean atomicBoolean) {
        this.zza = atomicBoolean;
    }

    public final /* synthetic */ void run() {
        this.zza.getAndSet(true);
    }
}
