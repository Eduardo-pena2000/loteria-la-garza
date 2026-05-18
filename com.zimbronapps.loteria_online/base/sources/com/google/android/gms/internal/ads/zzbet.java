package com.google.android.gms.internal.ads;

import S5.V1;
import S5.d1;
import android.app.Activity;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbet extends N5.a {
    L5.m zza;
    private final zzbex zzb;
    private final AtomicReference zzc;
    private final zzbeu zzd;
    private L5.t zze;
    private final AtomicLong zzf;

    public zzbet(zzbex zzbexVar) {
        this.zzd = new zzbeu();
        this.zzf = new AtomicLong();
        this.zzb = zzbexVar;
        this.zzc = new AtomicReference();
    }

    public final String getAdUnitId() {
        String str;
        String str2;
        AtomicReference atomicReference = this.zzc;
        if (atomicReference.get() != null) {
            return (String) atomicReference.get();
        }
        synchronized (this) {
            try {
                str = this.zzb.zzj();
            } catch (RemoteException e) {
                W5.p.i("#007 Could not call remote method.", e);
                str = null;
            }
            if (str == null) {
                this.zzc.set("");
            } else {
                this.zzc.set(str);
            }
            str2 = (String) this.zzc.get();
        }
        return str2;
    }

    public final L5.m getFullScreenContentCallback() {
        return this.zza;
    }

    public final L5.t getOnPaidEventListener() {
        return this.zze;
    }

    public final long getPlacementId() {
        long j;
        AtomicLong atomicLong = this.zzf;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    long zzk = this.zzb.zzk();
                    AtomicLong atomicLong2 = this.zzf;
                    atomicLong2.set(zzk);
                    j = atomicLong2.get();
                } catch (RemoteException e) {
                    W5.p.i("#007 Could not call remote method.", e);
                    return 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    public final L5.z getResponseInfo() {
        d1 d1Var;
        try {
            d1Var = this.zzb.zzg();
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
            d1Var = null;
        }
        return L5.z.h(d1Var);
    }

    public final void setFullScreenContentCallback(L5.m mVar) {
        this.zza = mVar;
        this.zzd.zzb(mVar);
    }

    public final void setImmersiveMode(boolean z) {
        try {
            this.zzb.zzh(z);
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void setOnPaidEventListener(L5.t tVar) {
        this.zze = tVar;
        try {
            this.zzb.zzi(new V1(tVar));
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void setPlacementId(long j) {
        try {
            this.zzb.zzl(j);
            this.zzf.set(j);
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void show(Activity activity) {
        try {
            this.zzb.zzf(N6.b.s1(activity), this.zzd);
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public zzbet(zzbex zzbexVar, String str) {
        this.zzd = new zzbeu();
        this.zzf = new AtomicLong();
        this.zzb = zzbexVar;
        this.zzc = new AtomicReference(str);
    }
}
