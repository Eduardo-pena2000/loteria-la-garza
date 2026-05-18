package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzln {
    public final zzwi zza;
    public final Object zzb;
    public final zzyc[] zzc;
    public boolean zzd;
    public boolean zze;
    public boolean zzf;
    public zzlo zzg;
    public boolean zzh;
    private final boolean[] zzi;
    private final zzmn[] zzj;
    private final zzaaj zzk;
    private final zzmc zzl;
    private zzln zzm;
    private zzyn zzn;
    private zzaak zzo;
    private long zzp;

    public zzln(zzmn[] zzmnVarArr, long j, zzaaj zzaajVar, zzaan zzaanVar, zzmc zzmcVar, zzlo zzloVar, zzaak zzaakVar, long j2) {
        this.zzj = zzmnVarArr;
        this.zzp = j;
        this.zzk = zzaajVar;
        this.zzl = zzmcVar;
        zzwk zzwkVar = zzloVar.zza;
        this.zzb = zzwkVar.zza;
        this.zzg = zzloVar;
        this.zzn = zzyn.zza;
        this.zzo = zzaakVar;
        this.zzc = new zzyc[2];
        this.zzi = new boolean[2];
        long j3 = zzloVar.zzb;
        long j4 = zzloVar.zzd;
        zzwi zze = zzmcVar.zze(zzwkVar, zzaanVar, j3);
        this.zza = j4 != -9223372036854775807L ? new zzvo(zze, true, 0L, j4) : zze;
    }

    private final void zzu() {
        if (!zzw()) {
            return;
        }
        int i = 0;
        while (true) {
            zzaak zzaakVar = this.zzo;
            if (i >= zzaakVar.zza) {
                return;
            }
            zzaakVar.zza(i);
            zzaac zzaacVar = this.zzo.zzc[i];
            i++;
        }
    }

    private final void zzv() {
        if (!zzw()) {
            return;
        }
        int i = 0;
        while (true) {
            zzaak zzaakVar = this.zzo;
            if (i >= zzaakVar.zza) {
                return;
            }
            zzaakVar.zza(i);
            zzaac zzaacVar = this.zzo.zzc[i];
            i++;
        }
    }

    private final boolean zzw() {
        return this.zzm == null;
    }

    public final long zza() {
        return this.zzp;
    }

    public final void zzb(long j) {
        this.zzp = j;
    }

    public final long zzc() {
        return this.zzg.zzb + this.zzp;
    }

    public final boolean zzd() {
        if (this.zze) {
            return !this.zzf || this.zza.zzi() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean zze() {
        if (this.zze) {
            return zzd() || zzf() - this.zzg.zzb >= -9223372036854775807L;
        }
        return false;
    }

    public final long zzf() {
        if (!this.zze) {
            return this.zzg.zzb;
        }
        long zzi = this.zzf ? this.zza.zzi() : Long.MIN_VALUE;
        return zzi == Long.MIN_VALUE ? this.zzg.zze : zzi;
    }

    public final long zzg() {
        if (this.zze) {
            return this.zza.zzl();
        }
        return 0L;
    }

    public final void zzh(float f, zzbf zzbfVar, boolean z) throws zziw {
        this.zze = true;
        this.zzn = this.zza.zzd();
        zzaak zzk = zzk(f, zzbfVar, z);
        zzlo zzloVar = this.zzg;
        long j = zzloVar.zzb;
        long j2 = zzloVar.zze;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long zzl = zzl(zzk, j, false);
        long j3 = this.zzp;
        zzlo zzloVar2 = this.zzg;
        this.zzp = j3 + (zzloVar2.zzb - zzl);
        this.zzg = zzloVar2.zza(zzl);
    }

    public final void zzi(long j) {
        zzgrc.zzi(zzw());
        if (this.zze) {
            this.zza.zzg(j - this.zzp);
        }
    }

    public final void zzj(zzll zzllVar) {
        zzgrc.zzi(zzw());
        this.zza.zzm(zzllVar);
    }

    public final zzaak zzk(float f, zzbf zzbfVar, boolean z) throws zziw {
        zzyn zzynVar = this.zzn;
        zzwk zzwkVar = this.zzg.zza;
        zzaaj zzaajVar = this.zzk;
        zzmn[] zzmnVarArr = this.zzj;
        zzaak zzq = zzaajVar.zzq(zzmnVarArr, zzynVar, zzwkVar, zzbfVar);
        for (int i = 0; i < zzq.zza; i++) {
            if (zzq.zza(i)) {
                if (zzq.zzc[i] == null) {
                    zzmnVarArr[i].zza();
                    r2 = false;
                }
                zzgrc.zzi(r2);
            } else {
                zzgrc.zzi(zzq.zzc[i] == null);
            }
        }
        for (zzaac zzaacVar : zzq.zzc) {
        }
        return zzq;
    }

    public final long zzl(zzaak zzaakVar, long j, boolean z) {
        return zzm(zzaakVar, j, false, new boolean[2]);
    }

    public final long zzm(zzaak zzaakVar, long j, boolean z, boolean[] zArr) {
        zzmn[] zzmnVarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzaakVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzi;
            if (z || !zzaakVar.zzb(this.zzo, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            zzmnVarArr = this.zzj;
            if (i2 >= 2) {
                break;
            }
            zzmnVarArr[i2].zza();
            i2++;
        }
        zzv();
        this.zzo = zzaakVar;
        zzu();
        zzwi zzwiVar = this.zza;
        zzaac[] zzaacVarArr = zzaakVar.zzc;
        boolean[] zArr3 = this.zzi;
        zzyc[] zzycVarArr = this.zzc;
        long zze = zzwiVar.zze(zzaacVarArr, zArr3, zzycVarArr, zArr, j);
        for (int i3 = 0; i3 < 2; i3++) {
            zzmnVarArr[i3].zza();
        }
        this.zzf = false;
        for (int i4 = 0; i4 < 2; i4++) {
            if (zzycVarArr[i4] != null) {
                zzgrc.zzi(zzaakVar.zza(i4));
                zzmnVarArr[i4].zza();
                this.zzf = true;
            } else {
                zzgrc.zzi(zzaacVarArr[i4] == null);
            }
        }
        return zze;
    }

    public final void zzn() {
        zzv();
        zzwi zzwiVar = this.zza;
        try {
            boolean z = zzwiVar instanceof zzvo;
            zzmc zzmcVar = this.zzl;
            if (z) {
                zzmcVar.zzf(((zzvo) zzwiVar).zza);
            } else {
                zzmcVar.zzf(zzwiVar);
            }
        } catch (RuntimeException e) {
            zzee.zzf("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void zzo(zzln zzlnVar) {
        if (zzlnVar == this.zzm) {
            return;
        }
        zzv();
        this.zzm = zzlnVar;
        zzu();
    }

    public final zzln zzp() {
        return this.zzm;
    }

    public final zzyn zzq() {
        return this.zzn;
    }

    public final zzaak zzr() {
        return this.zzo;
    }

    public final void zzs() {
        zzwi zzwiVar = this.zza;
        if (zzwiVar instanceof zzvo) {
            long j = this.zzg.zzd;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((zzvo) zzwiVar).zza(0L, j);
        }
    }

    public final void zzt(zzwh zzwhVar, long j) {
        this.zzd = true;
        this.zza.zzb(zzwhVar, j);
    }
}
