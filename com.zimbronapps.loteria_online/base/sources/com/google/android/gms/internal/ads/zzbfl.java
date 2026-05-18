package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.d;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbfl {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzbfh(this);
    private final Object zzc = new Object();
    private zzbfo zzd;
    private Context zze;
    private zzbfr zzf;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final void zzf() {
        synchronized (this.zzc) {
            try {
                if (this.zze != null && this.zzd == null) {
                    zzbfo zze = zze(new zzbfj(this), new zzbfk(this));
                    this.zzd = zze;
                    zze.checkAvailabilityAndConnect();
                }
            } finally {
            }
        }
    }

    public final void zza(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            try {
                if (this.zze != null) {
                    return;
                }
                this.zze = context.getApplicationContext();
                if (((Boolean) S5.D.c().zzd(zzbhe.zzff)).booleanValue()) {
                    zzf();
                } else {
                    if (((Boolean) S5.D.c().zzd(zzbhe.zzfe)).booleanValue()) {
                        R5.t.k().zzb(new zzbfi(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzfg)).booleanValue()) {
            synchronized (this.zzc) {
                try {
                    zzf();
                    ScheduledFuture scheduledFuture = this.zza;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.zza = zzcei.zzd.schedule(this.zzb, ((Long) S5.D.c().zzd(zzbhe.zzfh)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final zzbfm zzc(zzbfp zzbfpVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzbfm();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzf(zzbfpVar);
                }
                return this.zzf.zze(zzbfpVar);
            } catch (RemoteException e) {
                int i = o0.b;
                W5.p.d("Unable to call into cache service.", e);
                return new zzbfm();
            }
        }
    }

    public final long zzd(zzbfp zzbfpVar) {
        synchronized (this.zzc) {
            try {
                if (this.zzf == null) {
                    return -2L;
                }
                if (this.zzd.zzp()) {
                    try {
                        return this.zzf.zzg(zzbfpVar);
                    } catch (RemoteException e) {
                        int i = o0.b;
                        W5.p.d("Unable to call into cache service.", e);
                    }
                }
                return -2L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized zzbfo zze(d.a aVar, d.b bVar) {
        return new zzbfo(this.zze, R5.t.w().a(), aVar, bVar);
    }

    public final /* synthetic */ void zzg() {
        synchronized (this.zzc) {
            try {
                zzbfo zzbfoVar = this.zzd;
                if (zzbfoVar == null) {
                    return;
                }
                if (zzbfoVar.isConnected() || this.zzd.isConnecting()) {
                    this.zzd.disconnect();
                }
                this.zzd = null;
                this.zzf = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ Object zzh() {
        return this.zzc;
    }

    public final /* synthetic */ zzbfo zzi() {
        return this.zzd;
    }

    public final /* synthetic */ void zzj(zzbfo zzbfoVar) {
        this.zzd = null;
    }

    public final /* synthetic */ void zzk(zzbfr zzbfrVar) {
        this.zzf = zzbfrVar;
    }
}
