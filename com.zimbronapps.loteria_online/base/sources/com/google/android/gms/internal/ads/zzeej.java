package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeej extends zzeeq {
    private final Context zzg;
    private final Executor zzh;

    public zzeej(Context context, Executor executor) {
        this.zzg = context;
        this.zzh = executor;
        this.zzf = new zzbyw(context, R5.t.w().a(), this, this);
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    try {
                        this.zzf.zzp().zze(this.zze, ((Boolean) S5.D.c().zzd(zzbhe.zzou)).booleanValue() ? new zzeep(this.zza, this.zze) : new zzeeo(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzeff(1));
                    } catch (Throwable th) {
                        R5.t.l().zzg(th, "RemoteAdRequestClientTask.onConnected");
                        this.zza.zzd(new zzeff(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void onConnectionFailed(v6.b bVar) {
        int i = o0.b;
        W5.p.a("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzeff(1));
    }

    public final x7.e zza(zzbzu zzbzuVar) {
        synchronized (this.zzb) {
            try {
                if (this.zzc) {
                    return this.zza;
                }
                this.zzc = true;
                this.zze = zzbzuVar;
                this.zzf.checkAvailabilityAndConnect();
                zzcen zzcenVar = this.zza;
                zzcenVar.addListener(new zzeei(this), zzcei.zzg);
                zzeeq.zzc(this.zzg, zzcenVar, this.zzh);
                return zzcenVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
