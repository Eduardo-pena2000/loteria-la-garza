package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaou implements zzaon {
    private final zzapq zza;
    private long zzf;
    private String zzh;
    private zzagh zzi;
    private zzaot zzj;
    private boolean zzk;
    private boolean zzm;
    private final String zzb = "video/mp2t";
    private final boolean[] zzg = new boolean[3];
    private final zzape zzc = new zzape(7, 128);
    private final zzape zzd = new zzape(8, 128);
    private final zzape zze = new zzape(6, 128);
    private long zzl = -9223372036854775807L;
    private final zzer zzn = new zzer();

    public zzaou(zzapq zzapqVar, boolean z, boolean z2, String str) {
        this.zza = zzapqVar;
    }

    private final void zzf(long j, int i, long j2) {
        if (!this.zzk) {
            this.zzc.zzc(i);
            this.zzd.zzc(i);
        }
        this.zze.zzc(i);
        this.zzj.zzd(j, i, j2, this.zzm);
    }

    private final void zzg(byte[] bArr, int i, int i2) {
        if (!this.zzk) {
            this.zzc.zzd(bArr, i, i2);
            this.zzd.zzd(bArr, i, i2);
        }
        this.zze.zzd(bArr, i, i2);
    }

    private final void zzh(long j, int i, int i2, long j2) {
        if (!this.zzk) {
            zzape zzapeVar = this.zzc;
            zzapeVar.zze(i2);
            zzape zzapeVar2 = this.zzd;
            zzapeVar2.zze(i2);
            if (this.zzk) {
                if (zzapeVar.zzb()) {
                    zzgl zze = zzgm.zze(zzapeVar.zza, 4, zzapeVar.zzb);
                    this.zza.zzb(zze.zzm);
                    this.zzj.zza(zze);
                    zzapeVar.zza();
                } else if (zzapeVar2.zzb()) {
                    this.zzj.zzb(zzgm.zzh(zzapeVar2.zza, 4, zzapeVar2.zzb));
                    zzapeVar2.zza();
                }
            } else if (zzapeVar.zzb() && zzapeVar2.zzb()) {
                List arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(zzapeVar.zza, zzapeVar.zzb));
                arrayList.add(Arrays.copyOf(zzapeVar2.zza, zzapeVar2.zzb));
                zzgl zze2 = zzgm.zze(zzapeVar.zza, 4, zzapeVar.zzb);
                zzgk zzh = zzgm.zzh(zzapeVar2.zza, 4, zzapeVar2.zzb);
                String zza = zzdo.zza(zze2.zza, zze2.zzb, zze2.zzc);
                zzagh zzaghVar = this.zzi;
                zzt zztVar = new zzt();
                zztVar.zza(this.zzh);
                zztVar.zzl(this.zzb);
                zztVar.zzm("video/avc");
                zztVar.zzj(zza);
                zztVar.zzt(zze2.zze);
                zztVar.zzu(zze2.zzf);
                zzh zzhVar = new zzh();
                zzhVar.zza(zze2.zzj);
                zzhVar.zzb(zze2.zzk);
                zzhVar.zzc(zze2.zzl);
                zzhVar.zze(zze2.zzh + 8);
                zzhVar.zzf(zze2.zzi + 8);
                zztVar.zzC(zzhVar.zzg());
                zztVar.zzz(zze2.zzg);
                zztVar.zzp(arrayList);
                int i3 = zze2.zzm;
                zztVar.zzo(i3);
                zzaghVar.zzz(zztVar.zzM());
                this.zzk = true;
                this.zza.zzb(i3);
                this.zzj.zza(zze2);
                this.zzj.zzb(zzh);
                zzapeVar.zza();
                zzapeVar2.zza();
            }
        }
        zzape zzapeVar3 = this.zze;
        if (zzapeVar3.zze(i2)) {
            int zza2 = zzgm.zza(zzapeVar3.zza, zzapeVar3.zzb);
            zzer zzerVar = this.zzn;
            zzerVar.zzb(zzapeVar3.zza, zza2);
            zzerVar.zzh(4);
            this.zza.zzc(j2, zzerVar);
        }
        if (this.zzj.zze(j, i, this.zzk)) {
            this.zzm = false;
        }
    }

    public final void zza() {
        this.zzf = 0L;
        this.zzm = false;
        this.zzl = -9223372036854775807L;
        zzgm.zzj(this.zzg);
        this.zzc.zza();
        this.zzd.zza();
        this.zze.zza();
        this.zza.zze();
        zzaot zzaotVar = this.zzj;
        if (zzaotVar != null) {
            zzaotVar.zzc();
        }
    }

    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzh = zzaqbVar.zzc();
        zzagh zzu = zzaexVar.zzu(zzaqbVar.zzb(), 2);
        this.zzi = zzu;
        this.zzj = new zzaot(zzu, false, false);
        this.zza.zza(zzaexVar, zzaqbVar);
    }

    public final void zzc(long j, int i) {
        this.zzl = j;
        int i2 = i & 2;
        this.zzm = (i2 != 0) | this.zzm;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(com.google.android.gms.internal.ads.zzer r17) {
        /*
            r16 = this;
            r7 = r16
            r8 = 3
            com.google.android.gms.internal.ads.zzagh r0 = r7.zzi
            r0.getClass()
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfj.zza
            int r0 = r17.zzg()
            int r9 = r17.zze()
            byte[] r10 = r17.zzi()
            long r1 = r7.zzf
            int r3 = r17.zzd()
            long r3 = (long) r3
            long r1 = r1 + r3
            r7.zzf = r1
            com.google.android.gms.internal.ads.zzagh r1 = r7.zzi
            int r2 = r17.zzd()
            r3 = r17
            r1.zzc(r3, r2)
        L2b:
            boolean[] r1 = r7.zzg
            int r1 = com.google.android.gms.internal.ads.zzgm.zzi(r10, r0, r9, r1)
            if (r1 == r9) goto L6d
            int r2 = r1 + 3
            r2 = r10[r2]
            r11 = r2 & 31
            if (r1 <= 0) goto L45
            int r2 = r1 + (-1)
            r3 = r10[r2]
            if (r3 != 0) goto L45
            r1 = 4
            r13 = r1
            r12 = r2
            goto L47
        L45:
            r12 = r1
            r13 = r8
        L47:
            int r1 = r12 - r0
            if (r1 <= 0) goto L4e
            r7.zzg(r10, r0, r12)
        L4e:
            int r3 = r9 - r12
            long r4 = r7.zzf
            long r14 = (long) r3
            long r14 = r4 - r14
            if (r1 >= 0) goto L5a
            int r0 = -r1
        L58:
            r4 = r0
            goto L5c
        L5a:
            r0 = 0
            goto L58
        L5c:
            long r5 = r7.zzl
            r0 = r16
            r1 = r14
            r0.zzh(r1, r3, r4, r5)
            long r4 = r7.zzl
            r3 = r11
            r0.zzf(r1, r3, r4)
            int r0 = r12 + r13
            goto L2b
        L6d:
            r7.zzg(r10, r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaou.zzd(com.google.android.gms.internal.ads.zzer):void");
    }

    public final void zze(boolean z) {
        this.zzi.getClass();
        String str = zzfj.zza;
        if (z) {
            this.zza.zzd();
            zzh(this.zzf, 0, 0, this.zzl);
            zzf(this.zzf, 9, this.zzl);
            zzh(this.zzf, 0, 0, this.zzl);
        }
    }
}
