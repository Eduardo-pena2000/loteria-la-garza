package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzacd extends HandlerThread implements Handler.Callback {
    private zzdt zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzace zze;

    public zzacd() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final boolean handleMessage(Message message) {
        zzdt zzdtVar;
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    int i2 = message.arg1;
                    zzdt zzdtVar2 = this.zza;
                    if (zzdtVar2 == null) {
                        throw null;
                    }
                    zzdtVar2.zza(i2);
                    this.zze = new zzace(this, this.zza.zzc(), i2 != 0, null);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e) {
                    zzee.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.zzd = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (zzdu e2) {
                    zzee.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.zzd = new IllegalStateException(e2);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e3) {
                    zzee.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.zzc = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    zzdtVar = this.zza;
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                if (zzdtVar == null) {
                    throw null;
                }
                zzdtVar.zzb();
                return true;
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    public final zzace zza(int i) {
        boolean z;
        start();
        this.zzb = new Handler(getLooper(), this);
        this.zza = new zzdt(this.zzb, null);
        synchronized (this) {
            z = false;
            this.zzb.obtainMessage(1, i, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.zzc;
        if (error != null) {
            throw error;
        }
        zzace zzaceVar = this.zze;
        zzaceVar.getClass();
        return zzaceVar;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}
