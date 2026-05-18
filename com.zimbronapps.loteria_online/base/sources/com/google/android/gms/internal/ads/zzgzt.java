package com.google.android.gms.internal.ads;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgzt extends AbstractOwnableSynchronizer implements Runnable {
    private final zzgzv zza;

    public /* synthetic */ zzgzt(zzgzv zzgzvVar, byte[] bArr) {
        this.zza = zzgzvVar;
    }

    public final void run() {
    }

    public final String toString() {
        return this.zza.toString();
    }

    public final /* synthetic */ void zza(Thread thread) {
        super.setExclusiveOwnerThread(thread);
    }
}
