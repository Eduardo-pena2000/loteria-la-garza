package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzayf implements Runnable {
    private zzayf() {
        throw null;
    }

    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzayg.zzf(MessageDigest.getInstance("MD5"));
            countDownLatch = zzayg.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzayg.zzb;
        } catch (Throwable th) {
            zzayg.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    public /* synthetic */ zzayf(byte[] bArr) {
    }
}
