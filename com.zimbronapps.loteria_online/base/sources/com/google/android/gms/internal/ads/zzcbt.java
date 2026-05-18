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

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcbt extends g6.a {
    private final String zza;
    private final zzcaz zzb;
    private final Context zzc;
    private L5.m zze;
    private f6.a zzf;
    private L5.t zzg;
    private final long zzh = System.currentTimeMillis();
    private final AtomicLong zzi = new AtomicLong();
    private final zzcbr zzd = new zzcbr();

    public zzcbt(Context context, String str) {
        this.zza = str;
        this.zzc = context.getApplicationContext();
        this.zzb = S5.B.b().f(context, str, new zzbtp());
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
        return this.zza;
    }

    public final L5.m getFullScreenContentCallback() {
        return this.zze;
    }

    public final f6.a getOnAdMetadataChangedListener() {
        return this.zzf;
    }

    public final L5.t getOnPaidEventListener() {
        return this.zzg;
    }

    public final long getPlacementId() {
        AtomicLong atomicLong = this.zzi;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    zzcaz zzcazVar = this.zzb;
                    if (zzcazVar != null) {
                        long zzq = zzcazVar.zzq();
                        AtomicLong atomicLong2 = this.zzi;
                        atomicLong2.set(zzq);
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
            if (zzl != null) {
                return new zzcbj(zzl);
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
        return f6.b.a;
    }

    public final void setFullScreenContentCallback(L5.m mVar) {
        this.zze = mVar;
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
        this.zzf = aVar;
        try {
            zzcaz zzcazVar = this.zzb;
            if (zzcazVar != null) {
                zzcazVar.zzf(new U1(aVar));
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void setOnPaidEventListener(L5.t tVar) {
        this.zzg = tVar;
        try {
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
        try {
            zzcaz zzcazVar = this.zzb;
            if (zzcazVar != null) {
                zzcazVar.zzh(new zzcbn(eVar));
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void show(Activity activity, L5.u uVar) {
        zzcbr zzcbrVar = this.zzd;
        zzcbrVar.zzc(uVar);
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

    public final void zza(n1 n1Var, g6.b bVar) {
        try {
            zzcaz zzcazVar = this.zzb;
            if (zzcazVar != null) {
                n1Var.o(this.zzh);
                zzcazVar.zzd(p2.a.a(this.zzc, n1Var), new zzcbs(bVar, this));
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }
}
