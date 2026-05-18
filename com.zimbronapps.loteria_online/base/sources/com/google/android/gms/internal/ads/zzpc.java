package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzpc implements zzmx {
    private final zzdn zza;
    private final zzbd zzb;
    private final zzbe zzc;
    private final zzpb zzd;
    private final SparseArray zze;
    private zzed zzf;
    private zzbb zzg;
    private zzdx zzh;
    private boolean zzi;

    public zzpc(zzdn zzdnVar) {
        zzdnVar.getClass();
        this.zza = zzdnVar;
        this.zzf = new zzed(zzfj.zze().getThread());
        zzbd zzbdVar = new zzbd();
        this.zzb = zzbdVar;
        this.zzc = new zzbe();
        this.zzd = new zzpb(zzbdVar);
        this.zze = new SparseArray();
    }

    private final zzmy zzad(zzwk zzwkVar) {
        this.zzg.getClass();
        zzbf zze = zzwkVar == null ? null : this.zzd.zze(zzwkVar);
        if (zzwkVar != null && zze != null) {
            return zzaa(zze, zze.zzo(zzwkVar.zza, this.zzb).zzc, zzwkVar);
        }
        int zzs = this.zzg.zzs();
        zzbf zzq = this.zzg.zzq();
        if (zzs >= zzq.zza()) {
            zzq = zzbf.zza;
        }
        return zzaa(zzq, zzs, null);
    }

    private final zzmy zzae() {
        return zzad(this.zzd.zzb());
    }

    private final zzmy zzaf() {
        return zzad(this.zzd.zzc());
    }

    private final zzmy zzag(int i, zzwk zzwkVar) {
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        if (zzwkVar != null) {
            return this.zzd.zze(zzwkVar) != null ? zzad(zzwkVar) : zzaa(zzbf.zza, i, zzwkVar);
        }
        zzbf zzq = zzbbVar.zzq();
        if (i >= zzq.zza()) {
            zzq = zzbf.zza;
        }
        return zzaa(zzq, i, null);
    }

    private final zzmy zzah(zzau zzauVar) {
        zzwk zzwkVar;
        return (!(zzauVar instanceof zziw) || (zzwkVar = ((zziw) zzauVar).zzh) == null) ? zzZ() : zzad(zzwkVar);
    }

    public final void zzA() {
        if (this.zzi) {
            return;
        }
        zzmy zzZ = zzZ();
        this.zzi = true;
        zzY(zzZ, -1, new zznm(zzZ));
    }

    public final void zzB(int i, int i2, boolean z) {
        zzmy zzaf = zzaf();
        zzY(zzaf, 1033, new zznx(zzaf, i, i2, z));
    }

    public final void zzC(zzin zzinVar) {
        zzmy zzaf = zzaf();
        zzY(zzaf, 1007, new zzoi(zzaf, zzinVar));
    }

    public final void zzD(String str, long j, long j2) {
        zzmy zzaf = zzaf();
        zzY(zzaf, 1008, new zzos(zzaf, str, j2, j));
    }

    public final void zzE(zzv zzvVar, zzio zzioVar) {
        zzmy zzaf = zzaf();
        zzY(zzaf, 1009, new zzov(zzaf, zzvVar, zzioVar));
    }

    public final void zzF(long j) {
        zzmy zzaf = zzaf();
        zzY(zzaf, 1010, new zzow(zzaf, j));
    }

    public final void zzG(int i, long j, long j2) {
        zzmy zzaf = zzaf();
        zzY(zzaf, 1011, new zzox(zzaf, i, j, j2));
    }

    public final void zzH(String str) {
        zzmy zzaf = zzaf();
        zzY(zzaf, 1012, new zzoy(zzaf, str));
    }

    public final void zzI(zzin zzinVar) {
        zzmy zzae = zzae();
        zzY(zzae, 1013, new zzoz(zzae, zzinVar));
    }

    public final void zzJ(Exception exc) {
        zzmy zzaf = zzaf();
        zzY(zzaf, 1014, new zznc(zzaf, exc));
    }

    public final void zzK(Exception exc) {
        zzmy zzaf = zzaf();
        zzY(zzaf, 1029, new zznd(zzaf, exc));
    }

    public final void zzL(zzrd zzrdVar) {
        zzmy zzaf = zzaf();
        zzY(zzaf, 1031, new zzne(zzaf, zzrdVar));
    }

    public final void zzM(zzrd zzrdVar) {
        zzmy zzaf = zzaf();
        zzY(zzaf, 1032, new zznf(zzaf, zzrdVar));
    }

    public final void zzN(zzin zzinVar) {
        zzmy zzaf = zzaf();
        zzY(zzaf, 1015, new zznh(zzaf, zzinVar));
    }

    public final void zzO(String str, long j, long j2) {
        zzmy zzaf = zzaf();
        zzY(zzaf, 1016, new zzni(zzaf, str, j2, j));
    }

    public final void zzP(zzv zzvVar, zzio zzioVar) {
        zzmy zzaf = zzaf();
        zzY(zzaf, 1017, new zznj(zzaf, zzvVar, zzioVar));
    }

    public final void zzQ(int i, long j) {
        zzmy zzae = zzae();
        zzY(zzae, 1018, new zznk(zzae, i, j));
    }

    public final void zzR(String str) {
        zzmy zzaf = zzaf();
        zzY(zzaf, 1019, new zznl(zzaf, str));
    }

    public final void zzS(zzin zzinVar) {
        zzmy zzae = zzae();
        zzY(zzae, 1020, new zznn(zzae, zzinVar));
    }

    public final void zzT(Object obj, long j) {
        zzmy zzaf = zzaf();
        zzY(zzaf, 26, new zzno(zzaf, obj, j));
    }

    public final void zzU(long j, int i) {
        zzmy zzae = zzae();
        zzY(zzae, 1021, new zznp(zzae, j, i));
    }

    public final void zzV(Exception exc) {
        zzmy zzaf = zzaf();
        zzY(zzaf, 1030, new zznq(zzaf, exc));
    }

    public final void zzW(int i) {
        zzmy zzZ = zzZ();
        zzY(zzZ, 1034, new zznr(zzZ, i));
    }

    public final void zzX(int i, long j, long j2) {
        zzmy zzad = zzad(this.zzd.zzd());
        zzY(zzad, 1006, new zzot(zzad, i, j, j2));
    }

    public final void zzY(zzmy zzmyVar, int i, zzdy zzdyVar) {
        this.zze.put(i, zzmyVar);
        zzed zzedVar = this.zzf;
        zzedVar.zzd(i, zzdyVar);
        zzedVar.zze();
    }

    public final zzmy zzZ() {
        return zzad(this.zzd.zza());
    }

    public final void zza(zzbb zzbbVar, zzay zzayVar) {
    }

    public final zzmy zzaa(zzbf zzbfVar, int i, zzwk zzwkVar) {
        zzwk zzwkVar2 = true == zzbfVar.zzg() ? null : zzwkVar;
        long zzb = this.zza.zzb();
        boolean z = zzbfVar.equals(this.zzg.zzq()) && i == this.zzg.zzs();
        long j = 0;
        if (zzwkVar2 == null || !zzwkVar2.zzb()) {
            if (z) {
                j = this.zzg.zzA();
            } else if (!zzbfVar.zzg()) {
                long j2 = zzbfVar.zzb(i, this.zzc, 0L).zzl;
                j = zzfj.zzp(0L);
            }
        } else if (z && this.zzg.zzy() == zzwkVar2.zzb && this.zzg.zzz() == zzwkVar2.zzc) {
            j = this.zzg.zzu();
        }
        return new zzmy(zzb, zzbfVar, i, zzwkVar2, j, this.zzg.zzq(), this.zzg.zzs(), this.zzd.zza(), this.zzg.zzu(), this.zzg.zzw());
    }

    public final /* synthetic */ void zzab(zzbb zzbbVar, zzna zznaVar, zzs zzsVar) {
        zznaVar.zzdi(zzbbVar, new zzmz(zzsVar, this.zze));
    }

    public final /* synthetic */ void zzac() {
        zzmy zzZ = zzZ();
        zzY(zzZ, 1028, new zzou(zzZ));
        this.zzf.zzf();
    }

    public final void zzai(int i, zzwk zzwkVar, zzwb zzwbVar, zzwg zzwgVar, int i2) {
        zzmy zzag = zzag(i, zzwkVar);
        zzY(zzag, 1000, new zznt(zzag, zzwbVar, zzwgVar, i2));
    }

    public final void zzaj(int i, zzwk zzwkVar, zzwb zzwbVar, zzwg zzwgVar) {
        zzmy zzag = zzag(i, zzwkVar);
        zzY(zzag, 1001, new zznu(zzag, zzwbVar, zzwgVar));
    }

    public final void zzak(int i, zzwk zzwkVar, zzwb zzwbVar, zzwg zzwgVar) {
        zzmy zzag = zzag(i, zzwkVar);
        zzY(zzag, 1002, new zznv(zzag, zzwbVar, zzwgVar));
    }

    public final void zzal(int i, zzwk zzwkVar, zzwb zzwbVar, zzwg zzwgVar, IOException iOException, boolean z) {
        zzmy zzag = zzag(i, zzwkVar);
        zzY(zzag, 1003, new zznw(zzag, zzwbVar, zzwgVar, iOException, z));
    }

    public final void zzam(int i, zzwk zzwkVar, zzwg zzwgVar) {
        zzmy zzag = zzag(i, zzwkVar);
        zzY(zzag, 1004, new zzny(zzag, zzwgVar));
    }

    public final void zzb(zzbf zzbfVar, int i) {
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        this.zzd.zzg(zzbbVar);
        zzmy zzZ = zzZ();
        zzY(zzZ, 0, new zznz(zzZ, i));
    }

    public final void zzc(zzak zzakVar, int i) {
        zzmy zzZ = zzZ();
        zzY(zzZ, 1, new zzoa(zzZ, zzakVar, i));
    }

    public final void zzd(zzbn zzbnVar) {
        zzmy zzZ = zzZ();
        zzY(zzZ, 2, new zzob(zzZ, zzbnVar));
    }

    public final void zze(zzan zzanVar) {
        zzmy zzZ = zzZ();
        zzY(zzZ, 14, new zzoo(zzZ, zzanVar));
    }

    public final void zzf(boolean z) {
        zzmy zzZ = zzZ();
        zzY(zzZ, 3, new zzoc(zzZ, z));
    }

    public final void zzg(zzax zzaxVar) {
        zzmy zzZ = zzZ();
        zzY(zzZ, 13, new zzod(zzZ, zzaxVar));
    }

    public final void zzh(boolean z, int i) {
        zzmy zzZ = zzZ();
        zzY(zzZ, -1, new zzoe(zzZ, z, i));
    }

    public final void zzi(int i) {
        zzmy zzZ = zzZ();
        zzY(zzZ, 4, new zzof(zzZ, i));
    }

    public final void zzj(boolean z, int i) {
        zzmy zzZ = zzZ();
        zzY(zzZ, 5, new zzog(zzZ, z, i));
    }

    public final void zzk(int i) {
        zzmy zzZ = zzZ();
        zzY(zzZ, 6, new zzoh(zzZ, i));
    }

    public final void zzl(boolean z) {
        zzmy zzZ = zzZ();
        zzY(zzZ, 7, new zzoj(zzZ, z));
    }

    public final void zzm(zzau zzauVar) {
        zzmy zzah = zzah(zzauVar);
        zzY(zzah, 10, new zzok(zzah, zzauVar));
    }

    public final void zzn(zzau zzauVar) {
        zzmy zzah = zzah(zzauVar);
        zzY(zzah, 10, new zzol(zzah, zzauVar));
    }

    public final void zzo(zzba zzbaVar, zzba zzbaVar2, int i) {
        if (i == 1) {
            this.zzi = false;
            i = 1;
        }
        zzpb zzpbVar = this.zzd;
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        zzpbVar.zzf(zzbbVar);
        zzmy zzZ = zzZ();
        zzY(zzZ, 11, new zzom(zzZ, i, zzbaVar, zzbaVar2));
    }

    public final void zzp(zzav zzavVar) {
        zzmy zzZ = zzZ();
        zzY(zzZ, 12, new zzon(zzZ, zzavVar));
    }

    public final void zzq(int i) {
        zzmy zzaf = zzaf();
        zzY(zzaf, 21, new zzoq(zzaf, i));
    }

    public final void zzr(float f) {
        zzmy zzaf = zzaf();
        zzY(zzaf, 22, new zzng(zzaf, f));
    }

    public final void zzs(boolean z) {
        zzmy zzaf = zzaf();
        zzY(zzaf, 23, new zzop(zzaf, z));
    }

    public final void zzt(zzbv zzbvVar) {
        zzmy zzaf = zzaf();
        zzY(zzaf, 25, new zzor(zzaf, zzbvVar));
    }

    public final void zzu(int i, int i2) {
        zzmy zzaf = zzaf();
        zzY(zzaf, 24, new zzns(zzaf, i, i2));
    }

    public final void zzv(zzna zznaVar) {
        this.zzf.zzb(zznaVar);
    }

    public final void zzw(zzna zznaVar) {
        this.zzf.zzc(zznaVar);
    }

    public final void zzx(zzbb zzbbVar, Looper looper) {
        boolean z = true;
        if (this.zzg != null && !this.zzd.zzi().isEmpty()) {
            z = false;
        }
        zzgrc.zzi(z);
        zzbbVar.getClass();
        this.zzg = zzbbVar;
        zzdn zzdnVar = this.zza;
        this.zzh = zzdnVar.zzd(looper, null);
        this.zzf = this.zzf.zza(looper, zzdnVar, new zzpa(this, zzbbVar));
    }

    public final void zzy() {
        zzdx zzdxVar = this.zzh;
        zzdxVar.getClass();
        zzdxVar.zzn(new zznb(this));
    }

    public final void zzz(List list, zzwk zzwkVar) {
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        this.zzd.zzh(list, zzwkVar, zzbbVar);
    }
}
