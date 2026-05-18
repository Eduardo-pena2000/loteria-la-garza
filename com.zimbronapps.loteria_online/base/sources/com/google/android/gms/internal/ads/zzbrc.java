package com.google.android.gms.internal.ads;

import S5.V1;
import S5.Y;
import S5.d1;
import S5.g2;
import S5.n1;
import S5.p2;
import S5.q2;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbrc extends M5.c {
    private final Context zza;
    private final p2 zzb;
    private final Y zzc;
    private final AtomicReference zzd;
    private final zzbtp zze;
    private final long zzf;
    private M5.e zzg;
    private L5.m zzh;
    private L5.t zzi;
    private final AtomicLong zzj;

    public zzbrc(Context context, Y y) {
        this.zze = new zzbtp();
        this.zzf = System.currentTimeMillis();
        this.zzj = new AtomicLong();
        this.zza = context;
        this.zzd = new AtomicReference();
        this.zzb = p2.a;
        this.zzc = y;
    }

    public final String getAdUnitId() {
        String str;
        String str2;
        AtomicReference atomicReference = this.zzd;
        if (atomicReference.get() != null) {
            return (String) atomicReference.get();
        }
        synchronized (this) {
            try {
                str = this.zzc.zzu();
            } catch (RemoteException e) {
                W5.p.i("#007 Could not call remote method.", e);
                str = null;
            }
            if (str == null) {
                this.zzd.set("");
            } else {
                this.zzd.set(str);
            }
            str2 = (String) this.zzd.get();
        }
        return str2;
    }

    public final M5.e getAppEventListener() {
        return this.zzg;
    }

    public final L5.m getFullScreenContentCallback() {
        return this.zzh;
    }

    public final L5.t getOnPaidEventListener() {
        return this.zzi;
    }

    public final long getPlacementId() {
        AtomicLong atomicLong = this.zzj;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    Y y = this.zzc;
                    if (y != null) {
                        long zzU = y.zzU();
                        AtomicLong atomicLong2 = this.zzj;
                        atomicLong2.set(zzU);
                        return atomicLong2.get();
                    }
                } catch (RemoteException e) {
                    W5.p.i("#007 Could not call remote method.", e);
                }
                return 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final L5.z getResponseInfo() {
        d1 d1Var = null;
        try {
            Y y = this.zzc;
            if (y != null) {
                d1Var = y.zzt();
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
        return L5.z.h(d1Var);
    }

    public final void setAppEventListener(M5.e eVar) {
        try {
            this.zzg = eVar;
            Y y = this.zzc;
            if (y != null) {
                y.zzi(eVar != null ? new zzbdt(eVar) : null);
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void setFullScreenContentCallback(L5.m mVar) {
        try {
            this.zzh = mVar;
            Y y = this.zzc;
            if (y != null) {
                y.zzS(new S5.E(mVar));
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void setImmersiveMode(boolean z) {
        try {
            Y y = this.zzc;
            if (y != null) {
                y.zzK(z);
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void setOnPaidEventListener(L5.t tVar) {
        try {
            this.zzi = tVar;
            Y y = this.zzc;
            if (y != null) {
                y.zzP(new V1(tVar));
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void setPlacementId(long j) {
        try {
            Y y = this.zzc;
            if (y != null) {
                y.zzT(j);
                this.zzj.set(j);
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void show(Activity activity) {
        if (activity == null) {
            W5.p.f("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            Y y = this.zzc;
            if (y != null) {
                y.zzR(N6.b.s1(activity));
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void zza(n1 n1Var, L5.f fVar) {
        try {
            Y y = this.zzc;
            if (y != null) {
                n1Var.o(this.zzf);
                y.zzQ(this.zzb.a(this.zza, n1Var), new g2(fVar, this));
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
            fVar.onAdFailedToLoad(new L5.n(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }

    public zzbrc(Context context, String str) {
        zzbtp zzbtpVar = new zzbtp();
        this.zze = zzbtpVar;
        this.zzf = System.currentTimeMillis();
        this.zzj = new AtomicLong();
        this.zza = context;
        this.zzd = new AtomicReference(str);
        this.zzb = p2.a;
        this.zzc = S5.B.b().b(context, new q2(), str, zzbtpVar);
    }

    public zzbrc(Context context, String str, Y y) {
        p2 p2Var = p2.a;
        this.zze = new zzbtp();
        this.zzf = System.currentTimeMillis();
        this.zzj = new AtomicLong();
        this.zza = context;
        this.zzd = new AtomicReference(str);
        this.zzb = p2Var;
        this.zzc = y;
    }
}
