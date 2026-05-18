package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzyx extends zzzs implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzzl zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final int zzu;
    private final boolean zzv;
    private final boolean zzw;
    private final boolean zzx;

    /* JADX WARN: Removed duplicated region for block: B:102:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00b0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzyx(int r8, com.google.android.gms.internal.ads.zzbg r9, int r10, com.google.android.gms.internal.ads.zzzl r11, int r12, boolean r13, com.google.android.gms.internal.ads.zzgrd r14, int r15) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyx.<init>(int, com.google.android.gms.internal.ads.zzbg, int, com.google.android.gms.internal.ads.zzzl, int, boolean, com.google.android.gms.internal.ads.zzgrd, int):void");
    }

    public final int zza() {
        return this.zze;
    }

    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzyx zzyxVar) {
        boolean z = this.zzf;
        zzgvz zzo = (z && this.zzi) ? zzaaa.zzo() : zzaaa.zzo().zza();
        zzgts zza = zzgts.zzg().zzd(this.zzi, zzyxVar.zzi).zza(Integer.valueOf(this.zzk), Integer.valueOf(zzyxVar.zzk), zzgvz.zzb().zza()).zzb(this.zzj, zzyxVar.zzj).zzb(this.zzl, zzyxVar.zzl).zza(Integer.valueOf(this.zzm), Integer.valueOf(zzyxVar.zzm), zzgvz.zzb().zza()).zzd(this.zzq, zzyxVar.zzq).zzd(this.zzn, zzyxVar.zzn).zza(Integer.valueOf(this.zzo), Integer.valueOf(zzyxVar.zzo), zzgvz.zzb().zza()).zzb(this.zzp, zzyxVar.zzp).zzd(z, zzyxVar.zzf).zza(Integer.valueOf(this.zzu), Integer.valueOf(zzyxVar.zzu), zzgvz.zzb().zza());
        boolean z2 = this.zzh.zzF;
        zzgts zza2 = zza.zzd(this.zzv, zzyxVar.zzv).zzd(this.zzw, zzyxVar.zzw).zzd(this.zzx, zzyxVar.zzx).zza(Integer.valueOf(this.zzr), Integer.valueOf(zzyxVar.zzr), zzo).zza(Integer.valueOf(this.zzs), Integer.valueOf(zzyxVar.zzs), zzo);
        if (Objects.equals(this.zzg, zzyxVar.zzg)) {
            zza2 = zza2.zza(Integer.valueOf(this.zzt), Integer.valueOf(zzyxVar.zzt), zzo);
        }
        return zza2.zze();
    }

    public final /* bridge */ /* synthetic */ boolean zzc(zzzs zzzsVar) {
        String str;
        int i;
        zzyx zzyxVar = (zzyx) zzzsVar;
        boolean z = this.zzh.zzR;
        zzv zzvVar = this.zzd;
        int i2 = zzvVar.zzG;
        if (i2 == -1) {
            return false;
        }
        zzv zzvVar2 = zzyxVar.zzd;
        return i2 == zzvVar2.zzG && (str = zzvVar.zzo) != null && TextUtils.equals(str, zzvVar2.zzo) && (i = zzvVar.zzH) != -1 && i == zzvVar2.zzH && this.zzv == zzyxVar.zzv && this.zzw == zzyxVar.zzw;
    }
}
