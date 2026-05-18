package com.google.android.gms.internal.ads;

import S5.c1;
import S5.s2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdfw implements M5.e, f6.a, zzdbf, S5.a, zzddw, zzdbz, zzdde, U5.E, zzdbv, zzdjm {
    private final zzdev zza = new zzdev(this, null);
    private zzerp zzb;
    private zzert zzc;
    private zzfer zzd;
    private zzfhv zze;

    private static void zzs(Object obj, zzdfv zzdfvVar) {
        if (obj != null) {
            zzdfvVar.zza(obj);
        }
    }

    public final void onAdClicked() {
        zzs(this.zzb, zzdfa.zza);
        zzs(this.zzc, zzdfn.zza);
    }

    public final void onAdMetadataChanged() {
        zzs(this.zze, zzdft.zza);
    }

    public final void onAppEvent(String str, String str2) {
        zzs(this.zzb, new zzden(str, str2));
    }

    public final void zzd(zzcag zzcagVar, String str, String str2) {
        zzs(this.zzb, new zzdeu(zzcagVar, str, str2));
        zzs(this.zze, new zzdem(zzcagVar, str, str2));
    }

    public final void zzdJ() {
        zzs(this.zzb, zzdex.zza);
        zzs(this.zze, zzdfp.zza);
    }

    public final void zzdQ() {
        zzs(this.zzb, zzdfb.zza);
    }

    public final void zzdS() {
        zzs(this.zzd, zzdfh.zza);
    }

    public final void zzdT(int i) {
        zzs(this.zzd, new zzdet(i));
    }

    public final void zzdo() {
    }

    public final void zzdp() {
    }

    public final void zzdq() {
    }

    public final void zzdr() {
        zzs(this.zzb, zzdfd.zza);
    }

    public final void zzds() {
        zzs(this.zzb, zzdew.zza);
        zzs(this.zze, zzdfo.zza);
    }

    public final void zzdt() {
        zzs(this.zzb, zzdfe.zza);
        zzs(this.zze, zzdfu.zza);
    }

    public final void zzdu() {
        zzs(this.zzb, zzdfc.zza);
        zzs(this.zzc, zzdfm.zza);
        zzs(this.zze, zzdfs.zza);
        zzs(this.zzd, zzdfl.zza);
    }

    public final void zzdv() {
        zzs(this.zzd, zzdfi.zza);
    }

    public final void zzdw() {
        zzs(this.zzd, zzdfj.zza);
    }

    public final void zzdx() {
        zzs(this.zzd, zzdfk.zza);
    }

    public final void zzdy() {
    }

    public final void zzdz() {
    }

    public final void zze() {
        zzs(this.zzb, zzdey.zza);
        zzs(this.zze, zzdfq.zza);
    }

    public final void zzf() {
        zzs(this.zzb, zzdez.zza);
        zzs(this.zze, zzdfr.zza);
    }

    public final void zzh() {
        zzs(this.zzd, zzdfg.zza);
    }

    public final void zzj(c1 c1Var) {
        zzs(this.zze, new zzder(c1Var));
        zzs(this.zzb, new zzdes(c1Var));
    }

    public final void zzl() {
        zzs(this.zzd, zzdff.zza);
    }

    public final void zzm(s2 s2Var) {
        zzs(this.zzb, new zzdeo(s2Var));
        zzs(this.zze, new zzdep(s2Var));
        zzs(this.zzd, new zzdeq(s2Var));
    }

    public final zzdev zzn() {
        return this.zza;
    }

    public final /* synthetic */ void zzo(zzerp zzerpVar) {
        this.zzb = zzerpVar;
    }

    public final /* synthetic */ void zzp(zzert zzertVar) {
        this.zzc = zzertVar;
    }

    public final /* synthetic */ void zzq(zzfer zzferVar) {
        this.zzd = zzferVar;
    }

    public final /* synthetic */ void zzr(zzfhv zzfhvVar) {
        this.zze = zzfhvVar;
    }
}
