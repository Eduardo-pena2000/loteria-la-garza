package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzyw implements zzaac {
    protected final zzbg zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzv[] zzd;
    private int zze;

    public zzyw(zzbg zzbgVar, int[] iArr, int i) {
        int length = iArr.length;
        zzgrc.zzi(length > 0);
        zzbgVar.getClass();
        this.zza = zzbgVar;
        this.zzb = length;
        this.zzd = new zzv[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.zzd[i2] = zzbgVar.zza(iArr[i2]);
        }
        Arrays.sort(this.zzd, zzyv.zza);
        this.zzc = new int[this.zzb];
        for (int i3 = 0; i3 < this.zzb; i3++) {
            this.zzc[i3] = zzbgVar.zzb(this.zzd[i3]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzyw zzywVar = (zzyw) obj;
            if (this.zza.equals(zzywVar.zza) && Arrays.equals(this.zzc, zzywVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.zza) * 31) + Arrays.hashCode(this.zzc);
        this.zze = identityHashCode;
        return identityHashCode;
    }

    public final zzbg zza() {
        return this.zza;
    }

    public final zzv zzb(int i) {
        return this.zzd[i];
    }

    public final zzv zzc() {
        return this.zzd[0];
    }

    public final int zze() {
        return this.zzc.length;
    }

    public final int zzf(int i) {
        return this.zzc[i];
    }

    public final int zzg(int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            if (this.zzc[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public final int zzh() {
        return this.zzc[0];
    }
}
