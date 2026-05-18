package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzvh implements zzuk {
    private final MediaCodec zza;
    private final zzug zzb;

    public /* synthetic */ zzvh(MediaCodec mediaCodec, zzug zzugVar, byte[] bArr) {
        this.zza = mediaCodec;
        this.zzb = zzugVar;
        if (Build.VERSION.SDK_INT < 35 || zzugVar == null) {
            return;
        }
        zzugVar.zzb(mediaCodec);
    }

    public final void zza(int i, int i2, int i3, long j, int i4) {
        this.zza.queueInputBuffer(i, 0, i3, j, i4);
    }

    public final void zzb(int i, int i2, zzie zzieVar, long j, int i3) {
        this.zza.queueSecureInputBuffer(i, 0, zzieVar.zzb(), j, i3);
    }

    public final void zzc(int i, boolean z) {
        this.zza.releaseOutputBuffer(i, false);
    }

    public final void zzd(int i, long j) {
        this.zza.releaseOutputBuffer(i, j);
    }

    public final int zze() {
        return this.zza.dequeueInputBuffer(0L);
    }

    public final int zzf(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    public final MediaFormat zzg() {
        return this.zza.getOutputFormat();
    }

    public final ByteBuffer zzh(int i) {
        return this.zza.getInputBuffer(i);
    }

    public final ByteBuffer zzj(int i) {
        return this.zza.getOutputBuffer(i);
    }

    public final void zzk() {
        this.zza.flush();
    }

    public final void zzl() {
        zzug zzugVar;
        zzug zzugVar2;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                this.zza.stop();
            }
            if (i >= 35 && (zzugVar2 = this.zzb) != null) {
                zzugVar2.zzc(this.zza);
            }
            this.zza.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && (zzugVar = this.zzb) != null) {
                zzugVar.zzc(this.zza);
            }
            this.zza.release();
            throw th;
        }
    }

    public final void zzn(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    public final void zzo() {
        M.a(this.zza);
    }

    public final void zzp(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    public final void zzq(int i) {
        this.zza.setVideoScalingMode(i);
    }

    public final void zzr(List list) {
        N.a(this.zza, list);
    }
}
