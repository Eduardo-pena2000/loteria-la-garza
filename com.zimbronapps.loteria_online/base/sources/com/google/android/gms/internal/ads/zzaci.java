package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzaci implements zzadr {
    final /* synthetic */ zzaco zza;
    private zzguf zzb;
    private zzv zzc;
    private long zzd;
    private long zze;
    private int zzf;

    public zzaci(zzaco zzacoVar, Context context, int i) {
        Objects.requireNonNull(zzacoVar);
        this.zza = zzacoVar;
        zzfj.zzR(context);
        this.zzb = zzguf.zzi();
        this.zze = -9223372036854775807L;
        zzado zzadoVar = zzado.zzb;
    }

    private static final void zzy(zzv zzvVar) {
        zzt zza = zzvVar.zza();
        zza.zzC(zzaco.zzB(zzvVar.zzE));
        zza.zzM();
        throw null;
    }

    public final void zza() {
        zzaco zzacoVar = this.zza;
        if (zzacoVar.zzt()) {
            zzacoVar.zze();
        }
    }

    public final void zzb() {
        zzaco zzacoVar = this.zza;
        if (zzacoVar.zzt()) {
            zzacoVar.zzf();
        }
    }

    public final void zzc(zzado zzadoVar, Executor executor) {
    }

    public final boolean zzd(zzv zzvVar) throws zzadq {
        return this.zza.zzi(zzvVar, 0);
    }

    public final boolean zze() {
        return false;
    }

    public final void zzf() {
    }

    public final void zzg(boolean z) {
        this.zze = -9223372036854775807L;
        this.zza.zzm(z);
    }

    public final boolean zzh(boolean z) {
        return this.zza.zzj(false);
    }

    public final void zzi() {
        zzaco zzacoVar = this.zza;
        zzacoVar.zzA(this.zze);
        if (zzacoVar.zzy() >= zzacoVar.zzz()) {
            zzacoVar.zzk();
        }
    }

    public final boolean zzj() {
        return false;
    }

    public final Surface zzk() {
        zzgrc.zzi(false);
        throw null;
    }

    public final void zzl(zzacp zzacpVar) {
        this.zza.zzp(zzacpVar);
    }

    public final void zzm(float f) {
        this.zza.zzq(f);
    }

    public final void zzn(List list) {
        if (this.zzb.equals(list)) {
            return;
        }
        this.zzb = zzguf.zzq(list);
        zzv zzvVar = this.zzc;
        if (zzvVar != null) {
            zzy(zzvVar);
        }
    }

    public final void zzo(long j) {
        this.zzd = j;
    }

    public final void zzp(Surface surface, zzes zzesVar) {
        this.zza.zzc(surface, zzesVar);
    }

    public final void zzq() {
        this.zza.zzd();
    }

    public final void zzr(int i) {
        this.zza.zzr(i);
    }

    public final void zzs(int i, zzv zzvVar, long j, int i2, List list) {
        zzgrc.zzi(false);
        this.zzb = zzguf.zzq(list);
        this.zzc = zzvVar;
        zzaco zzacoVar = this.zza;
        zzacoVar.zzA(-9223372036854775807L);
        zzy(zzvVar);
        long j2 = this.zze;
        long j3 = -4611686018427387904L;
        if (zzacoVar.zzt()) {
            if (j2 != -9223372036854775807L) {
                j3 = j2 + 1;
            }
        } else if (j2 != -9223372036854775807L) {
            return;
        }
        zzacoVar.zzw().zza(j3, new zzacn(j + this.zzd, i2, j3));
    }

    public final void zzt() {
        zzaco zzacoVar = this.zza;
        if (zzacoVar.zzw().zzc() == 0) {
            zzacoVar.zzo();
            return;
        }
        zzff zzffVar = new zzff(10);
        boolean z = true;
        while (zzacoVar.zzw().zzc() > 0) {
            zzacn zzacnVar = (zzacn) zzacoVar.zzw().zzd();
            zzacnVar.getClass();
            if (z) {
                int i = zzacnVar.zzb;
                if (i == 0 || i == 1) {
                    zzacnVar = new zzacn(zzacnVar.zza, 0, zzacnVar.zzc);
                } else {
                    zzacoVar.zzo();
                }
            }
            zzffVar.zza(zzacnVar.zzc, zzacnVar);
            z = false;
        }
        zzacoVar.zzx(zzffVar);
    }

    public final boolean zzu(long j, zzadp zzadpVar) {
        int i;
        zzgrc.zzi(false);
        long j2 = j + this.zzd;
        zzaco zzacoVar = this.zza;
        long zzb = zzacoVar.zzv().zzb(j2);
        if (zzb == -9223372036854775807L || zzacoVar.zzu() == -9223372036854775807L || zzb >= zzacoVar.zzu() || (i = this.zzf) >= 2) {
            if (zzacoVar.zzs()) {
                throw null;
            }
            return false;
        }
        this.zzf = i + 1;
        zzadpVar.zzb();
        return true;
    }

    public final void zzv(long j, long j2) throws zzadq {
        this.zza.zzl(j + this.zzd, j2);
    }

    public final void zzw(boolean z) {
        zzaco zzacoVar = this.zza;
        if (zzacoVar.zzt()) {
            zzacoVar.zzn(z);
        }
    }

    public final void zzx() {
        this.zza.zzg();
    }
}
