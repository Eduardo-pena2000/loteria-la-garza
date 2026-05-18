package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeel extends zzeeq {
    private final Context zzg;
    private final W5.a zzh;
    private final zzeek zzi;

    public zzeel(Context context, W5.a aVar, zzeek zzeekVar, zzbyx zzbyxVar) {
        this.zzg = context;
        this.zzh = aVar;
        this.zzi = zzeekVar;
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzi(this.zzh.a);
                    this.zzi.zza();
                } catch (RemoteException e) {
                    this.zzi.zzb(e);
                }
            }
        }
    }

    public final void onConnectionFailed(v6.b bVar) {
        super.onConnectionFailed(bVar);
        this.zzi.zzb(new RemoteException("Connection failed: ".concat(String.valueOf(bVar.O1()))));
    }

    public final void onConnectionSuspended(int i) {
        int i2 = o0.b;
        W5.p.a("Cannot connect to remote service, fallback to local instance.");
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 33);
        sb.append("Connection suspended with cause: ");
        sb.append(i);
        this.zzi.zzb(new RemoteException(sb.toString()));
    }

    public final void zza() {
        synchronized (this.zzb) {
            try {
                if (this.zzc) {
                    return;
                }
                this.zzc = true;
                zzbyw zzbywVar = new zzbyw(this.zzg, R5.t.w().a(), this, this);
                this.zzf = zzbywVar;
                zzbywVar.checkAvailabilityAndConnect();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
