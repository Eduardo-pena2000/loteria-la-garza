package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzzq extends zzzs implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;

    public zzzq(int i, zzbg zzbgVar, int i2, zzzl zzzlVar, int i3, String str, String str2) {
        int i4;
        super(i, zzbgVar, i2);
        int i5 = 0;
        this.zzf = zzmn.zzaa(i3, false);
        int i6 = this.zzd.zze;
        int i7 = zzzlVar.zzC;
        this.zzg = 1 == (i6 & 1);
        this.zzh = (i6 & 2) != 0;
        zzguf zzj = str2 != null ? zzguf.zzj(str2) : zzzlVar.zzy.isEmpty() ? zzguf.zzj("") : zzzlVar.zzy;
        int i8 = 0;
        while (true) {
            if (i8 >= zzj.size()) {
                i4 = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                i4 = zzaaa.zzj(this.zzd, (String) zzj.get(i8), false);
                if (i4 > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.zzi = i8;
        this.zzj = i4;
        int zzm = zzaaa.zzm(this.zzd.zzf, str2 != null ? 1088 : 0);
        this.zzk = zzm;
        zzv zzvVar = this.zzd;
        this.zzn = (1088 & zzvVar.zzf) != 0;
        int zzn = zzaaa.zzn(zzvVar, zzzlVar.zzz);
        this.zzl = zzn;
        int zzj2 = zzaaa.zzj(this.zzd, str, zzaaa.zzi(str) == null);
        this.zzm = zzj2;
        boolean z = i4 > 0 || (zzzlVar.zzy.isEmpty() && zzm > 0) || ((zzzlVar.zzy.isEmpty() && zzn != Integer.MAX_VALUE) || this.zzg || (this.zzh && zzj2 > 0));
        if (zzmn.zzaa(i3, zzzlVar.zzV) && z) {
            i5 = 1;
        }
        this.zze = i5;
    }

    public final int zza() {
        return this.zze;
    }

    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzzq zzzqVar) {
        zzgts zza = zzgts.zzg().zzd(this.zzf, zzzqVar.zzf).zza(Integer.valueOf(this.zzi), Integer.valueOf(zzzqVar.zzi), zzgvz.zzb().zza());
        int i = this.zzj;
        zzgts zzb = zza.zzb(i, zzzqVar.zzj);
        int i2 = this.zzk;
        zzgts zzb2 = zzb.zzb(i2, zzzqVar.zzk).zza(Integer.valueOf(this.zzl), Integer.valueOf(zzzqVar.zzl), zzgvz.zzb().zza()).zzd(this.zzg, zzzqVar.zzg).zza(Boolean.valueOf(this.zzh), Boolean.valueOf(zzzqVar.zzh), i == 0 ? zzgvz.zzb() : zzgvz.zzb().zza()).zzb(this.zzm, zzzqVar.zzm);
        if (i2 == 0) {
            zzb2 = zzb2.zzc(this.zzn, zzzqVar.zzn);
        }
        return zzb2.zze();
    }

    public final /* bridge */ /* synthetic */ boolean zzc(zzzs zzzsVar) {
        return false;
    }
}
