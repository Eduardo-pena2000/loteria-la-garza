package com.google.android.gms.internal.ads;

import S5.g1;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdso extends zzblg {
    private final String zza;
    private final zzdoc zzb;
    private final zzdoh zzc;

    public zzdso(String str, zzdoc zzdocVar, zzdoh zzdohVar) {
        this.zza = str;
        this.zzb = zzdocVar;
        this.zzc = zzdohVar;
    }

    public final N6.a zzb() throws RemoteException {
        return N6.b.s1(this.zzb);
    }

    public final String zzc() throws RemoteException {
        return this.zzc.zzB();
    }

    public final List zzd() throws RemoteException {
        return this.zzc.zzC();
    }

    public final String zze() throws RemoteException {
        return this.zzc.zzG();
    }

    public final zzbks zzf() throws RemoteException {
        return this.zzc.zzP();
    }

    public final String zzg() throws RemoteException {
        return this.zzc.zzI();
    }

    public final double zzh() throws RemoteException {
        return this.zzc.zzO();
    }

    public final String zzi() throws RemoteException {
        return this.zzc.zzM();
    }

    public final String zzj() throws RemoteException {
        return this.zzc.zzN();
    }

    public final Bundle zzk() throws RemoteException {
        return this.zzc.zzH();
    }

    public final void zzl() throws RemoteException {
        this.zzb.zzd();
    }

    public final g1 zzm() throws RemoteException {
        return this.zzc.zzy();
    }

    public final void zzn(Bundle bundle) throws RemoteException {
        this.zzb.zzc(bundle);
    }

    public final boolean zzo(Bundle bundle) throws RemoteException {
        return this.zzb.zze(bundle);
    }

    public final void zzp(Bundle bundle) throws RemoteException {
        this.zzb.zzf(bundle);
    }

    public final zzbkl zzq() throws RemoteException {
        return this.zzc.zzz();
    }

    public final N6.a zzr() throws RemoteException {
        return this.zzc.zzL();
    }

    public final String zzs() throws RemoteException {
        return this.zza;
    }
}
