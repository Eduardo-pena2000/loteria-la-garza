package com.google.android.gms.internal.ads;

import S5.V0;
import S5.c1;
import S5.s2;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfhv implements f6.a, zzdct, zzdbi, zzdbf, zzdbv, zzddw, zzfgg, zzdjm {
    private final zzfkv zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();
    private zzfhv zzi = null;

    public zzfhv(zzfkv zzfkvVar) {
        this.zza = zzfkvVar;
    }

    public final void onAdMetadataChanged() {
        zzfhv zzfhvVar = this.zzi;
        if (zzfhvVar != null) {
            zzfhvVar.onAdMetadataChanged();
        } else {
            zzffy.zza(this.zzb, zzfhu.zza);
        }
    }

    public final void zzd(zzcag zzcagVar, String str, String str2) {
        zzfhv zzfhvVar = this.zzi;
        if (zzfhvVar != null) {
            zzfhvVar.zzd(zzcagVar, str, str2);
            return;
        }
        zzffy.zza(this.zzd, new zzfhb(zzcagVar));
        zzffy.zza(this.zzf, new zzfhc(zzcagVar, str, str2));
        zzffy.zza(this.zze, new zzfhd(zzcagVar));
        zzffy.zza(this.zzg, new zzfhe(zzcagVar, str, str2));
    }

    public final void zzdI(c1 c1Var) {
        zzfhv zzfhvVar = this.zzi;
        if (zzfhvVar != null) {
            zzfhvVar.zzdI(c1Var);
            return;
        }
        int i = c1Var.a;
        AtomicReference atomicReference = this.zzc;
        zzffy.zza(atomicReference, new zzfhi(c1Var));
        zzffy.zza(atomicReference, new zzfgz(i));
        zzffy.zza(this.zze, new zzfha(i));
    }

    public final void zzdJ() {
        zzfhv zzfhvVar = this.zzi;
        if (zzfhvVar != null) {
            zzfhvVar.zzdJ();
        } else {
            zzffy.zza(this.zze, zzfhq.zza);
        }
    }

    public final void zzdQ() {
    }

    public final void zzds() {
        zzfhv zzfhvVar = this.zzi;
        if (zzfhvVar != null) {
            zzfhvVar.zzds();
            return;
        }
        this.zza.zzb();
        zzffy.zza(this.zzd, zzfhk.zza);
        zzffy.zza(this.zze, zzfhp.zza);
    }

    public final void zzdt() {
        zzfhv zzfhvVar = this.zzi;
        if (zzfhvVar != null) {
            zzfhvVar.zzdt();
            return;
        }
        AtomicReference atomicReference = this.zzd;
        zzffy.zza(atomicReference, zzfhm.zza);
        zzffy.zza(this.zze, zzfho.zza);
        zzffy.zza(atomicReference, zzfhj.zza);
    }

    public final void zzdu() {
        zzfhv zzfhvVar = this.zzi;
        if (zzfhvVar != null) {
            zzfhvVar.zzdu();
        } else {
            zzffy.zza(this.zzd, zzfhl.zza);
        }
    }

    public final void zze() {
        zzfhv zzfhvVar = this.zzi;
        if (zzfhvVar != null) {
            zzfhvVar.zze();
        } else {
            zzffy.zza(this.zze, zzfhr.zza);
        }
    }

    public final void zzf() {
        zzfhv zzfhvVar = this.zzi;
        if (zzfhvVar != null) {
            zzfhvVar.zzf();
        } else {
            zzffy.zza(this.zze, zzfhs.zza);
        }
    }

    public final void zzg() {
        zzfhv zzfhvVar = this.zzi;
        if (zzfhvVar != null) {
            zzfhvVar.zzg();
        } else {
            zzffy.zza(this.zzc, zzfhn.zza);
            zzffy.zza(this.zze, zzfht.zza);
        }
    }

    public final void zzh(zzcbg zzcbgVar) {
        this.zzc.set(zzcbgVar);
    }

    public final void zzi(zzcbc zzcbcVar) {
        this.zzd.set(zzcbcVar);
    }

    public final void zzj(c1 c1Var) {
        zzfhv zzfhvVar = this.zzi;
        if (zzfhvVar != null) {
            zzfhvVar.zzj(c1Var);
            return;
        }
        AtomicReference atomicReference = this.zzd;
        zzffy.zza(atomicReference, new zzfhf(c1Var));
        zzffy.zza(atomicReference, new zzfhg(c1Var));
    }

    public final void zzk(f6.a aVar) {
        this.zzb.set(aVar);
    }

    public final void zzl(V0 v0) {
        this.zzh.set(v0);
    }

    public final void zzm(s2 s2Var) {
        zzfhv zzfhvVar = this.zzi;
        if (zzfhvVar != null) {
            zzfhvVar.zzm(s2Var);
        } else {
            zzffy.zza(this.zzh, new zzfhh(s2Var));
        }
    }

    @Deprecated
    public final void zzn(zzcam zzcamVar) {
        this.zze.set(zzcamVar);
    }

    public final void zzo(zzcbh zzcbhVar) {
        this.zzf.set(zzcbhVar);
    }

    @Deprecated
    public final void zzp(zzcah zzcahVar) {
        this.zzg.set(zzcahVar);
    }

    public final void zzu(zzfgg zzfggVar) {
        this.zzi = (zzfhv) zzfggVar;
    }
}
