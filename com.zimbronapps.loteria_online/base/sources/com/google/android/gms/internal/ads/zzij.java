package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzij implements zzml, zzmn {
    private final int zzb;
    private zzmo zzd;
    private int zze;
    private zzpq zzf;
    private zzdn zzg;
    private int zzh;
    private zzyc zzi;
    private zzv[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;
    private zzwk zzq;
    private zzmm zzr;
    private final Object zza = new Object();
    private final zzlh zzc = new zzlh();
    private long zzm = Long.MIN_VALUE;
    private zzbf zzp = zzbf.zza;

    public zzij(int i) {
        this.zzb = i;
    }

    private final void zzac(long j, boolean z, boolean z2) throws zziw {
        this.zzn = false;
        this.zzl = j;
        this.zzm = j;
        if (!z2) {
            z2 = zzP(j) != 0;
        }
        zzA(j, z, z2);
    }

    public void zzA(long j, boolean z, boolean z2) throws zziw {
        throw null;
    }

    public void zzB() throws zziw {
    }

    public void zzC() {
    }

    public void zzD() {
        throw null;
    }

    public void zzE() {
    }

    public void zzF() {
    }

    public final long zzG() {
        return this.zzl;
    }

    public final zzlh zzH() {
        zzlh zzlhVar = this.zzc;
        zzlhVar.zza = null;
        zzlhVar.zzb = null;
        return zzlhVar;
    }

    public final zzv[] zzI() {
        zzv[] zzvVarArr = this.zzj;
        zzvVarArr.getClass();
        return zzvVarArr;
    }

    public final zzmo zzJ() {
        zzmo zzmoVar = this.zzd;
        zzmoVar.getClass();
        return zzmoVar;
    }

    public final zzpq zzK() {
        zzpq zzpqVar = this.zzf;
        zzpqVar.getClass();
        return zzpqVar;
    }

    public final zzdn zzL() {
        zzdn zzdnVar = this.zzg;
        zzdnVar.getClass();
        return zzdnVar;
    }

    public final zzbf zzM() {
        return this.zzp;
    }

    public final zziw zzN(Throwable th, zzv zzvVar, boolean z, int i) {
        int i2 = 4;
        if (zzvVar != null && !this.zzo) {
            this.zzo = true;
            try {
                i2 = zzab(zzvVar) & 7;
            } catch (zziw unused) {
            } finally {
                this.zzo = false;
            }
        }
        return zziw.zzb(th, zzS(), this.zze, zzvVar, i2, this.zzq, z, i);
    }

    public final int zzO(zzlh zzlhVar, zzih zzihVar, int i) {
        zzyc zzycVar = this.zzi;
        zzycVar.getClass();
        int zzd = zzycVar.zzd(zzlhVar, zzihVar, i);
        if (zzd == -4) {
            if (zzihVar.zzb()) {
                this.zzm = Long.MIN_VALUE;
                return this.zzn ? -4 : -3;
            }
            long j = zzihVar.zze + this.zzk;
            zzihVar.zze = j;
            this.zzm = Math.max(this.zzm, j);
        } else if (zzd == -5) {
            zzv zzvVar = zzlhVar.zzb;
            zzvVar.getClass();
            long j2 = zzvVar.zzt;
            if (j2 != Long.MAX_VALUE) {
                zzt zza = zzvVar.zza();
                zza.zzr(j2 + this.zzk);
                zzlhVar.zzb = zza.zzM();
                return -5;
            }
        }
        return zzd;
    }

    public final int zzP(long j) {
        zzyc zzycVar = this.zzi;
        zzycVar.getClass();
        return zzycVar.zze(j - this.zzk);
    }

    public final boolean zzQ() {
        if (zzcW()) {
            return this.zzn;
        }
        zzyc zzycVar = this.zzi;
        zzycVar.getClass();
        return zzycVar.zzb();
    }

    public final void zzR() {
        zzmm zzmmVar;
        synchronized (this.zza) {
            zzmmVar = this.zzr;
        }
        if (zzmmVar != null) {
            zzmmVar.zza(this);
        }
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzmn zzb() {
        return this;
    }

    public final void zzc(int i, zzpq zzpqVar, zzdn zzdnVar) {
        this.zze = i;
        this.zzf = zzpqVar;
        this.zzg = zzdnVar;
    }

    public final void zzcT() throws zziw {
        zzgrc.zzi(this.zzh == 1);
        this.zzh = 2;
        zzB();
    }

    public final void zzcU(zzv[] zzvVarArr, zzyc zzycVar, long j, long j2, zzwk zzwkVar) throws zziw {
        zzgrc.zzi(!this.zzn);
        this.zzi = zzycVar;
        this.zzq = zzwkVar;
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j;
        }
        this.zzj = zzvVarArr;
        this.zzk = j2;
        zzz(zzvVarArr, j, j2, zzwkVar);
    }

    public final zzyc zzcV() {
        return this.zzi;
    }

    public final boolean zzcW() {
        return this.zzm == Long.MIN_VALUE;
    }

    public zzlm zzd() {
        return null;
    }

    public final int zze() {
        return this.zzh;
    }

    public final void zzf(zzmo zzmoVar, zzv[] zzvVarArr, zzyc zzycVar, long j, boolean z, boolean z2, long j2, long j3, zzwk zzwkVar) throws zziw {
        zzgrc.zzi(this.zzh == 0);
        this.zzd = zzmoVar;
        this.zzq = zzwkVar;
        this.zzh = 1;
        zzy(z, z2);
        zzcU(zzvVarArr, zzycVar, j2, j3, zzwkVar);
        zzac(j2, z, true);
    }

    public final long zzk() {
        return this.zzm;
    }

    public final void zzl() {
        this.zzn = true;
    }

    public final boolean zzm() {
        return this.zzn;
    }

    public final void zzn() throws IOException {
        zzyc zzycVar = this.zzi;
        zzycVar.getClass();
        zzycVar.zzc();
    }

    public final void zzo(zzbf zzbfVar) {
        if (Objects.equals(this.zzp, zzbfVar)) {
            return;
        }
        this.zzp = zzbfVar;
    }

    public final void zzp(long j, boolean z) throws zziw {
        zzac(j, false, z);
    }

    public final void zzq() {
        zzgrc.zzi(this.zzh == 2);
        this.zzh = 1;
        zzC();
    }

    public final void zzr() {
        zzgrc.zzi(this.zzh == 1);
        zzlh zzlhVar = this.zzc;
        zzlhVar.zza = null;
        zzlhVar.zzb = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzD();
        this.zzq = null;
    }

    public final void zzs() {
        zzgrc.zzi(this.zzh == 0);
        zzlh zzlhVar = this.zzc;
        zzlhVar.zza = null;
        zzlhVar.zzb = null;
        zzE();
    }

    public final void zzt() {
        zzgrc.zzi(this.zzh == 0);
        zzF();
    }

    public int zzu() throws zziw {
        return 0;
    }

    public final void zzv(zzmm zzmmVar) {
        synchronized (this.zza) {
            this.zzr = zzmmVar;
        }
    }

    public final void zzw() {
        synchronized (this.zza) {
            this.zzr = null;
        }
    }

    public void zzx(int i, Object obj) throws zziw {
    }

    public void zzy(boolean z, boolean z2) throws zziw {
    }

    public void zzz(zzv[] zzvVarArr, long j, long j2, zzwk zzwkVar) throws zziw {
    }
}
