package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zztv implements zzuk {
    private final MediaCodec zza;
    private final zzua zzb;
    private final zzul zzc;
    private final zzug zzd;
    private boolean zze;
    private int zzf = 0;

    public /* synthetic */ zztv(MediaCodec mediaCodec, HandlerThread handlerThread, zzul zzulVar, zzug zzugVar, byte[] bArr) {
        this.zza = mediaCodec;
        this.zzb = new zzua(handlerThread);
        this.zzc = zzulVar;
        this.zzd = zzugVar;
    }

    public static /* synthetic */ String zzu(int i) {
        return zzw(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static /* synthetic */ String zzv(int i) {
        return zzw(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String zzw(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    public final void zza(int i, int i2, int i3, long j, int i4) {
        this.zzc.zzb(i, 0, i3, j, i4);
    }

    public final void zzb(int i, int i2, zzie zzieVar, long j, int i3) {
        this.zzc.zzc(i, 0, zzieVar, j, i3);
    }

    public final void zzc(int i, boolean z) {
        this.zza.releaseOutputBuffer(i, false);
    }

    public final void zzd(int i, long j) {
        this.zza.releaseOutputBuffer(i, j);
    }

    public final int zze() {
        this.zzc.zzg();
        return this.zzb.zzd();
    }

    public final int zzf(MediaCodec.BufferInfo bufferInfo) {
        this.zzc.zzg();
        return this.zzb.zze(bufferInfo);
    }

    public final MediaFormat zzg() {
        return this.zzb.zzf();
    }

    public final ByteBuffer zzh(int i) {
        return this.zza.getInputBuffer(i);
    }

    public final void zzi(Runnable runnable) {
        this.zzb.zzc(new zztr(this, runnable));
    }

    public final ByteBuffer zzj(int i) {
        return this.zza.getOutputBuffer(i);
    }

    public final void zzk() {
        this.zzc.zze();
        MediaCodec mediaCodec = this.zza;
        mediaCodec.flush();
        this.zzb.zzg();
        mediaCodec.start();
    }

    public final void zzl() {
        zzug zzugVar;
        zzug zzugVar2;
        zzug zzugVar3;
        try {
            try {
                if (this.zzf == 1) {
                    this.zzc.zzf();
                    this.zzb.zzb();
                }
                this.zzf = 2;
                if (this.zze) {
                    return;
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.zza.stop();
                }
                if (i >= 35 && (zzugVar3 = this.zzd) != null) {
                    zzugVar3.zzc(this.zza);
                }
                this.zza.release();
                this.zze = true;
            } catch (Throwable th) {
                if (!this.zze) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        this.zza.stop();
                    }
                    if (i2 >= 35 && (zzugVar2 = this.zzd) != null) {
                        zzugVar2.zzc(this.zza);
                    }
                    this.zza.release();
                    this.zze = true;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT >= 35 && (zzugVar = this.zzd) != null) {
                zzugVar.zzc(this.zza);
            }
            this.zza.release();
            this.zze = true;
            throw th2;
        }
    }

    public final boolean zzm(zzuj zzujVar) {
        this.zzb.zzh(zzujVar);
        return true;
    }

    public final void zzn(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    public final void zzo() {
        M.a(this.zza);
    }

    public final void zzp(Bundle bundle) {
        this.zzc.zzd(bundle);
    }

    public final void zzq(int i) {
        this.zza.setVideoScalingMode(i);
    }

    public final void zzr(List list) {
        N.a(this.zza, list);
    }

    public final /* synthetic */ void zzs(Runnable runnable) {
        this.zzc.zzg();
        this.zzb.zzc(runnable);
    }

    public final /* synthetic */ void zzt(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        zzug zzugVar;
        zzua zzuaVar = this.zzb;
        MediaCodec mediaCodec = this.zza;
        zzuaVar.zza(mediaCodec);
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i);
        Trace.endSection();
        this.zzc.zza();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (zzugVar = this.zzd) != null) {
            zzugVar.zzb(mediaCodec);
        }
        this.zzf = 1;
    }
}
