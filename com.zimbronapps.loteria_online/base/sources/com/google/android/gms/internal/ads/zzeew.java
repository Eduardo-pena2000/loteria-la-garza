package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeew extends zzeeq {
    private String zzg;
    private int zzh = 1;

    public zzeew(Context context) {
        this.zzf = new zzbyw(context, R5.t.w().a(), this, this);
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    try {
                        int i = this.zzh;
                        if (i == 2) {
                            this.zzf.zzp().zzg(this.zze, ((Boolean) S5.D.c().zzd(zzbhe.zzou)).booleanValue() ? new zzeep(this.zza, this.zze) : new zzeeo(this));
                        } else if (i == 3) {
                            this.zzf.zzp().zzh(this.zzg, ((Boolean) S5.D.c().zzd(zzbhe.zzou)).booleanValue() ? new zzeep(this.zza, this.zze) : new zzeeo(this));
                        } else {
                            this.zza.zzd(new zzeff(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzeff(1));
                    } catch (Throwable th) {
                        R5.t.l().zzg(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
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
                int i = this.zzh;
                if (i != 1 && i != 2) {
                    return zzgzo.zzc(new zzeff(2));
                }
                if (this.zzc) {
                    return this.zza;
                }
                this.zzh = 2;
                this.zzc = true;
                this.zze = zzbzuVar;
                this.zzf.checkAvailabilityAndConnect();
                zzcen zzcenVar = this.zza;
                zzcenVar.addListener(new zzeev(this), zzcei.zzg);
                return zzcenVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final x7.e zzd(String str) {
        synchronized (this.zzb) {
            try {
                int i = this.zzh;
                if (i != 1 && i != 3) {
                    return zzgzo.zzc(new zzeff(2));
                }
                if (this.zzc) {
                    return this.zza;
                }
                this.zzh = 3;
                this.zzc = true;
                this.zzg = str;
                this.zzf.checkAvailabilityAndConnect();
                zzcen zzcenVar = this.zza;
                zzcenVar.addListener(new zzeeu(this), zzcei.zzg);
                return zzcenVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
