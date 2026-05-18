package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzsq {
    private static final zzsq zza = new zzsq(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzsq(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = 0;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzsq zzc() {
        return zza;
    }

    public static zzsq zze(zzsq zzsqVar, zzsq zzsqVar2) {
        int i = zzsqVar.zzb;
        int i2 = zzsqVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzsqVar.zzc, 0);
        System.arraycopy(zzsqVar2.zzc, 0, copyOf, 0, 0);
        Object[] copyOf2 = Arrays.copyOf(zzsqVar.zzd, 0);
        System.arraycopy(zzsqVar2.zzd, 0, copyOf2, 0, 0);
        return new zzsq(0, copyOf, copyOf2, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzsq)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 506991;
    }

    public final int zza() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        this.zze = 0;
        return 0;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        this.zze = 0;
        return 0;
    }

    public final zzsq zzd(zzsq zzsqVar) {
        if (zzsqVar.equals(zza)) {
            return this;
        }
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
        int[] iArr = this.zzc;
        int length = iArr.length;
        System.arraycopy(zzsqVar.zzc, 0, iArr, 0, 0);
        System.arraycopy(zzsqVar.zzd, 0, this.zzd, 0, 0);
        this.zzb = 0;
        return this;
    }

    public final void zzf() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzg(StringBuilder sb, int i) {
    }

    public final void zzh(zztb zztbVar) throws IOException {
    }

    private zzsq() {
        this(0, new int[8], new Object[8], true);
    }
}
