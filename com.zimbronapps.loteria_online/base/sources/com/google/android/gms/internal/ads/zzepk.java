package com.google.android.gms.internal.ads;

import S5.c1;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzepk extends zzbty {
    private final zzdbd zza;
    private final zzdjk zzb;
    private final zzdbx zzc;
    private final zzdcm zzd;
    private final zzdcr zze;
    private final zzdgj zzf;
    private final zzddq zzg;
    private final zzdki zzh;
    private final zzdgf zzi;
    private final zzdbs zzj;

    public zzepk(zzdbd zzdbdVar, zzdjk zzdjkVar, zzdbx zzdbxVar, zzdcm zzdcmVar, zzdcr zzdcrVar, zzdgj zzdgjVar, zzddq zzddqVar, zzdki zzdkiVar, zzdgf zzdgfVar, zzdbs zzdbsVar) {
        this.zza = zzdbdVar;
        this.zzb = zzdjkVar;
        this.zzc = zzdbxVar;
        this.zzd = zzdcmVar;
        this.zze = zzdcrVar;
        this.zzf = zzdgjVar;
        this.zzg = zzddqVar;
        this.zzh = zzdkiVar;
        this.zzi = zzdgfVar;
        this.zzj = zzdbsVar;
    }

    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzdu();
    }

    public final void zzf() {
        this.zzg.zzdT(4);
    }

    public final void zzg(int i) {
    }

    public final void zzh() {
        this.zzd.zzb();
    }

    public final void zzi() {
        this.zzg.zzh();
        this.zzi.zzb();
    }

    public final void zzj() {
        this.zze.zzg();
    }

    public void zzk() {
        this.zzc.zza();
        this.zzi.zza();
    }

    public final void zzl(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    public final void zzm(zzblm zzblmVar, String str) {
    }

    public void zzn() {
        this.zzh.zzb();
    }

    public void zzo() {
        this.zzh.zzc();
    }

    public void zzp(zzcas zzcasVar) {
    }

    public final void zzq() {
        this.zzh.zza();
    }

    public void zzr(zzcaw zzcawVar) throws RemoteException {
    }

    @Deprecated
    public final void zzs(int i) throws RemoteException {
        zzy(new c1(i, "", "undefined", null, null));
    }

    public void zzt() throws RemoteException {
    }

    public final void zzu() throws RemoteException {
        this.zzh.zzd();
    }

    public final void zzv(String str) {
        zzy(new c1(0, str, "undefined", null, null));
    }

    public final void zzw(int i, String str) {
    }

    public final void zzy(c1 c1Var) {
        this.zzj.zzc(zzfkm.zzc(8, c1Var));
    }

    public void zzz() throws RemoteException {
    }

    public final void zzx(c1 c1Var) {
    }
}
