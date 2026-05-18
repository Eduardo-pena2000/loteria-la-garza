package com.google.android.gms.internal.ads;

import V5.o0;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzelw extends zzcaq implements zzdcp {
    private zzcar zza;
    private zzdco zzb;
    private zzdjx zzc;

    public final synchronized void zza(zzdco zzdcoVar) {
        this.zzb = zzdcoVar;
    }

    public final synchronized void zzc(zzcar zzcarVar) {
        this.zza = zzcarVar;
    }

    public final synchronized void zzd(zzdjx zzdjxVar) {
        this.zzc = zzdjxVar;
    }

    public final synchronized void zze(N6.a aVar) throws RemoteException {
        zzdjx zzdjxVar = this.zzc;
        if (zzdjxVar != null) {
            zzekj zzekjVar = ((zzeow) zzdjxVar).zzc;
            zzeow zzeowVar = (zzeow) zzdjxVar;
            ((zzeow) zzdjxVar).zzd.zzc().execute(new zzeov(zzeowVar, ((zzeow) zzdjxVar).zza, ((zzeow) zzdjxVar).zzb, zzekjVar));
        }
    }

    public final synchronized void zzf(N6.a aVar, int i) throws RemoteException {
        zzdjx zzdjxVar = this.zzc;
        if (zzdjxVar != null) {
            String str = ((zzeow) zzdjxVar).zzc.zza;
            int i2 = o0.b;
            W5.p.f("Fail to initialize adapter ".concat(String.valueOf(str)));
        }
    }

    public final synchronized void zzg(N6.a aVar) throws RemoteException {
        zzdco zzdcoVar = this.zzb;
        if (zzdcoVar != null) {
            zzdcoVar.zza();
        }
    }

    public final synchronized void zzh(N6.a aVar) throws RemoteException {
        zzcar zzcarVar = this.zza;
        if (zzcarVar != null) {
            ((zzeoy) zzcarVar).zza.zzh();
        }
    }

    public final synchronized void zzi(N6.a aVar) throws RemoteException {
        zzcar zzcarVar = this.zza;
        if (zzcarVar != null) {
            ((zzeoy) zzcarVar).zzd.zza();
        }
    }

    public final synchronized void zzj(N6.a aVar) throws RemoteException {
        zzcar zzcarVar = this.zza;
        if (zzcarVar != null) {
            zzcarVar.zzj(aVar);
        }
    }

    public final synchronized void zzk(N6.a aVar, zzcas zzcasVar) throws RemoteException {
        zzcar zzcarVar = this.zza;
        if (zzcarVar != null) {
            ((zzeoy) zzcarVar).zzd.zzb(zzcasVar);
        }
    }

    public final synchronized void zzl(N6.a aVar) throws RemoteException {
        zzcar zzcarVar = this.zza;
        if (zzcarVar != null) {
            ((zzeoy) zzcarVar).zzb.onAdClicked();
        }
    }

    public final synchronized void zzm(N6.a aVar, int i) throws RemoteException {
        zzdco zzdcoVar = this.zzb;
        if (zzdcoVar != null) {
            zzdcoVar.zzb(i);
        }
    }

    public final synchronized void zzn(N6.a aVar) throws RemoteException {
        zzcar zzcarVar = this.zza;
        if (zzcarVar != null) {
            ((zzeoy) zzcarVar).zzc.zzb();
        }
    }

    public final synchronized void zzo(N6.a aVar) throws RemoteException {
        zzcar zzcarVar = this.zza;
        if (zzcarVar != null) {
            ((zzeoy) zzcarVar).zzc.zzf();
        }
    }

    public final synchronized void zzp(N6.a aVar) throws RemoteException {
        zzcar zzcarVar = this.zza;
        if (zzcarVar != null) {
            ((zzeoy) zzcarVar).zzd.zzb(null);
        }
    }
}
