package com.google.android.gms.internal.ads;

import S5.f1;
import S5.g1;
import S5.j1;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdog extends f1 {
    private final Object zza = new Object();
    private final g1 zzb;
    private final zzbui zzc;

    public zzdog(g1 g1Var, zzbui zzbuiVar) {
        this.zzb = g1Var;
        this.zzc = zzbuiVar;
    }

    public final void zze() throws RemoteException {
        throw new RemoteException();
    }

    public final void zzf() throws RemoteException {
        throw new RemoteException();
    }

    public final void zzg(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    public final boolean zzh() throws RemoteException {
        throw new RemoteException();
    }

    public final int zzi() throws RemoteException {
        throw new RemoteException();
    }

    public final float zzj() throws RemoteException {
        zzbui zzbuiVar = this.zzc;
        if (zzbuiVar != null) {
            return zzbuiVar.zzA();
        }
        return 0.0f;
    }

    public final float zzk() throws RemoteException {
        zzbui zzbuiVar = this.zzc;
        if (zzbuiVar != null) {
            return zzbuiVar.zzB();
        }
        return 0.0f;
    }

    public final void zzl(j1 j1Var) throws RemoteException {
        synchronized (this.zza) {
            try {
                g1 g1Var = this.zzb;
                if (g1Var != null) {
                    g1Var.zzl(j1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final float zzm() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean zzn() throws RemoteException {
        throw new RemoteException();
    }

    public final j1 zzo() throws RemoteException {
        synchronized (this.zza) {
            try {
                g1 g1Var = this.zzb;
                if (g1Var == null) {
                    return null;
                }
                return g1Var.zzo();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    public final void zzq() throws RemoteException {
        throw new RemoteException();
    }
}
