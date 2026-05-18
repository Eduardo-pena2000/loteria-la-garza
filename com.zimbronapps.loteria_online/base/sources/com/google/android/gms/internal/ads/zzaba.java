package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.Objects;

@SuppressLint({"HandlerLeak"})
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzaba extends Handler implements Runnable {
    final /* synthetic */ zzabf zza;
    private final zzabb zzb;
    private final long zzc;
    private zzaax zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaba(zzabf zzabfVar, Looper looper, zzabb zzabbVar, zzaax zzaaxVar, int i, long j) {
        super(looper);
        Objects.requireNonNull(zzabfVar);
        this.zza = zzabfVar;
        this.zzb = zzabbVar;
        this.zzd = zzaaxVar;
        this.zzc = j;
    }

    private final void zzd() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.zzc;
        zzaax zzaaxVar = this.zzd;
        zzaaxVar.getClass();
        zzaaxVar.zzC(this.zzb, elapsedRealtime, j, this.zzf);
        this.zze = null;
        zzabf zzabfVar = this.zza;
        zzaba zzj = zzabfVar.zzj();
        zzj.getClass();
        zzabfVar.zzi().execute(zzj);
    }

    public final void handleMessage(Message message) {
        if (this.zzi) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            zzd();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        zzabf zzabfVar = this.zza;
        zzabfVar.zzk(null);
        long j = this.zzc;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = elapsedRealtime - j;
        zzaax zzaaxVar = this.zzd;
        zzaaxVar.getClass();
        if (this.zzh) {
            zzaaxVar.zzA(this.zzb, elapsedRealtime, j2, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 2) {
            try {
                zzaaxVar.zzB(this.zzb, elapsedRealtime, j2);
                return;
            } catch (RuntimeException e) {
                zzee.zzf("LoadTask", "Unexpected exception handling load completed", e);
                this.zza.zzl(new zzabe(e));
                return;
            }
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.zze = iOException;
        int i3 = this.zzf + 1;
        this.zzf = i3;
        zzaaz zzz = zzaaxVar.zzz(this.zzb, elapsedRealtime, j2, iOException, i3);
        if (zzz.zzb() == 3) {
            zzabfVar.zzl(this.zze);
        } else if (zzz.zzb() != 2) {
            if (zzz.zzb() == 1) {
                this.zzf = 1;
            }
            zzb(zzz.zzc() != -9223372036854775807L ? zzz.zzc() : Math.min((this.zzf - 1) * 1000, 5000));
        }
    }

    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (!z) {
                zzabb zzabbVar = this.zzb;
                String simpleName = zzabbVar.getClass().getSimpleName();
                StringBuilder sb = new StringBuilder(simpleName.length() + 5);
                sb.append("load:");
                sb.append(simpleName);
                Trace.beginSection(sb.toString());
                try {
                    zzabbVar.zzc();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (Exception e) {
            if (this.zzi) {
                return;
            }
            zzee.zzf("LoadTask", "Unexpected exception loading stream", e);
            obtainMessage(3, new zzabe(e)).sendToTarget();
        } catch (OutOfMemoryError e2) {
            if (this.zzi) {
                return;
            }
            zzee.zzf("LoadTask", "OutOfMemory error loading stream", e2);
            obtainMessage(3, new zzabe(e2)).sendToTarget();
        } catch (Error e3) {
            if (!this.zzi) {
                zzee.zzf("LoadTask", "Unexpected error loading stream", e3);
                obtainMessage(4, e3).sendToTarget();
            }
            throw e3;
        } catch (IOException e4) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, e4).sendToTarget();
        }
    }

    public final void zza(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i) {
            throw iOException;
        }
    }

    public final void zzb(long j) {
        zzabf zzabfVar = this.zza;
        zzgrc.zzi(zzabfVar.zzj() == null);
        zzabfVar.zzk(this);
        if (j > 0) {
            sendEmptyMessageDelayed(1, j);
        } else {
            zzd();
        }
    }

    public final void zzc(boolean z) {
        this.zzi = z;
        this.zze = null;
        if (hasMessages(1)) {
            this.zzh = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.zzh = true;
                    this.zzb.zzb();
                    Thread thread = this.zzg;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.zza.zzk(null);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zzaax zzaaxVar = this.zzd;
            zzaaxVar.getClass();
            zzaaxVar.zzA(this.zzb, elapsedRealtime, elapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }
}
