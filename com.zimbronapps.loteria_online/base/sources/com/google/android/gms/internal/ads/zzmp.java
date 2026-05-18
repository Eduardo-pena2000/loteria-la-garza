package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzmp {
    private final zzml zza;
    private final int zzb;
    private final zzml zzc;
    private int zzd = 0;
    private boolean zze = false;
    private boolean zzf = false;

    public zzmp(zzml zzmlVar, zzml zzmlVar2, int i) {
        this.zza = zzmlVar;
        this.zzb = i;
        this.zzc = zzmlVar2;
    }

    private final boolean zzN() {
        int i = this.zzd;
        return i == 2 || i == 4;
    }

    private final boolean zzO() {
        return this.zzd == 3;
    }

    private final boolean zzP(zzln zzlnVar, zzml zzmlVar) {
        if (zzmlVar == null) {
            return true;
        }
        zzyc[] zzycVarArr = zzlnVar.zzc;
        int i = this.zzb;
        zzyc zzycVar = zzycVarArr[i];
        if (zzmlVar.zzcV() != null) {
            if (zzmlVar.zzcV() == zzycVar) {
                if (zzycVar != null && !zzmlVar.zzcW()) {
                    zzlnVar.zzp();
                    boolean z = zzlnVar.zzg.zzg;
                }
            }
            zzln zzp = zzlnVar.zzp();
            return zzp != null && zzp.zzc[i] == zzmlVar.zzcV();
        }
        return true;
    }

    private final void zzQ(boolean z) throws zziw {
        if (z) {
            zzml zzmlVar = this.zzc;
            zzmlVar.getClass();
            zzmlVar.zzx(17, this.zza);
        } else {
            zzml zzmlVar2 = this.zza;
            zzml zzmlVar3 = this.zzc;
            zzmlVar3.getClass();
            zzmlVar2.zzx(17, zzmlVar3);
        }
    }

    private final void zzR(zzml zzmlVar, zzyc zzycVar, zziu zziuVar, long j, boolean z) throws zziw {
        if (zzW(zzmlVar)) {
            if (zzycVar != zzmlVar.zzcV()) {
                zzS(zzmlVar, zziuVar);
            } else if (z) {
                zzmlVar.zzp(j, true);
            }
        }
    }

    private final void zzS(zzml zzmlVar, zziu zziuVar) {
        boolean z = true;
        if (this.zza != zzmlVar && this.zzc != zzmlVar) {
            z = false;
        }
        zzgrc.zzi(z);
        if (zzW(zzmlVar)) {
            zziuVar.zze(zzmlVar);
            zzY(zzmlVar);
            zzmlVar.zzr();
        }
    }

    private final void zzT(boolean z) {
        if (z) {
            if (this.zze) {
                this.zza.zzs();
                this.zze = false;
                return;
            }
            return;
        }
        if (this.zzf) {
            zzml zzmlVar = this.zzc;
            zzmlVar.getClass();
            zzmlVar.zzs();
            this.zzf = false;
        }
    }

    private final int zzU(zzml zzmlVar, zzln zzlnVar, zzaak zzaakVar, zziu zziuVar) throws zziw {
        if (zzmlVar != null && zzW(zzmlVar)) {
            zzml zzmlVar2 = this.zza;
            boolean z = zzmlVar != zzmlVar2;
            if ((zzmlVar != zzmlVar2 || !zzN()) && (zzmlVar != this.zzc || !zzO())) {
                zzyc zzcV = zzmlVar.zzcV();
                zzyc[] zzycVarArr = zzlnVar.zzc;
                int i = this.zzb;
                zzyc zzycVar = zzycVarArr[i];
                boolean zza = zzaakVar.zza(i);
                if (zza && zzcV == zzycVar) {
                    return 1;
                }
                if (!zzmlVar.zzm()) {
                    zzv[] zzV = zzV(zzaakVar.zzc[i]);
                    zzyc zzycVar2 = zzycVarArr[i];
                    zzycVar2.getClass();
                    zzmlVar.zzcU(zzV, zzycVar2, zzlnVar.zzc(), zzlnVar.zza(), zzlnVar.zzg.zza);
                    return 3;
                }
                if (!zzmlVar.zzZ()) {
                    return 0;
                }
                zzS(zzmlVar, zziuVar);
                if (!zza || zzc()) {
                    zzT(!z);
                }
                return 1;
            }
        }
        return 1;
    }

    private static zzv[] zzV(zzaac zzaacVar) {
        int zze = zzaacVar != null ? zzaacVar.zze() : 0;
        zzv[] zzvVarArr = new zzv[zze];
        for (int i = 0; i < zze; i++) {
            zzaacVar.getClass();
            zzvVarArr[i] = zzaacVar.zzb(i);
        }
        return zzvVarArr;
    }

    private static boolean zzW(zzml zzmlVar) {
        return zzmlVar.zze() != 0;
    }

    private final zzml zzX(zzln zzlnVar) {
        if (zzlnVar != null) {
            int i = this.zzb;
            zzyc[] zzycVarArr = zzlnVar.zzc;
            if (zzycVarArr[i] != null) {
                zzml zzmlVar = this.zza;
                zzyc zzcV = zzmlVar.zzcV();
                zzyc zzycVar = zzycVarArr[i];
                if (zzcV == zzycVar) {
                    return zzmlVar;
                }
                zzml zzmlVar2 = this.zzc;
                if (zzmlVar2 != null && zzmlVar2.zzcV() == zzycVar) {
                    return zzmlVar2;
                }
            }
        }
        return null;
    }

    private static final void zzY(zzml zzmlVar) {
        if (zzmlVar.zze() == 2) {
            zzmlVar.zzq();
        }
    }

    private static final void zzZ(zzml zzmlVar, long j) {
        zzmlVar.zzl();
        if (zzmlVar instanceof zzyr) {
            throw null;
        }
    }

    public final void zzA(zziu zziuVar) throws zziw {
        zzS(this.zza, zziuVar);
        zzml zzmlVar = this.zzc;
        if (zzmlVar != null) {
            boolean z = zzW(zzmlVar) && this.zzd != 3;
            zzS(zzmlVar, zziuVar);
            zzT(false);
            if (z) {
                zzQ(true);
            }
        }
        this.zzd = 0;
    }

    public final void zzB() throws zziw {
        int i = this.zzd;
        if (i == 3 || i == 4) {
            zzQ(i == 4);
            this.zzd = this.zzd != 4 ? 1 : 0;
        } else if (i == 2) {
            this.zzd = 0;
        }
    }

    public final void zzC(zziu zziuVar) {
        boolean z;
        zzml zzmlVar;
        if (zzc()) {
            int i = this.zzd;
            if (i == 4) {
                z = true;
            } else if (i == 2) {
                i = 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                zzmlVar = this.zza;
            } else {
                zzmlVar = this.zzc;
                zzmlVar.getClass();
            }
            zzS(zzmlVar, zziuVar);
            zzT(z);
            this.zzd = i == 4 ? 1 : 0;
        }
    }

    public final void zzD(zzyc zzycVar, zziu zziuVar, long j, boolean z) throws zziw {
        zzR(this.zza, zzycVar, zziuVar, j, z);
        zzml zzmlVar = this.zzc;
        if (zzmlVar != null) {
            zzR(zzmlVar, zzycVar, zziuVar, j, z);
        }
    }

    public final void zzE(zzln zzlnVar, long j, boolean z) throws zziw {
        zzml zzX = zzX(zzlnVar);
        if (zzX != null) {
            zzX.zzp(j, z);
        }
    }

    public final boolean zzF(zzln zzlnVar, long j) {
        zzml zzX = zzX(zzlnVar);
        return zzX != null && zzX.zzU(j);
    }

    public final void zzG() {
        if (!zzW(this.zza)) {
            zzT(true);
        }
        zzml zzmlVar = this.zzc;
        if (zzmlVar == null || zzW(zzmlVar)) {
            return;
        }
        zzT(false);
    }

    public final int zzH(zzln zzlnVar, zzaak zzaakVar, zziu zziuVar) throws zziw {
        int zzU = zzU(this.zza, zzlnVar, zzaakVar, zziuVar);
        return zzU == 1 ? zzU(this.zzc, zzlnVar, zzaakVar, zziuVar) : zzU;
    }

    public final void zzI() {
        this.zza.zzt();
        this.zze = false;
        zzml zzmlVar = this.zzc;
        if (zzmlVar != null) {
            zzmlVar.zzt();
            this.zzf = false;
        }
    }

    public final void zzJ(Object obj) throws zziw {
        if (zze() != 2) {
            return;
        }
        int i = this.zzd;
        if (i != 4 && i != 1) {
            this.zza.zzx(1, obj);
            return;
        }
        zzml zzmlVar = this.zzc;
        zzmlVar.getClass();
        zzmlVar.zzx(1, obj);
    }

    public final void zzK(zzacp zzacpVar) throws zziw {
        if (zze() != 2) {
            zze();
            return;
        }
        this.zza.zzx(7, zzacpVar);
        zzml zzmlVar = this.zzc;
        if (zzmlVar != null) {
            zzmlVar.zzx(7, zzacpVar);
        }
    }

    public final void zzL(float f) throws zziw {
        if (zze() != 1) {
            return;
        }
        zzml zzmlVar = this.zza;
        Float valueOf = Float.valueOf(f);
        zzmlVar.zzx(2, valueOf);
        zzml zzmlVar2 = this.zzc;
        if (zzmlVar2 != null) {
            zzmlVar2.zzx(2, valueOf);
        }
    }

    public final boolean zzM() {
        int i = this.zzd;
        if (i == 0 || i == 2 || i == 4) {
            return zzW(this.zza);
        }
        zzml zzmlVar = this.zzc;
        zzmlVar.getClass();
        return zzW(zzmlVar);
    }

    public final boolean zza() {
        return this.zzc != null;
    }

    public final void zzb() {
        int i;
        zzgrc.zzi(!zzc());
        if (zzW(this.zza)) {
            i = 3;
        } else {
            zzml zzmlVar = this.zzc;
            i = (zzmlVar == null || !zzW(zzmlVar)) ? 2 : 4;
        }
        this.zzd = i;
    }

    public final boolean zzc() {
        return zzN() || zzO();
    }

    public final int zzd() {
        zzml zzmlVar = this.zzc;
        boolean zzW = zzW(this.zza);
        int i = 0;
        if (zzmlVar != null && zzW(zzmlVar)) {
            i = 1;
        }
        return (zzW ? 1 : 0) + i;
    }

    public final int zze() {
        return this.zza.zza();
    }

    public final long zzf(zzln zzlnVar) {
        zzml zzX = zzX(zzlnVar);
        Objects.requireNonNull(zzX);
        return zzX.zzk();
    }

    public final boolean zzg(zzln zzlnVar) {
        zzml zzX = zzX(zzlnVar);
        zzX.getClass();
        return zzX.zzcW();
    }

    public final void zzh(zzln zzlnVar, long j) {
        zzml zzX = zzX(zzlnVar);
        zzX.getClass();
        zzZ(zzX, j);
    }

    public final void zzi(zzaak zzaakVar, zzaak zzaakVar2, long j) {
        int i;
        int i2 = this.zzb;
        boolean zza = zzaakVar.zza(i2);
        boolean zza2 = zzaakVar2.zza(i2);
        zzml zzmlVar = this.zzc;
        if (zzmlVar == null || (i = this.zzd) == 3 || (i == 0 && zzW(this.zza))) {
            zzmlVar = this.zza;
        }
        if (!zza || zzmlVar.zzm()) {
            return;
        }
        zze();
        zzmo zzmoVar = zzaakVar.zzb[i2];
        zzmo zzmoVar2 = zzaakVar2.zzb[i2];
        if (zza2 && Objects.equals(zzmoVar2, zzmoVar) && !zzc()) {
            return;
        }
        zzZ(zzmlVar, j);
    }

    public final void zzj(long j) {
        int i;
        zzml zzmlVar = this.zza;
        if (zzW(zzmlVar) && (i = this.zzd) != 4 && i != 2) {
            zzZ(zzmlVar, j);
        }
        zzml zzmlVar2 = this.zzc;
        if (zzmlVar2 == null || !zzW(zzmlVar2) || this.zzd == 3) {
            return;
        }
        zzZ(zzmlVar2, j);
    }

    public final long zzk(long j, long j2) {
        zzml zzmlVar = this.zza;
        long zzT = zzW(zzmlVar) ? zzmlVar.zzT(j, j2) : Long.MAX_VALUE;
        zzml zzmlVar2 = this.zzc;
        return (zzmlVar2 == null || !zzW(zzmlVar2)) ? zzT : Math.min(zzT, zzmlVar2.zzT(j, j2));
    }

    public final void zzl() {
        zzml zzmlVar = this.zza;
        if (zzW(zzmlVar)) {
            zzmlVar.zzW();
            return;
        }
        zzml zzmlVar2 = this.zzc;
        if (zzmlVar2 == null || !zzW(zzmlVar2)) {
            return;
        }
        zzmlVar2.zzW();
    }

    public final void zzm(float f, float f2) throws zziw {
        this.zza.zzV(f, f2);
        zzml zzmlVar = this.zzc;
        if (zzmlVar != null) {
            zzmlVar.zzV(f, f2);
        }
    }

    public final void zzn(zzbf zzbfVar) {
        this.zza.zzo(zzbfVar);
        zzml zzmlVar = this.zzc;
        if (zzmlVar != null) {
            zzmlVar.zzo(zzbfVar);
        }
    }

    public final boolean zzo() {
        zzml zzmlVar = this.zza;
        boolean zzZ = zzW(zzmlVar) ? zzmlVar.zzZ() : true;
        zzml zzmlVar2 = this.zzc;
        return (zzmlVar2 == null || !zzW(zzmlVar2)) ? zzZ : zzZ & zzmlVar2.zzZ();
    }

    public final boolean zzp(zzln zzlnVar) {
        return zzX(zzlnVar) != null;
    }

    public final boolean zzq(zzln zzlnVar) {
        return (zzN() && zzX(zzlnVar) == this.zza) || (zzO() && zzX(zzlnVar) == this.zzc);
    }

    public final boolean zzr(zzln zzlnVar) {
        return zzP(zzlnVar, this.zza) && zzP(zzlnVar, this.zzc);
    }

    public final void zzs(long j, long j2) throws zziw {
        zzml zzmlVar = this.zza;
        if (zzW(zzmlVar)) {
            zzmlVar.zzX(j, j2);
        }
        zzml zzmlVar2 = this.zzc;
        if (zzmlVar2 == null || !zzW(zzmlVar2)) {
            return;
        }
        zzmlVar2.zzX(j, j2);
    }

    public final boolean zzt(zzln zzlnVar) {
        zzml zzX = zzX(zzlnVar);
        return zzX == null || zzX.zzcW() || zzX.zzY() || zzX.zzZ();
    }

    public final void zzu(zzln zzlnVar) throws IOException {
        zzml zzX = zzX(zzlnVar);
        zzX.getClass();
        zzX.zzn();
    }

    public final void zzv() throws zziw {
        zzml zzmlVar = this.zza;
        if (zzmlVar.zze() == 1 && this.zzd != 4) {
            zzmlVar.zzcT();
            return;
        }
        zzml zzmlVar2 = this.zzc;
        if (zzmlVar2 == null || zzmlVar2.zze() != 1 || this.zzd == 3) {
            return;
        }
        zzmlVar2.zzcT();
    }

    public final void zzw() {
        zzml zzmlVar = this.zza;
        if (zzW(zzmlVar)) {
            zzY(zzmlVar);
        }
        zzml zzmlVar2 = this.zzc;
        if (zzmlVar2 == null || !zzW(zzmlVar2)) {
            return;
        }
        zzY(zzmlVar2);
    }

    public final void zzx(zzmo zzmoVar, zzaac zzaacVar, zzyc zzycVar, long j, boolean z, boolean z2, long j2, long j3, zzwk zzwkVar, zziu zziuVar) throws zziw {
        zzv[] zzV = zzV(zzaacVar);
        int i = this.zzd;
        if (i == 0 || i == 2 || i == 4) {
            this.zze = true;
            zzml zzmlVar = this.zza;
            zzmlVar.zzf(zzmoVar, zzV, zzycVar, j, z, z2, j2, j3, zzwkVar);
            zziuVar.zzd(zzmlVar);
            return;
        }
        this.zzf = true;
        zzml zzmlVar2 = this.zzc;
        zzmlVar2.getClass();
        zzmlVar2.zzf(zzmoVar, zzV, zzycVar, j, z, z2, j2, j3, zzwkVar);
        zziuVar.zzd(zzmlVar2);
    }

    public final void zzy(int i, Object obj, zzln zzlnVar) throws zziw {
        zzml zzX = zzX(zzlnVar);
        zzX.getClass();
        zzX.zzx(11, obj);
    }

    public final void zzz(zzms zzmsVar) throws zziw {
        this.zza.zzx(18, zzmsVar);
        zzml zzmlVar = this.zzc;
        if (zzmlVar != null) {
            zzmlVar.zzx(18, zzmsVar);
        }
    }
}
