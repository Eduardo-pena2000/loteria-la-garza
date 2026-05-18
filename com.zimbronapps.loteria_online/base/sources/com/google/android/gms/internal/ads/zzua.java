package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzua extends MediaCodec.Callback {
    private final HandlerThread zzb;
    private Handler zzc;
    private MediaFormat zzh;
    private MediaFormat zzi;
    private MediaCodec.CodecException zzj;
    private MediaCodec.CryptoException zzk;
    private long zzl;
    private boolean zzm;
    private IllegalStateException zzn;
    private zzuj zzo;
    private final Object zza = new Object();
    private final w.e zzd = new w.e();
    private final w.e zze = new w.e();
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();

    public zzua(HandlerThread handlerThread) {
        this.zzb = handlerThread;
    }

    private final void zzj() {
        ArrayDeque arrayDeque = this.zzg;
        if (!arrayDeque.isEmpty()) {
            this.zzi = (MediaFormat) arrayDeque.getLast();
        }
        this.zzd.b();
        this.zze.b();
        this.zzf.clear();
        arrayDeque.clear();
    }

    private final boolean zzk() {
        return this.zzl > 0 || this.zzm;
    }

    private final void zzl(MediaFormat mediaFormat) {
        this.zze.a(-2);
        this.zzg.add(mediaFormat);
    }

    private final void zzm() {
        IllegalStateException illegalStateException = this.zzn;
        if (illegalStateException != null) {
            this.zzn = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.zzj;
        if (codecException != null) {
            this.zzj = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.zzk;
        if (cryptoException == null) {
            return;
        }
        this.zzk = null;
        throw cryptoException;
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.zza) {
            this.zzk = cryptoException;
        }
    }

    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.zza) {
            this.zzj = codecException;
        }
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.zza) {
            try {
                this.zzd.a(i);
                zzuj zzujVar = this.zzo;
                if (zzujVar != null) {
                    zzuu zzuuVar = ((zzus) zzujVar).zza;
                    if (zzuuVar.zzbf() != null) {
                        zzuuVar.zzbf().zza();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            try {
                MediaFormat mediaFormat = this.zzi;
                if (mediaFormat != null) {
                    zzl(mediaFormat);
                    this.zzi = null;
                }
                this.zze.a(i);
                this.zzf.add(bufferInfo);
                zzuj zzujVar = this.zzo;
                if (zzujVar != null) {
                    zzuu zzuuVar = ((zzus) zzujVar).zza;
                    if (zzuuVar.zzbf() != null) {
                        zzuuVar.zzbf().zza();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.zza) {
            zzl(mediaFormat);
            this.zzi = null;
        }
    }

    public final void zza(MediaCodec mediaCodec) {
        zzgrc.zzi(this.zzc == null);
        HandlerThread handlerThread = this.zzb;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.zzc = handler;
    }

    public final void zzb() {
        synchronized (this.zza) {
            this.zzm = true;
            this.zzb.quit();
            zzj();
        }
    }

    public final void zzc(Runnable runnable) {
        synchronized (this.zza) {
            zzm();
            runnable.run();
        }
    }

    public final int zzd() {
        synchronized (this.zza) {
            try {
                zzm();
                int i = -1;
                if (zzk()) {
                    return -1;
                }
                w.e eVar = this.zzd;
                if (!eVar.d()) {
                    i = eVar.e();
                }
                return i;
            } finally {
            }
        }
    }

    public final int zze(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            try {
                zzm();
                if (zzk()) {
                    return -1;
                }
                w.e eVar = this.zze;
                if (eVar.d()) {
                    return -1;
                }
                int e = eVar.e();
                if (e >= 0) {
                    if (this.zzh == null) {
                        throw null;
                    }
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.zzf.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (e == -2) {
                    this.zzh = (MediaFormat) this.zzg.remove();
                    e = -2;
                }
                return e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final MediaFormat zzf() {
        MediaFormat mediaFormat;
        synchronized (this.zza) {
            try {
                mediaFormat = this.zzh;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public final void zzg() {
        synchronized (this.zza) {
            this.zzl++;
            Handler handler = this.zzc;
            String str = zzfj.zza;
            handler.post(new zztz(this));
        }
    }

    public final void zzh(zzuj zzujVar) {
        synchronized (this.zza) {
            this.zzo = zzujVar;
        }
    }

    public final /* synthetic */ void zzi() {
        Object obj = this.zza;
        synchronized (obj) {
            try {
                if (this.zzm) {
                    return;
                }
                long j = this.zzl - 1;
                this.zzl = j;
                if (j > 0) {
                    return;
                }
                if (j >= 0) {
                    zzj();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (obj) {
                    this.zzn = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
