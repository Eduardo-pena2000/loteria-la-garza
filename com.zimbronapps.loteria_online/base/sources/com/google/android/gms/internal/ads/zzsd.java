package com.google.android.gms.internal.ads;

import T2.f0;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzsd implements zzqc {
    private static final Object zza = new Object();
    private static ScheduledExecutorService zzb;
    private static int zzc;
    private final AudioTrack zzd;
    private final zzql zze;
    private zzru zzf;
    private final zzsk zzg;
    private final boolean zzh;
    private final int zzi;
    private final zzsc zzj;
    private final zzed zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private final zzsh zzr;

    public zzsd(AudioTrack audioTrack, zzql zzqlVar, zzsh zzshVar, zzdn zzdnVar) {
        this.zzd = audioTrack;
        this.zze = zzqlVar;
        this.zzr = zzshVar;
        zzed zzedVar = new zzed(Thread.currentThread());
        this.zzk = zzedVar;
        zzedVar.zzg(false);
        boolean zzA = zzfj.zzA(zzqlVar.zza);
        this.zzh = zzA;
        if (zzA) {
            this.zzi = zzfj.zzD(zzqlVar.zza) * Integer.bitCount(zzqlVar.zzc);
        } else {
            this.zzi = -1;
        }
        this.zzg = new zzsk(new zzrw(this, null), zzdnVar, audioTrack, zzqlVar.zza, this.zzi, zzqlVar.zze);
        if (zzshVar != null) {
            this.zzf = new zzru(audioTrack, zzshVar, null);
        }
        this.zzj = zzg() ? new zzsc(this, null) : null;
    }

    public static /* synthetic */ void zzp(AudioTrack audioTrack, Handler handler, zzed zzedVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new zzro(zzedVar));
            }
            synchronized (zza) {
                try {
                    int i = zzc - 1;
                    zzc = i;
                    if (i == 0) {
                        ScheduledExecutorService scheduledExecutorService = zzb;
                        if (scheduledExecutorService == null) {
                            throw null;
                        }
                        scheduledExecutorService.shutdown();
                        zzb = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new zzrp(zzedVar));
            }
            synchronized (zza) {
                try {
                    int i2 = zzc - 1;
                    zzc = i2;
                    if (i2 == 0) {
                        ScheduledExecutorService scheduledExecutorService2 = zzb;
                        if (scheduledExecutorService2 == null) {
                            throw null;
                        }
                        scheduledExecutorService2.shutdown();
                        zzb = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public final long zzq() {
        if (!this.zzh) {
            return this.zzn;
        }
        long j = this.zzm;
        int i = this.zzi;
        String str = zzfj.zza;
        return ((j + r2) - 1) / i;
    }

    public final void zza() {
        this.zzg.zzb();
        if (!this.zzl || zzg()) {
            this.zzd.play();
        }
    }

    public final void zzb() {
        this.zzg.zzf();
        if (!this.zzl || zzg()) {
            this.zzd.pause();
        }
    }

    public final boolean zzc(ByteBuffer byteBuffer, int i, long j) throws zzqb {
        zzsh zzshVar;
        boolean z = this.zzh;
        if (!z && this.zzo == 0) {
            this.zzo = zzsw.zzD(this.zze.zza, byteBuffer);
        }
        zzq();
        int underrunCount = this.zzd.getUnderrunCount();
        int i2 = this.zzp;
        this.zzp = underrunCount;
        if (underrunCount > i2) {
            zzed zzedVar = this.zzk;
            zzedVar.zzd(-1, zzrn.zza);
            zzedVar.zze();
        }
        int remaining = byteBuffer.remaining();
        int write = this.zzd.write(byteBuffer, byteBuffer.remaining(), 1);
        if (write >= 0) {
            r2 = write == remaining;
            if (z) {
                this.zzm += write;
            } else if (r2) {
                this.zzn += this.zzo * i;
            }
            return r2;
        }
        if (write != -6 && write != -32) {
            r2 = false;
        }
        if (r2 && (zzshVar = this.zzr) != null) {
            zzsi zzsiVar = zzshVar.zza;
            if (zzsiVar.zzi() != null) {
                zzps zzpsVar = zzps.zza;
                zzsiVar.zzh(zzpsVar);
                zzsiVar.zzi().zza(zzpsVar);
            }
        }
        throw new zzqb(write, r2);
    }

    public final void zzd() {
        if (this.zzl) {
            return;
        }
        this.zzl = true;
        this.zzg.zze(zzq());
        this.zzd.stop();
    }

    public final void zze() {
        if (this.zzg.zzc()) {
            this.zzd.pause();
        }
        if (Build.VERSION.SDK_INT >= 29 && zzg()) {
            zzsc zzscVar = this.zzj;
            zzscVar.getClass();
            zzscVar.zza();
        }
        zzru zzruVar = this.zzf;
        if (zzruVar != null) {
            zzruVar.zzd();
            this.zzf = null;
        }
        AudioTrack audioTrack = this.zzd;
        zzed zzedVar = this.zzk;
        Handler zzc2 = zzfj.zzc(null);
        synchronized (zza) {
            try {
                if (zzb == null) {
                    zzb = zzfj.zzg("ExoPlayer:AudioTrackReleaseThread");
                }
                zzc++;
                zzb.schedule(new zzrq(audioTrack, zzc2, zzedVar), 20L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzf(float f) {
        this.zzd.setVolume(f);
    }

    public final boolean zzg() {
        return Build.VERSION.SDK_INT >= 29 && V2.H.a(this.zzd);
    }

    public final int zzh() {
        return this.zzd.getAudioSessionId();
    }

    public final int zzi() {
        return this.zzd.getSampleRate();
    }

    public final long zzj() {
        return this.zzd.getBufferSizeInFrames();
    }

    public final long zzk() {
        return this.zzg.zza();
    }

    public final boolean zzl() {
        return this.zzg.zzd(zzq());
    }

    public final void zzm(zzqa zzqaVar) {
        this.zzk.zzb(zzqaVar);
    }

    public final void zzn(zzpq zzpqVar) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        LogSessionId zza2 = zzpqVar.zza();
        if (V2.N.a(zza2, f0.a())) {
            return;
        }
        V2.O.a(this.zzd, zza2);
    }

    public final void zzo(AudioDeviceInfo audioDeviceInfo) {
        this.zzd.setPreferredDevice(audioDeviceInfo);
    }

    public final /* synthetic */ AudioTrack zzr() {
        return this.zzd;
    }

    public final /* synthetic */ zzed zzs() {
        return this.zzk;
    }
}
