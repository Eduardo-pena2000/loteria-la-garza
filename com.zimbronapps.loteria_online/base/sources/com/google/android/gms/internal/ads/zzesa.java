package com.google.android.gms.internal.ads;

import S5.d1;
import S5.l2;
import V5.o0;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzesa {
    private final zzesf zza;
    private final String zzb;
    private d1 zzc;

    public zzesa(zzesf zzesfVar, String str) {
        this.zza = zzesfVar;
        this.zzb = str;
    }

    public final synchronized boolean zza() throws RemoteException {
        return this.zza.zzb();
    }

    public final synchronized void zzb(l2 l2Var, int i) throws RemoteException {
        this.zzc = null;
        zzesg zzesgVar = new zzesg(i);
        zzerz zzerzVar = new zzerz(this);
        this.zza.zza(l2Var, this.zzb, zzesgVar, zzerzVar);
    }

    public final synchronized String zzc() {
        d1 d1Var;
        try {
            d1Var = this.zzc;
        } catch (RemoteException e) {
            int i = o0.b;
            W5.p.i("#007 Could not call remote method.", e);
            return null;
        }
        return d1Var != null ? d1Var.zze() : null;
    }

    public final synchronized String zzd() {
        d1 d1Var;
        try {
            d1Var = this.zzc;
        } catch (RemoteException e) {
            int i = o0.b;
            W5.p.i("#007 Could not call remote method.", e);
            return null;
        }
        return d1Var != null ? d1Var.zze() : null;
    }

    public final /* synthetic */ void zze(d1 d1Var) {
        this.zzc = d1Var;
    }
}
