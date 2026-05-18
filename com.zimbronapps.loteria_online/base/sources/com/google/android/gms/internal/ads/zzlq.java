package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzlq {
    private final zzmx zzc;
    private final zzdx zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzjg zzh;
    private zzln zzi;
    private zzln zzj;
    private zzln zzk;
    private zzln zzl;
    private zzln zzm;
    private int zzn;
    private Object zzo;
    private long zzp;
    private final zzky zzr;
    private final zzbd zza = new zzbd();
    private final zzbe zzb = new zzbe();
    private List zzq = new ArrayList();

    public zzlq(zzmx zzmxVar, zzdx zzdxVar, zzky zzkyVar, zzjg zzjgVar) {
        this.zzc = zzmxVar;
        this.zzd = zzdxVar;
        this.zzr = zzkyVar;
        this.zzh = zzjgVar;
    }

    private static zzwk zzA(zzbf zzbfVar, Object obj, long j, long j2, zzbe zzbeVar, zzbd zzbdVar) {
        zzbfVar.zzo(obj, zzbdVar);
        zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L);
        zzbfVar.zze(obj);
        zzbdVar.zzb();
        zzbfVar.zzo(obj, zzbdVar);
        int zze = zzbdVar.zze(j);
        return zze == -1 ? new zzwk(obj, j2, zzbdVar.zzf(j)) : new zzwk(obj, zze, zzbdVar.zzd(zze), j2);
    }

    private final void zzB() {
        int i = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        for (zzln zzlnVar = this.zzi; zzlnVar != null; zzlnVar = zzlnVar.zzp()) {
            zzgucVar.zzf(zzlnVar.zzg.zza);
        }
        zzln zzlnVar2 = this.zzj;
        this.zzd.zzn(new zzlp(this, zzgucVar, zzlnVar2 == null ? null : zzlnVar2.zzg.zza));
    }

    private final long zzC(Object obj) {
        for (int i = 0; i < this.zzq.size(); i++) {
            zzln zzlnVar = (zzln) this.zzq.get(i);
            if (zzlnVar.zzb.equals(obj)) {
                return zzlnVar.zzg.zza.zzd;
            }
        }
        return -1L;
    }

    private final int zzD(zzbf zzbfVar) {
        zzln zzlnVar = this.zzi;
        if (zzlnVar == null) {
            return 0;
        }
        int zze = zzbfVar.zze(zzlnVar.zzb);
        while (true) {
            zze = zzbfVar.zzl(zze, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzlnVar.getClass();
                if (zzlnVar.zzp() == null || zzlnVar.zzg.zzh) {
                    break;
                }
                zzlnVar = zzlnVar.zzp();
            }
            zzln zzp = zzlnVar.zzp();
            if (zze == -1 || zzp == null || zzbfVar.zze(zzp.zzb) != zze) {
                break;
            }
            zzlnVar = zzp;
        }
        int zzs = zzs(zzlnVar);
        zzlnVar.zzg = zzx(zzbfVar, zzlnVar.zzg);
        return zzs;
    }

    private final zzlo zzE(zzbf zzbfVar, zzln zzlnVar, long j) {
        Object obj;
        int i;
        long j2;
        long j3;
        long j4;
        zzlo zzloVar = zzlnVar.zzg;
        long zza = zzlnVar.zza();
        long j5 = zzloVar.zze;
        long j6 = (zza + j5) - j;
        if (zzloVar.zzh) {
            zzwk zzwkVar = zzloVar.zza;
            Object obj2 = zzwkVar.zza;
            int zze = zzbfVar.zze(obj2);
            int i2 = this.zzf;
            boolean z = this.zzg;
            zzbe zzbeVar = this.zzb;
            zzbd zzbdVar = this.zza;
            int zzl = zzbfVar.zzl(zze, zzbdVar, zzbeVar, i2, z);
            if (zzl != -1) {
                int i3 = zzbfVar.zzd(zzl, zzbdVar, true).zzc;
                Object obj3 = zzbdVar.zzb;
                obj3.getClass();
                long j7 = zzwkVar.zzd;
                if (zzbfVar.zzb(i3, zzbeVar, 0L).zzn == zzl) {
                    Pair zzn = zzbfVar.zzn(zzbeVar, zzbdVar, i3, -9223372036854775807L, Math.max(0L, j6));
                    if (zzn != null) {
                        obj3 = zzn.first;
                        long longValue = ((Long) zzn.second).longValue();
                        zzln zzp = zzlnVar.zzp();
                        if (zzp == null || !zzp.zzb.equals(obj3)) {
                            j7 = zzC(obj3);
                            if (j7 == -1) {
                                j7 = this.zze;
                                this.zze = 1 + j7;
                            }
                        } else {
                            j7 = zzp.zzg.zza.zzd;
                        }
                        j4 = longValue;
                        j3 = -9223372036854775807L;
                    }
                } else {
                    j3 = 0;
                    j4 = 0;
                }
                zzwk zzA = zzA(zzbfVar, obj3, j4, j7, zzbeVar, zzbdVar);
                if (j3 != -9223372036854775807L && zzloVar.zzc != -9223372036854775807L) {
                    zzbfVar.zzo(obj2, zzbdVar).zzb();
                    int i4 = zzbdVar.zzg.zzd;
                }
                return zzF(zzbfVar, zzA, j3, j4);
            }
        } else {
            zzwk zzwkVar2 = zzloVar.zza;
            Object obj4 = zzwkVar2.zza;
            zzbd zzbdVar2 = this.zza;
            zzbfVar.zzo(obj4, zzbdVar2);
            if (!zzwkVar2.zzb()) {
                int i5 = zzwkVar2.zze;
                if (i5 != -1) {
                    zzbdVar2.zzi(i5);
                }
                int zzd = zzbdVar2.zzd(i5);
                zzbdVar2.zzk(i5);
                if (zzd != zzbdVar2.zzg(i5)) {
                    return zzG(zzbfVar, obj4, i5, zzd, j5, zzwkVar2.zzd, false);
                }
                zzK(zzbfVar, obj4, i5);
                return zzH(zzbfVar, obj4, 0L, j5, zzwkVar2.zzd, false);
            }
            int i6 = zzwkVar2.zzb;
            if (zzbdVar2.zzg(i6) != -1) {
                int zza2 = zzbdVar2.zzg.zza(i6).zza(zzwkVar2.zzc);
                if (zza2 < 0) {
                    return zzG(zzbfVar, obj4, i6, zza2, zzloVar.zzc, zzwkVar2.zzd, false);
                }
                long j8 = zzloVar.zzc;
                if (j8 == -9223372036854775807L) {
                    obj = obj4;
                    i = i6;
                    Pair zzn2 = zzbfVar.zzn(this.zzb, zzbdVar2, zzbdVar2.zzc, -9223372036854775807L, Math.max(0L, j6));
                    if (zzn2 != null) {
                        j8 = ((Long) zzn2.second).longValue();
                        j2 = -9223372036854775807L;
                    }
                } else {
                    obj = obj4;
                    i = i6;
                    j2 = j8;
                }
                zzK(zzbfVar, obj, i);
                return zzH(zzbfVar, obj, Math.max(0L, j8), j2, zzwkVar2.zzd, false);
            }
        }
        return null;
    }

    private final zzlo zzF(zzbf zzbfVar, zzwk zzwkVar, long j, long j2) {
        Object obj = zzwkVar.zza;
        zzbfVar.zzo(obj, this.zza);
        return zzwkVar.zzb() ? zzG(zzbfVar, obj, zzwkVar.zzb, zzwkVar.zzc, j, zzwkVar.zzd, false) : zzH(zzbfVar, obj, j2, j, zzwkVar.zzd, false);
    }

    private final zzlo zzG(zzbf zzbfVar, Object obj, int i, int i2, long j, long j2, boolean z) {
        zzwk zzwkVar = new zzwk(obj, i, i2, j2);
        Object obj2 = zzwkVar.zza;
        int i3 = zzwkVar.zzb;
        int i4 = zzwkVar.zzc;
        zzbd zzbdVar = this.zza;
        long zzh = zzbfVar.zzo(obj2, zzbdVar).zzh(i3, i4);
        if (i2 == zzbdVar.zzd(i)) {
            zzbdVar.zzj();
        }
        zzbdVar.zzk(i3);
        return new zzlo(zzwkVar, (zzh == -9223372036854775807L || zzh > 0) ? 0L : Math.max(0L, (-1) + zzh), j, -9223372036854775807L, zzh, false, false, false, false, false);
    }

    private final zzlo zzH(zzbf zzbfVar, Object obj, long j, long j2, long j3, boolean z) {
        long j4;
        long j5;
        long j6;
        long j7 = j;
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        int zzf = zzbdVar.zzf(j7);
        if (zzf == -1) {
            zzbdVar.zzb();
        } else {
            zzbdVar.zzk(zzf);
        }
        zzwk zzwkVar = new zzwk(obj, j3, zzf);
        boolean zzL = zzL(zzwkVar);
        boolean zzI = zzI(zzbfVar, zzwkVar);
        boolean zzJ = zzJ(zzbfVar, zzwkVar, zzL);
        if (zzf != -1) {
            zzbdVar.zzk(zzf);
        }
        if (zzf != -1) {
            zzbdVar.zzi(zzf);
        }
        if (zzf != -1) {
            zzbdVar.zzc(zzf);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j6 = j4;
            j5 = j6;
        } else {
            j5 = zzbdVar.zzd;
            j6 = -9223372036854775807L;
        }
        if (j5 != -9223372036854775807L && j7 >= j5) {
            j7 = Math.max(0L, j5 - 1);
        }
        return new zzlo(zzwkVar, j7, j2, j6, j5, false, false, zzL, zzI, zzJ);
    }

    private final boolean zzI(zzbf zzbfVar, zzwk zzwkVar) {
        if (!zzL(zzwkVar)) {
            return false;
        }
        Object obj = zzwkVar.zza;
        return zzbfVar.zzb(zzbfVar.zzo(obj, this.zza).zzc, this.zzb, 0L).zzo == zzbfVar.zze(obj);
    }

    private final boolean zzJ(zzbf zzbfVar, zzwk zzwkVar, boolean z) {
        int zze = zzbfVar.zze(zzwkVar.zza);
        zzbd zzbdVar = this.zza;
        int i = zzbfVar.zzd(zze, zzbdVar, false).zzc;
        zzbe zzbeVar = this.zzb;
        return !zzbfVar.zzb(i, zzbeVar, 0L).zzi && zzbfVar.zzl(zze, zzbdVar, zzbeVar, this.zzf, this.zzg) == -1 && z;
    }

    private final long zzK(zzbf zzbfVar, Object obj, int i) {
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        zzbdVar.zzc(i);
        long j = zzbdVar.zzg.zza(i).zzi;
        return 0L;
    }

    private static final boolean zzL(zzwk zzwkVar) {
        return !zzwkVar.zzb() && zzwkVar.zze == -1;
    }

    public final int zza(zzbf zzbfVar, int i) {
        this.zzf = i;
        return zzD(zzbfVar);
    }

    public final int zzb(zzbf zzbfVar, boolean z) {
        this.zzg = z;
        return zzD(zzbfVar);
    }

    public final void zzc(zzbf zzbfVar, zzjg zzjgVar) {
        this.zzh = zzjgVar;
        long j = zzjgVar.zzb;
        zzj();
    }

    public final boolean zzd(zzwi zzwiVar) {
        zzln zzlnVar = this.zzl;
        return zzlnVar != null && zzlnVar.zza == zzwiVar;
    }

    public final boolean zze(zzwi zzwiVar) {
        zzln zzlnVar = this.zzm;
        return zzlnVar != null && zzlnVar.zza == zzwiVar;
    }

    public final void zzf(long j) {
        zzln zzlnVar = this.zzl;
        if (zzlnVar != null) {
            zzlnVar.zzi(j);
        }
    }

    public final boolean zzg() {
        zzln zzlnVar = this.zzl;
        if (zzlnVar == null) {
            return true;
        }
        if (zzlnVar.zzg.zzj || !zzlnVar.zzd() || this.zzl.zzg.zze == -9223372036854775807L) {
            return false;
        }
        return this.zzn < 100;
    }

    public final zzlo zzh(long j, zzmd zzmdVar) {
        zzln zzlnVar = this.zzl;
        return zzlnVar == null ? zzF(zzmdVar.zza, zzmdVar.zzb, zzmdVar.zzc, zzmdVar.zzs) : zzE(zzmdVar.zza, zzlnVar, j);
    }

    public final zzln zzi(zzlo zzloVar) {
        zzln zzlnVar;
        zzln zzlnVar2 = this.zzl;
        long zza = zzlnVar2 == null ? 1000000000000L : (zzlnVar2.zza() + zzlnVar2.zzg.zze) - zzloVar.zzb;
        int i = 0;
        while (true) {
            if (i >= this.zzq.size()) {
                zzlnVar = null;
                break;
            }
            zzlo zzloVar2 = ((zzln) this.zzq.get(i)).zzg;
            long j = zzloVar2.zze;
            long j2 = zzloVar.zze;
            if ((j == -9223372036854775807L || j == j2) && zzloVar2.zzb == zzloVar.zzb && zzloVar2.zza.equals(zzloVar.zza)) {
                zzlnVar = (zzln) this.zzq.remove(i);
                break;
            }
            i++;
        }
        if (zzlnVar == null) {
            zzlnVar = this.zzr.zza(zzloVar, zza);
        } else {
            zzlnVar.zzg = zzloVar;
            zzlnVar.zzb(zza);
        }
        zzln zzlnVar3 = this.zzl;
        if (zzlnVar3 != null) {
            zzlnVar3.zzo(zzlnVar);
        } else {
            this.zzi = zzlnVar;
            this.zzj = zzlnVar;
            this.zzk = zzlnVar;
        }
        this.zzo = null;
        this.zzl = zzlnVar;
        this.zzn++;
        zzB();
        return zzlnVar;
    }

    public final void zzj() {
        if (this.zzq.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.zzq.size(); i++) {
            ((zzln) this.zzq.get(i)).zzn();
        }
        this.zzq = arrayList;
        this.zzm = null;
        zzt();
    }

    public final zzln zzk() {
        return this.zzl;
    }

    public final zzln zzl() {
        return this.zzm;
    }

    public final zzln zzm() {
        return this.zzi;
    }

    public final zzln zzn() {
        return this.zzj;
    }

    public final zzln zzo() {
        return this.zzk;
    }

    public final zzln zzp() {
        zzln zzlnVar = this.zzk;
        zzln zzlnVar2 = this.zzj;
        if (zzlnVar == zzlnVar2) {
            zzlnVar2.getClass();
            this.zzk = zzlnVar2.zzp();
        }
        zzlnVar2.getClass();
        this.zzj = zzlnVar2.zzp();
        zzB();
        zzln zzlnVar3 = this.zzj;
        zzlnVar3.getClass();
        return zzlnVar3;
    }

    public final zzln zzq() {
        zzln zzlnVar = this.zzk;
        zzlnVar.getClass();
        this.zzk = zzlnVar.zzp();
        zzB();
        zzln zzlnVar2 = this.zzk;
        zzlnVar2.getClass();
        return zzlnVar2;
    }

    public final zzln zzr() {
        zzln zzlnVar = this.zzi;
        if (zzlnVar == null) {
            return null;
        }
        if (zzlnVar == this.zzj) {
            this.zzj = zzlnVar.zzp();
        }
        if (zzlnVar == this.zzk) {
            this.zzk = zzlnVar.zzp();
        }
        zzlnVar.zzn();
        int i = this.zzn - 1;
        this.zzn = i;
        if (i == 0) {
            this.zzl = null;
            zzln zzlnVar2 = this.zzi;
            this.zzo = zzlnVar2.zzb;
            this.zzp = zzlnVar2.zzg.zza.zzd;
        }
        this.zzi = this.zzi.zzp();
        zzB();
        return this.zzi;
    }

    public final int zzs(zzln zzlnVar) {
        zzlnVar.getClass();
        int i = 0;
        if (zzlnVar.equals(this.zzl)) {
            return 0;
        }
        this.zzl = zzlnVar;
        while (zzlnVar.zzp() != null) {
            zzlnVar = zzlnVar.zzp();
            zzlnVar.getClass();
            if (zzlnVar == this.zzj) {
                zzln zzlnVar2 = this.zzi;
                this.zzj = zzlnVar2;
                this.zzk = zzlnVar2;
                i = 3;
            }
            if (zzlnVar == this.zzk) {
                this.zzk = this.zzj;
                i |= 2;
            }
            zzlnVar.zzn();
            this.zzn--;
        }
        zzln zzlnVar3 = this.zzl;
        zzlnVar3.getClass();
        zzlnVar3.zzo(null);
        zzB();
        return i;
    }

    public final void zzt() {
        zzln zzlnVar = this.zzm;
        if (zzlnVar == null || zzlnVar.zze()) {
            this.zzm = null;
            for (int i = 0; i < this.zzq.size(); i++) {
                zzln zzlnVar2 = (zzln) this.zzq.get(i);
                if (!zzlnVar2.zze()) {
                    this.zzm = zzlnVar2;
                    return;
                }
            }
        }
    }

    public final zzln zzu(zzwi zzwiVar) {
        for (int i = 0; i < this.zzq.size(); i++) {
            zzln zzlnVar = (zzln) this.zzq.get(i);
            if (zzlnVar.zza == zzwiVar) {
                return zzlnVar;
            }
        }
        return null;
    }

    public final void zzv() {
        if (this.zzn == 0) {
            return;
        }
        zzln zzlnVar = this.zzi;
        zzlnVar.getClass();
        this.zzo = zzlnVar.zzb;
        this.zzp = zzlnVar.zzg.zza.zzd;
        while (zzlnVar != null) {
            zzlnVar.zzn();
            zzlnVar = zzlnVar.zzp();
        }
        this.zzi = null;
        this.zzl = null;
        this.zzj = null;
        this.zzk = null;
        this.zzn = 0;
        zzB();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a2, code lost:
    
        return zzs(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzw(com.google.android.gms.internal.ads.zzbf r16, long r17, long r19, long r21) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            com.google.android.gms.internal.ads.zzln r2 = r0.zzi
            r3 = 0
        L6:
            r4 = 0
            if (r2 == 0) goto La3
            com.google.android.gms.internal.ads.zzlo r5 = r2.zzg
            if (r3 != 0) goto L14
            com.google.android.gms.internal.ads.zzlo r3 = r15.zzx(r1, r5)
            r6 = r17
            goto L2f
        L14:
            r6 = r17
            com.google.android.gms.internal.ads.zzlo r8 = r15.zzE(r1, r3, r6)
            if (r8 == 0) goto L9e
            long r9 = r5.zzb
            long r11 = r8.zzb
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L9e
            com.google.android.gms.internal.ads.zzwk r9 = r5.zza
            com.google.android.gms.internal.ads.zzwk r10 = r8.zza
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L9e
            r3 = r8
        L2f:
            long r8 = r5.zzc
            com.google.android.gms.internal.ads.zzlo r8 = r3.zzb(r8)
            r2.zzg = r8
            long r8 = r5.zze
            long r10 = r3.zze
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 == 0) goto L95
            r2.zzs()
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r1 != 0) goto L51
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L56
        L51:
            long r12 = r2.zza()
            long r10 = r10 + r12
        L56:
            com.google.android.gms.internal.ads.zzln r1 = r0.zzj
            r12 = -9223372036854775808
            r3 = 1
            if (r2 != r1) goto L6b
            com.google.android.gms.internal.ads.zzlo r1 = r2.zzg
            boolean r1 = r1.zzg
            int r1 = (r19 > r12 ? 1 : (r19 == r12 ? 0 : -1))
            if (r1 == 0) goto L69
            int r1 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r1 < 0) goto L6b
        L69:
            r1 = r3
            goto L6c
        L6b:
            r1 = r4
        L6c:
            com.google.android.gms.internal.ads.zzln r7 = r0.zzk
            if (r2 != r7) goto L7a
            int r7 = (r21 > r12 ? 1 : (r21 == r12 ? 0 : -1))
            if (r7 == 0) goto L78
            int r7 = (r21 > r10 ? 1 : (r21 == r10 ? 0 : -1))
            if (r7 < 0) goto L7a
        L78:
            r7 = r3
            goto L7b
        L7a:
            r7 = r4
        L7b:
            int r2 = r15.zzs(r2)
            if (r2 == 0) goto L82
            return r2
        L82:
            int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r2 != 0) goto L87
            r8 = r5
        L87:
            if (r1 == 0) goto L8f
            int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r1 != 0) goto L8e
            goto L8f
        L8e:
            r4 = r3
        L8f:
            if (r7 == 0) goto L94
            r1 = r4 | 2
            return r1
        L94:
            return r4
        L95:
            com.google.android.gms.internal.ads.zzln r3 = r2.zzp()
            r14 = r3
            r3 = r2
            r2 = r14
            goto L6
        L9e:
            int r1 = r15.zzs(r3)
            return r1
        La3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlq.zzw(com.google.android.gms.internal.ads.zzbf, long, long, long):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzlo zzx(com.google.android.gms.internal.ads.zzbf r22, com.google.android.gms.internal.ads.zzlo r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            com.google.android.gms.internal.ads.zzwk r3 = r2.zza
            boolean r13 = zzL(r3)
            boolean r14 = r0.zzI(r1, r3)
            boolean r15 = r0.zzJ(r1, r3, r13)
            java.lang.Object r4 = r3.zza
            com.google.android.gms.internal.ads.zzbd r5 = r0.zza
            r1.zzo(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r6 = 0
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L2d
            int r1 = r3.zze
            if (r1 != r4) goto L2f
        L2d:
            r10 = r8
            goto L33
        L2f:
            r5.zzc(r1)
            r10 = r6
        L33:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L47
            int r1 = r3.zzb
            int r6 = r3.zzc
            long r6 = r5.zzh(r1, r6)
        L41:
            r19 = r6
            r7 = r10
            r9 = r19
            goto L51
        L47:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L4e
            r9 = r6
            r7 = r9
            goto L51
        L4e:
            long r6 = r5.zzd
            goto L41
        L51:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L5d
            int r1 = r3.zzb
            r5.zzk(r1)
            goto L64
        L5d:
            int r1 = r3.zze
            if (r1 == r4) goto L64
            r5.zzk(r1)
        L64:
            com.google.android.gms.internal.ads.zzlo r16 = new com.google.android.gms.internal.ads.zzlo
            long r4 = r2.zzb
            long r11 = r2.zzc
            r17 = 0
            r18 = 0
            r1 = r16
            r2 = r3
            r3 = r4
            r5 = r11
            r11 = r17
            r12 = r18
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14, r15)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlq.zzx(com.google.android.gms.internal.ads.zzbf, com.google.android.gms.internal.ads.zzlo):com.google.android.gms.internal.ads.zzlo");
    }

    public final zzwk zzy(zzbf zzbfVar, Object obj, long j) {
        long zzC;
        int zze;
        zzbd zzbdVar = this.zza;
        int i = zzbfVar.zzo(obj, zzbdVar).zzc;
        Object obj2 = this.zzo;
        if (obj2 == null || (zze = zzbfVar.zze(obj2)) == -1 || zzbfVar.zzd(zze, zzbdVar, false).zzc != i) {
            zzln zzlnVar = this.zzi;
            while (true) {
                if (zzlnVar == null) {
                    zzln zzlnVar2 = this.zzi;
                    while (true) {
                        if (zzlnVar2 != null) {
                            int zze2 = zzbfVar.zze(zzlnVar2.zzb);
                            if (zze2 != -1 && zzbfVar.zzd(zze2, zzbdVar, false).zzc == i) {
                                zzC = zzlnVar2.zzg.zza.zzd;
                                break;
                            }
                            zzlnVar2 = zzlnVar2.zzp();
                        } else {
                            zzC = zzC(obj);
                            if (zzC == -1) {
                                zzC = this.zze;
                                this.zze = 1 + zzC;
                                if (this.zzi == null) {
                                    this.zzo = obj;
                                    this.zzp = zzC;
                                }
                            }
                        }
                    }
                } else {
                    if (zzlnVar.zzb.equals(obj)) {
                        zzC = zzlnVar.zzg.zza.zzd;
                        break;
                    }
                    zzlnVar = zzlnVar.zzp();
                }
            }
        } else {
            zzC = this.zzp;
        }
        long j2 = zzC;
        zzbfVar.zzo(obj, zzbdVar);
        int i2 = zzbdVar.zzc;
        zzbe zzbeVar = this.zzb;
        zzbfVar.zzb(i2, zzbeVar, 0L);
        Object obj3 = obj;
        for (int zze3 = zzbfVar.zze(obj); zze3 >= zzbeVar.zzn; zze3--) {
            zzbfVar.zzd(zze3, zzbdVar, true);
            zzbdVar.zzb();
            if (zzbdVar.zze(zzbdVar.zzd) != -1) {
                Object obj4 = zzbdVar.zzb;
                obj4.getClass();
                obj3 = obj4;
            }
        }
        return zzA(zzbfVar, obj3, j, j2, zzbeVar, zzbdVar);
    }

    public final /* synthetic */ void zzz(zzguc zzgucVar, zzwk zzwkVar) {
        this.zzc.zzz(zzgucVar.zzi(), zzwkVar);
    }
}
