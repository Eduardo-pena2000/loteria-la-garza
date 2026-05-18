package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzty implements zzul {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzdq zzg;
    private boolean zzh;

    public zzty(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzdq zzdqVar = new zzdq(zzdn.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdqVar;
        this.zzf = new AtomicReference();
    }

    private static zztx zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new zztx();
                }
                return (zztx) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static int[] zzj(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    private static byte[] zzk(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final void zza() {
        if (this.zzh) {
            return;
        }
        HandlerThread handlerThread = this.zzd;
        handlerThread.start();
        this.zze = new zztw(this, handlerThread.getLooper());
        this.zzh = true;
    }

    public final void zzb(int i, int i2, int i3, long j, int i4) {
        zzg();
        zztx zzi = zzi();
        zzi.zza(i, 0, i3, j, i4);
        Handler handler = this.zze;
        String str = zzfj.zza;
        handler.obtainMessage(1, zzi).sendToTarget();
    }

    public final void zzc(int i, int i2, zzie zzieVar, long j, int i3) {
        zzg();
        zztx zzi = zzi();
        zzi.zza(i, 0, 0, j, i3);
        MediaCodec.CryptoInfo cryptoInfo = zzi.zzd;
        cryptoInfo.numSubSamples = zzieVar.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zzieVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zzieVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] zzk = zzk(zzieVar.zzb, cryptoInfo.key);
        zzk.getClass();
        cryptoInfo.key = zzk;
        byte[] zzk2 = zzk(zzieVar.zza, cryptoInfo.iv);
        zzk2.getClass();
        cryptoInfo.iv = zzk2;
        cryptoInfo.mode = zzieVar.zzc;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzieVar.zzg, zzieVar.zzh));
        Handler handler = this.zze;
        String str = zzfj.zza;
        handler.obtainMessage(2, zzi).sendToTarget();
    }

    public final void zzd(Bundle bundle) {
        zzg();
        Handler handler = this.zze;
        String str = zzfj.zza;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    public final void zze() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages((Object) null);
                zzdq zzdqVar = this.zzg;
                zzdqVar.zzb();
                Handler handler2 = this.zze;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(3).sendToTarget();
                zzdqVar.zzc();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void zzf() {
        if (this.zzh) {
            zze();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    public final void zzg() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet((Object) null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void zzh(android.os.Message r11) {
        /*
            r10 = this;
            int r0 = r11.what
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L59
            r1 = 2
            if (r0 == r1) goto L37
            r1 = 3
            if (r0 == r1) goto L31
            r1 = 4
            if (r0 == r1) goto L20
            java.util.concurrent.atomic.AtomicReference r0 = r10.zzf
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            int r11 = r11.what
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r1.<init>(r11)
            z.Y.a(r0, r2, r1)
            goto L73
        L20:
            java.lang.Object r11 = r11.obj
            android.os.Bundle r11 = (android.os.Bundle) r11
            android.media.MediaCodec r0 = r10.zzc     // Catch: java.lang.RuntimeException -> L2a
            r0.setParameters(r11)     // Catch: java.lang.RuntimeException -> L2a
            goto L73
        L2a:
            r11 = move-exception
            java.util.concurrent.atomic.AtomicReference r0 = r10.zzf
            z.Y.a(r0, r2, r11)
            goto L73
        L31:
            com.google.android.gms.internal.ads.zzdq r11 = r10.zzg
            r11.zza()
            goto L73
        L37:
            java.lang.Object r11 = r11.obj
            com.google.android.gms.internal.ads.zztx r11 = (com.google.android.gms.internal.ads.zztx) r11
            int r4 = r11.zza
            android.media.MediaCodec$CryptoInfo r6 = r11.zzd
            long r7 = r11.zze
            int r9 = r11.zzf
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzty.zzb     // Catch: java.lang.RuntimeException -> L51
            monitor-enter(r0)     // Catch: java.lang.RuntimeException -> L51
            android.media.MediaCodec r3 = r10.zzc     // Catch: java.lang.Throwable -> L4e
            r5 = 0
            r3.queueSecureInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            goto L57
        L4e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            throw r1     // Catch: java.lang.RuntimeException -> L51
        L51:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r1 = r10.zzf
            z.Y.a(r1, r2, r0)
        L57:
            r2 = r11
            goto L73
        L59:
            java.lang.Object r11 = r11.obj
            com.google.android.gms.internal.ads.zztx r11 = (com.google.android.gms.internal.ads.zztx) r11
            int r4 = r11.zza
            int r6 = r11.zzc
            long r7 = r11.zze
            int r9 = r11.zzf
            android.media.MediaCodec r3 = r10.zzc     // Catch: java.lang.RuntimeException -> L6c
            r5 = 0
            r3.queueInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.RuntimeException -> L6c
            goto L57
        L6c:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r1 = r10.zzf
            z.Y.a(r1, r2, r0)
            goto L57
        L73:
            if (r2 == 0) goto L80
            java.util.ArrayDeque r11 = com.google.android.gms.internal.ads.zzty.zza
            monitor-enter(r11)
            r11.add(r2)     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L7d
            return
        L7d:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L7d
            throw r0
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzty.zzh(android.os.Message):void");
    }
}
