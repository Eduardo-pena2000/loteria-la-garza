package com.google.android.gms.internal.ads;

import S5.H0;
import S5.L0;
import S5.V0;
import S5.d1;
import S5.g1;
import V5.o0;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdsv extends zzbml {
    private final String zza;
    private final zzdoc zzb;
    private final zzdoh zzc;
    private final zzdxz zzd;

    public zzdsv(String str, zzdoc zzdocVar, zzdoh zzdohVar, zzdxz zzdxzVar) {
        this.zza = str;
        this.zzb = zzdocVar;
        this.zzc = zzdohVar;
        this.zzd = zzdxzVar;
    }

    public final boolean zzA() throws RemoteException {
        zzdoh zzdohVar = this.zzc;
        return (zzdohVar.zzE().isEmpty() || zzdohVar.zzF() == null) ? false : true;
    }

    public final void zzB(L0 l0) throws RemoteException {
        this.zzb.zzA(l0);
    }

    public final void zzC(H0 h0) throws RemoteException {
        this.zzb.zzB(h0);
    }

    public final void zzD() {
        this.zzb.zzC();
    }

    public final void zzE() {
        this.zzb.zzD();
    }

    public final zzbkp zzF() throws RemoteException {
        return this.zzb.zzP().zza();
    }

    public final boolean zzG() {
        return this.zzb.zzF();
    }

    public final d1 zzH() throws RemoteException {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzhG)).booleanValue()) {
            return this.zzb.zzn();
        }
        return null;
    }

    public final void zzI(V0 v0) throws RemoteException {
        try {
            if (!v0.zzf()) {
                this.zzd.zzb();
            }
        } catch (RemoteException e) {
            int i = o0.b;
            W5.p.b("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzb.zzQ(v0);
    }

    public final void zzJ(Bundle bundle) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzow)).booleanValue()) {
            this.zzb.zzR(bundle);
        }
    }

    public final long zzK() {
        zzdoc zzdocVar = this.zzb;
        if (zzdocVar == null || zzdocVar.zzo() == null) {
            return 0L;
        }
        return zzdocVar.zzo().zza();
    }

    public final void zzL(long j) {
        zzdoc zzdocVar = this.zzb;
        if (zzdocVar == null || zzdocVar.zzo() == null) {
            return;
        }
        zzdocVar.zzo().zzb(j);
    }

    public final String zze() throws RemoteException {
        return this.zzc.zzB();
    }

    public final List zzf() throws RemoteException {
        return this.zzc.zzC();
    }

    public final String zzg() throws RemoteException {
        return this.zzc.zzG();
    }

    public final zzbks zzh() throws RemoteException {
        return this.zzc.zzP();
    }

    public final String zzi() throws RemoteException {
        return this.zzc.zzI();
    }

    public final String zzj() throws RemoteException {
        return this.zzc.zzQ();
    }

    public final double zzk() throws RemoteException {
        return this.zzc.zzO();
    }

    public final String zzl() throws RemoteException {
        return this.zzc.zzM();
    }

    public final String zzm() throws RemoteException {
        return this.zzc.zzN();
    }

    public final g1 zzn() throws RemoteException {
        return this.zzc.zzy();
    }

    public final String zzo() throws RemoteException {
        return this.zza;
    }

    public final void zzp() throws RemoteException {
        this.zzb.zzd();
    }

    public final zzbkl zzq() throws RemoteException {
        return this.zzc.zzz();
    }

    public final void zzr(Bundle bundle) throws RemoteException {
        this.zzb.zzc(bundle);
    }

    public final boolean zzs(Bundle bundle) throws RemoteException {
        return this.zzb.zze(bundle);
    }

    public final void zzt(Bundle bundle) throws RemoteException {
        this.zzb.zzf(bundle);
    }

    public final N6.a zzu() throws RemoteException {
        return N6.b.s1(this.zzb);
    }

    public final N6.a zzv() throws RemoteException {
        return this.zzc.zzL();
    }

    public final Bundle zzw() throws RemoteException {
        return this.zzc.zzH();
    }

    public final void zzx(zzbmj zzbmjVar) throws RemoteException {
        this.zzb.zzy(zzbmjVar);
    }

    public final void zzy() throws RemoteException {
        this.zzb.zzz();
    }

    public final List zzz() throws RemoteException {
        return zzA() ? this.zzc.zzE() : Collections.emptyList();
    }
}
