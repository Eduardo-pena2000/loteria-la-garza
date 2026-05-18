package com.google.android.gms.internal.ads;

import S5.V0;
import S5.c1;
import S5.s2;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfer implements zzdbi, zzdde, zzfgg, U5.E, zzddw, zzdbv, zzdjm {
    private final zzfkv zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzfer zzh = null;

    public zzfer(zzfkv zzfkvVar) {
        this.zza = zzfkvVar;
    }

    public static zzfer zzn(zzfer zzferVar) {
        zzfer zzferVar2 = new zzfer(zzferVar.zza);
        zzferVar2.zzh = zzferVar;
        return zzferVar2;
    }

    public final void zzdI(c1 c1Var) {
        zzfer zzferVar = this.zzh;
        if (zzferVar != null) {
            zzferVar.zzdI(c1Var);
            return;
        }
        AtomicReference atomicReference = this.zzb;
        zzffy.zza(atomicReference, new zzfeh(c1Var));
        zzffy.zza(atomicReference, new zzfei(c1Var));
    }

    public final void zzdQ() {
    }

    public final void zzdS() {
        zzfer zzferVar = this.zzh;
        if (zzferVar != null) {
            zzferVar.zzdS();
        } else {
            zzffy.zza(this.zzf, zzfed.zza);
        }
    }

    public final void zzdT(int i) {
        zzfer zzferVar = this.zzh;
        if (zzferVar != null) {
            zzferVar.zzdT(i);
        } else {
            zzffy.zza(this.zzf, new zzfej(i));
        }
    }

    public final void zzdo() {
    }

    public final void zzdp() {
    }

    public final void zzdq() {
    }

    public final void zzdu() {
        zzfer zzferVar = this.zzh;
        if (zzferVar != null) {
            zzferVar.zzdu();
        } else {
            zzffy.zza(this.zzd, zzfep.zza);
        }
    }

    public final void zzdv() {
        zzfer zzferVar = this.zzh;
        if (zzferVar != null) {
            zzferVar.zzdv();
        } else {
            zzffy.zza(this.zzf, zzfee.zza);
        }
    }

    public final void zzdw() {
    }

    public final void zzdx() {
    }

    public final void zzdy() {
    }

    public final void zzdz() {
    }

    public final void zzh() {
        zzfer zzferVar = this.zzh;
        if (zzferVar != null) {
            zzferVar.zzh();
            return;
        }
        zzffy.zza(this.zzf, zzfef.zza);
        AtomicReference atomicReference = this.zzd;
        zzffy.zza(atomicReference, zzfen.zza);
        zzffy.zza(atomicReference, zzfeo.zza);
    }

    public final void zzj(c1 c1Var) {
        zzfer zzferVar = this.zzh;
        if (zzferVar != null) {
            zzferVar.zzj(c1Var);
        } else {
            zzffy.zza(this.zzd, new zzfek(c1Var));
        }
    }

    public final void zzl() {
        zzfer zzferVar = this.zzh;
        if (zzferVar != null) {
            zzferVar.zzl();
        } else {
            zzffy.zza(this.zze, zzfec.zza);
        }
    }

    public final void zzm(s2 s2Var) {
        zzfer zzferVar = this.zzh;
        if (zzferVar != null) {
            zzferVar.zzm(s2Var);
        } else {
            zzffy.zza(this.zzg, new zzfel(s2Var));
        }
    }

    public final void zzo(zzbfa zzbfaVar) {
        this.zzb.set(zzbfaVar);
    }

    public final void zzp(zzbfe zzbfeVar) {
        this.zzd.set(zzbfeVar);
    }

    public final void zzq(U5.E e) {
        this.zzf.set(e);
    }

    public final void zzr(V0 v0) {
        this.zzg.set(v0);
    }

    public final void zzs(zzbex zzbexVar) {
        zzfer zzferVar = this.zzh;
        if (zzferVar != null) {
            zzferVar.zzs(zzbexVar);
        } else {
            zzffy.zza(this.zzb, new zzfeg(zzbexVar));
        }
    }

    public final void zzt() {
        zzfer zzferVar = this.zzh;
        if (zzferVar != null) {
            zzferVar.zzt();
            return;
        }
        this.zza.zzb();
        zzffy.zza(this.zzc, zzfem.zza);
        zzffy.zza(this.zzd, zzfeq.zza);
    }

    public final void zzu(zzfgg zzfggVar) {
        this.zzh = (zzfer) zzfggVar;
    }
}
