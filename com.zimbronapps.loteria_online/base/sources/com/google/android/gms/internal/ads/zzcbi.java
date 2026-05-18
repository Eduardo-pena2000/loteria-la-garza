package com.google.android.gms.internal.ads;

import S5.U1;
import S5.V1;
import S5.d1;
import S5.n1;
import S5.p2;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcbi extends f6.c {
    private final AtomicReference zza;
    private final zzcaz zzb;
    private final Context zzc;
    private final zzcbr zzd;
    private f6.a zze;
    private L5.t zzf;
    private L5.m zzg;
    private final long zzh;
    private final AtomicLong zzi;

    public zzcbi(Context context, zzcaz zzcazVar) {
        this.zzh = System.currentTimeMillis();
        this.zzi = new AtomicLong();
        this.zzc = context.getApplicationContext();
        this.zza = new AtomicReference();
        this.zzb = zzcazVar;
        this.zzd = new zzcbr();
    }

    public final Bundle getAdMetadata() {
        try {
            zzcaz zzcazVar = this.zzb;
            if (zzcazVar != null) {
                return zzcazVar.zzg();
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
        return new Bundle();
    }

    public final String getAdUnitId() {
        String str;
        String str2;
        AtomicReference atomicReference = this.zza;
        if (atomicReference.get() != null) {
            return (String) atomicReference.get();
        }
        synchronized (this) {
            try {
                str = this.zzb.zzn();
            } catch (RemoteException e) {
                W5.p.i("#007 Could not call remote method.", e);
                str = null;
            }
            if (str == null) {
                this.zza.set("");
            } else {
                this.zza.set(str);
            }
            str2 = (String) this.zza.get();
        }
        return str2;
    }

    public final L5.m getFullScreenContentCallback() {
        return this.zzg;
    }

    public final f6.a getOnAdMetadataChangedListener() {
        return this.zze;
    }

    public final L5.t getOnPaidEventListener() {
        return this.zzf;
    }

    public final long getPlacementId() {
        long j;
        zzcaz zzcazVar;
        AtomicLong atomicLong = this.zzi;
        long j2 = 0;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                zzcazVar = this.zzb;
            } catch (RemoteException e) {
                W5.p.i("#007 Could not call remote method.", e);
            }
            if (zzcazVar != null) {
                j2 = zzcazVar.zzq();
                AtomicLong atomicLong2 = this.zzi;
                atomicLong2.set(j2);
                j = atomicLong2.get();
            } else {
                AtomicLong atomicLong22 = this.zzi;
                atomicLong22.set(j2);
                j = atomicLong22.get();
            }
        }
        return j;
    }

    public final L5.z getResponseInfo() {
        d1 d1Var = null;
        try {
            zzcaz zzcazVar = this.zzb;
            if (zzcazVar != null) {
                d1Var = zzcazVar.zzm();
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
        return L5.z.h(d1Var);
    }

    public final f6.b getRewardItem() {
        try {
            zzcaz zzcazVar = this.zzb;
            zzcaw zzl = zzcazVar != null ? zzcazVar.zzl() : null;
            return zzl == null ? f6.b.a : new zzcbj(zzl);
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
            return f6.b.a;
        }
    }

    public final void setFullScreenContentCallback(L5.m mVar) {
        this.zzg = mVar;
        this.zzd.zzb(mVar);
    }

    public final void setImmersiveMode(boolean z) {
        try {
            zzcaz zzcazVar = this.zzb;
            if (zzcazVar != null) {
                zzcazVar.zzp(z);
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void setOnAdMetadataChangedListener(f6.a aVar) {
        try {
            this.zze = aVar;
            zzcaz zzcazVar = this.zzb;
            if (zzcazVar != null) {
                zzcazVar.zzf(new U1(aVar));
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void setOnPaidEventListener(L5.t tVar) {
        try {
            this.zzf = tVar;
            zzcaz zzcazVar = this.zzb;
            if (zzcazVar != null) {
                zzcazVar.zzo(new V1(tVar));
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void setPlacementId(long j) {
        try {
            zzcaz zzcazVar = this.zzb;
            if (zzcazVar != null) {
                zzcazVar.zzr(j);
                this.zzi.set(j);
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void setServerSideVerificationOptions(f6.e eVar) {
        if (eVar != null) {
            try {
                zzcaz zzcazVar = this.zzb;
                if (zzcazVar != null) {
                    zzcazVar.zzh(new zzcbn(eVar));
                }
            } catch (RemoteException e) {
                W5.p.i("#007 Could not call remote method.", e);
            }
        }
    }

    public final void show(Activity activity, L5.u uVar) {
        zzcbr zzcbrVar = this.zzd;
        zzcbrVar.zzc(uVar);
        if (activity == null) {
            W5.p.f("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzcaz zzcazVar = this.zzb;
            if (zzcazVar != null) {
                zzcazVar.zze(zzcbrVar);
                zzcazVar.zzb(N6.b.s1(activity));
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void zza(n1 n1Var, f6.d dVar) {
        try {
            zzcaz zzcazVar = this.zzb;
            if (zzcazVar != null) {
                n1Var.o(this.zzh);
                zzcazVar.zzc(p2.a.a(this.zzc, n1Var), new zzcbm(dVar, this));
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public zzcbi(Context context, String str) {
        this(context, str, S5.B.b().f(context, str, new zzbtp()));
    }

    public zzcbi(Context context, String str, zzcaz zzcazVar) {
        this.zzh = System.currentTimeMillis();
        this.zzi = new AtomicLong();
        this.zzc = context.getApplicationContext();
        this.zza = new AtomicReference(str);
        this.zzb = zzcazVar;
        this.zzd = new zzcbr();
    }
}
